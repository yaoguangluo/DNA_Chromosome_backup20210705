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

//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public interface StaticFunctionMapE_IDUQ_C {

	public static void load(StaticFunctionMapE_IDUQ_E staticFunctionMapE_IDUQ_E) {
		// TODO Auto-generated method stub
		//稍后封装
		staticFunctionMapE_IDUQ_E.annotationMap.put("getNodeInfo", "getNodeInfo");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getNodeProject", "getNodeProject");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getCheckRange", "getCheckRange");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getChooseCheck", "getChooseCheck");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getDrawArrow", "getDrawArrow");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getDynamicLine_U", "getDynamicLine_U");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getU_RelatedLine", "getU_RelatedLine");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getLinkOSGI", "getLinkOSGI");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getNodeOSGI", "getNodeOSGI");
		staticFunctionMapE_IDUQ_E.annotationMap.put("_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI", "_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI");
		staticFunctionMapE_IDUQ_E.annotationMap.put("_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ", "_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ");
		staticFunctionMapE_IDUQ_E.annotationMap.put("_OSU_AVQ_ASQ_OPE_OPC_ECI", "_OSU_AVQ_ASQ_OPE_OPC_ECI");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getUnicornJSplitPane", "getUnicornJSplitPane");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getUnicornScrollBarUI", "getUnicornScrollBarUI");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getUnicornSplitPaneUI", "getUnicornSplitPaneUI");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getUnicornTreeCellRenderer", "getUnicornTreeCellRenderer");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getUnicornTreeUI", "getUnicornTreeUI");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getCacuString", "getCacuString");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getNodeShow", "getNodeShow");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getCheckRangeVPS", "getCheckRangeVPS");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getChooseQ_VPS", "getChooseQ_VPS");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getDrawArrowVPS", "getDrawArrowVPS");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getDrawFlashSide", "getDrawFlashSide");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getDrawSinLineVPS", "getDrawSinLineVPS");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getDynamicLineU_VPS", "getDynamicLineU_VPS");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getLinkList", "getLinkList");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getLinkNode", "getLinkNode");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getSort", "getSort");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getU_RelatedLineVPS", "getU_RelatedLineVPS");
		staticFunctionMapE_IDUQ_E.annotationMap.put("getOSGI_chansfer", "getOSGI_chansfer");
		staticFunctionMapE_IDUQ_E.annotationMap.put("_OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register", "_OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register");
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
	public OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register _OSI_OSU_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI_register(Object[][] tableData_old
			, JTextPane text, App u, A _A, Map<String, String> pos);
}
