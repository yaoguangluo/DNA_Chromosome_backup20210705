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

//����Ȩ��+ ����= ������
public interface StaticFunctionMapV_IDUQ_C {
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapV_IDUQ_E staticFunctionMapV_IDUQ_C
			, Map<String, Object> output) throws IOException {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("��ʼETL")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_IDUQ_C.��ʼETL((App) inputValues.get(��������[����++])
						, (Container) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("������ʼETL")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_IDUQ_C.������ʼETL((Object[][]) inputValues.get(��������[����++])
						, (JTextPane) inputValues.get(��������[����++]), (App) inputValues.get(��������[����++])
						, (CogsBinaryForest_AE) inputValues.get(��������[����++])
						, (Map<String, String>) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("չʾETL")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapV_IDUQ_C.չʾETL();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("ETL�ĵ���ȡ")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapV_IDUQ_C.ETL�ĵ���ȡ();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("ETL�ĵ�ִ��")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapV_IDUQ_C.ETL�ĵ�ִ��();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("ETL�ĵ���")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapV_IDUQ_C.ETL�ĵ�����();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getOrigianlTextByLock")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_IDUQ_C.getOrigianlTextByLock((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("Load")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_IDUQ_C.Load((LinkNode) inputValues.get(��������[����++])
						, (NodeShow) inputValues.get(��������[����++])
						, (File) inputValues.get(��������[����++]), (LinkList) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	public static void load(StaticFunctionMapV_IDUQ_E staticFunctionMapV_IDUQ_E) {
		//�Ժ��װ
		staticFunctionMapV_IDUQ_E.annotationMap.put("��ʼETL", "app:jpanelSecond"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("������ʼETL", "tableData_old:text:u:_A:pos"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("չʾETL", "void"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("ETL�ĵ���ȡ", "void"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("ETL�ĵ�ִ��", "void"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("ETL�ĵ�����", "void"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("getOrigianlTextByLock", "inputString:lockString"); 
		staticFunctionMapV_IDUQ_E.annotationMap.put("Load", "first:nodeView:file:thislist"); 
	}

	public MakeContainerSJFX ��ʼETL(App app, Container jpanelSecond);
	public GUISample ������ʼETL(Object[][] tableData_old, JTextPane text, App u, CogsBinaryForest_AE _A, Map<String, String> pos);
	public void չʾETL() throws IOException;
	public void ETL�ĵ���ȡ();
	public void ETL�ĵ�ִ��();
	public void ETL�ĵ�����();

	// LoadFile{
	public String getOrigianlTextByLock(String inputString, String lockString);
	public LinkNode Load(LinkNode first, NodeShow nodeView, File file, LinkList thislist);
}
