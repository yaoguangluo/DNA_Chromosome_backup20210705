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
	public static void load(StaticFunctionMapQ_VECS_E staticFunctionMapQ_VECS_E) {
		// TODO Auto-generated method stub
		//�Ժ��װ
		staticFunctionMapQ_VECS_E.annotationMap.put("searchFromTable", "searchFromTable");
		staticFunctionMapQ_VECS_E.annotationMap.put("searchFromTablewithScale", "searchFromTablewithScale");
	}

	public void searchFromTable(String key, DefaultTableModel newTableModel, Object[][] tableData_old
			, ArrayList<String> copy_xj, Map<String, String> dic_xj, App u) throws IOException;

	public List<Object[]> searchFromTablewithScale(String key, ArrayList<String> ����
			, Map<String, String> ����, double lookrot) throws IOException;
}	