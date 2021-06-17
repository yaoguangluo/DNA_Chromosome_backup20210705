package OSV.ESD.standard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import OSI.AOP.MEC.SIQ.plorm.PLORM_E;
import OSI.AOP.MEC.SIQ.plorm.PLORM_C;
//import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
//OSV PLSQL �з�, ˼��, ���: ������ 20210511
//���޳�����������.
public class D_Standard{	
	public List<String> txtToList() throws IOException{
		List<String> dic_list= new ArrayList<>();
		return dic_list;
	}

	//	drop samples
	//	tableName:test:drop; 

	public static Map<String, Object> DropCellORM(String rootPath, String baseName
			, String tabKey) throws Exception{
		PLORM_C orm= new PLORM_E();
		orm= orm.startAtRootDir(rootPath)
				.withBaseName(baseName)
				.withTableDrop(tabKey)
				.checkAndFixPlsqlGrammarErrors()//׼������plsql orm���� ���﷨��麯�� ���޸�������
				.checkAndFixSystemEnvironmentErrors()//׼������plsql orm���� ��ϵͳ������麯�����޸�������
				.finalE(true);
		return null;
	}	

	public static Map<String, Object> DropCellPLSQL(String rootPath, String baseName
			, String tabKey) throws IOException{
		Map<String, Object> map= null;
		try {
			String plsql= "setRoot:"+ rootPath+ ";";
			plsql+= "baseName:"+ baseName+ ";"; 
			plsql+= "tableName:"+ tabKey+ ":drop;";
			map= ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E.E_PLSQL(plsql, true);
		}catch(Exception e1) {
			//׼��д�ع�
			e1.printStackTrace();
		}
		return map;
	}	
}