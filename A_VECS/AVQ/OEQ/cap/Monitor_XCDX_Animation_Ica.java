package AVQ.OEQ.cap;
import java.awt.*;

import java.awt.image.BufferedImage;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
public class Monitor_XCDX_Animation_Ica{
	public static void XCDX_paint_ica(Monitor_XCDX monitor, Graphics g, BufferedImage image){
		try {
			//ICA
			int[][] mskr= new int[image.getWidth()][image.getHeight()];
			int[][] mskg= new int[image.getWidth()][image.getHeight()];
			int[][] mskb= new int[image.getWidth()][image.getHeight()];
			monitor.gpcar = new int[image.getWidth()][image.getHeight()];
			monitor.gpcag = new int[image.getWidth()][image.getHeight()];
			monitor.gpcab = new int[image.getWidth()][image.getHeight()];
			Map<String, Integer> map= new ConcurrentHashMap<>(); 
			if(monitor.isRcaButton) {
				for (int i= 0; i< image.getHeight(); ++i) {
					for (int j= 0; j< image.getWidth(); ++j) {
						if(monitor.isRedButton) {
							if(mskr[j][i]== 0) {
								map= new ConcurrentHashMap<>();
								int size= monitor.getMskFilter(monitor.diffr, mskr, i, j, 0, map);
								if(size> monitor.facy){
									Iterator< String> it= map.keySet().iterator();
									while(it.hasNext()){
										String temp= it.next();
										if(size> monitor.facy){
											int x= Integer.valueOf(temp.split(",")[0]);
											int y= Integer.valueOf(temp.split(",")[1]);
											monitor.gpcar[x][y]= 255;
										}
									}
								}
							}
						}
						if(monitor.isGreenButton) {
							if(mskg[j][i]== 0) {
								map= new ConcurrentHashMap<>();
								int size= monitor.getMskFilter(monitor.diffg, mskg, i, j, 0, map);
								if(size> monitor.facy) {
									Iterator< String> it= map.keySet().iterator();
									while(it.hasNext()){
										String temp= it.next();
										if(size> monitor.facy){
											int x= Integer.valueOf(temp.split(",")[0]);
											int y= Integer.valueOf(temp.split(",")[1]);
											monitor.gpcag[x][y]= 255;
										}
									}
								}
							}
						}
						if(monitor.isBlueButton) {
							if(monitor.isGreenButton) {
								if(mskb[j][i]== 0) {
									map= new ConcurrentHashMap<>();
									int size= monitor.getMskFilter(monitor.diffb, mskb, i, j, 0, map);
									if(size> monitor.facy) {
										Iterator< String> it = map.keySet().iterator();
										while(it.hasNext()){
											String temp= it.next();
											if(size> monitor.facy){
												int x= Integer.valueOf(temp.split(",")[0]);
												int y= Integer.valueOf(temp.split(",")[1]);
												monitor.gpcab[x][y]= 255;
											}
										}
									}
								}
							}
						} 
					}
				}
			}else {
				monitor.gpcar= monitor.diffr;
				monitor.gpcag= monitor.diffg;
				monitor.gpcab= monitor.diffb;
			}
		}catch(Exception e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}
}