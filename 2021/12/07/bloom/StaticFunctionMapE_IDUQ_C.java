package SEM.bloom;

import java.awt.PopupMenu;
import java.io.IOException;
import java.util.Map;

import javax.swing.JTextPane;

import ME.APM.VSQ.App;
import OCI.ME.analysis.C.A;
import OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash.GUISample;
import OSI.OPE.MSQ.OVU.PQE.nodeInfo.NodeInfo;
import OSI.OPE.MSQ.OVU.PQE.nodeProject.NodeProject;
import OSI.OPE.MVU.OVU.OVU.PQE.nodeEdit.C.CheckRange;
import OSI.OPE.MVU.OVU.OVU.PQE.nodeEdit.C.ChooseCheck;
import OSI.OPE.MVU.OVU.OVU.PQE.nodeEdit.C.DrawArrow;
import OSI.OPE.MVU.OVU.OVU.PQE.nodeEdit.C.DynamicLine_U;
import OSI.OPE.MVU.OVU.OVU.PQE.nodeEdit.C.Sort;
import OSI.OPE.MVU.OVU.OVU.PQE.nodeEdit.C.U_RelatedLine;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.LinkOSGI;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.NodeOSGI;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AVQ_ASQ_OPE_OPC_ECI;
import OSI.OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornJSplitPane;
import OSI.OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornScrollBarUI;
import OSI.OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornSplitPaneUI;
import OSI.OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornTreeCellRenderer;
import OSI.OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornTreeUI;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.CacuString;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.CheckRangeVPS;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.ChooseQ_VPS;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.DrawArrowVPS;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.DrawFlashSide;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.DrawSinLineVPS;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.DynamicLineU_VPS;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.U_RelatedLineVPS;
import OSI.OPE.SI.MCI.OEI.OVU.PQE.extOSGI.OSGI_chansfer;
import OSI.OPE.SI.MCI.OEI.OVU.PQE.extOSGI.OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register;

