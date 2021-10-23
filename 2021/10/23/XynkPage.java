package ME.APM.VSQ.xiYiNeiKe;
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
import ESU.sort.Quick9DLYGWithString_ESU;
import ME.APM.VSQ.App;
import ME.APM.VSQ.AppButtonUtil;
import ME.APM.VSQ.AppSearch;
import MVQ.tableRender.ColorTableRender;
import PEU.P.table.TableSorterZYNK;
import MVQ.button.DetaButton;
//import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OSI.AOP.neo.tts.ReadChinese;
public class XynkPage extends Container implements MouseListener, KeyListener{
	private static final long serialVersionUID = 1L;
	public String key;
	public JTextPane data ;
	public JTextPane statistic ;
	public DetaButton buttonPrev;
	public DetaButton buttonNext;
	public DetaButton buttonSum;
	public DetaButton buttonCrt;
	public DetaButton buttonCTE;
	public DetaButton buttonFRS;
	public DetaButton buttonETC;
	public int currentPage;
	public List<String> sets;
	public JTextField name;
	public javax.swing.JTable table;  
	public Object[][] tableData_old;
	public DefaultTableModel newTableModel = null;
	public List<String> copy;
	public List<String> dic_list;
	public Map<String,Object> dic_map ;
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
	public Object[] columnTitle = {"ID", "���", "�ڿ�ѧ��", "ԭ��ʼ�", "����", "���в�ѧ",
			"����&��������", "Σ������", "�������", "�ٴ�����&����&����", "ʵ���Һ��������", "���&�������", "����֢",
			"����&���Ʒ���&ԭ��", "����&����", "Ԥ��", "Ԥ��", "Ӱ������"};
	public CogsBinaryForest_AE _A;  
	public Map<String, String> pos;
	public Map<String, String> pose;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public JTextPane text ;
	private App u;
	private JTabbedPane jTabbedpane;
	private ReadChinese readChinese;
	private DetaButton buttonCTV;
	protected int row;
	public XynkPage(JTextPane text, CogsBinaryForest_AE _A, Map<String, String> pos, Map<String, String> pose
			, Map<String, String> etc, Map<String, String> cte, App u, JTabbedPane jTabbedpane) throws IOException{
		this.text = text;	this._A = _A;
		this.pos = pos;
		this.pose = pose;
		this.etc = etc;
		this.cte = cte;
		this.u= u;
		this.jTabbedpane= jTabbedpane;
		this.setLayout(null);
		this.setBounds(0, 0, 1490, 980);	
		JScrollPane jsp_name = new JScrollPane(this.name());
		jsp_name.setBounds(100, 15, 680, 50);
		JScrollPane jsp_data = new JScrollPane(this.data());
		JScrollPane jsp_statistic = new JScrollPane(this.statistic());
		
		jsp_statistic.setBounds(5, 290 + 100 - 80 + 200 - 260, 1440 - 650 - 645, 500 - 166 + 90-44);
		jsp_data.setBounds(5 + 800 - 650, 290 + 100 - 80 + 200 - 260+26, 1440 - 800 + 650 - 130, 500 - 166 + 90-70);
		
		JLabel jlabel = new JLabel("��Ϣ����:"); 
		jlabel.setBounds(5, 15, 100, 50);
		JScrollPane jsp = new JScrollPane(this.jTable());
		jsp.setBounds(5, 80-80, 1440-130, 200+100+200-260);
		
		this.add(jsp);  
		this.add(jsp_data); 
		this.add(jsp_statistic);  
	}

