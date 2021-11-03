package OSI.OPE.PSQ.OEU.SOI.SMQ.neroCell;

import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JTextPane;

import OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash.ThisCanvas;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OSI.OPE.SI.MCI.OEI.OVU.PQE.extOSGI.OSGI_chansfer;
import OSI.OSU.SI.ASQ.OSD.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.tinShell.AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;
import OSI.OSU.SI.ASQ.OSD.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.tinShell.AddTinShellRun;
import OSI.OSU.SI.ASQ.OSD.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.tinShell.AddTinShellView;
import OSI.OSU.SI.ASQ.OSD.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.tinShell.TinMap;
public class BootNeroCell{
	public static void bootCell(LinkNode linkNode, JTextPane rightBotJTextPane
			, ThisCanvas canvas) throws IOException, UnsupportedAudioFileException
	, InterruptedException, CloneNotSupportedException {
		Map<String, LinkNode> bootMaps= new ConcurrentHashMap<>();
		LinkNode currentNode= linkNode;
		while(null!= currentNode) {
			bootMaps.put(currentNode.primaryKey, currentNode);
			currentNode= currentNode.next;
		}
		Map<String, Boolean> bootedMaps= new HashMap<>();
		//准备写深度搜索来做神经流传导，先更新下版本 1.0.3_beta, 这几天完善。20190617 8：28 罗瑶光
		Iterator<String> iterator;
		while(0< bootMaps.size()) {
			iterator= bootMaps.keySet().iterator();
			Here:                          //我在思考设计一个vpcs 执行器来做etlshell节点的 刷新-初始-保存-执行四个线。 
				while(iterator.hasNext()) {//早期的模式是简单的执行配置 保存运行 查看，，现在我要改成 在执行之前确认要保存配置，同时还要执行前更新命令行。看下怎么改更快。
					currentNode= bootMaps.get(iterator.next());
					if(bootedMaps.containsKey(currentNode.primaryKey)) {
						continue Here;
					}
					if(currentNode.tBeconnect&& !bootedMaps.containsKey(currentNode
							.tBeconnectPrimaryKey)) {
						continue Here;
					}
					if(currentNode.mBeconnect&& !bootedMaps.containsKey(currentNode
							.mBeconnectPrimaryKey)) {
						continue Here;
					}
					if(currentNode.dBeconnect&& !bootedMaps.containsKey(currentNode
							.dBeconnectPrimaryKey)) {
						continue Here;
					}
					if(null!= currentNode.thisFace&& currentNode.thisFace.isConfiged) {
						//配置回复
						currentNode.thisFace.memoryRecovery(rightBotJTextPane);
						//取值
						new OSGI_chansfer(currentNode, linkNode);//问题找到了因为map存储的是父类节点，所以子类的下放不能new，如果new就被新的代替了，准备改写。罗瑶光20211103 22:35
						TinMap tinmapTop = null;
						TinMap tinmapMid = null;
						TinMap tinmapDown = null;
						if(null!= currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topOutput) {
							tinmapTop= currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topOutput.clone();
						}
						if(null!= currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.midOutput) {
							tinmapMid= currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.midOutput.clone();
						}
						if(null!= currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.downOutput) {
							tinmapDown= currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.downOutput.clone();
						}
						//配置，无耻猫腻
						((AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI)(currentNode.thisFace)).MEI_MSU(null, null);//稍后我会把null改成异常捕获。
						//运行
						currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topOutput= tinmapTop;
						currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.midOutput= tinmapMid;
						currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.downOutput= tinmapDown;
						currentNode.thisFace.OPE_E(rightBotJTextPane);
//						if(is etlnode) { 开始设计 tinshell一键执行。
//							currentNode.thisFace.刷新
//							currentNode.thisFace.初始
//							currentNode.thisFace.保存
//							currentNode.thisFace.执行
//						}
						if(currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.equals("Tin语shell脚本")) {
//							//currentNode
//							//先从thisface里面找到执行的函数，然后执行的函数里面自动激活3个button就是了。
//							//莫名脸发热，耳朵发涨，腹痛，眼睛模糊，脑袋不能想事情。那就文字记录下
//							//调试好了，就差关联节点的上一节点传入参数检验和测试了。
							//configre录入上一节点数据
							//((AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI)(currentNode.thisFace)).MEI_MSU(null, null);//稍后我会把null改成异常捕获。
							//
//							((AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI)(currentNode.thisFace)).addTinShellRun.bootAsDoc();
							
							AddTinShellRun addTinShellRun= (AddTinShellRun)currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI;
							
							addTinShellRun.topOutput= tinmapTop;
							addTinShellRun.midOutput= tinmapMid;
							addTinShellRun.downOutput= tinmapDown;
							
							addTinShellRun.bootAsDoc((AddTinShellView)(currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ)
									, (AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI)(currentNode.thisFace));
						}
						bootedMaps.put(currentNode.primaryKey, true);
						bootMaps.remove(currentNode.primaryKey);
					}else {
						//报没有配置异常；弹出配置面板；
						currentNode.thisFace.MEI_MSU(rightBotJTextPane, canvas);
						currentNode.thisFace
						.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES
						.setLocation(currentNode.x, currentNode.y);
						currentNode.thisFace
						.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.setSize(300, 300);
						currentNode.thisFace
						.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.setResizable(true);
						currentNode.thisFace
						.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.scrollPane
						.setBounds(0, 0, currentNode.thisFace
								.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES
								.getWidth()-10
								, currentNode.thisFace
								.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES
								.getHeight()-45);
						currentNode
						.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES
						.panel.setPreferredSize(new Dimension(800, 600));
						currentNode
						.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES
						.setBackground(Color.BLUE);
						currentNode
						.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES
						.setVisible(true);
						currentNode
						.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES
						.validate();
						return;
					}
				}
		}
	}
}