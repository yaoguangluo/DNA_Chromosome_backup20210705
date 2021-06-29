package AVQ.OEQ.cap;
import java.awt.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.imageio.ImageIO;
import OSI.AOP.freetts.thread.read.ReadEnglish;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.RangePDI;

public class Monitor_XCDX_Animation_Pde{
	@SuppressWarnings("deprecation")
	public static void XCDX_paint_pde(Monitor_XCDX monitor, Graphics g, BufferedImage image) throws IOException{
		if(monitor.isbt62Stop) {
			monitor.rp= new PEU.P.image.Emboss().P(monitor.rp);
			monitor.gp= new PEU.P.image.Emboss().P(monitor.gp);
			monitor.bp= new PEU.P.image.Emboss().P(monitor.bp);
		}
		if(monitor.isbt113Stop) {
			monitor.rp= new PEU.P.image.Sobel().P(monitor.rp, 1);
			monitor.gp= new PEU.P.image.Sobel().P(monitor.gp, 1);
			monitor.bp= new PEU.P.image.Sobel().P(monitor.bp, 1);
		}
		if(monitor.isbt43Stop) {
			monitor.rp= new PEU.P.image.Guassian().P_1D(monitor.rp, 3, 3, 1.66);
			monitor.gp= new PEU.P.image.Guassian().P_1D(monitor.gp, 3, 3, 1.66);
			monitor.bp= new PEU.P.image.Guassian().P_1D(monitor.bp, 3, 3, 1.66);
		}
		if(monitor.isbt41Stop) {
			monitor.rp= new PEU.P.image.Laplacian().P(monitor.rp);
			monitor.gp= new PEU.P.image.Laplacian().P(monitor.gp);
			monitor.bp= new PEU.P.image.Laplacian().P(monitor.bp);
		}
		if(monitor.isbt41Stop) {
			monitor.rp= new PEU.P.image.Laplacian().P(monitor.rp);
			monitor.gp= new PEU.P.image.Laplacian().P(monitor.gp);
			monitor.bp= new PEU.P.image.Laplacian().P(monitor.bp);
		}
		if(monitor.isbt114Stop) {
			monitor.rp= new RangePDI().IOE(monitor.rp, monitor.fact);
			monitor.gp= new RangePDI().IOE(monitor.gp, monitor.fact);
			monitor.bp= new RangePDI().IOE(monitor.bp, monitor.fact); 
		}
		if(monitor.isbt121Stop) {
			monitor.rp= new RangePDI().IPE(monitor.rp, monitor.facy);
			monitor.gp= new RangePDI().IPE(monitor.gp, monitor.facy);
			monitor.bp= new RangePDI().IPE(monitor.bp, monitor.facy); 
		}
		if(monitor.isbt122Stop) {
			monitor.rp= new RangePDI().QPE(monitor.rp, monitor.facx);
			monitor.gp= new RangePDI().QPE(monitor.gp, monitor.facx);
			monitor.bp= new RangePDI().QPE(monitor.bp, monitor.facx); 
		}
		if(monitor.isbt123Stop) {
			double facxd= ((double)monitor.facx)/360;
			monitor.rp= monitor.decadeToPDS.doPDSMatrix(monitor.decadeToPDS, monitor.rp, facxd);		
			monitor.gp= monitor.decadeToPDS.doPDSMatrix(monitor.decadeToPDS, monitor.gp, facxd);		
			monitor.bp= monitor.decadeToPDS.doPDSMatrix(monitor.decadeToPDS, monitor.bp, facxd);		
		}

		for (int i= 0; i< image.getHeight(); ++i) {
			for (int j= 0; j< image.getWidth(); ++j) {	
				int pixel= (monitor.rp[j][i]<< 16)| (monitor.gp[j][i]<< 8)| (monitor.bp[j][i]) ;
				if(monitor.showOCLDr[j][i]== 255) {
					if(monitor.r2r[j][i]> 30) {
						pixel= (monitor.r2r[j][i]<< 16) ;
					}
				}
				if(monitor.showOCLDg[j][i]== 255) {
					if(monitor.r2g[j][i]> 30) {
						pixel= pixel| (monitor.r2g[j][i]<< 8) ;
					}
				}

				if(monitor.showOCLDb[j][i] == 255) {
					if(monitor.r2b[j][i]> 30) {
						pixel= pixel| monitor.r2b[j][i]  ;
					}
				}
				image.setRGB(j, i, pixel);
			}
		}
		if(!monitor.recordStop) {
			if(monitor.imageList.size()< 32*60*60) {
				System.out.println(1);
				int width= image.getWidth();
				int height= image.getHeight();
				int[][] flips= new int[width][height];
				for(int i= 0; i< image.getHeight(); ++i) {
					for(int j= 0; j< image.getWidth(); ++j) {
						flips[j][i]= image.getRGB(j, i);
					}
				}
				monitor.imageList.add(flips);
			}
		}
		g.drawImage(image, 0, 0, 900, 680, monitor);// 绘出图形文件
		monitor.imageForOutput= image;
		if(monitor.findr== 2) {
			if(monitor.readEnglish.finish== 1) {
				monitor.readEnglish= new ReadEnglish();
				monitor.readEnglish.I_PreReadText("attension please");
				monitor.readEnglish.start();
			}
			//write
			Date d= new Date();
			monitor.newtime= "" + d.getDay() + d.getHours() + d.getMinutes();
			monitor.newmi= d.getTime();
			long v= Math.abs(monitor.newmi- monitor.mi);
			if(monitor.newtime.equalsIgnoreCase(monitor.time)&& v> 3000){
				File outputBin= new File("C:\\Users\\Administrator\\Desktop\\monit\\rec"
						+ monitor.newtime+ monitor.newmi+ ".jpg");
				ImageIO.write(image, "png", outputBin);	
				monitor.mi= monitor.newmi;
			}
			monitor.time= monitor.newtime.toString();
		}	

	}
}