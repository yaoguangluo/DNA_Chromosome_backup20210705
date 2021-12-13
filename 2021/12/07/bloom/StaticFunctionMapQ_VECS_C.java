package SEM.bloom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.table.DefaultTableModel;

import ME.APM.VSQ.App;
//著作权人 + 作者 = 罗瑶光
public interface StaticFunctionMapQ_VECS_C {
	public static void load() {
		// TODO Auto-generated method stub

	}
	
	public void searchFromTable(String key, DefaultTableModel newTableModel, Object[][] tableData_old
			, ArrayList<String> copy_xj, Map<String, String> dic_xj, App u) throws IOException;

	public List<Object[]> searchFromTablewithScale(String key, ArrayList<String> 标题
			, Map<String, String> 内容, double lookrot) throws IOException;
}
