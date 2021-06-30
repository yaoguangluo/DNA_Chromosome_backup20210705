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
	//�Ƚ��Ƿ�������ȡ���б���� ������ ������ 20210405
		//�����Ӳ�̲�ѯ��������ʶ��, ������������ݻ����ѯ�������� ���û�ù���, ʱ�������2019��1�º�, ���ȵ�ͨ��, ֮��˷Դ.
		//׼��������20210406 ������
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
						//�ƺ��������ֽ�, 20210405 ���������¼��
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