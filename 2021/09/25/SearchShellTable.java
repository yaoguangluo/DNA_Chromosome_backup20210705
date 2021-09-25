package OSA.shell;

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
	
	public Object[] huaRuiJiJtableCulumns;
	public Object[][] huaRuiJiJtable;
	public Object huaRuiJiJtableName;
}