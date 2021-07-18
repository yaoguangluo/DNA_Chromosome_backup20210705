package ISQ.VSU.feature;
//׼������չ��ʽ����Ƹ� Ƥ����������.
//������ 20210710
//����˼�� ��չ��ʴ�任. ������Ӿ�. 
//Ӳ������, imageIO, javaCV.
//��Ϊ��չ��ʽ��˼��GPL2.0��Դ,������Դ��ͬ��GPL2.0��Դ.
public class GetICAStatisticRatio{
	int corr= 15;	
	int scale= 7;
	public GetICAStatisticRatio(int scale, int corr) {
		this.scale= scale;
		this.corr= corr;
	}
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
		int gi= 0;
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
				if(r[i][j]* scale> ri- corr&& r[i][j]* scale< ri+ corr) {
					if(g[i][j]* scale> gi- corr&& g[i][j]* scale< gi+ corr) {
						if(b[i][j]* scale> bi- corr&& b[i][j]* scale< bi+ corr) {
							count++;
						}
					}
				}
			}	
		}
		return count;
	}
}