package OSA.shell;

import java.util.Map;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ME.APM.VSQ.App;
//��������ҽ� txt �� db ���ļ� ��jtable ����ӳ���object[][] ��jtable ̫�ϲ㣬��׼����Ƴ�VPCS �ṹ����jtable�� object[][]������������
//������
public class SearchShellTables{
	public Map<String, SearchShellTable> SearchShellTables;
	public void addNewSearchShellTable(String tableName, JTable jtable) {
			//..
	}
	
	public void addNewSearchShellTable(String tableName, DefaultTableModel defaultTableModel) {
		//..
	}
	
    public void addInitSearchShellTable(App app) {
		//�����ƾ��ı��������ʼ��ӳ��� SearchShellTables �ڴ��ȡ�
	}
}