package ME.SM.OP.SM.AOP.MEC.SIQ.E;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
public class P_ConditionPLSQL_XCDX_Kernel extends P_ConditionPLSQL_XCDX {
	//比较是否有数据取出列表到输出 检验中 罗瑶光 20210405
		//这个走硬盘查询函数来标识下, 在我设计了数据缓存查询启动函数 后就没用过了, 时间点大概在2019年1月后, 我先调通下, 之后朔源.
		//准备验算下20210406 罗瑶光
		public static void P_kernel(String temp, File readDBTableRowIndexCulumnFile, File readDBTableRowIndexFile
				, BufferedReader reader, String DBTableRowIndexPath, List<Map<String, Object>> output, Row bufferRow
				, Map<String, Object> rowMap) throws IOException {
			String[] culumnList = readDBTableRowIndexFile.list();
			NextFile:
				for(String culumn: culumnList) {
					if(culumn.contains("is_delete")) {
						continue NextFile;
					}
					String DBTableCulumnIndexPath = readDBTableRowIndexFile + "/" + culumn;	
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
						rowMap.put(culumn, temp);
						cell.I_CellValue(temp);
						bufferRow.putCell(culumn, cell);
					}else {
						rowMap.put(culumn, null);
						cell.I_CellValue(null);
						bufferRow.putCell(culumn, cell);
					}
				}
			output.add(rowMap);
		}
}