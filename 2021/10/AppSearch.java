package ME.APM.VSQ;
import java.awt.Container;

import java.awt.Dimension;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import ESU.list.List_ESU;
import ME.APM.VSQ.OPE.search.ChanJPanel;
import ME.APM.VSQ.OPE.search.ChouchuJPanel;
import ME.APM.VSQ.OPE.search.ChuangJPanel;
import ME.APM.VSQ.OPE.search.DuJPanel;
import ME.APM.VSQ.OPE.search.HanJPanel;
import ME.APM.VSQ.OPE.search.KuangJPanel;
import ME.APM.VSQ.OPE.search.PaixieJPanel;
import ME.APM.VSQ.OPE.search.QitaJPanel;
import ME.APM.VSQ.OPE.search.ReJPanel;
import ME.APM.VSQ.OPE.search.TanJPanel;
import ME.APM.VSQ.OPE.search.TongJPanel;
import ME.APM.VSQ.OPE.search.XueJPanel;
import ME.APM.VSQ.OPE.search.YangJPanel;
import SVQ.stable.StableFile;
public class AppSearch extends ScrollPane implements MouseListener, KeyListener, ActionListener{	
	private static final long serialVersionUID= 1L;
	//把德塔精度搜索的函数进行函数片段化去重，
	//罗瑶光 202110121
	//当年离开英特尔天天被人盯着 大家很想知道我在英特尔见了什么本事，惊讶了我
	//我只想说，米尔其实除了给我展示最简单的IDEA 写java外，仅做了一件事就是要我把temp改成别的词语。
	//叫我单词写长点，和纠正我英语口语发音。仅此而已，好比少林寺也是 大企业，
	//里面40年的扫地僧不也就扫个地，罗汉堂首席也就敲50年木鱼，世人轻狂，总以为有绝学。。不愿坚持，所以平庸。
	public static int detaSearch(int[] score_code, String[] score, DefaultTableModel newTableModel
			, Object[][] tableData_old, List<String> copy, String key, Map<String, Object> dic_map
			, Map<String, String> pos, App u, boolean keyIsPCA) {
		boolean nullCheck= false;//今天优化下这个精度搜索函数。
		//nullcheck一遍
		if(null== key) {//把null key check提前，搜索加快
			nullCheck= true;
		}else if(key.isEmpty()) {
			nullCheck= true;
		}else if(copy.isEmpty()) {
			nullCheck= true;
		}else if(dic_map.isEmpty()) {
			nullCheck= true;
		}
		if(nullCheck) {
			newTableModel.getDataVector().clear();
			for(int i= 0; i< tableData_old.length; i++) {
				newTableModel.insertRow(i, tableData_old[i]);
			}		
			newTableModel.fireTableDataChanged();	
			return -1;
		}
		//
		int[] reg= new int[copy.size()];
		int count= 0;
		String trimKey= key.replace(" ", "");
		int keyLength= key.length(); 
		Map<String, WordFrequency> mapSearchWithoutSort= null;
		mapSearchWithoutSort= u._A.parserMixStringByReturnFrequencyMap(key);
		Iterator<String> iteratorForCopy= copy.iterator();	
		int copyCount= 0;
		//List<String> list= u._A.parserMixedString(key);
		//这里用不到 list更多操作，准备把frequencymap的key搞成list
		List<String> list= new ArrayList<>();
		Iterator<String> iterator= mapSearchWithoutSort.keySet().iterator();
		while(iterator.hasNext()) {
			list.add(iterator.next());
		}
		String[] string= List_ESU.listToArray(list);
		StringBuilder[] stringReg= new StringBuilder[keyLength/ 3];
		for(int i= 0; i< stringReg.length; i++) {
			stringReg[i]= new StringBuilder();
			stringReg[i].append(key.substring(i* 3, (i* 3+ 3)< keyLength? (i* 3+ 3): keyLength- 1));
		}
		while(iteratorForCopy.hasNext()) {
			String iteratorForCopyString= iteratorForCopy.next();
			score[copyCount]= iteratorForCopyString;
			String 待搜索词典= dic_map.get(iteratorForCopyString).toString();
			Iterator<String> iteratorWordFrequency= mapSearchWithoutSort.keySet().iterator();
			Here:
				while(iteratorWordFrequency.hasNext()) { 
					String mapSearchaAtII= iteratorWordFrequency.next();
					WordFrequency wordFrequencySearch= mapSearchWithoutSort.get(mapSearchaAtII);
					if(待搜索词典.contains(mapSearchaAtII)) {
						if(reg[copyCount]== 0){
							count+= 1;
						}
						score[copyCount]= iteratorForCopyString;
						if(keyIsPCA) {
							if(score[copyCount].contains(trimKey)) {
								reg[copyCount]+= 500;
							}
							if(key.contains(score[copyCount].replace(" ", ""))) {
								reg[copyCount]+= 500;
							}
						}
						if(!pos.containsKey(mapSearchaAtII)) {
							reg[copyCount]+= 1;
							score_code[copyCount]+= 1 << mapSearchaAtII.length()<< wordFrequencySearch.getFrequency() ;
							continue Here;
						}
						if(pos.get(mapSearchaAtII).contains("名")||pos.get(mapSearchaAtII).contains("动")
								||pos.get(mapSearchaAtII).contains("形")||pos.get(mapSearchaAtII).contains("谓")) {
							reg[copyCount]+= 2;
						}
						reg[copyCount]+= 1;
						score_code[copyCount]+= (iteratorForCopyString.contains(mapSearchaAtII)? 2: 1) 
								* (!pos.get(mapSearchaAtII).contains("名")? pos.get(mapSearchaAtII).contains("动")? 45: 1: 50) 
								<< mapSearchaAtII.length()* wordFrequencySearch.getFrequency();
						continue Here;
					}
					if(mapSearchaAtII.length()> 1) {
						for(int j= 0;j<mapSearchaAtII.length();j++) {
							if(待搜索词典.contains(String.valueOf(mapSearchaAtII.charAt(j)))) {
								if(reg[copyCount]== 0){
									count+= 1;
								}
								score[copyCount]= iteratorForCopyString;
								score_code[copyCount]+= 1;
								if(pos.containsKey(String.valueOf(mapSearchaAtII.charAt(j)))&&(
										pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("名")
										||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("动")
										||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("形")
										||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("谓")
										)) {
									reg[copyCount]+= 2;
								}
								reg[copyCount]+= 1;
								continue Here;
							}
						}
					}
				}
			score_code[copyCount]= score_code[copyCount]* reg[copyCount];
			//词距
			int code= 100;
			int 精度搜索算子= 0;
			int 智慧搜索算子= score_code[copyCount];		
			boolean 精度搜索= false;
			if(keyLength> 4) {
				//全词
				for(int i= 0; i< string.length; i++) {
					if(待搜索词典.contains(string[i])) {//因为用FrequencyMap代替，所以要乘以频率。
						精度搜索算子+= code*mapSearchWithoutSort.get(string[i]).getFrequency();
					}
				}
				for(int i= 0; i< stringReg.length; i++) {//断句
					if(待搜索词典.contains(stringReg[i].toString())) {
						精度搜索算子+= code;
					}
				}
				精度搜索= true;
			}
			if(trimKey.length()> 1&& trimKey.length()< 5) {
				if(待搜索词典.contains(trimKey)) {
					精度搜索算子+= code<< 7;
				}
				精度搜索= true;
			}
			if(精度搜索) {
				score_code[copyCount]= (int) (智慧搜索算子/Math.pow(u.lookrot+ 1, 4) 
						+ 精度搜索算子* Math.pow(u.lookrot, 2));
			}
			copyCount++;
		}
		return count;
	}

