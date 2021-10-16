package OSM.shell;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCache_M;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Table;
@SuppressWarnings({ "unused"})
//稍后将DMA文件与内存操作替换成 jtable表内存操作 罗瑶光
public class P_CO_pl_XA_XCDX {
//		public void P_Cache(String[] sets, List<Map<String, Object>> output
//				, String tableName, String baseName, Map<String, Object> object) {}
//	
//		//以后优化成统一对象输出，不需要再转换。2019-1-15 tin
//		Map<String, Object> rowToRowMap(Row row) {}
//	
//		public void P_Map(String[] sets, List<Map<String, Object>> output, String dBTablePath) {}
//		
//		//plsql 引擎函数获取表开始检查 罗瑶光 20210405  //奇怪了 这是一个没有读 缓存的plsql引擎,我准备对比下history
//		//object 指令堆栈
//		//output 数据行
//		public void P_Table(String[] sets, List<Map<String, Object>> output
//				, String DBTablePath, Map<String, Object> object) throws IOException {}
//	    
//		//比较是否有数据取出列表到输出 检验中 罗瑶光 20210405
//		//这个走硬盘查询函数来标识下, 在我设计了数据缓存查询启动函数 后就没用过了, 时间点大概在2019年1月后, 我先调通下, 之后朔源.
//		//准备验算下20210406 罗瑶光
//		public void P_kernel(String temp, File readDBTableRowIndexCulumnFile, File readDBTableRowIndexFile
//				, BufferedReader reader, String DBTableRowIndexPath, List<Map<String, Object>> output, Row bufferRow
//				, Map<String, Object> rowMap) throws IOException {}

}