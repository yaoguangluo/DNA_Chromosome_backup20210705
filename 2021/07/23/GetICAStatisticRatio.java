package ISQ.VSU.feature;
//׼������չ��ʽ����Ƹ� Ƥ����������.
//������ 20210710
//���˼�� ��չ��ʴ�任. ������Ӿ�. 
//Ӳ������, imageIO, javaCV.
//��Ϊ��չ��ʽ��˼��GPL2.0��Դ,������Դ��ͬ��GPL2.0��Դ.
public class GetICAStatisticRatio{
	int corr= 15;	
	int scale= 7;
	public GetICAStatisticRatio(int scale, int corr) {
		this.scale= scale;
		this.corr= corr;
	}
	public int getPinkStatisticCount(int[][][] rgb) {
		int ri= 255;
		int gi= 0;
		int bi= 255;
		return getCountOfKernel(rgb, ri, gi, bi);
	}
	
	public int getWhiteStatisticCount(int[][][] rgb) {
		int ri= 255;
		int gi= 255;
		int bi= 255;
		return getCountOfKernel(rgb, ri, gi, bi);
	}
	
	public int getPupilStatisticCount(int[][][] rgb) {
		int ri= 255;
		int gi= 0;
		int bi= 255;
		return getCountOfKernel(rgb, ri, gi, bi);
	}
	
	public int getYellowStatisticCount(int[][][] rgb) {
		int ri= 255;
		int gi= 255;
		int bi= 0;
		return getCountOfKernel(rgb, ri, gi, bi);
	}
	
	public int getRedStatisticCount(int[][][] rgb) {
		int ri= 255;
		int gi= 0;
		int bi= 0;
		return getCountOfKernel(rgb, ri, gi, bi);
	}
	
	public int getGreenStatisticCount(int[][][] rgb) {
		int ri= 0;
		int gi= 255;
		int bi= 0;
		return getCountOfKernel(rgb, ri, gi, bi);
	}
	
	public int getBlueStatisticCount(int[][][] rgb) {
		int ri= 0;
		int gi= 0;
		int bi= 255;
		return getCountOfKernel(rgb, ri, gi, bi);
	}
	
	public int getMidPinkStatisticCount(int[][][] rgb) {
		int ri= 128;
		int gi= 0;
		int bi= 128;
		return getCountOfKernel(rgb, ri, gi, bi);
	}
	
	public int getMidWhiteStatisticCount(int[][][] rgb) {
		int ri= 128;
		int gi= 128;
		int bi= 128;
		return getCountOfKernel(rgb, ri, gi, bi);
	}
	
	public int getMidPupilStatisticCount(int[][][] rgb) {
		int ri= 128;
		int gi= 0;
		int bi= 128;
		return getCountOfKernel(rgb, ri, gi, bi);
	}
	
	public int getMidYellowStatisticCount(int[][][] rgb) {
		int ri= 128;
		int gi= 128;
		int bi= 0;
		return getCountOfKernel(rgb, ri, gi, bi);
	}
	
	public int getMidRedStatisticCount(int[][][] rgb) {
		int ri= 128;
		int gi= 0;
		int bi= 0;
		return getCountOfKernel(rgb, ri, gi, bi);
	}
	
	public int getMidGreenStatisticCount(int[][][] rgb) {
		int ri= 0;
		int gi= 128;
		int bi= 0;
		return getCountOfKernel(rgb, ri, gi, bi);
	}
	
	public int getMidBlueStatisticCount(int[][][] rgb) {
		int ri= 0;
		int gi= 0;
		int bi= 128;
		return getCountOfKernel(rgb, ri, gi, bi);
	}
	
	
	public int getCountOfKernel(int[][][] rgb, int ri, int gi, int bi) {
		int count= 0;
		for(int i= 0; i< rgb[0].length; i++) {
			for(int j= 0; j< rgb[0][0].length; j++) {
				if(rgb[0][i][j]* scale> ri- corr&& rgb[0][i][j]* scale< ri+ corr) {
					if(rgb[1][i][j]* scale> gi- corr&& rgb[1][i][j]* scale< gi+ corr) {
						if(rgb[2][i][j]* scale> bi- corr&& rgb[2][i][j]* scale< bi+ corr) {
							count++;
						}
					}
				}
			}	
		}
		return count;
	}
}