package ME.APM.VSQ.xiYiWaiKe;
//import java.awt.Color;
//import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
//import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import SVQ.stable.StablePOS;
import ESU.list.List_ESU;
import ESU.sort.Quick9DLYGWithString_ESU;
import ME.APM.VSQ.App;
import ME.APM.VSQ.AppButtonUtil;
import MVQ.tableRender.ColorTableRender;
import PEU.P.table.TableSorterZYNK;
import MVQ.button.DetaButton;
//import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OSI.AOP.neo.tts.ReadChinese;
public class WkxPage extends Container implements MouseListener, KeyListener{
	private static final long serialVersionUID = 1L;
	public String key;
	public JTextPane data ;
	public JTextPane statistic ;
	public JTextField name;
	public DetaButton buttonPrev;
	public DetaButton buttonNext;
	public DetaButton buttonSum;
	public DetaButton buttonCrt;
	public int currentPage;
	public List<String> sets;
	public javax.swing.JTable table;  
	public Object[][] tableData_old;
	public DefaultTableModel newTableModel = null;
	public List<String> copy;
	public List<String> copy_xj;
	public List<String> dic_list;
	public Map<String,Object> dic_map;
	public Map<String,Object> dic_xj;
	public Map<String,Object> dic_gn;
	public Map<String,Object> dic_lx;
	public Map<String,Object> dic_by;
	public Map<String,Object> dic_wx;
	public Map<String,Object> dic_bl;
	public Map<String,Object> dic_lc;
	public Map<String,Object> dic_sy;
	public Map<String,Object> dic_zd;
	public Map<String,Object> dic_bf;
	public Map<String,Object> dic_zl;
	public Map<String,Object> dic_jy;
	public Map<String,Object> dic_yh;
	public Map<String,Object> dic_yf;
	public Map<String,Object> dic_yx;
	public CogsBinaryForest_AE _A;
	public Map<String, String> pos;
	public DetaButton buttonCTE;
	public DetaButton buttonFRS;
	public DetaButton buttonETC;
	public Map<String, String> pose;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public Object[] columnTitle = {"ID", "打分", "外科症治科目", "章节重点笔记"};  
	public JTextPane text ;
	private App u;
	private JTabbedPane jTabbedpane;
	private ReadChinese readChinese;
	private DetaButton buttonCTV;
	protected int row;
	public WkxPage(JTextPane text, CogsBinaryForest_AE _A, Map<String, String> pos, Map<String, String> pose
			, Map<String, String> etc, Map<String, String> cte, App u, JTabbedPane jTabbedpane) throws IOException{
		this.text = text;	this.pose = pose;
		this.etc = etc;
		this.cte = cte;
		this._A = _A;
		this.pos = pos;
		this.u= u;
		this.jTabbedpane= jTabbedpane;
		this.setLayout(null);
		this.setBounds(0, 0, 1490, 980);	
		JScrollPane jsp_name = new JScrollPane(this.name());
		jsp_name.setBounds(100, 15, 680, 50);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JScrollPane jsp_data = new JScrollPane(this.data());
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JScrollPane jsp_statistic = new JScrollPane(this.statistic());
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		jsp_statistic.setBounds(5, 290 + 100 - 80 + 200-260, 1440 - 650 - 645, 500-166+90-44);
		jsp_data.setBounds(5 + 800-650, 290 + 100 - 80 + 200-260+26, 1440-800+650-130, 500-166+90-70);
		JLabel jlabel = new JLabel("信息搜索:");  
		jlabel.setBounds(5, 15, 100, 50);
		JScrollPane jsp = new JScrollPane(this.jTable());
		jsp.setBounds(5, 80-80, 1440-130, 200+100+200-260);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.add(jsp);  
		this.add(jsp_data); 
		this.add(jsp_statistic);  
	}

