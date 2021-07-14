package ISQ.VSU.feature;
//准备用肽展公式来设计个 皮肤病检测程序.
//罗瑶光 20210710
//软件思想 肽展腐蚀变换. 计算机视觉. 
//硬件工具, imageIO, javaCV.
//因为肽展公式和思想GPL2.0开源,本程序源码同样GPL2.0开源.
public class GetICAStatisticRatio{
	int corr= 15;	
	public int getPinkStatisticCount(int[][] r, int[][] g, int[][] b) {
		int ri= 255;
		int gi= 0;
		int bi= 255;
		return getCountOfKernel(r, g, b, ri, gi, bi);
	}
	
	public int getWhiteStatisticCount(int[][] r, int[][] g, int[][] b) {
		int ri= 255;
		int gi= 255;
		int bi= 255;
		return getCountOfKernel(r, g, b, ri, gi, bi);
	}
	
	public int getPupilStatisticCount(int[][] r, int[][] g, int[][] b) {
		int ri= 128;
		int gi= 128;
		int bi= 128;
		return getCountOfKernel(r, g, b, ri, gi, bi);
	}
	
	public int getYellowStatisticCount(int[][] r, int[][] g, int[][] b) {
		int ri= 255;
		int gi= 255;
		int bi= 0;
		return getCountOfKernel(r, g, b, ri, gi, bi);
	}
	
	public int getRedStatisticCount(int[][] r, int[][] g, int[][] b) {
		int ri= 255;
		int gi= 0;
		int bi= 0;
		return getCountOfKernel(r, g, b, ri, gi, bi);
	}
	
	public int getGreenStatisticCount(int[][] r, int[][] g, int[][] b) {
		int ri= 0;
		int gi= 255;
		int bi= 0;
		return getCountOfKernel(r, g, b, ri, gi, bi);
	}
	
	public int getBlueStatisticCount(int[][] r, int[][] g, int[][] b) {
		int ri= 0;
		int gi= 0;
		int bi= 255;
		return getCountOfKernel(r, g, b, ri, gi, bi);
	}
	
	public int getCountOfKernel(int[][] r, int[][] g, int[][] b, int ri, int gi, int bi) {
		int count= 0;
		for(int i= 0; i< r.length; i++) {
			for(int j= 0; j< r[0].length; j++) {
				if(r[i][j]> ri- corr&& r[i][j]< ri+ corr) {
					if(g[i][j]> gi- corr&& g[i][j]< gi+ corr) {
						if(b[i][j]> bi- corr&& b[i][j]< bi+ corr) {
							count++;
						}
					}
				}
			}	
		}
		return count;
	}
}