//����Ȩ��+ ����= ������
//Refer��Դ������ ��DNA Ԫ���߻����ļ��� �����޶��汾 V039010912��
//֤���ţ���������-2021-L-00268255 (�л����񹲺͹� ���Ұ�Ȩ�Ǽ�����)
public interface StaticFunctionMapE_IDUQ_C {
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey
			, StaticFunctionMapE_IDUQ_E staticFunctionMapE_IDUQ_C, Map<String, Object> output) throws IOException {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("getNodeInfo")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getNodeInfo();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getNodeProject")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getNodeProject();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getCheckRange")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getCheckRange();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getChooseCheck")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getChooseCheck();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getDrawArrow")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getDrawArrow();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getDynamicLine_U")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getDynamicLine_U();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getU_RelatedLine")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getU_RelatedLine();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getU_RelatedLine")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getU_RelatedLine();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getLinkOSGI")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getLinkOSGI();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getNodeOSGI")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getNodeOSGI();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C._OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C._OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("_OSU_AVQ_ASQ_OPE_OPC_ECI")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C._OSU_AVQ_ASQ_OPE_OPC_ECI();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getUnicornJSplitPane")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getUnicornJSplitPane();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getUnicornSplitPaneUI")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getUnicornSplitPaneUI();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getUnicornScrollBarUI")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getUnicornScrollBarUI();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getUnicornTreeCellRenderer")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getUnicornTreeCellRenderer();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getUnicornTreeUI")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getUnicornTreeUI();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getCacuString")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getCacuString();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getUnicornSplitPaneUI")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getUnicornSplitPaneUI();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getCheckRangeVPS")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getCheckRangeVPS();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getChooseQ_VPS")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getChooseQ_VPS();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getDrawArrowVPS")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getDrawArrowVPS();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getDrawFlashSide")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getDrawFlashSide();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getDrawSinLineVPS")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getDrawSinLineVPS();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getDynamicLineU_VPS")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getDynamicLineU_VPS();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getLinkList")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getLinkList();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getLinkNode")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getLinkNode();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getSort")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getSort();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getU_RelatedLineVPS")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getU_RelatedLineVPS();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getOSGI_chansfer")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C.getOSGI_chansfer((LinkNode)inputValues.get(��������[����++])
						, (LinkNode)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("_OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapE_IDUQ_C._OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register(
						(Object[][])inputValues.get(��������[����++])
						, (JTextPane)inputValues.get(��������[����++]), (App)inputValues.get(��������[����++])
						, (A)inputValues.get(��������[����++])
						, (Map<String, String>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	public static void load(StaticFunctionMapE_IDUQ_E staticFunctionMapE_IDUQ_E) {
		// TODO Auto-generated method stub
		//�Ժ��װ
		staticFunctionMapE_IDUQ_E.annotationMap.put("getNodeInfo", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getNodeProject", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getCheckRange", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getChooseCheck", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getDrawArrow", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getDynamicLine_U", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getU_RelatedLine", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getLinkOSGI", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getNodeOSGI", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("_OSU_AVQ_ASQ_OPE_OPC_ECI", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getUnicornJSplitPane", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getUnicornScrollBarUI", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getUnicornSplitPaneUI", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getUnicornTreeCellRenderer", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getUnicornTreeUI", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getCacuString", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getNodeShow", "gUISample:tableData_old:text:popupMenu:u:_A:pos");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getCheckRangeVPS", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getChooseQ_VPS", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getDrawArrowVPS", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getDrawFlashSide", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getDrawSinLineVPS", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getDynamicLineU_VPS", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getLinkList", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getLinkNode", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getSort", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getU_RelatedLineVPS", "void");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getOSGI_chansfer", "node:first");
		staticFunctionMapE_IDUQ_E.annotationMap.put("_OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register", "tableData_old:text:u:_A:pos");
	}
	//etl engine
	public NodeInfo getNodeInfo();
	public NodeProject getNodeProject();
	public CheckRange getCheckRange();
	public ChooseCheck getChooseCheck();
	public DrawArrow getDrawArrow();
	public DynamicLine_U getDynamicLine_U();
	public U_RelatedLine getU_RelatedLine();
	public LinkOSGI getLinkOSGI();
	public NodeOSGI getNodeOSGI();
	//	public OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES _OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES();// protected
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI _OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI();
	public OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ _OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ();
	public OSU_AVQ_ASQ_OPE_OPC_ECI _OSU_AVQ_ASQ_OPE_OPC_ECI();
	//DrawArrowHead
	//DrawNeroCellMask31
	//DrawNeroCellMask32
	//DrawNeroCellMask33

	public UnicornJSplitPane getUnicornJSplitPane();
	public UnicornScrollBarUI getUnicornScrollBarUI();
	public UnicornSplitPaneUI getUnicornSplitPaneUI();
	public UnicornTreeCellRenderer getUnicornTreeCellRenderer();
	public UnicornTreeUI getUnicornTreeUI();
	public CacuString getCacuString();
	public NodeShow getNodeShow(GUISample gUISample, Object[][] tableData_old, JTextPane text, PopupMenu popupMenu, App u
			, A _A, Map<String, String> pos) throws IOException;
	public CheckRangeVPS getCheckRangeVPS();
	public ChooseQ_VPS getChooseQ_VPS();
	public DrawArrowVPS getDrawArrowVPS();
	public DrawFlashSide getDrawFlashSide();
	public DrawSinLineVPS getDrawSinLineVPS();
	public DynamicLineU_VPS getDynamicLineU_VPS();
	public LinkList getLinkList();
	public LinkNode getLinkNode();
	public Sort getSort();
	public U_RelatedLineVPS getU_RelatedLineVPS();

	public OSGI_chansfer getOSGI_chansfer(LinkNode node, LinkNode first);
	public OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register _OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register(
			Object[][] tableData_old, JTextPane text, App u, A _A, Map<String, String> pos);
}
