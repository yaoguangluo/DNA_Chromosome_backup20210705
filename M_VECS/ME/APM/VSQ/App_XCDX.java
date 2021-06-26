package ME.APM.VSQ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ESU.string.String_ESU;

import ME.APM.VSQ.yaoCaiTu.YaoCaiIndex;
import SVQ.stable.StableTag;
import MVQ.button.DetaButton;
import MVQ.textfield.CfxTextField;
import MVQ.textpane.CfxTextPane;
import OSI.AOP.neo.tts.ReadChinese;
import OSI.AOP.rest.medicine.RestMedicinePort_E;
//import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI_XCDX;
import PEU.P.map.*;

import java.awt.Color;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.BadLocationException;

import SVQ.stable.StableFile;
public class App_XCDX {	
	public App app;
	public void IV_(App app) {
		this.app= app;
	}
	//
	public JTextField nameFeelFilter() {
		app.nameFeelFilter= new CfxTextField(null, 0, 0, null);  
		app.nameFeelFilter.setBounds(180-50, 50, 380, 80);
		app.nameFeelFilter.setBackground(Color.white);
		app.nameFeelFilter.setText(StableTag.STRING_SPACE);
		app.nameFeelFilter.addKeyListener(app);
		return app.nameFeelFilter;
	}

	public  JPanel panel() throws IOException{
		app.panel_yt= new JPanel();
		app.panel_yt.setBackground(Color.white);
		app.pngy_2_1= new ImageIcon(new YaoCaiIndex().getClass().getResource(StableFile.yc_2_1_png));
		app.yaoCaiLabel= new JLabel(app.pngy_2_1);
		app.panel_yt.add(app.yaoCaiLabel);
		return app.panel_yt;
	}

	public  JTextPane data() throws IOException {
		app.data= new CfxTextPane(StableTag.NEI_RONG, 1350, 2980, null);  
		app.data.setBounds(850, 150, 1350, 2980);	
		app.data.setBackground(Color.white);
		Box buttonBoxLineTwo= new Box(BoxLayout.X_AXIS);  
		//		buttonBoxLineTwo.add(buttonGXB);
		//		buttonBoxLineTwo.add(buttonBCJ);
		buttonBoxLineTwo.setBounds(0, 22, 450, 20);
		//container.add(buttonBox);
		//container.add(buttonBoxLineTwo);
		return app.data; 
	}

