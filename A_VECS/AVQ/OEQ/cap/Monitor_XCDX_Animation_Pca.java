package AVQ.OEQ.cap;
import java.awt.*;

import java.awt.image.BufferedImage;

public class Monitor_XCDX_Animation_Pca{
	public static void XCDX_paint_pca(Monitor_XCDX monitor, Graphics g, BufferedImage image){
		try {
			//PCA
			int[][] str= new int[image.getWidth()][image.getHeight()];
			int[][] stg= new int[image.getWidth()][image.getHeight()];
			int[][] stb= new int[image.getWidth()][image.getHeight()];
			if(monitor.isStreButton){
				if(monitor.isRedButton){
					str= new PEU.P.image.Strech().P(monitor.rp, 0.1, 0.9); 
				}
				if(monitor.isGreenButton){
					stg= new PEU.P.image.Strech().P(monitor.gp, 0.1, 0.9); 
				}
				if(monitor.isBlueButton){
					stb= new PEU.P.image.Strech().P(monitor.bp, 0.1, 0.9); 
				}
			}else {
				str= monitor.rp;
				stg= monitor.gp;
				stb= monitor.bp;
			}
			int[][] r2r= new int[image.getWidth()][image.getHeight()];
			int[][] r2g= new int[image.getWidth()][image.getHeight()];
			int[][] r2b= new int[image.getWidth()][image.getHeight()];
			if(monitor.isSblButton) {
				if(monitor.isRedButton) {
					r2r= new PEU.P.image.Sobel().P(str, 1);
				}
				if(monitor.isGreenButton) {
					r2g= new PEU.P.image.Sobel().P(stg, 1);
				}
				if(monitor.isBlueButton) {
					r2b= new PEU.P.image.Sobel().P(stb, 1);
				}
			}else {
				r2r= str;
				r2g= stg;
				r2b= stb;
			}
			int[][] gthdr= new int[image.getWidth()][image.getHeight()];
			int[][] gthdg= new int[image.getWidth()][image.getHeight()];
			int[][] gthdb= new int[image.getWidth()][image.getHeight()]; 
			if(monitor.isSblButton) {
				if(monitor.isRedButton) {
					gthdr= new PEU.P.image.Threshold().P(r2r, monitor.facx);
				}
				if(monitor.isGreenButton) {
					gthdg= new PEU.P.image.Threshold().P(r2g, monitor.facx);
				}
				if(monitor.isBlueButton) {
					gthdb= new PEU.P.image.Threshold().P(r2b, monitor.facx);
				}
			}else {
				gthdr= r2r;
				gthdg= r2g;
				gthdb= r2b;
			}
			monitor.diffr= monitor.findDiff(gthdr, monitor.out_oldr);	
			monitor.diffg= monitor.findDiff(gthdg, monitor.out_oldg);	
			monitor.diffb= monitor.findDiff(gthdb, monitor.out_oldb);	
		}catch(Exception e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}
}