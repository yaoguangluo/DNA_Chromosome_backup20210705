package SEM.bloom;

import java.awt.Color;
import java.io.BufferedReader; 
import java.io.File;
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.net.Socket; 
import java.util.List;
import java.util.Map; 

import org.json.JSONObject;
import com.sun.java.accessibility.util.Translator;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import ME.APM.VSQ.App;
import MVQ.button.CfxButton;
import MVQ.label.DetaLabel;
import MVQ.tableRender.ColorTableRender;
import MVQ.textpane.CfxTextPane;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import OEI.ME.analysis.E.CogsBinaryForest_AE; 
import OP.SM.AOP.MEC.SIQ.SM.reflection.Row; 
import OSI.AOP.MEC.SIQ.plorm.PLORM_C; 
import OSI.AOP.MS.VPC.server.VPCSRequest;
import OSI.AOP.MS.VPC.server.VPCSResponse; 
import PEU.P.dna.Token;
import PEU.P.dna.TokenCerts; 
//����Ȩ��+ ����= ������
//Refer��Դ������ ��DNA Ԫ���߻����ļ��� �����޶��汾 V039010912��
//֤���ţ���������-2021-L-00268255 (�л����񹲺͹� ���Ұ�Ȩ�Ǽ�����)
public interface StaticFunctionMapM_VECS_C {
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapM_VECS_E staticFunctionMapM_VECS_C, Map<String, Object> output) throws Exception {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfJoinCondition")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfJoinCondition((Map<String,Object>)inputValues.get(��������[����++]), (boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfJoinAggregation")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfJoinAggregation((Map<String,Object>)inputValues.get(��������[����++]), (boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfJoinGetCulumns")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfJoinGetCulumns((Map<String,Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfJoinRelation")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfJoinRelation((Map<String,Object>)inputValues.get(��������[����++]), (boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "updateRowsByAttributesOfJoinRelation");
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinCondition")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.selectRowsByAttributesOfJoinCondition((Map<String,Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  

		}//, "selectRowsByAttributesOfJoinCondition");
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinAggregation")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.selectRowsByAttributesOfJoinAggregation((Map<String,Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "selectRowsByAttributesOfJoinAggregation");
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinGetCulumns")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.selectRowsByAttributesOfJoinGetCulumns((Map<String,Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "selectRowsByAttributesOfJoinGetCulumns");
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinRelation")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.selectRowsByAttributesOfJoinRelation((Map<String,Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "selectRowsByAttributesOfJoinRelation");
		if(callFunctionKey.equalsIgnoreCase("insertRowByTablePathAndIndex")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.insertRowByTablePathAndIndex((String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]),(JSONObject)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "insertRowByTablePathAndIndex");
		if(callFunctionKey.equalsIgnoreCase("insertRowByBaseName")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.insertRowByBaseName((String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]),(JSONObject)inputValues.get(��������[����++]),(boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "insertRowByBaseName");
		if(callFunctionKey.equalsIgnoreCase("IU_RowByAttributes")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.IU_RowByAttributes((Map<String,Object>)inputValues.get(��������[����++]), (boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "IU_RowByAttributes");
		if(callFunctionKey.equalsIgnoreCase("I_Table")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.I_Table((Map<String,Object>)inputValues.get(��������[����++]), (boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "I_Table");
		if(callFunctionKey.equalsIgnoreCase("deleteRowByTablePathAndIndex")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.deleteRowByTablePathAndIndex((String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]),(boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "deleteRowByTablePathAndIndex");
		if(callFunctionKey.equalsIgnoreCase("D_RowByAttributesOfCondition")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.D_RowByAttributesOfCondition((Map<String,Object>)inputValues.get(��������[����++]), (boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "D_RowByAttributesOfCondition");
		if(callFunctionKey.equalsIgnoreCase("updateRowByTablePathAndIndex")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowByTablePathAndIndex((String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]),(JSONObject)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "updateRowByTablePathAndIndex");
		if(callFunctionKey.equalsIgnoreCase("updateRowByTablePathAndAttribute")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowByTablePathAndAttribute((String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(JSONObject)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "updateRowByTablePathAndAttribute");
		if(callFunctionKey.equalsIgnoreCase("updateRowsByRecordConditions")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByRecordConditions((Map<String,Object>)inputValues.get(��������[����++]), (boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "updateRowsByRecordConditions");
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfCondition")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfCondition((Map<String,Object>)inputValues.get(��������[����++]), (boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "updateRowsByAttributesOfCondition");
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfAggregation")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfAggregation((Map<String,Object>)inputValues.get(��������[����++]), (boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "updateRowsByAttributesOfAggregation");
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfGetCulumns")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfGetCulumns((Map<String,Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "updateRowsByAttributesOfGetCulumns");
		if(callFunctionKey.equalsIgnoreCase("E_PLSQL")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.E_PLSQL((String)inputValues.get(��������[����++]), (boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "E_PLSQL");
		if(callFunctionKey.equalsIgnoreCase("E_PLORM")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.E_PLORM((PLORM_C)inputValues.get(��������[����++]),(boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "E_PLORM");
		if(callFunctionKey.equalsIgnoreCase("P_AggregationLimitMap")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_AggregationLimitMap((String[])inputValues.get(��������[����++]),(List<Map<String,Object>>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_AggregationLimitMap");
		if(callFunctionKey.equalsIgnoreCase("P_Cache")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_Cache((String[])inputValues.get(��������[����++]),(List<Map<String,Object>>)inputValues.get(��������[����++]),
						(String) inputValues.get(��������[����++]), (String) inputValues.get(��������[����++]), (Map<String,Object>) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_Cache");
		if(callFunctionKey.equalsIgnoreCase("P_kernel")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_kernel((String)inputValues.get(��������[����++]), (File) inputValues.get(��������[����++]), (File) inputValues.get(��������[����++])
						, (BufferedReader) inputValues.get(��������[����++]), (String) inputValues.get(��������[����++]), (List<Map<String,Object>>) inputValues.get(��������[����++])
						, (Row) inputValues.get(��������[����++]), (Map<String,Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_kernel");
		if(callFunctionKey.equalsIgnoreCase("rowToRowMap")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.rowToRowMap((Row)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "rowToRowMap");
		if(callFunctionKey.equalsIgnoreCase("P_Map")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_Map((String[])inputValues.get(��������[����++]),
						(List<Map<String,Object>>)inputValues.get(��������[����++]), (String) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_Map");
		if(callFunctionKey.equalsIgnoreCase("P_Table")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_Table((String[])inputValues.get(��������[����++]),
						(List<Map<String,Object>>)inputValues.get(��������[����++]), (String) inputValues.get(��������[����++])
						, (Map<String,Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_Table");
		if(callFunctionKey.equalsIgnoreCase("getCulumnsMapWithAs")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.getCulumnsMapWithAs((String[])inputValues.get(��������[����++]), (Map<String,Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "getCulumnsMapWithAs");
		if(callFunctionKey.equalsIgnoreCase("getCulumnsMap")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.getCulumnsMap((String[])inputValues.get(��������[����++]), (Map<String,Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "getCulumnsMap");
		if(callFunctionKey.equalsIgnoreCase("P_GetCulumnsMap")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.P_GetCulumnsMap((List<Map<String,Object>>)inputValues.get(��������[����++]),(String[])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_GetCulumnsMap");
		if(callFunctionKey.equalsIgnoreCase("P_AndMap")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_AndMap((String[])inputValues.get(��������[����++]), (List<Map<String,Object>>)inputValues.get(��������[����++])
						, (List<Map<String,Object>>)inputValues.get(��������[����++]), (Map<String,Object>)inputValues.get(��������[����++]), (List<Map<String,Object>>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_AndMap");
		if(callFunctionKey.equalsIgnoreCase("P_OrMap")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_OrMap((String[]) inputValues.get(��������[����++]), (List<Map<String,Object>>) inputValues.get(��������[����++])
						, (List<Map<String,Object>>) inputValues.get(��������[����++]), (Map<String,Object>) inputValues.get(��������[����++])
						, (List<Map<String,Object>>) inputValues.get(��������[����++]), (Map<String,Boolean>) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_OrMap");
		if(callFunctionKey.equalsIgnoreCase("P_SetRoot")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_SetRoot((String[])inputValues.get(��������[����++]), (Map<String,Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_SetRoot");
		if(callFunctionKey.equalsIgnoreCase("P_BaseName")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_BaseName((String[])inputValues.get(��������[����++]), (Map<String,Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_BaseName");
		if(callFunctionKey.equalsIgnoreCase("P_TableName")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_TableName((String[])inputValues.get(��������[����++]), (Map<String,Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_TableName");
		if(callFunctionKey.equalsIgnoreCase("P_ListNeedStart")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_ListNeedStart((String[])inputValues.get(��������[����++]), (Map<String,Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_ListNeedStart");
		if(callFunctionKey.equalsIgnoreCase("P_Join")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_Join((String[])inputValues.get(��������[����++]), (Map<String,Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_Join");
		if(callFunctionKey.equalsIgnoreCase("P_E")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_E((String[])inputValues.get(��������[����++]), (Map<String,Object>)inputValues.get(��������[����++]),(boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_E");
		if(callFunctionKey.equalsIgnoreCase("P_Check")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_Check((String)inputValues.get(��������[����++]),(Map<String,Object>)inputValues.get(��������[����++]),(boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_Check");
		if(callFunctionKey.equalsIgnoreCase("wordsForestNotContainsKey")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.wordsForestNotContainsKey((Map<String,WordFrequency>)inputValues.get(��������[����++])
						, (String)inputValues.get(��������[����++]), (StringBuilder[])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "wordsForestNotContainsKey");
		if(callFunctionKey.equalsIgnoreCase("prefixWordEqualZero")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.prefixWordEqualZero((Map<String,WordFrequency>) inputValues.get(��������[����++])
						, (String) inputValues.get(��������[����++]), (StringBuilder[]) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "prefixWordEqualZero");
		if(callFunctionKey.equalsIgnoreCase("wordsForestContainsKey")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.wordsForestContainsKey((Map<String,WordFrequency>) inputValues.get(��������[����++])
						, (String) inputValues.get(��������[����++]), (StringBuilder[]) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "wordsForestContainsKey");
		if(callFunctionKey.equalsIgnoreCase("WordFrequencyFindCheck")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.WordFrequencyFindCheck((Map<String,WordFrequency>) inputValues.get(��������[����++])
						, (StringBuilder[]) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "WordFrequencyFindCheck");
		if(callFunctionKey.equalsIgnoreCase("WordFrequencyCompareCheck")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.WordFrequencyCompareCheck((Map<String,WordFrequency>) inputValues.get(��������[����++])
						, (StringBuilder[]) inputValues.get(��������[����++]),(String) inputValues.get(��������[����++])); 
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "WordFrequencyCompareCheck");
		if(callFunctionKey.equalsIgnoreCase("sessionCheck")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionCheck((Token)inputValues.get(��������[����++]),(TokenCerts)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionCheck");
		if(callFunctionKey.equalsIgnoreCase("sessionTokenUpdateByDNA")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionTokenUpdateByDNA((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionTokenUpdateByDNA");
		if(callFunctionKey.equalsIgnoreCase("sessionTokenCertsInitWithHumanWordsByDNA")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionTokenCertsInitWithHumanWordsByDNA((String)inputValues.get(��������[����++]),(boolean)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionTokenCertsInitWithHumanWordsByDNA");
		if(callFunctionKey.equalsIgnoreCase("sessionTokenCertsInitWithHumanWordsByDNA_ETL")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionTokenCertsInitWithHumanWordsByDNA_ETL((String)inputValues.get(��������[����++]),(boolean)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionTokenCertsInitWithHumanWordsByDNA_ETL");
		if(callFunctionKey.equalsIgnoreCase("sessionInitByTokenPDICertsDNA")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionInitByTokenPDICertsDNA((TokenCerts)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionInitByTokenPDICertsDNA");
		if(callFunctionKey.equalsIgnoreCase("sessionInitByTokenCertsDNA")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionInitByTokenCertsDNA((TokenCerts)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionInitByTokenCertsDNA");
		if(callFunctionKey.equalsIgnoreCase("sessionCheckWithOrderPDSKey")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionCheckWithOrderPDSKey((Token)inputValues.get(��������[����++]),(TokenCerts)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionCheckWithOrderPDSKey");
		if(callFunctionKey.equalsIgnoreCase("sessionCheckWithPostPDSKey")){    //��ӿ���ë���ˣ���ʱ���һ�д���ı��Ķ������������滻�ַ�����
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionCheckWithPostPDSKey((Token)inputValues.get(��������[����++]),(TokenCerts)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionCheckWithPostPDSKey");
		if(callFunctionKey.equalsIgnoreCase("arrayIntCheck")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayIntCheck((int[])inputValues.get(��������[����++]),(int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayIntCheck");
		if(callFunctionKey.equalsIgnoreCase("arrayIntFix")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayIntFix((int[])inputValues.get(��������[����++]),(int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayIntFix");
		if(callFunctionKey.equalsIgnoreCase("arrayLongCheck")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayLongCheck((long[])inputValues.get(��������[����++]),(long)inputValues.get(��������[����++]),(long)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayLongCheck");
		if(callFunctionKey.equalsIgnoreCase("arrayLongFix")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayLongFix((long[])inputValues.get(��������[����++]),(long)inputValues.get(��������[����++]),(long)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayLongFix");
		if(callFunctionKey.equalsIgnoreCase("arrayDoubleCheck")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayDoubleCheck((double[])inputValues.get(��������[����++]),(double)inputValues.get(��������[����++]),(double)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayDoubleCheck");
		if(callFunctionKey.equalsIgnoreCase("arrayDoubleFix")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayDoubleFix((double[])inputValues.get(��������[����++]),(double)inputValues.get(��������[����++]),(double)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayDoubleFix");
		if(callFunctionKey.equalsIgnoreCase("arrayFloatCheck")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayFloatCheck((float[])inputValues.get(��������[����++]),(float)inputValues.get(��������[����++]),(float)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayFloatCheck");
		if(callFunctionKey.equalsIgnoreCase("arrayFloatFix")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayFloatFix((float[])inputValues.get(��������[����++]),(float)inputValues.get(��������[����++]),(float)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayFloatFix");
		if(callFunctionKey.equalsIgnoreCase("currentSystemTimeCheck")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.currentSystemTimeCheck((long)inputValues.get(��������[����++]), (long)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "currentSystemTimeCheck");
		if(callFunctionKey.equalsIgnoreCase("currentSystemTimeToUTC")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.currentSystemTimeToUTC((long)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "currentSystemTimeToUTC");
		if(callFunctionKey.equalsIgnoreCase("getTranslator")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.getTranslator();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "getTranslator");
		if(callFunctionKey.equalsIgnoreCase("ListSetsCheck")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.ListSetsCheck((List<Object>)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "ListSetsCheck");
		if(callFunctionKey.equalsIgnoreCase("ListSetsFix")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.ListSetsFix((List<Object>)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "ListSetsFix");
		if(callFunctionKey.equalsIgnoreCase("matrixCheck")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.matrixCheck((Object[][])inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "matrixCheck");
		if(callFunctionKey.equalsIgnoreCase("matrixFix")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.matrixFix((Object[][])inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "matrixFix");
		if(callFunctionKey.equalsIgnoreCase("checkNULL")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.checkNULL((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "checkNULL");
		if(callFunctionKey.equalsIgnoreCase("getCfxButton")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.getCfxButton((String)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++]),
						(int)inputValues.get(��������[����++]),(Color)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "getCfxButton");
		if(callFunctionKey.equalsIgnoreCase("DetaButton")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.DetaButton((String)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++]),
						(int)inputValues.get(��������[����++]),(Color)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "DetaButton");
		if(callFunctionKey.equalsIgnoreCase("YLJShowButton")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.YLJShowButton((String)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++]),
						(int)inputValues.get(��������[����++]),(Color)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "YLJShowButton");
		if(callFunctionKey.equalsIgnoreCase("DetaIndexLabel")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.DetaIndexLabel((String)inputValues.get(��������[����++]),(List<DetaLabel>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "DetaIndexLabel");
		if(callFunctionKey.equalsIgnoreCase("DetaLabel")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.DetaLabel((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "DetaLabel");
		if(callFunctionKey.equalsIgnoreCase("DetaSlider")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.DetaSlider((int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "DetaSlider");
		if(callFunctionKey.equalsIgnoreCase("DetabbedPane")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.DetabbedPane((int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++]),(Color)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "DetabbedPane");
		if(callFunctionKey.equalsIgnoreCase("getColorTableRender")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.getColorTableRender();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "getColorTableRender");
		if(callFunctionKey.equalsIgnoreCase("CfxTextArea")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.CfxTextArea((String)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++]),(Color)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "CfxTextArea");
		if(callFunctionKey.equalsIgnoreCase("CfxTextField")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.CfxTextField((String)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++]),(Color)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "CfxTextField");
		if(callFunctionKey.equalsIgnoreCase("CfxTextPane")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.CfxTextPane((String)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++]),(Color)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "CfxTextPane");
		if(callFunctionKey.equalsIgnoreCase("forwardToRestMap")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.forwardToRestMap((App)inputValues.get(��������[����++]),(VPCSRequest)inputValues.get(��������[����++]),(VPCSResponse)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "forwardToRestMap");
		if(callFunctionKey.equalsIgnoreCase("P_Rest")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_Rest((App)inputValues.get(��������[����++]),(VPCSRequest)inputValues.get(��������[����++]),(VPCSResponse)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_Rest");
		if(callFunctionKey.equalsIgnoreCase("P_RestDB")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_RestDB((App)inputValues.get(��������[����++]),(VPCSRequest)inputValues.get(��������[����++]),(VPCSResponse)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_RestDB");
		if(callFunctionKey.equalsIgnoreCase("P")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P((String[]) inputValues.get(��������[����++]), (Socket) inputValues.get(��������[����++])
						,(CogsBinaryForest_AE) inputValues.get(��������[����++]), (EmotionMap) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P");
	}
	public static void load(StaticFunctionMapM_VECS_E staticFunctionMapM_VECS_E) {
		// TODO Auto-generated method stub
		//�Ժ��װ
		staticFunctionMapM_VECS_E.annotationMap.put("updateRowsByAttributesOfJoinCondition", "updateRowsByAttributesOfJoinCondition");
		staticFunctionMapM_VECS_E.annotationMap.put("updateRowsByAttributesOfJoinAggregation", "updateRowsByAttributesOfJoinAggregation");
		staticFunctionMapM_VECS_E.annotationMap.put("updateRowsByAttributesOfJoinGetCulumns", "updateRowsByAttributesOfJoinGetCulumns");
		staticFunctionMapM_VECS_E.annotationMap.put("updateRowsByAttributesOfJoinRelation", "updateRowsByAttributesOfJoinRelation");
		staticFunctionMapM_VECS_E.annotationMap.put("selectRowsByAttributesOfJoinCondition", "selectRowsByAttributesOfJoinCondition");
		staticFunctionMapM_VECS_E.annotationMap.put("selectRowsByAttributesOfJoinAggregation", "selectRowsByAttributesOfJoinAggregation");
		staticFunctionMapM_VECS_E.annotationMap.put("selectRowsByAttributesOfJoinGetCulumns", "selectRowsByAttributesOfJoinGetCulumns");
		staticFunctionMapM_VECS_E.annotationMap.put("selectRowsByAttributesOfJoinRelation", "selectRowsByAttributesOfJoinRelation");
		staticFunctionMapM_VECS_E.annotationMap.put("insertRowByTablePathAndIndex", "insertRowByTablePathAndIndex");
		staticFunctionMapM_VECS_E.annotationMap.put("insertRowByBaseName", "insertRowByBaseName");
		staticFunctionMapM_VECS_E.annotationMap.put("IU_RowByAttributes", "IU_RowByAttributes");
		staticFunctionMapM_VECS_E.annotationMap.put("I_Table", "I_Table");
		staticFunctionMapM_VECS_E.annotationMap.put("deleteRowByTablePathAndIndex", "deleteRowByTablePathAndIndex");
		staticFunctionMapM_VECS_E.annotationMap.put("D_RowByAttributesOfCondition", "D_RowByAttributesOfCondition");
		staticFunctionMapM_VECS_E.annotationMap.put("updateRowByTablePathAndIndex", "updateRowByTablePathAndIndex");
		staticFunctionMapM_VECS_E.annotationMap.put("updateRowByTablePathAndAttribute", "updateRowByTablePathAndAttribute");
		staticFunctionMapM_VECS_E.annotationMap.put("updateRowsByRecordConditions", "updateRowsByRecordConditions");
		staticFunctionMapM_VECS_E.annotationMap.put("updateRowsByAttributesOfCondition", "updateRowsByAttributesOfCondition");
		staticFunctionMapM_VECS_E.annotationMap.put("updateRowsByAttributesOfAggregation", "updateRowsByAttributesOfAggregation");
		staticFunctionMapM_VECS_E.annotationMap.put("updateRowsByAttributesOfGetCulumns", "updateRowsByAttributesOfGetCulumns");
		staticFunctionMapM_VECS_E.annotationMap.put("E_PLSQL", "E_PLSQL");
		staticFunctionMapM_VECS_E.annotationMap.put("E_PLORM", "E_PLORM");
		staticFunctionMapM_VECS_E.annotationMap.put("P_AggregationLimitMap", "P_AggregationLimitMap");
		staticFunctionMapM_VECS_E.annotationMap.put("P_Cache", "P_Cache");
		staticFunctionMapM_VECS_E.annotationMap.put("P_kernel", "P_kernel");
		staticFunctionMapM_VECS_E.annotationMap.put("rowToRowMap", "rowToRowMap");
		staticFunctionMapM_VECS_E.annotationMap.put("P_Map", "P_Map");
		staticFunctionMapM_VECS_E.annotationMap.put("P_Table", "P_Table");
		staticFunctionMapM_VECS_E.annotationMap.put("getCulumnsMapWithAs", "getCulumnsMapWithAs");
		staticFunctionMapM_VECS_E.annotationMap.put("getCulumnsMap", "getCulumnsMap");
		staticFunctionMapM_VECS_E.annotationMap.put("P_GetCulumnsMap", "P_GetCulumnsMap");
		staticFunctionMapM_VECS_E.annotationMap.put("P_AndMap", "P_AndMap");
		staticFunctionMapM_VECS_E.annotationMap.put("P_OrMap", "P_OrMap");
		staticFunctionMapM_VECS_E.annotationMap.put("P_SetRoot", "P_SetRoot");
		staticFunctionMapM_VECS_E.annotationMap.put("P_BaseName", "P_BaseName");
		staticFunctionMapM_VECS_E.annotationMap.put("P_TableName", "P_TableName");
		staticFunctionMapM_VECS_E.annotationMap.put("P_ListNeedStart", "P_ListNeedStart");
		staticFunctionMapM_VECS_E.annotationMap.put("P_Join", "P_Join");
		staticFunctionMapM_VECS_E.annotationMap.put("P_E", "P_E");
		staticFunctionMapM_VECS_E.annotationMap.put("P_Check", "P_Check");
		staticFunctionMapM_VECS_E.annotationMap.put("wordsForestNotContainsKey", "wordsForestNotContainsKey");
		staticFunctionMapM_VECS_E.annotationMap.put("prefixWordEqualZero", "prefixWordEqualZero");
		staticFunctionMapM_VECS_E.annotationMap.put("wordsForestContainsKey", "wordsForestContainsKey");
		staticFunctionMapM_VECS_E.annotationMap.put("WordFrequencyFindCheck", "WordFrequencyFindCheck");
		staticFunctionMapM_VECS_E.annotationMap.put("WordFrequencyCompareCheck", "WordFrequencyCompareCheck");
		staticFunctionMapM_VECS_E.annotationMap.put("sessionCheck", "sessionCheck");
		staticFunctionMapM_VECS_E.annotationMap.put("sessionTokenUpdateByDNA", "sessionTokenUpdateByDNA");
		staticFunctionMapM_VECS_E.annotationMap.put("sessionTokenCertsInitWithHumanWordsByDNA", "sessionTokenCertsInitWithHumanWordsByDNA");
		staticFunctionMapM_VECS_E.annotationMap.put("sessionTokenCertsInitWithHumanWordsByDNA_ETL", "sessionTokenCertsInitWithHumanWordsByDNA_ETL");
		staticFunctionMapM_VECS_E.annotationMap.put("sessionInitByTokenPDICertsDNA", "sessionInitByTokenPDICertsDNA");
		staticFunctionMapM_VECS_E.annotationMap.put("sessionInitByTokenCertsDNA", "sessionInitByTokenCertsDNA");
		staticFunctionMapM_VECS_E.annotationMap.put("sessionCheckWithOrderPDSKey", "sessionCheckWithOrderPDSKey");
		staticFunctionMapM_VECS_E.annotationMap.put("sessionCheckWithPostPDSKey", "sessionCheckWithPostPDSKey");
		staticFunctionMapM_VECS_E.annotationMap.put("arrayIntCheck", "arrayIntCheck");
		staticFunctionMapM_VECS_E.annotationMap.put("arrayIntFix", "arrayIntFix");
		staticFunctionMapM_VECS_E.annotationMap.put("arrayLongCheck", "arrayLongCheck");
		staticFunctionMapM_VECS_E.annotationMap.put("arrayLongFix", "arrayLongFix");
		staticFunctionMapM_VECS_E.annotationMap.put("arrayDoubleCheck", "arrayDoubleCheck");
		staticFunctionMapM_VECS_E.annotationMap.put("arrayDoubleFix", "arrayDoubleFix");
		staticFunctionMapM_VECS_E.annotationMap.put("arrayFloatCheck", "arrayFloatCheck");
		staticFunctionMapM_VECS_E.annotationMap.put("arrayFloatFix", "arrayFloatFix");
		staticFunctionMapM_VECS_E.annotationMap.put("currentSystemTimeCheck", "currentSystemTimeCheck");
		staticFunctionMapM_VECS_E.annotationMap.put("currentSystemTimeToUTC", "currentSystemTimeToUTC");
		staticFunctionMapM_VECS_E.annotationMap.put("getTranslator", "getTranslator");
		staticFunctionMapM_VECS_E.annotationMap.put("ListSetsCheck", "ListSetsCheck");
		staticFunctionMapM_VECS_E.annotationMap.put("ListSetsFix", "ListSetsFix");
		staticFunctionMapM_VECS_E.annotationMap.put("matrixCheck", "matrixCheck");
		staticFunctionMapM_VECS_E.annotationMap.put("matrixFix", "matrixFix");
		staticFunctionMapM_VECS_E.annotationMap.put("checkNULL", "checkNULL");
		staticFunctionMapM_VECS_E.annotationMap.put("getCfxButton", "getCfxButton");
		staticFunctionMapM_VECS_E.annotationMap.put("DetaButton", "DetaButton");
		staticFunctionMapM_VECS_E.annotationMap.put("YLJShowButton", "YLJShowButton");
		staticFunctionMapM_VECS_E.annotationMap.put("DetaIndexLabel", "DetaIndexLabel");
		staticFunctionMapM_VECS_E.annotationMap.put("DetaLabel", "DetaLabel");
		staticFunctionMapM_VECS_E.annotationMap.put("DetaSlider", "DetaSlider");
		staticFunctionMapM_VECS_E.annotationMap.put("DetabbedPane", "DetabbedPane");
		staticFunctionMapM_VECS_E.annotationMap.put("getColorTableRender", "getColorTableRender");
		staticFunctionMapM_VECS_E.annotationMap.put("CfxTextArea", "CfxTextArea");
		staticFunctionMapM_VECS_E.annotationMap.put("CfxTextField", "CfxTextField");
		staticFunctionMapM_VECS_E.annotationMap.put("CfxTextPane", "CfxTextPane");
		staticFunctionMapM_VECS_E.annotationMap.put("forwardToRestMap", "forwardToRestMap");
		staticFunctionMapM_VECS_E.annotationMap.put("P_Rest", "P_Rest");
		staticFunctionMapM_VECS_E.annotationMap.put("P_RestDB", "P_RestDB");
		staticFunctionMapM_VECS_E.annotationMap.put("P", "P");
	}
	//database
	//static
	//U_JoinRows_E {
	public Object updateRowsByAttributesOfJoinCondition(Map<String, Object> object, boolean mod) throws IOException;
	public Object updateRowsByAttributesOfJoinAggregation(Map<String, Object> object, boolean mod);
	public Object updateRowsByAttributesOfJoinGetCulumns(Map<String, Object> object);
	public Object updateRowsByAttributesOfJoinRelation(Map<String, Object> object, boolean mod);

	//Q_JoinRows_E {
	public Object selectRowsByAttributesOfJoinCondition(Map<String, Object> object) throws IOException ;
	public Object selectRowsByAttributesOfJoinAggregation(Map<String, Object> object) ;
	public Object selectRowsByAttributesOfJoinGetCulumns(Map<String, Object> object) ;
	public Object selectRowsByAttributesOfJoinRelation(Map<String, Object> object) ;
	
	//IU_Rows_E {
	public Map<String, Object> insertRowByTablePathAndIndex(String tablePath, String pageIndex, JSONObject culumnOfNewRow) throws FileNotFoundException, IOException;
	public Map<String, Object> insertRowByBaseName(String baseName, String tableName, JSONObject jsobj, boolean mod) throws Exception;
	public void IU_RowByAttributes(Map<String, Object> object, boolean mod) throws Exception;
	
	//I_Tables_E {
	public void I_Table(Map<String, Object> object, boolean mod) throws Exception;
	
	//D_Rows_E {
	public Map<String, Object> deleteRowByTablePathAndIndex(String tablePath, String pageIndex, boolean mod)throws FileNotFoundException, IOException;
	public void D_RowByAttributesOfCondition(Map<String, Object> object, boolean mod) throws IOException;
	
	
	//U_Rows_E {
	public Map<String, Object> updateRowByTablePathAndIndex(String tablePath, String pageIndex,JSONObject jaculumnOfUpdateRow) throws FileNotFoundException, IOException;
	public Map<String, Object> updateRowByTablePathAndAttribute(String tablePath, String culumnName, String culumnValue, JSONObject jobj) throws IOException;
	public Object updateRowsByRecordConditions(Map<String, Object> object, boolean mod) throws IOException;
	public Object updateRowsByAttributesOfCondition(Map<String, Object> object, boolean mod) throws IOException;
	public List<Map<String, Object>> updateRowsByAttributesOfAggregation(Map<String, Object> object, boolean mod);
	public Object updateRowsByAttributesOfGetCulumns(Map<String, Object> object) ;

	//E_PLSQL_E {
	public Map<String, Object> E_PLSQL(String plsql, boolean mod) throws Exception;
	public Map<String, Object> E_PLORM(PLORM_C orm, boolean b) throws Exception;

	//P_AggregationPLSQL {
	public void P_AggregationLimitMap(String[] sets, List<Map<String, Object>> output);

	//P_ConditionPLSQL_XCDX_Cache extends P_ConditionPLSQL_XCDX {
	public void P_Cache(String[] sets, List<Map<String, Object>> output, String tableName, String baseName, Map<String, Object> object);

	//P_ConditionPLSQL_XCDX_Kernel extends P_ConditionPLSQL_XCDX {
	//�Ƚ��Ƿ�������ȡ���б���� ������ ������ 20210405
	//�����Ӳ�̲�ѯ��������ʶ��, ������������ݻ����ѯ�������� ���û�ù���, ʱ�������2019��1�º�, ���ȵ�ͨ��, ֮��˷Դ.
	//׼��������20210406 ������
	public void P_kernel(String temp, File readDBTableRowIndexCulumnFile, File readDBTableRowIndexFile, BufferedReader reader
			, String DBTableRowIndexPath, List<Map<String, Object>> output, Row bufferRow, Map<String, Object> rowMap) throws IOException;

	//P_ConditionPLSQL_XCDX_Map extends P_ConditionPLSQL_XCDX {
	//�Ժ��Ż���ͳһ�������������Ҫ��ת����2019-1-15 tin
	public Map<String, Object> rowToRowMap(Row row);
	public void P_Map(String[] sets, List<Map<String, Object>> output, String dBTablePath);

	//P_ConditionPLSQL_XCDX_Table extends P_ConditionPLSQL_XCDX {
	//plsql���溯����ȡ��ʼ��� ������ 20210405  //����� ����һ��û�ж� �����plsql����,��׼���Ա���history
	//object ָ���ջ
	//output ������
	public void P_Table(String[] sets, List<Map<String, Object>> output, String DBTablePath, Map<String, Object> object) throws IOException;

	//P_GetCulumnsPLSQL {
	public Object getCulumnsMapWithAs(String[] sets, Map<String, Object> row);
	public Object getCulumnsMap(String[] sets,  Map<String, Object> row);
	public Object P_GetCulumnsMap(List<Map<String, Object>> obj, String[] getCulumnsValueArray);

	//P_RelationPLSQL {
	public void P_AndMap(String[] sets, List<Map<String, Object>> obj, List<Map<String, Object>> joinObj
			, Map<String, Object> object, List<Map<String, Object>> newObj);

	public void P_OrMap(String[] sets, List<Map<String, Object>> obj, List<Map<String, Object>> joinObj
			, Map<String, Object> object, List<Map<String, Object>> newObj, Map<String, Boolean> findinNewObj);

	//PLSQLCommand_E {
	public void P_SetRoot(String[] acknowledge, Map<String, Object> output) throws Exception;
	public void P_BaseName(String[] acknowledge, Map<String, Object> object);
	public void P_TableName(String[] acknowledge, Map<String, Object> object);
	public void P_ListNeedStart(String[] acknowledge, Map<String, Object> object);
	public void P_Join(String[] acknowledge, Map<String, Object> object);
	public void P_E(String[] acknowledge, Map<String, Object> object, boolean mod) throws Exception;
	//plsql����ִ��ָ�� ���ڼ���� ������ 20210405
	public void P_Check(String acknowledge, Map<String, Object> object, boolean mod) throws Exception;

	//WordForestUtil {
	public void wordsForestNotContainsKey(Map<String, WordFrequency> outputList, String countWordNode, StringBuilder[] prefixWord);
	public void prefixWordEqualZero(Map<String, WordFrequency> outputList,String countWordNode, StringBuilder[] prefixWord);
	public void wordsForestContainsKey(Map<String, WordFrequency> outputList,String countWordNode, StringBuilder[] prefixWord);

	//WordFrequencyUtil {
	public void WordFrequencyFindCheck(Map<String, WordFrequency> outputList,StringBuilder[] fixWords) ;
	public void WordFrequencyCompareCheck(Map<String, WordFrequency> outputList, StringBuilder[] fixWords, String countWordNode) ;

	//SessionValidation{
	//���м��, ���ڲ�����������û�л���������������.
	//�û�ע��, FullDNATokenPDI ����Ŀ��������DNA������, ��dna��������Ҳ������, ����, ���Ҫ��, ������޸�.
	public boolean sessionCheck(Token token, TokenCerts tokenCerts);

	//����ʹ��һ�α��������
	public Token sessionTokenUpdateByDNA(String password);

	//���г�ʼ����
	//���Խ������ʱ�䶼���������humanWordsPassword��, ����ʱ��Ͳ���Ҫ�ȶ���.
	//�ҽ�������ũ��͵��.
	public TokenCerts sessionTokenCertsInitWithHumanWordsByDNA(String humanWordsPassword, boolean bys, String lockBys);
	//���������etl���Ժ�ȥ�� ������20211107 �õ�initonETLSect;
	public TokenCerts sessionTokenCertsInitWithHumanWordsByDNA_ETL(String humanWordsPassword, boolean bys, String lockBys) ;

	//����PDI��ʼ�����߷�Util����
	public Token sessionInitByTokenPDICertsDNA(TokenCerts tokenCerts);
	//���г�ʼ����
	public Token sessionInitByTokenCertsDNA(TokenCerts tokenCerts) ;

	//���� �������ļ��
	public boolean sessionCheckWithOrderPDSKey(Token token, TokenCerts tokenCerts) ;

	//���� �������ļ��
	public boolean sessionCheckWithPostPDSKey(Token token, TokenCerts tokenCerts);

	//ArrayValidation{
	//�Ժ� validation������� check��fix�� 2�����֡�
	public boolean arrayIntCheck(int[] array, int min, int max);
	public int[] arrayIntFix(int[] array, int min, int max);
	public boolean arrayLongCheck(long[] array, long min, long max);
	public long[] arrayLongFix(long[] array, long min, long max);
	public boolean arrayDoubleCheck(double[] array, double min, double max);
	public double[] arrayDoubleFix(double[] array, double min, double max);
	public boolean arrayFloatCheck(float[] array, float min, float max);
	public float[] arrayFloatFix(float[] array, float min, float max);

	//DateValidation{
	public boolean currentSystemTimeCheck(long offsetUTC8, long miliSecondsDistinction) throws IOException;
	public long currentSystemTimeToUTC(long offsetUTC8);

	//Translator
	public Translator getTranslator();

	//ListValidation{
	public boolean ListSetsCheck(List<Object> list, String setsType) ;
	public List<Object> ListSetsFix(List<Object> list, String setsType);

	//MatrixValidation{
	public boolean matrixCheck(Object[][] objects, String attribute);
	public Object[][] matrixFix(Object[][] objects, String attribute);

	//NullObject{
	public String checkNULL(Object object);
	public CfxButton getCfxButton(String string, final int x, final int y, java.awt.Color c);

	//��������������ļ����������½ܸ���һ��csharp�İ�ť�߿���˸���ƣ� ���������� ����ɭ��ţ��Ȼ ���Ұ�������Ը��ˣ�����2014�����etl�� �ָť�����ʱ��
	//�ȸ�������stackoverflow �� �׹���sun�Ĺٷ� demo��ô��� ��̬�����������������������detasplit �������ʱ�����߸��񾭾�����ʹ,����2���¾�ֹͣ��
	//һֹͣ�ҾͲ�ʹ�ˣ�Ī��ǰ����ʱ������ȥ�������Ի�//�����ڻ����л��ڵ�ı�Ե���˱Ƚϳ�ı�Ե��
	//������2016-7��֮���ҿ�ʼ�����������, ���һ�κ����½�˵����201���� һ������ �ڹ�����ͨip��ô������վ��������һ�� �����ǣ��Ͱ��Ҹ�ɾ�ˡ�
	public MVQ.button.DetaButton DetaButton(String string, final int x, final int y, java.awt.Color c);
	public MVQ.button.YLJShowButton YLJShowButton(String string, final int x, final int y, java.awt.Color c);

	//DetaIndexLabel extends JLabel implements MouseListener{
	public MVQ.label.DetaIndexLabel DetaIndexLabel(String name, List<DetaLabel> jFrameList);
	//DetaLabel extends JLabel{

	public MVQ.label.DetaLabel DetaLabel(String name);

	//DetaSlider extends JSlider{
	public MVQ.slider.DetaSlider DetaSlider(final int x, final int y); 

	//MVQ.tabbedpane 
	public MVQ.tabbedpane.DetabbedPane DetabbedPane(final int x, final int y, java.awt.Color c);

	//ColorTableRender
	public ColorTableRender getColorTableRender();

	//CfxTextArea extends JTextArea {
	public MVQ.textarea.CfxTextArea CfxTextArea(String string, final int x, final int y, java.awt.Color c);


	//MVQ.textfield;
	public CfxTextPane CfxTextField(String string, final int x, final int y, java.awt.Color c);

	//MVQ.textpane;
	public CfxTextPane CfxTextPane(String string, final int x, final int y, java.awt.Color c); 

	//vpcs
	
	//Forward_V extends ServerForward_Standard{
	public void forwardToRestMap(App app, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception;
	
	//RestMap_V extends ServerRestMap_Standard {
	public void P_Rest(App app, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception;	
	public void P_RestDB(App app, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception;
	
	//RestMap extends ServerForward_Standard{
	public void P(String[] type, Socket socket, CogsBinaryForest_AE _A, EmotionMap emotionMap) throws IOException;

	//un static
}
