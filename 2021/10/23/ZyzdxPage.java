package ME.APM.VSQ.zhongYiZhenDuanXue;
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
//import ESU.string.String_ESU;
import ME.APM.VSQ.App;
import ME.APM.VSQ.AppButtonUtil;
import ME.APM.VSQ.AppSearch;
import MVQ.tableRender.ColorTableRender;
//import MSU.AMS.VQS.SQV.SI.OSU.SMV.http.RestCall;
import PEU.P.table.TableSorterZYNK;
import MVQ.button.DetaButton;
//import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OSI.AOP.neo.tts.ReadChinese;
public class ZyzdxPage extends Container implements MouseListener, KeyListener{
	private static final long serialVersionUID = 1L;
	public String key;
	public JTextPane data ;
	public JTextPane text ;
	public JTextPane statistic;
	public DetaButton buttonPrev;
	public DetaButton buttonNext;
	public DetaButton buttonSum;
	public DetaButton buttonCrt;
	public DetaButton buttonCTE;
	public DetaButton buttonFRS;
	public DetaButton buttonETC;
	public Map<String, String> pose;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public int currentPage;
	public List<String> sets;
	public JTextField name;
	public javax.swing.JTable table;  
	public Object[][] tableData_old;
	public DefaultTableModel newTableModel = null;
	public List<String> copy;
	public List<String> dic_list;
	public Map<String,Object> dic_map ;
	public Map<String,Object> dic_gn ;
	public Map<String,Object> dic_lcbx;
	public Map<String,Object> dic_lcyy; 
	public Map<String,Object> dic_zhfx;
	public Map<String,Object> dic_zhjb; 
	public Object[] columnTitle = {"ID","打分","病症", "笔记","概念","临床表现"
			, "症侯分析", "临床意义", "症侯鉴别"};
	public CogsBinaryForest_AE _A;  	
	public Map<String, String> pos;
	private App u;
	private JTabbedPane jTabbedpane;
	private ReadChinese readChinese;
	private DetaButton buttonCTV;
	protected int row;
	public ZyzdxPage(JTextPane text, CogsBinaryForest_AE _A, Map<String, String> pos
			, Map<String, String> pose, Map<String, String> etc, Map<String, String> cte
			, App u, JTabbedPane jTabbedpane) throws IOException{
		this.text = text;
		this.pose = pose;
		this.etc = etc;
		this.cte = cte;
		this.u= u;
		this._A = _A;
		this.pos = pos;
		this.jTabbedpane= jTabbedpane;
		this.setLayout(null);
		this.setBounds(0, 0, 1490, 980);	
		JScrollPane jsp_name = new JScrollPane(this.name());
		jsp_name.setBounds(100, 15, 680, 50);
		JScrollPane jsp_data = new JScrollPane(this.data());
		JScrollPane jsp_statistic = new JScrollPane(this.statistic());

		jsp_statistic.setBounds(5, 290 + 100 - 80 + 200-260, 1440 - 650 - 645, 500-166+90-44);
		jsp_data.setBounds(5 + 800-650, 290 + 100 - 80 + 200-260+26, 1440-800+650-130
				, 500-166+90-70);//////////////////
		JLabel jlabel = new JLabel("信息搜索:");  
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
					currentPage-= 1;
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
									page.append("<div style=\"background:black\">"
											+ "<font color=\"white\">" 
											+ fwa.get(i).getWord()+""+fwa.get(i).getFrequency() 
											+ "</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("名")) {
									page.append( "<div style=\"background:#FF44FF\">"
											+ "<font color=\"white\">" + fwa.get(i).getWord()
											+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("动")) {
									page.append("<div style=\"background:#8CEA00\">"
											+ "<font color=\"black\" size=\"5\">" 
											+ fwa.get(i).getWord()+""+fwa.get(i).getFrequency()
											+"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("形")) {
									page.append("<div style=\"background:#FF9224\">"
											+ "<font color=\"black\" size=\"5\">" 
											+ fwa.get(i).getWord()+""+fwa.get(i).getFrequency() 
											+"</font></div>");
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
		buttonNext= new DetaButton("向后翻页->");
		buttonNext.setBounds(410, 0, 100, 30);
		buttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String, WordFrequency> map = new ConcurrentHashMap<>();
				try {
					currentPage += 1;
					currentPage = (currentPage > (sets == null ? 0 : sets.size()) / 2001 
							? currentPage - 1 : currentPage );
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
									page.append("<div style=\"background:black\">"
											+ "<font color=\"white\">" + fwa.get(i).getWord()
											+""+fwa.get(i).getFrequency() + "</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("名")) {
									page.append( "<div style=\"background:#FF44FF\">"
											+ "<font color=\"white\">" + fwa.get(i).getWord()
											+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("动")) {
									page.append("<div style=\"background:#8CEA00\">"
											+ "<font color=\"black\" size=\"5\">" 
											+ fwa.get(i).getWord()+""+fwa.get(i).getFrequency() 
											+"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("形")) {
									page.append("<div style=\"background:#FF9224\">"
											+ "<font color=\"black\" size=\"5\">" 
											+ fwa.get(i).getWord()+""+fwa.get(i).getFrequency() 
											+"</font></div>");
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
				List<String> setsForGet = sets.subList(currentPage * 2000
						, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
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

		readChinese= new ReadChinese(u, _A);
		buttonCTV= new DetaButton("语音阅读关");
		buttonCTV.setBounds(740, 0, 100, 30);
		buttonCTV.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(sets== null) {
					return;
				}
				//				List<String> setsForGet = sets.subList(currentPage * 2000
				//, (currentPage + 1)*2000<sets.size()
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
		buttonBox.setBounds(5 + 800-650, 290 + 100 - 80 + 200-260, 950, 20);
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
		dic_lcbx =d.mapToMap_lcbx(dic_map);
		dic_lcyy =d.mapToMap_lcyy(dic_map);
		dic_zhfx =d.mapToMap_zhfx(dic_map);
		dic_zhjb =d.mapToMap_zhjb(dic_map);
		tableData_old = new Object[dic_map.size()][9];
		Iterator<String> iter = dic_map.keySet().iterator();
		copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++) {
			tableData_old[i]= new Object[]{""+(i+1),""
					+0,copy.get(i).trim().replace("〔","").replace("〕",":"),
					dic_map.get(copy.get(i)).toString()
					.replaceAll("\\s*", "").replace("〔","").replace("〕",":") , 
					dic_gn.get(copy.get(i)).toString(),
					dic_lcbx.get(copy.get(i)).toString(),
					dic_zhfx.get(copy.get(i)).toString(), 
					dic_lcyy.get(copy.get(i)).toString(), 
					dic_zhjb.get(copy.get(i)).toString()};
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
		table.getColumnModel().getColumn(2).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(3).setPreferredWidth(80+521);
		table.getColumnModel().getColumn(4).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(5).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(6).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(7).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(8).setPreferredWidth(80+130);
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
			List<String> setsForGet = sets.subList(currentPage*2000
					, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
			Iterator<String> iterator = setsForGet.iterator();
			Here:
				while(iterator.hasNext()) {
					String setOfi = iterator.next();
					if(pos.get(setOfi) == null) {
						page.append("<span style=\"background:#F1F1F1\">"
								+ "<font color=\"black\" size=\"5\">" + setOfi 
								+ "</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")
							||pos.get(setOfi).contains("形")) {
						if (map.containsKey(setOfi)) {
							WordFrequency wordFrequency = map.get(setOfi);
							wordFrequency.I_Frequency(wordFrequency.getFrequency() 
									+ StablePOS.INT_ONE);
							map.put(setOfi, wordFrequency);
						} else {
							WordFrequency wordFrequency = new WordFrequency();
							wordFrequency.I_Frequency(StablePOS.INT_ONE);
							wordFrequency.I_Word(setOfi);
							map.put(setOfi, wordFrequency);
						}
					}
					if (!setOfi.equals("")) {
						if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")
								||pos.get(setOfi).contains("动")
								||pos.get(setOfi).contains("形"))) {
							page.append("<span style=\"background:red\"><font color=\"white\">"
									+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("名")) {
							page.append("<span style=\"background:"
									+new PEU.P.image.Color_P().P(255, 245, 255)
									+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("动")) {
							page.append("<span style=\"background:"
									+new PEU.P.image.Color_P().P(245, 255, 245)
									+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("形")) {
							page.append("<span style=\"background:"
									+new PEU.P.image.Color_P().P(255, 255, 245)
									+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("副")) {
							page.append("<span style=\"background:#F1FFFF\">"
									+ "<font color=\"black\" size=\"5\">"+setOfi
									+"</font></span>");
							continue Here;
						} 
						page.append("<span style=\"background:white\">"
								+ "<font color=\"black\" size=\"5\">"+setOfi+"</font></span>");			 
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
							page.append("<div style=\"background:black\">"
									+ "<font color=\"white\">" + fwa.get(i).getWord()+""
									+fwa.get(i).getFrequency() + "</font></div>");
							continue Here;
						}
						if(pos.get(fwa.get(i).getWord()).contains("名")) {
							page.append( "<div style=\"background:#FF44FF\">"
									+ "<font color=\"white\">" + fwa.get(i).getWord()+""
									+fwa.get(i).getFrequency() +"</font></div>");
							continue Here;
						}
						if(pos.get(fwa.get(i).getWord()).contains("动")) {
							page.append("<div style=\"background:#8CEA00\">"
									+ "<font color=\"black\" size=\"5\">" + fwa.get(i).getWord()
									+""+fwa.get(i).getFrequency() +"</font></div>");
							continue Here;
						}
						if(pos.get(fwa.get(i).getWord()).contains("形")) {
							page.append("<div style=\"background:#FF9224\">"
									+ "<font color=\"black\" size=\"5\">" + fwa.get(i).getWord()
									+""+fwa.get(i).getFrequency() +"</font></div>");
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

	@Override
	public void keyReleased(KeyEvent arg0) {
		String[] score=new String[copy.size()];
		int[] score_code=new int[copy.size()];
		int count= AppSearch.detaSearch(score_code, score, newTableModel, tableData_old, copy, key
				, dic_map, pos, this.u, false);
		if(-1== count) {
			return;
		}
		new Quick9DLYGWithString_ESU().sort(score_code, score);
		Object[][] tableData = new Object[count][13];
		int new_count=0;
		newTableModel.getDataVector().clear();
		Here:
			for(int i = copy.size()-1; i > -1; i--) {
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
				tableData[new_count]= new Object[]{new_count+1,score_code[i]
						,score[i].replace("〔","").replace("〕",":"),
						dic_map.get(score[i]).toString().replace("〔","").replace("〕",":"),
						dic_gn.get(score[i]).toString().replaceAll("\\s*", "") ,
						dic_lcbx.get(score[i]).toString().replaceAll("\\s*", "") ,
						dic_zhfx.get(score[i]).toString().replaceAll("\\s*", "") , 
						dic_lcyy.get(score[i]).toString().replaceAll("\\s*", ""), 
						dic_zhjb.get(score[i]).toString().replaceAll("\\s*", "")};   
				newTableModel.insertRow(new_count, tableData[new_count]);
				new_count+=1;
			}	
		newTableModel.fireTableDataChanged();	
	}
    
	//把德塔精度搜索的函数进行函数片段化去重，移到AppSearch文件中
	//罗瑶光 202110121
	
	@Override
	public void keyTyped(KeyEvent arg0) {
	}
}