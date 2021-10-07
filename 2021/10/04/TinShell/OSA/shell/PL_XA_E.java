package OSA.shell;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.table.DefaultTableModel;

import ME.APM.VSQ.App;
import OSI.AOP.MEC.SIQ.plorm.Const;
import OSM.shell.E_PLSearch_E;
//1 我的逻辑很简单， 仅仅按照PLORM 进行 PLSearch ，将deta数据库操作 用在
//养疗经的界面表操作上。先不设计改和写操作。
//2 用XA元基 来代替search 词汇。
// 准备用DefaultTableModel 来做输出对象， 因为养疗经的内存表是这个容器。
// 罗瑶光
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
		//这里需要 把数据库的 编译机器也重设计成执行内存操作的模式。
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
		//条件检查 1 过滤  2 修改 3 语义检测
		//1 
		for(int i= 1; i< PLSearchArray.length; i++) {
			//1.1 过滤相同句型
			//1.2 过滤无效字符
			//1.3 过滤攻击代码
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
		//2.1 修改错误比较符号
		//2.2 修改错误语法关键字
		//2.3 修改错误标注符号
		
		//3
		//3.1 检测是否有关键字前后句段混乱
		//3.2 检测是否有关键字 格式 倒置
		//3.3 检测是否有关键字 句型 倒置
		
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