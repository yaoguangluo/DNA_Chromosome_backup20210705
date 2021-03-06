package OSA.shell;
import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import OSM.shell.P_AO_pl_XA;
import OSM.shell.P_CO_pl_XA_XCDX_Cache;
import OSM.shell.P_CO_pl_XA_XCDX_Map;
import OSM.shell.P_I_CulumnsPL_XA;
import OSM.shell.P_RelationPL_XA;
//整体 plsql 替换成 plsearch，稍后测试验证 罗瑶光20210927
@SuppressWarnings({"unused", "unchecked"})
public class XA_ShellQ_NestRows_E {
	public static Object selectRowsByAttributesOfNestCondition(Map<String
			, Object> object) throws IOException {
		if(!object.containsKey("recordRows")) {
			Map<String, Boolean> recordRows = new ConcurrentHashMap<>();
			object.put("recordRows", recordRows);
		}

		List<Map<String, Object>> output= new ArrayList<>();
		List<String[]> conditionValues= (List<String[]>) object.get("condition");
		Iterator<String[]> iterator= conditionValues.iterator();
		while(iterator.hasNext()) {
			boolean overMap= output.size()== 0? false: true;
			String[] conditionValueArray= iterator.next();
			String type= conditionValueArray[1];
			boolean andMap= type.equalsIgnoreCase("and")?true:false;
			for(int i= 2; i< conditionValueArray.length; i++) {
				String[] sets= conditionValueArray[i].split("\\|");
				if(overMap && andMap) {
					P_CO_pl_XA_XCDX_Map.P_Map(sets, output, object.get("nestTableName").toString(), object);
				}else{
					P_CO_pl_XA_XCDX_Cache.P_Cache(sets, output
							, object.get("nestTableName").toString()
							, object, type);
				}//DMA delete
			}
		}
		return output;
	}

	public static Object selectRowsByAttributesOfNestAggregation(Map<String, Object> object) 
			throws InstantiationException, IllegalAccessException, IOException {
		if(!object.containsKey("joinObj")) {
			return new ArrayList<>();
		}
		List<Map<String, Object>> obj = ((List<Map<String, Object>>)(object.get("obj")));
		List<String[]> aggregationValues = (List<String[]>) object.get("aggregation");
		Iterator<String[]> iterator = aggregationValues.iterator();
		while(iterator.hasNext()) {
			boolean overMap = obj.size() == 0? false: true;
			String[] aggregationValueArray = iterator.next();
			String type = aggregationValueArray[1];
			boolean limitMap = type.equalsIgnoreCase("limit")?true:false;
			for(int i = 2; i < aggregationValueArray.length; i++) {
				String[] sets = aggregationValueArray[i].split("\\|");
				if(limitMap) {
					P_AO_pl_XA.P_AggregationLimitMap(sets, obj);
				}
				//基于sort key 前序treeMap 之后排序功能设计
				//基于sort key 后序treeMap
			}
		}
		return obj;
	}

	public static Object selectRowsByAttributesOfNestGetCulumns(Map<String, Object> object) {
		if(!object.containsKey("joinObj")) {
			return new ArrayList<>();
		}
		List<Map<String, Object>> obj = ((List<Map<String, Object>>)(object.get("joinObj")));
		List<String[]> getCulumnsValues = (List<String[]>) object.get("getCulumns");
		Iterator<String[]> iterator = getCulumnsValues.iterator();
		while(iterator.hasNext()) {
			boolean overMap = obj.size() == 0? false: true;
			String[] getCulumnsValueArray = iterator.next();
			if(overMap) {
				P_I_CulumnsPL_XA.P_GetCulumnsMap(obj, getCulumnsValueArray);
			}
		}
		return obj;
	}

	public static Object selectRowsByAttributesOfNestRelation(Map<String, Object> object) {
		if(!object.containsKey("obj")||!object.containsKey("joinObj")) {
			return new ArrayList<>();
		}
		Map<String,Boolean> findinNewObj = new HashMap<>();
		List<Map<String, Object>> newObj = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> obj = ((List<Map<String, Object>>)(object.get("obj")));
		List<Map<String, Object>> joinObj= ((List<Map<String, Object>>)(object.get("joinObj")));
		List<String[]> relationValues = (List<String[]>) object.get("relation");
		Iterator<String[]> iterator = relationValues.iterator();
		while(iterator.hasNext()) {
			boolean overObjMap= obj.size() == 0? false: true;
			boolean overJoinObjMap= joinObj.size() == 0? false: true;
			String[] getRelationValueArray = iterator.next();
			String type = getRelationValueArray[1];
			boolean andMap = type.equalsIgnoreCase("and")?true:false;
			for(int i= 2; i< getRelationValueArray.length; i++) {
				String[] sets = getRelationValueArray[i].split("\\|");
				if(overObjMap&& overJoinObjMap&&andMap && i>2) {
					P_RelationPL_XA.P_AndMap(sets, obj, joinObj, object, newObj);
				}else {
					P_RelationPL_XA.P_OrMap(sets, obj, joinObj, object
							, newObj, findinNewObj);
				}
			}
		}
		return newObj;
	}
}