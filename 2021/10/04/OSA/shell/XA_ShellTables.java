package OSA.shell;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import ME.APM.VSQ.App;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
//��������ҽ� txt �� db ���ļ� ��jtable ����ӳ���object[][] ��jtable ̫�ϲ㣬��׼����Ƴ�VPCS �ṹ����jtable�� object[][]������������
//ӳ�亯�������ɣ� �Ժ�ʼӦ�ã� ���� ����̨����shell���������Ȼ��ʼ�޸� ֮ǰplsql orm ��Ӧ�� searchShell �����ļ�
//������
public class XA_ShellTables{
	public static Map<String, XA_ShellTable> searchShellTables= new HashMap<>();
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

	//��Ƹ�row�Ľ�ϱ�map�ڴ�ṹ ����shell�ı�ͷ������
	public static Row[] getNewSearchShellTableRowsFromDefaultTableModel(Object[] spec, DefaultTableModel defaultTableModel) {
		//..
		Row[] rows= new Row[defaultTableModel.getRowCount()];
		for(int i= 0; i< defaultTableModel.getColumnCount(); i++) {
			rows[i]= new Row();
			for(int j= 0; j< defaultTableModel.getRowCount(); j++) {
				Cell cell = new Cell();
				cell.I_CellValue(defaultTableModel.getValueAt(i, j));
				rows[i].putCell(""+ spec[i], cell);
			}
		}
		return rows;
	}

	//��Ƹ�row�Ľ�ϱ�map�ڴ�ṹ ����shell�ı�ͷ������
	public static Row[] getNewSearchShellTableRowsFromDefaultTableModel(Object[] spec, Object[][] tableData) {
		//..
		Row[] rows= new Row[tableData.length];
		for(int i= 0; i< tableData.length; i++) {
			rows[i]= new Row();
			rows[i].I_Cells(new ConcurrentHashMap<String, Cell>());//init
			for(int j= 0; j< tableData[0].length; j++) {
				Cell cell = new Cell();
				cell.I_CellValue(tableData[i][j]);
				rows[i].putCell(""+ spec[j], cell);
			}
		}
		return rows;
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
			, Object[] defaultTableDataSpec) {	
		//..
		XA_ShellTable searchShellTable= new XA_ShellTable();
		searchShellTable.setHuaRuiJiJtableCulumns(defaultTableDataSpec);
		searchShellTable.setHuaRuiJiJtableRows(getNewSearchShellTableRowsFromDefaultTableModel(defaultTableDataSpec, defaultTableData));
		searchShellTable.setHuaRuiJiJtable(defaultTableData);
		searchShellTable.setHuaRuiJiJtableName(tableName);
		searchShellTables.put(tableName, searchShellTable);
		return true;
	}
	
	//Reflection map ��ͷ��ʽ�洢
	//����ӳ����shellӳ��,�ӿ�VPCS ���������Ժ����³´�л�á� object data �Ժ�׼�� �� _S_ Ԫ���滻��
	public static boolean addNewSearchShellTableWithObjectDataReflectionDBRows(String tableName, DefaultTableModel defaultTableModel
			, Object[][] defaultTableData) {
		//..
		Object[] jtableSpec= getNewSearchShellTableSpecFromDefaultTableModel(defaultTableModel);
		//defaultTableModel TO ROWS
		Row[] rows= getNewSearchShellTableRowsFromDefaultTableModel(jtableSpec, defaultTableModel);
		addNewSearchShellTableReflectionDBRows(tableName, rows, jtableSpec);
		return true;
	}

	//Reflection map ��ͷ��ʽ�洢
	//shellӳ���װ
	public static boolean addNewSearchShellTableReflectionDBRows(String tableName, Row[] rows
			, Object[] defaultTableDataSpec ) {	
		//..
		XA_ShellTable searchShellTable= new XA_ShellTable();
		searchShellTable.setHuaRuiJiJtableCulumns(defaultTableDataSpec);
		searchShellTable.setHuaRuiJiJtableRows(rows);
		searchShellTable.setHuaRuiJiJtableName(tableName);
		searchShellTables.put(tableName, searchShellTable);
		return true;
	}

	//Ȼ���������ƾ���jtable��ȫ����������ļ����� ����shell ��װ�������ݿ���ڴ�ӳ����롣
	public static boolean addInitSearchShellTable(App app) {
		//�����ƾ��ı��������ʼ��ӳ��� SearchShellTables �ڴ��ȡ�
		addNewSearchShellTable("��ҽ�ڿ�", app.xynkPage.tableData_old, app.xynkPage.columnTitle);
		addNewSearchShellTable("��ҽ����", app.zynkxPage.tableData_old, app.zynkxPage.columnTitle);
		addNewSearchShellTable("��ҽ���", app.zyzdxPage.tableData_old, app.zyzdxPage.columnTitle);
		addNewSearchShellTable("�ż�����", app.fyydPage.tableData_old, app.fyydPage.columnTitle);
		addNewSearchShellTable("��ҽ��ֳ", app.fqzPage.tableData_old, app.fqzPage.columnTitle);
		addNewSearchShellTable("������ѧ", app.fckxPage.tableData_old, app.fckxPage.columnTitle);
		addNewSearchShellTable("�����ѧ", app.jzkxPage.tableData_old, app.jzkxPage.columnTitle);
		addNewSearchShellTable("��ҽ���", app.wkxPage.tableData_old, app.wkxPage.columnTitle);
		addNewSearchShellTable("��ҽ����", app.wskxPage.tableData_old, app.wskxPage.columnTitle);
		addNewSearchShellTable("��ҩ�ֲ�", app.xyscPage.tableData_old, app.xyscPage.columnTitle);
		addNewSearchShellTable("��ҩͬԴ", app.tableData_old, app.columnTitle);
		addNewSearchShellTable("����ɭ", app.cecil.tableData_old, app.cecil.columnTitle);
		//��������ҳ�棬
		//�ڵ���ӵ�������ݱ�ҳ�� ���Ժ�Ҳ������ ���亯����
		return true;
	}
}