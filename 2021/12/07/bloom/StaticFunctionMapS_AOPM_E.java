package SEM.bloom;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import OSV.ESD.standard.D_CellStandard;
import OSV.ESD.standard.D_Standard;
import OSV.ESI.standard.IU_CellStandard;
import OSV.ESU.standard.U_CellStandard;
//����Ȩ��+����=������
public class StaticFunctionMapS_AOPM_E implements StaticFunctionMapS_AOPM_C {
	public Map<String, String> annotationMap= new HashMap<>();
	//s ��ļ�¼
	// D_CellStandard{	

	//	delete samples
	//	tableName:test:delete;
	//	condition:or:testCulumn1|<|20:testCulumn2|==|fire;
	//	condition:and:testCulumn1|>|100:testCulumn2|==|fire;

	public Map<String, Object> DeleteCellORM(String rootPath, String baseName
			, String tabKey, Map<String, String> rowCells, Boolean initonEncrypt) throws IOException{
		return D_CellStandard.DeleteCellORM(rootPath, baseName, tabKey, rowCells, initonEncrypt) ;
	}

	public Map<String, Object> DeleteCellPLSQL(String rootPath, String baseName
			, String tabKey, Map<String, String> rowCells, Boolean initonEncrypt) throws IOException{
		 return DeleteCellPLSQL(rootPath, baseName, tabKey, rowCells, initonEncrypt);
	}

	//D_Standard{	
	//	drop samples
	//	tableName:test:drop; 
	public Map<String, Object> DropCellORM(String rootPath, String baseName, String tabKey) throws Exception{
		return D_Standard.DropCellORM(rootPath, baseName, tabKey);
	}

	public Map<String, Object> DropCellPLSQL(String rootPath, String baseName
			, String tabKey) throws IOException{
		return DropCellPLSQL(rootPath, baseName, tabKey);
	}

	//IU_CellStandard{	
	public Map<String, Object> InsertCellORM(String rootPath, String baseName
			, String tabKey, Map<String, String> rowCells, Boolean initonEncrypt) throws IOException{
		return IU_CellStandard. InsertCellORM(rootPath, baseName, tabKey, rowCells, initonEncrypt);
	}

	public Map<String, Object> InsertCellPLSQL(String rootPath, String baseName
			, String tabKey, Map<String, String> rowCells, Boolean initonEncrypt) throws IOException{
		return IU_CellStandard.InsertCellPLSQL(rootPath, baseName, tabKey, rowCells, initonEncrypt);
	}

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
			, String cellName, String cellValue) throws IOException{
		return U_CellStandard.UpdateCellORM(tabKey, rowId, cellName, cellValue);
	}
	public Map<String, Object> UpdateCellORMByRowId(String rootPath
			, String baseName, boolean unTest, String tabKey, String rowId
			, String cellName, String cellValue) throws IOException{
		return U_CellStandard. UpdateCellORMByRowId(rootPath, baseName, unTest, tabKey, rowId, cellName, cellValue);
		
	}

	public Map<String, Object> UpdateCellORMByEquals(String rootPath
			, String baseName, boolean unTest, String tabKey, String conditionSubject
			, String conditionObject, String cellName, String cellValue) throws IOException{
		return U_CellStandard.UpdateCellORMByEquals(rootPath, baseName, unTest, tabKey, conditionSubject
				, conditionObject, cellName, cellValue);
	}

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
			, String cellName, String cellValue) throws IOException{
		return U_CellStandard.UpdateCellPLSQL(tabKey, rowId, cellName, cellValue);
	}


	//S �ӿڵ�Ӧ��

	public StaticRootMap creatMap() throws IOException {
		StaticRootMap staticRootMap = new StaticRootMap();
		staticRootMap.initMap();
		return staticRootMap;
	}
}
