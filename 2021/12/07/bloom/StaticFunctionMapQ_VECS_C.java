package SEM.bloom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.table.DefaultTableModel;
import ME.APM.VSQ.App;
//����Ȩ��+ ����= ������
//Refer��Դ������ ��DNA Ԫ���߻����ļ��� �����޶��汾 V039010912��
//֤���ţ���������-2021-L-00268255 (�л����񹲺͹� ���Ұ�Ȩ�Ǽ�����)
public interface StaticFunctionMapQ_VECS_C {
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapQ_VECS_E staticFunctionMapQ_VECS_C
			, Map<String, Object> output) throws IOException {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("searchFromTable")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapQ_VECS_C.searchFromTable((String) inputValues.get(��������[����++])
						, (DefaultTableModel) inputValues.get(��������[����++])
						, (Object[][]) inputValues.get(��������[����++])
						, (ArrayList<String>) inputValues.get(��������[����++])
						, (Map<String, String>) inputValues.get(��������[����++])
						, (App) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("searchFromTablewithScale")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapQ_VECS_C.searchFromTablewithScale((String) inputValues.get(��������[����++])
						, (ArrayList<String>) inputValues.get(��������[����++])
						, (Map<String, String>) inputValues.get(��������[����++])
						, (double) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	public static void load(StaticFunctionMapQ_VECS_E staticFunctionMapQ_VECS_E) {
		// TODO Auto-generated method stub
		//�Ժ��װ
		staticFunctionMapQ_VECS_E.annotationMap.put("searchFromTable", "newTableModel:tableData_old:copy_xj:dic_xj:u");
		staticFunctionMapQ_VECS_E.annotationMap.put("searchFromTablewithScale", "key:����:����:lookrot");
	}

	public void searchFromTable(String key, DefaultTableModel newTableModel, Object[][] tableData_old
			, ArrayList<String> copy_xj, Map<String, String> dic_xj, App u) throws IOException;

	public List<Object[]> searchFromTablewithScale(String key, ArrayList<String> ����
			, Map<String, String> ����, double lookrot) throws IOException;
}	