package AVQ.OEQ.cap;
import java.awt.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.imageio.ImageIO;
import ESU.image.ToolkitImageToBufferImage;
import OSI.AOP.freetts.thread.read.ReadEnglish;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.RangePDI;
import PCI.ASQ.image.ImagePixGroupFilter;
import SVQ.stable.StableVision;

public class Monitor_XCDX_Animation{
	@SuppressWarnings({ "deprecation", "unused" })
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
					if(true== monitor.isbt88Stop){
						for (int i= 0; i< image.getHeight(); ++i) {
							for (int j= 0; j< image.getWidth(); ++j) {   
								if(monitor.isRedButton) {
									rp[j][i]= (image.getRGB(j, i)>> 16& 0xFF);
								}
								if(monitor.isGreenButton) {
									gp[j][i]= (image.getRGB(j, i)>> 8& 0xFF);
								}
								if(monitor.isBlueButton) {
									bp[j][i]= (image.getRGB(j, i)>> 0& 0xFF);
								}
							}
						}	
						rp= new PEU.P.image.Strech().P(rp, 0.05, 0.95);
						rp= new PEU.P.image.Guassian().P_1D(rp, 3, 3, 1.66);
						int[][] mag= new PEU.P.image.Sobel().P(rp, 1);
						int[][] dir= new PEU.P.image.Sobel().P(rp, 2);
						mag= new PEU.P.image.Threshold().P(mag, 7);
						mag= new PEU.P.image.Mask().P(mag, dir);				
						mag= new PEU.P.image.Threshold().P_Section(mag, 25 ,110);		

						//将梯度的索贝尔分层后进行距离为2的 128像色素团小于1 大于50的像色素团噪声过滤输出。
						mag= ImagePixGroupFilter.getImagePix2DGroupFilter(mag, 128, 2, 1, 50);
						//将梯度的索贝尔分层后进行距离为2的 255像色素团小于1 大于50的像色素团噪声过滤输出。
						mag= ImagePixGroupFilter.getImagePix2DGroupFilter(mag, 255, 2, 1, 50);


						int[][] rp1= mag;
						int w= rp1.length;
						int h= rp1[0].length;
						int hy= StableVision.eyeHeart.length;
						int wy= StableVision.eyeHeart[0].length;
						int[][] output= new int[w][h];
						for(int i= 50; i< w-50; i++) {
							Here:
								for(int j= 50; j< h-150; j++) {
									int find997=0;int find996=0;int find995=0;int find998=0;
									if(i+wy<w-1&& j+hy< h-1) {
										for(int p=0;p<wy;p++) {
											for(int q=0; q<hy; q++) {
												if(StableVision.eyeHeart[q][p]==1) {
													if(rp1[i+p][j+q]==128) {
														find997++;
													}
													if(rp1[i+p][j+q]!=0) {
														find995++;
													}
												}
												if(StableVision.eyeHeart[q][p]==0) {
													if(rp1[i+p][j+q]==255) {
														find996++;
													}
													if(rp1[i+p][j+q]!=0) {
														find998++;
													}
												}
											}
										}
										if(find995>=13-4&&find995<13+3
												&&find996>12-1&&find996<12+1
												&&find997>9-1 &&find997<9+1
												&&find998>13-1 &&find998<13+1) {	
											int w1= 50;
											int h1= 50;
											int hy1= StableVision.eye.length;
											int wy1= StableVision.eye[0].length;
											int find1= 0; int find2=0; int find3=0; int find4=0;int find5=0;
											int find6= 0; int find7=0; int find8=0; int find9=0;int find10=0;
											int find11= 0; int find12=0; int find13=0; int find14=0;int find15=0;
											int find16= 0;;int find17= 0; int find18=0; int find19=0;;int find20=0;
											int find21= 0;int find22= 0;
											for(int p= -wy1/2; p<wy1/2; p++) {
												for(int q= -hy1/2; q<hy1/2; q++) {				
													if(StableVision.eye[q+ hy1/2][p+ wy1/2]==1) {
														if(rp1[i+p][j+q]==128) {
															find1++;
														}
													}
													if(StableVision.eye[q+ hy1/2][p+ wy1/2]==20) {
														if(rp1[i+p][j+q]==255) {
															find2++;
														}
													}
													if(StableVision.eye[q+ hy1/2][p+ wy1/2]==10) {
														if(rp1[i+p][j+q]==0) {
															find3++;
														}
														if(rp1[i+p][j+q]!=0) {
															find15++;
														}
													}
													if(StableVision.eye[q+ hy1/2][p+ wy1/2]==15) {
														if(rp1[i+p][j+q]==0) {
															find4++;
														}
													}
													if(StableVision.eye[q+ hy1/2][p+ wy1/2]==14) {
														if(rp1[i+p][j+q]==0) {
															find5++;
														}
													}
													if(StableVision.eye[q+ hy1/2][p+ wy1/2]==13) {
														if(rp1[i+p][j+q]==0) {
															find6++;
														}
													}
													if(StableVision.eye[q+ hy1/2][p+ wy1/2]==2) {
														if(rp1[i+p][j+q]==128) {
															find7++;
														}
														if(rp1[i+p][j+q]==255) {
															find21++;
														}
													}
													if(StableVision.eye[q+ hy1/2][p+ wy1/2]==3) {
														if(rp1[i+p][j+q]==255) {
															find8++;
														}
														if(rp1[i+p][j+q]==128) {
															find16++;
														}
													}
													if(StableVision.eye[q+ hy1/2][p+ wy1/2]==9) {
														if(rp1[i+p][j+q]==255) {
															find9++;
														}
														if(rp1[i+p][j+q]==128) {
															find20++;
														}
													}
													if(StableVision.eye[q+ hy1/2][p+ wy1/2]==19) {
														if(rp1[i+p][j+q]==255) {
															find10++;
														}
														if(rp1[i+p][j+q]==0) {
															find17++;
														}
													}
													if(StableVision.eye[q+ hy1/2][p+ wy1/2]==12) {
														if(rp1[i+p][j+q]==0) {
															find11++;
														}
														if(rp1[i+p][j+q]==255) {
															find18++;
														}
													}
													if(StableVision.eye[q+ hy1/2][p+ wy1/2]==5) {
														if(rp1[i+p][j+q]==0) {
															find12++;
														}
													}
													if(StableVision.eye[q+ hy1/2][p+ wy1/2]==7) {
														if(rp1[i+p][j+q]==0) {
															find13++;
														}
														if(rp1[i+p][j+q]==128) {
															find19++;
														}
													}
													if(StableVision.eye[q+ hy1/2][p+ wy1/2]==11) {
														if(rp1[i+p][j+q]==0) {
															find14++;
														}
													}
													if(StableVision.eye[q+ hy1/2][p+ wy1/2]==22) {
														if(rp1[i+p][j+q]==0) {
															find22++;
														}
													}
												}
											}
											int n=5;int nn=5;
											int m=5;int mm=25;
											if(
													find1>=00      
													&&find1<10+m
													&&find2<13+m
													&&find3>=12  -n   &&find3<50+m
													&&find4>=3      &&find4<20+m
													&&find5>=19 -n    &&find5<22+m
													&&find6>=8  -nn    &&find6<19
													&&find7>10  -nn    &&find7<35+m
													&&find8>20 -n     &&find8<75+m
													&&find9<10+m
													&&find10<1
													&&find11>=66  -n  &&find11<72+m
													&&find12>=10  -n   &&find12<30+m
													&&find13>=5      &&find13<15+m
													&&find14>=7   -nn   &&find14<9+m
													&&find15>=15  -nn   &&find15<35+m
													&&find16>=1     &&find16<20+m
													&&find17>=50 -nn  &&find17<=60+m
													&&find18<10+m
													&&find19<10+m
													&&find20<1
													&&find21<40+m
													&&find22>=0     
													&&find22<20 +m) {
												if(i>50&&i<550&&j>50&&j<400) {	
													System.out.println(find6);
													for(int m1= -wy1/2-20; m1< wy1/2+20; m1++) {
														for(int n1= -hy1/2-0; n1< hy1/2+10; n1++) {
															output[i+ m1][j+ n1]= 255;	
														}
													}
												}
											}
										}//59
									}//59
								}//59
						}
						rp1=output;
						rp= new PEU.P.image.Mask().P(rp1, rp); 
						gp= new PEU.P.image.Mask().P(rp1, gp); 
						bp= new PEU.P.image.Mask().P(rp1, bp); 
						int[][]temp=  new PEU.P.image.Mask().P(rp1, mag); 
						for (int i= 0; i< image.getHeight(); ++i) {
							for (int j= 0; j< image.getWidth(); ++j) {	
								int pixel= (rp[j][i]<< 16)| (gp[j][i]<< 8)| (bp[j][i]) ;
								image.setRGB(j, i, pixel);
							}
						}
						g.drawImage(image, 0, 0, 900, 680, monitor);// 绘出图形文件
						return;
					}
					for (int i= 0; i< image.getHeight(); ++i) {
						for (int j= 0; j< image.getWidth(); ++j) {   
							if(monitor.isRedButton) {
								rp[j][i]= (image.getRGB(j, i)>> 16& 0xFF);
								if(monitor.isbt53Stop&& rp[j][i]< 100) {
									rp[j][i]= 0;
								}else if(rp[j][i]< monitor.facr) {
									rp[j][i]= 0;
								}
							}
							if(monitor.isGreenButton) {
								gp[j][i]= (image.getRGB(j, i)>> 8& 0xFF);
								if(monitor.isbt53Stop&& gp[j][i]< 150) {
									gp[j][i]= 0;
								}else if(gp[j][i]< monitor.facg) {
									gp[j][i]= 0;
								}
							}
							if(monitor.isBlueButton){
								bp[j][i]= (image.getRGB(j, i) & 0xFF);
								if(monitor.isbt53Stop&& bp[j][i]< 100) {
									bp[j][i]= 0;
								}else if(bp[j][i]< monitor.facb) {
									bp[j][i]= 0;
								}
							}
						}
					}
					//PCA
					int[][] str= new int[image.getWidth()][image.getHeight()];
					int[][] stg= new int[image.getWidth()][image.getHeight()];
					int[][] stb= new int[image.getWidth()][image.getHeight()];
					if(monitor.isStreButton){
						if(monitor.isRedButton){
							str= new PEU.P.image.Strech().P(rp, 0.1, 0.9); 
						}
						if(monitor.isGreenButton){
							stg= new PEU.P.image.Strech().P(gp, 0.1, 0.9); 
						}
						if(monitor.isBlueButton){
							stb= new PEU.P.image.Strech().P(bp, 0.1, 0.9); 
						}
					}else {
						str=rp;
						stg=gp;
						stb=bp;
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
					int[][] diffr= monitor.findDiff(gthdr, monitor.out_oldr);	
					int[][] diffg= monitor.findDiff(gthdg, monitor.out_oldg);	
					int[][] diffb= monitor.findDiff(gthdb, monitor.out_oldb);	
					//ICA
					int[][] mskr= new int[image.getWidth()][image.getHeight()];
					int[][] mskg= new int[image.getWidth()][image.getHeight()];
					int[][] mskb= new int[image.getWidth()][image.getHeight()];
					int[][] gpcar = new int[image.getWidth()][image.getHeight()];
					int[][] gpcag = new int[image.getWidth()][image.getHeight()];
					int[][] gpcab = new int[image.getWidth()][image.getHeight()];
					Map<String, Integer> map= new ConcurrentHashMap<>(); 
					if(monitor.isRcaButton) {
						for (int i= 0; i< image.getHeight(); ++i) {
							for (int j= 0; j< image.getWidth(); ++j) {
								if(monitor.isRedButton) {
									if(mskr[j][i]== 0) {
										map= new ConcurrentHashMap<>();
										int size= monitor.getMskFilter(diffr, mskr, i, j, 0, map);
										if(size> monitor.facy){
											Iterator< String> it= map.keySet().iterator();
											while(it.hasNext()){
												String temp= it.next();
												if(size> monitor.facy){
													int x= Integer.valueOf(temp.split(",")[0]);
													int y= Integer.valueOf(temp.split(",")[1]);
													gpcar[x][y]= 255;
												}
											}
										}
									}
								}
								if(monitor.isGreenButton) {
									if(mskg[j][i]== 0) {
										map= new ConcurrentHashMap<>();
										int size= monitor.getMskFilter(diffg, mskg, i, j, 0, map);
										if(size> monitor.facy) {
											Iterator< String> it= map.keySet().iterator();
											while(it.hasNext()){
												String temp= it.next();
												if(size> monitor.facy){
													int x= Integer.valueOf(temp.split(",")[0]);
													int y= Integer.valueOf(temp.split(",")[1]);
													gpcag[x][y]= 255;
												}
											}
										}
									}
								}
								if(monitor.isBlueButton) {
									if(monitor.isGreenButton) {
										if(mskb[j][i]== 0) {
											map= new ConcurrentHashMap<>();
											int size= monitor.getMskFilter(diffb, mskb, i, j, 0, map);
											if(size> monitor.facy) {
												Iterator< String> it = map.keySet().iterator();
												while(it.hasNext()){
													String temp= it.next();
													if(size> monitor.facy){
														int x= Integer.valueOf(temp.split(",")[0]);
														int y= Integer.valueOf(temp.split(",")[1]);
														gpcab[x][y]= 255;
													}
												}
											}
										}
									}
								} 
							}
						}
					}else {
						gpcar= diffr;
						gpcag= diffg;
						gpcab= diffb;
					}
					Monitor_XCDX_Animation_PcfButton.XCDX_paint_PcfButton(monitor, g, image, gpcar, gpcag, gpcab);
					
//					int[][] diff2r;
//					int[][] diff2g;
//					int[][] diff2b;
//					int[][] ccar= new int[image.getWidth()][image.getHeight()];
//					int[][] ccag= new int[image.getWidth()][image.getHeight()];
//					int[][] ccab= new int[image.getWidth()][image.getHeight()];
//					//CCA 关联成分分析				
//					if(monitor.isPcaButton) {
//						if(monitor.isRedButton) {
//							diff2r= monitor.findDiff(gpcar, monitor.out_old2r);
//							ccar= new PEU.P.image.Dilation()
//									.P(diff2r, monitor.diaMask);
//						}
//						if(monitor.isGreenButton == true) {
//							diff2g = monitor.findDiff(gpcag, monitor.out_old2g);
//							ccag = new PEU.P.image.Dilation()
//									.P(diff2g, monitor.diaMask);
//						}
//						if(monitor.isBlueButton == true) {
//							diff2b = monitor.findDiff(gpcab, monitor.out_old2b);
//							ccab = new PEU.P.image.Dilation()
//									.P(diff2b, monitor.diaMask);
//						}
//					}else {
//						ccar= gpcar;
//						ccag= gpcag;
//						ccab= gpcab;	
//					}
//					//OJLID
//					int cxr= 0;
//					int cyr= 0;
//					int findr= 0;
//					int[][] showOCLDr= new int[image.getWidth()][image.getHeight()];
//					int[][] showORGNr= new int[image.getWidth()][image.getHeight()];
//					int cxg= 0;
//					int cyg= 0;
//					int findg= 0;
//					int[][] showOCLDg= new int[image.getWidth()][image.getHeight()];
//					int[][] showORGNg= new int[image.getWidth()][image.getHeight()];
//					int cxb= 0;
//					int cyb= 0;
//					int findb= 0;
//					int[][] showOCLDb= new int[image.getWidth()][image.getHeight()];
//					int[][] showORGNb= new int[image.getWidth()][image.getHeight()];
//					if(monitor.isPcfButton) {
//						for(int i= 0; i< image.getHeight(); ++i) {
//							for(int j= 0; j< image.getWidth(); ++j) {
//								if(monitor.isRedButton) {
//									if(ccar[j][i]> 0) {
//										int x= j;
//										int y= i;
//										if(cxr== 0&& cyr== 0) {
//											cxr= cxr+ x;
//											cyr= cyr+ y;
//										}
//										cxr= cxr+ x;
//										cyr= cyr+ y;
//										findr= 1;
//										showOCLDr[x][y]= 255;
//										showORGNr[x][y]= 255;
//										cxr= cxr>> 1;
//						cyr= cyr>> 1;
//								float dx= cxr- x;
//								float dy= cyr- y;
//								float co= dy/ dx;
//								int dis = Math.abs(cxr- x);
//								//欧基里德填充
//								for(int k= 0; k< dis; k++) {
//									if(cxr>= x&& cyr>= y) {
//										showOCLDr[x+ k][y+ (int)(k* co)]= 255;	
//										monitor.expand(showOCLDr, x+ k, y+ (int)(k* co), monitor.fact, 1);
//									}
//									if(cxr< x&& cyr>= y) {
//										showOCLDr[x- k][y- (int)(k * co)]= 255;
//										monitor.expand(showOCLDr, x- k, y- (int)(k* co), monitor.fact, 2);
//									}
//									if(cxr>= x&& cyr< y) {
//										showOCLDr[x+ k][y+ (int)(k * co)]= 255;	
//										monitor.expand(showOCLDr, x+ k, y+ (int)(k* co), monitor.fact, 3);
//									}
//									if(cxr< x&& cyr< y) {
//										showOCLDr[x- k][y- (int)(k * co)]= 255;
//										monitor.expand(showOCLDr, x- k, y- (int)(k* co), monitor.fact, 4);
//									}
//								}
//									}
//								}
//								if(monitor.isGreenButton) {
//									if(ccag[j][i]> 0) {
//										int x= j;
//										int y= i;
//										if(cxg== 0&& cyg== 0) {
//											cxg= cxg+ x;
//											cyg= cyg+ y;
//										}
//										cxg=cxg+ x;
//										cyg=cyg+ y;
//										findg= 1;
//										showOCLDg[x][y]= 255;
//										showORGNg[x][y]= 255;
//										cxg= cxg>> 1;
//									cyg= cyg>> 1;
//						float dx= cxg- x;
//						float dy= cyg- y;
//						float co= dy/ dx;
//						int dis= Math.abs(cxg - x);
//						//欧基里德填充
//						for(int k= 0; k< dis; k++) {
//							if(cxg>= x&& cyg>= y) {
//								showOCLDg[x+ k][y+ (int)(k* co)]= 255;	
//								monitor.expand(showOCLDg,x+ k, y+ (int)(k* co), monitor.fact, 1);
//							}
//							if(cxg< x&& cyg>= y) {
//								showOCLDg[x- k][y - (int)(k* co)]= 255;
//								monitor.expand(showOCLDg, x- k, y- (int)(k* co), monitor.fact, 2);
//							}
//							if(cxg>= x&& cyg< y) {
//								showOCLDg[x+ k][y+ (int)(k* co)] = 255;	
//								monitor.expand(showOCLDg, x+ k, y+ (int)(k * co), monitor.fact, 3);
//							}
//							if(cxg< x&& cyg< y) {
//								showOCLDg[x- k][y- (int)(k* co)] = 255;
//								monitor.expand(showOCLDg, x- k, y- (int)(k * co), monitor.fact, 4);
//							}
//						}
//									}
//								}
//								if(monitor.isBlueButton) {
//									if(ccab[j][i]> 0) {
//										int x= j;
//										int y= i;
//										if(cxb== 0&& cyb== 0) {
//											cxb= cxb+ x;
//											cyb= cyb+ y;
//										}
//										cxb= cxb+ x;
//										cyb= cyb+ y;
//										findb= 1;
//										showOCLDb[x][y]= 255;
//										showORGNb[x][y]= 255;
//										cxb= cxb>> 1;
//							cyb= cyb>> 1;
//													float dx= cxb- x;
//													float dy= cyb- y;
//													float co= dy/ dx;
//													int dis= Math.abs(cxb- x);
//													//欧基里德填充
//													for(int k= 0; k< dis; k++) {
//														if(cxb>= x && cyb>= y) {
//															showOCLDb[x+ k][y+ (int)(k* co)]= 255;	
//															monitor.expand(showOCLDb, x+ k, y+ (int)(k* co), monitor.fact, 1);
//														}
//														if(cxb< x && cyb>= y) {
//															showOCLDb[x- k][y- (int)(k* co)]= 255;
//															monitor.expand(showOCLDb, x- k, y- (int)(k* co), monitor.fact, 2);
//														}
//														if(cxb>= x&& cyb< y) {
//															showOCLDb[x+ k][y+ (int)(k* co)]= 255;	
//															monitor.expand(showOCLDb, x+ k, y + (int)(k* co), monitor.fact, 3);
//														}
//														if(cxb< x&& cyb< y) {
//															showOCLDb[x- k][y- (int)(k* co)]= 255;
//															monitor.expand(showOCLDb, x- k, y- (int)(k* co), monitor.fact, 4);
//														}
//													}
//									}
//								}
//							}
//						}
//					}else {
//						showOCLDr= ccar;
//						showORGNr= ccar;
//
//						showOCLDg= ccag;
//						showORGNg= ccag;
//
//						showOCLDb= ccab;
//						showORGNb= ccab;
//					}
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
								if(r2r[j][i]> 30) {
									pixel= (r2r[j][i]<< 16) ;
								}
							}
							if(monitor.showOCLDg[j][i]== 255) {
								if(r2g[j][i]> 30) {
									pixel= pixel| (r2g[j][i]<< 8) ;
								}
							}

							if(monitor.showOCLDb[j][i] == 255) {
								if(r2b[j][i]> 30) {
									pixel= pixel| r2b[j][i]  ;
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