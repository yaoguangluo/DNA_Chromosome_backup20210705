package ISQ.VSU.feature;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.RangePDI;

//׼������չ��ʽ����Ƹ� Ƥ����������.
//������ 20210710
//���˼�� ��չ��ʴ�任. ������Ӿ�. 
//Ӳ������, imageIO, javaCV. ����ͷ
//��Ϊ��չ��ʽ��˼��GPL2.0��Դ,������Դ��ͬ��GPL2.0��Դ.
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