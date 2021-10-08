package OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

import ME.APM.VSQ.DetaBuy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
//import ME.APM.VSQ.DetaBuy;
import MVQ.button.DetaButton;
import MVQ.filenameFilter.TXTFilter;
import OSI.OPE.MSI.OEI.SOI.SMQ.save.SaveAnd_U_File;
import OSI.OPE.MSI.OEI.SOI.SMQ.save.SaveAs_I_File;
import OSI.OPE.MSQ.OVU.PQE.nodeInfo.NodeInfo;
import OSI.OPE.MSQ.OVU.PQE.nodeProject.NodeProject;
import SVQ.stable.StableAnnotation;
import OSI.OPE.OEI.PVI.SOI.SMQ.load.LoadFile;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.NodeOSGI;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;
import OSI.OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornJSplitPane;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.U_RelatedLineVPS;
import OSI.OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroCell;
public class GUISample_XCDX_CreateMap {	
	public void CreatMap(GUISample gUISample) throws IOException {
		gUISample.w= 1446- 130;
		gUISample.h= 820- 110-70;
		gUISample.updateRelatedLine= new U_RelatedLineVPS();
		gUISample.getContentPane().setLayout(null);
		UIManager.put("SplitPaneUI"
				, "OSI.OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornSplitPaneUI");
		UIManager.put("ScrollBarUI"
				, "OSI.OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornScrollBarUI");
		UIManager.put("TreeUI", "OSI.OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornTreeUI");
		gUISample.currentNodeName= new String("");
		gUISample.first= new LinkList();
		
		gUISample.popupMenu= new PopupMenu();
		gUISample.menuItem= new MenuItem();
		gUISample.menuItem.setLabel("add");
		gUISample.popupMenu.add(gUISample.menuItem);
		
		gUISample.nodeInfo= new NodeInfo();
		gUISample.nodeView= new NodeShow(gUISample, gUISample.tableData_old
				, gUISample.text, gUISample.popupMenu, gUISample.u, gUISample._A
				, gUISample.pos);
		gUISample.nodeView.tree.setBackground(Color.white);
		gUISample.nodeView.setBounds(10, 168, 137, 222);
		gUISample.nodeProject= new NodeProject();
		gUISample.nodeProject.setBounds(10, 38, 137, 124);	
		gUISample.mainSplitPane = new UnicornJSplitPane();
		gUISample.mainSplitPane.setAutoscrolls(true);
		//mainSplitPane.setEnabled(false);//
		gUISample.mainSplitPane.setBounds(10, 50, gUISample.w-20, gUISample.h-80);
		gUISample.mainSplitPane.setVisible(true);
		gUISample.getContentPane().add(gUISample.mainSplitPane);
		gUISample.leftSplitPane= new UnicornJSplitPane();
		gUISample.leftSplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		gUISample.mainSplitPane.setLeftComponent(gUISample.leftSplitPane);
		gUISample.leftSplitPane.setLeftComponent(gUISample.nodeProject);
		gUISample.leftSplitPane.setRightComponent(gUISample.nodeView);
		gUISample.rightSplitPane= new UnicornJSplitPane();
		gUISample.rightSplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		gUISample.mainSplitPane.setRightComponent(gUISample.rightSplitPane);
		gUISample.righttopSplitPane= new UnicornJSplitPane();
		gUISample.rightSplitPane.setLeftComponent(gUISample.righttopSplitPane);
		gUISample.rightBotJTextPane= new JTextPane();
		gUISample.rightBotJTextPane.setText("��ã���~");
		gUISample.nodeMenu= new PopupMenu();
		gUISample.canvas= new ThisCanvas(gUISample.threadApplet, gUISample.first
				, gUISample.nodeView, gUISample.nodeMenu
				, gUISample.rightBotJTextPane);
		gUISample.canvas.setPreferredSize(new Dimension(1500,1000));
		gUISample.canvas.setEnabled(true);
		gUISample.righttopScrollPane= new JScrollPane();
		gUISample.righttopScrollPane.setViewportView(gUISample.canvas);
		gUISample.righttopSplitPane.setLeftComponent(gUISample.righttopScrollPane);
		gUISample.rightrightScrollPane= new JScrollPane();
		gUISample.righttopSplitPane.setRightComponent(gUISample.nodeInfo);
		gUISample.rightdownScrollPane= new JScrollPane(gUISample.rightBotJTextPane);
		gUISample.rightSplitPane.setRightComponent(gUISample.rightdownScrollPane);
		
		gUISample.configre= new MenuItem();
		gUISample.configre.setLabel("����");
		gUISample.run= new MenuItem();
		gUISample.run.setLabel("����");
		gUISample.show= new MenuItem();
		gUISample.show.setLabel("��ʾ");
		gUISample.dNode= new MenuItem();
		gUISample.dNode.setLabel("ɾ���ý�");
		gUISample.dLine= new MenuItem();
		gUISample.dLine.setLabel("ɾ������");
		gUISample.nodeMenu.add(gUISample.configre);
		gUISample.nodeMenu.add(gUISample.run);
		gUISample.nodeMenu.add(gUISample.show);
		gUISample.nodeMenu.add(gUISample.dNode);
		gUISample.nodeMenu.add(gUISample.dLine);  
		gUISample.getContentPane().add(gUISample.popupMenu);
		gUISample.getContentPane().add(gUISample.nodeMenu);
		gUISample.engineMenu= new PopupMenu();
		gUISample.load= new MenuItem();
		gUISample.load.setLabel(StableAnnotation.CONFIG_LOAD);
		gUISample.save= new MenuItem();
		gUISample.save.setLabel(StableAnnotation.CONFIG_UPDATE);
		gUISample.saveAs= new MenuItem();
		gUISample.saveAs.setLabel(StableAnnotation.CONFIG_SAVE);
		gUISample.delete= new MenuItem();
		gUISample.delete.setLabel(StableAnnotation.CONFIG_DELETE);
		gUISample.boot= new MenuItem();
		gUISample.boot.setLabel(StableAnnotation.CONFIG_BOOT);
		gUISample.bootETL= new MenuItem();
		gUISample.bootETL.setLabel(StableAnnotation.CONFIG_BOOT_ETL);
		gUISample.osgis= new MenuItem();
		gUISample.osgis.setLabel(StableAnnotation.CONFIG_OSGIS);
		
		gUISample.engineMenu.add(gUISample.load);
		gUISample.engineMenu.add(gUISample.save);
		gUISample.engineMenu.add(gUISample.saveAs);
		gUISample.engineMenu.add(gUISample.delete);
		gUISample.engineMenu.add(gUISample.boot);
		gUISample.engineMenu.add(gUISample.bootETL);
		gUISample.engineMenu.add(gUISample.osgis);
	
		gUISample.getContentPane().add(gUISample.engineMenu);
		
		Box buttonBox = new Box(BoxLayout.X_AXIS);  
		DetaButton loadButton= new DetaButton("�����ĵ�");
		loadButton.setBounds(5+105+105+105+105, 3, 100, 20);
		loadButton.addActionListener(new ActionListener(){
			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					javax.swing.JOptionPane jOptionPane
					= new JOptionPane(StableAnnotation.ATTENSION_LOAD_ENSURE);
					int confirm= jOptionPane.showConfirmDialog(gUISample.canvas
							, StableAnnotation.ATTENSION_LOAD_ENSURE);
					if(0!= confirm) {
						gUISample.rightBotJTextPane.setText
						(StableAnnotation.ATTENSION_CANCELLED_OPERATION);
						gUISample.rightBotJTextPane.validate();
						return;
					}
					FileDialog filedialog= new FileDialog(new Frame()
							, StableAnnotation.ATTENSION_LOAD_HISTORY
							, FileDialog.LOAD);
					filedialog.setFilenameFilter(new TXTFilter
							(StableAnnotation.FILE_FORMAT_ETL));
					filedialog.setVisible(true);
					gUISample.fileCurrentpath= filedialog.getDirectory()
							+ filedialog.getFile();
					System.out.println(gUISample.fileCurrentpath);
					if(null== gUISample.fileCurrentpath
							|| gUISample.fileCurrentpath.isEmpty()
							|| !gUISample.fileCurrentpath.contains
							(StableAnnotation.FILE_FORMAT_ETL)) {
						System.out.println(StableAnnotation.ATTENSION_RECHOICE);
						return;
					}
					File file= new File(gUISample.fileCurrentpath);
					if(!file.isFile()) {
						System.out.println(StableAnnotation.ATTENSION_RECHOICE);
						return;
					}
					LinkNode needDeleteNode= gUISample.first.first;
					while(needDeleteNode!= null) {
						gUISample.first.first= gUISample.first.deletNode
								(gUISample.first.first, needDeleteNode.name
										, needDeleteNode.ID
								, needDeleteNode.primaryKey);
						if(null== needDeleteNode.next) {
							break;
						}
						needDeleteNode= needDeleteNode.next;
					}
					gUISample.canvas.repaint();	
					gUISample.first.first= LoadFile.Load(gUISample.first.first
							, gUISample.nodeView, file, gUISample.first);
				}catch(Exception loadE) {
					loadE.printStackTrace();
				}
				gUISample.canvas.repaint();	
				gUISample.righttopScrollPane.validate();
			}
		});
		buttonBox.add(loadButton);
		//
		DetaButton saveButton= new DetaButton("�����ĵ�");
		saveButton.setBounds(5+105+105+105+105, 3, 100, 20);
		saveButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				SaveAs_I_File.Save(gUISample.first.first);
			}
		});
		buttonBox.add(saveButton);
		//
		DetaButton runButton= new DetaButton("����ִ��");
		runButton.setBounds(5+105+105+105+105, 3, 100, 20);
		runButton.addActionListener(new ActionListener(){
			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					javax.swing.JOptionPane jOptionPane
					= new JOptionPane(StableAnnotation.ATTENSION_LOAD_ENSURE);
					int confirm= jOptionPane.showConfirmDialog(gUISample.canvas
							, StableAnnotation.ATTENSION_LOAD_ENSURE);
					if(0!= confirm) {
						gUISample.rightBotJTextPane.setText
						(StableAnnotation.ATTENSION_CANCELLED_OPERATION);
						gUISample.rightBotJTextPane.validate();
						return;
					}
					FileDialog filedialog= new FileDialog(new Frame()
							, StableAnnotation.ATTENSION_LOAD_HISTORY
							, FileDialog.LOAD);
					filedialog.setFilenameFilter(new TXTFilter
							(StableAnnotation.FILE_FORMAT_ETL));
					filedialog.setVisible(true);
					gUISample.fileCurrentpath= filedialog.getDirectory()
							+ filedialog.getFile();
					System.out.println(gUISample.fileCurrentpath);
					if(null== gUISample.fileCurrentpath
							|| gUISample.fileCurrentpath.isEmpty()
							|| !gUISample.fileCurrentpath.contains
							(StableAnnotation.FILE_FORMAT_ETL)) {
						System.out.println(StableAnnotation.ATTENSION_RECHOICE);
						return;
					}
					File file= new File(gUISample.fileCurrentpath);
					if(!file.isFile()) {
						System.out.println(StableAnnotation.ATTENSION_RECHOICE);
						return;
					}
					LinkNode needDeleteNode= gUISample.first.first;
					while(needDeleteNode!= null) {
						gUISample.first.first= gUISample.first.deletNode
								(gUISample.first.first, needDeleteNode.name
										, needDeleteNode.ID
								, needDeleteNode.primaryKey);
						if(null== needDeleteNode.next) {
							break;
						}
						needDeleteNode= needDeleteNode.next;
					}
					gUISample.canvas.repaint();	
					gUISample.first.first= LoadFile.Load(gUISample.first.first
							, gUISample.nodeView, file, gUISample.first);
				}catch(Exception loadE) {
					loadE.printStackTrace();
				}
				gUISample.canvas.repaint();	
				gUISample.righttopScrollPane.validate();	
				try {
					BootNeroCell.bootCell(gUISample.first.first
							, gUISample.rightBotJTextPane, gUISample.canvas);
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (UnsupportedAudioFileException | InterruptedException e1) {
					e1.printStackTrace();
				} catch (CloneNotSupportedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				gUISample.rightBotJTextPane.setText
				(StableAnnotation.NODE_EXEC_SUCCESS);
				gUISample.rightBotJTextPane.validate();
			}
		});
		buttonBox.add(runButton);
		//
		DetaButton updateButton= new DetaButton("�����ĵ�");
		updateButton.setBounds(5+105+105+105+105, 3, 100, 20);
		updateButton.addActionListener(new ActionListener(){
			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(null== gUISample.fileCurrentpath) {
					System.out.println(StableAnnotation.ATTENSION_UNCURRENT_CHOICE);
					return;
				}
				javax.swing.JOptionPane jOptionPane
				= new JOptionPane(StableAnnotation.ATTENSION_UPDATE_ENSURE
						+ gUISample.fileCurrentpath 
						+ StableAnnotation.MARK_QUESTION);
				int confirm= jOptionPane.showConfirmDialog(gUISample.canvas
						, StableAnnotation.ATTENSION_UPDATE_ENSURE
						+ gUISample.fileCurrentpath
						+ StableAnnotation.MARK_QUESTION);
				if(0!= confirm) {
					gUISample.rightBotJTextPane.setText
					(StableAnnotation.ATTENSION_CANCELLED_OPERATION);
					gUISample.rightBotJTextPane.validate();
					return;
				}
				SaveAnd_U_File.U_(gUISample.fileCurrentpath, gUISample.first.first);
			}
		});
		buttonBox.add(updateButton);
		//
		DetaButton deleteButton= new DetaButton("ɾ���ĵ�");
		deleteButton.setBounds(5+105+105+105+105, 3, 100, 20);
		deleteButton.addActionListener(new ActionListener(){
			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					javax.swing.JOptionPane jOptionPane
					= new JOptionPane(StableAnnotation.ATTENSION_CANCEL_ENSURE);
					int confirm= jOptionPane.showConfirmDialog(gUISample.canvas
							, StableAnnotation.ATTENSION_CANCEL_ENSURE);
					if(0!= confirm) {
						gUISample.rightBotJTextPane.setText
						(StableAnnotation.ATTENSION_CANCELLED_OPERATION);
						gUISample.rightBotJTextPane.validate();
						return;
					}
					LinkNode node= gUISample.first.first;
					while(node!= null) {
						gUISample.first.first= gUISample.first.deletNode
								(gUISample.first.first, node.name, node.ID
										, node.primaryKey);
						if(null== node.next) {
							break;
						}
						node= node.next;
					}
					node= node.next;
					gUISample.canvas.repaint();			
				}catch(Exception E) {
					gUISample.canvas.repaint();
				}
				gUISample.rightBotJTextPane.setText
				(StableAnnotation.ATTENSION_DELETE);
				gUISample.rightBotJTextPane.validate();
			}
		});
		buttonBox.add(deleteButton);
		//
		DetaButton addButton= new DetaButton("��Ӳ��");
		addButton.setBounds(5+105+105+105+105, 3, 100, 20);
		addButton.addActionListener(new ActionListener(){
			@SuppressWarnings({ "static-access", "deprecation" })
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String jarCategoryLink= "";	
				FileDialog filedialog= new FileDialog(new Frame()
						, StableAnnotation.ATTENSION_LOAD_HISTORY
						, FileDialog.LOAD);
				filedialog.setFilenameFilter(new TXTFilter
						(StableAnnotation.FILE_FORMAT_ETL));
				filedialog.setVisible(true);
				jarCategoryLink= filedialog.getDirectory();
				//System.out.println(jarCategoryLink);
				if(null== jarCategoryLink|| jarCategoryLink.isEmpty()
						|| jarCategoryLink.contains
						(StableAnnotation.FILE_FORMAT_JAR)) {
					System.out.println(StableAnnotation.ATTENSION_RECHOICE);
					return;
				}
				File file= new File(jarCategoryLink);
				if(file.isFile()) {
					System.out.println(StableAnnotation.ATTENSION_FILE_CHOICE);
					return;
				}
				File[] files= file.listFiles();
				Here:
				for(int i= 0; i< files.length; i++) {
					gUISample.rightBotJTextPane.validate();
					gUISample.getContentPane().validate();	
					URLClassLoader loader = null;
					try {
						loader = new URLClassLoader(new URL[]{ files[i].toURL() });
					} catch (MalformedURLException e2) {
						e2.printStackTrace();
					}  
					String filename= files[i].getName().replace
							(StableAnnotation.FILE_FORMAT_JAR
									, StableAnnotation.STRING_EMPTY);
					if(!filename.contains("OSI.OSU.")) {
						continue Here;
					}
					/* Դͷ: ��JDK �ٷ��ĵ� ��classloader ���� 
					//����ע��2�д��� 
					 * refer https://www.cnblogs.com/chinaxin/p/3678442.html 
					 * ��С�����Ժ���ǰ;������
					//Class<?> myclass = loader.loadClass("hand.java.loadjar
					 * .TestClass");
					//Gene new object
					//Object myobject = myclass.newInstance();   
					*/
					
					//��Ϊ���ձ�׼��ʽ��������, �����������ĸ�Ĵ�д�任, ׼��������.������
					String[] filenameSplit= filename.split("\\.");
					String lastName= filenameSplit[filenameSplit.length- 1];
					String FirstCharOfLastName= (""+ lastName.charAt(0)).toUpperCase();
					String NewlastName= FirstCharOfLastName+ lastName.subSequence(1
							, lastName.length());	
					System.out.println(filename);
					
					Class<?> myclass = null;
					//   ����                                                     
					//β��                                                        
					//����ĸ                    ��д
					//filename= (""+ filename.split("\\.")[filename.split("\\.")
					//
					//.length- 1].charAt(0)).toUpperCase();			
					//System.out.println(filename.replace(filename.split(".")
					//.length, newChar)filename.split(".").length);
					try {
						String className= filename+ "."+ NewlastName
								+ StableAnnotation.NODE_NODE_INTERFACE;
						System.out.println(className);
						myclass= loader.loadClass(className);
					} catch (ClassNotFoundException e1) {
//						//����Сдʶ��һ�Σ������ϵĲ����
//						FirstCharOfLastName= (""+ lastName.charAt(0));
//						NewlastName= FirstCharOfLastName+ lastName.subSequence(1
						//, lastName.length());	
//						System.out.println(filename);
//						String className= filename+ "."+ NewlastName
//								+ StableData.NODE_NODE_INTERFACE;
//						System.out.println(className);
//						try {
//							myclass= loader.loadClass(className);
//						} catch (ClassNotFoundException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
						e1.printStackTrace();
					}
					Object myobject= null;
				try {
						myobject= myclass.newInstance();
					}
					catch (InstantiationException e1) {
						e1.printStackTrace();
					} 
					catch (IllegalAccessException e1) {
						e1.printStackTrace();
					}
				
					//��׼��֮����Ƴɲ���ʽ�Ȳ�Σ���Ϊ�ƹ��������˼���漰�鱨ѧ�ع�
				//�ͼ������������
					//�����¹�����ذ�ȫ��ϵ�ܿأ���ʱ���з���
				    OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
				    _OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
				    = (OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI) myobject;
				    if(gUISample.nodeReflection.containsKey
				    		(_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
				    				.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS)) {
						gUISample.rightBotJTextPane.setText
						("�����ظ���ӣ��ڵ��Ѵ���"
				    + System.currentTimeMillis());
						continue Here;
						//return;
					}
					gUISample.nodeReflection.put
					(_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
							.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS, null);
					_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.register
				    (gUISample.tableData_old, gUISample.text, gUISample.u
				    		, gUISample._A, gUISample.pos);
				  
				    try {
				    	if(_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
				    			.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.contains("���")
								&& _OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
								.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.contains("ҳ")) {
				    		gUISample.u.searchList.add
				    		(_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI); //memory increment
						}
				    	_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.IMP_PSU();
						gUISample.rightBotJTextPane.setText("�ڵ�:"
						+ _OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
						.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS
						+ "�Ѿ����³ɹ�"+ System.currentTimeMillis()
						+ "\r\n"+ gUISample.rightBotJTextPane.getText());
						gUISample.rightBotJTextPane.validate();
						gUISample.thread.sleep(100);
					} catch (IOException e) {
						e.printStackTrace();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					gUISample.nodeView.first= gUISample.nodeView.link
							.addNode(gUISample.nodeView.first
							, _OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI);
				}	
				gUISample.nodeView.U_Tree();
				gUISample.getContentPane().validate();	
			}
		});
		buttonBox.add(addButton);
		//
		DetaButton execButton= new DetaButton("һ��ִ��");
		execButton.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
		execButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					BootNeroCell.bootCell(gUISample.first.first
							, gUISample.rightBotJTextPane, gUISample.canvas);
					gUISample.rightBotJTextPane.setText
					(StableAnnotation.NODE_EXEC_SUCCESS);
					gUISample.rightBotJTextPane.validate();
				} catch (IOException e1) {
					gUISample.rightBotJTextPane.setText(e1.getStackTrace().toString());
					gUISample.rightBotJTextPane.validate();
				} catch (UnsupportedAudioFileException | InterruptedException e1) {
					gUISample.rightBotJTextPane.setText(e1.getStackTrace().toString());
					gUISample.rightBotJTextPane.validate();
				} catch (CloneNotSupportedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		buttonBox.add(execButton);
		//
		DetaButton execButton1= new DetaButton("�����һ");
		execButton1.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
		execButton1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		buttonBox.add(execButton1);
		
		//
		DetaButton execButton2= new DetaButton("�������");
		execButton2.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
		execButton2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		buttonBox.add(execButton2);
		
		//
		DetaButton execButton3= new DetaButton("�������");
		execButton3.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
		execButton3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		buttonBox.add(execButton3);
		
		//
		DetaButton execButton4= new DetaButton("�������");
		execButton4.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
		execButton4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		buttonBox.add(execButton4);
		
		//
		DetaButton execButton5= new DetaButton("�������");
		execButton5.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
		execButton5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		buttonBox.add(execButton5);
		
		//
		DetaButton execButton6= new DetaButton("ж�ؽڵ�");
		execButton6.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
		execButton6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//ȷ���Ƿ�ж��
				javax.swing.JOptionPane jOptionPane= new JOptionPane("ȷ���Ƿ�ж�أ�");
				@SuppressWarnings("static-access")
				int confirm= jOptionPane.showConfirmDialog
				(gUISample.canvas, "ȷ��ж����");
				if(0!= confirm) {
					gUISample.rightBotJTextPane.setText
					(StableAnnotation.ATTENSION_CANCELLED_OPERATION);
					gUISample.rightBotJTextPane.validate();
					return;
				}
				//ж��
				//gUISample.first.first
				NodeOSGI linkNode= gUISample.nodeView.first;
				while(linkNode.next!= null) {//daodi
					linkNode= linkNode.next;
				}
				Here:
				while(linkNode!= null) {//benshen
					if(gUISample.nodeReflection.containsKey
							(linkNode.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS)) {
						gUISample.nodeReflection.remove
						(linkNode.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS);
						if(linkNode.pre!= null) {
							linkNode= linkNode.pre;	
							if(linkNode.next.next!= null) {
								linkNode.next= linkNode.next.next;
							} else {
								linkNode.next= null;
							}
						}else if(linkNode.next!= null) {
							linkNode= linkNode.next;
							linkNode.pre= null;
						}
						continue Here;
					}
					if(linkNode.pre== null) {
						break;
					}
					linkNode= linkNode.pre;	
				}	
				gUISample.nodeView.first= linkNode;
				gUISample.nodeView.U_Tree();
				gUISample.rightBotJTextPane.setText("ж�سɹ�!");
				gUISample.rightBotJTextPane.validate();
			}
		});
		buttonBox.add(execButton6);
		
		//
		DetaButton execButton7= new DetaButton("����ڵ�");
		execButton7.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
		execButton7.addActionListener(new ActionListener(){
			DetaBuy detaBuy;
			JFrame jFrame;
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(null== jFrame) {
					detaBuy= new DetaBuy();
					try {
						detaBuy.IV_(null);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					detaBuy.setBounds(0, 0, 785, 655);
					detaBuy.setVisible(true);
					detaBuy.show();
					jFrame= new JFrame("������Ϣ V1.0.0");
					//frame.setLayout(null);
					jFrame.setSize(780, 650);
					jFrame.setLocation(300, 300);
					jFrame.setResizable(false);
					jFrame.add(detaBuy);
					jFrame.setVisible(true);
					jFrame.show();
					jFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
				}else {
					jFrame.setVisible(true);
					jFrame.show();
				}
			}
		});
		buttonBox.add(execButton7);
		
		//
		DetaButton execButton8= new DetaButton("�������");
		execButton8.setBounds(5+ 105+ 105+ 105+ 105, 3, 100, 20);
		execButton8.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				gUISample.engineMenu.show(gUISample.canvas, 0, 0);
			}
		});
		buttonBox.add(execButton8);
		
		buttonBox.setBounds(10, 0, 1400, 50);
		gUISample.getContentPane().add(buttonBox);	
		gUISample.getContentPane().setVisible(true);
	}
}
