package OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.tree.TreePath;

import ME.APM.VSQ.App;
import OCI.ME.analysis.C.A;
import OSI.OPE.MSQ.OVU.PQE.nodeInfo.NodeInfo;
import OSI.OPE.MSQ.OVU.PQE.nodeProject.NodeProject;
import OSI.OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornJSplitPane;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.U_RelatedLineVPS;

public class GUISample extends JApplet implements MouseMotionListener
, MouseListener, ItemListener, ActionListener, Runnable{	
	private static final long serialVersionUID= 5270675501794340912L;
	public GUISample() {
		getContentPane().setBackground(new Color(255,255,255));
	}
	public Map<String, Object> nodeReflection= new HashMap<>();
	public String fileCurrentpath;
	public int w, h;
	public int flash= 0;
	public int count= 0;
	public String currentNodeName;
	public int currentNodeID;
	public String currentNodePrimaryKey;
	public LinkList first;
	public int currentx, currenty;
	public int choose= 0;
	public int oldx, oldy;
	public int newx, newy;
	public int is_O= 0;
	public String treeNodeName;
	public NodeShow nodeView;
	public NodeProject nodeProject;
	public NodeInfo nodeInfo;
	public UnicornJSplitPane mainSplitPane;
	public UnicornJSplitPane leftSplitPane;
	public UnicornJSplitPane rightSplitPane;
	public UnicornJSplitPane righttopSplitPane;
	public JScrollPane righttopScrollPane;
	public JScrollPane rightdownScrollPane;
	public JScrollPane rightrightScrollPane;
	public JTextPane rightBotJTextPane;
	public ThisCanvas canvas;
	public PopupMenu popupMenu, nodeMenu, itemMenu, engineMenu;
	public MenuItem save, saveAs, delete, load, boot, bootETL, osgis;
	public MenuItem menuItem;
	public MenuItem configre, run, show, dNode, dLine;
	public Thread thread, threadApplet; 
	public JTextPane text;
	public Object[][] tableData_old; 
	public U_RelatedLineVPS updateRelatedLine;
	public App u;
	public A _A;
	public Map<String, String> pos;
	public void run() {
		try {
			Thread.sleep(100);
			nodeProject.setBounds(0, 0, leftSplitPane.getWidth()
					, leftSplitPane.getDividerLocation());
			Thread.sleep(1000);
			nodeProject.validate();
			while(true){   
				try{
					Thread.sleep(5000);
					this.validate();
				}catch (InterruptedException e) {}
				this.validate();
			}  
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
	
	public void start(){
		if(thread== null){
			thread=  new Thread(this);
			thread.start();
		}
	}

	public void stop() {
	}

//	public void Registrar() {
//		load.addActionListener(new java.awt.event.ActionListener() {
//			@SuppressWarnings({StableAnnotation.TAG_STATIC_ACCESS})
//			public void actionPerformed(ActionEvent e) {
//				try {
//					javax.swing.JOptionPane jOptionPane= new JOptionPane(StableAnnotation.ATTENSION_LOAD_ENSURE);
//					int confirm= jOptionPane.showConfirmDialog(canvas, StableAnnotation.ATTENSION_LOAD_ENSURE);
//					if(0!= confirm) {
//						rightBotJTextPane.setText(StableAnnotation.ATTENSION_CANCELLED_OPERATION);
//						rightBotJTextPane.validate();
//						return;
//					}
//					FileDialog filedialog= new FileDialog(new Frame(), StableAnnotation.ATTENSION_LOAD_HISTORY
//							, FileDialog.LOAD);
//					filedialog.setFilenameFilter(new TXTFilter(StableAnnotation.FILE_FORMAT_ETL));
//					filedialog.setVisible(true);
//					fileCurrentpath= filedialog.getDirectory()+ filedialog.getFile();
//					System.out.println(fileCurrentpath);
//					if(null== fileCurrentpath|| fileCurrentpath.isEmpty()|| !fileCurrentpath.contains
//							(StableAnnotation.FILE_FORMAT_ETL)) {
//						System.out.println(StableAnnotation.ATTENSION_RECHOICE);
//						return;
//					}
//					File file= new File(fileCurrentpath);
//					if(!file.isFile()) {
//						System.out.println(StableAnnotation.ATTENSION_RECHOICE);
//						return;
//					}
//					LinkNode needDeleteNode= first.first;
//					while(needDeleteNode!= null) {
//						first.first= first.deletNode(first.first, needDeleteNode.name, needDeleteNode.ID
//								, needDeleteNode.primaryKey);
//						if(null== needDeleteNode.next) {
//							break;
//						}
//						needDeleteNode= needDeleteNode.next;
//					}
//					canvas.repaint();	
//					first.first= LoadFile.Load(first.first, nodeView, file, first);
//				}catch(Exception loadE) {
//					loadE.printStackTrace();
//				}
//				canvas.repaint();	
//				righttopScrollPane.validate();
//			}
//		});
//		save.addActionListener(new java.awt.event.ActionListener() {
//			@SuppressWarnings({StableAnnotation.TAG_STATIC_ACCESS})
//			public void actionPerformed(ActionEvent e) {
//				if(null== fileCurrentpath) {
//					System.out.println(StableAnnotation.ATTENSION_UNCURRENT_CHOICE);
//					return;
//				}
//				javax.swing.JOptionPane jOptionPane= new JOptionPane(StableAnnotation.ATTENSION_UPDATE_ENSURE
//						+ fileCurrentpath + StableAnnotation.MARK_QUESTION);
//				int confirm= jOptionPane.showConfirmDialog(canvas, StableAnnotation.ATTENSION_UPDATE_ENSURE
//						+ fileCurrentpath + StableAnnotation.MARK_QUESTION);
//				if(0!= confirm) {
//					rightBotJTextPane.setText(StableAnnotation.ATTENSION_CANCELLED_OPERATION);
//					rightBotJTextPane.validate();
//					return;
//				}
//				SaveAnd_U_File.U_(fileCurrentpath, first.first);
//			}
//		});
//		
//		saveAs.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				SaveAs_I_File.Save(first.first);
//			}
//		});
//		
//		osgis.addActionListener(new java.awt.event.ActionListener() {
//			@SuppressWarnings({ "static-access" })
//			public void actionPerformed(ActionEvent e) {
//				String jarCategoryLink= "";	
//				FileDialog filedialog= new FileDialog(new Frame(), StableAnnotation.ATTENSION_LOAD_HISTORY
//						, FileDialog.LOAD);
//				filedialog.setFilenameFilter(new TXTFilter(StableAnnotation.FILE_FORMAT_ETL));
//				filedialog.setVisible(true);
//				jarCategoryLink= filedialog.getDirectory();
//				//System.out.println(jarCategoryLink);
//				if(null== jarCategoryLink|| jarCategoryLink.isEmpty()|| jarCategoryLink.contains
//						(StableAnnotation.FILE_FORMAT_JAR)) {
//					System.out.println(StableAnnotation.ATTENSION_RECHOICE);
//					return;
//				}
//				File file= new File(jarCategoryLink);
//				if(file.isFile()) {
//					System.out.println(StableAnnotation.ATTENSION_FILE_CHOICE);
//					return;
//				}
//				File[] files= file.listFiles();
//				Here:
//					for(int i= 0; i< files.length; i++) {
//						rightBotJTextPane.validate();
//						getContentPane().validate();	
//						URLClassLoader loader= null;
//						try {
//							loader= new URLClassLoader(new URL[]{ files[i].toURL() });
//						} catch (MalformedURLException e2) {
//							e2.printStackTrace();
//						}  
//						String filename= files[i].getName().replace(StableAnnotation.FILE_FORMAT_JAR, StableAnnotation.STRING_EMPTY);
//						if(!filename.contains("OSI.OSU.")) {
//							continue Here;
//						}
//						//如下注释2行代码 refer https://www.cnblogs.com/chinaxin/p/3678442.html 这小伙子以后有前途。哈哈
//						//Class<?> myclass = loader.loadClass("hand.java.loadjar.TestClass");
//						//Gene new object
//						//Object myobject = myclass.newInstance();   
//						Class<?> myclass= null;
//					
//						//因为按照标准格式函数命名, 因此做了首字母的大写变换, 准备调试下.罗瑶光
//						String[] filenameSplit= filename.split("\\.");
//						String lastName= filenameSplit[filenameSplit.length- 1];
//						String FirstCharOfLastName= (""+ lastName.charAt(0)).toUpperCase();
//						String NewlastName= FirstCharOfLastName+ lastName.subSequence(1, lastName.length());	
//						System.out.println(filename);
//						
//						//   数组                                                      尾组                                                                          首字母                    大写
//						//filename= (""+ filename.split("\\.")[filename.split("\\.").length- 1].charAt(0)).toUpperCase();			
//						//System.out.println(filename.replace(filename.split(".").length, newChar)filename.split(".").length);
//						try {
//							String className= filename+ "."+ NewlastName
//									+ StableAnnotation.NODE_NODE_INTERFACE;
//							System.out.println(className);
//							myclass= loader.loadClass(className);
//						} catch (ClassNotFoundException e1) {
////							//增加小写识别一次，兼容老的插件。
////							//之后我会统一进行修改 
////							//罗瑶光20210514
////							FirstCharOfLastName= (""+ lastName.charAt(0));
////							NewlastName= FirstCharOfLastName+ lastName.subSequence(1, lastName.length());	
////							System.out.println(filename);
////							String className= filename+ "."+ NewlastName
////									+ StableData.NODE_NODE_INTERFACE;
////							System.out.println(className);
////							try {
////								myclass= loader.loadClass(className);
////							} catch (ClassNotFoundException e2) {
////								// TODO Auto-generated catch block
////								e2.printStackTrace();
////							}
//							e1.printStackTrace();
//						}
//						Object myobject= null;
//						try {
//							myobject= myclass.newInstance();
//						}
//						catch (InstantiationException e1) {
//							e1.printStackTrace();
//						} 
//						catch (IllegalAccessException e1) {
//							e1.printStackTrace();
//						}
//
//						//我准备之后设计成病毒式热插拔，因为绕过虚拟机的思想涉及情报学特工和计算机病毒领域
//						//，害怕国家相关安全体系管控，暂时不研发。
//						OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI
//						= (OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI) myobject;
//						if(nodeReflection.containsKey(OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS)) {
//							rightBotJTextPane.setText("请勿重复添加，节点已存在"+ System.currentTimeMillis());
//							continue Here;
//							//return;
//						}
//						nodeReflection.put(OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS, null);
//						OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.register(tableData_old, text, u, _A, pos);
//						try {
//							//search register need add the information
//							if(OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.contains("添加")
//									&& OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.contains("页")) {
//								u.searchList.add(OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI); //memory increment
//							}
//							//searchList
//							//
//							OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.IMP_PSU();
//							rightBotJTextPane.setText("节点:"
//									+ OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS
//									+ "已经更新成功"+ System.currentTimeMillis()
//									+ "\r\n"+ rightBotJTextPane.getText());
//							rightBotJTextPane.validate();
//							thread.sleep(100);
//						} catch (IOException e1) {
//							e1.printStackTrace();
//						} catch (InterruptedException e2) {
//							e2.printStackTrace();
//						}
//						nodeView.first= nodeView.link.addNode(nodeView.first
//								, OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI);
//					}	
//				nodeView.U_Tree();
//				getContentPane().validate();	
//			}
//		});
//		
//		boot.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try {
//					BootNeroCell.bootCell(first.first, rightBotJTextPane, canvas);
//					rightBotJTextPane.setText(StableAnnotation.NODE_EXEC_SUCCESS);
//					rightBotJTextPane.validate();
//				} catch (IOException e1) {
//					rightBotJTextPane.setText(e1.getStackTrace().toString());
//					rightBotJTextPane.validate();
//				} catch (UnsupportedAudioFileException | InterruptedException e1) {
//					rightBotJTextPane.setText(e1.getStackTrace().toString());
//					rightBotJTextPane.validate();
//				}
//			}
//		});
//		bootETL.addActionListener(new java.awt.event.ActionListener() {
//			@SuppressWarnings(StableAnnotation.TAG_STATIC_ACCESS)
//			public void actionPerformed(ActionEvent e) {
//				try {
//					javax.swing.JOptionPane jOptionPane= new JOptionPane(StableAnnotation.ATTENSION_LOAD_ENSURE);
//					int confirm= jOptionPane.showConfirmDialog(canvas, StableAnnotation.ATTENSION_LOAD_ENSURE);
//					if(0!= confirm) {
//						rightBotJTextPane.setText(StableAnnotation.ATTENSION_CANCELLED_OPERATION);
//						rightBotJTextPane.validate();
//						return;
//					}
//					FileDialog filedialog= new FileDialog(new Frame(), StableAnnotation.ATTENSION_LOAD_HISTORY
//							, FileDialog.LOAD);
//					filedialog.setFilenameFilter(new TXTFilter(StableAnnotation.FILE_FORMAT_ETL));
//					filedialog.setVisible(true);
//					fileCurrentpath= filedialog.getDirectory()+ filedialog.getFile();
//					System.out.println(fileCurrentpath);
//					if(null== fileCurrentpath|| fileCurrentpath.isEmpty()|| !fileCurrentpath.contains
//							(StableAnnotation.FILE_FORMAT_ETL)) {
//						System.out.println(StableAnnotation.ATTENSION_RECHOICE);
//						return;
//					}
//					File file= new File(fileCurrentpath);
//					if(!file.isFile()) {
//						System.out.println(StableAnnotation.ATTENSION_RECHOICE);
//						return;
//					}
//					LinkNode needDeleteNode= first.first;
//					while(needDeleteNode!= null) {
//						first.first= first.deletNode(first.first, needDeleteNode.name, needDeleteNode.ID
//								, needDeleteNode.primaryKey);
//						if(null== needDeleteNode.next) {
//							break;
//						}
//						needDeleteNode= needDeleteNode.next;
//					}
//					canvas.repaint();	
//					first.first= LoadFile.Load(first.first, nodeView, file, first);
//				}catch(Exception loadE) {
//					loadE.printStackTrace();
//				}
//				canvas.repaint();	
//				righttopScrollPane.validate();	
//				try {
//					BootNeroCell.bootCell(first.first, rightBotJTextPane, canvas);
//				} catch (IOException e1) {
//					e1.printStackTrace();
//				} catch (UnsupportedAudioFileException | InterruptedException e1) {
//					e1.printStackTrace();
//				}
//				rightBotJTextPane.setText(StableAnnotation.NODE_EXEC_SUCCESS);
//				rightBotJTextPane.validate();
//			}
//		});
//		//delete
//		delete.addActionListener(new java.awt.event.ActionListener() {
//			@SuppressWarnings(StableAnnotation.TAG_STATIC_ACCESS)
//			public void actionPerformed(ActionEvent e) {
//				try {
//					javax.swing.JOptionPane jOptionPane= new JOptionPane(StableAnnotation.ATTENSION_CANCEL_ENSURE);
//					int confirm= jOptionPane.showConfirmDialog(canvas, StableAnnotation.ATTENSION_CANCEL_ENSURE);
//					if(0!= confirm) {
//						rightBotJTextPane.setText(StableAnnotation.ATTENSION_CANCELLED_OPERATION);
//						rightBotJTextPane.validate();
//						return;
//					}
//					LinkNode node= first.first;
//					while(node!= null) {
//						first.first= first.deletNode(first.first, node.name, node.ID, node.primaryKey);
//						if(null== node.next) {
//							break;
//						}
//						node= node.next;
//					}
//					node= node.next;
//					canvas.repaint();			
//				}catch(Exception E) {
//					canvas.repaint();
//				}
//				rightBotJTextPane.setText(StableAnnotation.ATTENSION_DELETE);
//				rightBotJTextPane.validate();
//			}	
//		});
//		leftSplitPane.addPropertyChangeListener(new java.beans.PropertyChangeListener() {  
//			public void propertyChange(java.beans.PropertyChangeEvent evt) {  
//				if (evt.getPropertyName().equals(JSplitPane.DIVIDER_LOCATION_PROPERTY)) {  
//					//action code 
//					nodeProject.width=leftSplitPane.getWidth();
//					nodeProject.height=leftSplitPane.getDividerLocation();
//					nodeProject.setBounds(0, 0,leftSplitPane.getWidth(),leftSplitPane
//							.getDividerLocation());
//					nodeProject.validate();
//
//				}  
//			}  
//		});  
//		mainSplitPane.addPropertyChangeListener(new java.beans.PropertyChangeListener() {  
//			public void propertyChange(java.beans.PropertyChangeEvent evt) {  
//				if (evt.getPropertyName().equals(JSplitPane.DIVIDER_LOCATION_PROPERTY)) {  
//					//action code 
//					nodeProject.width=mainSplitPane.getDividerLocation();
//					nodeProject.height=leftSplitPane.getDividerLocation();
//					nodeProject.setBounds(0, 0,mainSplitPane.getDividerLocation()
//							, leftSplitPane.getDividerLocation());
//					nodeProject.validate();
//				}  
//			}  
//		});  
//
//		righttopScrollPane.addComponentListener(new ComponentListener(){
//			public void componentHidden(ComponentEvent arg0) {}
//			public void componentMoved(ComponentEvent arg0) {}
//			public void componentResized(ComponentEvent arg0) {
//				righttopScrollPane.validate();
//			}
//			public void componentShown(ComponentEvent arg0) {}
//		});
//
//		getContentPane().addComponentListener(new ComponentListener(){
//			public void componentHidden(ComponentEvent arg0) {}
//			public void componentMoved(ComponentEvent arg0) {}
//			public void componentResized(ComponentEvent arg0) {
//				w= getContentPane().getWidth();
//				h= getContentPane().getHeight();
//				mainSplitPane.setBounds(10, 50, w- 20, h- 80);
//				mainSplitPane.setDividerLocation(0.11);
//				leftSplitPane.setDividerLocation(0.25);
//				rightSplitPane.setDividerLocation(0.85);
//				righttopSplitPane.setDividerLocation(0.9);
//				
//				nodeProject.width= mainSplitPane.getDividerLocation();
//				nodeProject.height= leftSplitPane.getDividerLocation();
//				nodeProject.setBounds(0, 0, mainSplitPane.getDividerLocation()
//						, leftSplitPane.getDividerLocation());
//				nodeProject.validate();
//				mainSplitPane.validate();
//				System.out.println(w + "<>" + h);
//			}
//
//			public void componentShown(ComponentEvent arg0) {
//			}	
//		});	
//		addMouseListener(this);
//		addMouseMotionListener(this);
//		nodeProject.addMouseListener(this);
//		nodeView.addMouseListener(this);
//		nodeView.tree.addMouseListener(this);
//		nodeView.tree.addTreeSelectionListener(new TreeSelectionListener() {
//			public void valueChanged(TreeSelectionEvent evt) {
//				DefaultMutableTreeNode note= (DefaultMutableTreeNode) nodeView.tree.getLastSelectedPathComponent();
//				String tr= null;
//				if(note!= null){
//					tr= new CacuString().cauString(note.toString());       
//				}
//				if(tr!=null){
//					treeNodeName= new String(tr);
//					rightBotJTextPane.setText("节点名："+ treeNodeName);
//					rightBotJTextPane.validate();
//				}
//			}
//		});
//		menuItem.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if(treeNodeName!=null){
//					try {
//						first.first= first.addNode(first.first, treeNodeName, 100, 50, nodeView.first);
//						righttopScrollPane.validate();
//					} catch (CloneNotSupportedException e1) {
//						rightBotJTextPane.setText(StableAnnotation.NODE_ADD_ERROR);
//						rightBotJTextPane.validate();
//					} catch (InstantiationException e1) {
//						rightBotJTextPane.setText(StableAnnotation.NODE_ADD_ERROR);
//						rightBotJTextPane.validate();
//					} catch (IllegalAccessException e1) {
//						rightBotJTextPane.setText(StableAnnotation.NODE_ADD_ERROR);
//						rightBotJTextPane.validate();
//					} catch (IOException e1) {
//						rightBotJTextPane.setText(StableAnnotation.NODE_ADD_ERROR);
//						rightBotJTextPane.validate();
//					}
//					rightBotJTextPane.setText("节点名："+ "treeNodeName");
//					rightBotJTextPane.validate();
//				}
//			}
//		});  
//		configre.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				LinkNode node= new LinkNode();
//				first.first= Sort.sort(first.first);
//				node= first.first;
//				while(node!= null){
//					if(node.name.equals(canvas.currentNodeName)&&node.ID== canvas.currentNodeID
//							&& node.primaryKey.equals(canvas.currentNodePrimaryKey)){
//						try {
//							node.thisFace.MEI_MSU(rightBotJTextPane, canvas);
//							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.setLocation(node.x, node.y);
//							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.setSize(300, 300);
//							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.setResizable(true);
//							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.scrollPane.setBounds(0, 0
//									, node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.getWidth()- 10
//									, node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.getHeight()- 45);
//							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.panel.setPreferredSize(new Dimension(800, 600));
//							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.setBackground(Color.BLUE);
//							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.setVisible(true);
//							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.validate();
//							new OSI.OPE.SI.MCI.OEI.OVU.PQE.extOSGI.OSGI_chansfer(node, first.first);
//						} catch (IOException e1){
//							rightBotJTextPane.setText(StableAnnotation.NODE_UPDATE_ERROR);
//							rightBotJTextPane.validate();
//						} 
//					}
//					node= node.next;
//				}	
//				rightBotJTextPane.setText(StableAnnotation.NODE_UPDATE_SUCCESS);
//				rightBotJTextPane.validate();
//			}
//		}); 
//		run.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				LinkNode node= new LinkNode();
//				first.first= Sort.sort(first.first);
//				node= first.first;
//				while(node!= null){
//					if(node.name.equals(canvas.currentNodeName)&&node.ID == canvas.currentNodeID
//							&& node.primaryKey.equals(canvas.currentNodePrimaryKey)){
//						try {
//							node.thisFace.OPE_E(rightBotJTextPane);
//						} catch (FileNotFoundException e1) {
//							rightBotJTextPane.setText(StableAnnotation.NODE_EXEC_ERROR);
//							rightBotJTextPane.validate();
//						} catch (IOException e1) {
//							rightBotJTextPane.setText(StableAnnotation.NODE_EXEC_ERROR);
//							rightBotJTextPane.validate();
//						} catch (UnsupportedAudioFileException e2) {
//							rightBotJTextPane.setText(StableAnnotation.NODE_EXEC_ERROR);
//							rightBotJTextPane.validate();
//						} catch (InterruptedException e3) {
//							rightBotJTextPane.setText(StableAnnotation.NODE_EXEC_ERROR);
//							rightBotJTextPane.validate();
//						}
//					}
//					node= node.next;
//				}	
//				rightBotJTextPane.setText(StableAnnotation.NODE_EXEC_SUCCESS);
//				rightBotJTextPane.validate();
//			}
//		}); 
//		show.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				LinkNode node= new LinkNode();
//				first.first= Sort.sort(first.first);
//				node= first.first;
//				while(node!= null){
//					if(node.name.equals(canvas.currentNodeName)&&node.ID== canvas.currentNodeID
//							&& node.primaryKey.equals(canvas.currentNodePrimaryKey)){
//						if(!node.thisFace.showed){
//							try {
//								node.thisFace.AVQ_ASQ_OVQ_OSQ_VSQ(rightBotJTextPane);
//								node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.setLocation(node.x, node.y);
//								node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.setSize(500, 500);
//								node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.setResizable(true);
//								node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.scrollPane.setBounds(0, 0
//										, node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.getWidth()- 10
//										, node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.getHeight()- 45);
//								node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.panel.setPreferredSize(new Dimension(800, 600));
//								node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.setVisible(true);
//								node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.validate();
//							} catch (Exception e1) {
//								//e1.printStackTrace();
//								rightBotJTextPane.setText(StableAnnotation.NODE_INSPECT_ERROR);
//								rightBotJTextPane.validate();
//							}  
//						}else{
//							node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.setVisible(true);  
//						}
//					}
//					node=node.next;
//				}	
//				rightBotJTextPane.setText(StableAnnotation.NODE_INDICATE_SUCCESS);
//				rightBotJTextPane.validate();
//			}
//		}); 
//		dNode.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				LinkNode node= new LinkNode();
//				first.first= Sort.sort(first.first);
//				node=first.first;
//				while(node!= null){
//					if(node.name.equals(canvas.currentNodeName)&&node.ID== canvas.currentNodeID
//							&& node.primaryKey.equalsIgnoreCase(canvas.currentNodePrimaryKey)){
//						first.first= first.deletNode(first.first, node.name, node.ID, node.primaryKey);
//						updateRelatedLine.doUpdateRelatedLine(first.first, canvas.currentNodeName, canvas.currentNodeID
//								, canvas.currentNodePrimaryKey);
//					}
//					node= node.next;
//				}	
//				canvas.repaint();
//			}
//		}); 
//		dLine.addActionListener(new java.awt.event.ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				LinkNode node=new LinkNode();
//				first.first= Sort.sort(first.first);
//				node=first.first;
//				while(node!=null){
//					if(node.beconnect&&node.name.equals(canvas.currentNodeName)&& node.ID==canvas.currentNodeID
//							&& node.primaryKey.equals(canvas.currentNodePrimaryKey)){
//						node.beconnect=false;
//						node.tBeconnect=false;
//						node.mBeconnect=false;
//						node.dBeconnect=false;
//					}
//					node= node.next;
//				}
//				canvas.repaint();
//			}
//		}); 
//	}	

	public void IV_(){
		try {
			new GUISample_XCDX_CreateMap().CreatMap(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		new GUISample_XCDX_Register().Register(this);    //Registrar();
		this.resize(w,h);	
	}

	public void IV_(Object[][] tableData_old,JTextPane text, App u
			, A _A, Map<String, String> pos){
		try {
			this.text= text;
			this.tableData_old= tableData_old;
			this.u= u;
			this._A= _A;
			this.pos= pos;
			new GUISample_XCDX_CreateMap().CreatMap(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		new GUISample_XCDX_Register().Register(this);
		this.resize(w,h);	
	}
	public void actionPerformed(ActionEvent arg0) {}
	public void itemStateChanged(ItemEvent arg0) {}
	public void mouseClicked(MouseEvent arg0) {}
	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	public void mousePressed(MouseEvent arg0) {}
	public void mouseReleased(MouseEvent arg0) {
		//TreePath path= nodeView.tree.getPathForLocation(arg0.getX(), arg0.getY());
		TreePath path= nodeView.tree.getSelectionPath();
		if (path != null){
			nodeView.tree.setSelectionPath(path);
			if (3== arg0.getButton()){
			popupMenu.show(nodeView.tree, arg0.getX(), arg0.getY());
			}else {
				//engineMenu.show(canvas, 0, 0);
			}
		}else {
			engineMenu.show(canvas, 0, 0);
		}	
	}
	public void mouseDragged(MouseEvent arg0) {}
	public void mouseMoved(MouseEvent arg0) {}
}
