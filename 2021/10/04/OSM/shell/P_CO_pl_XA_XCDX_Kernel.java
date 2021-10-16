package OSM.shell;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
//�Ժ�DMA�ļ����ڴ�����滻�� jtable���ڴ���� ������
//���滻�����漰DMA�ĺ���Ƭ��
public class P_CO_pl_XA_XCDX_Kernel extends P_CO_pl_XA_XCDX {
	//�Ƚ��Ƿ�������ȡ���б���� ������ ������ 20210405
	//�����Ӳ�̲�ѯ��������ʶ��, ������������ݻ����ѯ�������� ���û�ù���, ʱ�������2019��1�º�, ���ȵ�ͨ��, ֮��˷Դ.
	//׼��������20210406 ������
	public static void P_kernel(String temp, File readDBTableRowIndexCulumnFile, File readDBTableRowIndexFile
			, BufferedReader reader, String DBTableRowIndexPath, List<Map<String, Object>> output, Row bufferRow
			, Map<String, Object> rowMap) throws IOException {
		String[] culumnList = readDBTableRowIndexFile.list(); //����һ���б�ͷ����
		NextFile:
			for(String culumn: culumnList) { //����ͷ��
				if(culumn.contains("is_delete")) {//��ɾ���ļ�����
					continue NextFile;
				}
				String DBTableCulumnIndexPath = readDBTableRowIndexFile + "/" + culumn;//��ʼȡֵ	
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
					rowMap.put(culumn, temp); //��ֵ
					cell.I_CellValue(temp); //���ݿ��ڴ洢ֵ
					bufferRow.putCell(culumn, cell);
				}else {
					rowMap.put(culumn, null);
					cell.I_CellValue(null);
					bufferRow.putCell(culumn, cell);
				}
			}
		output.add(rowMap);
	}
	//P_kernel�ȱȸ��ƹ�����search shell����� ��Ҫ�滻�������ݿⴢֵ�� jtable����output 
	//��jtable���ݱ������ ������ݿ��dbӳ�䣬 ���������dma��ÿһ���ļ��ļ��ϣ�
	//DefaultTableModel �� Object[][] huaRuiJiJtable ��Ӧ DBTablePath
	//readDBTableRowIndexFile��Ӧ row id
	//huaRuiJiJtableCulumns ��Ӧ culumn
	//jtable  ̫�ϲ㣬������spec �ٶȻ������������object[][]  ��
	//������ 20210924
	//����һ�����⣬�ҵ�table db�Ƿ�����map �ṹ�� �Դ���ͷkey�� ��data �Ǿ��������߼�Ҫȫ���ĵ�
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