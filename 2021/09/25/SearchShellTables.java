package OSA.shell;

import java.util.Map;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import ME.APM.VSQ.App;
//这个函数我将 txt 和 db 表文件 到jtable 进行映射成object[][] 表。jtable 太上层，我准备设计成VPCS 结构，把jtable的 object[][]标记脱离出来，
//罗瑶光
public class SearchShellTables{
	public Map<String, SearchShellTable> SearchShellTables;
	//先把接口做足，罗瑶光20210925
	//将表变成表映射
	public boolean addNewSearchShellTable(String tableName, JTable jtable) {
		//..
		TableModel defaultTableModel= jtable.getModel();
		this.addNewSearchShellTable(tableName, (DefaultTableModel)defaultTableModel);
		return true;
	}
	//将表映射变成shell映射
	public boolean addNewSearchShellTable(String tableName, DefaultTableModel defaultTableModel) {
		//..
		Object[] jtableSpec= new Object[defaultTableModel.getColumnCount()];
		for(int i= 0; i< defaultTableModel.getColumnCount(); i++) {
			jtableSpec[i]= defaultTableModel.getColumnName(i);
		}

		Object[][] jtableData= new Object[defaultTableModel.getColumnCount()][defaultTableModel.getRowCount()];
		for(int i= 0; i< defaultTableModel.getColumnCount(); i++) {
			for(int j= 0; j< defaultTableModel.getRowCount(); j++) {
				jtableData[i][j]= defaultTableModel.getValueAt(i, j);
			}
		}
		this.addNewSearchShellTable(tableName, jtableData, jtableSpec);
		return true;
	}
	//shell映射封装
	public boolean addNewSearchShellTable(String tableName, Object[][] defaultTableData, Object[] defaultTableDataSpec ) {	
		//..
		SearchShellTable searchShellTable= new SearchShellTable();
		searchShellTable.setHuaRuiJiJtableCulumns(defaultTableDataSpec);
		searchShellTable.setHuaRuiJiJtable(defaultTableData);
		searchShellTable.setHuaRuiJiJtableName(tableName);
		return true;
	}
	//然后所有养疗经的jtable表全部基于这个文件函数 进行shell 封装。与数据库的内存映射分离。
	public boolean addInitSearchShellTable(App app) {
		//把养疗经的表都在这里初始化映射成 SearchShellTables 内存先。
		return false;
	}
}