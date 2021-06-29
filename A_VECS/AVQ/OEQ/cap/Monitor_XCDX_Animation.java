package AVQ.OEQ.cap;
import java.awt.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import javax.imageio.ImageIO;
import ESU.image.ToolkitImageToBufferImage;
import OSI.AOP.freetts.thread.read.ReadEnglish;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.RangePDI;

public class Monitor_XCDX_Animation{
	@SuppressWarnings("deprecation")
	public static void XCDX_paint(Monitor_XCDX monitor, Graphics g){
		try {
			if(monitor.grabber!= null) {
				try {
					monitor.frame= monitor.grabber.grab();
				}catch(Exception e) {
					return;
				}
				if(monitor.frame!= null) {	 
					if(monitor.isStop) {
						//return;
					}
					//预处理
					try {
						monitor.difImage= monitor.paintConverter.getBufferedImage(monitor.frame, 1);
					}catch(Exception e) {
						return;
					}
					BufferedImage image;
					if(monitor.isStop) {
						//image= new BufferedImage(640, 480, BufferedImage.TYPE_INT_RGB);
						//image.getGraphics().drawImage(img, 0, 0, 640, 480, this);	
						image= new ToolkitImageToBufferImage().toolkitImageToBufferImage(monitor.img, 0, 0, 640, 480, monitor);
					}else {
						image= (BufferedImage) monitor.difImage;
					}
					int[][] rp= new int[image.getWidth()][image.getHeight()];
					int[][] gp= new int[image.getWidth()][image.getHeight()];
					int[][] bp= new int[image.getWidth()][image.getHeight()];

					Monitor_XCDX_Animation_EyeScan.XCDX_paint_eyeScan(monitor, g, image);
					Monitor_XCDX_Animation_Pca.XCDX_paint_pca(monitor, g, image);
					Monitor_XCDX_Animation_Ica.XCDX_paint_ica(monitor, g, image);
					Monitor_XCDX_Animation_PcfButton.XCDX_paint_PcfButton(monitor, g, image, monitor.gpcar, monitor.gpcag, monitor.gpcab);
					
					if(monitor.isbt62Stop) {
						rp= new PEU.P.image.Emboss().P(rp);
						gp= new PEU.P.image.Emboss().P(gp);
						bp= new PEU.P.image.Emboss().P(bp);
					}
					if(monitor.isbt113Stop) {
						rp= new PEU.P.image.Sobel().P(rp, 1);
						gp= new PEU.P.image.Sobel().P(gp, 1);
						bp= new PEU.P.image.Sobel().P(bp, 1);
					}
					if(monitor.isbt43Stop) {
						rp= new PEU.P.image.Guassian().P_1D(rp, 3, 3, 1.66);
						gp= new PEU.P.image.Guassian().P_1D(gp, 3, 3, 1.66);
						bp= new PEU.P.image.Guassian().P_1D(bp, 3, 3, 1.66);
					}
					if(monitor.isbt41Stop) {
						rp= new PEU.P.image.Laplacian().P(rp);
						gp= new PEU.P.image.Laplacian().P(gp);
						bp= new PEU.P.image.Laplacian().P(bp);
					}
					if(monitor.isbt41Stop) {
						rp= new PEU.P.image.Laplacian().P(rp);
						gp= new PEU.P.image.Laplacian().P(gp);
						bp= new PEU.P.image.Laplacian().P(bp);
					}
					if(monitor.isbt114Stop) {
						rp= new RangePDI().IOE(rp, monitor.fact);
						gp= new RangePDI().IOE(gp, monitor.fact);
						bp= new RangePDI().IOE(bp, monitor.fact); 
					}
					if(monitor.isbt121Stop) {
						rp= new RangePDI().IPE(rp, monitor.facy);
						gp= new RangePDI().IPE(gp, monitor.facy);
						bp= new RangePDI().IPE(bp, monitor.facy); 
					}
					if(monitor.isbt122Stop) {
						rp= new RangePDI().QPE(rp, monitor.facx);
						gp= new RangePDI().QPE(gp, monitor.facx);
						bp= new RangePDI().QPE(bp, monitor.facx); 
					}
					if(monitor.isbt123Stop) {
						double facxd= ((double)monitor.facx)/360;
						rp= monitor.decadeToPDS.doPDSMatrix(monitor.decadeToPDS, rp, facxd);		
						gp= monitor.decadeToPDS.doPDSMatrix(monitor.decadeToPDS, gp, facxd);		
						bp= monitor.decadeToPDS.doPDSMatrix(monitor.decadeToPDS, bp, facxd);		
					}

					for (int i= 0; i< image.getHeight(); ++i) {
						for (int j= 0; j< image.getWidth(); ++j) {	
							int pixel= (rp[j][i]<< 16)| (gp[j][i]<< 8)| (bp[j][i]) ;
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
				monitor.q+= 1;
				if(monitor.q>= monitor.encry_c) {
					monitor.q= 0;
				}
				monitor.q_new+= 1;
				if(monitor.q_new>= monitor.encry_c_new) {
					monitor.q_new= 0;
				}
				monitor.q_fs+= 1;
				if(monitor.q_fs>= monitor.encry_c_fs) {
					monitor.q_fs= 0;
				}
			}
		}catch(Exception e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}
}