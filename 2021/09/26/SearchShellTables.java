package OSA.shell;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import ME.APM.VSQ.App;
//这个函数我将 txt 和 db 表文件 到jtable 进行映射成object[][] 表。jtable 太上层，我准备设计成VPCS 结构，把jtable的 object[][]标记脱离出来，
//映射函数框架完成， 稍后开始应用， 先在 控制台做个shell命令输入框，然后开始修改 之前plsql orm 对应的 searchShell 计算文件
//罗瑶光
public class SearchShellTables{
	public static Map<String, SearchShellTable> searchShellTables= new HashMap<>();
	//先把接口做足，罗瑶光20210925
	//将表变成表映射
	public static boolean addNewSearchShellTable(String tableName, JTable jtable) {
		//..
		TableModel defaultTableModel= jtable.getModel();
		addNewSearchShellTable(tableName, (DefaultTableModel)defaultTableModel);
		return true;
	}
	//按sonar方式重复函数分离
	public static Object[] getNewSearchShellTableSpecFromDefaultTableModel(DefaultTableModel defaultTableModel) {
		//..
		Object[] jtableSpec= new Object[defaultTableModel.getColumnCount()];
		for(int i= 0; i< defaultTableModel.getColumnCount(); i++) {
			jtableSpec[i]= defaultTableModel.getColumnName(i);
		}
		return jtableSpec;
	}
	//按sonar方式重复函数分离
	public static Object[][] getNewSearchShellTableDataFromDefaultTableModel(DefaultTableModel defaultTableModel) {
		//..
		Object[][] jtableData= new Object[defaultTableModel.getColumnCount()][defaultTableModel.getRowCount()];
		for(int i= 0; i< defaultTableModel.getColumnCount(); i++) {
			for(int j= 0; j< defaultTableModel.getRowCount(); j++) {
				jtableData[i][j]= defaultTableModel.getValueAt(i, j);
			}
		}
		return jtableData;
	}
	//将表映射变成shell映射,接口VPCS 多样化，稍后做新陈代谢用。
	public static boolean addNewSearchShellTable(String tableName, DefaultTableModel defaultTableModel) {
		//..
		Object[] jtableSpec= getNewSearchShellTableSpecFromDefaultTableModel(defaultTableModel);
		Object[][] jtableData= getNewSearchShellTableDataFromDefaultTableModel(defaultTableModel);
		addNewSearchShellTable(tableName, jtableData, jtableSpec);
		return true;
	}
	//将表映射变成shell映射,接口VPCS 多样化，稍后做新陈代谢用。 object data 稍后准备 用 _S_ 元基替换。
	public static boolean addNewSearchShellTableWithObjectData(String tableName, DefaultTableModel defaultTableModel
			, Object[][] defaultTableData) {
		//..
		Object[] jtableSpec= getNewSearchShellTableSpecFromDefaultTableModel(defaultTableModel);
		addNewSearchShellTable(tableName, defaultTableData, jtableSpec);
		return true;
	}
	//shell映射封装
	public static boolean addNewSearchShellTable(String tableName, Object[][] defaultTableData
			, Object[] defaultTableDataSpec ) {	
		//..
		SearchShellTable searchShellTable= new SearchShellTable();
		searchShellTable.setHuaRuiJiJtableCulumns(defaultTableDataSpec);
		searchShellTable.setHuaRuiJiJtable(defaultTableData);
		searchShellTable.setHuaRuiJiJtableName(tableName);
		searchShellTables.put(tableName, searchShellTable);
		return true;
	}
	//然后所有养疗经的jtable表全部基于这个文件函数 进行shell 封装。与数据库的内存映射分离。
	public boolean addInitSearchShellTable(App app) {
		//把养疗经的表都在这里初始化映射成 SearchShellTables 内存先。
		addNewSearchShellTable("西医内科", app.xynkPage.tableData_old, app.xynkPage.columnTitle);
		addNewSearchShellTable("中医内科", app.zynkxPage.tableData_old, app.zynkxPage.columnTitle);
		addNewSearchShellTable("中医诊断", app.zyzdxPage.tableData_old, app.zyzdxPage.columnTitle);
		addNewSearchShellTable("古籍经典", app.fyydPage.tableData_old, app.fyydPage.columnTitle);
		addNewSearchShellTable("中医生殖", app.fqzPage.tableData_old, app.fqzPage.columnTitle);
		addNewSearchShellTable("妇产科学", app.fckxPage.tableData_old, app.fckxPage.columnTitle);
		addNewSearchShellTable("急诊科学", app.jzkxPage.tableData_old, app.jzkxPage.columnTitle);
		addNewSearchShellTable("西医外科", app.wkxPage.tableData_old, app.wkxPage.columnTitle);
		addNewSearchShellTable("西药手册", app.xyscPage.tableData_old, app.xyscPage.columnTitle);
		addNewSearchShellTable("中药同源", app.tableData_old, app.columnTitle);
		return true;
	}
}