	public Box getBox() {	
		app.buttonADD= new DetaButton(StableTag.TIAN_JIA_DAO_BIAN_JI_YE, 100, 50, Color.red);
		app.buttonADD.setBounds(295-15, 0, 135, 30);
		app.buttonADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(app.sets== null) {
					return;
				}
				if(app.text.getText().length()>5000) {
					return;
				}
				StringBuilder page= new StringBuilder();
				List<String> setsForGet= app.sets;
				Iterator<String> iterator= setsForGet.iterator();
				while(iterator.hasNext()) {
					String setOfi= iterator.next();
					page.append(setOfi); 
				}
				if(!app.text.getText().isEmpty()) {
					app.text.setText(app.text.getText() +"\r\n\r\n"+ page.toString());
				}else {
					app.text.setText(page.toString());
				}
				app.text.validate();
			}
		});
		app.buttonCTE= new DetaButton("英文注释", 100, 50, Color.orange);
		app.buttonCTE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(app.sets== null) {
					return;
				}
				StringBuilder page= new StringBuilder();
				List<String> setsForGet = app.sets;
				Iterator<String> iterator = setsForGet.iterator();
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(app.pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi 
									+(app.cte.containsKey(setOfi)?":("+app.cte.get(setOfi)+")":StableTag.STRING_EMPTY) + "</font></span>");
							continue Here;
						}
						if (!setOfi.equals(StableTag.STRING_EMPTY)) {
							if(app.key.contains(setOfi)&&(app.pos.get(setOfi).contains(StableTag.ZI_MING)||app.pos.get(setOfi)
									.contains(StableTag.ZI_DONG)||app.pos.get(setOfi).contains(StableTag.ZI_XING))) {
								page.append("<span style=\"background:red\"><font color=\"white\" size=\"5\">" + setOfi 
										+(app.posFullce.containsKey(setOfi)?":("+app.posFullce.get(setOfi)+")":StableTag.STRING_EMPTY) + "</font></span>");
								continue Here;
							}
							if(app.pos.get(setOfi).contains(StableTag.ZI_MING)) {
								page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 245, 255)
										+ "\"><font color=\"black\" size=\"5\">"+ "<A href=\"http://localhost:8000/search?word="+ setOfi+"\">"
										+ setOfi+ "</A>" + (app.posFullce.containsKey(setOfi)?":("+app.posFullce.get(setOfi)
										+")":StableTag.STRING_EMPTY)+ "</font></span>");
								continue Here;
							}
							if(app.pos.get(setOfi).contains(StableTag.ZI_DONG)) {
								page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(245, 255, 245)
										+"\"><font color=\"black\" size=\"5\">" + setOfi +(app.posFullce.containsKey(setOfi)?":("
												+app.posFullce.get(setOfi)+")":StableTag.STRING_EMPTY) + "</font></span>");
								continue Here;
							}
							if(app.pos.get(setOfi).contains(StableTag.ZI_XING)) {
								page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 255, 245)
										+"\"><font color=\"black\" size=\"5\">" + setOfi +(app.posFullce.containsKey(setOfi)?":("
												+app.posFullce.get(setOfi)+")":StableTag.STRING_EMPTY) + "</font></span>");
								continue Here;
							}
							if(app.pos.get(setOfi).contains(StableTag.ZI_FU)) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">" + setOfi 
										+(app.posFullce.containsKey(setOfi)?":("+app.posFullce.get(setOfi)+")":StableTag.STRING_EMPTY) 
										+ "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">" + setOfi 
									+(app.posFullce.containsKey(setOfi)?":("+app.posFullce.get(setOfi)+")":StableTag.STRING_EMPTY) + "</font></span>");			 
						}}
				app.data.setText(page.toString());
				app.data.addHyperlinkListener(new HyperlinkListener(){
					@SuppressWarnings({ "hiding", "deprecation" })
					@Override
					public void hyperlinkUpdate(HyperlinkEvent e) {
						//.........
						//本函数的hyperlinkUpdate 格式 查阅了https://blog.csdn.net/nullpointer2008/article/details/7998986 文章。
						//20200323 罗瑶光修改
						//版权声明：本文为CSDN博主「空指针1996」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
						//原文链接：https://blog.csdn.net/nullpointer2008/article/details/7998986);
						//.........
						if (e.getEventType()!= HyperlinkEvent.EventType.ACTIVATED) 
							return;
						URL linkUrl= e.getURL();
						String string; 
						System.out.println(linkUrl.getFile());
						try {
							string= String_ESU.charsetSwap(linkUrl.getFile().toString(), "GBK", "GBK");
							String[] value= string.split("=");
							if(value.length> 1) {
								VtoV.ObjectToJsonString(RestMedicinePort_E.doSearch(app.appInstance, value[1]));
							}
						} catch (UnsupportedEncodingException e2) {
							e2.printStackTrace();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						//弹窗
						//1 得到文字
						//2 文字标注解释字符串
						//3 生成frame
						if(null== app.frameTag) {
							app.tagSearch= new TagSearch();
							app.tagSearch.IV_(app.name);
							app.tagSearch.setBounds(0, 0, 435, 355);
							app.tagSearch.setVisible(true);
							app.tagSearch.show();
							app.frameTag= new JFrame("提示栏");
							//frame.setLayout(null);
							app.frameTag.setSize(430, 350);
							//摘自第37行 https://blog.csdn.net/code_better/article/details/53505962
							Point point= java.awt.MouseInfo.getPointerInfo().getLocation();
							//
							app.frameTag.setLocation(point.x, point.y);
							app.frameTag.setResizable(false);
							app.frameTag.add(app.tagSearch);
							app.frameTag.setVisible(true);
							app.frameTag.show();
							app.frameTag.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
						}else {
							Point point= java.awt.MouseInfo.getPointerInfo().getLocation();
							app.frameTag.setLocation(point.x, point.y);
							app.frameTag.setVisible(true);
							app.frameTag.show();
						}
					}
				});
				app.data.setEditable(false);
				app.data.setSelectionStart(0);
				app.data.setSelectionEnd(0);
				app.data.validate();
			}
		});

		app.buttonFRS= new DetaButton("中文词还原", 100, 50, Color.green);
		app.buttonFRS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(app.sets== null) {
					return;
				}
				StringBuilder page= new StringBuilder();
				List<String> setsForGet= app.sets;
				Iterator<String> iterator= setsForGet.iterator();
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(app.pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
							continue Here;
						}
						if (!setOfi.equals(StableTag.STRING_EMPTY)) {
							if(app.key.contains(setOfi)&&(app.pos.get(setOfi).contains(StableTag.ZI_MING)||app.pos.get(setOfi)
									.contains(StableTag.ZI_DONG)||app.pos.get(setOfi).contains(StableTag.ZI_XING))) {
								page.append("<span style=\"background:red\"><font color=\"white\">"+setOfi +"</font></span>");
								continue Here;
							}
							if(app.pos.get(setOfi).contains(StableTag.ZI_MING)) {
								page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 245, 255)
										+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(app.pos.get(setOfi).contains(StableTag.ZI_DONG)) {
								page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(245, 255, 245)
										+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(app.pos.get(setOfi).contains(StableTag.ZI_XING)) {
								page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 255, 245)
										+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(app.pos.get(setOfi).contains(StableTag.ZI_FU)) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");			 
						}
					}	
				app.data.setText(page.toString());
				app.data.setSelectionStart(0);
				app.data.setSelectionEnd(0);
				app.data.validate();
			}
		});

		app.buttonETC= new DetaButton("同义词描述", 100, 50, Color.pink);
		//buttonETC.setBounds(200-15, 0, 88, 30);
		app.buttonETC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(app.sets== null) {
					return;
				}
				StringBuilder page= new StringBuilder();
				List<String> setsForGet = app.sets;
				Iterator<String> iterator = setsForGet.iterator();
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(app.pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi
									+(app.cte.containsKey(setOfi)?(app.etc.containsKey(app.cte.get(setOfi))?":("+app.etc.get(app.cte.get(setOfi))
									+")" : StableTag.STRING_EMPTY) : StableTag.STRING_EMPTY) + "</font></span>");
							continue Here;
						}
						if (!setOfi.equals(StableTag.STRING_EMPTY)) {
							if(app.key.contains(setOfi)&&(app.pos.get(setOfi).contains(StableTag.ZI_MING)
									||app.pos.get(setOfi).contains(StableTag.ZI_DONG)||app.pos.get(setOfi).contains(StableTag.ZI_XING))) {
								page.append("<span style=\"background:red\"><font color=\"white\">"+ setOfi 
										+(app.cte.containsKey(setOfi)?(app.etc.containsKey(app.cte.get(setOfi))?":("+app.etc.get(app.cte.get(setOfi))
										+")" : StableTag.STRING_EMPTY) : StableTag.STRING_EMPTY) +  "</font></span>");
								continue Here;
							}
							if(app.pos.get(setOfi).contains(StableTag.ZI_MING)) {
								page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 245, 255)
										+"\"><font color=\"black\" size=\"5\">" + setOfi +(app.cte.containsKey(setOfi)
												?(app.etc.containsKey(app.cte.get(setOfi))?":("+app.etc.get(app.cte.get(setOfi))+")" 
														: StableTag.STRING_EMPTY) : StableTag.STRING_EMPTY) + "</font></span>");
								continue Here;
							}
							if(app.pos.get(setOfi).contains(StableTag.ZI_DONG)) {
								page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(245, 255, 245)
										+"\"><font color=\"black\" size=\"5\">"+ setOfi +(app.cte.containsKey(setOfi)
												?(app.etc.containsKey(app.cte.get(setOfi))?":("+app.etc.get(app.cte.get(setOfi))+")" 
														: StableTag.STRING_EMPTY) : StableTag.STRING_EMPTY) + "</font></span>");
								continue Here;
							}
							if(app.pos.get(setOfi).contains(StableTag.ZI_XING)) {
								page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 255, 245)
										+"\"><font color=\"black\" size=\"5\">" + setOfi +(app.cte.containsKey(setOfi)
												?(app.etc.containsKey(app.cte.get(setOfi))?":("+app.etc.get(app.cte.get(setOfi))+")" 
														: StableTag.STRING_EMPTY) : StableTag.STRING_EMPTY) + "</font></span>");
								continue Here;
							}
							if(app.pos.get(setOfi).contains(StableTag.ZI_FU)) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">" 
										+ setOfi +(app.cte.containsKey(setOfi)?(app.etc.containsKey(app.cte.get(setOfi))?":("+app.etc.get(app.cte.get(setOfi))+")" 
												: StableTag.STRING_EMPTY) : StableTag.STRING_EMPTY) +  "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+ setOfi 
									+(app.cte.containsKey(setOfi)?(app.etc.containsKey(app.cte.get(setOfi))?":("+app.etc.get(app.cte.get(setOfi))+")"
											: StableTag.STRING_EMPTY) : StableTag.STRING_EMPTY) +  "</font></span>");			 
						}
					}	
				app.data.setText(page.toString());
				app.data.setSelectionStart(0);
				app.data.setSelectionEnd(0);
				app.data.validate();
			}
		});

		app.buttonGXB= new JButton("更新到表格");
		app.buttonETC.setBounds(200 - 15, 0, 88, 30);
		app.buttonGXB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(app.sets== null) {
					return;
				}
				String temp = null;
				try {
					temp = app.data.getDocument().getText(0, app.data.getDocument().getLength());
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				app.table.setValueAt(temp, app.row, app.col);
				System.out.println(temp);
			}
		});

		app.buttonBCJ= new JButton("导出新篇本草全集");
		//buttonETC.setBounds(200 - 15, 0, 88, 30);
		app.buttonBCJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//				FileWriter fw = null;
				//				try {
				//					fw= new FileWriter("C:/Users/Administrator/Desktop/养疗金项目/bcqj.txt", true);
				//					for(int i=0;i<table.getRowCount();i++){
				//						fw.write("摘要");
				//						for(int j=0;j<table.getColumnCount();j++){
				//							fw.write("\r\n");
				//							fw.write("["+table.getColumnName(j)+"]");
				//							if(app.table.getValueAt(i, j)!=null) {
				//								if(j==3) {
				//									fw.write(app.table.getValueAt(i, j).toString().replaceAll("\\[()\\]", StableDataSrc.STRING_EMPTY));
				//								}else {
				//									fw.write(app.table.getValueAt(i, j).toString());
				//								}
				//							}
				//							fw.write("\r\n");
				//						}
				//					}
				//					fw.write("\r\n");
				//					fw.write("摘要");
				//					fw.close();
				//				} catch (IOException e1) {
				//					// TODO Auto-generated catch block
				//					e1.printStackTrace();
				//				}	
				//一行一行的插入
				boolean mod= true;
				for(int i= 0; i< app.table.getRowCount(); i++){
					//元基编码加密： 我注释下,这里的biky是梁壁荧的网名.去年准备追她,大丈夫追女人肯定不是砸钱刷人气来追吧
					//于是我就自学琴棋书画, 代码我就写点求婚礼物, 我一直很努力
					//,每次都是提高自己来吸引她的注意..从没有和别的女人乱搞,一下就10个月,就换来10个微笑...后来,人家还是觉得我配不上,那就算了.
					//又多一个妹妹.无所谓.哈哈
					String plsql= "setRoot:C:/DetaDB1;";
					plsql+= "baseName:ZYY;"; 
					plsql+= "tableName:zybc:insert;" +
							"culumnValue:ID:"+ app.table.getValueAt(i, 0).toString().replace(":", "@biky@")+ ";" + 
							"culumnValue:打分:"+ app.table.getValueAt(i, 1).toString().replace(":", "@biky@")+ ";" + 
							"culumnValue:中药名称:"+ app.table.getValueAt(i, 2).toString().replace(":", "@biky@")+ ";" + 
							"culumnValue:笔记原文:"+ new FullDNATokenPDI_XCDX().initonSect(app.table.getValueAt(i, 3).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:功效:"+ new FullDNATokenPDI_XCDX().initonSect(app.table.getValueAt(i, 4).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:风险规避:"+ new FullDNATokenPDI_XCDX().initonSect(app.table.getValueAt(i, 5).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:用量:"+ new FullDNATokenPDI_XCDX().initonSect(app.table.getValueAt(i, 6).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:性味:"+ new FullDNATokenPDI_XCDX().initonSect(app.table.getValueAt(i, 7).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:经脉:"+ new FullDNATokenPDI_XCDX().initonSect(app.table.getValueAt(i, 8).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:中医馆药理:"+ new FullDNATokenPDI_XCDX().initonSect(app.table.getValueAt(i, 9).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:经解:"+ new FullDNATokenPDI_XCDX().initonSect(app.table.getValueAt(i, 10).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:崇源:"+ new FullDNATokenPDI_XCDX().initonSect(app.table.getValueAt(i, 11).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:愚按:"+ new FullDNATokenPDI_XCDX().initonSect(app.table.getValueAt(i, 12).toString().replace(":", "@biky@"))+ ";" + 
							"culumnValue:搭配:"+ new FullDNATokenPDI_XCDX().initonSect(app.table.getValueAt(i, 13).toString().replace(":", "@biky@"))+ ";" +  
							"culumnValue:常见药:"+ new FullDNATokenPDI_XCDX().initonSect(app.table.getValueAt(i, 14).toString().replace(":", "@biky@"))+ ";";
					try {
						ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E.E_PLSQL(plsql, mod);
					}catch(Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});

		app.readChinese= new ReadChinese(app.appInstance, app._A);
		app.buttonCTV= new DetaButton("语音阅读关");
		app.buttonCTV.setBounds(740, 0, 100, 30);
		app.buttonCTV.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(app.sets== null) {
					return;
				}
				//				if(appConfig.SectionJPanel.jlabel_end_boxs.isSelected()) {
				//					return;
				//				}
				//				List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()
				//						? (currentPage + 1)*2000: sets.size());
				if(!app.readChinese.isAlive()) {
					app.buttonCTV.setLabel("语音阅读开");
					app.readChinese= new ReadChinese(app.appInstance, app._A);
					app.readChinese.I_PreReadList(app.sets);
					app.readChinese.start();
				}else {
					app.buttonCTV.setLabel("语音阅读关");
					app.readChinese.finish= 0;
					app.readChinese.I_NullSap();
					app.readChinese.stop();
				}
			}
		});


		Box buttonBox= new Box(BoxLayout.X_AXIS);
		buttonBox.add(app.buttonCTE);
		buttonBox.add(app.buttonFRS);
		buttonBox.add(app.buttonCTV);
		//buttonBox.add(buttonETC);
		//buttonBox.add(buttonBCJ);
		buttonBox.add(app.buttonADD);
		buttonBox.setBounds(0, 0, 445, 20);

		//Box buttonBoxLineTwo= new Box(BoxLayout.X_AXIS);  
		//buttonBoxLineTwo.add(buttonGXB);
		//buttonBoxLineTwo.add(buttonBCJ);
		//buttonBoxLineTwo.setBounds(0, 22, 450, 20);
		//container.add(buttonBoxLineTwo);
		return buttonBox;
	} 

	public JTextField name() throws IOException {
		app.name= new CfxTextField(null, 0, 0, null);  
		app.name.setBounds(180- 50, 50, 380, 80);
		app.name.setBackground(Color.white);
		app.name.setText(StableTag.STRING_SPACE);
		app.name.addKeyListener(app);
		return app.name;
	}	

	public JTextField nameHospital() throws IOException {
		app.nameHospital= new CfxTextField(null, 0, 0, null);  
		app.nameHospital.setBounds(180-50, 50, 380, 80);
		app.nameHospital.setBackground(Color.white);
		app.nameHospital.setText(StableTag.STRING_SPACE);
		app.nameHospital.addKeyListener(app);
		return app.nameHospital;
	}	

	public JTextField name_filter() throws IOException {
		app.name_filter= new CfxTextField(null, 0, 0, null);  
		app.name_filter.setBounds(180-50, 50, 380, 80);
		app.name_filter.setBackground(Color.white);
		app.name_filter.setText(StableTag.STRING_SPACE);
		app.name_filter.addKeyListener(app);
		return app.name_filter;
	}	

	public JTextField name_filter_not_have() throws IOException {
		app.name_filter_not_have= new CfxTextField(null, 0, 0, null);  
		app.name_filter_not_have.setBounds(180-50, 50, 380, 80);
		app.name_filter_not_have.setBackground(Color.white);
		app.name_filter_not_have.setText(StableTag.STRING_SPACE);
		app.name_filter_not_have.addKeyListener(app);
		return app.name_filter_not_have;
	}	
}