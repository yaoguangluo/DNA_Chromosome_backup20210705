package AVQ.OEQ.cap;
import java.awt.*;

import java.awt.image.BufferedImage;

import SVQ.stable.StableVision;

public class Monitor_XCDX_Animation_PcfButton{
	@SuppressWarnings({"unused"})
	public static void XCDX_paint_PcfButton(Monitor_XCDX monitor, Graphics g, BufferedImage image
			, int [][] gpcar, int[][] gpcag, int[][] gpcab){
		try {
			int[][] diff2r;
			int[][] diff2g;
			int[][] diff2b;
			int[][] ccar= new int[image.getWidth()][image.getHeight()];
			int[][] ccag= new int[image.getWidth()][image.getHeight()];
			int[][] ccab= new int[image.getWidth()][image.getHeight()];
			//CCA 关联成分分析				
			if(monitor.isPcaButton) {
				if(monitor.isRedButton) {
					diff2r= monitor.findDiff(gpcar, monitor.out_old2r);
					ccar= new PEU.P.image.Dilation()
							.P(diff2r, StableVision.diaMask);
				}
				if(monitor.isGreenButton == true) {
					diff2g = monitor.findDiff(gpcag, monitor.out_old2g);
					ccag = new PEU.P.image.Dilation()
							.P(diff2g, StableVision.diaMask);
				}
				if(monitor.isBlueButton == true) {
					diff2b = monitor.findDiff(gpcab, monitor.out_old2b);
					ccab = new PEU.P.image.Dilation()
							.P(diff2b, StableVision.diaMask);
				}
			}else {
				ccar= gpcar;
				ccag= gpcag;
				ccab= gpcab;	
			}

			//OJLID
			int cxr= 0;
			int cyr= 0;
			monitor.showOCLDr= new int[image.getWidth()][image.getHeight()];
			monitor.showORGNr= new int[image.getWidth()][image.getHeight()];
			int cxg= 0;
			int cyg= 0;
			int findg= 0;
			monitor.showOCLDg= new int[image.getWidth()][image.getHeight()];
			monitor.showORGNg= new int[image.getWidth()][image.getHeight()];
			int cxb= 0;
			int cyb= 0;
			int findb= 0;
			monitor.showOCLDb= new int[image.getWidth()][image.getHeight()];
			monitor.showORGNb= new int[image.getWidth()][image.getHeight()];

			if(monitor.isPcfButton) {
				for(int i= 0; i< image.getHeight(); ++i) {
					for(int j= 0; j< image.getWidth(); ++j) {
						if(monitor.isRedButton) {
							if(ccar[j][i]> 0) {
								int x= j;
								int y= i;
								if(cxr== 0&& cyr== 0) {
									cxr= cxr+ x;
									cyr= cyr+ y;
								}
								cxr= cxr+ x;
								cyr= cyr+ y;
								monitor.findr= 1;
								monitor.showOCLDr[x][y]= 255;
								monitor.showORGNr[x][y]= 255;
								cxr= cxr>> 1;
				cyr= cyr>> 1;
				float dx= cxr- x;
				float dy= cyr- y;
				float co= dy/ dx;
				int dis = Math.abs(cxr- x);
				//欧基里德填充
				for(int k= 0; k< dis; k++) {
					if(cxr>= x&& cyr>= y) {
						monitor.showOCLDr[x+ k][y+ (int)(k* co)]= 255;	
						monitor.expand(monitor.showOCLDr, x+ k, y+ (int)(k* co), monitor.fact, 1);
					}
					if(cxr< x&& cyr>= y) {
						monitor.showOCLDr[x- k][y- (int)(k * co)]= 255;
						monitor.expand(monitor.showOCLDr, x- k, y- (int)(k* co), monitor.fact, 2);
					}
					if(cxr>= x&& cyr< y) {
						monitor.showOCLDr[x+ k][y+ (int)(k * co)]= 255;	
						monitor.expand(monitor.showOCLDr, x+ k, y+ (int)(k* co), monitor.fact, 3);
					}
					if(cxr< x&& cyr< y) {
						monitor.showOCLDr[x- k][y- (int)(k * co)]= 255;
						monitor.expand(monitor.showOCLDr, x- k, y- (int)(k* co), monitor.fact, 4);
					}
				}
							}
						}
						if(monitor.isGreenButton) {
							if(ccag[j][i]> 0) {
								int x= j;
								int y= i;
								if(cxg== 0&& cyg== 0) {
									cxg= cxg+ x;
									cyg= cyg+ y;
								}
								cxg=cxg+ x;
								cyg=cyg+ y;
								findg= 1;
								monitor.showOCLDg[x][y]= 255;
								monitor.showORGNg[x][y]= 255;
								cxg= cxg>> 1;
					cyg= cyg>> 1;
					float dx= cxg- x;
					float dy= cyg- y;
					float co= dy/ dx;
					int dis= Math.abs(cxg - x);
					//欧基里德填充
					for(int k= 0; k< dis; k++) {
						if(cxg>= x&& cyg>= y) {
							monitor.showOCLDg[x+ k][y+ (int)(k* co)]= 255;	
							monitor.expand(monitor.showOCLDg,x+ k, y+ (int)(k* co), monitor.fact, 1);
						}
						if(cxg< x&& cyg>= y) {
							monitor.showOCLDg[x- k][y - (int)(k* co)]= 255;
							monitor.expand(monitor.showOCLDg, x- k, y- (int)(k* co), monitor.fact, 2);
						}
						if(cxg>= x&& cyg< y) {
							monitor.showOCLDg[x+ k][y+ (int)(k* co)] = 255;	
							monitor.expand(monitor.showOCLDg, x+ k, y+ (int)(k * co), monitor.fact, 3);
						}
						if(cxg< x&& cyg< y) {
							monitor.showOCLDg[x- k][y- (int)(k* co)] = 255;
							monitor.expand(monitor.showOCLDg, x- k, y- (int)(k * co), monitor.fact, 4);
						}
					}
							}
						}
						if(monitor.isBlueButton) {
							if(ccab[j][i]> 0) {
								int x= j;
								int y= i;
								if(cxb== 0&& cyb== 0) {
									cxb= cxb+ x;
									cyb= cyb+ y;
								}
								cxb= cxb+ x;
								cyb= cyb+ y;
								findb= 1;
								monitor.showOCLDb[x][y]= 255;
								monitor.showORGNb[x][y]= 255;
								cxb= cxb>> 1;
						cyb= cyb>> 1;
						float dx= cxb- x;
						float dy= cyb- y;
						float co= dy/ dx;
						int dis= Math.abs(cxb- x);
						//欧基里德填充
						for(int k= 0; k< dis; k++) {
							if(cxb>= x && cyb>= y) {
								monitor.showOCLDb[x+ k][y+ (int)(k* co)]= 255;	
								monitor.expand(monitor.showOCLDb, x+ k, y+ (int)(k* co), monitor.fact, 1);
							}
							if(cxb< x && cyb>= y) {
								monitor.showOCLDb[x- k][y- (int)(k* co)]= 255;
								monitor.expand(monitor.showOCLDb, x- k, y- (int)(k* co), monitor.fact, 2);
							}
							if(cxb>= x&& cyb< y) {
								monitor.showOCLDb[x+ k][y+ (int)(k* co)]= 255;	
								monitor.expand(monitor.showOCLDb, x+ k, y + (int)(k* co), monitor.fact, 3);
							}
							if(cxb< x&& cyb< y) {
								monitor.showOCLDb[x- k][y- (int)(k* co)]= 255;
								monitor.expand(monitor.showOCLDb, x- k, y- (int)(k* co), monitor.fact, 4);
							}
						}
							}
						}
					}
				}
			}else {
				monitor.showOCLDr= ccar;
				monitor.showORGNr= ccar;

				monitor.showOCLDg= ccag;
				monitor.showORGNg= ccag;

				monitor.showOCLDb= ccab;
				monitor.showORGNb= ccab;
			}
		}catch(Exception e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}
}