	public JTextPane data() throws IOException {
		data = new JTextPane();  
		data.setBounds(850, 150, 1440-600, 800-70);
		
		buttonSum = new DetaButton("���� " + (sets==null?0:(1 + sets.size() / 2001))+ " ҳ");
		buttonSum.setBounds(0, 0, 100, 30);
		buttonCrt = new DetaButton("��ǰҳ�棺" + (currentPage + 1));
		buttonCrt.setBounds(120, 0, 150, 30);
				
		buttonPrev = new DetaButton("<-��ǰ��ҳ");
		buttonPrev.setBounds(290, 0, 100, 30);
		buttonPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String, WordFrequency> map = new ConcurrentHashMap<>();
				try {
					currentPage -= 1;
					currentPage = (currentPage< 0 ? 0 : currentPage );
					StringBuilder page = new StringBuilder().append("");
					AppButtonUtil.page��ҳ(page, map, key, pos, sets, currentPage);
					buttonCrt.setText("��ǰҳ�棺" + (currentPage + 1));
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
								if(pos.get(fwa.get(i).getWord()).contains("��")) {
									page.append( "<div style=\"background:#FF44FF\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("��")) {
									page.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("��")) {
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
		buttonNext= new DetaButton("���ҳ->");
		buttonNext.setBounds(410, 0, 100, 30);
		buttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Map<String, WordFrequency> map = new ConcurrentHashMap<>();
					try {
						currentPage += 1;
						currentPage = (currentPage > (sets == null ? 0 : sets.size()) / 2001 ? currentPage - 1 : currentPage );
						StringBuilder page = new StringBuilder().append("");
						AppButtonUtil.page��ҳ(page, map, key, pos, sets, currentPage);
						buttonCrt.setText("��ǰҳ�棺" + (currentPage + 1));
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
									if(pos.get(fwa.get(i).getWord()).contains("��")) {
										page.append( "<div style=\"background:#FF44FF\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
										continue Here;
									}
									if(pos.get(fwa.get(i).getWord()).contains("��")) {
										page.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
										continue Here;
									}
									if(pos.get(fwa.get(i).getWord()).contains("��")) {
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
		
		buttonCTE = new DetaButton("Ӣ��ע��");
		buttonCTE.setBounds(630, 0, 100, 30);
		buttonCTE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(sets==null) {
				return;
			}
			StringBuilder page = new StringBuilder().append("");
			AppButtonUtil.pageӢ��ע��(page, cte, key, pos, sets, currentPage);
				buttonCrt.setText("��ǰҳ�棺" + (currentPage + 1));
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
		});
		
		buttonFRS = new DetaButton("���Ļ�ԭ");
		buttonFRS.setBounds(520, 0, 100, 30);
		buttonFRS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(sets==null) {
				return;
			}
			StringBuilder page = new StringBuilder().append("");
			AppButtonUtil.page���Ļ�ԭ(page, key, pos, sets, currentPage);
				buttonCrt.setText("��ǰҳ�棺" + (currentPage + 1));
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
		});
		
		buttonETC = new DetaButton("ͬ������");
		buttonETC.setBounds(740, 0, 100, 30);
		buttonETC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(sets==null) {
				return;
			}
			StringBuilder page = new StringBuilder().append("");
			AppButtonUtil.pageͬ������( page,  cte,  etc, key, pos, sets,currentPage);
				buttonCrt.setText("��ǰҳ�棺" + (currentPage + 1));
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
		});
		DetaButton buttonADD = new DetaButton("��ӵ��༭ҳ");
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
		DetaButton buttonKSLJ= new DetaButton("��ҩDNN");
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
						, buttonSum, buttonCrt, data, statistic, "��ҩ");
			}
		});
		
		DetaButton buttonKSLJB= new DetaButton("��ҩDNN");
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
						, buttonSum, buttonCrt, data, statistic, "��ҩ");
			}
		});
		
		readChinese= new ReadChinese(u, _A);
		buttonCTV= new DetaButton("�����Ķ���");
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
					buttonCTV.setLabel("�����Ķ���");
					readChinese= new ReadChinese(u, _A);
					readChinese.I_PreReadList(sets);
					readChinese.start();
				}else {
					buttonCTV.setLabel("�����Ķ���");
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
		dic_gn = d.mapToMap_gn(dic_map);
		dic_lx = d.mapToMap_lx(dic_map);
		dic_by = d.mapToMap_by(dic_map);
		dic_wx = d.mapToMap_wx(dic_map);
		dic_bl = d.mapToMap_bl(dic_map);
		dic_lc = d.mapToMap_lc(dic_map);
		dic_sy = d.mapToMap_sy(dic_map);
		dic_zd = d.mapToMap_zd(dic_map);
		dic_bf = d.mapToMap_bf(dic_map);
		dic_zl = d.mapToMap_zl(dic_map);
		dic_jy = d.mapToMap_jy(dic_map);
		dic_yh = d.mapToMap_yh(dic_map);
		dic_yf = d.mapToMap_yf(dic_map);
		dic_yx = d.mapToMap_yx(dic_map);
		tableData_old = new Object[dic_map.size()][18];
		Iterator<String> iter = dic_map.keySet().iterator();
		copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++) {
			tableData_old[i]= new Object[]{""+(i+1),""+0,copy.get(i).trim(),
					dic_map.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_gn.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_lx.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_by.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_wx.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_bl.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_lc.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_sy.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_zd.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_bf.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_zl.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_jy.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_yh.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_yf.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_yx.get(copy.get(i)).toString().replaceAll("\\s*", "")
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
		table.setRowHeight(35);                                        //���ø߶�
		JTableHeader header=table.getTableHeader();
		header.setFont(new Font("����", Font.PLAIN, 18));// ���ñ������
		table.getColumnModel().getColumn(0).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(1).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(2).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(3).setPreferredWidth(80+521);
		table.getColumnModel().getColumn(4).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(5).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(6).setPreferredWidth(80+60);
		table.getColumnModel().getColumn(7).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(8).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(9).setPreferredWidth(80+110);
		table.getColumnModel().getColumn(10).setPreferredWidth(80+110);
		table.getColumnModel().getColumn(11).setPreferredWidth(80+60);
		table.getColumnModel().getColumn(12).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(13).setPreferredWidth(80+110);
		table.getColumnModel().getColumn(14).setPreferredWidth(80+110);
		table.getColumnModel().getColumn(17).setPreferredWidth(80+110);
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
			sets = _A.parserMixedString(value);//���Է���		
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
					if(pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��")) {
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
						if(key.contains(setOfi)&&(pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��"))) {
							page.append("<span style=\"background:red\"><font color=\"white\">"+setOfi+"</font></span>");
		    				continue Here;
		    			}
						if(pos.get(setOfi).contains("��")) {
							page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("��")) {
							page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("��")) {
							page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("��")) {
							page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						} 
						page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");			 
					}
				}	
			buttonSum.setText("���� " + (sets == null ? 0 : (1 + sets.size() / 2001)) + " ҳ");
			buttonCrt.setText("��ǰҳ�棺" + (sets == null? 0 : 1));
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
						if(pos.get(fwa.get(i).getWord()).contains("��")) {
							page.append( "<div style=\"background:#FF44FF\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
							continue Here;
						}
						if(pos.get(fwa.get(i).getWord()).contains("��")) {
							page.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
							continue Here;
						}
						if(pos.get(fwa.get(i).getWord()).contains("��")) {
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
		String[] score = new String[copy.size()];
		int[] score_code = new int[copy.size()];
		int []reg = new int[copy.size()];
		int count= AppSearch.detaSearch(score_code, score, newTableModel, tableData_old, copy, key
				, dic_map, pos, this.u, true);//�������£�OK�� ׼������vpcs�滻��֮����Ƴ��̡߳���������������
		if(-1== count) {
			return;
		}
		new Quick9DLYGWithString_ESU().sort(score_code, score);
		int max = score_code[0];
		Object[][] tableData = new Object[count][18];
		int new_count=0;
		newTableModel.getDataVector().clear();
		Here:
			for(int i = copy.size()-1; i > 0; i--) {
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
				
//				if(score[i].contains("����")) {
//				try {
//					FileWriter fw= new FileWriter("D:/Users/Lenovo/eclipse-workspace/DETA_YLJ1.0.0/medReport/org/tinos/reportMap/report.txt", true);
//					fw.write(score[i]+"->"+dic_lc.get(score[i]).toString()+ "->"+ dic_sy.get(score[i]).toString());
//					fw.write("\r\n");
//					fw.flush();
//					fw.close();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
				tableData[new_count]= new Object[]{new_count+1,score_code[i-1],score[i],
						dic_map.get(score[i]).toString(),
						dic_gn.get(score[i]).toString(),
						dic_lx.get(score[i]).toString(),
						dic_by.get(score[i]).toString(),
						dic_wx.get(score[i]).toString(),
						dic_bl.get(score[i]).toString(),
						dic_lc.get(score[i]).toString(),
						dic_sy.get(score[i]).toString(),
						dic_zd.get(score[i]).toString(),
						dic_bf.get(score[i]).toString(),
						dic_zl.get(score[i]).toString(),
						dic_jy.get(score[i]).toString(),
						dic_yh.get(score[i]).toString(),
						dic_yf.get(score[i]).toString(),
						dic_yx.get(score[i]).toString()
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