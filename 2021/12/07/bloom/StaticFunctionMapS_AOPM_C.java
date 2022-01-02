package SEM.bloom;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//����Ȩ��+����=������
public interface StaticFunctionMapS_AOPM_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapS_AOPM_E staticFunctionMapS_AOPM_C
			, Map<String, Object> output) throws Exception {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("DropCellPLSQL")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.DropCellPLSQL((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("DropCellORM")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.DropCellORM((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("DeleteCellORM")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.DeleteCellORM((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						, (Map<String, String>)inputValues.get(��������[����++])
						, (boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("DeleteCellPLSQL")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.DeleteCellPLSQL((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						, (Map<String, String>)inputValues.get(��������[����++])
						, (boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("InsertCellORM")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.InsertCellORM((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						, (Map<String, String>)inputValues.get(��������[����++])
						, (boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("InsertCellPLSQL")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.InsertCellPLSQL((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						, (Map<String, String>)inputValues.get(��������[����++])
						, (boolean)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("UpdateCellORM")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.UpdateCellORM((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("UpdateCellORMByRowId")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.UpdateCellORMByRowId((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(boolean)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("UpdateCellORMByEquals")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.UpdateCellORMByEquals((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(boolean)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("UpdateCellPLSQL")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapS_AOPM_C.UpdateCellPLSQL((String)inputValues.get(��������[����++])
						, (String)inputValues.get(��������[����++])
						, (String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("creatMap")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapS_AOPM_C.creatMap();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}

	public static void load(StaticFunctionMapS_AOPM_E staticFunctionMapS_AOPM_E) {
		// TODO Auto-generated method stub
		//�Ժ��װ
		StaticFunctionMapS_AOPM_C.annotationMap.put("DeleteCellORM", "rootPath:baseName:tabKey:rowCells:initonEncrypt");
		StaticFunctionMapS_AOPM_C.annotationMap.put("DeleteCellPLSQL", "rootPath:baseName:tabKey:rowCells:initonEncrypt");
		StaticFunctionMapS_AOPM_C.annotationMap.put("DropCellORM", "rootPath:baseName:tabKey");
		StaticFunctionMapS_AOPM_C.annotationMap.put("DropCellPLSQL", "rootPath:baseName:tabKey");
		StaticFunctionMapS_AOPM_C.annotationMap.put("InsertCellORM", "rootPath:baseName:tabKey:rowCells:initonEncrypt");
		StaticFunctionMapS_AOPM_C.annotationMap.put("InsertCellPLSQL", "rootPath:baseName:tabKey:rowCells:initonEncrypt");
		StaticFunctionMapS_AOPM_C.annotationMap.put("UpdateCellORM", "tabKey:rowId:cellName:cellValue");
		StaticFunctionMapS_AOPM_C.annotationMap.put("UpdateCellORMByRowId", "rootPath:baseName:unTest:tabKey:rowId:cellName:cellValue");
		StaticFunctionMapS_AOPM_C.annotationMap.put("UpdateCellORMByEquals"
				, "rootPath:baseName:unTest:tabKey:conditionSubject:conditionObject:cellName:cellValue");
		StaticFunctionMapS_AOPM_C.annotationMap.put("UpdateCellPLSQL", "tabKey:rowId:cellName:cellValue");
		StaticFunctionMapS_AOPM_C.annotationMap.put("creatMap", "void");

	}
	//s ��ļ�¼
	// D_CellStandard{	

	//	delete samples
	//	tableName:test:delete;
	//	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
	//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;

	public Map<String, Object> DeleteCellORM(String rootPath, String baseName
			, String tabKey, Map<String, String> rowCells, Boolean initonEncrypt) throws IOException;

	public Map<String, Object> DeleteCellPLSQL(String rootPath, String baseName
			, String tabKey, Map<String, String> rowCells, Boolean initonEncrypt) throws IOException;

	//D_Standard{	

	//	drop samples
	//	tableName:test:drop; 

	public Map<String, Object> DropCellORM(String rootPath, String baseName
			, String tabKey) throws Exception;

	public Map<String, Object> DropCellPLSQL(String rootPath, String baseName
			, String tabKey) throws IOException;


	//IU_CellStandard{	
	public Map<String, Object> InsertCellORM(String rootPath, String baseName
			, String tabKey, Map<String, String> rowCells, Boolean initonEncrypt) throws IOException;

	public Map<String, Object> InsertCellPLSQL(String rootPath, String baseName
			, String tabKey, Map<String, String> rowCells, Boolean initonEncrypt) throws IOException;

	// U_CellStandard{	


	//  �Ժ��һ���������2��ģʽ���ORM UNSQL, �����Ǻܺ�д, ��������˼�� 
	//or and ̫�� ��ô���й淶����..
	//  �ҵĶ����ܼ�, �������ƾ����ݱ����ֱ�����ݿ�����޸�.
	//  ��DNA����������һ�� 308ҳ
	//	update samples 
	//	tableName:test:update; 
	//	condition:or:testCulumn1|<|20:testCulumn2|==|fire; 
	//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;
	//	culumnValue:date0:19850525;
	//	culumnValue:date1:19850526;
	//	
	//	update samples tableName:test:update; 
	//	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
	//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;
	//	join:backend:utest;
	//	condition:and:uCulumn3|<|20; 
	//	relation:and:testCulumn1|==|uCulumn1:testCulumn2|!=|uCulumn2; 
	//	culumnValue:date0:19850525;
	//	culumnValue:date1:19850526;

	public Map<String, Object> UpdateCellORM(String tabKey, String rowId
			, String cellName, String cellValue) throws IOException;
	public Map<String, Object> UpdateCellORMByRowId(String rootPath
			, String baseName, boolean unTest, String tabKey, String rowId
			, String cellName, String cellValue) throws IOException;

	public Map<String, Object> UpdateCellORMByEquals(String rootPath
			, String baseName, boolean unTest, String tabKey, String conditionSubject
			, String conditionObject, String cellName, String cellValue) throws IOException;

	//	update samples tableName:test:update; 
	//	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
	//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;
	//	join:backend:utest;
	//	condition:and:uCulumn3|<|20; 
	//	relation:and:testCulumn1|==|uCulumn1:testCulumn2|!=|uCulumn2; 
	//	culumnValue:date0:19850525;
	//	culumnValue:date1:19850526;


	//	String plsql= "setRoot:C:/DetaDB1;" + 
	//	"baseName:ZYY;" + 
	//	"tableName:"+ tabKey+ ":update;" +
	//	"condition:or:ID|==|rowId;" +
	//	"culumnValue:cellName:cellValue;";
	//
	//  condition:"���ƺ�û�����rowid culumnid������ѡ�� ����,�Ժ󲹳���":19850526;
	//  condition ������uid in ���� uid== ��ʵ��.�����ᵼ�¼������,���� ���rowid culumnid�����ֱȽ�ѡ�����б�Ҫ��.

	public Map<String, Object> UpdateCellPLSQL(String tabKey, String rowId
			, String cellName, String cellValue) throws IOException;


	//S �ӿڵ�Ӧ��
	public void creatMap() throws Exception;
}
