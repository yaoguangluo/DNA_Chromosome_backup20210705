package OSM.shell;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
//稍后将DMA文件与内存操作替换成 jtable表内存操作 罗瑶光
//先替换所有涉及DMA的函数片段
public class P_CO_pl_XA_XCDX_Kernel extends P_CO_pl_XA_XCDX {
	//比较是否有数据取出列表到输出 检验中 罗瑶光 20210405
	//这个走硬盘查询函数来标识下, 在我设计了数据缓存查询启动函数 后就没用过了, 时间点大概在2019年1月后, 我先调通下, 之后朔源.
	//准备验算下20210406 罗瑶光
	public static void P_kernel(String temp, File readDBTableRowIndexCulumnFile, File readDBTableRowIndexFile
			, BufferedReader reader, String DBTableRowIndexPath, List<Map<String, Object>> output, Row bufferRow
			, Map<String, Object> rowMap) throws IOException {
		String[] culumnList = readDBTableRowIndexFile.list(); //生成一个列表头名组
		NextFile:
			for(String culumn: culumnList) { //遍历头名
				if(culumn.contains("is_delete")) {//已删除文件逃逸
					continue NextFile;
				}
				String DBTableCulumnIndexPath = readDBTableRowIndexFile + "/" + culumn;//开始取值	
				File readDBTableCulumnIndexPathFile = new File(DBTableCulumnIndexPath);
				Cell cell= new Cell();
				if (readDBTableCulumnIndexPathFile.isDirectory()) {
					//似乎被动了手脚, 20210405 罗瑶光重新检查
					reader = new BufferedReader(new FileReader(readDBTableCulumnIndexPathFile + "/" + "value.lyg"));  
					temp = "";
					String tempString;
					while ((tempString = reader.readLine()) != null) {
						temp += tempString;
					}
					reader.close();
					rowMap.put(culumn, temp); //储值
					cell.I_CellValue(temp); //数据库内存储值
					bufferRow.putCell(culumn, cell);
				}else {
					rowMap.put(culumn, null);
					cell.I_CellValue(null);
					bufferRow.putCell(culumn, cell);
				}
			}
		output.add(rowMap);
	}
	//P_kernel等比复制过来的search shell组件， 我要替换的是数据库储值， jtable表做output 
	//把jtable数据表的数据 变成数据库的db映射， 传入参数是dma的每一行文件的集合，
	//DefaultTableModel 的 Object[][] huaRuiJiJtable 对应 DBTablePath
	//readDBTableRowIndexFile对应 row id
	//huaRuiJiJtableCulumns 对应 culumn
	//jtable  太上层，用它的spec 速度会很慢。所以用object[][]  先
	//罗瑶光 20210924
	//出现一个问题，我的table db是非线性map 结构， 自带表头key， 而data 是矩阵，下面逻辑要全部改掉
	public static void P_kernel_search(String temp, File readDBTableRowIndexFile, int rowId, Object[] huaRuiJiJtableCulumns
			, Object[][] huaRuiJiJtable,List<Map<String, Object>> output, Row bufferRow, Map<String, Object> rowMap) throws IOException {
		Object[] rowList = huaRuiJiJtable[rowId];
		for(int i= 0; i< huaRuiJiJtableCulumns.length; i++) {
			Cell cell= new Cell();
			rowMap.put((String)huaRuiJiJtableCulumns[i], rowList[i]);
			cell.I_CellValue(rowList[i]);
			bufferRow.putCell((String)huaRuiJiJtableCulumns[i], cell);
		}
		output.add(rowMap);
	}
}