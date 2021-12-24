package SEM.bloom;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import ME.APM.VSQ.App;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import OSA.shell.PL_XA_E;
import OSA.shell.XA_ShellTable;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
//����Ȩ��+ ����= ������
//Refer��Դ������ ��DNA Ԫ���߻����ļ��� �����޶��汾 V039010912��
//֤���ţ���������-2021-L-00268255 (�л����񹲺͹� ���Ұ�Ȩ�Ǽ�����)
public interface StaticFunctionMapO_VECS_C {
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapO_VECS_E staticFunctionMapO_VECS_C, Map<String, Object> output) throws Exception {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("SortStringDemo")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.SortStringDemo();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("transactionLogin")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.transactionLogin((String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("transactionRegister")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.transactionRegister((String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("aCommonReadWay")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.aCommonReadWay((App)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("readDBInTXTWay")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.readDBInTXTWay((App)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("readDBInBaseWay")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.readDBInBaseWay((App)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("readDBInWebWay")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.readDBInWebWay((App)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("PLSQLSectionPanel")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.PLSQLSectionPanel((App)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("VPCSRestPanel")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.VPCSRestPanel((App)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("YouBiaoSectionPanel")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.YouBiaoSectionPanel((App)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("PL_XA_C")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.PL_XA_C();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinCondition")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfJoinCondition((Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinAggregation")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfJoinAggregation((Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinGetCulumns")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfJoinGetCulumns((Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinRelation")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfJoinRelation((Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfNestCondition")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfNestCondition((Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfNestAggregation")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfNestAggregation((Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfNestGetCulumns")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfNestGetCulumns((Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfNestRelation")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfNestRelation((Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttribute")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttribute((String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(Object)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("XA_ShellQ_Rows_E_main")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.XA_ShellQ_Rows_E_main((String[])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByTablePath")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByTablePath((String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfCondition")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfCondition((Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfAggregation")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfAggregation((Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfGetCulumns")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfGetCulumns((Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfPLETL")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfPLETL((Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfPLTCP")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfPLTCP((Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addNewSearchShellTable")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addNewSearchShellTable((String)inputValues.get(��������[����++]),(JTable)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getNewSearchShellTableSpecFromDefaultTableModel")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getNewSearchShellTableSpecFromDefaultTableModel((DefaultTableModel)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getNewSearchShellTableDataFromDefaultTableModel")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getNewSearchShellTableDataFromDefaultTableModel((DefaultTableModel)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getNewSearchShellTableRowsFromDefaultTableModel")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getNewSearchShellTableRowsFromDefaultTableModel((Object[])inputValues.get(��������[����++])
						,(DefaultTableModel)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addNewSearchShellTable")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addNewSearchShellTable((String)inputValues.get(��������[����++]), (JTable)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addNewSearchShellTableWithObjectData")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addNewSearchShellTableWithObjectData((String)inputValues.get(��������[����++])
						, (DefaultTableModel)inputValues.get(��������[����++]), (Object[][])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addNewSearchShellTable")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addNewSearchShellTable((String)inputValues.get(��������[����++]), (JTable)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addNewSearchShellTableWithObjectDataReflectionDBRows")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addNewSearchShellTableWithObjectDataReflectionDBRows((String)inputValues.get(��������[����++])
						, (DefaultTableModel)inputValues.get(��������[����++]), (Object[][])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addNewSearchShellTableReflectionDBRows")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addNewSearchShellTableReflectionDBRows((String)inputValues.get(��������[����++])
						, (Row[])inputValues.get(��������[����++]), (Object[][])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addInitSearchShellTable")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addInitSearchShellTable((App)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("doNeroFlow")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.doNeroFlow((JTextPane) inputValues.get(��������[����++]), (NodeShow) inputValues.get(��������[����++])
						, (LinkList) inputValues.get(��������[����++])
						, (String) inputValues.get(��������[����++]), (HashMap<String, Object>) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("ReadChinese")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.ReadChinese((App)inputValues.get(��������[����++]),(A)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("kernel")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.kernel((App)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getMedicineBookFeedbackZY")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getMedicineBookFeedbackZY((App)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getMedicineBookFeedbackXY")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getMedicineBookFeedbackXY((App)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}

		if(callFunctionKey.equalsIgnoreCase("getMedicineBookFeedbackZT")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getMedicineBookFeedbackZT((App)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getMedicineBookFeedbackXT")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getMedicineBookFeedbackXT((App)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getMedicineBookFeedbackYT")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getMedicineBookFeedbackYT((App)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getMedicineBookFeedback")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getMedicineBookFeedback((App)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("doSearch")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.doSearch((App)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("forwardDB")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.forwardDB((App)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++])
						, (Map<String, String>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("forwardVPC")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.forwardVPC((App)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++])
						, (Map<String, String>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("forwardVPCBackEnd")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.forwardVPCBackEnd((EmotionMap)inputValues.get(��������[����++]), (CogsBinaryForest_AE)inputValues.get(��������[����++])
						, (String) inputValues.get(��������[����++]), (Map<String, String>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("forwardVPCYangliaojing")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.forwardVPCYangliaojing((App)inputValues.get(��������[����++])
						, (String) inputValues.get(��������[����++]), (Map<String, String>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getCode")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getCode((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getFilePath")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getFilePath((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("E_pl_XA")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.E_pl_XA((String)inputValues.get(��������[����++]), (boolean)inputValues.get(��������[����++])
						, (Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("E_pl_XA")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.E_pl_XA((String)inputValues.get(��������[����++]), (boolean)inputValues.get(��������[����++])
						, (Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_AggregationLimitMap")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_AggregationLimitMap((String[])inputValues.get(��������[����++]), (List<Map<String, Object>>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_PletlLimitMap")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_PletlLimitMap((String[])inputValues.get(��������[����++]), (List<Map<String, Object>>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_PltcpLimitMap")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_PltcpLimitMap((String[])inputValues.get(��������[����++]), (List<Map<String, Object>>)inputValues.get(��������[����++])
						, (Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_Cache")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_Cache((String[])inputValues.get(��������[����++]), (List<Map<String, Object>>)inputValues.get(��������[����++])
						, (String)inputValues.get(��������[����++]), (Map<String, Object>)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_kernel")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_kernel((String) inputValues.get(��������[����++]), (File) inputValues.get(��������[����++])
						, (File) inputValues.get(��������[����++]), (BufferedReader) inputValues.get(��������[����++]), (String) inputValues.get(��������[����++])
						, (List<Map<String, Object>>) inputValues.get(��������[����++]), (Row) inputValues.get(��������[����++]), (Map<String, Object>) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_kernel_search")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_kernel_search((String) inputValues.get(��������[����++]), (File) inputValues.get(��������[����++])
						, (int) inputValues.get(��������[����++]), (Object[]) inputValues.get(��������[����++]), (Object[][]) inputValues.get(��������[����++])
						, (List<Map<String, Object>>) inputValues.get(��������[����++]), (Row) inputValues.get(��������[����++]), (Map<String, Object>) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("rowToRowMap")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.rowToRowMap((Row)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("rowMapToRow")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.rowMapToRow((Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_Map")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_Map((String[]) inputValues.get(��������[����++]), (List<Map<String, Object>>) inputValues.get(��������[����++])
						, (String) inputValues.get(��������[����++])
						, (Map<String, Object>) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getCulumnsMapWithAs")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getCulumnsMapWithAs((String[])inputValues.get(��������[����++]),(Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getCulumnsMap")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getCulumnsMap((String[])inputValues.get(��������[����++]),(Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_AndMap")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_AndMap((String[])inputValues.get(��������[����++]),(List<Map<String, Object>>)inputValues.get(��������[����++])
						,(List<Map<String, Object>>)inputValues.get(��������[����++]),(Map<String, Object>)inputValues.get(��������[����++])
						,(List<Map<String, Object>>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_OrMap")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_OrMap((String[])inputValues.get(��������[����++]),(List<Map<String, Object>>)inputValues.get(��������[����++])
						,(List<Map<String, Object>>)inputValues.get(��������[����++])
						,(Map<String, Object>)inputValues.get(��������[����++]),(List<Map<String, Object>>)inputValues.get(��������[����++])
						,(Map<String, Boolean>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_SetRoot")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_SetRoot((String[])inputValues.get(��������[����++]),(Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_BaseName")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_BaseName((String[])inputValues.get(��������[����++]),(Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_TableName")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_TableName((String[])inputValues.get(��������[����++]),(Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_ListNeedStart")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_ListNeedStart((String[])inputValues.get(��������[����++]),(Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_Join")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_Join((String[])inputValues.get(��������[����++]),(Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_E")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_E((String[])inputValues.get(��������[����++]),(Map<String, Object>)inputValues.get(��������[����++])
						,(boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_Check")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_Check((String)inputValues.get(��������[����++]),(Map<String, Object>)inputValues.get(��������[����++])
						,(boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_StoreValues")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_StoreValues((String[])inputValues.get(��������[����++]),(Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_fileOperations")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_fileOperations((String[])inputValues.get(��������[����++]),(Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceString")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceString((String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceStringWithFileName")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceStringWithFileName((String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(Map<String, String>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("start")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.start();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceStringWithFileName")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceStringWithFileName((String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(Map<String, String>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceStringWithFileType")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceStringWithFileType((String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceStringWithFileSize")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceStringWithFileSize((String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(long)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceStringWithFileLines")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceStringWithFileLines((String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(long)inputValues.get(��������[����++]),(long)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("mainShellReplace")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.mainShellReplace((String[])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceStringWithLogRecording")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceStringWithLogRecording((Map<String, String>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
	}

	public static void load(StaticFunctionMapO_VECS_E staticFunctionMapO_VECS_E) {	
		//�Ժ��װ
		staticFunctionMapO_VECS_E.annotationMap.put("SortStringDemo", "SortStringDemo");
		staticFunctionMapO_VECS_E.annotationMap.put("transactionLogin", "transactionLogin");
		staticFunctionMapO_VECS_E.annotationMap.put("transactionRegister", "transactionRegister");
		staticFunctionMapO_VECS_E.annotationMap.put("aCommonReadWay", "aCommonReadWay");
		staticFunctionMapO_VECS_E.annotationMap.put("readDBInTXTWay", "readDBInTXTWay");
		staticFunctionMapO_VECS_E.annotationMap.put("readDBInBaseWay", "readDBInBaseWay");
		staticFunctionMapO_VECS_E.annotationMap.put("readDBInWebWay", "readDBInWebWay");
		staticFunctionMapO_VECS_E.annotationMap.put("PLSQLSectionPanel", "PLSQLSectionPanel");
		staticFunctionMapO_VECS_E.annotationMap.put("VPCSRestPanel", "VPCSRestPanel");
		staticFunctionMapO_VECS_E.annotationMap.put("YouBiaoSectionPanel", "YouBiaoSectionPanel");
		staticFunctionMapO_VECS_E.annotationMap.put("PL_XA_C", "PL_XA_C");
		staticFunctionMapO_VECS_E.annotationMap.put("selectRowsByAttributesOfJoinCondition", "selectRowsByAttributesOfJoinCondition");
		staticFunctionMapO_VECS_E.annotationMap.put("selectRowsByAttributesOfJoinAggregation", "selectRowsByAttributesOfJoinAggregation");
		staticFunctionMapO_VECS_E.annotationMap.put("selectRowsByAttributesOfJoinGetCulumns", "selectRowsByAttributesOfJoinGetCulumns");
		staticFunctionMapO_VECS_E.annotationMap.put("selectRowsByAttributesOfJoinRelation", "selectRowsByAttributesOfJoinRelation");
		staticFunctionMapO_VECS_E.annotationMap.put("selectRowsByAttributesOfNestCondition", "selectRowsByAttributesOfNestCondition");
		staticFunctionMapO_VECS_E.annotationMap.put("selectRowsByAttributesOfNestAggregation", "selectRowsByAttributesOfNestAggregation");
		staticFunctionMapO_VECS_E.annotationMap.put("selectRowsByAttributesOfNestGetCulumns", "selectRowsByAttributesOfNestGetCulumns");
		staticFunctionMapO_VECS_E.annotationMap.put("selectRowsByAttributesOfNestRelation", "selectRowsByAttributesOfNestRelation");
		staticFunctionMapO_VECS_E.annotationMap.put("selectRowsByAttribute", "selectRowsByAttribute");
		staticFunctionMapO_VECS_E.annotationMap.put("XA_ShellQ_Rows_E_main", "XA_ShellQ_Rows_E_main");
		staticFunctionMapO_VECS_E.annotationMap.put("selectRowsByTablePath", "selectRowsByTablePath");
		staticFunctionMapO_VECS_E.annotationMap.put("selectRowsByAttributesOfCondition", "selectRowsByAttributesOfCondition");
		staticFunctionMapO_VECS_E.annotationMap.put("selectRowsByAttributesOfAggregation", "selectRowsByAttributesOfAggregation");
		staticFunctionMapO_VECS_E.annotationMap.put("selectRowsByAttributesOfGetCulumns", "selectRowsByAttributesOfGetCulumns");
		staticFunctionMapO_VECS_E.annotationMap.put("selectRowsByAttributesOfPLETL", "selectRowsByAttributesOfPLETL");
		staticFunctionMapO_VECS_E.annotationMap.put("selectRowsByAttributesOfPLTCP", "selectRowsByAttributesOfPLTCP");
		staticFunctionMapO_VECS_E.annotationMap.put("addNewSearchShellTable", "addNewSearchShellTable");
		staticFunctionMapO_VECS_E.annotationMap.put("getNewSearchShellTableSpecFromDefaultTableModel", "getNewSearchShellTableSpecFromDefaultTableModel");
		staticFunctionMapO_VECS_E.annotationMap.put("getNewSearchShellTableDataFromDefaultTableModel", "getNewSearchShellTableDataFromDefaultTableModel");
		staticFunctionMapO_VECS_E.annotationMap.put("getNewSearchShellTableRowsFromDefaultTableModel", "getNewSearchShellTableRowsFromDefaultTableModel");
		staticFunctionMapO_VECS_E.annotationMap.put("addNewSearchShellTable", "addNewSearchShellTable");
		staticFunctionMapO_VECS_E.annotationMap.put("addNewSearchShellTableWithObjectData", "addNewSearchShellTableWithObjectData");
		staticFunctionMapO_VECS_E.annotationMap.put("addNewSearchShellTable", "addNewSearchShellTable");
		staticFunctionMapO_VECS_E.annotationMap.put("addNewSearchShellTableWithObjectDataReflectionDBRows", "addNewSearchShellTableWithObjectDataReflectionDBRows");
		staticFunctionMapO_VECS_E.annotationMap.put("addNewSearchShellTableReflectionDBRows", "addNewSearchShellTableReflectionDBRows");
		staticFunctionMapO_VECS_E.annotationMap.put("addInitSearchShellTable", "addInitSearchShellTable");
		staticFunctionMapO_VECS_E.annotationMap.put("doNeroFlow", "doNeroFlow");
		staticFunctionMapO_VECS_E.annotationMap.put("ReadChinese", "ReadChinese");
		staticFunctionMapO_VECS_E.annotationMap.put("kernel", "kernel");
		staticFunctionMapO_VECS_E.annotationMap.put("getMedicineBookFeedbackZY", "getMedicineBookFeedbackZY");
		staticFunctionMapO_VECS_E.annotationMap.put("getMedicineBookFeedbackXY", "getMedicineBookFeedbackXY");
		
		staticFunctionMapO_VECS_E.annotationMap.put("getMedicineBookFeedbackZT", "getMedicineBookFeedbackZT");
		staticFunctionMapO_VECS_E.annotationMap.put("getMedicineBookFeedbackXT", "getMedicineBookFeedbackXT");
		staticFunctionMapO_VECS_E.annotationMap.put("getMedicineBookFeedbackYT", "getMedicineBookFeedbackYT");
		staticFunctionMapO_VECS_E.annotationMap.put("getMedicineBookFeedback", "getMedicineBookFeedback");
		staticFunctionMapO_VECS_E.annotationMap.put("doSearch", "doSearch");
		staticFunctionMapO_VECS_E.annotationMap.put("forwardDB", "forwardDB");
		staticFunctionMapO_VECS_E.annotationMap.put("forwardVPC", "forwardVPC");
		staticFunctionMapO_VECS_E.annotationMap.put("forwardVPCBackEnd", "forwardVPCBackEnd");
		staticFunctionMapO_VECS_E.annotationMap.put("forwardVPCYangliaojing", "forwardVPCYangliaojing");
		staticFunctionMapO_VECS_E.annotationMap.put("getCode", "getCode");
		staticFunctionMapO_VECS_E.annotationMap.put("getFilePath", "getFilePath");
		staticFunctionMapO_VECS_E.annotationMap.put("E_pl_XA", "E_pl_XA");
		staticFunctionMapO_VECS_E.annotationMap.put("E_pl_XA", "E_pl_XA");
		staticFunctionMapO_VECS_E.annotationMap.put("P_AggregationLimitMap", "P_AggregationLimitMap");
		staticFunctionMapO_VECS_E.annotationMap.put("P_PletlLimitMap", "P_PletlLimitMap");
		staticFunctionMapO_VECS_E.annotationMap.put("P_PltcpLimitMap", "P_PltcpLimitMap");
		staticFunctionMapO_VECS_E.annotationMap.put("P_Cache", "P_Cache");
		staticFunctionMapO_VECS_E.annotationMap.put("P_kernel", "P_kernel");
		staticFunctionMapO_VECS_E.annotationMap.put("P_kernel_search", "P_kernel_search");
		staticFunctionMapO_VECS_E.annotationMap.put("rowToRowMap", "rowToRowMap");
		staticFunctionMapO_VECS_E.annotationMap.put("rowMapToRow", "rowMapToRow");
		staticFunctionMapO_VECS_E.annotationMap.put("P_Map", "P_Map");
		staticFunctionMapO_VECS_E.annotationMap.put("getCulumnsMapWithAs", "getCulumnsMapWithAs");
		staticFunctionMapO_VECS_E.annotationMap.put("getCulumnsMap", "getCulumnsMap");
		staticFunctionMapO_VECS_E.annotationMap.put("P_AndMap", "P_AndMap");
		staticFunctionMapO_VECS_E.annotationMap.put("P_OrMap", "P_OrMap");
		staticFunctionMapO_VECS_E.annotationMap.put("P_SetRoot", "P_SetRoot");
		staticFunctionMapO_VECS_E.annotationMap.put("P_BaseName", "P_BaseName");
		staticFunctionMapO_VECS_E.annotationMap.put("P_TableName", "P_TableName");
		staticFunctionMapO_VECS_E.annotationMap.put("P_ListNeedStart", "P_ListNeedStart");
		staticFunctionMapO_VECS_E.annotationMap.put("P_Join", "P_Join");
		staticFunctionMapO_VECS_E.annotationMap.put("P_E", "P_E");
		staticFunctionMapO_VECS_E.annotationMap.put("P_Check", "P_Check");
		staticFunctionMapO_VECS_E.annotationMap.put("P_StoreValues", "P_StoreValues");
		staticFunctionMapO_VECS_E.annotationMap.put("P_fileOperations", "P_fileOperations");
		staticFunctionMapO_VECS_E.annotationMap.put("replaceString", "replaceString");
		staticFunctionMapO_VECS_E.annotationMap.put("replaceStringWithFileName", "replaceStringWithFileName");
		staticFunctionMapO_VECS_E.annotationMap.put("start", "start");
		staticFunctionMapO_VECS_E.annotationMap.put("replaceStringWithFileName", "replaceStringWithFileName");
		staticFunctionMapO_VECS_E.annotationMap.put("replaceStringWithFileType", "replaceStringWithFileType");
		staticFunctionMapO_VECS_E.annotationMap.put("replaceStringWithFileSize", "replaceStringWithFileSize");
		staticFunctionMapO_VECS_E.annotationMap.put("replaceStringWithFileLines", "replaceStringWithFileLines");
		staticFunctionMapO_VECS_E.annotationMap.put("mainShellReplace", "mainShellReplace");
		staticFunctionMapO_VECS_E.annotationMap.put("replaceStringWithLogRecording", "replaceStringWithLogRecording");
	}

	public void SortStringDemo(); //�Ժ�������
	//TransactionDelegate {�߼��� Ӧ�ýӿ��ԡ�
	public Map<String, Object> transactionLogin(String uEmail, String uPassword)throws Exception ;
	public Map<String, Object> transactionRegister(String uEmail, String uEmailEnsure
			, String uName, String uPassword, String uPassWDEnsure, String uAddress
			, String uPhone, String uWeChat, String uQq, String uAge,String uSex) throws Exception;

	//���ƾ�������
	//DBReadMode{
	public void aCommonReadWay(App app) throws IOException ;
	public void readDBInTXTWay(App app) throws IOException;
	public void readDBInBaseWay(App app) throws IOException;
	public void readDBInWebWay(App app) ;

	public OPM.ESU.admin.PLSQLSectionPanel PLSQLSectionPanel(App app);
	public OPM.ESU.admin.VPCSRestPanel  VPCSRestPanel(App app);
	public OPM.ESU.admin.YouBiaoSectionPanel YouBiaoSectionPanel(App app);

	//plsearchShell
	public OSA.shell.PL_XA_C PL_XA_C();
	// XA_ShellQ_JoinRows_E {
	public Object selectRowsByAttributesOfJoinCondition(Map<String, Object> object) throws IOException;
	public Object selectRowsByAttributesOfJoinAggregation(Map<String, Object> object) throws InstantiationException
	, IllegalAccessException, IOException;
	public Object selectRowsByAttributesOfJoinGetCulumns(Map<String, Object> object);
	public Object selectRowsByAttributesOfJoinRelation(Map<String, Object> object);

	//XA_ShellQ_NestRows_E {
	public Object selectRowsByAttributesOfNestCondition(Map<String, Object> object) throws IOException;
	public Object selectRowsByAttributesOfNestAggregation(Map<String, Object> object) throws InstantiationException
	, IllegalAccessException, IOException;
	public Object selectRowsByAttributesOfNestGetCulumns(Map<String, Object> object);
	public Object selectRowsByAttributesOfNestRelation(Map<String, Object> object);

	//XA_ShellQ_Rows_E {
	public List<Map<String, Object>> selectRowsByAttribute(String currentDB
			, String tableName, String culmnName, Object value) throws IOException;
	public void XA_ShellQ_Rows_E_main(String[] args);
	//���쿴���·����ҵ����ݿ� û�з�ҳ���Ժ�����һ���ļ������Ϊ3000 rows 
	//һҳ���Ȳ����ˣ�shell �ò���sheets�߼���
	//������20210927
	public Map<String, Object> selectRowsByTablePath(String tablePath, String pageBegin
			, String pageEnd, String direction) throws IOException;
	//db�滻shell�� 20210927
	public Object selectRowsByAttributesOfCondition(Map<String, Object> object) throws IOException;
	//20210927 ע���� �Ժ��滻
	//����Ƴ� plsearch �﷨�� plsql �﷨ͨ�ã� ������֮���plorm ͳһһ�ַ�ʽ��չ pladmin
	public List<Map<String, Object>> selectRowsByAttributesOfAggregation(Map<String, Object> object) throws InstantiationException
	, IllegalAccessException, IOException;
	public Object selectRowsByAttributesOfGetCulumns(Map<String, Object> object);
	//PLETL����һ�֮࣬��׼���ֳ�ȥ
	//������ 20211010
	public Object selectRowsByAttributesOfPLETL(Map<String, Object> object) throws InstantiationException, IllegalAccessException
	, IOException;
	public Object selectRowsByAttributesOfPLTCP(Map<String, Object> object) throws IOException;

	//XA_ShellTables{
	public Map<String, XA_ShellTable> searchShellTables= new HashMap<>();
	//�Ȱѽӿ����㣬������20210925
	//�����ɱ�ӳ��
	public boolean addNewSearchShellTable(String tableName, JTable jtable);

	//��sonar��ʽ�ظ���������
	public Object[] getNewSearchShellTableSpecFromDefaultTableModel(DefaultTableModel defaultTableModel) ;

	//��sonar��ʽ�ظ���������
	public Object[][] getNewSearchShellTableDataFromDefaultTableModel(DefaultTableModel defaultTableModel) ;

	//��Ƹ�row�Ľ�ϱ�map�ڴ�ṹ ����shell�ı�ͷ������
	public Row[] getNewSearchShellTableRowsFromDefaultTableModel(Object[] spec, DefaultTableModel defaultTableModel) ;

	//��Ƹ�row�Ľ�ϱ�map�ڴ�ṹ ����shell�ı�ͷ������
	public Row[] getNewSearchShellTableRowsFromDefaultTableModel(Object[] spec, Object[][] tableData) ;

	//����ӳ����shellӳ��,�ӿ�VPCS ���������Ժ����³´�л�á�
	public boolean addNewSearchShellTable(String tableName, DefaultTableModel defaultTableModel) ;

	//����ӳ����shellӳ��,�ӿ�VPCS ���������Ժ����³´�л�á� object data �Ժ�׼�� �� _S_ Ԫ���滻��
	public boolean addNewSearchShellTableWithObjectData(String tableName, DefaultTableModel defaultTableModel
			, Object[][] defaultTableData);

	//shellӳ���װ
	public boolean addNewSearchShellTable(String tableName, Object[][] defaultTableData
			, Object[] defaultTableDataSpec);

	//Reflection map ��ͷ��ʽ�洢
	//����ӳ����shellӳ��,�ӿ�VPCS ���������Ժ����³´�л�á� object data �Ժ�׼�� �� _S_ Ԫ���滻��
	public boolean addNewSearchShellTableWithObjectDataReflectionDBRows(String tableName, DefaultTableModel defaultTableModel
			, Object[][] defaultTableData) ;

	//Reflection map ��ͷ��ʽ�洢
	//shellӳ���װ
	public boolean addNewSearchShellTableReflectionDBRows(String tableName, Row[] rows
			, Object[] defaultTableDataSpec );

	//Ȼ���������ƾ���jtable��ȫ����������ļ����� ����shell ��װ�������ݿ���ڴ�ӳ����롣
	public boolean addInitSearchShellTable(App app);

	//PLETL_C{
	public boolean doNeroFlow(JTextPane rightBotJTextPane, NodeShow nodeView, LinkList first
			, String documentFlowAddress, HashMap<String, Object> inputMap);	
	//ReadChinese extends Thread implements Runnable{
	public OSI.AOP.neo.tts.ReadChinese ReadChinese(App app, A _A);

	//RestMedicinePort_E {	
	public App kernel(App app, String string);

	public Map<String, Object> getMedicineBookFeedbackZY(App app,String string);

	public Map<String, Object> getMedicineBookFeedbackXY(App app,String string) ;

	public Map<String, Object> getMedicineBookFeedbackZT(App app, String string) ;

	public Map<String, Object> getMedicineBookFeedbackXT(App app, String string) ;

	public Map<String, Object> getMedicineBookFeedbackYT(App app, String string);

	public Map<String, Object> getMedicineBookFeedback(App app, String string) ;
	public Object doSearch(App app, String string) ;


	//VPC extends ServerVPC_Standard {
	//�𲽷������������vpcs ֮��̳С�
	public String forwardDB(App app, String string, Map<String, String> data) throws Exception ;
	public String forwardVPC(App app, String string, Map<String, String> data) throws Exception ;

	//VPCBackEnd {
	//public static RestLoginPort restLoginPort;
	public String forwardVPCBackEnd(EmotionMap emotionMap, CogsBinaryForest_AE _A, String string, Map<String, String> data) 
			throws Exception;

	//VPCYangliaojing {
	public String forwardVPCYangliaojing(App app, String string, Map<String, String> data)throws Exception;
	public String getCode(String filePath) throws IOException;
	public String getFilePath(String string) ;

	//OSI.AOP.VPC.server ��������

	//PL ETL shell
	//E_pl_XA_E { 
	public Map<String, Object> E_pl_XA(String plSearch, boolean mod, Map<String, Object> output) throws Exception;
	public Map<String, Object> E_pl_XA(PL_XA_E orm, boolean b, Map<String, Object> output) throws Exception;

	//P_AO_pl_XA {
	public void P_AggregationLimitMap(String[] sets, List<Map<String, Object>> output) throws InstantiationException
	, IllegalAccessException, IOException;

	//�ֳ�ȥ
	public void P_PletlLimitMap(String[] sets, List<Map<String, Object>> obj);
	//P_AO_PLETL {
	public void P_PletlLimitMap(String[] sets, List<Map<String, Object>> output, Map<String, Object> object) 
			throws InstantiationException, IllegalAccessException, IOException;

	//P_AO_PLTCP {
	public void P_PltcpLimitMap(String[] sets, List<Map<String, Object>> output, Map<String, Object> object) throws IOException;
	//P_CO_pl_XA_XCDX_Cache extends P_CO_pl_XA_XCDX {
	public void P_Cache(String[] sets, List<Map<String, Object>> output, String tableName, Map<String, Object> object
			, String condition);

	//P_CO_pl_XA_XCDX_Kernel extends P_CO_pl_XA_XCDX {
	//�Ƚ��Ƿ�������ȡ���б���� ������ ������ 20210405
	//�����Ӳ�̲�ѯ��������ʶ��, ������������ݻ����ѯ�������� ���û�ù���, ʱ�������2019��1�º�, ���ȵ�ͨ��, ֮��˷Դ.
	//׼��������20210406 ������
	public void P_kernel(String temp, File readDBTableRowIndexCulumnFile, File readDBTableRowIndexFile
			, BufferedReader reader, String DBTableRowIndexPath, List<Map<String, Object>> output, Row bufferRow
			, Map<String, Object> rowMap) throws IOException;
	//P_kernel�ȱȸ��ƹ�����search shell����� ��Ҫ�滻�������ݿⴢֵ�� jtable����output 
	//��jtable���ݱ������ ������ݿ��dbӳ�䣬 ���������dma��ÿһ���ļ��ļ��ϣ�
	//DefaultTableModel �� Object[][] huaRuiJiJtable ��Ӧ DBTablePath
	//readDBTableRowIndexFile��Ӧ row id
	//huaRuiJiJtableCulumns ��Ӧ culumn
	//jtable  ̫�ϲ㣬������spec �ٶȻ������������object[][]  ��
	//������ 20210924
	//����һ�����⣬�ҵ�table db�Ƿ�����map �ṹ�� �Դ���ͷkey�� ��data �Ǿ��������߼�Ҫȫ���ĵ�
	public void P_kernel_search(String temp, File readDBTableRowIndexFile, int rowId, Object[] huaRuiJiJtableCulumns
			, Object[][] huaRuiJiJtable, List<Map<String, Object>> output, Row bufferRow, Map<String, Object> rowMap) 
					throws IOException;

	//P_CO_pl_XA_XCDX_Map extends P_CO_pl_XA_XCDX {
	//�Ժ��Ż���ͳһ�������������Ҫ��ת����2019-1-15 tin
	public   Map<String, Object> rowToRowMap(Row row);
	//��rowToRowMap �������� RowMapToRow һ����֤��2������С����ģ�ͣ�������һ����������㡣
	//������202109302339
	public Row rowMapToRow(Map<String, Object> map);

	//è��� ����pmap��output �����ˣ� ����һ������ȫ�����ˡ�20210927
	//���ùܣ���P_Map �ĳ� shellP_Map
	public void P_Map(String[] sets, List<Map<String, Object>> output, String tableName
			, Map<String, Object> object); 

	//P_I_CulumnsPL_XA {
	public Object getCulumnsMapWithAs(String[] sets, Map<String, Object> row);
	public Object getCulumnsMap(String[] sets,  Map<String, Object> row);
	public Object P_GetCulumnsMap(List<Map<String, Object>> obj, String[] getCulumnsValueArray);
	//P_RelationPL_XA {
	public void P_AndMap(String[] sets, List<Map<String, Object>> obj
			, List<Map<String, Object>> joinObj
			, Map<String, Object> object, List<Map<String, Object>> newObj) ;

	public void P_OrMap(String[] sets, List<Map<String, Object>> obj
			, List<Map<String, Object>> joinObj
			, Map<String, Object> object, List<Map<String, Object>> newObj
			, Map<String, Boolean> findinNewObj);

	//Pl_XA_Command_E {
	public void P_SetRoot(String[] acknowledge, Map<String, Object> output) throws Exception;

	public void P_BaseName(String[] acknowledge, Map<String, Object> object) ;

	public void P_TableName(String[] acknowledge, Map<String, Object> object);


	public void P_ListNeedStart(String[] acknowledge, Map<String, Object> object) ;

	public void P_Join(String[] acknowledge, Map<String, Object> object) ;

	public void P_E(String[] acknowledge, Map<String, Object> object, boolean mod) throws Exception;
	//���������, ��, ׼����֤ ������


	//plsql����ִ��ָ�� ���ڼ���� ������ 20210405
	public void P_Check(String acknowledge, Map<String, Object> object, boolean mod) throws Exception;
	public void P_StoreValues(String[] acknowledge, Map<String, Object> output);
	//֮��׼����Ƴɹ����� ���� ������ bean
	public void P_fileOperations(String[] acknowledge, Map<String, Object> output);

	//ShellReplace {
	public void replaceString(String fileDirectroyPath, String searchString, String needReplaceString) throws IOException ;

	//�Ժ���Ƴ�map���洢��ЩString����������
	public void replaceStringWithFileName(String fileDirectroyPath, String searchString
			, Map<String, String> conditions) throws IOException ;
	//�Ժ���߳�
	public void start() throws IOException ;

	//�ļ�����Ӧɸѡ
	public void replaceStringWithFileName(String fileDirectroyPath, String searchString
			, String needReplaceString, String fileName) throws IOException ;
	//�ļ���׺ɸѡ
	public void replaceStringWithFileType(String fileDirectroyPath, String searchString
			, String needReplaceString, String fileType) throws IOException;

	//�ļ���Сɸѡ
	public void replaceStringWithFileSize(String fileDirectroyPath, String searchString
			, String needReplaceString, long filesize_KB) throws IOException ;
	//�ļ���Сɸѡ
	public void replaceStringWithFileLines(String fileDirectroyPath, String searchString
			, String needReplaceString, long beginLine, long endLine) throws IOException ;
	public void mainShellReplace(String[] argv) throws IOException;
	//���һ�ּ򵥵�logģʽ�ȡ�
	public void replaceStringWithLogRecording(Map<String, String> conditions) throws IOException;
}
