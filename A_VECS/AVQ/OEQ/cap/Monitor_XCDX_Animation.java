package AVQ.OEQ.cap;
import java.awt.*;

import java.awt.image.BufferedImage;
import ESU.image.ToolkitImageToBufferImage;

public class Monitor_XCDX_Animation{
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
					//Ô¤´¦Àí
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
					monitor.rp= new int[image.getWidth()][image.getHeight()];
					monitor.gp= new int[image.getWidth()][image.getHeight()];
					monitor.bp= new int[image.getWidth()][image.getHeight()];

					Monitor_XCDX_Animation_EyeScan.XCDX_paint_eyeScan(monitor, g, image);
					Monitor_XCDX_Animation_Pca.XCDX_paint_pca(monitor, g, image);
					Monitor_XCDX_Animation_Ica.XCDX_paint_ica(monitor, g, image);
					Monitor_XCDX_Animation_PcfButton.XCDX_paint_PcfButton(monitor, g, image, monitor.gpcar, monitor.gpcag, monitor.gpcab);
					Monitor_XCDX_Animation_Pde.XCDX_paint_pde(monitor, g, image);
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