package OSA.shell;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.table.DefaultTableModel;

import ME.APM.VSQ.App;
import OSI.AOP.MEC.SIQ.plorm.Const;
import OSM.shell.E_PLSearch_E;
//1 �ҵ��߼��ܼ򵥣� ��������PLORM ���� PLSearch ����deta���ݿ���� ����
//���ƾ��Ľ��������ϡ��Ȳ���Ƹĺ�д������
//2 ��XAԪ�� ������search �ʻ㡣
// ׼����DefaultTableModel ����������� ��Ϊ���ƾ����ڴ�������������
// ������
@SuppressWarnings("unused")
public class PL_XA_E implements PL_XA_C{
	private DefaultTableModel defaultTableModel;
	private Object[][] tableData_old;
	private App app;
	private String PLSearch= "";
	private String[] PLSearchArray;
	private Map<String, Object> map;
	public String getPLSearch() {
		return PLSearch;
	}

	public void I_PLSearch(String pLSearch) {
		PLSearch= pLSearch;
	}

	public PL_XA_E startAtRootDir(String rootAddress) {
		PLSearch= Const.SET_ROOT+ Const.COLON+ rootAddress
				+ Const.SEMICOLON;
		return this;
	}
	
	public PL_XA_E withBaseName(String baseName) {
		PLSearch+= Const.SEMICOLON+ Const.BASE_NAME+ Const.COLON
				+ baseName;
		return this;
	}
	//
	public PL_XA_E withTableSelect (String tableName) {
		PLSearch+= Const.SEMICOLON+ Const.TABLE_NAME+ Const.COLON
				+ tableName
				+ Const.COLON+ Const.SELECT;
		return this;
	}

	public PL_XA_E withTableCreate(String tableName) {
		PLSearch+= Const.SEMICOLON+ Const.TABLE_NAME+ Const.COLON
				+ tableName
				+ Const.COLON+ Const.CREATE;
		return this; 
	}
	
	public PL_XA_C withTableDrop(String tableName) {
		PLSearch+= Const.SEMICOLON+ Const.TABLE_NAME+ Const.COLON
				+ tableName
				+ Const.COLON+ Const.DROP;
		return this; 
	}
	
	public PL_XA_E withTableDelete(String tableName) {
		PLSearch+= Const.SEMICOLON+ Const.TABLE_NAME+ Const.COLON
				+ tableName
				+ Const.COLON+ Const.DELETE;
		return this; 
	}
	
	public PL_XA_E withTableInsert(String tableName) {
		PLSearch+= Const.SEMICOLON+ Const.TABLE_NAME+ Const.COLON
				+ tableName
				+ Const.COLON+ Const.INSERT;
		return this; 
	}
	
	public PL_XA_E withTableUpdate(String tableName) {
		PLSearch+= Const.SEMICOLON+ Const.TABLE_NAME+ Const.COLON
				+ tableName
				+ Const.COLON+ Const.UPDATE;
		return this; 
	}
	
	public PL_XA_E withCondition(String conditionType) {
		PLSearch+= Const.SEMICOLON+ Const.CONDITION+ Const.COLON
				+ conditionType;
		return this;
	}

	public PL_XA_E let(String leftSet) {
		PLSearch+= Const.COLON+ leftSet;
		return this;
	}

	public PL_XA_E lessThanAndEqualTo(String compareSet) {
		PLSearch+= Const.LESS_THAN_AND_EQUAL_TO+ compareSet;
		return this;
	}
	
	public PL_XA_E equalTo(String compareSet) {
		PLSearch+= Const.EQUAL_TO+ compareSet;
		return this;
	}
	
	public PL_XA_E lessThan(String compareSet) {
		PLSearch+= Const.LESS_THAN+ compareSet;
		return this;
	}
	
	public PL_XA_E greatThan(String compareSet) {
		PLSearch+= Const.GREAT_THAN+ compareSet;
		return this;
	}
	
	public PL_XA_E greatThanAndEqualTo(String compareSet) {
		PLSearch+= Const.GREAT_THAN_AND_EQUAL_TO+ compareSet;
		return this;
	}
	
	public PL_XA_E notEqualTo(String compareSet) {
		PLSearch+= Const.NOT_EQUAL_TO+ compareSet;
		return this;
	}
	
	public PL_XA_E in(String compareSet) {
		PLSearch+= Const.IN+ compareSet;
		return this;
	}
	
	public PL_XA_E notIn(String compareSet) {
		PLSearch+= Const.NOT_IN+ compareSet;
		return this;
	}
	
	public PL_XA_E equals(String compareSet) {
		PLSearch+= Const.EQUALS+ compareSet;
		return this;
	}
	
	public PL_XA_E notEquals(String compareSet) {
		PLSearch+= Const.NOT_EQUALS+ compareSet;
		return this;
	}
	
