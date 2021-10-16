//package OSA.shell;
//
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//
//import ME.APM.VSQ.HRJFrame;
//import OSM.shell.E_PLSearch_E;
//
//public class TestDemo{
//	public static void main(String[] hello) throws Exception {
//		//导入表格
//		HRJFrame.main(null);
//		if(null!= HRJFrame.NE) {
//			SearchShellTables.addInitSearchShellTable(HRJFrame.NE);
//		}
//		//执行shell
//		String plSearch="中药表名:中药同源:进行选择;"
//				+ "条件为:或:testCulumn1|<|20:testCulumn2|==|fire;";
//
//		
//		Map<String, Object> output= E_PLSearch_E.E_PLSearch(plSearch, false, new ConcurrentHashMap<>());
//		//输出 检测
//		System.out.println(output.size());
//	}
//}