package OSA.shell;

import OP.SM.AOP.MEC.SIQ.SM.reflection.Row;

//����Ҫ���map����Ȼ ����� keyֵ��ѯ ֻ��forloop�� Ч�ʼ���
//������
public class SearchShellTable{
	public Object[] getHuaRuiJiJtableCulumns() {
		return huaRuiJiJtableCulumns;
	}
	public void setHuaRuiJiJtableCulumns(Object[] huaRuiJiJtableCulumns) {
		this.huaRuiJiJtableCulumns = huaRuiJiJtableCulumns;
	}
	public Object[][] getHuaRuiJiJtable() {
		return huaRuiJiJtable;
	}
	public void setHuaRuiJiJtable(Object[][] huaRuiJiJtable) {
		this.huaRuiJiJtable = huaRuiJiJtable;
	}
	public Object getHuaRuiJiJtableName() {
		return huaRuiJiJtableName;
	}
	public void setHuaRuiJiJtableName(Object huaRuiJiJtableName) {
		this.huaRuiJiJtableName = huaRuiJiJtableName;
	}
	public Row[] getHuaRuiJiJtableRows() {
		return huaRuiJiJtableRows;
	}
	public void setHuaRuiJiJtableRows(Row[] huaRuiJiJtableRows) {
		this.huaRuiJiJtableRows = huaRuiJiJtableRows;
	}
	
	public Object[] huaRuiJiJtableCulumns;
	public Object[][] huaRuiJiJtable;
	public Row[] huaRuiJiJtableRows;
	public Object huaRuiJiJtableName;
}