package OSA.shell;

import java.util.Map;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import ME.APM.VSQ.App;
//��������ҽ� txt �� db ���ļ� ��jtable ����ӳ���object[][] ��jtable ̫�ϲ㣬��׼����Ƴ�VPCS �ṹ����jtable�� object[][]������������
//������
public class SearchShellTables{
	public Map<String, SearchShellTable> SearchShellTables;
	//�Ȱѽӿ����㣬������20210925
	//�����ɱ�ӳ��
	public boolean addNewSearchShellTable(String tableName, JTable jtable) {
		//..
		TableModel defaultTableModel= jtable.getModel();
		this.addNewSearchShellTable(tableName, (DefaultTableModel)defaultTableModel);
		return true;
	}
	//����ӳ����shellӳ��
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
	//shellӳ���װ
	public boolean addNewSearchShellTable(String tableName, Object[][] defaultTableData, Object[] defaultTableDataSpec ) {	
		//..
		SearchShellTable searchShellTable= new SearchShellTable();
		searchShellTable.setHuaRuiJiJtableCulumns(defaultTableDataSpec);
		searchShellTable.setHuaRuiJiJtable(defaultTableData);
		searchShellTable.setHuaRuiJiJtableName(tableName);
		return true;
	}
	//Ȼ���������ƾ���jtable��ȫ����������ļ����� ����shell ��װ�������ݿ���ڴ�ӳ����롣
	public boolean addInitSearchShellTable(App app) {
		//�����ƾ��ı��������ʼ��ӳ��� SearchShellTables �ڴ��ȡ�
		return false;
	}
}