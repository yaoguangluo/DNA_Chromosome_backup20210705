package OSA.shell;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import ME.APM.VSQ.HRJFrame;
import OSM.shell.E_PLSearch_E;

public class TestDemo{
	public static void main(String[] hello) throws Exception {
		//������
		if(null!= HRJFrame.NE) {
			SearchShellTables.addInitSearchShellTable(HRJFrame.NE);
		}
		//ִ��shell
		String plSearch="tableName:��ҩͬԴ:select;"
				+ "condition:or:testCulumn1|<|20:testCulumn2|==|fire;";

		
		Map<String, Object> output= E_PLSearch_E.E_PLSearch(plSearch, false, new ConcurrentHashMap<>());
		//��� ���
		System.out.println(output.size());
	}
}