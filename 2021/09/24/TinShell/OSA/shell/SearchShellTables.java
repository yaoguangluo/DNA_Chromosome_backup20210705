package OSA.shell;

import java.util.Map;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ME.APM.VSQ.App;
//这个函数我将 txt 和 db 表文件 到jtable 进行映射成object[][] 表。jtable 太上层，我准备设计成VPCS 结构，把jtable的 object[][]标记脱离出来，
//罗瑶光
public class SearchShellTables{
	public Map<String, SearchShellTable> SearchShellTables;
	public void addNewSearchShellTable(String tableName, JTable jtable) {
			//..
	}
	
	public void addNewSearchShellTable(String tableName, DefaultTableModel defaultTableModel) {
		//..
	}
	
    public void addInitSearchShellTable(App app) {
		//把养疗经的表都在这里初始化映射成 SearchShellTables 内存先。
	}
}