package OSA.shell;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import ME.APM.VSQ.App;
//��������ҽ� txt �� db ���ļ� ��jtable ����ӳ���object[][] ��jtable ̫�ϲ㣬��׼����Ƴ�VPCS �ṹ����jtable�� object[][]������������
//ӳ�亯�������ɣ� �Ժ�ʼӦ�ã� ���� ����̨����shell���������Ȼ��ʼ�޸� ֮ǰplsql orm ��Ӧ�� searchShell �����ļ�
//������
public class SearchShellTables{
	public static Map<String, SearchShellTable> searchShellTables= new HashMap<>();
	//�Ȱѽӿ����㣬������20210925
	//�����ɱ�ӳ��
	public static boolean addNewSearchShellTable(String tableName, JTable jtable) {
		//..
		TableModel defaultTableModel= jtable.getModel();
		addNewSearchShellTable(tableName, (DefaultTableModel)defaultTableModel);
		return true;
	}
	//��sonar��ʽ�ظ���������
	public static Object[] getNewSearchShellTableSpecFromDefaultTableModel(DefaultTableModel defaultTableModel) {
		//..
		Object[] jtableSpec= new Object[defaultTableModel.getColumnCount()];
		for(int i= 0; i< defaultTableModel.getColumnCount(); i++) {
			jtableSpec[i]= defaultTableModel.getColumnName(i);
		}
		return jtableSpec;
	}
	//��sonar��ʽ�ظ���������
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
	//����ӳ����shellӳ��,�ӿ�VPCS ���������Ժ����³´�л�á�
	public static boolean addNewSearchShellTable(String tableName, DefaultTableModel defaultTableModel) {
		//..
		Object[] jtableSpec= getNewSearchShellTableSpecFromDefaultTableModel(defaultTableModel);
		Object[][] jtableData= getNewSearchShellTableDataFromDefaultTableModel(defaultTableModel);
		addNewSearchShellTable(tableName, jtableData, jtableSpec);
		return true;
	}
	//����ӳ����shellӳ��,�ӿ�VPCS ���������Ժ����³´�л�á� object data �Ժ�׼�� �� _S_ Ԫ���滻��
	public static boolean addNewSearchShellTableWithObjectData(String tableName, DefaultTableModel defaultTableModel
			, Object[][] defaultTableData) {
		//..
		Object[] jtableSpec= getNewSearchShellTableSpecFromDefaultTableModel(defaultTableModel);
		addNewSearchShellTable(tableName, defaultTableData, jtableSpec);
		return true;
	}
	//shellӳ���װ
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
	//Ȼ���������ƾ���jtable��ȫ����������ļ����� ����shell ��װ�������ݿ���ڴ�ӳ����롣
	public boolean addInitSearchShellTable(App app) {
		//�����ƾ��ı��������ʼ��ӳ��� SearchShellTables �ڴ��ȡ�
		addNewSearchShellTable("��ҽ�ڿ�", app.xynkPage.tableData_old, app.xynkPage.columnTitle);
		addNewSearchShellTable("��ҽ�ڿ�", app.zynkxPage.tableData_old, app.zynkxPage.columnTitle);
		addNewSearchShellTable("��ҽ���", app.zyzdxPage.tableData_old, app.zyzdxPage.columnTitle);
		addNewSearchShellTable("�ż�����", app.fyydPage.tableData_old, app.fyydPage.columnTitle);
		addNewSearchShellTable("��ҽ��ֳ", app.fqzPage.tableData_old, app.fqzPage.columnTitle);
		addNewSearchShellTable("������ѧ", app.fckxPage.tableData_old, app.fckxPage.columnTitle);
		addNewSearchShellTable("�����ѧ", app.jzkxPage.tableData_old, app.jzkxPage.columnTitle);
		addNewSearchShellTable("��ҽ���", app.wkxPage.tableData_old, app.wkxPage.columnTitle);
		addNewSearchShellTable("��ҩ�ֲ�", app.xyscPage.tableData_old, app.xyscPage.columnTitle);
		addNewSearchShellTable("��ҩͬԴ", app.tableData_old, app.columnTitle);
		return true;
	}
}