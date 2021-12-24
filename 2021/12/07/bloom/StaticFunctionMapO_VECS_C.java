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
//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public interface StaticFunctionMapO_VECS_C {
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapO_VECS_E staticFunctionMapO_VECS_C, Map<String, Object> output) throws Exception {
		String[] 传参因子= (String[]) output.get("传参因子");
		int 因子= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("SortStringDemo")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.SortStringDemo();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("transactionLogin")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.transactionLogin((String)inputValues.get(传参因子[因子++]), (String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("transactionRegister")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.transactionRegister((String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("aCommonReadWay")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.aCommonReadWay((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("readDBInTXTWay")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.readDBInTXTWay((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("readDBInBaseWay")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.readDBInBaseWay((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("readDBInWebWay")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.readDBInWebWay((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("PLSQLSectionPanel")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.PLSQLSectionPanel((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("VPCSRestPanel")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.VPCSRestPanel((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("YouBiaoSectionPanel")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.YouBiaoSectionPanel((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("PL_XA_C")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.PL_XA_C();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinCondition")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfJoinCondition((Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinAggregation")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfJoinAggregation((Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinGetCulumns")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfJoinGetCulumns((Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinRelation")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfJoinRelation((Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfNestCondition")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfNestCondition((Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfNestAggregation")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfNestAggregation((Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfNestGetCulumns")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfNestGetCulumns((Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfNestRelation")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfNestRelation((Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttribute")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttribute((String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(Object)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("XA_ShellQ_Rows_E_main")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.XA_ShellQ_Rows_E_main((String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByTablePath")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByTablePath((String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfCondition")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfCondition((Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfAggregation")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfAggregation((Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfGetCulumns")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfGetCulumns((Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfPLETL")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfPLETL((Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfPLTCP")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.selectRowsByAttributesOfPLTCP((Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addNewSearchShellTable")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addNewSearchShellTable((String)inputValues.get(传参因子[因子++]),(JTable)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getNewSearchShellTableSpecFromDefaultTableModel")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getNewSearchShellTableSpecFromDefaultTableModel((DefaultTableModel)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getNewSearchShellTableDataFromDefaultTableModel")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getNewSearchShellTableDataFromDefaultTableModel((DefaultTableModel)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getNewSearchShellTableRowsFromDefaultTableModel")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getNewSearchShellTableRowsFromDefaultTableModel((Object[])inputValues.get(传参因子[因子++])
						,(DefaultTableModel)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addNewSearchShellTable")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addNewSearchShellTable((String)inputValues.get(传参因子[因子++]), (JTable)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addNewSearchShellTableWithObjectData")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addNewSearchShellTableWithObjectData((String)inputValues.get(传参因子[因子++])
						, (DefaultTableModel)inputValues.get(传参因子[因子++]), (Object[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addNewSearchShellTable")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addNewSearchShellTable((String)inputValues.get(传参因子[因子++]), (JTable)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addNewSearchShellTableWithObjectDataReflectionDBRows")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addNewSearchShellTableWithObjectDataReflectionDBRows((String)inputValues.get(传参因子[因子++])
						, (DefaultTableModel)inputValues.get(传参因子[因子++]), (Object[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addNewSearchShellTableReflectionDBRows")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addNewSearchShellTableReflectionDBRows((String)inputValues.get(传参因子[因子++])
						, (Row[])inputValues.get(传参因子[因子++]), (Object[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("addInitSearchShellTable")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.addInitSearchShellTable((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("doNeroFlow")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.doNeroFlow((JTextPane) inputValues.get(传参因子[因子++]), (NodeShow) inputValues.get(传参因子[因子++])
						, (LinkList) inputValues.get(传参因子[因子++])
						, (String) inputValues.get(传参因子[因子++]), (HashMap<String, Object>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("ReadChinese")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.ReadChinese((App)inputValues.get(传参因子[因子++]),(A)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("kernel")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.kernel((App)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getMedicineBookFeedbackZY")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getMedicineBookFeedbackZY((App)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getMedicineBookFeedbackXY")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getMedicineBookFeedbackXY((App)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}

		if(callFunctionKey.equalsIgnoreCase("getMedicineBookFeedbackZT")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getMedicineBookFeedbackZT((App)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getMedicineBookFeedbackXT")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getMedicineBookFeedbackXT((App)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getMedicineBookFeedbackYT")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getMedicineBookFeedbackYT((App)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getMedicineBookFeedback")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getMedicineBookFeedback((App)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("doSearch")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.doSearch((App)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("forwardDB")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.forwardDB((App)inputValues.get(传参因子[因子++]), (String)inputValues.get(传参因子[因子++])
						, (Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("forwardVPC")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.forwardVPC((App)inputValues.get(传参因子[因子++]), (String)inputValues.get(传参因子[因子++])
						, (Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("forwardVPCBackEnd")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.forwardVPCBackEnd((EmotionMap)inputValues.get(传参因子[因子++]), (CogsBinaryForest_AE)inputValues.get(传参因子[因子++])
						, (String) inputValues.get(传参因子[因子++]), (Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("forwardVPCYangliaojing")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.forwardVPCYangliaojing((App)inputValues.get(传参因子[因子++])
						, (String) inputValues.get(传参因子[因子++]), (Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getCode")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getCode((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getFilePath")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getFilePath((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("E_pl_XA")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.E_pl_XA((String)inputValues.get(传参因子[因子++]), (boolean)inputValues.get(传参因子[因子++])
						, (Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("E_pl_XA")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.E_pl_XA((String)inputValues.get(传参因子[因子++]), (boolean)inputValues.get(传参因子[因子++])
						, (Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_AggregationLimitMap")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_AggregationLimitMap((String[])inputValues.get(传参因子[因子++]), (List<Map<String, Object>>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_PletlLimitMap")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_PletlLimitMap((String[])inputValues.get(传参因子[因子++]), (List<Map<String, Object>>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_PltcpLimitMap")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_PltcpLimitMap((String[])inputValues.get(传参因子[因子++]), (List<Map<String, Object>>)inputValues.get(传参因子[因子++])
						, (Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_Cache")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_Cache((String[])inputValues.get(传参因子[因子++]), (List<Map<String, Object>>)inputValues.get(传参因子[因子++])
						, (String)inputValues.get(传参因子[因子++]), (Map<String, Object>)inputValues.get(传参因子[因子++]), (String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_kernel")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_kernel((String) inputValues.get(传参因子[因子++]), (File) inputValues.get(传参因子[因子++])
						, (File) inputValues.get(传参因子[因子++]), (BufferedReader) inputValues.get(传参因子[因子++]), (String) inputValues.get(传参因子[因子++])
						, (List<Map<String, Object>>) inputValues.get(传参因子[因子++]), (Row) inputValues.get(传参因子[因子++]), (Map<String, Object>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_kernel_search")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_kernel_search((String) inputValues.get(传参因子[因子++]), (File) inputValues.get(传参因子[因子++])
						, (int) inputValues.get(传参因子[因子++]), (Object[]) inputValues.get(传参因子[因子++]), (Object[][]) inputValues.get(传参因子[因子++])
						, (List<Map<String, Object>>) inputValues.get(传参因子[因子++]), (Row) inputValues.get(传参因子[因子++]), (Map<String, Object>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("rowToRowMap")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.rowToRowMap((Row)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("rowMapToRow")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.rowMapToRow((Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_Map")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_Map((String[]) inputValues.get(传参因子[因子++]), (List<Map<String, Object>>) inputValues.get(传参因子[因子++])
						, (String) inputValues.get(传参因子[因子++])
						, (Map<String, Object>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getCulumnsMapWithAs")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getCulumnsMapWithAs((String[])inputValues.get(传参因子[因子++]),(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("getCulumnsMap")) {   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_VECS_C.getCulumnsMap((String[])inputValues.get(传参因子[因子++]),(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_AndMap")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_AndMap((String[])inputValues.get(传参因子[因子++]),(List<Map<String, Object>>)inputValues.get(传参因子[因子++])
						,(List<Map<String, Object>>)inputValues.get(传参因子[因子++]),(Map<String, Object>)inputValues.get(传参因子[因子++])
						,(List<Map<String, Object>>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_OrMap")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_OrMap((String[])inputValues.get(传参因子[因子++]),(List<Map<String, Object>>)inputValues.get(传参因子[因子++])
						,(List<Map<String, Object>>)inputValues.get(传参因子[因子++])
						,(Map<String, Object>)inputValues.get(传参因子[因子++]),(List<Map<String, Object>>)inputValues.get(传参因子[因子++])
						,(Map<String, Boolean>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_SetRoot")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_SetRoot((String[])inputValues.get(传参因子[因子++]),(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_BaseName")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_BaseName((String[])inputValues.get(传参因子[因子++]),(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_TableName")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_TableName((String[])inputValues.get(传参因子[因子++]),(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_ListNeedStart")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_ListNeedStart((String[])inputValues.get(传参因子[因子++]),(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_Join")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_Join((String[])inputValues.get(传参因子[因子++]),(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_E")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_E((String[])inputValues.get(传参因子[因子++]),(Map<String, Object>)inputValues.get(传参因子[因子++])
						,(boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_Check")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_Check((String)inputValues.get(传参因子[因子++]),(Map<String, Object>)inputValues.get(传参因子[因子++])
						,(boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_StoreValues")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_StoreValues((String[])inputValues.get(传参因子[因子++]),(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("P_fileOperations")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.P_fileOperations((String[])inputValues.get(传参因子[因子++]),(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceString")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceString((String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceStringWithFileName")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceStringWithFileName((String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("start")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.start();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceStringWithFileName")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceStringWithFileName((String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceStringWithFileType")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceStringWithFileType((String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceStringWithFileSize")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceStringWithFileSize((String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(long)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceStringWithFileLines")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceStringWithFileLines((String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(long)inputValues.get(传参因子[因子++]),(long)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("mainShellReplace")) {  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.mainShellReplace((String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("replaceStringWithLogRecording")) { 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_VECS_C.replaceStringWithLogRecording((Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
	}

	public static void load(StaticFunctionMapO_VECS_E staticFunctionMapO_VECS_E) {	
		//稍后封装
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

	public void SortStringDemo(); //稍后重命名
	//TransactionDelegate {逻辑型 应用接口略。
	public Map<String, Object> transactionLogin(String uEmail, String uPassword)throws Exception ;
	public Map<String, Object> transactionRegister(String uEmail, String uEmailEnsure
			, String uName, String uPassword, String uPassWDEnsure, String uAddress
			, String uPhone, String uWeChat, String uQq, String uAge,String uSex) throws Exception;

	//养疗经读表函数
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
	//今天看了下发现我的数据库 没有分页，以后会设计一个文件夹最大为3000 rows 
	//一页，先不管了，shell 用不到sheets逻辑。
	//罗瑶光20210927
	public Map<String, Object> selectRowsByTablePath(String tablePath, String pageBegin
			, String pageEnd, String direction) throws IOException;
	//db替换shell中 20210927
	public Object selectRowsByAttributesOfCondition(Map<String, Object> object) throws IOException;
	//20210927 注释下 稍后替换
	//先设计成 plsearch 语法和 plsql 语法通用， 方便我之后的plorm 统一一种方式扩展 pladmin
	public List<Map<String, Object>> selectRowsByAttributesOfAggregation(Map<String, Object> object) throws InstantiationException
	, IllegalAccessException, IOException;
	public Object selectRowsByAttributesOfGetCulumns(Map<String, Object> object);
	//PLETL命令一多，之后准备分出去
	//罗瑶光 20211010
	public Object selectRowsByAttributesOfPLETL(Map<String, Object> object) throws InstantiationException, IllegalAccessException
	, IOException;
	public Object selectRowsByAttributesOfPLTCP(Map<String, Object> object) throws IOException;

	//XA_ShellTables{
	public Map<String, XA_ShellTable> searchShellTables= new HashMap<>();
	//先把接口做足，罗瑶光20210925
	//将表变成表映射
	public boolean addNewSearchShellTable(String tableName, JTable jtable);

	//按sonar方式重复函数分离
	public Object[] getNewSearchShellTableSpecFromDefaultTableModel(DefaultTableModel defaultTableModel) ;

	//按sonar方式重复函数分离
	public Object[][] getNewSearchShellTableDataFromDefaultTableModel(DefaultTableModel defaultTableModel) ;

	//设计个row的结合表map内存结构 用于shell的表头搜索。
	public Row[] getNewSearchShellTableRowsFromDefaultTableModel(Object[] spec, DefaultTableModel defaultTableModel) ;

	//设计个row的结合表map内存结构 用于shell的表头搜索。
	public Row[] getNewSearchShellTableRowsFromDefaultTableModel(Object[] spec, Object[][] tableData) ;

	//将表映射变成shell映射,接口VPCS 多样化，稍后做新陈代谢用。
	public boolean addNewSearchShellTable(String tableName, DefaultTableModel defaultTableModel) ;

	//将表映射变成shell映射,接口VPCS 多样化，稍后做新陈代谢用。 object data 稍后准备 用 _S_ 元基替换。
	public boolean addNewSearchShellTableWithObjectData(String tableName, DefaultTableModel defaultTableModel
			, Object[][] defaultTableData);

	//shell映射封装
	public boolean addNewSearchShellTable(String tableName, Object[][] defaultTableData
			, Object[] defaultTableDataSpec);

	//Reflection map 表头方式存储
	//将表映射变成shell映射,接口VPCS 多样化，稍后做新陈代谢用。 object data 稍后准备 用 _S_ 元基替换。
	public boolean addNewSearchShellTableWithObjectDataReflectionDBRows(String tableName, DefaultTableModel defaultTableModel
			, Object[][] defaultTableData) ;

	//Reflection map 表头方式存储
	//shell映射封装
	public boolean addNewSearchShellTableReflectionDBRows(String tableName, Row[] rows
			, Object[] defaultTableDataSpec );

	//然后所有养疗经的jtable表全部基于这个文件函数 进行shell 封装。与数据库的内存映射分离。
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
	//逐步分离出来，方便vpcs 之后继承。
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

	//OSI.AOP.VPC.server 启动例子

	//PL ETL shell
	//E_pl_XA_E { 
	public Map<String, Object> E_pl_XA(String plSearch, boolean mod, Map<String, Object> output) throws Exception;
	public Map<String, Object> E_pl_XA(PL_XA_E orm, boolean b, Map<String, Object> output) throws Exception;

	//P_AO_pl_XA {
	public void P_AggregationLimitMap(String[] sets, List<Map<String, Object>> output) throws InstantiationException
	, IllegalAccessException, IOException;

	//分出去
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
	//比较是否有数据取出列表到输出 检验中 罗瑶光 20210405
	//这个走硬盘查询函数来标识下, 在我设计了数据缓存查询启动函数 后就没用过了, 时间点大概在2019年1月后, 我先调通下, 之后朔源.
	//准备验算下20210406 罗瑶光
	public void P_kernel(String temp, File readDBTableRowIndexCulumnFile, File readDBTableRowIndexFile
			, BufferedReader reader, String DBTableRowIndexPath, List<Map<String, Object>> output, Row bufferRow
			, Map<String, Object> rowMap) throws IOException;
	//P_kernel等比复制过来的search shell组件， 我要替换的是数据库储值， jtable表做output 
	//把jtable数据表的数据 变成数据库的db映射， 传入参数是dma的每一行文件的集合，
	//DefaultTableModel 的 Object[][] huaRuiJiJtable 对应 DBTablePath
	//readDBTableRowIndexFile对应 row id
	//huaRuiJiJtableCulumns 对应 culumn
	//jtable  太上层，用它的spec 速度会很慢。所以用object[][]  先
	//罗瑶光 20210924
	//出现一个问题，我的table db是非线性map 结构， 自带表头key， 而data 是矩阵，下面逻辑要全部改掉
	public void P_kernel_search(String temp, File readDBTableRowIndexFile, int rowId, Object[] huaRuiJiJtableCulumns
			, Object[][] huaRuiJiJtable, List<Map<String, Object>> output, Row bufferRow, Map<String, Object> rowMap) 
					throws IOException;

	//P_CO_pl_XA_XCDX_Map extends P_CO_pl_XA_XCDX {
	//以后优化成统一对象输出，不需要再转换。2019-1-15 tin
	public   Map<String, Object> rowToRowMap(Row row);
	//将rowToRowMap 进行逆向 RowMapToRow 一来验证，2来找最小计算模型，方便下一步表格编译计算。
	//罗瑶光202109302339
	public Row rowMapToRow(Map<String, Object> map);

	//猫腻哥 把我pmap的output 都改了， 今天一查问题全出来了。20210927
	//懒得管，把P_Map 改成 shellP_Map
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
	//处理机中心, 别急, 准备验证 罗瑶光


	//plsql函数执行指令 正在检查中 罗瑶光 20210405
	public void P_Check(String acknowledge, Map<String, Object> object, boolean mod) throws Exception;
	public void P_StoreValues(String[] acknowledge, Map<String, Object> output);
	//之后准备设计成工厂类 或者 单例类 bean
	public void P_fileOperations(String[] acknowledge, Map<String, Object> output);

	//ShellReplace {
	public void replaceString(String fileDirectroyPath, String searchString, String needReplaceString) throws IOException ;

	//稍后设计成map来存储这些String条件变量。
	public void replaceStringWithFileName(String fileDirectroyPath, String searchString
			, Map<String, String> conditions) throws IOException ;
	//稍后变线程
	public void start() throws IOException ;

	//文件名对应筛选
	public void replaceStringWithFileName(String fileDirectroyPath, String searchString
			, String needReplaceString, String fileName) throws IOException ;
	//文件后缀筛选
	public void replaceStringWithFileType(String fileDirectroyPath, String searchString
			, String needReplaceString, String fileType) throws IOException;

	//文件大小筛选
	public void replaceStringWithFileSize(String fileDirectroyPath, String searchString
			, String needReplaceString, long filesize_KB) throws IOException ;
	//文件大小筛选
	public void replaceStringWithFileLines(String fileDirectroyPath, String searchString
			, String needReplaceString, long beginLine, long endLine) throws IOException ;
	public void mainShellReplace(String[] argv) throws IOException;
	//设计一种简单的log模式先。
	public void replaceStringWithLogRecording(Map<String, String> conditions) throws IOException;
}
