package OSM.shell;

import java.util.Map;

public interface PL_XA_C{
	public String getPLSearch();
	public void I_PLSearch(String pLSearch);
	public PL_XA_C withTableCreate(String tableName);
	public PL_XA_C withTableDelete(String tableName);
	public PL_XA_C withTableInsert(String tableName);
	public PL_XA_C withTableUpdate(String tableName);
	public PL_XA_C withTableSelect(String tableName);
	public PL_XA_C getCulumns();
	public PL_XA_C startAtRootDir(String rootAddress);
	public PL_XA_C withBaseName(String baseName);
	public PL_XA_C withCondition(String conditionType);
	public PL_XA_C let(String leftSet);
	public PL_XA_C lessThanAndEqualTo(String compareSet);
	public PL_XA_C equalTo(String compareSet);
	public PL_XA_C lessThan(String compareSet);
	public PL_XA_C greatThan(String compareSet);
	public PL_XA_C greatThanAndEqualTo(String compareSet);
	public PL_XA_C notEqualTo(String compareSet) ;
	public PL_XA_C in(String compareSet) ;
	public PL_XA_C notIn(String compareSet) ;
	public PL_XA_C equals(String compareSet);
	public PL_XA_C notEquals(String compareSet);
	public PL_XA_C innerJoinWithTable(String baseName, String tableName);
	public PL_XA_C withRelation(String relationType) ;
	public PL_XA_C as(String compareSet) ;
	public PL_XA_C upTo(String compareSet);
	public PL_XA_C withAggregation(String aggregationType);
	public PL_XA_C changeCulumnName(String newCulumnName, String oldCulumnName);
	public PL_XA_C withCulumnName(String culumnName, String dataType);
	public PL_XA_C withCulumnValue(String culumnName, String culumnValue);
	public PL_XA_C checkErrors(String string);
	public PL_XA_C fixErrors(String string);
	public PL_XA_C finalE(boolean b) throws Exception;
	public Map<String, Object> returnAsMap();
	public PL_XA_C checkAndFixPlSearchGrammarErrors();
	public PL_XA_C checkAndFixSystemEnvironmentErrors();
	public PL_XA_C withTableDrop(String tabKey);
}