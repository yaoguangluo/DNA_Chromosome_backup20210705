package PCI.ASQ.statistic;
public class ShareholdCount{
	//ͳ��
	//˼�룺����ͳ��˼�� ������ 20191226
	//ʵ�֣�������
	public static double getShareholdCount(int[][] input, int sharehold){
		double count= 0;
		for (int i= 0; i< input.length; i++){
			for (int j= 0; j< input[0].length; j++){
				if(input[i][j]> sharehold) {
					count++;	
				}  		
			}
		}
		return count;
	}
}