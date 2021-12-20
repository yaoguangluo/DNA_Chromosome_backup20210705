package SEM.bloom;

import java.awt.Container;
import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.swing.JTextPane;

import ME.APM.VSQ.App;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash.GUISample;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import PEI.thread.MakeContainerSJFX;

//著作权人+ 作者= 罗瑶光
public interface StaticFunctionMapV_IDUQ_C {
	public static void load(StaticFunctionMapV_IDUQ_E staticFunctionMapV_IDUQ_E) {
		//稍后封装
		staticFunctionMapV_IDUQ_E.annotationMap.put("初始ETL", "初始ETL"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("仅仅初始ETL", "仅仅初始ETL"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("展示ETL", "展示ETL"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("ETL文档读取", "ETL文档读取"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("ETL文档执行", "ETL文档执行"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("ETL文档保存", "ETL文档保存"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("getOrigianlTextByLock", "getOrigianlTextByLock"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("Load", "Load"); 
	}

	public MakeContainerSJFX 初始ETL(App app, Container jpanelSecond);
	public GUISample 仅仅初始ETL(Object[][] tableData_old, JTextPane text, App u, CogsBinaryForest_AE _A, Map<String, String> pos);
	public void 展示ETL() throws IOException;
	public void ETL文档读取();
	public void ETL文档执行();
	public void ETL文档保存();

	// LoadFile{
	public String getOrigianlTextByLock(String inputString, String lockString);
	public LinkNode Load(LinkNode first, NodeShow nodeView, File file, LinkList thislist);
}
