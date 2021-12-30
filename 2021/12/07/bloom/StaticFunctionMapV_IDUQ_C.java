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
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapV_IDUQ_E staticFunctionMapV_IDUQ_C
			, Map<String, Object> output) throws IOException {
		String[] 传参因子= (String[]) output.get("传参因子");
		int 因子= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("初始ETL")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_IDUQ_C.初始ETL((App) inputValues.get(传参因子[因子++])
						, (Container) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("仅仅初始ETL")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_IDUQ_C.仅仅初始ETL((Object[][]) inputValues.get(传参因子[因子++])
						, (JTextPane) inputValues.get(传参因子[因子++]), (App) inputValues.get(传参因子[因子++])
						, (CogsBinaryForest_AE) inputValues.get(传参因子[因子++])
						, (Map<String, String>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("展示ETL")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapV_IDUQ_C.展示ETL();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("ETL文档读取")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapV_IDUQ_C.ETL文档读取();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("ETL文档执行")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapV_IDUQ_C.ETL文档执行();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("ETL文档保")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapV_IDUQ_C.ETL文档保存();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getOrigianlTextByLock")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_IDUQ_C.getOrigianlTextByLock((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("Load")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_IDUQ_C.Load((LinkNode) inputValues.get(传参因子[因子++])
						, (NodeShow) inputValues.get(传参因子[因子++])
						, (File) inputValues.get(传参因子[因子++]), (LinkList) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	public static void load(StaticFunctionMapV_IDUQ_E staticFunctionMapV_IDUQ_E) {
		//稍后封装
		staticFunctionMapV_IDUQ_E.annotationMap.put("初始ETL", "app:jpanelSecond"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("仅仅初始ETL", "tableData_old:text:u:_A:pos"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("展示ETL", "void"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("ETL文档读取", "void"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("ETL文档执行", "void"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("ETL文档保存", "void"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("getOrigianlTextByLock", "inputString:lockString"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("Load", "first:nodeView:file:thislist"); 
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
