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
		//׼��д����������������������ȸ����°汾 1.0.3_beta, �⼸�����ơ�20190617 8��28 ������
		Iterator<String> iterator;
		while(0< bootMaps.size()) {
			iterator= bootMaps.keySet().iterator();
			Here:                          //����˼�����һ��vpcs ִ��������etlshell�ڵ�� ˢ��-��ʼ-����-ִ���ĸ��ߡ� 
				while(iterator.hasNext()) {//���ڵ�ģʽ�Ǽ򵥵�ִ������ �������� �鿴����������Ҫ�ĳ� ��ִ��֮ǰȷ��Ҫ�������ã�ͬʱ��Ҫִ��ǰ���������С�������ô�ĸ��졣
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
						//���ûظ�
						currentNode.thisFace.memoryRecovery(rightBotJTextPane);
						//ȡֵ
						new OSGI_chansfer(currentNode, linkNode);//�����ҵ�����Ϊmap�洢���Ǹ���ڵ㣬����������·Ų���new�����new�ͱ��µĴ����ˣ�׼����д��������20211103 22:35
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
						//���ã��޳�è��
						((AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI)(currentNode.thisFace)).MEI_MSU(null, null);//�Ժ��һ��null�ĳ��쳣����
						//����
						currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topOutput= tinmapTop;
						currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.midOutput= tinmapMid;
						currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.downOutput= tinmapDown;
						currentNode.thisFace.OPE_E(rightBotJTextPane);
//						if(is etlnode) { ��ʼ��� tinshellһ��ִ�С�
//							currentNode.thisFace.ˢ��
//							currentNode.thisFace.��ʼ
//							currentNode.thisFace.����
//							currentNode.thisFace.ִ��
//						}
						if(currentNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS.equals("Tin��shell�ű�")) {
//							//currentNode
//							//�ȴ�thisface�����ҵ�ִ�еĺ�����Ȼ��ִ�еĺ��������Զ�����3��button�����ˡ�
//							//Ī�������ȣ����䷢�ǣ���ʹ���۾�ģ�����Դ����������顣�Ǿ����ּ�¼��
//							//���Ժ��ˣ��Ͳ�����ڵ����һ�ڵ㴫���������Ͳ����ˡ�
							//configre¼����һ�ڵ�����
							//((AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI)(currentNode.thisFace)).MEI_MSU(null, null);//�Ժ��һ��null�ĳ��쳣����
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
						//��û�������쳣������������壻
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