package PCI.ASQ.statistic;
public class ShareholdCount{
	//统计
	//思想：数理统计思想 罗瑶光 20191226
	//实现：罗瑶光
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