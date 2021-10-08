package OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash;
import java.awt.event.ActionEvent;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import MVQ.filenameFilter.TXTFilter;
import OSI.OPE.MSI.OEI.SOI.SMQ.save.SaveAnd_U_File;
import OSI.OPE.MSI.OEI.SOI.SMQ.save.SaveAs_I_File;
import SVQ.stable.StableAnnotation;
import OSI.OPE.OEI.PVI.SOI.SMQ.load.LoadFile;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.CacuString;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.Sort;
import OSI.OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroCell;
@SuppressWarnings("deprecation")
public class GUISample_XCDX_Register {
	public void Register(GUISample gUISample) {
		gUISample.load.addActionListener(new java.awt.event.ActionListener() {
			@SuppressWarnings({StableAnnotation.TAG_STATIC_ACCESS})
			public void actionPerformed(ActionEvent e) {
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
		gUISample.save.addActionListener(new java.awt.event.ActionListener() {
			@SuppressWarnings({StableAnnotation.TAG_STATIC_ACCESS})
			public void actionPerformed(ActionEvent e) {
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

		gUISample.saveAs.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SaveAs_I_File.Save(gUISample.first.first);
			}
		});

		gUISample.osgis.addActionListener(new java.awt.event.ActionListener() {
			@SuppressWarnings({ "static-access" })
			public void actionPerformed(ActionEvent e) {
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
						URLClassLoader loader= null;
						try {
							loader= new URLClassLoader(new URL[]{ files[i].toURL() });
						} catch (MalformedURLException e2) {
							e2.printStackTrace();
						}  
						String filename= files[i].getName()
								.replace(StableAnnotation.FILE_FORMAT_JAR
										, StableAnnotation.STRING_EMPTY);
						if(!filename.contains("OSI.OSU.")) {
							continue Here;
						}
						//如下注释2行代码 
						//refer https://www.cnblogs.com/chinaxin/p/3678442.html 
						//这小伙子以后有前途。哈哈
						//Class<?> myclass = loader.loadClass
						//("hand.java.loadjar.TestClass");
						//Gene new object
						//Object myobject = myclass.newInstance();   
						Class<?> myclass= null;

						//因为按照标准格式函数命名, 因此做了首字母的大写变换
						//, 准备调试下.罗瑶光
						String[] filenameSplit= filename.split("\\.");
						String lastName= filenameSplit[filenameSplit.length- 1];
						String FirstCharOfLastName= (""
						+ lastName.charAt(0)).toUpperCase();
						String NewlastName= FirstCharOfLastName
								+ lastName.subSequence(1, lastName.length());	
						System.out.println(filename);

						//   数组                                                      尾组                                                                          首字母                    大写
						//filename= (""+ filename.split("\\.")[filename.split("\\.")
						//.length- 1].charAt(0)).toUpperCase();			
						//System.out.println(filename.replace(filename.split(".")
						//.length, newChar)filename.split(".").length);
						try {
							String className= filename+ "."+ NewlastName
									+ StableAnnotation.NODE_NODE_INTERFACE;
							System.out.println(className);
							myclass= loader.loadClass(className);
						} catch (ClassNotFoundException e1) {
							////增加小写识别一次，兼容老的插件。
							////之后我会统一进行修改 
							////罗瑶光20210514
							//FirstCharOfLastName= (""+ lastName.charAt(0));
							//NewlastName= FirstCharOfLastName
							//+ lastName.subSequence(1, lastName.length());	
							//System.out.println(filename);
							//String className= filename+ "."+ NewlastName
							//		+ StableData.NODE_NODE_INTERFACE;
							//System.out.println(className);
							//try {
							//	myclass= loader.loadClass(className);
							//} catch (ClassNotFoundException e2) {
							//	// TODO Auto-generated catch block
							//	e2.printStackTrace();
							//}
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

						//我准备之后设计成病毒式热插拔，因为绕过虚拟机的思想涉及情报学特工
						//和计算机病毒领域
						//，害怕国家相关安全体系管控，暂时不研发。
						OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI 
						_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
						= (OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI) myobject;
						if(gUISample.nodeReflection.containsKey
								(_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
										.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS)) {
							gUISample.rightBotJTextPane.setText
							("请勿重复添加，节点已存在"+ System.currentTimeMillis());
							continue Here;
							//return;
						}
						gUISample.nodeReflection.put
						(_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS, null);
						_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.register
						(gUISample.tableData_old, gUISample.text, gUISample.u
								, gUISample._A, gUISample.pos);
						try {
							//search register need add the information
							if(_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
									.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.contains("添加")
									&& _OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
									.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.contains("页")) {
								gUISample.u.searchList.add(_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI); //memory increment
							}
							//searchList
							//
							_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.IMP_PSU();
							gUISample.rightBotJTextPane.setText("节点:"
									+ _OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
									.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS
									+ "已经更新成功"+ System.currentTimeMillis()
									+ "\r\n"+ gUISample.rightBotJTextPane.getText());
							gUISample.rightBotJTextPane.validate();
							gUISample.thread.sleep(100);
						} catch (IOException e1) {
							e1.printStackTrace();
						} catch (InterruptedException e2) {
							e2.printStackTrace();
						}
						gUISample.nodeView.first
						= gUISample.nodeView.link.addNode(gUISample.nodeView.first
								, _OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI);
					}	
				gUISample.nodeView.U_Tree();
				gUISample.getContentPane().validate();	
			}
		});

		gUISample.boot.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BootNeroCell.bootCell(gUISample.first.first
							, gUISample.rightBotJTextPane, gUISample.canvas);
					gUISample.rightBotJTextPane.setText
					(StableAnnotation.NODE_EXEC_SUCCESS);
					gUISample.rightBotJTextPane.validate();
				} catch (IOException e1) {
					gUISample.rightBotJTextPane.setText
					(e1.getStackTrace().toString());
					gUISample.rightBotJTextPane.validate();
				} catch (UnsupportedAudioFileException | InterruptedException e1) {
					gUISample.rightBotJTextPane.setText(e1.getStackTrace().toString());
					gUISample.rightBotJTextPane.validate();
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		gUISample.bootETL.addActionListener(new java.awt.event.ActionListener() {
			@SuppressWarnings(StableAnnotation.TAG_STATIC_ACCESS)
			public void actionPerformed(ActionEvent e) {
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
					filedialog.setFilenameFilter
					(new TXTFilter(StableAnnotation.FILE_FORMAT_ETL));
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
						gUISample.first.first
						= gUISample.first.deletNode(gUISample.first.first
								, needDeleteNode.name, needDeleteNode.ID
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
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				gUISample.rightBotJTextPane.setText
				(StableAnnotation.NODE_EXEC_SUCCESS);
				gUISample.rightBotJTextPane.validate();
			}
		});
		//delete
		gUISample.delete.addActionListener(new java.awt.event.ActionListener() {
			@SuppressWarnings(StableAnnotation.TAG_STATIC_ACCESS)
			public void actionPerformed(ActionEvent e) {
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
		gUISample.leftSplitPane.addPropertyChangeListener(new java.beans.PropertyChangeListener() {  
			public void propertyChange(java.beans.PropertyChangeEvent evt) {  
				if (evt.getPropertyName().equals
						(JSplitPane.DIVIDER_LOCATION_PROPERTY)) {  
					//action code 
					gUISample.nodeProject.width= gUISample.leftSplitPane.getWidth();
					gUISample.nodeProject.height
					= gUISample.leftSplitPane.getDividerLocation();
					gUISample.nodeProject.setBounds(0, 0
							, gUISample.leftSplitPane.getWidth(), gUISample.leftSplitPane
							.getDividerLocation());
					gUISample.nodeProject.validate();

				}  
			}  
		});  
		gUISample.mainSplitPane.addPropertyChangeListener(new java.beans.PropertyChangeListener() {  
			public void propertyChange(java.beans.PropertyChangeEvent evt) {  
				if (evt.getPropertyName().equals(JSplitPane.DIVIDER_LOCATION_PROPERTY)) {  
					//action code 
					gUISample.nodeProject.width
					= gUISample.mainSplitPane.getDividerLocation();
					gUISample.nodeProject.height
					= gUISample.leftSplitPane.getDividerLocation();
					gUISample.nodeProject.setBounds(0, 0
							, gUISample.mainSplitPane.getDividerLocation()
							, gUISample.leftSplitPane.getDividerLocation());
					gUISample.nodeProject.validate();
				}  
			}  
		});  

		gUISample.righttopScrollPane.addComponentListener(new ComponentListener(){
			public void componentHidden(ComponentEvent arg0) {}
			public void componentMoved(ComponentEvent arg0) {}
			public void componentResized(ComponentEvent arg0) {
				gUISample.righttopScrollPane.validate();
			}
			public void componentShown(ComponentEvent arg0) {}
		});

		gUISample.getContentPane().addComponentListener(new ComponentListener(){
			public void componentHidden(ComponentEvent arg0) {}
			public void componentMoved(ComponentEvent arg0) {}
			public void componentResized(ComponentEvent arg0) {
				gUISample.w= gUISample.getContentPane().getWidth();
				gUISample.h= gUISample.getContentPane().getHeight();
				gUISample.mainSplitPane.setBounds(10, 50, gUISample.w- 20, gUISample.h- 80);
				gUISample.mainSplitPane.setDividerLocation(0.11);
				gUISample.leftSplitPane.setDividerLocation(0.25);
				gUISample.rightSplitPane.setDividerLocation(0.85);
				gUISample.righttopSplitPane.setDividerLocation(0.9);

				gUISample.nodeProject.width
				= gUISample.mainSplitPane.getDividerLocation();
				gUISample.nodeProject.height
				= gUISample.leftSplitPane.getDividerLocation();
				gUISample.nodeProject.setBounds(0, 0
						, gUISample.mainSplitPane.getDividerLocation()
						, gUISample.leftSplitPane.getDividerLocation());
				gUISample.nodeProject.validate();
				gUISample.mainSplitPane.validate();
				System.out.println(gUISample.w + "<>" + gUISample.h);
			}

			public void componentShown(ComponentEvent arg0) {
			}	
		});	
		gUISample.addMouseListener(gUISample);
		gUISample.addMouseMotionListener(gUISample);
		gUISample.nodeProject.addMouseListener(gUISample);
		gUISample.nodeView.addMouseListener(gUISample);
		gUISample.nodeView.tree.addMouseListener(gUISample);
		gUISample.nodeView.tree.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent evt) {
				DefaultMutableTreeNode note
				= (DefaultMutableTreeNode) gUISample.nodeView.tree
				.getLastSelectedPathComponent();
				String tr= null;
				if(note!= null){
					tr= new CacuString().cauString(note.toString());       
				}
				if(tr!=null){
					gUISample.treeNodeName= new String(tr);
					gUISample.rightBotJTextPane.setText("节点名："
					+ gUISample.treeNodeName);
					gUISample.rightBotJTextPane.validate();
				}
			}
		});
		gUISample.menuItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(gUISample.treeNodeName!=null){
					try {
						gUISample.first.first
						= gUISample.first.addNode(gUISample.first.first
								, gUISample.treeNodeName, 100, 50
								, gUISample.nodeView.first);
						gUISample.righttopScrollPane.validate();
					} catch (CloneNotSupportedException e1) {
						gUISample.rightBotJTextPane.setText
						(StableAnnotation.NODE_ADD_ERROR);
						gUISample.rightBotJTextPane.validate();
					} catch (InstantiationException e1) {
						gUISample.rightBotJTextPane.setText
						(StableAnnotation.NODE_ADD_ERROR);
						gUISample.rightBotJTextPane.validate();
					} catch (IllegalAccessException e1) {
						gUISample.rightBotJTextPane.setText
						(StableAnnotation.NODE_ADD_ERROR);
						gUISample.rightBotJTextPane.validate();
					} catch (IOException e1) {
						gUISample.rightBotJTextPane.setText
						(StableAnnotation.NODE_ADD_ERROR);
						gUISample.rightBotJTextPane.validate();
					}
					gUISample.rightBotJTextPane.setText("节点名："
					+ "gUISample.treeNodeName");
					gUISample.rightBotJTextPane.validate();
				}
			}
		});  
		gUISample.configre.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkNode node= new LinkNode();
				gUISample.first.first= Sort.sort(gUISample.first.first);
				node= gUISample.first.first;
				while(node!= null){
					if(node.name.equals(gUISample.canvas.currentNodeName)
							&& node.ID== gUISample.canvas.currentNodeID
							&& node.primaryKey.equals
							(gUISample.canvas.currentNodePrimaryKey)){
						try {
							node.thisFace.MEI_MSU(gUISample.rightBotJTextPane
									, gUISample.canvas);
							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES
							.setLocation(node.x, node.y);
							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES
							.setSize(810, 730);
							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES
							.setResizable(true);
							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES
							.scrollPane.setBounds(0, 0
									, node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.getWidth()- 10
									, node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.getHeight()- 45);
							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES
							.panel.setPreferredSize(new Dimension(800, 600));
							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES
							.setBackground(Color.BLUE);
							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES
							.setVisible(true);
							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES
							.validate();
							new OSI.OPE.SI.MCI.OEI.OVU.PQE.extOSGI
							.OSGI_chansfer(node, gUISample.first.first);
						} catch (IOException e1){
							gUISample.rightBotJTextPane.setText
							(StableAnnotation.NODE_UPDATE_ERROR);
							gUISample.rightBotJTextPane.validate();
						} 
					}
					node= node.next;
				}	
				gUISample.rightBotJTextPane.setText
				(StableAnnotation.NODE_UPDATE_SUCCESS);
				gUISample.rightBotJTextPane.validate();
			}
		}); 
		gUISample.run.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkNode node= new LinkNode();
				gUISample.first.first= Sort.sort(gUISample.first.first);
				node= gUISample.first.first;
				while(node!= null){
					if(node.name.equals(gUISample.canvas.currentNodeName)&&node.ID == gUISample.canvas.currentNodeID
							&& node.primaryKey.equals(gUISample.canvas.currentNodePrimaryKey)){
						try {
							node.thisFace.OPE_E(gUISample.rightBotJTextPane);
						} catch (FileNotFoundException e1) {
							gUISample.rightBotJTextPane.setText(StableAnnotation.NODE_EXEC_ERROR);
							gUISample.rightBotJTextPane.validate();
						} catch (IOException e1) {
							gUISample.rightBotJTextPane.setText(StableAnnotation.NODE_EXEC_ERROR);
							gUISample.rightBotJTextPane.validate();
						} catch (UnsupportedAudioFileException e2) {
							gUISample.rightBotJTextPane.setText(StableAnnotation.NODE_EXEC_ERROR);
							gUISample.rightBotJTextPane.validate();
						} catch (InterruptedException e3) {
							gUISample.rightBotJTextPane.setText(StableAnnotation.NODE_EXEC_ERROR);
							gUISample.rightBotJTextPane.validate();
						} catch (CloneNotSupportedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
					node= node.next;
				}	
				gUISample.rightBotJTextPane.setText(StableAnnotation.NODE_EXEC_SUCCESS);
				gUISample.rightBotJTextPane.validate();
			}
		}); 
		gUISample.show.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkNode node= new LinkNode();
				gUISample.first.first= Sort.sort(gUISample.first.first);
				node= gUISample.first.first;
				while(node!= null){
					if(node.name.equals(gUISample.canvas.currentNodeName)&&node.ID== gUISample.canvas.currentNodeID
							&& node.primaryKey.equals(gUISample.canvas.currentNodePrimaryKey)){
						if(!node.thisFace.showed){
							try {
								node.thisFace.AVQ_ASQ_OVQ_OSQ_VSQ(gUISample.rightBotJTextPane);
								node.thisFace
								.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ
								.setLocation(node.x, node.y);
								node.thisFace
								.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ
								.setSize(500, 500);
								node.thisFace
								.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ
								.setResizable(true);
								node.thisFace
								.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ
								.scrollPane.setBounds(0, 0
										, node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.getWidth()- 10
										, node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.getHeight()- 45);
								node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.panel.setPreferredSize(new Dimension(800, 600));
								node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.setVisible(true);
								node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.validate();
							} catch (Exception e1) {
								//e1.printStackTrace();
								gUISample.rightBotJTextPane.setText
								(StableAnnotation.NODE_INSPECT_ERROR);
								gUISample.rightBotJTextPane.validate();
							}  
						}else{
							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.setVisible(true);  
						}
					}
					node=node.next;
				}	
				gUISample.rightBotJTextPane.setText
				(StableAnnotation.NODE_INDICATE_SUCCESS);
				gUISample.rightBotJTextPane.validate();
			}
		}); 
		gUISample.dNode.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkNode node= new LinkNode();
				gUISample.first.first= Sort.sort(gUISample.first.first);
				node=gUISample.first.first;
				while(node!= null){
					if(node.name.equals(gUISample.canvas.currentNodeName)
							&& node.ID== gUISample.canvas.currentNodeID
							&& node.primaryKey.equalsIgnoreCase
							(gUISample.canvas.currentNodePrimaryKey)){
						gUISample.first.first= gUISample.first.deletNode
								(gUISample.first.first, node.name, node.ID
										, node.primaryKey);
						gUISample.updateRelatedLine.doUpdateRelatedLine
						(gUISample.first.first, gUISample.canvas.currentNodeName
								, gUISample.canvas.currentNodeID
								, gUISample.canvas.currentNodePrimaryKey);
					}
					node= node.next;
				}	
				gUISample.canvas.repaint();
			}
		}); 
		gUISample.dLine.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LinkNode node=new LinkNode();
				gUISample.first.first= Sort.sort(gUISample.first.first);
				node=gUISample.first.first;
				while(node!=null){
					if(node.beconnect&&node.name.equals
							(gUISample.canvas.currentNodeName)
							&& node.ID== gUISample.canvas.currentNodeID
							&& node.primaryKey.equals
							(gUISample.canvas.currentNodePrimaryKey)){
						node.beconnect=false;
						node.tBeconnect=false;
						node.mBeconnect=false;
						node.dBeconnect=false;
					}
					node= node.next;
				}
				gUISample.canvas.repaint();
			}
		}); 
	}	
}
