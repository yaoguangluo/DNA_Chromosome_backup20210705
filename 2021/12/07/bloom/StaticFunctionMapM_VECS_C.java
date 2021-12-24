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
//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public interface StaticFunctionMapM_VECS_C {
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapM_VECS_E staticFunctionMapM_VECS_C, Map<String, Object> output) throws Exception {
		String[] 传参因子= (String[]) output.get("传参因子");
		int 因子= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfJoinCondition")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfJoinCondition((Map<String,Object>)inputValues.get(传参因子[因子++]), (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfJoinAggregation")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfJoinAggregation((Map<String,Object>)inputValues.get(传参因子[因子++]), (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfJoinGetCulumns")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfJoinGetCulumns((Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfJoinRelation")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfJoinRelation((Map<String,Object>)inputValues.get(传参因子[因子++]), (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "updateRowsByAttributesOfJoinRelation");
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinCondition")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.selectRowsByAttributesOfJoinCondition((Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  

		}//, "selectRowsByAttributesOfJoinCondition");
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinAggregation")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.selectRowsByAttributesOfJoinAggregation((Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "selectRowsByAttributesOfJoinAggregation");
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinGetCulumns")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.selectRowsByAttributesOfJoinGetCulumns((Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "selectRowsByAttributesOfJoinGetCulumns");
		if(callFunctionKey.equalsIgnoreCase("selectRowsByAttributesOfJoinRelation")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.selectRowsByAttributesOfJoinRelation((Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "selectRowsByAttributesOfJoinRelation");
		if(callFunctionKey.equalsIgnoreCase("insertRowByTablePathAndIndex")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.insertRowByTablePathAndIndex((String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]),(JSONObject)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "insertRowByTablePathAndIndex");
		if(callFunctionKey.equalsIgnoreCase("insertRowByBaseName")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.insertRowByBaseName((String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]),(JSONObject)inputValues.get(传参因子[因子++]),(boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "insertRowByBaseName");
		if(callFunctionKey.equalsIgnoreCase("IU_RowByAttributes")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.IU_RowByAttributes((Map<String,Object>)inputValues.get(传参因子[因子++]), (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "IU_RowByAttributes");
		if(callFunctionKey.equalsIgnoreCase("I_Table")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.I_Table((Map<String,Object>)inputValues.get(传参因子[因子++]), (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "I_Table");
		if(callFunctionKey.equalsIgnoreCase("deleteRowByTablePathAndIndex")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.deleteRowByTablePathAndIndex((String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]),(boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "deleteRowByTablePathAndIndex");
		if(callFunctionKey.equalsIgnoreCase("D_RowByAttributesOfCondition")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.D_RowByAttributesOfCondition((Map<String,Object>)inputValues.get(传参因子[因子++]), (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "D_RowByAttributesOfCondition");
		if(callFunctionKey.equalsIgnoreCase("updateRowByTablePathAndIndex")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowByTablePathAndIndex((String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]),(JSONObject)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "updateRowByTablePathAndIndex");
		if(callFunctionKey.equalsIgnoreCase("updateRowByTablePathAndAttribute")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowByTablePathAndAttribute((String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(JSONObject)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "updateRowByTablePathAndAttribute");
		if(callFunctionKey.equalsIgnoreCase("updateRowsByRecordConditions")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByRecordConditions((Map<String,Object>)inputValues.get(传参因子[因子++]), (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "updateRowsByRecordConditions");
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfCondition")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfCondition((Map<String,Object>)inputValues.get(传参因子[因子++]), (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "updateRowsByAttributesOfCondition");
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfAggregation")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfAggregation((Map<String,Object>)inputValues.get(传参因子[因子++]), (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "updateRowsByAttributesOfAggregation");
		if(callFunctionKey.equalsIgnoreCase("updateRowsByAttributesOfGetCulumns")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.updateRowsByAttributesOfGetCulumns((Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "updateRowsByAttributesOfGetCulumns");
		if(callFunctionKey.equalsIgnoreCase("E_PLSQL")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.E_PLSQL((String)inputValues.get(传参因子[因子++]), (boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "E_PLSQL");
		if(callFunctionKey.equalsIgnoreCase("E_PLORM")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.E_PLORM((PLORM_C)inputValues.get(传参因子[因子++]),(boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "E_PLORM");
		if(callFunctionKey.equalsIgnoreCase("P_AggregationLimitMap")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_AggregationLimitMap((String[])inputValues.get(传参因子[因子++]),(List<Map<String,Object>>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_AggregationLimitMap");
		if(callFunctionKey.equalsIgnoreCase("P_Cache")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_Cache((String[])inputValues.get(传参因子[因子++]),(List<Map<String,Object>>)inputValues.get(传参因子[因子++]),
						(String) inputValues.get(传参因子[因子++]), (String) inputValues.get(传参因子[因子++]), (Map<String,Object>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_Cache");
		if(callFunctionKey.equalsIgnoreCase("P_kernel")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_kernel((String)inputValues.get(传参因子[因子++]), (File) inputValues.get(传参因子[因子++]), (File) inputValues.get(传参因子[因子++])
						, (BufferedReader) inputValues.get(传参因子[因子++]), (String) inputValues.get(传参因子[因子++]), (List<Map<String,Object>>) inputValues.get(传参因子[因子++])
						, (Row) inputValues.get(传参因子[因子++]), (Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_kernel");
		if(callFunctionKey.equalsIgnoreCase("rowToRowMap")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.rowToRowMap((Row)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "rowToRowMap");
		if(callFunctionKey.equalsIgnoreCase("P_Map")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_Map((String[])inputValues.get(传参因子[因子++]),
						(List<Map<String,Object>>)inputValues.get(传参因子[因子++]), (String) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_Map");
		if(callFunctionKey.equalsIgnoreCase("P_Table")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_Table((String[])inputValues.get(传参因子[因子++]),
						(List<Map<String,Object>>)inputValues.get(传参因子[因子++]), (String) inputValues.get(传参因子[因子++])
						, (Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_Table");
		if(callFunctionKey.equalsIgnoreCase("getCulumnsMapWithAs")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.getCulumnsMapWithAs((String[])inputValues.get(传参因子[因子++]), (Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "getCulumnsMapWithAs");
		if(callFunctionKey.equalsIgnoreCase("getCulumnsMap")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.getCulumnsMap((String[])inputValues.get(传参因子[因子++]), (Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "getCulumnsMap");
		if(callFunctionKey.equalsIgnoreCase("P_GetCulumnsMap")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.P_GetCulumnsMap((List<Map<String,Object>>)inputValues.get(传参因子[因子++]),(String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_GetCulumnsMap");
		if(callFunctionKey.equalsIgnoreCase("P_AndMap")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_AndMap((String[])inputValues.get(传参因子[因子++]), (List<Map<String,Object>>)inputValues.get(传参因子[因子++])
						, (List<Map<String,Object>>)inputValues.get(传参因子[因子++]), (Map<String,Object>)inputValues.get(传参因子[因子++]), (List<Map<String,Object>>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_AndMap");
		if(callFunctionKey.equalsIgnoreCase("P_OrMap")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_OrMap((String[]) inputValues.get(传参因子[因子++]), (List<Map<String,Object>>) inputValues.get(传参因子[因子++])
						, (List<Map<String,Object>>) inputValues.get(传参因子[因子++]), (Map<String,Object>) inputValues.get(传参因子[因子++])
						, (List<Map<String,Object>>) inputValues.get(传参因子[因子++]), (Map<String,Boolean>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_OrMap");
		if(callFunctionKey.equalsIgnoreCase("P_SetRoot")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_SetRoot((String[])inputValues.get(传参因子[因子++]), (Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_SetRoot");
		if(callFunctionKey.equalsIgnoreCase("P_BaseName")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_BaseName((String[])inputValues.get(传参因子[因子++]), (Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_BaseName");
		if(callFunctionKey.equalsIgnoreCase("P_TableName")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_TableName((String[])inputValues.get(传参因子[因子++]), (Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_TableName");
		if(callFunctionKey.equalsIgnoreCase("P_ListNeedStart")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_ListNeedStart((String[])inputValues.get(传参因子[因子++]), (Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_ListNeedStart");
		if(callFunctionKey.equalsIgnoreCase("P_Join")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_Join((String[])inputValues.get(传参因子[因子++]), (Map<String,Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_Join");
		if(callFunctionKey.equalsIgnoreCase("P_E")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_E((String[])inputValues.get(传参因子[因子++]), (Map<String,Object>)inputValues.get(传参因子[因子++]),(boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_E");
		if(callFunctionKey.equalsIgnoreCase("P_Check")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_Check((String)inputValues.get(传参因子[因子++]),(Map<String,Object>)inputValues.get(传参因子[因子++]),(boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_Check");
		if(callFunctionKey.equalsIgnoreCase("wordsForestNotContainsKey")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.wordsForestNotContainsKey((Map<String,WordFrequency>)inputValues.get(传参因子[因子++])
						, (String)inputValues.get(传参因子[因子++]), (StringBuilder[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "wordsForestNotContainsKey");
		if(callFunctionKey.equalsIgnoreCase("prefixWordEqualZero")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.prefixWordEqualZero((Map<String,WordFrequency>) inputValues.get(传参因子[因子++])
						, (String) inputValues.get(传参因子[因子++]), (StringBuilder[]) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "prefixWordEqualZero");
		if(callFunctionKey.equalsIgnoreCase("wordsForestContainsKey")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.wordsForestContainsKey((Map<String,WordFrequency>) inputValues.get(传参因子[因子++])
						, (String) inputValues.get(传参因子[因子++]), (StringBuilder[]) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "wordsForestContainsKey");
		if(callFunctionKey.equalsIgnoreCase("WordFrequencyFindCheck")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.WordFrequencyFindCheck((Map<String,WordFrequency>) inputValues.get(传参因子[因子++])
						, (StringBuilder[]) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "WordFrequencyFindCheck");
		if(callFunctionKey.equalsIgnoreCase("WordFrequencyCompareCheck")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.WordFrequencyCompareCheck((Map<String,WordFrequency>) inputValues.get(传参因子[因子++])
						, (StringBuilder[]) inputValues.get(传参因子[因子++]),(String) inputValues.get(传参因子[因子++])); 
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "WordFrequencyCompareCheck");
		if(callFunctionKey.equalsIgnoreCase("sessionCheck")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionCheck((Token)inputValues.get(传参因子[因子++]),(TokenCerts)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionCheck");
		if(callFunctionKey.equalsIgnoreCase("sessionTokenUpdateByDNA")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionTokenUpdateByDNA((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionTokenUpdateByDNA");
		if(callFunctionKey.equalsIgnoreCase("sessionTokenCertsInitWithHumanWordsByDNA")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionTokenCertsInitWithHumanWordsByDNA((String)inputValues.get(传参因子[因子++]),(boolean)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionTokenCertsInitWithHumanWordsByDNA");
		if(callFunctionKey.equalsIgnoreCase("sessionTokenCertsInitWithHumanWordsByDNA_ETL")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionTokenCertsInitWithHumanWordsByDNA_ETL((String)inputValues.get(传参因子[因子++]),(boolean)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionTokenCertsInitWithHumanWordsByDNA_ETL");
		if(callFunctionKey.equalsIgnoreCase("sessionInitByTokenPDICertsDNA")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionInitByTokenPDICertsDNA((TokenCerts)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionInitByTokenPDICertsDNA");
		if(callFunctionKey.equalsIgnoreCase("sessionInitByTokenCertsDNA")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionInitByTokenCertsDNA((TokenCerts)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionInitByTokenCertsDNA");
		if(callFunctionKey.equalsIgnoreCase("sessionCheckWithOrderPDSKey")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionCheckWithOrderPDSKey((Token)inputValues.get(传参因子[因子++]),(TokenCerts)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionCheckWithOrderPDSKey");
		if(callFunctionKey.equalsIgnoreCase("sessionCheckWithPostPDSKey")){    //这接口惹毛我了，有时间我会写个文本阅读函数，智能替换字符串。
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.sessionCheckWithPostPDSKey((Token)inputValues.get(传参因子[因子++]),(TokenCerts)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "sessionCheckWithPostPDSKey");
		if(callFunctionKey.equalsIgnoreCase("arrayIntCheck")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayIntCheck((int[])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayIntCheck");
		if(callFunctionKey.equalsIgnoreCase("arrayIntFix")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayIntFix((int[])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayIntFix");
		if(callFunctionKey.equalsIgnoreCase("arrayLongCheck")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayLongCheck((long[])inputValues.get(传参因子[因子++]),(long)inputValues.get(传参因子[因子++]),(long)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayLongCheck");
		if(callFunctionKey.equalsIgnoreCase("arrayLongFix")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayLongFix((long[])inputValues.get(传参因子[因子++]),(long)inputValues.get(传参因子[因子++]),(long)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayLongFix");
		if(callFunctionKey.equalsIgnoreCase("arrayDoubleCheck")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayDoubleCheck((double[])inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayDoubleCheck");
		if(callFunctionKey.equalsIgnoreCase("arrayDoubleFix")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayDoubleFix((double[])inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayDoubleFix");
		if(callFunctionKey.equalsIgnoreCase("arrayFloatCheck")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayFloatCheck((float[])inputValues.get(传参因子[因子++]),(float)inputValues.get(传参因子[因子++]),(float)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayFloatCheck");
		if(callFunctionKey.equalsIgnoreCase("arrayFloatFix")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.arrayFloatFix((float[])inputValues.get(传参因子[因子++]),(float)inputValues.get(传参因子[因子++]),(float)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "arrayFloatFix");
		if(callFunctionKey.equalsIgnoreCase("currentSystemTimeCheck")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.currentSystemTimeCheck((long)inputValues.get(传参因子[因子++]), (long)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "currentSystemTimeCheck");
		if(callFunctionKey.equalsIgnoreCase("currentSystemTimeToUTC")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.currentSystemTimeToUTC((long)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "currentSystemTimeToUTC");
		if(callFunctionKey.equalsIgnoreCase("getTranslator")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.getTranslator();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "getTranslator");
		if(callFunctionKey.equalsIgnoreCase("ListSetsCheck")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.ListSetsCheck((List<Object>)inputValues.get(传参因子[因子++]), (String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "ListSetsCheck");
		if(callFunctionKey.equalsIgnoreCase("ListSetsFix")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.ListSetsFix((List<Object>)inputValues.get(传参因子[因子++]), (String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "ListSetsFix");
		if(callFunctionKey.equalsIgnoreCase("matrixCheck")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.matrixCheck((Object[][])inputValues.get(传参因子[因子++]), (String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "matrixCheck");
		if(callFunctionKey.equalsIgnoreCase("matrixFix")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.matrixFix((Object[][])inputValues.get(传参因子[因子++]), (String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "matrixFix");
		if(callFunctionKey.equalsIgnoreCase("checkNULL")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.checkNULL((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "checkNULL");
		if(callFunctionKey.equalsIgnoreCase("getCfxButton")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.getCfxButton((String)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),
						(int)inputValues.get(传参因子[因子++]),(Color)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "getCfxButton");
		if(callFunctionKey.equalsIgnoreCase("DetaButton")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.DetaButton((String)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),
						(int)inputValues.get(传参因子[因子++]),(Color)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "DetaButton");
		if(callFunctionKey.equalsIgnoreCase("YLJShowButton")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.YLJShowButton((String)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),
						(int)inputValues.get(传参因子[因子++]),(Color)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "YLJShowButton");
		if(callFunctionKey.equalsIgnoreCase("DetaIndexLabel")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.DetaIndexLabel((String)inputValues.get(传参因子[因子++]),(List<DetaLabel>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "DetaIndexLabel");
		if(callFunctionKey.equalsIgnoreCase("DetaLabel")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.DetaLabel((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "DetaLabel");
		if(callFunctionKey.equalsIgnoreCase("DetaSlider")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.DetaSlider((int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "DetaSlider");
		if(callFunctionKey.equalsIgnoreCase("DetabbedPane")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.DetabbedPane((int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(Color)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "DetabbedPane");
		if(callFunctionKey.equalsIgnoreCase("getColorTableRender")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.getColorTableRender();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "getColorTableRender");
		if(callFunctionKey.equalsIgnoreCase("CfxTextArea")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.CfxTextArea((String)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(Color)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "CfxTextArea");
		if(callFunctionKey.equalsIgnoreCase("CfxTextField")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.CfxTextField((String)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(Color)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "CfxTextField");
		if(callFunctionKey.equalsIgnoreCase("CfxTextPane")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapM_VECS_C.CfxTextPane((String)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(Color)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "CfxTextPane");
		if(callFunctionKey.equalsIgnoreCase("forwardToRestMap")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.forwardToRestMap((App)inputValues.get(传参因子[因子++]),(VPCSRequest)inputValues.get(传参因子[因子++]),(VPCSResponse)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "forwardToRestMap");
		if(callFunctionKey.equalsIgnoreCase("P_Rest")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_Rest((App)inputValues.get(传参因子[因子++]),(VPCSRequest)inputValues.get(传参因子[因子++]),(VPCSResponse)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_Rest");
		if(callFunctionKey.equalsIgnoreCase("P_RestDB")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P_RestDB((App)inputValues.get(传参因子[因子++]),(VPCSRequest)inputValues.get(传参因子[因子++]),(VPCSResponse)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P_RestDB");
		if(callFunctionKey.equalsIgnoreCase("P")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapM_VECS_C.P((String[]) inputValues.get(传参因子[因子++]), (Socket) inputValues.get(传参因子[因子++])
						,(CogsBinaryForest_AE) inputValues.get(传参因子[因子++]), (EmotionMap) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);  
		}//, "P");
	}
	public static void load(StaticFunctionMapM_VECS_E staticFunctionMapM_VECS_E) {
		// TODO Auto-generated method stub
		//稍后封装
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
	//比较是否有数据取出列表到输出 检验中 罗瑶光 20210405
	//这个走硬盘查询函数来标识下, 在我设计了数据缓存查询启动函数 后就没用过了, 时间点大概在2019年1月后, 我先调通下, 之后朔源.
	//准备验算下20210406 罗瑶光
	public void P_kernel(String temp, File readDBTableRowIndexCulumnFile, File readDBTableRowIndexFile, BufferedReader reader
			, String DBTableRowIndexPath, List<Map<String, Object>> output, Row bufferRow, Map<String, Object> rowMap) throws IOException;

	//P_ConditionPLSQL_XCDX_Map extends P_ConditionPLSQL_XCDX {
	//以后优化成统一对象输出，不需要再转换。2019-1-15 tin
	public Map<String, Object> rowToRowMap(Row row);
	public void P_Map(String[] sets, List<Map<String, Object>> output, String dBTablePath);

	//P_ConditionPLSQL_XCDX_Table extends P_ConditionPLSQL_XCDX {
	//plsql引擎函数获取表开始检查 罗瑶光 20210405  //奇怪了 这是一个没有读 缓存的plsql引擎,我准备对比下history
	//object 指令堆栈
	//output 数据行
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
	//plsql函数执行指令 正在检查中 罗瑶光 20210405
	public void P_Check(String acknowledge, Map<String, Object> object, boolean mod) throws Exception;

	//WordForestUtil {
	public void wordsForestNotContainsKey(Map<String, WordFrequency> outputList, String countWordNode, StringBuilder[] prefixWord);
	public void prefixWordEqualZero(Map<String, WordFrequency> outputList,String countWordNode, StringBuilder[] prefixWord);
	public void wordsForestContainsKey(Map<String, WordFrequency> outputList,String countWordNode, StringBuilder[] prefixWord);

	//WordFrequencyUtil {
	public void WordFrequencyFindCheck(Map<String, WordFrequency> outputList,StringBuilder[] fixWords) ;
	public void WordFrequencyCompareCheck(Map<String, WordFrequency> outputList, StringBuilder[] fixWords, String countWordNode) ;

	//SessionValidation{
	//序列检查, 用于并发条件下又没有缓存服务器额情况下.
	//用户注意, FullDNATokenPDI 是我目的用来做DNA搜索的, 在dna加密这里也可以用, 但是, 如果要用, 请谨慎修改.
	public boolean sessionCheck(Token token, TokenCerts tokenCerts);

	//序列使用一次便更新重置
	public Token sessionTokenUpdateByDNA(String password);

	//序列初始生成
	//可以将密码和时间都加载在这个humanWordsPassword中, 这样时间就不需要比对了.
	//我建议是码农别偷懒.
	public TokenCerts sessionTokenCertsInitWithHumanWordsByDNA(String humanWordsPassword, boolean bys, String lockBys);
	//区别上面非etl，稍后去重 罗瑶光20211107 用到initonETLSect;
	public TokenCerts sessionTokenCertsInitWithHumanWordsByDNA_ETL(String humanWordsPassword, boolean bys, String lockBys) ;

	//序列PDI初始生成走非Util函数
	public Token sessionInitByTokenPDICertsDNA(TokenCerts tokenCerts);
	//序列初始生成
	public Token sessionInitByTokenCertsDNA(TokenCerts tokenCerts) ;

	//序列 正序密文检查
	public boolean sessionCheckWithOrderPDSKey(Token token, TokenCerts tokenCerts) ;

	//序列 反序密文检查
	public boolean sessionCheckWithPostPDSKey(Token token, TokenCerts tokenCerts);

	//ArrayValidation{
	//以后 validation大体包括 check和fix， 2个部分。
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

	//今天描述下这个文件，早期张新杰给我一个csharp的按钮边框闪烁波纹， 我在美国被 卡拉森让牛怡然 给我把联想电脑格了，我在2014年设计etl的 分割按钮界面的时候
	//谷歌搜索的stackoverflow 有 甲骨文sun的官方 demo怎么设计 动态画组件。于是我设计了最早的detasplit 组件，那时候我肋感神经剧烈疼痛,搞了2个月就停止了
	//一停止我就不痛了，莫名前妻那时候让我去波音面试还//后来在画板中画节点的边缘画了比较丑的边缘。
	//，后来2016-7年之后我开始设计这个组件。, 最后一次和张新杰说话是201几年 一次我问 在国内普通ip怎么发布网站，他回我一句 花生壳，就把我给删了。
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