	public JTextPane data() throws IOException {
		data = new JTextPane();  
		data.setBounds(850, 150, 1440-600, 800-70);

		buttonSum = new DetaButton("共有 " + (sets==null?0:(1 + sets.size() / 2001))+ " 页");
		buttonSum.setBounds(0, 0, 100, 30);
		buttonCrt = new DetaButton("当前页面：" + (currentPage + 1));
		buttonCrt.setBounds(120, 0, 150, 30);

		buttonPrev= new DetaButton("<-向前翻页");
		buttonPrev.setBounds(290, 0, 100, 30);
		buttonPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String, WordFrequency> map = new ConcurrentHashMap<>();
				try {
					currentPage-=1;
					currentPage = (currentPage< 0 ? 0 : currentPage );
					StringBuilder page = new StringBuilder().append("");
					AppButtonUtil.page翻页(page, map, key, pos, sets, currentPage);
					buttonCrt.setText("当前页面：" + (currentPage + 1));
					data.setText(page.toString());
					data.setSelectionStart(0);
					data.setSelectionEnd(0);
					data.validate();
				}catch(Exception e1){	
					data.validate();
					jTabbedpane.validate();
				}   
				try {
					statistic.setSize(500, 800);
					Map<Integer, WordFrequency> fwa = _A.sortWordFrequencyMapToSortMap(map);
					statistic.setContentType("text/html");
					StringBuilder page = new StringBuilder();
					Here:
						for (int i = fwa.size()-1; i >= 0; i--) {
							if (fwa.get(i) != null) {
								if(pos.get(fwa.get(i).getWord()) == null) {
									page.append("<div style=\"background:black\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() + "</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("名")) {
									page.append( "<div style=\"background:#FF44FF\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("动")) {
									page.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("形")) {
									page.append("<div style=\"background:#FF9224\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
								}
							}
						}	
					statistic.setText(page.toString());
					statistic.setSelectionStart(0);
					statistic.setSelectionEnd(0);
					statistic.validate();
				}catch(Exception e1){	
					statistic.validate();
				}          
			}
		});
		buttonNext= new DetaButton("向后翻页->");
		buttonNext.setBounds(410, 0, 100, 30);
		buttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String, WordFrequency> map = new ConcurrentHashMap<>();
				try {
					currentPage+=1;
					currentPage = (currentPage > (sets == null ? 0 : sets.size()) / 2001 ? currentPage - 1 : currentPage );
					StringBuilder page = new StringBuilder().append("");
					AppButtonUtil.page翻页(page, map, key, pos, sets, currentPage);
					buttonCrt.setText("当前页面：" + (currentPage + 1));
					data.setText(page.toString());
					data.setSelectionStart(0);
					data.setSelectionEnd(0);
					data.validate();
				}catch(Exception e1){	
					data.validate();
					jTabbedpane.validate();
				}   
				try {
					statistic.setSize(500, 800);
					Map<Integer, WordFrequency> fwa = _A.sortWordFrequencyMapToSortMap(map);
					statistic.setContentType("text/html");
					StringBuilder page = new StringBuilder();
					Here:
						for (int i = fwa.size()-1; i >= 0; i--) {
							if (fwa.get(i) != null) {
								if(pos.get(fwa.get(i).getWord()) == null) {
									page.append("<div style=\"background:black\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() + "</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("名")) {
									page.append( "<div style=\"background:#FF44FF\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("动")) {
									page.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("形")) {
									page.append("<div style=\"background:#FF9224\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
								}
							}
						}	
					statistic.setText(page.toString());
					statistic.setSelectionStart(0);
					statistic.setSelectionEnd(0);
					statistic.validate();
				}catch(Exception e1){	
					statistic.validate();
					jTabbedpane.validate();
				}  
			}
		});
		buttonCTE = new DetaButton("英文注释");
		buttonCTE.setBounds(630, 0, 100, 30);
		buttonCTE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(sets==null) {
				return;
			}
			StringBuilder page = new StringBuilder().append("");
			AppButtonUtil.page英文注释(page, cte, key, pos, sets, currentPage);
			buttonCrt.setText("当前页面：" + (currentPage + 1));
			data.setText(page.toString());
			data.setSelectionStart(0);
			data.setSelectionEnd(0);
			data.validate();
			}
		});

		buttonFRS = new DetaButton("中文还原");
		buttonFRS.setBounds(520, 0, 100, 30);
		buttonFRS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(sets==null) {
				return;
			}
			StringBuilder page = new StringBuilder().append("");
			AppButtonUtil.page中文还原(page, key, pos, sets, currentPage);
			buttonCrt.setText("当前页面：" + (currentPage + 1));
			data.setText(page.toString());
			data.setSelectionStart(0);
			data.setSelectionEnd(0);
			data.validate();
			}
		});

		buttonETC = new DetaButton("同义描述");
		buttonETC.setBounds(740, 0, 100, 30);
		buttonETC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(sets==null) {
				return;
			}
			StringBuilder page = new StringBuilder().append("");
			AppButtonUtil.page同义描述( page,  cte,  etc, key, pos, sets,currentPage);
			buttonCrt.setText("当前页面：" + (currentPage + 1));
			data.setText(page.toString());
			data.setSelectionStart(0);
			data.setSelectionEnd(0);
			data.validate();
			}
		});
		DetaButton buttonADD = new DetaButton("添加到编辑页");
		buttonADD.setBounds(868, 0, 115, 30);
		buttonADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sets==null) {
					return;
				}
				if(text.getText().length()>5000) {
					return;
				}
				StringBuilder page = new StringBuilder();
				List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
				Iterator<String> iterator = setsForGet.iterator();
				while(iterator.hasNext()) {
					String setOfi = iterator.next();
					page.append(setOfi); 
				}
				if(!text.getText().isEmpty()) {
					text.setText(text.getText() +"\r\n\r\n"+ page.toString());
				}else {
					text.setText(page.toString());
				}
				text.validate();
			}
		});
		DetaButton buttonKSLJ= new DetaButton("中药DNN");
		buttonKSLJ.setBounds(990, 0, 115, 30);
		buttonKSLJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(null== sets) {
					return;
				}
				if(text.getText().length()>5000) {
					return;
				}
				StringBuilder page = new StringBuilder().append("");
				AppButtonUtil.pageDNN(page, sets, currentPage, u, table, row, pos, key
						, buttonSum, buttonCrt, data, statistic, "中药");
			}
		});


		DetaButton buttonKSLJB= new DetaButton("西药DNN");
		buttonKSLJB.setBounds(990+ 115+ 7, 0, 115, 30);
		buttonKSLJB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(null== sets) {
					return;
				}
				if(text.getText().length()>5000) {
					return;
				}
				StringBuilder page = new StringBuilder().append("");
				AppButtonUtil.pageDNN(page, sets, currentPage, u, table, row, pos, key
						, buttonSum, buttonCrt, data, statistic, "西药");
			}
		});


		readChinese= new ReadChinese(u, _A);
		buttonCTV= new DetaButton("语音阅读关");
		buttonCTV.setBounds(740, 0, 100, 30);
		buttonCTV.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(sets== null) {
					return;
				}
				//				List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()
				//						? (currentPage + 1)*2000: sets.size());
				if(!readChinese.isAlive()) {
					buttonCTV.setLabel("语音阅读开");
					readChinese= new ReadChinese(u, _A);
					readChinese.I_PreReadList(sets);
					readChinese.start();
				}else {
					buttonCTV.setLabel("语音阅读关");
					readChinese.finish= 0;
					readChinese.I_NullSap();
					readChinese.stop();
				}
			}
		});
		Box buttonBox = new Box(BoxLayout.X_AXIS);  
		buttonBox.add(buttonPrev);
		buttonBox.add(buttonNext);
		buttonBox.add(buttonSum);
		buttonBox.add(buttonCrt);
		buttonBox.add(buttonCTE);
		buttonBox.add(buttonFRS);
		buttonBox.add(buttonETC);
		buttonBox.add(buttonCTV);
		buttonBox.add(buttonADD);
		buttonBox.add(buttonKSLJ);
		buttonBox.add(buttonKSLJB);
		buttonBox.setBounds(5 + 800-650, 290 + 100 - 80 + 200-260, 950+ 220, 20);
		this.add(buttonBox);
		return data;  
	}

	public JTextPane statistic() throws IOException {
		statistic = new JTextPane();  
		statistic.setBounds(850, 150, 1440-840, 800);
		return statistic;  
	}

	public JTextField name() throws IOException {
		name = new JTextField();  
		name.setBounds(180, 50, 380, 80);
		name.addKeyListener(this);
		return name;
	}

	@SuppressWarnings({ "serial" })
	public javax.swing.JTable jTable() throws IOException {  
		Dictionary d=new Dictionary();
		dic_list=d.txtToList();
		dic_map = d.listToMap(dic_list);
		dic_xj = d.mapToMap_xj(dic_map);
		tableData_old = new Object[dic_xj.size()][18];
		Iterator<String> iter_xj = dic_xj.keySet().iterator();
		copy_xj = new ArrayList<String>();
		while (iter_xj.hasNext())
			copy_xj.add(iter_xj.next());
		for(int j=0;j<copy_xj.size();j++) {
			tableData_old[j]= new Object[]{""+(j+1),
					""+0,copy_xj.get(j).trim(),
					dic_xj.get(copy_xj.get(j)).toString().replaceAll("\\s*", "")
			};
		}
		table = new javax.swing.JTable();  
		newTableModel = new DefaultTableModel(tableData_old,columnTitle){  
			@Override  
			public boolean isCellEditable(int row,int column){  
				return false;  
			}  
		};  
		TableSorterZYNK sorter= new TableSorterZYNK(newTableModel); //ADDE
		sorter.setTableHeader(table.getTableHeader());
		table.setModel(sorter); 
		table.setRowHeight(35);                                        //设置高度
		JTableHeader header=table.getTableHeader();
		header.setFont(new Font("楷体", Font.PLAIN, 18));// 设置表格字体
		table.getColumnModel().getColumn(0).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(1).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(2).setPreferredWidth(80+230);
		table.getColumnModel().getColumn(3).setPreferredWidth(80+830);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.addMouseListener(this);
		ColorTableRender tcr = new ColorTableRender();  
		table.setDefaultRenderer(Object.class, tcr);	
		return table;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(key == null) {
			key = "";
		}
		sets = null;
		Map<String, WordFrequency> map = new ConcurrentHashMap<>();
		try {
			row = table.getSelectedRow();
			int col = table.getSelectedColumn();
			String value = (String) table.getValueAt(row, col);
			data.setSize(500, 800);
			sets = _A.parserMixedString(value);//词性分析		
			data.setContentType("text/html");
			StringBuilder page = new StringBuilder().append("");
			currentPage=0;
			List<String> setsForGet = sets.subList(currentPage*2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
			Iterator<String> iterator = setsForGet.iterator();
			Here:
				while(iterator.hasNext()) {
					String setOfi = iterator.next();
					if(pos.get(setOfi) == null) {
						page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形")) {
						if (map.containsKey(setOfi)) {
							WordFrequency wordFrequency = map.get(setOfi);
							wordFrequency.I_Frequency(wordFrequency.getFrequency() + StablePOS.INT_ONE);
							map.put(setOfi, wordFrequency);
						} else {
							WordFrequency wordFrequency = new WordFrequency();
							wordFrequency.I_Frequency(StablePOS.INT_ONE);
							wordFrequency.I_Word(setOfi);
							map.put(setOfi, wordFrequency);
						}
					}
					if (!setOfi.equals("")) {
						if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
							page.append("<span style=\"background:red\"><font color=\"white\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("名")) {
							page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("动")) {
							page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("形")) {
							page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("副")) {
							page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						} 
						page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");			 
					}
				}	
			buttonSum.setText("共有 " + (sets == null ? 0 : (1 + sets.size() / 2001)) + " 页");
			buttonCrt.setText("当前页面：" + (sets == null? 0 : 1));
			data.setText(page.toString());
			data.setSelectionStart(0);
			data.setSelectionEnd(0);
			data.validate();
		}catch(Exception e){	
			data.validate();
			jTabbedpane.validate();
		}   
		try {
			statistic.setSize(500, 800);
			Map<Integer, WordFrequency> fwa = _A.sortWordFrequencyMapToSortMap(map);
			statistic.setContentType("text/html");
			StringBuilder page = new StringBuilder();
			Here:
				for (int i = fwa.size()-1; i >= 0; i--) {
					if (fwa.get(i) != null) {
						if(pos.get(fwa.get(i).getWord()) == null) {
							page.append("<div style=\"background:black\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() + "</font></div>");
							continue Here;
						}
						if(pos.get(fwa.get(i).getWord()).contains("名")) {
							page.append( "<div style=\"background:#FF44FF\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
							continue Here;
						}
						if(pos.get(fwa.get(i).getWord()).contains("动")) {
							page.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
							continue Here;
						}
						if(pos.get(fwa.get(i).getWord()).contains("形")) {
							page.append("<div style=\"background:#FF9224\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
						}
					}
				}	
			statistic.setText(page.toString());
			statistic.setSelectionStart(0);
			statistic.setSelectionEnd(0);
			statistic.validate();
		}catch(Exception e){	
			statistic.validate();
			jTabbedpane.validate();
		}          
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {	
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
	}

	@SuppressWarnings("unused")
	@Override
	public void keyReleased(KeyEvent arg0) {
		///////////////
		if(null== key|| key.equals("")) {//把null key check提前，搜索加快
			newTableModel.getDataVector().clear();
			for(int i= 0; i< tableData_old.length; i++) {
				newTableModel.insertRow(i, tableData_old[i]);
			}		
			newTableModel.fireTableDataChanged();	
			return;
		}
		//////////////
		String[] score=new String[copy_xj.size()];
		int[] score_code=new int[copy_xj.size()];
		int []reg= new int[copy_xj.size()];
		int count=0;
		Map<String, WordFrequency> mapSearchWithoutSort = null;
		mapSearchWithoutSort = _A.parserMixStringByReturnFrequencyMap(key);
		Iterator<String> iteratorForCopy = copy_xj.iterator();	
		int copyCount = 0;
		//List<String> list= u._A.parserMixedString(key);
		//这里用不到 list更多操作，准备把frequencymap的key搞成list
		List<String> list= new ArrayList<>();
		Iterator<String> iterator= mapSearchWithoutSort.keySet().iterator();
		while(iterator.hasNext()) {
			list.add(iterator.next());
		}
		String[] string= List_ESU.listToArray(list);
		String[] stringReg= new String[key.length()/3];
		for(int i= 0; i< stringReg.length; i++) {
			stringReg[i]= key.substring(i*3, (i*3+ 3)<key.length()?(i*3+ 3):key.length()-1);
		}
		while(iteratorForCopy.hasNext()) {
			String iteratorForCopyString = iteratorForCopy.next();
			score[copyCount] = iteratorForCopyString;
			String temps = dic_xj.get(iteratorForCopyString).toString();
			Iterator<String> iteratorWordFrequency = mapSearchWithoutSort.keySet().iterator();
			Here:
				while(iteratorWordFrequency.hasNext()) {  
					String mapSearchaAtII = iteratorWordFrequency.next();
					WordFrequency wordFrequencySearch = mapSearchWithoutSort.get(mapSearchaAtII);
					if(temps.contains(mapSearchaAtII)) {
						if(reg[copyCount] == 0){
							count += 1;
						}
						score[copyCount] = iteratorForCopyString;
						if(score[copyCount].contains(key.replace(" ", ""))) {
							reg[copyCount]+= 500;
						}
						if(key.contains(score[copyCount].replace(" ", ""))) {
							reg[copyCount]+= 500;
						}
						if(!pos.containsKey(mapSearchaAtII)) {
							reg[copyCount] += 1;
							score_code[copyCount] += 1 << mapSearchaAtII.length() << wordFrequencySearch.getFrequency() ;
							continue Here;
						}
						if(pos.get(mapSearchaAtII).contains("名")||pos.get(mapSearchaAtII).contains("动")
								||pos.get(mapSearchaAtII).contains("形")||pos.get(mapSearchaAtII).contains("谓")) {
							reg[copyCount] += 2;
						}
						reg[copyCount] += 1;
						score_code[copyCount] += (iteratorForCopyString.contains(mapSearchaAtII) ? 2 : 1) 
								* (!pos.get(mapSearchaAtII).contains("名") ? pos.get(mapSearchaAtII).contains("动")? 45 : 1 : 50) 
								<< mapSearchaAtII.length() * wordFrequencySearch.getFrequency();
						continue Here;
					}
					if(mapSearchaAtII.length()>1) {
						for(int j=0;j<mapSearchaAtII.length();j++) {
							if(temps.contains(String.valueOf(mapSearchaAtII.charAt(j)))) {
								if(reg[copyCount] == 0){
									count += 1;
								}
								score[copyCount] = iteratorForCopyString;
								score_code[copyCount]+=1;
								if(pos.containsKey(String.valueOf(mapSearchaAtII.charAt(j)))&&(
										pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("名")
										||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("动")
										||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("形")
										||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("谓")
										)) {
									reg[copyCount] += 2;
								}
								reg[copyCount] += 1;
								continue Here;
							}
						}
					}
				}
			score_code[copyCount] = score_code[copyCount] * reg[copyCount];
			//词距
			int code= 100;
			int tempb= 0;
			int tempa= score_code[copyCount];
			if(key.length()> 4) {
				//全词
				for(int i= 0; i< string.length; i++) {
					if(temps.contains(string[i])) {//因为用FrequencyMap代替，所以要乘以频率。
						tempb+= code* mapSearchWithoutSort.get(string[i]).getFrequency();
					}
				}
				//断句
				for(int i= 0; i< stringReg.length; i++) {
					if(temps.contains(stringReg[i])) {
						tempb+= code;
					}
				}
				score_code[copyCount] = (int) (tempa/Math.pow(this.u.lookrot+ 1, 4) + tempb*Math.pow(this.u.lookrot, 2));
			}
			if(key.replace(" ", "").length()> 1&& key.replace(" ", "").length()< 5) {
				if(temps.contains(key)) {
					tempb+= code<< 7;
				}
				score_code[copyCount] = (int) (tempa/Math.pow(this.u.lookrot+ 1, 4) + tempb*Math.pow(this.u.lookrot, 2));
			}
			copyCount++;
		}
		LABEL2:
			new Quick9DLYGWithString_ESU().sort(score_code, score);
		int max= score_code[0];
		Object[][] tableData = new Object[count][18];
		int new_count=0;
		newTableModel.getDataVector().clear();
		Here:
			for(int i = copy_xj.size()-1; i > -1; i--) {
				if(score_code[i] < 1){
					continue Here;
				}
				if(u.shuming_filter_box.isSelected()) {
					String wei= score[i];
					String temp= u.name_filter.getText();
					for(int j=0;j<temp.length();j++) {
						if(wei.contains(""+ temp.charAt(j))) {
							continue Here;
						}	
					}
				}
				tableData[new_count]= new Object[]{new_count+1,
						score_code[i],
						score[i],
						dic_xj.get(score[i]).toString()
				};   
				newTableModel.insertRow(new_count, tableData[new_count]);
				new_count+=1;
			}	
		newTableModel.fireTableDataChanged();	
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}
}