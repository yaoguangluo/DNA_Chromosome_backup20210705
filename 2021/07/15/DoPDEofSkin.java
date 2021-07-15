package ISQ.VSU.feature;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.RangePDI;

//准备用肽展公式来设计个 皮肤病检测程序.
//罗瑶光 20210710
//软件思想 肽展腐蚀变换. 计算机视觉. 
//硬件工具, imageIO, javaCV. 像素头
//因为肽展公式和思想GPL2.0开源,本程序源码同样GPL2.0开源.
public class DoPDEofSkin{
	public void doPDEofSkin() {

	}
	public void doPDSofSkin() {

	}
	public void doPDNofSkin() {

	}
	public void doTVMofSkin() {

	}
	public void doDNAofSkin() {

	}
	public void doRNAofSkin() {

	}
	public void doErosionofSkin() {

	}
	public int[][][] doPDEofSkin(int[][][] rgb, int ratio) {
		int[][][] output= new int[3][][];
		//int ratio= 50;
		int[][] rp= new RangePDI().IPE(rgb[0], ratio);
		int[][] gp= new RangePDI().IPE(rgb[1], ratio);
		int[][] bp= new RangePDI().IPE(rgb[2], ratio); 
		output[0]= rp;
		output[1]= gp;
		output[2]= bp;
		return output;
	}
}