	public PL_XA_E innerJoinWithTable(String baseName, String tableName) {
		PLSearch+= Const.SEMICOLON+ Const.JOIN+ Const.COLON+ baseName
				+ Const.COLON+ tableName;
		return this;
	}
	
	public PL_XA_E withRelation(String relationType) {
		PLSearch+= Const.SEMICOLON+ Const.RELATION+ Const.COLON
				+ relationType;
		return this;
	}
	
	public PL_XA_E as(String compareSet) {
		PLSearch+= Const.AS+ compareSet;
		return this;
	}
	
	public PL_XA_E upTo(String compareSet) {
		PLSearch+= Const.UP_TO+ compareSet;
		return this;
	}
	
	public PL_XA_E withAggregation(String aggregationType) {
		PLSearch+= Const.SEMICOLON+ Const.WITH_AGGREGATION
				+ Const.COLON+ aggregationType;
		return this;
	}
	
	public PL_XA_E getCulumns() {
		PLSearch+= Const.SEMICOLON+ Const.GET_CULUMNS;
		return this;
	}
	
	public PL_XA_E changeCulumnName(String newCulumnName, String oldCulumnName) {
		PLSearch+= Const.SEMICOLON+ Const.CHANGES_CULUMN_NAME+ Const.COLON
				+ newCulumnName+ Const.COLON+ oldCulumnName;
		return this;
	}
	
	public PL_XA_E withCulumnName(String culumnName, String dataType) {
		PLSearch+= Const.SEMICOLON+ Const.CULUMN_NAME+ Const.COLON+ culumnName
				+ Const.COLON+ dataType;
		return this;
	}
	
	public PL_XA_E withCulumnValue(String culumnName, String culumnValue) {
		PLSearch+= Const.SEMICOLON+ Const.CULUMN_VALUE+ Const.COLON+ culumnName
				+ Const.COLON+ culumnValue;
		return this;
	}

	public PL_XA_C exec(boolean b) throws Exception {
		//map= E_PLSearch_E.E_PLORM(this, true);
		return this;
	}

	@Override
	public PL_XA_C checkErrors(String string) {
		return this;
	}

	@Override
	public PL_XA_C fixErrors(String string) {
		return this;
	}

	@Override
	public PL_XA_C finalE(boolean b) throws Exception {
		map= E_PLSearch_E.E_PLSearch(this, true, new ConcurrentHashMap<>());
		//������Ҫ �����ݿ�� �������Ҳ����Ƴ�ִ���ڴ������ģʽ��
		return this;
	}

	@Override
	public Map<String, Object> returnAsMap() {
		return this.map;
	}

	@Override
	public PL_XA_C checkAndFixPlSearchGrammarErrors() {
		//string to array
		this.PLSearchArray= PLSearch.split(Const.SEMICOLON);
		//������� 1 ����  2 �޸� 3 ������
		//1 
		for(int i= 1; i< PLSearchArray.length; i++) {
			//1.1 ������ͬ����
			//1.2 ������Ч�ַ�
			//1.3 ���˹�������
			if(PLSearchArray[i].equalsIgnoreCase(PLSearchArray[i- 1])) {
				PLSearchArray[i]= "";
			}
			PLSearchArray[i]= PLSearchArray[i].replaceAll(">+", ">");
			PLSearchArray[i]= PLSearchArray[i].replaceAll("<+", "<");
			PLSearchArray[i]= PLSearchArray[i].replaceAll("\\!+", "!");
			PLSearchArray[i]= PLSearchArray[i].replaceAll("\\~+", "~");
			PLSearchArray[i]= PLSearchArray[i].replaceAll("\\@+", "@");
			PLSearchArray[i]= PLSearchArray[i].replaceAll("\\&&+", "&&");
			PLSearchArray[i]= PLSearchArray[i].replaceAll("\\|\\|+", "||");
			PLSearchArray[i]= PLSearchArray[i].replaceAll("\\[+", "[");
			PLSearchArray[i]= PLSearchArray[i].replaceAll("\\]+", "]");
			PLSearchArray[i]= PLSearchArray[i].replaceAll("\\:+", ":");
			
			PLSearchArray[i]= PLSearchArray[i].replaceAll("\\s+", "");
		}
		//2
		//2.1 �޸Ĵ���ȽϷ���
		//2.2 �޸Ĵ����﷨�ؼ���
		//2.3 �޸Ĵ����ע����
		
		//3
		//3.1 ����Ƿ��йؼ���ǰ���λ���
		//3.2 ����Ƿ��йؼ��� ��ʽ ����
		//3.3 ����Ƿ��йؼ��� ���� ����
		
		//rerturn
		String string= "";
		for(int i= 0; i< PLSearchArray.length; i++) {
			string+= PLSearchArray[i]+ Const.SEMICOLON;
		}
		PLSearch= string;
		return this;
	}

	@Override
	public PL_XA_C checkAndFixSystemEnvironmentErrors() {
		return this;
	}

}