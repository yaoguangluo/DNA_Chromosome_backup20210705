package OSA.shell;

import java.util.Map;
//稍后将DMA文件与内存操作替换成 jtable表内存操作 罗瑶光
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

	////根据tinshell002 文档的中文语法关键字 将PLORM 也中文化
	public PL_XA_C 操作为(String 操作类型);
	public PL_XA_C 条件为(String 条件类型);
	public PL_XA_C 颜色标记为(String 颜色类型);
	public PL_XA_C 进行分词(String 逻辑类型);
	public PL_XA_C 进行字符串排序(String 排序类型);
	public PL_XA_C 进行精度搜索(String 搜索内容);
	public PL_XA_C 执行PLETL(String 节点名);
	public PL_XA_C 执行PLTCP(String 表列名);
	public PL_XA_C 进行表格相交(String 执行逻辑);
	public PL_XA_C 进行表格合并(String 执行逻辑);
	public PL_XA_C 进行表格剔除(String 执行逻辑);
	public PL_XA_C 进行WEB请求(String 端口号);
	public PL_XA_C 获取表列名(String 列表名);
	//。。。。
	//。。
	//。。。
	//。

	//目前用不到PLORM，优先级稍后,先继续设计更多 TINSHELL 命令

	//	操作
	//	条件为
	//	获取表名
	//	获取表列名
	//	进行分词
	//	词性标注
	//	词性显色
	//	DNN
	//	颜色标记为
	//	红色
	//	蓝色
	//	黄色
	//	绿色
	//	进行字符排序
	//	进行数字排序
	//	从小到大
	//	从大到小
	//	行至
	//	包含
	//	改名为
	//	过滤掉
	//	不包含
	//	进行选择
	//	精度搜索
	//	PLETL
	//	中节点
	//	进行表格相交
	//	进行表格合并
	//	进行表格剔除
	//	主码为
	//	ID
	//	模式为
	//	相交部分剔除
	//	新增列
	//	叠加列
	//	有交集叠加列
	//	有交集新增列
	//	无交集新增列
	//	其他非中文命令见 德塔PLSQL 文档
	//	PLTCP
	//	进行WEB 请求
	//	接口为
	//	端口为
	//	操作为
}