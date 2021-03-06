package SEM.bloom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import OCI.ME.analysis.C.A;
import PCI.ASQ.basic.RatioMatrix;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import PCI.ASQ.demension.Line2D;
import PCI.ASQ.demension.Line3D;

//进行了test 的main 整理，还没有测试，稍后。
//可以用的 一些老接口见 http://tinos.qicp.vip/data.html
//著作权人 + 作者 = 罗瑶光
public interface StaticFunctionMapP_VECS_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapP_VECS_E staticFunctionMapP_VECS_C
			, Map<String, Object> output) throws IOException
	, InstantiationException, IllegalAccessException {
		String[] 传参因子= (String[]) output.get("传参因子");
		int 因子= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("aNNTest")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.aNNTest((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "aNNTest");
		if(callFunctionKey.equalsIgnoreCase("dNNTest")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.dNNTest((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "dNNTest");
		if(callFunctionKey.equalsIgnoreCase("rNNTest")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.rNNTest((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "rNNTest");
		if(callFunctionKey.equalsIgnoreCase("sensingTest")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.sensingTest((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "sensingTest");
		if(callFunctionKey.equalsIgnoreCase("educationLevelTest")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapP_VECS_C.educationLevelTest((String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "educationLevelTest");
		if(callFunctionKey.equalsIgnoreCase("literarinessLevelTest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapP_VECS_C.literarinessLevelTest((String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "literarinessLevelTest");
		if(callFunctionKey.equalsIgnoreCase("successICATest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapP_VECS_C.successICATest((String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "successICATest");
		if(callFunctionKey.equalsIgnoreCase("getSideEnd2D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getSideEnd2D((List<AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getSideEnd2D");
		if(callFunctionKey.equalsIgnoreCase("getSideEnd3D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getSideEnd3D((List<AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getSideEnd3D");
		if(callFunctionKey.equalsIgnoreCase("addNewPositionWithoutHeart")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.addNewPositionWithoutHeart(
						(Map<Double,List<AMV_MVS_VSQ_2D>>) inputValues.get(传参因子[因子++])
						, (AMV_MVS_VSQ_2D) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "addNewPositionWithoutHeart");
		if(callFunctionKey.equalsIgnoreCase("addNewPositionWithHeart")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.addNewPositionWithHeart(
						(Map<Double, List<AMV_MVS_VSQ_2D>>) inputValues.get(传参因子[因子++]),
						(AMV_MVS_VSQ_2D) inputValues.get(传参因子[因子++])
						, (Map<Double, AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "addNewPositionWithHeart");
		if(callFunctionKey.equalsIgnoreCase("getShortestSamplePosition2DGroup")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getShortestSamplePosition2DGroup(
						(AMV_MVS_VSQ_2D) inputValues.get(传参因子[因子++])
						, (Map<Double, List<AMV_MVS_VSQ_2D>>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getShortestSamplePosition2DGroup");
		if(callFunctionKey.equalsIgnoreCase("getShorterSamplePosition2DGroupsWithScale")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getShorterSamplePosition2DGroupsWithScale(
						(AMV_MVS_VSQ_2D) inputValues.get(传参因子[因子++])
						, (Map<Double, List<AMV_MVS_VSQ_2D>>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getShorterSamplePosition2DGroupsWithScale");
		if(callFunctionKey.equalsIgnoreCase("getShortestSamplePosition3DGroup")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getShortestSamplePosition3DGroup(
						(AMV_MVS_VSQ_3D) inputValues.get(传参因子[因子++])
						, (Map<Double, List<AMV_MVS_VSQ_3D>>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getShortestSamplePosition3DGroup");
		if(callFunctionKey.equalsIgnoreCase("getShortestSamplePosition3DGroupsWithScale")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getShortestSamplePosition3DGroupsWithScale(
						(AMV_MVS_VSQ_3D) inputValues.get(传参因子[因子++])
						, (Map<Double, List<AMV_MVS_VSQ_3D>>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getShortestSamplePosition3DGroupsWithScale");
		if(callFunctionKey.equalsIgnoreCase("fissilePosition2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.fissilePosition2D(
						(List<AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fissilePosition2D");
		if(callFunctionKey.equalsIgnoreCase("fissilePosition3D")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.fissilePosition3D(
						(List<AMV_MVS_VSQ_3D>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fissilePosition3D");
		if(callFunctionKey.equalsIgnoreCase("fusionPosition2DwithHeart")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.fusionPosition2DwithHeart(
						(Map<Double, List<AMV_MVS_VSQ_2D>>) inputValues.get(传参因子[因子++]),
						(Map<Double, AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fusionPosition2DwithHeart");
		if(callFunctionKey.equalsIgnoreCase("fusionPosition3DwithHeart")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.fusionPosition3DwithHeart(
						(Map<Double, List<AMV_MVS_VSQ_3D>>) inputValues.get(传参因子[因子++]),
						(Map<Double, AMV_MVS_VSQ_3D>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fusionPosition3DwithHeart");
		if(callFunctionKey.equalsIgnoreCase("getTSPIsolationGroups2D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getTSPIsolationGroups2D(
						(List<AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getTSPIsolationGroups2D");
		if(callFunctionKey.equalsIgnoreCase("getTSPIsolationGroups3D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getTSPIsolationGroups3D(
						(List<AMV_MVS_VSQ_3D>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getTSPIsolationGroups3D");
		if(callFunctionKey.equalsIgnoreCase("getTSPForestIsolationGroups2D")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getTSPForestIsolationGroups2D(
						(List<AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getTSPForestIsolationGroups2D");
		if(callFunctionKey.equalsIgnoreCase("getTSPForestIsolationGroups3D")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getTSPForestIsolationGroups3D(
						(List<AMV_MVS_VSQ_3D>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getTSPForestIsolationGroups3D");
		if(callFunctionKey.equalsIgnoreCase("trackTracePosition2DHeartsWithSingerGroup")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.trackTracePosition2DHeartsWithSingerGroup(
						(List<AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "trackTracePosition2DHeartsWithSingerGroup");
		if(callFunctionKey.equalsIgnoreCase("trackTracePosition3DHeartsWithSingerGroup")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.trackTracePosition3DHeartsWithSingerGroup(
						(List<AMV_MVS_VSQ_3D>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "trackTracePosition3DHeartsWithSingerGroup");
		if(callFunctionKey.equalsIgnoreCase("trackTracePosition2DByHearts")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.trackTracePosition2DByHearts(
						(List<AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "trackTracePosition2DByHearts");
		if(callFunctionKey.equalsIgnoreCase("trackTracePosition3DByHearts")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.trackTracePosition3DByHearts(
						(List<AMV_MVS_VSQ_3D>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "trackTracePosition3DByHearts");
		if(callFunctionKey.equalsIgnoreCase("trackTracePosition2DHeartsWithFissileGroups")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.trackTracePosition2DHeartsWithFissileGroups(
						(List<AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "trackTracePosition2DHeartsWithFissileGroups");
		if(callFunctionKey.equalsIgnoreCase("trackTracePosition3DHeartsWithFissileGroups")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.trackTracePosition3DHeartsWithFissileGroups(
						(List<AMV_MVS_VSQ_3D>) inputValues.get(传参因子[因子++])
						, (double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "trackTracePosition3DHeartsWithFissileGroups");
		if(callFunctionKey.equalsIgnoreCase("findMeanDistanceFromPositions2D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanDistanceFromPositions2D(
						(List<AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++])
						, (double)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanDistanceFromPositions2D");
		if(callFunctionKey.equalsIgnoreCase("findMeanDistanceFromPositions3D")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanDistanceFromPositions3D(
						(List<AMV_MVS_VSQ_3D>) inputValues.get(传参因子[因子++])
						, (double)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanDistanceFromPositions3D");
		if(callFunctionKey.equalsIgnoreCase("findPascalMeanDistanceByEachPositions2D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findPascalMeanDistanceByEachPositions2D(
						(List<AMV_MVS_VSQ_2D>) inputValues.get(传参因子[因子++])
						, (double)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findPascalMeanDistanceByEachPositions2D");
		if(callFunctionKey.equalsIgnoreCase("findPascalMeanDistanceByEachPositions3D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findPascalMeanDistanceByEachPositions3D(
						(List<AMV_MVS_VSQ_3D>) inputValues.get(传参因子[因子++])
						, (double)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findPascalMeanDistanceByEachPositions3D");
		if(callFunctionKey.equalsIgnoreCase("getPosition2DsGroupPascalHearts")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPosition2DsGroupPascalHearts(
						(ArrayList<AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPosition2DsGroupPascalHearts");
		if(callFunctionKey.equalsIgnoreCase("getPosition3DsGroupPascalHearts")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPosition3DsGroupPascalHearts(
						(ArrayList<AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPosition3DsGroupPascalHearts");
		if(callFunctionKey.equalsIgnoreCase("getPosition2DsGroupPascalMids")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPosition2DsGroupPascalMids(
						(ArrayList<AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPosition2DsGroupPascalMids");

		if(callFunctionKey.equalsIgnoreCase("getPosition3DsGroupPascalMids")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPosition3DsGroupPascalMids(
						(ArrayList<AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPosition3DsGroupPascalMids");
		if(callFunctionKey.equalsIgnoreCase("getPosition2DsGroupPascalDirection")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPosition2DsGroupPascalDirection(
						(Map<Double,AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++])
						,(Map<Double,AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPosition2DsGroupPascalDirection");
		if(callFunctionKey.equalsIgnoreCase("getPosition3DsGroupPascalDirection")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPosition3DsGroupPascalDirection(
						(Map<Double,AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++])
						,(Map<Double,AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPosition3DsGroupPascalDirection");
		if(callFunctionKey.equalsIgnoreCase("getPosition3DsGroupPascalDirection")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPosition3DsGroupPascalDirection(
						(Map<Double,AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++])
						,(Map<Double,AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPosition3DsGroupPascalDirection");
		if(callFunctionKey.equalsIgnoreCase("getPosition2DsGroupPascalDirection")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPosition2DsGroupPascalDirection(
						(Map<Double,AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++])
						,(Map<Double,AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPosition2DsGroupPascalDirection");
		if(callFunctionKey.equalsIgnoreCase("getYaoguangLuo2DEulerRingTSP")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getYaoguangLuo2DEulerRingTSP(
						(List<AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getYaoguangLuo2DEulerRingTSP");
		if(callFunctionKey.equalsIgnoreCase("getYaoguangLuo3DEulerRingTSP")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getYaoguangLuo3DEulerRingTSP(
						(List<AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getYaoguangLuo3DEulerRingTSP");
		if(callFunctionKey.equalsIgnoreCase("getYaoguangLuo2DEulerRingTSP2D")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getYaoguangLuo2DEulerRingTSP2D(
						(List<AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getYaoguangLuo2DEulerRingTSP2D");
		if(callFunctionKey.equalsIgnoreCase("getYaoguangLuo3DEulerRingTSP2D")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getYaoguangLuo3DEulerRingTSP2D(
						(List<AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getYaoguangLuo3DEulerRingTSP2D");
		if(callFunctionKey.equalsIgnoreCase("getYaoguangLuo2DEulerRingTSP3D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getYaoguangLuo2DEulerRingTSP3D(
						(List<AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getYaoguangLuo2DEulerRingTSP3D");
		if(callFunctionKey.equalsIgnoreCase("getYaoguangLuo3DEulerRingTSP3D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getYaoguangLuo3DEulerRingTSP3D(
						(List<AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getYaoguangLuo3DEulerRingTSP3D");

		if(callFunctionKey.equalsIgnoreCase("getImagePix2DGroupFilter")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getImagePix2DGroupFilter(
						(int[][])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getImagePix2DGroupFilter");
		if(callFunctionKey.equalsIgnoreCase("getImagePix3DGroupFilter")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getImagePix3DGroupFilter(
						(int[][][])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getImagePix3DGroupFilter");
		if(callFunctionKey.equalsIgnoreCase("NLPBestSentenceMatch")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.NLPBestSentenceMatch(
						(String)inputValues.get(传参因子[因子++]),(String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "NLPBestSentenceMatch");
		if(callFunctionKey.equalsIgnoreCase("NLPBestSentencesMatch")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.NLPBestSentencesMatch(
						(String)inputValues.get(传参因子[因子++]),(String[])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "NLPBestSentencesMatch");
		if(callFunctionKey.equalsIgnoreCase("getNLPBestSentencesMatchScore")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getNLPBestSentencesMatchScore(
						(String)inputValues.get(传参因子[因子++]),(String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getNLPBestSentencesMatchScore");
		if(callFunctionKey.equalsIgnoreCase("getNLPBestSentencesMatchScoreRights")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getNLPBestSentencesMatchScoreRights(
						(String) inputValues.get(传参因子[因子++])
						, (String[]) inputValues.get(传参因子[因子++]), (A) inputValues.get(传参因子[因子++]),
						(Map<String, String>) inputValues.get(传参因子[因子++])
						, (Map<String, WordFrequency>) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getNLPBestSentencesMatchScoreRights");
		if(callFunctionKey.equalsIgnoreCase("getErrorAsserts")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getErrorAsserts((double)inputValues.get(传参因子[因子++])
						,(double[])inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getErrorAsserts");
		if(callFunctionKey.equalsIgnoreCase("getBinaryErrorAsserts")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getBinaryErrorAsserts(
						(double)inputValues.get(传参因子[因子++]),(double[])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(boolean)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getBinaryErrorAsserts");
		if(callFunctionKey.equalsIgnoreCase("findTotalIncrementWithScale")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findTotalIncrementWithScale((double)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findTotalIncrementWithScale");
		if(callFunctionKey.equalsIgnoreCase("findMeanIncrementWithScale")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanIncrementWithScale((double)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanIncrementWithScale");
		if(callFunctionKey.equalsIgnoreCase("findMeanOfFilterDoubleArrayWithScale")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanOfFilterDoubleArrayWithScale(
						(double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanOfFilterDoubleArrayWithScale");
		if(callFunctionKey.equalsIgnoreCase("findMeanOfDoubleArray")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanOfDoubleArray((double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanOfDoubleArray");
		if(callFunctionKey.equalsIgnoreCase("findMeanOfTwoDoubleArray")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanOfTwoDoubleArray(
						(Double[])inputValues.get(传参因子[因子++]),(Double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanOfTwoDoubleArray");
		if(callFunctionKey.equalsIgnoreCase("findMeanOfTwoDoubleArray2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanOfTwoDoubleArray2D(
						(Double[][])inputValues.get(传参因子[因子++]),(Double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanOfTwoDoubleArray2D");
		if(callFunctionKey.equalsIgnoreCase("findMeanOfDoubleMatrix2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanOfDoubleMatrix2D(
						(double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanOfDoubleMatrix2D");
		if(callFunctionKey.equalsIgnoreCase("findRowMeanOfDoubleMatrix2D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findRowMeanOfDoubleMatrix2D(
						(double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findRowMeanOfDoubleMatrix2D");
		if(callFunctionKey.equalsIgnoreCase("findCulumnMeanOfDoubleMatrix2D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findCulumnMeanOfDoubleMatrix2D(
						(double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findCulumnMeanOfDoubleMatrix2D");
		if(callFunctionKey.equalsIgnoreCase("findMeanOfDoubleMatrix3D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanOfDoubleMatrix3D(
						(double[][][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanOfDoubleMatrix3D");
		if(callFunctionKey.equalsIgnoreCase("findMeanOfDoubleList")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanOfDoubleList(
						(List<Double>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanOfDoubleList");
		if(callFunctionKey.equalsIgnoreCase("findMeanOfMartrix1DList")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanOfMartrix1DList(
						(List<Double[]>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanOfMartrix1DList");
		if(callFunctionKey.equalsIgnoreCase("findMeanOfMartrix2DList")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanOfMartrix2DList(
						(List<Double[][]>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanOfMartrix2DList");
		if(callFunctionKey.equalsIgnoreCase("findSumOfDoubleArray")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findSumOfDoubleArray(
						(double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findSumOfDoubleArray");	
		if(callFunctionKey.equalsIgnoreCase("findSumOfTwoDoubleArray")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findSumOfTwoDoubleArray(
						(Double[])inputValues.get(传参因子[因子++]),(Double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findSumOfTwoDoubleArray");
		if(callFunctionKey.equalsIgnoreCase("findSumOfTwoDoubleArray2D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findSumOfTwoDoubleArray2D(
						(Double[][])inputValues.get(传参因子[因子++]),(Double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findSumOfTwoDoubleArray2D");


		if(callFunctionKey.equalsIgnoreCase("findSumOfDoubleMatrix2D")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findSumOfDoubleMatrix2D(
						(double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findSumOfDoubleMatrix2D");
		if(callFunctionKey.equalsIgnoreCase("findRowSumOfDoubleMatrix2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findRowSumOfDoubleMatrix2D(
						(double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findRowSumOfDoubleMatrix2D");
		if(callFunctionKey.equalsIgnoreCase("findCulumnSumOfDoubleMatrix2D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findCulumnSumOfDoubleMatrix2D(
						(double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findCulumnSumOfDoubleMatrix2D");
		if(callFunctionKey.equalsIgnoreCase("findSumOfDoubleMatrix3D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findSumOfDoubleMatrix3D(
						(double[][][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findSumOfDoubleMatrix3D");
		if(callFunctionKey.equalsIgnoreCase("findSumOfDoubleList")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findSumOfDoubleList(
						(List<Double>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findSumOfDoubleList");
		if(callFunctionKey.equalsIgnoreCase("findSumOfMartrix1DList")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findSumOfMartrix1DList(
						(List<Double[]>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findSumOfMartrix1DList");
		if(callFunctionKey.equalsIgnoreCase("findSumOfMartrix2DList")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findSumOfMartrix2DList(
						(List<Double[][]>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findSumOfMartrix2DList");
		if(callFunctionKey.equalsIgnoreCase("getShareholdCount")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getShareholdCount(
						(int[][])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getShareholdCount");
		if(callFunctionKey.equalsIgnoreCase("encodeEstimateSumOfScoresList")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.encodeEstimateSumOfScoresList(
						(List<Double>)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "encodeEstimateSumOfScoresList");
		if(callFunctionKey.equalsIgnoreCase("encodeEstimateSumOfScoresArray")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.encodeEstimateSumOfScoresArray(
						(double[])inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "encodeEstimateSumOfScoresArray");
		if(callFunctionKey.equalsIgnoreCase("getEstimateCartesianSumOfScoresArray")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getEstimateCartesianSumOfScoresArray(
						(double)inputValues.get(传参因子[因子++])
						,(double[])inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getEstimateCartesianSumOfScoresArray");
		if(callFunctionKey.equalsIgnoreCase("getEstimateCartesian1DSumOfScoresArray")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getEstimateCartesian1DSumOfScoresArray(
						(double[])inputValues.get(传参因子[因子++])
						,(double[])inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getEstimateCartesian1DSumOfScoresArray");
		if(callFunctionKey.equalsIgnoreCase("encodeEstimateInitonsScore")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.encodeEstimateInitonsScore((double[])inputValues.get(传参因子[因子++])
						,(double[])inputValues.get(传参因子[因子++]),(double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "encodeEstimateInitonsScore");

		if(callFunctionKey.equalsIgnoreCase("decodeEstimateInitonsScore")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.decodeEstimateInitonsScore((double)inputValues.get(传参因子[因子++])
						,(double[])inputValues.get(传参因子[因子++]),(double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "decodeEstimateInitonsScore");
		if(callFunctionKey.equalsIgnoreCase("getRightsEstimateScore")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getRightsEstimateScore((double[])inputValues.get(传参因子[因子++])
						,(double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getRightsEstimateScore");
		if(callFunctionKey.equalsIgnoreCase("getSimilarFuzzSetWithScale")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getSimilarFuzzSetWithScale((RatioMatrix)inputValues.get(传参因子[因子++])
						,(List<RatioMatrix>)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getSimilarFuzzSetWithScale");
		if(callFunctionKey.equalsIgnoreCase("getDistanceRatio2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getDistanceRatio2D(
						(AMV_MVS_VSQ_2D)inputValues.get(传参因子[因子++])
						,(AMV_MVS_VSQ_2D)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getDistanceRatio2D");
		if(callFunctionKey.equalsIgnoreCase("getARCDistanceRatio2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getARCDistanceRatio2D(
						(AMV_MVS_VSQ_2D)inputValues.get(传参因子[因子++])
						,(AMV_MVS_VSQ_2D)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getARCDistanceRatio2D");
		if(callFunctionKey.equalsIgnoreCase("getTrueARCDistanceRatio2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getTrueARCDistanceRatio2D(
						(AMV_MVS_VSQ_2D)inputValues.get(传参因子[因子++])
						,(AMV_MVS_VSQ_2D)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getTrueARCDistanceRatio2D");
		if(callFunctionKey.equalsIgnoreCase("getDistanceRatio3D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getDistanceRatio3D(
						(AMV_MVS_VSQ_3D)inputValues.get(传参因子[因子++])
						,(AMV_MVS_VSQ_3D)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getDistanceRatio3D");
		if(callFunctionKey.equalsIgnoreCase("getTrueARCDistanceRatio3D")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getTrueARCDistanceRatio3D(
						(AMV_MVS_VSQ_3D)inputValues.get(传参因子[因子++])
						,(AMV_MVS_VSQ_3D)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getTrueARCDistanceRatio3D");
		if(callFunctionKey.equalsIgnoreCase("getPercentListByOuterKey")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPercentListByOuterKey(
						(Double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPercentListByOuterKey");
		if(callFunctionKey.equalsIgnoreCase("kernel")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapP_VECS_C.kernel((List<Double>)inputValues.get(传参因子[因子++])
						,(Double[])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "kernel");
		if(callFunctionKey.equalsIgnoreCase("kernelFix")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapP_VECS_C.kernelFix((List<Double>)inputValues.get(传参因子[因子++])
						,(Double[])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "kernelFix");
		if(callFunctionKey.equalsIgnoreCase("findTotalIncrementRatioWithScale")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findTotalIncrementRatioWithScale(
						(double)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findTotalIncrementRatioWithScale");
		if(callFunctionKey.equalsIgnoreCase("findMeanIncrementRatioWithScale")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.findMeanIncrementRatioWithScale(
						(double)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "findMeanIncrementRatioWithScale");
		if(callFunctionKey.equalsIgnoreCase("frequencyUpSplit")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.frequencyUpSplit(
						(double[])inputValues.get(传参因子[因子++]),(double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "frequencyUpSplit");
		if(callFunctionKey.equalsIgnoreCase("frequencyDownSplit")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.frequencyDownSplit(
						(double[])inputValues.get(传参因子[因子++]),(double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "frequencyDownSplit");
		if(callFunctionKey.equalsIgnoreCase("frequencyUpSplitWithScale")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.frequencyUpSplitWithScale(
						(double[])inputValues.get(传参因子[因子++])
						,(double[])inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "frequencyUpSplitWithScale");
		if(callFunctionKey.equalsIgnoreCase("frequencyDownSplitWithScale")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.frequencyDownSplitWithScale(
						(double[])inputValues.get(传参因子[因子++])
						,(double[])inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "frequencyDownSplitWithScale");



		if(callFunctionKey.equalsIgnoreCase("predictionResult")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.predictionResult((RatioMatrix)inputValues.get(传参因子[因子++])
						,(List<RatioMatrix>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "predictionResult");
		if(callFunctionKey.equalsIgnoreCase("predictionMatrixResult")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.predictionMatrixResult(
						(RatioMatrix)inputValues.get(传参因子[因子++])
						,(Map<String, RatioMatrix>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "predictionMatrixResult");
		if(callFunctionKey.equalsIgnoreCase("getImagePixClassificationMap")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getImagePixClassificationMap(
						(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getImagePixClassificationMap");
		if(callFunctionKey.equalsIgnoreCase("getVWaveFromImagePix")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getVWaveFromImagePix(
						(int[][])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getVWaveFromImagePix");
		if(callFunctionKey.equalsIgnoreCase("getHWaveFromImagePix")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getHWaveFromImagePix(
						(int[][])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getHWaveFromImagePix");
		if(callFunctionKey.equalsIgnoreCase("getPixPercentByDeterPix")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPixPercentByDeterPix(
						(int[][])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPixPercentByDeterPix");
		if(callFunctionKey.equalsIgnoreCase("getClusterPercentByDeterPixGroup")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getClusterPercentByDeterPixGroup(
						(Map<Double,List<AMV_MVS_VSQ_2D>>)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getClusterPercentByDeterPixGroup");
		if(callFunctionKey.equalsIgnoreCase("getPixPercentByDeterPixGroup")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPixPercentByDeterPixGroup(
						(Map<Double,List<AMV_MVS_VSQ_2D>>)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPixPercentByDeterPixGroup");
		if(callFunctionKey.equalsIgnoreCase("filterFusion2DSetsWithCountScale")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.filterFusion2DSetsWithCountScale(
						(Map<Double,List<AMV_MVS_VSQ_2D>>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "filterFusion2DSetsWithCountScale");
		if(callFunctionKey.equalsIgnoreCase("filterFusion3DSetsWithCountScale")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.filterFusion3DSetsWithCountScale(
						(Map<Double,List<AMV_MVS_VSQ_3D>>)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "filterFusion3DSetsWithCountScale");
		if(callFunctionKey.equalsIgnoreCase("filterPosition2DsWithScaledDistance")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.filterPosition2DsWithScaledDistance(
						(List<AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++])
						,(AMV_MVS_VSQ_2D)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "filterPosition2DsWithScaledDistance");
		if(callFunctionKey.equalsIgnoreCase("filterPosition3DsWithScaledDistance")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.filterPosition3DsWithScaledDistance(
						(List<AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++])
						,(AMV_MVS_VSQ_3D)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "filterPosition3DsWithScaledDistance");
		if(callFunctionKey.equalsIgnoreCase("filterPosition2DsWithScaledDistance")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.filterPosition2DsWithScaledDistance(
						(List<AMV_MVS_VSQ_2D>)inputValues.get(传参因子[因子++])
						,(AMV_MVS_VSQ_2D)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "filterPosition2DsWithScaledDistance");
		if(callFunctionKey.equalsIgnoreCase("filterPosition3DsWithScaledDistance")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.filterPosition3DsWithScaledDistance(
						(List<AMV_MVS_VSQ_3D>)inputValues.get(传参因子[因子++])
						,(AMV_MVS_VSQ_3D)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "filterPosition3DsWithScaledDistance");
		if(callFunctionKey.equalsIgnoreCase("getPercentListByOuterKey")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPercentListByOuterKey(
						(Double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPercentListByOuterKey");
		if(callFunctionKey.equalsIgnoreCase("getPercentArrayByOuterKey")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPercentArrayByOuterKey(
						(double[])inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPercentArrayByOuterKey");
		if(callFunctionKey.equalsIgnoreCase("getEachPercentSetOfArray")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getEachPercentSetOfArray(
						(double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getEachPercentSetOfArray");
		if(callFunctionKey.equalsIgnoreCase("getPercentArrayByOuterKey")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapP_VECS_C.getPercentArrayByOuterKey(
						(double[])inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getPercentArrayByOuterKey");
	}
	
	public static void load(StaticFunctionMapP_VECS_E staticFunctionMapP_VECS_E) {
		// TODO Auto-generated method stub
		//稍后封装
		StaticFunctionMapP_VECS_C.annotationMap.put("aNNTest", "string");
		StaticFunctionMapP_VECS_C.annotationMap.put("dNNTest", "string");
		StaticFunctionMapP_VECS_C.annotationMap.put("rNNTest", "string");
		StaticFunctionMapP_VECS_C.annotationMap.put("sensingTest", "string");
		StaticFunctionMapP_VECS_C.annotationMap.put("educationLevelTest", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("literarinessLevelTest", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("successICATest", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("getSideEnd2D", "list:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getSideEnd3D", "list:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("addNewPositionWithoutHeart", "groups:position2D:scaleDistance");
		StaticFunctionMapP_VECS_C.annotationMap.put("addNewPositionWithHeart", "groups:position2D:hearts:scaleDistance");
		StaticFunctionMapP_VECS_C.annotationMap.put("getShortestSamplePosition2DGroup", "inputHeart:groups");
		StaticFunctionMapP_VECS_C.annotationMap.put("getShorterSamplePosition2DGroupsWithScale", "inputHeart:groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getShortestSamplePosition3DGroup", "inputHeart:groups");
		StaticFunctionMapP_VECS_C.annotationMap.put("getShortestSamplePosition3DGroupsWithScale", "inputHeart:groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("fissilePosition2D", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("fissilePosition3D", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("fusionPosition2DwithHeart", "groups:groupsHeart：scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("fusionPosition3DwithHeart", "groups:groupsHeart:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getTSPIsolationGroups2D", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getTSPIsolationGroups3D", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getTSPForestIsolationGroups2D", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getTSPForestIsolationGroups3D", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("trackTracePosition2DHeartsWithSingerGroup", "coods");
		StaticFunctionMapP_VECS_C.annotationMap.put("trackTracePosition3DHeartsWithSingerGroup", "coods");
		StaticFunctionMapP_VECS_C.annotationMap.put("trackTracePosition2DByHearts", "hearts");
		StaticFunctionMapP_VECS_C.annotationMap.put("trackTracePosition3DByHearts", "hearts");
		StaticFunctionMapP_VECS_C.annotationMap.put("trackTracePosition2DHeartsWithFissileGroups", "coods:distanceScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("trackTracePosition3DHeartsWithFissileGroups", "coods:distanceScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanDistanceFromPositions2D", "position2Ds:oberserverPCAScale:sortRangeScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanDistanceFromPositions3D", "position3Ds:oberserverPCAScale:sortRangeScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("findPascalMeanDistanceByEachPositions2D", "position2Ds:oberserverPCAScale:sortRangeScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("findPascalMeanDistanceByEachPositions3D", "position3Ds:oberserverPCAScale:sortRangeScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPosition2DsGroupPascalHearts", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPosition3DsGroupPascalHearts", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPosition2DsGroupPascalMids", "groups:scale");
	
		StaticFunctionMapP_VECS_C.annotationMap.put("getPosition3DsGroupPascalMids", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPosition2DsGroupPascalDirection", "pascalHearts:pascalMids");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPosition3DsGroupPascalDirection", "pascalHearts:pascalMids");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPosition3DsGroupPascalDirection", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPosition2DsGroupPascalDirection", "groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getYaoguangLuo2DEulerRingTSP", "AMV_MVS_VSQs");
		StaticFunctionMapP_VECS_C.annotationMap.put("getYaoguangLuo3DEulerRingTSP", "AMV_MVS_VSQs");
		StaticFunctionMapP_VECS_C.annotationMap.put("getYaoguangLuo2DEulerRingTSP2D", "AMV_MVS_VSQs");
		StaticFunctionMapP_VECS_C.annotationMap.put("getYaoguangLuo3DEulerRingTSP2D", "AMV_MVS_VSQs");
		StaticFunctionMapP_VECS_C.annotationMap.put("getYaoguangLuo2DEulerRingTSP3D", "positions:sortRangeScale:sortDeepsScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getYaoguangLuo3DEulerRingTSP3D", "positions:sortRangeScale:sortDeepsScale");
		
		StaticFunctionMapP_VECS_C.annotationMap.put("getImagePix2DGroupFilter", "inputPixMatrix:RBG:distanceScale:max:min");
		StaticFunctionMapP_VECS_C.annotationMap.put("getImagePix3DGroupFilter", "inputPixMatrix:RBG:distanceScale:max:min");
		StaticFunctionMapP_VECS_C.annotationMap.put("NLPBestSentenceMatch", "searchString:sampleSentences");
		StaticFunctionMapP_VECS_C.annotationMap.put("NLPBestSentencesMatch", "searchString:sampleSentences:sortStackRange:filterRate");
		StaticFunctionMapP_VECS_C.annotationMap.put("getNLPBestSentencesMatchScore", "searchString:sampleSentences");
		StaticFunctionMapP_VECS_C.annotationMap.put("getNLPBestSentencesMatchScoreRights", "searchString:sampleSentences:_A:nlp:keyMap");
		StaticFunctionMapP_VECS_C.annotationMap.put("getErrorAsserts", "inputValue:matchValues:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getBinaryErrorAsserts", "inputValue:matchValues:scale:sortStackRange:isSort");
		StaticFunctionMapP_VECS_C.annotationMap.put("findTotalIncrementWithScale", "value:times:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanIncrementWithScale", "value:times:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanOfFilterDoubleArrayWithScale", "input:filterScale:sortRangeScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanOfDoubleArray", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanOfTwoDoubleArray", "origin:input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanOfTwoDoubleArray2D", "origin:input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanOfDoubleMatrix2D", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findRowMeanOfDoubleMatrix2D", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findCulumnMeanOfDoubleMatrix2D", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanOfDoubleMatrix3D", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanOfDoubleList", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanOfMartrix1DList", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanOfMartrix2DList", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findSumOfDoubleArray", "input");	
		StaticFunctionMapP_VECS_C.annotationMap.put("findSumOfTwoDoubleArray", "origin,input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findSumOfTwoDoubleArray2D", "origin,input");
		
	 
		StaticFunctionMapP_VECS_C.annotationMap.put("findSumOfDoubleMatrix2D", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findRowSumOfDoubleMatrix2D", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findCulumnSumOfDoubleMatrix2D", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findSumOfDoubleMatrix3D", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findSumOfDoubleList", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findSumOfMartrix1DList", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("findSumOfMartrix2DList", "input");
		StaticFunctionMapP_VECS_C.annotationMap.put("getShareholdCount", "input:sharehold");
		
		StaticFunctionMapP_VECS_C.annotationMap.put("encodeEstimateSumOfScoresList", "scores:estimateValue");
		StaticFunctionMapP_VECS_C.annotationMap.put("encodeEstimateSumOfScoresArray", "scores:estimateValue");
		StaticFunctionMapP_VECS_C.annotationMap.put("getEstimateCartesianSumOfScoresArray", "input:EstimateRatios:estimateValue");
		StaticFunctionMapP_VECS_C.annotationMap.put("getEstimateCartesian1DSumOfScoresArray", "inputs:EstimateRatios:estimateValue");
		StaticFunctionMapP_VECS_C.annotationMap.put("encodeEstimateInitonsScore", "input:EstimateRatios:estimateValue");
		
		StaticFunctionMapP_VECS_C.annotationMap.put("decodeEstimateInitonsScore", "input:EstimateRatios:estimateValue");
		StaticFunctionMapP_VECS_C.annotationMap.put("getRightsEstimateScore", "inputs:rights");
		StaticFunctionMapP_VECS_C.annotationMap.put("getSimilarFuzzSetWithScale", "input:groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getDistanceRatio2D", "begin:end");
		StaticFunctionMapP_VECS_C.annotationMap.put("getARCDistanceRatio2D", "begin:end");
		StaticFunctionMapP_VECS_C.annotationMap.put("getTrueARCDistanceRatio2D", "begin:end");
		StaticFunctionMapP_VECS_C.annotationMap.put("getDistanceRatio3D", "begin:end");
		StaticFunctionMapP_VECS_C.annotationMap.put("getTrueARCDistanceRatio3D", "begin:end");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPercentListByOuterKey", "array");
		StaticFunctionMapP_VECS_C.annotationMap.put("kernel", "output:array:j");
		StaticFunctionMapP_VECS_C.annotationMap.put("kernelFix", "output:array:j");
		StaticFunctionMapP_VECS_C.annotationMap.put("findTotalIncrementRatioWithScale"
				, "value:times:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("findMeanIncrementRatioWithScale"
				, "value:times:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("frequencyUpSplit"
				, "originFrequency:compareFrequency");
		StaticFunctionMapP_VECS_C.annotationMap.put("frequencyDownSplit"
				, "originFrequency:compareFrequency");
		StaticFunctionMapP_VECS_C.annotationMap.put("frequencyUpSplitWithScale"
				, "originFrequency:compareFrequency:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("frequencyDownSplitWithScale"
				, "originFrequency:compareFrequency:scale");

	

		StaticFunctionMapP_VECS_C.annotationMap.put("predictionResult"
				, "input:groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("predictionMatrixResult"
				, "input:groups:scale");
		StaticFunctionMapP_VECS_C.annotationMap.put("getImagePixClassificationMap"
				, "pixMap");
		StaticFunctionMapP_VECS_C.annotationMap.put("getVWaveFromImagePix"
				, "pixMap:RGB");
		StaticFunctionMapP_VECS_C.annotationMap.put("getHWaveFromImagePix"
				, "pixMap:RGB");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPixPercentByDeterPix"
				, "imagePix:scaleRBG");
		StaticFunctionMapP_VECS_C.annotationMap.put("getClusterPercentByDeterPixGroup"
				, "imagePix:scaleSUM");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPixPercentByDeterPixGroup"
				, "imagePix:scaleSUM");
		StaticFunctionMapP_VECS_C.annotationMap.put("filterFusion2DSetsWithCountScale"
				, "groups:countScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("filterFusion3DSetsWithCountScale"
				, "groups:countScale");
		StaticFunctionMapP_VECS_C.annotationMap.put("filterPosition2DsWithScaledDistance"
				, "input:heart:scaleDistacne");
		StaticFunctionMapP_VECS_C.annotationMap.put("filterPosition3DsWithScaledDistance"
				, "input:heart:scaleDistacne");
		StaticFunctionMapP_VECS_C.annotationMap.put("filterPosition2DsWithScaledDistance"
				, "input:heart:scaleDistacne");
		StaticFunctionMapP_VECS_C.annotationMap.put("filterPosition3DsWithScaledDistance"
				, "input:heart:scaleDistacne");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPercentListByOuterKey", "list:key");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPercentArrayByOuterKey", "array:key");
		StaticFunctionMapP_VECS_C.annotationMap.put("getEachPercentSetOfArray", "array");
		StaticFunctionMapP_VECS_C.annotationMap.put("getPercentArrayByOuterKey", "array:key");
	}	


	//public static  数据预测static 全部统计下

	//	坐标类
	//	完善了欧基里德 熵增距离位移标记算法 20191216 罗瑶光
	//	完善了欧基里德 距离重心算法 20191216 罗瑶光
	//	完善了基于2维重心曲度射极斜率探测坐标雷达算法来获取边缘， 比常规 边缘小线段集合梯度计算快600倍。 20191216 罗瑶光
	//	完善了基于3维重心曲度射极斜率探测坐标雷达算法来获取边缘， 比常规 边缘小线段集合梯度计算快600倍。 20191218 罗瑶光
	//	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/cluster/SideEnd.java
	//
	public List<AMV_MVS_VSQ_2D> getSideEnd2D(List<AMV_MVS_VSQ_2D> list, double scale);
	public List<AMV_MVS_VSQ_3D> getSideEnd3D(List<AMV_MVS_VSQ_3D> list, double scale);


	//	完善了极快速欧基里德动态坐标簇分类算法 20191217 罗瑶光
	//	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/classification/PositionClasification.java
	//
	public Map<Double, List<AMV_MVS_VSQ_2D>> addNewPositionWithoutHeart(Map<Double, List<AMV_MVS_VSQ_2D>> groups
			, AMV_MVS_VSQ_2D position2D, double scaleDistance);
	public Map<Double, List<AMV_MVS_VSQ_2D>> addNewPositionWithHeart(Map<Double, List<AMV_MVS_VSQ_2D>> groups
			, AMV_MVS_VSQ_2D position2D, Map<Double, AMV_MVS_VSQ_2D> hearts, double scaleDistance);

	//position

	public List<AMV_MVS_VSQ_2D> getShortestSamplePosition2DGroup(AMV_MVS_VSQ_2D inputHeart
			, Map<Double, List<AMV_MVS_VSQ_2D>> groups);
	public Map<Double, List<AMV_MVS_VSQ_2D>> getShorterSamplePosition2DGroupsWithScale(AMV_MVS_VSQ_2D inputHeart
			, Map<Double, List<AMV_MVS_VSQ_2D>> groups, double scale);
	public List<AMV_MVS_VSQ_3D> getShortestSamplePosition3DGroup(AMV_MVS_VSQ_3D inputHeart, Map<Double, List<AMV_MVS_VSQ_3D>> groups);
	public Map<Double, List<AMV_MVS_VSQ_3D>> getShortestSamplePosition3DGroupsWithScale(AMV_MVS_VSQ_3D inputHeart
			, Map<Double, List<AMV_MVS_VSQ_3D>> groups, double scale);

	//	完善了带精度 欧基里德 2维坐标团 切裂算法 20191219 罗瑶光
	//	完善了带精度 欧基里德 2维坐标集 重心熵 融聚算法 20191219 罗瑶光
	//	完善了带精度 欧基里德 3维坐标团 切裂算法 20191219 罗瑶光
	//	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/classification/Fissile.java
	//
	public Map<Double, List<AMV_MVS_VSQ_2D>> fissilePosition2D(List<AMV_MVS_VSQ_2D> groups, double scale);
	public Map<Double, List<AMV_MVS_VSQ_3D>> fissilePosition3D(List<AMV_MVS_VSQ_3D> groups, double scale);

	//	完善了带精度 欧基里德 3维坐标集 重心熵 融聚算法 20191219 罗瑶光
	//	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/cluster/Fusion.java
	//
	public Map<Double, List<AMV_MVS_VSQ_2D>> fusionPosition2DwithHeart(Map<Double, List<AMV_MVS_VSQ_2D>> groups
			, Map<Double, AMV_MVS_VSQ_2D> groupsHeart, double scale);
	public Map<Double, List<AMV_MVS_VSQ_3D>> fusionPosition3DwithHeart(Map<Double, List<AMV_MVS_VSQ_3D>> groups
			, Map<Double, AMV_MVS_VSQ_3D> groupsHeart, double scale);

	//	完善了带精度 2维 (非欧拉权距)商旅路径团簇 隔离 算法 20191220 罗瑶光
	//	完善了带精度 3维 (非欧拉权距)商旅路径团簇 隔离 算法 20191220 罗瑶光
	//	https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/isolation/Isolation.java
	//
	public Map<Double, List<AMV_MVS_VSQ_2D>> getTSPIsolationGroups2D(List<AMV_MVS_VSQ_2D> groups, double scale);
	public Map<Double, List<AMV_MVS_VSQ_3D>> getTSPIsolationGroups3D(List<AMV_MVS_VSQ_3D> groups, double scale);

	//	完善了带精度 2维 商旅路径团簇 森林单元 隔离 算法 20191220 罗瑶光
	//	完善了带精度 3维 商旅路径团簇 森林单元 隔离 算法 20191220 罗瑶光
	//	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/isolation/ForestIsolation.java
	//
	public Map<Double, List<AMV_MVS_VSQ_2D>> getTSPForestIsolationGroups2D(List<AMV_MVS_VSQ_2D> groups, double scale);
	public Map<Double, List<AMV_MVS_VSQ_3D>> getTSPForestIsolationGroups3D(List<AMV_MVS_VSQ_3D> groups, double scale);

	//	完善 2维 坐标集 切裂 重心 轨迹 跟踪算法 20191221 罗瑶光
	//	完善 3维 坐标集 切裂 重心 轨迹 跟踪算法 20191221 罗瑶光
	//	https://gitee.com/DetaChina/Data_Prediction/tree/master/src/org/tinos/deta/trace
	//
	public List<AMV_MVS_VSQ_2D> trackTracePosition2DHeartsWithSingerGroup(List<AMV_MVS_VSQ_2D> coods);
	public List<AMV_MVS_VSQ_3D> trackTracePosition3DHeartsWithSingerGroup(List<AMV_MVS_VSQ_3D> coods);
	public List<AMV_MVS_VSQ_2D> trackTracePosition2DByHearts(List<AMV_MVS_VSQ_2D> hearts);
	public List<AMV_MVS_VSQ_3D> trackTracePosition3DByHearts(List<AMV_MVS_VSQ_3D> hearts);
	public Map<Double, List<AMV_MVS_VSQ_2D>> trackTracePosition2DHeartsWithFissileGroups(List<AMV_MVS_VSQ_2D> coods, double distanceScale);
	public Map<Double, List<AMV_MVS_VSQ_3D>> trackTracePosition3DHeartsWithFissileGroups(List<AMV_MVS_VSQ_3D> coods, double distanceScale);

	//	完善增加 2维 坐标重心轨迹跟踪算法 20191221 罗瑶光
	//	完善增加 3维 坐标重心轨迹跟踪算法 20191221 罗瑶光
	//	增加 2维 带精度匹配最短最近重心团切融算法 20191223 罗瑶光
	//	增加 3维 带精度匹配最短最近重心团切融算法 20191223 罗瑶光
	//	增加 2维基于带精度 最短 重心位移 路径坐标集团采样 算法 20191223 罗瑶光
	//	增加 3维基于带精度 最短 重心位移 路径坐标集团采样 算法 20191223 罗瑶光
	//	增加了2维精度距离内 坐标集 筛选算法。 20191223 罗瑶光
	//	增加了3维精度距离内 坐标集 筛选算法。 20191223 罗瑶光
	//	增加了 小于重心距离精度内 2维坐标团集合筛选 算法 20191223 罗瑶光
	//	增加了 小于重心距离精度内 3维坐标团集合筛选 算法 20191223 罗瑶光
	//	增加了 2维 融聚团 宇宙重心算法 20191224 罗瑶光
	//	增加了 3维 融聚团 宇宙重心算法 20191224 罗瑶光
	//	增加了 2维 精度 子集数量内 融聚团 筛选算法 20191224 罗瑶光
	//	增加了 3维 精度 子集数量内 融聚团 筛选算法 20191224 罗瑶光
	//	增加了 2维 坐标团的带精度计算 主要有效距离成份集的平均压强算法 20191225 罗瑶光
	//	增加了 3维 坐标团的带精度计算 主要有效距离成份集的平均压强算法 20191225 罗瑶光
	//	https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/PCA/FindPCAMeanDistance.java
	//
	public double findMeanDistanceFromPositions2D(List<AMV_MVS_VSQ_2D> position2Ds, double oberserverPCAScale, int sortRangeScale);
	public double findMeanDistanceFromPositions3D(List<AMV_MVS_VSQ_3D> position3Ds, double oberserverPCAScale, int sortRangeScale);

	//	增加了 2维 坐标团中 每一个坐标与精度数邻接坐标集的最小距离平均值比上 整体平均值来 获取的不稳定状态观测/预测（斥力，活性）算法。 20191225 罗瑶光
	//	增加了 3维 坐标团中 每一个坐标与精度数邻接坐标集的最小距离平均值比上 整体平均值来 获取的不稳定状态观测/预测（斥力，活性）算法。 20191225 罗瑶光
	//	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/PCA/FindPCAMeanDistance.java
	//
	public double[] findPascalMeanDistanceByEachPositions2D(List<AMV_MVS_VSQ_2D> position2Ds, double oberserverPCAScale, int sortRangeScale);
	public double[] findPascalMeanDistanceByEachPositions3D(List<AMV_MVS_VSQ_3D> position3Ds, double oberserverPCAScale, int sortRangeScale);

	//	增加了 2维 坐标集的计算观测优化函数 和 观测宽度差 求值 20191225 罗瑶光
	//	增加了 3维 坐标集的计算观测优化函数 和 观测宽度差 求值 20191225 罗瑶光
	//	增加了 2维 坐标集隐藏运动趋势预测算法 20191226 罗瑶光
	//	增加了 3维 坐标集隐藏运动趋势预测算法 20191226 罗瑶光
	//	增加了 2，3 求坐标团集的中心和重心集 算法 并做了局部认知优化 20191226 罗瑶光
	//	增加了 2，3维 通过坐标团的 精度匹配分割的内部坐标聚类团 进行 每个聚类团的 重心和中心距离 求解 获取有效的团稳定观测数据模型 20191227 罗瑶光
	//	https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/PCA/FindPositionsGroupPascalHearts.java
	//
	public Map<Double, AMV_MVS_VSQ_2D> getPosition2DsGroupPascalHearts(ArrayList<AMV_MVS_VSQ_2D> groups, double scale);
	public Map<Double, AMV_MVS_VSQ_3D> getPosition3DsGroupPascalHearts(ArrayList<AMV_MVS_VSQ_3D> groups, double scale) ;
	public Map<Double, AMV_MVS_VSQ_2D> getPosition2DsGroupPascalMids(ArrayList<AMV_MVS_VSQ_2D> groups, double scale);
	public Map<Double, AMV_MVS_VSQ_3D> getPosition3DsGroupPascalMids(ArrayList<AMV_MVS_VSQ_3D> groups, double scale);

	public Map<Double, Line2D> getPosition2DsGroupPascalDirection(Map<Double, AMV_MVS_VSQ_2D> pascalHearts, Map<Double, AMV_MVS_VSQ_2D> pascalMids);
	public Map<Double, Line3D> getPosition3DsGroupPascalDirection(Map<Double, AMV_MVS_VSQ_3D> pascalHearts, Map<Double, AMV_MVS_VSQ_3D> pascalMids);
	public Map<Double, Line3D> getPosition3DsGroupPascalDirection(ArrayList<AMV_MVS_VSQ_3D> groups, double scale);
	public Map<Double, Line2D> getPosition2DsGroupPascalDirection(ArrayList<AMV_MVS_VSQ_2D> groups, double scale);

	//	增加了 2，3维 临近2个坐标团的相互引力比的算法建模观测，小于1 吸引，大于1 排斥。 20191227 罗瑶光
	//	增加了 2，3维 支持高达1亿坐标 的 极速欧拉微分回路 商旅路径计算 的 TSP算法 1代 20200112 罗瑶光
	//	增加了 2，3维 支持高达1亿坐标 的 极速欧拉微分回路 商旅路径计算 的 TSP算法 2,3代 20200317 罗瑶光
	//	https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/tsp/YaoguangLuoEulerRingTSP2D.java 
	//	https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/tsp/YaoguangLuoEulerRingTSP3D.java
	public List<Line2D> getYaoguangLuo2DEulerRingTSP(List<AMV_MVS_VSQ_2D> AMV_MVS_VSQs);
	public List<Line3D> getYaoguangLuo3DEulerRingTSP(List<AMV_MVS_VSQ_3D> AMV_MVS_VSQs);

	public List<Line2D> getYaoguangLuo2DEulerRingTSP2D(List<AMV_MVS_VSQ_2D> AMV_MVS_VSQs);
	public List<Line3D> getYaoguangLuo3DEulerRingTSP2D(List<AMV_MVS_VSQ_3D> AMV_MVS_VSQs);

	public List<Line2D> getYaoguangLuo2DEulerRingTSP3D(List<AMV_MVS_VSQ_2D> positions, int sortRangeScale, int sortDeepsScale);
	public List<Line3D> getYaoguangLuo3DEulerRingTSP3D(List<AMV_MVS_VSQ_3D> positions, int sortRangeScale, int sortDeepsScale);
	//
	//	增加了 2，3维 根据坐标的重心轨迹来求解其坐标集的反演函数。 20200414 罗瑶光
	//	概率类
	//	完善了贝叶斯决策树矩阵轭相似度匹配算法 20191217 罗瑶光
	//	完善了贝叶斯决策树轭校验评估算法 20191217 罗瑶光
	//	增加findMean 函数集， 纠正 findSumOfDoubleMatrix3D 函数 20191222 罗瑶光
	//	增加了增量比 函数 20191223 罗瑶光
	//	增加 模糊概率集相似成份采样。20191223 罗瑶光
	//	增加 带精度有效概率集合采样。20191223 罗瑶光
	//	增加了 相似概率集 有效成份过滤 的PCA 均值采样算法 20191223 罗瑶光
	//	增加了 数组排序后，对最大最小精度百分比数值过滤后的 中间主要有效成份 的 mean 求解算法。 20191226 罗瑶光
	//	增加了 求指定像素在图片中的像素占比算法。 20200301 罗瑶光
	//	增加了 用于Fissile函数执行切裂后的相同像素团 精度筛选部分 在 相关团中的簇数量占比算法。 20200301 罗瑶光
	//	增加了 用于Fissile函数执行切裂后的相同像素团 精度筛选部分 在 相关团中的像素占比求解算法。 20200301 罗瑶光
	//	数组类
	//	增加 进行精度误差 线性和2分匹配 来获取质量是否属于合格状态算法 20191228 罗瑶光
	//	增加 进行2维和3维的像素矩阵中2分极值分类 来进行 map坐标转化观测 算法 20190229 罗瑶光
	//	增加 将shareholder分层处理的图片像素数据 按指定的精度和对应像素进行按像素团的大小进行特定过滤算法 20190302 罗瑶光
	//	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/image/ImagePixGroupFilter.java
	//
	public int[][] getImagePix2DGroupFilter(int[][] inputPixMatrix, int RBG, int distanceScale,int max, int min);
	public int[][][] getImagePix3DGroupFilter(int[][][] inputPixMatrix, int RBG, int distanceScale,int max, int min);


	//	增加 将像素矩阵指定的RBG颜色值拿出来形成波形数列输出算法 20190303 罗瑶光
	//	增加 2，3维 带精度 矩阵中非有效成份筛选过滤算法 20190303 罗瑶光
	//	NLP
	//	NLP Algorithm of Matching The POS Scored Sentence 20191228 Yaoguang. Luo
	//	NLP Algorithm of Matching The POS Scored Sentences 20191229 Yaoguang. Luo
	//	https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/NLP/NLPTopicMatch.java
	//	
	public String NLPBestSentenceMatch(String searchString, String[] sampleSentences) throws IOException ;

	//<<NLP Algorithm of Matching The POS Scored Sentences>>.
	//This prediction algorithm mostly used for matching the ranged sample sentences by using score method.  
	//Theory: Yaoguang.Luo 20191229
	//Application: Yaoguang.Luo
	//Attention: need Deta Parser API OSS 
	//sortStackRange: for the sort stacks filter scale
	//filterRate: for how many sets need to delete 
	public List<String> NLPBestSentencesMatch(String searchString, String[] sampleSentences, int sortStackRange, double filterRate) throws IOException ;
	public double[] getNLPBestSentencesMatchScore(String searchString, String[] sampleSentences) throws IOException;
	public double[] getNLPBestSentencesMatchScoreRights(String searchString, String[] sampleSentences, A _A, Map<String, String> nlp
			, Map<String, WordFrequency> keyMap) throws IOException;

	//这个函数用于进行精度误差匹配 获取质量是否属于合格状态。
	public boolean getErrorAsserts(double inputValue, double[] matchValues, double scale);	
	public boolean getBinaryErrorAsserts(double inputValue, double[] matchValues, double scale, int sortStackRange, boolean isSort);


	//统计
	public double findTotalIncrementWithScale(double value, double times, double scale);
	public double findMeanIncrementWithScale(double value, double times, double scale);
	//平均
	public double findMeanOfFilterDoubleArrayWithScale(double[] input, double filterScale, int sortRangeScale);
	public double findMeanOfDoubleArray(double[] input);
	public Double[] findMeanOfTwoDoubleArray(Double[] origin, Double[] input);
	public Double[][] findMeanOfTwoDoubleArray2D(Double[][] origin, Double[][] input);
	public double findMeanOfDoubleMatrix2D(double[][] input);
	public double[] findRowMeanOfDoubleMatrix2D(double[][] input);
	public double[] findCulumnMeanOfDoubleMatrix2D(double[][] input);
	public double findMeanOfDoubleMatrix3D(double[][][] input);
	public double findMeanOfDoubleList(List<Double> input);
	public Double[] findMeanOfMartrix1DList(List<Double[]> input);
	public Double[][] findMeanOfMartrix2DList(List<Double[][]> input);
	//求和
	public double findSumOfDoubleArray(double[] input);
	public Double[] findSumOfTwoDoubleArray(Double[] origin, Double[] input);
	public Double[][] findSumOfTwoDoubleArray2D(Double[][] origin, Double[][] input);
	public double findSumOfDoubleMatrix2D(double[][] input);
	public double[] findRowSumOfDoubleMatrix2D(double[][] input) ;
	public double[] findCulumnSumOfDoubleMatrix2D(double[][] input);
	public double findSumOfDoubleMatrix3D(double[][][] input);
	public double findSumOfDoubleList(List<Double> input);
	public Double[] findSumOfMartrix1DList(List<Double[]> input);
	public Double[][] findSumOfMartrix2DList(List<Double[][]> input);
	//计数
	public double getShareholdCount(int[][] input, int sharehold);
	//评估
	public boolean encodeEstimateSumOfScoresList(List<Double> scores, double estimateValue) ;
	public boolean encodeEstimateSumOfScoresArray(double[] scores, double estimateValue) ;
	public boolean getEstimateCartesianSumOfScoresArray(double input, double[] EstimateRatios, double estimateValue);
	public boolean getEstimateCartesian1DSumOfScoresArray(double[] inputs, double[] EstimateRatios, double estimateValue);
	public boolean[] encodeEstimateInitonsScore(double[] input, double[] estimateRatios, double estimateValue[]);
	public boolean[] decodeEstimateInitonsScore(double input, double[] estimateRatios, double estimateValue[]);
	public double[] getRightsEstimateScore(double[] inputs, double[] rights);

	//这个函数用于求模糊概率集平均值采样主要成份分析
	public RatioMatrix getSimilarFuzzSetWithScale(RatioMatrix input, List<RatioMatrix> groups, double scale);
	public RatioMatrix getSimilarFuzzSet(RatioMatrix input, List<RatioMatrix> groups);
	public List<RatioMatrix> getSimilarFuzzSetListWithScale(RatioMatrix input, List<RatioMatrix> groups, double scale);


	//ratio
	public double getDistanceRatio2D(AMV_MVS_VSQ_2D begin, AMV_MVS_VSQ_2D end) ;
	//降低计算速度来获取高准确斜率梯度 (早期傅里叶思想)
	public double getARCDistanceRatio2D(AMV_MVS_VSQ_2D begin, AMV_MVS_VSQ_2D end) ;
	//降低计算速度来获取两点间线的真实角度 
	public double getTrueARCDistanceRatio2D(AMV_MVS_VSQ_2D begin, AMV_MVS_VSQ_2D end) ;
	//获取计算参照梯度
	public double getDistanceRatio3D(AMV_MVS_VSQ_3D begin, AMV_MVS_VSQ_3D end);
	//获取真实三维夹角
	public double getTrueARCDistanceRatio3D(AMV_MVS_VSQ_3D begin, AMV_MVS_VSQ_3D end) ;
	public List<Double> getPercentListByOuterKey(Double[] array);
	public void kernel(List<Double> output, Double[] array, int j);
	public void kernelFix(List<Double> output, Double[] array, int j);

	public double findTotalIncrementRatioWithScale(double value, double times, double scale);
	public double findMeanIncrementRatioWithScale(double value, double times, double scale);


	//比较简单的鸡尾酒频率盲分割
	public double[] frequencyUpSplit(double[] originFrequency, double[] compareFrequency);
	public double[] frequencyDownSplit(double[] originFrequency, double[] compareFrequency);
	public double[] frequencyUpSplitWithScale(double[] originFrequency, double[] compareFrequency, double scale);
	public double[] frequencyDownSplitWithScale(double[] originFrequency, double[] compareFrequency, double scale);

	public boolean predictionResult(RatioMatrix input, List<RatioMatrix> groups, double scale);
	public String predictionMatrixResult(RatioMatrix input, Map<String, RatioMatrix> groups, double scale);

	//image
	//思想：统计与概率论
	//作者：罗瑶光
	//将shareholder分层处理的图片像素数据进行 分类归类统计输出
	public Map<Integer, ArrayList<AMV_MVS_VSQ_2D>> getImagePixClassificationMap(int[][] pixMap);
	public Map<Integer, ArrayList<AMV_MVS_VSQ_3D>> getImagePixClassificationMap(int[][][] pixMap);
	public int[] getVWaveFromImagePix(int[][] pixMap, int RGB);
	public int[] getHWaveFromImagePix(int[][] pixMap, int RGB);
	public double getPixPercentByDeterPix(int[][] imagePix, int scaleRBG);
	//这个函数用于Fissile函数执行切裂后的相同像素团 精度筛选部分 在 相关团中的簇数量占比。
	public double getClusterPercentByDeterPixGroup(Map<Double, List<AMV_MVS_VSQ_2D>> imagePix, int scaleSUM);
	//这个函数用于Fissile函数执行切裂后的相同像素团 精度筛选部分 在 相关团中的像素占比。
	public double getPixPercentByDeterPixGroup(Map<Double, List<AMV_MVS_VSQ_2D>> imagePix, int scaleSUM);
	

	//FusionPCAFilter{
	public Map<Double, List<AMV_MVS_VSQ_2D>> filterFusion2DSetsWithCountScale
	(Map<Double, List<AMV_MVS_VSQ_2D>> groups, double countScale);
	public Map<Double, List<AMV_MVS_VSQ_3D>> filterFusion3DSetsWithCountScale
	(Map<Double, List<AMV_MVS_VSQ_3D>> groups, double countScale);

	//PCA_AMV_MVS_VSQ_Filter
	public List<AMV_MVS_VSQ_2D> filterPosition2DsWithScaledDistance(List<AMV_MVS_VSQ_2D> input
			, AMV_MVS_VSQ_2D heart, double scaleDistacne);
	public List<AMV_MVS_VSQ_3D> filterPosition3DsWithScaledDistance(List<AMV_MVS_VSQ_3D> input
			, AMV_MVS_VSQ_3D heart, double scaleDistacne);
	public Map<Double, List<AMV_MVS_VSQ_2D>> filterPosition2DsWithScaledDistance(Map<Double
			, List<AMV_MVS_VSQ_2D>> input, AMV_MVS_VSQ_2D heart, double scaleDistacne);
	public Map<Double, List<AMV_MVS_VSQ_3D>> filterPosition3DsWithScaledDistance(Map<Double
			, List<AMV_MVS_VSQ_3D>> input, AMV_MVS_VSQ_3D heart, double scaleDistacne);

	//Percentage{
	public List<Double> getPercentListByOuterKey(List<Double> list, double key);
	public double[] getPercentArrayByOuterKey(double[] array, double key);
	public double[] getEachPercentSetOfArray(double[] array);
	public double[][] getPercentArrayByOuterKey(double[][] array, double key);
	public double[][] getEachPercentSetOfArray(double[][] array);

}
