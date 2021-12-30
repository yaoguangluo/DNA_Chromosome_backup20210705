package SEM.bloom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.table.DefaultTableModel;
import ME.APM.VSQ.App;
//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public interface StaticFunctionMapQ_VECS_C {
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapQ_VECS_E staticFunctionMapQ_VECS_C
			, Map<String, Object> output) throws IOException {
		String[] 传参因子= (String[]) output.get("传参因子");
		int 因子= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("searchFromTable")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapQ_VECS_C.searchFromTable((String) inputValues.get(传参因子[因子++])
						, (DefaultTableModel) inputValues.get(传参因子[因子++])
						, (Object[][]) inputValues.get(传参因子[因子++])
						, (ArrayList<String>) inputValues.get(传参因子[因子++])
						, (Map<String, String>) inputValues.get(传参因子[因子++])
						, (App) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("searchFromTablewithScale")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapQ_VECS_C.searchFromTablewithScale((String) inputValues.get(传参因子[因子++])
						, (ArrayList<String>) inputValues.get(传参因子[因子++])
						, (Map<String, String>) inputValues.get(传参因子[因子++])
						, (double) inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	public static void load(StaticFunctionMapQ_VECS_E staticFunctionMapQ_VECS_E) {
		// TODO Auto-generated method stub
		//稍后封装
		staticFunctionMapQ_VECS_E.annotationMap.put("searchFromTable", "newTableModel:tableData_old:copy_xj:dic_xj:u");
		staticFunctionMapQ_VECS_E.annotationMap.put("searchFromTablewithScale", "key:标题:内容:lookrot");
	}

	public void searchFromTable(String key, DefaultTableModel newTableModel, Object[][] tableData_old
			, ArrayList<String> copy_xj, Map<String, String> dic_xj, App u) throws IOException;

	public List<Object[]> searchFromTablewithScale(String key, ArrayList<String> 标题
			, Map<String, String> 内容, double lookrot) throws IOException;
}	