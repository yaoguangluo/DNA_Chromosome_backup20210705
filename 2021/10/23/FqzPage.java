package ME.APM.VSQ.zhongYiFuChan;
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
import java.util.HashMap;
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
//import OSV.VCQ.standard.DictionaryStandardDB;
//import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
public class FqzPage extends Container implements MouseListener, KeyListener{
	private static final long serialVersionUID = 1L;
	public String key;
	public JTextPane data ;
	public JTextPane statistic ;
	public DetaButton buttonPrev;
	public DetaButton buttonNext;
	public DetaButton buttonSum;
	public DetaButton buttonCrt;
	public int currentPage;
	public List<String> sets;
	public JTextField name;
	public javax.swing.JTable table;  
	public Object[][] tableData_old;
	public DefaultTableModel newTableModel = null;
	public List<String> copy;
	public List<String> dic_list;
	public Map<String, Object> dic_map;
	public Object[] columnTitle = {"ID", "????", "????", "????????"};
	public CogsBinaryForest_AE _A;  	
	public Map<String, String> pos;
	public DetaButton buttonCTE;
	public DetaButton buttonFRS;
	public DetaButton buttonETC;
	public Map<String, String> pose;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public JTextPane text ;
	public JTabbedPane jTabbedpane;
	private App u;
	private ReadChinese readChinese;
	private DetaButton buttonCTV;
	protected int row;
	//private DetaButton buttonZYSZ;
	public FqzPage(JTextPane text, CogsBinaryForest_AE _A, Map<String, String> pos, Map<String, String> pose
			, Map<String, String> etc, Map<String, String> cte, JTabbedPane jTabbedpane, App u) throws IOException{
		this.text = text;	this.pose = pose;
		this.etc = etc;
		this.cte = cte;
		this._A = _A;
		this.pos = pos;
		this.jTabbedpane= jTabbedpane;
		this.u= u;
		this.setLayout(null);
		this.setBounds(0, 0, 1490, 980);	
		JScrollPane jsp_name = new JScrollPane(this.name());
		jsp_name.setBounds(100, 15, 680, 50);
		JScrollPane jsp_data = new JScrollPane(this.data());
		JScrollPane jsp_statistic = new JScrollPane(this.statistic());
		jsp_statistic.setBounds(5, 290 + 100 - 80 + 200-260, 1440 - 650 - 645, 500-166+90-44);
		jsp_data.setBounds(5 + 800-650, 290 + 100 - 80 + 200-260+26, 1440-800+650-130, 500-166+90-70);
		JLabel jlabel = new JLabel("????????:");  
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

		buttonSum = new DetaButton("???? " + (sets==null?0:(1 + sets.size() / 2001))+ " ??");
		buttonSum.setBounds(0, 0, 100, 30);
		buttonCrt = new DetaButton("??????????" + (currentPage + 1));
		buttonCrt.setBounds(120, 0, 150, 30);

		buttonPrev= new DetaButton("<-????????");
		buttonPrev.setBounds(290, 0, 100, 30);
		buttonPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String, WordFrequency> map = new ConcurrentHashMap<>();
				try {
					currentPage-=1;
					currentPage = (currentPage< 0 ? 0 : currentPage );
					StringBuilder page = new StringBuilder().append("");
					AppButtonUtil.page????(page, map, key, pos, sets, currentPage);
					buttonCrt.setText("??????????" + (currentPage + 1));
					data.setText(page.toString());
					data.setSelectionStart(0);
					data.setSelectionEnd(0);
					data.validate();
				}catch(Exception e1){	
					data.validate();
					jTabbedpane.invalidate();
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
									page.append("<div style=\"background:black\"><font color=\"white\">" 
								+ fwa.get(i).getWord()+""+fwa.get(i).getFrequency() + "</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("??")) {
									page.append( "<div style=\"background:#FF44FF\"><font color=\"white\">" 
								+ fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("??")) {
									page.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" 
								+ fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("??")) {
									page.append("<div style=\"background:#FF9224\"><font color=\"black\" size=\"5\">" 
								+ fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
								}
							}
						}	
					statistic.setText(page.toString());
					statistic.setSelectionStart(0);
					statistic.setSelectionEnd(0);
					statistic.validate();
				}catch(Exception e1){	
					statistic.validate();
					jTabbedpane.invalidate();
				}          
			}
		});
		buttonNext= new DetaButton("????????->");
		buttonNext.setBounds(410, 0, 100, 30);
		buttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String, WordFrequency> map = new ConcurrentHashMap<>();
				try {
					currentPage+=1;
					currentPage = (currentPage > (sets == null ? 0 : sets.size()) / 2001 ? currentPage - 1 : currentPage );
					StringBuilder page = new StringBuilder().append("");
					AppButtonUtil.page????(page, map, key, pos, sets, currentPage);
					buttonCrt.setText("??????????" + (currentPage + 1));
					data.setText(page.toString());
					data.setSelectionStart(0);
					data.setSelectionEnd(0);
					data.validate();
				}catch(Exception e1){	
					data.validate();
					jTabbedpane.invalidate();
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
									page.append("<div style=\"background:black\"><font color=\"white\">" 
								+ fwa.get(i).getWord()+""+fwa.get(i).getFrequency() + "</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("??")) {
									page.append( "<div style=\"background:#FF44FF\"><font color=\"white\">" 
								+ fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("??")) {
									page.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" 
								+ fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("??")) {
									page.append("<div style=\"background:#FF9224\"><font color=\"black\" size=\"5\">"
								+ fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
								}
							}
						}	
					statistic.setText(page.toString());
					statistic.setSelectionStart(0);
					statistic.setSelectionEnd(0);
					statistic.validate();
				}catch(Exception e1){	
					statistic.validate();
					jTabbedpane.invalidate();
				}  
			}
		});
		buttonCTE = new DetaButton("????????");
		buttonCTE.setBounds(630, 0, 100, 30);
		buttonCTE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(sets==null) {
				return;
			}
			StringBuilder page = new StringBuilder().append("");
			AppButtonUtil.page????????(page, cte, key, pos, sets, currentPage);
			buttonCrt.setText("??????????" + (currentPage + 1));
			data.setText(page.toString());
			data.setSelectionStart(0);
			data.setSelectionEnd(0);
			data.validate();
			}
		});

		buttonFRS = new DetaButton("????????");
		buttonFRS.setBounds(520, 0, 100, 30);
		buttonFRS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(sets==null) {
				return;
			}
			StringBuilder page = new StringBuilder().append("");
			AppButtonUtil.page????????(page, key, pos, sets, currentPage);
			buttonCrt.setText("??????????" + (currentPage + 1));
			data.setText(page.toString());
			data.setSelectionStart(0);
			data.setSelectionEnd(0);
			data.validate();
			}
		});

		buttonETC = new DetaButton("????????");
		buttonETC.setBounds(740, 0, 100, 30);
		buttonETC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(sets==null) {
				return;
			}
			StringBuilder page = new StringBuilder().append("");
			AppButtonUtil.page????????( page,  cte,  etc, key, pos, sets,currentPage);
			buttonCrt.setText("??????????" + (currentPage + 1));
			data.setText(page.toString());
			data.setSelectionStart(0);
			data.setSelectionEnd(0);
			data.validate();
			}
		});
		DetaButton buttonADD = new DetaButton("????????????");
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
				List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()
						? (currentPage + 1)*2000 : sets.size());
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
		DetaButton buttonKSLJ= new DetaButton("????DNN");
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
						, buttonSum, buttonCrt, data, statistic, "????");
			}
		});

		readChinese= new ReadChinese(u, _A);
		buttonCTV= new DetaButton("??????????");
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
					buttonCTV.setLabel("??????????");
					readChinese= new ReadChinese(u, _A);
					readChinese.I_PreReadList(sets);
					readChinese.start();
				}else {
					buttonCTV.setLabel("??????????");
					readChinese.finish= 0;
					readChinese.I_NullSap();
					readChinese.stop();
				}
			}
		});

		//		//??????????URLencoder??????????????????@????@??????????????????????TIN god??????
		//				buttonZYSZ= new DetaButton("????????????");
		//				buttonZYSZ.setBounds(740, 0, 100, 30);
		//				buttonZYSZ.addActionListener(new ActionListener() {
		//					public void actionPerformed(ActionEvent e) {
		//						boolean mod= true;
		//						for(int i= 0; i< table.getRowCount(); i++){
		//							try {
		//								Thread.sleep(150);
		//							} catch (InterruptedException e2) {
		//								// TODO Auto-generated catch block
		//								e2.printStackTrace();
		//							}
		//							String plsql= "setRoot:C:/DetaDB1;";
		//							plsql+= "baseName:ZYY;"; 
		//							plsql+= "tableName:zysz:insert;" +
		//									"culumnValue:ID:"+ table.getValueAt(i, 0).toString().replace(":", "@Tin@")+ ";"+ 
		//									"culumnValue:????:"+ table.getValueAt(i, 1).toString().replace(":", "@Tin@")+ ";"+ 
		//									"culumnValue:????:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 2).toString().replace(":", "@Tin@"))+ ";"+ 
		//									"culumnValue:????:"+ new FullDNATokenPDI().initonSect(table.getValueAt(i, 3).toString().replace(":", "@Tin@"))+ ";";
		//							try {
		//								OSI.OPE.ME.SM.OP.SM.AOP.MEC.SIQ.imp.E_PLSQLImp.E_PLSQL(plsql, mod);
		//							}catch(Exception e1) {
		//								e1.printStackTrace();
		//							}
		//						}}
		//				});


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
		//buttonBox.add(buttonZYSZ);
		buttonBox.setBounds(5 + 800-650, 290 + 100 - 80 + 200-260, 1150, 20);
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

	@SuppressWarnings({"serial", "unused" })
	public javax.swing.JTable jTable() throws IOException {  
		//		Dictionary d = new Dictionary();
		//		dic_list = d.txtToListName();
		//		dic_map = d.listNameToMap(dic_list);//.listNameToMap(dic_list);


		//????????????????????????.
		//		DictionaryStandardDB d= new DictionaryStandardDB();
		//		String primaryKey= "????";
		//		String tabKey= "zysz";
		//		//???????? uniq forenkey??.
		//		Map<String, Map<String, Object>> map= d.dbToMap(primaryKey, tabKey);
		//		Map<String, Object> dic_bing_ming= map.get("????");
		//		Map<String, Object> dic_yongyao= map.get("????");
		//		dic_map= map.get("dic_map");

		DictionaryDB d= new DictionaryDB();
		Map<String, Object> dic_bing_ming= new HashMap<>();
		Map<String, Object> dic_yongyao= new HashMap<>();
		dic_map= d.txtToMap(dic_bing_ming, dic_yongyao);

		tableData_old= new Object[dic_map.size()][4];
		Iterator<String> iter = dic_map.keySet().iterator();
		copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0; i<copy.size(); i++) {
			tableData_old[i] = new Object[]{""+(i+1)
					,""+0
					,copy.get(i).trim()
					,dic_yongyao.get(copy.get(i)) };
			//,dic_map.get(copy.get(i)).toString().replaceAll("\\s*", "")};
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
		table.setRowHeight(35);                                        //????????
		JTableHeader header= table.getTableHeader();
		header.setFont(new Font("????", Font.PLAIN, 18));// ????????????
		table.getColumnModel().getColumn(0).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(1).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(2).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(3).setPreferredWidth(80+930);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.addMouseListener(this);
		ColorTableRender tcr= new ColorTableRender();  
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
			row= table.getSelectedRow();
			int col= table.getSelectedColumn();
			String value = (String) table.getValueAt(row, col);
			data.setSize(500, 800);
			sets= _A.parserMixedString(value);//????????		
			data.setContentType("text/html");
			StringBuilder page= new StringBuilder().append("");
			List<String> setsForGet= sets.subList(currentPage*2000, (currentPage+ 1)* 2000< sets.size()
					? (currentPage+ 1)*2000: sets.size());
			Iterator<String> iterator= setsForGet.iterator();
			Here:
				while(iterator.hasNext()) {
					String setOfi = iterator.next();
					if(pos.get(setOfi) == null) {
						page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" 
					+ setOfi + "</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("??")||pos.get(setOfi).contains("??")||pos.get(setOfi).contains("??")) {
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
						if(key.contains(setOfi)&&(pos.get(setOfi).contains("??")||pos.get(setOfi).contains("??")
								||pos.get(setOfi).contains("??"))) {
							page.append("<span style=\"background:red\"><font color=\"white\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("??")) {
							page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 245, 255)
									+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("??")) {
							page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(245, 255, 245)
									+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("??")) {
							page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 255, 245)
									+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("??")) {
							page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"
						+setOfi+"</font></span>");
							continue Here;
						} 
						page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"
						+setOfi+"</font></span>");		 
					}
				}	
			buttonSum.setText("???? " + (sets == null ? 0 : (1 + sets.size() / 2001)) + " ??");
			buttonCrt.setText("??????????" + (sets == null? 0 : 1));
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
							page.append("<div style=\"background:black\"><font color=\"white\">" 
						+ fwa.get(i).getWord()+""+fwa.get(i).getFrequency() + "</font></div>");
							continue Here;
						}
						if(pos.get(fwa.get(i).getWord()).contains("??")) {
							page.append( "<div style=\"background:#FF44FF\"><font color=\"white\">" 
						+ fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
							continue Here;
						}
						if(pos.get(fwa.get(i).getWord()).contains("??")) {
							page.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" 
						+ fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
							continue Here;
						}
						if(pos.get(fwa.get(i).getWord()).contains("??")) {
							page.append("<div style=\"background:#FF9224\"><font color=\"black\" size=\"5\">" 
						+ fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
						}
					}
				}	
			statistic.setText(page.toString());
			statistic.setSelectionStart(0);
			statistic.setSelectionEnd(0);
			statistic.validate();
		}catch(Exception e){	
			statistic.validate();
			jTabbedpane.invalidate();
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
		int count= AppSearch.detaSearch(score_code, score, newTableModel, tableData_old, copy, key
				, dic_map, pos, this.u, false);//??????????OK?? ????????vpcs????????????????????????????????????
		if(-1== count) {
			return;
		}
		new Quick9DLYGWithString_ESU().sort(score_code, score);
		int max = score_code[0];
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
				tableData[new_count]= new Object[]{new_count+1,score_code[i],score[i],
						dic_map.get(score[i]).toString(),
				};   
				newTableModel.insertRow(new_count, tableData[new_count]);
				new_count+=1;
			}	
		newTableModel.fireTableDataChanged();	
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
	}
}