	public void IV_(JTextField name){
		StableFile.DNA_PDN.put(this.getClass().getCanonicalName(), true);
		JTabbedPane jTabbedpane= new JTabbedPane();
		Container HanContainer= new Container();
		HanJPanel hanJPanel= new HanJPanel(name);
		HanContainer.setLayout(null);
		HanContainer.setBounds(0, 0, 1490, 980);
		HanContainer.add(hanJPanel);
		jTabbedpane.addTab("发冷", new ImageIcon(), HanContainer, "发冷");
		jTabbedpane.setMnemonicAt(0, KeyEvent.VK_0); 

		Container reContainer= new Container();
		ReJPanel reJPanel= new ReJPanel(name);
		reContainer.setLayout(null);
		reContainer.setBounds(0, 0, 1490, 980);
		reContainer.add(reJPanel);
		jTabbedpane.addTab("发热", new ImageIcon(), reContainer, "发热");
		jTabbedpane.setMnemonicAt(1, KeyEvent.VK_1); 

		Container TongContainer= new Container();
		TongJPanel tongPanel= new TongJPanel(name);
		TongContainer.setLayout(null);
		TongContainer.setBounds(0, 0, 1490, 980);
		TongContainer.add(tongPanel);
		jTabbedpane.addTab("疼痛", new ImageIcon(), TongContainer, "疼痛");
		jTabbedpane.setMnemonicAt(2, KeyEvent.VK_2); 

		Container chouContainer= new Container();
		ChouchuJPanel chouJPanel= new ChouchuJPanel(name);
		chouContainer.setLayout(null);
		chouContainer.setBounds(0, 0, 1490, 980);
		chouContainer.add(chouJPanel);
		jTabbedpane.addTab("抽筋", new ImageIcon(), chouContainer, "抽筋");
		jTabbedpane.setMnemonicAt(3, KeyEvent.VK_3); 

		Container duContainer= new Container();
		DuJPanel duJPanel= new DuJPanel(name);
		duContainer.setLayout(null);
		duContainer.setBounds(0, 0, 1490, 980);
		duContainer.add(duJPanel);
		jTabbedpane.addTab("中毒", new ImageIcon(), duContainer, "中毒");
		jTabbedpane.setMnemonicAt(4, KeyEvent.VK_4); 

		Container chuangContainer= new Container();
		ChuangJPanel chuangJPanel= new ChuangJPanel(name);
		chuangContainer.setLayout(null);
		chuangContainer.setBounds(0, 0, 1490, 980);
		chuangContainer.add(chuangJPanel);
		jTabbedpane.addTab("脓疮", new ImageIcon(), chuangContainer, "脓疮");
		jTabbedpane.setMnemonicAt(5, KeyEvent.VK_5); 

		Container kuangContainer= new Container();
		KuangJPanel kuangJPanel= new KuangJPanel(name);
		kuangContainer.setLayout(null);
		kuangContainer.setBounds(0, 0, 1490, 980);
		kuangContainer.add(kuangJPanel);
		jTabbedpane.addTab("癫狂", new ImageIcon(), kuangContainer, "癫狂");
		jTabbedpane.setMnemonicAt(6, KeyEvent.VK_6); 

		Container paixieContainer= new Container();
		PaixieJPanel paixieJPanel= new PaixieJPanel(name);
		paixieContainer.setLayout(null);
		paixieContainer.setBounds(0, 0, 1490, 980);
		paixieContainer.add(paixieJPanel);
		jTabbedpane.addTab("排泄", new ImageIcon(), paixieContainer, "排泄");
		jTabbedpane.setMnemonicAt(7, KeyEvent.VK_7); 

		Container TanContainer= new Container();
		TanJPanel tanJPanel= new TanJPanel(name);
		TanContainer.setLayout(null);
		TanContainer.setBounds(0, 0, 1490, 980);
		TanContainer.add(tanJPanel);
		jTabbedpane.addTab("痰汗", new ImageIcon(), TanContainer, "痰汗");
		jTabbedpane.setMnemonicAt(8, KeyEvent.VK_8); 

		Container xueContainer= new Container();
		XueJPanel xueJPanel= new XueJPanel(name);
		xueContainer.setLayout(null);
		xueContainer.setBounds(0, 0, 1490, 980);
		xueContainer.add(xueJPanel);
		jTabbedpane.addTab("出血", new ImageIcon(), xueContainer, "出血");
		jTabbedpane.setMnemonicAt(9, KeyEvent.VK_9); 

		Container yangContainer= new Container();
		YangJPanel yangJPanel= new YangJPanel(name);
		yangContainer.setLayout(null);
		yangContainer.setBounds(0, 0, 1490, 980);
		yangContainer.add(yangJPanel);
		jTabbedpane.addTab("瘙痒", new ImageIcon(), yangContainer, "瘙痒");

		Container fuchanContainer= new Container();
		ChanJPanel fuchanJPanel= new ChanJPanel(name);
		fuchanContainer.setLayout(null);
		fuchanContainer.setBounds(0, 0, 1490, 980);
		fuchanContainer.add(fuchanJPanel);
		jTabbedpane.addTab("妇产", new ImageIcon(), fuchanContainer, "妇产");

		Container qitaContainer= new Container();
		QitaJPanel qitaJPanel= new QitaJPanel(name);
		qitaContainer.setLayout(null);
		qitaContainer.setBounds(0, 0, 1490, 980);
		qitaContainer.add(qitaJPanel);
		jTabbedpane.addTab("其他", new ImageIcon(), qitaContainer, "其他");

		this.setPreferredSize(new Dimension(800, 600));
		this.add(jTabbedpane);
		this.setBounds(0, 0, 805, 605);
		this.setVisible(true);
		this.validate();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}	
}