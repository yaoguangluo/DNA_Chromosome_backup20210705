package OSI.AOP.MEC.SIQ.plorm;

import java.util.Map;

public interface PLORM_C{
	public String getPLSQL();
	public void setPLSQL(String pLSQL);
	public PLORM_C withTableCreate(String tableName);
	public PLORM_C withTableDelete(String tableName);
	public PLORM_C withTableInsert(String tableName);
	public PLORM_C withTableUpdate(String tableName);
	public PLORM_C withTableSelect(String tableName);
	public PLORM_C getCulumns();
	public PLORM_C startAtRootDir(String rootAddress);
	public PLORM_C withBaseName(String baseName);
	public PLORM_C withCondition(String conditionType);
	public PLORM_C let(String leftSet);
	public PLORM_C lessThanAndEqualTo(String compareSet);
	public PLORM_C equalTo(String compareSet);
	public PLORM_C lessThan(String compareSet);
	public PLORM_C greatThan(String compareSet);
	public PLORM_C greatThanAndEqualTo(String compareSet);
	public PLORM_C notEqualTo(String compareSet) ;
	public PLORM_C in(String compareSet) ;
	public PLORM_C notIn(String compareSet) ;
	public PLORM_C equals(String compareSet);
	public PLORM_C notEquals(String compareSet);
	public PLORM_C innerJoinWithTable(String baseName, String tableName);
	public PLORM_C withRelation(String relationType) ;
	public PLORM_C as(String compareSet) ;
	public PLORM_C upTo(String compareSet);
	public PLORM_C withAggregation(String aggregationType);
	public PLORM_C changeCulumnName(String newCulumnName, String oldCulumnName);
	public PLORM_C withCulumnName(String culumnName, String dataType);
	public PLORM_C withCulumnValue(String culumnName, String culumnValue);
	public PLORM_C checkErrors(String string);
	public PLORM_C fixErrors(String string);
	public PLORM_C finalE(boolean b) throws Exception;
	public Map<String, Object> returnAsMap();
	public PLORM_C checkAndFixPlsqlGrammarErrors();
	public PLORM_C checkAndFixSystemEnvironmentErrors();
	public PLORM_C withTableDrop(String tabKey);
}