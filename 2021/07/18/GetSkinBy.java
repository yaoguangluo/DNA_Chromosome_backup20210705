package ISQ.VSU.feature;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;

import javax.swing.ImageIcon;

import ESU.image.ToolkitImageToBufferImage;
import PEU.P.image.ReadWritePng;

//准备用肽展公式来设计个 皮肤病检测程序.
//罗瑶光 20210710
//软件思想 肽展腐蚀变换. 计算机视觉. 
//硬件工具, imageIO, javaCV.
//因为肽展公式和思想GPL2.0开源,本程序源码同样GPL2.0开源.
public class GetSkinBy{
	public void getSkinBy() {

	}
	public int[][][] getSkinBy(String 图片地址) throws IOException {
		int[][][] output= new int[3][][];
		int[][] r= new ReadWritePng().REDpngRead(图片地址);
		int[][] g= new ReadWritePng().GRNpngRead(图片地址); 
		int[][] b= new ReadWritePng().BLUpngRead(图片地址);
		output[0]= r;
		output[1]= g;
		output[2]= b;
		return output;
	}

	public int[][][] getSkinBy(BufferedImage bufferedImage) throws IOException {
		int[][][] output= new int[3][][];
		int[][] r= new ReadWritePng().REDpngRead(bufferedImage);
		int[][] g= new ReadWritePng().GRNpngRead(bufferedImage); 
		int[][] b= new ReadWritePng().BLUpngRead(bufferedImage);
		output[0]= r;
		output[1]= g;
		output[2]= b;
		return output;
	}

	//稍后去思考imageObserver 是哪个对象
	public int[][][] getSkinBy(Image image, int weigh, int heigh, ImageObserver imageObserver) throws IOException {
		BufferedImage bufferedImage
		= new ToolkitImageToBufferImage().toolkitImageToBufferImage(image, 0, 0, weigh, heigh, imageObserver);
		int[][][] output= new int[3][][];
		int[][] r= new ReadWritePng().REDpngRead(bufferedImage);
		int[][] g= new ReadWritePng().GRNpngRead(bufferedImage); 
		int[][] b= new ReadWritePng().BLUpngRead(bufferedImage);
		output[0]= r;
		output[1]= g;
		output[2]= b;
		return output;
	}
	//...
	public int[][][] getSkinBy(ImageIcon imageIcon) throws IOException {
		BufferedImage bufferedImage
		= new ToolkitImageToBufferImage().toolkitImageIconToBufferImage(0, 0, imageIcon);
		int[][][] output= new int[3][][];
		int[][] r= new ReadWritePng().REDpngRead(bufferedImage);
		int[][] g= new ReadWritePng().GRNpngRead(bufferedImage); 
		int[][] b= new ReadWritePng().BLUpngRead(bufferedImage);
		output[0]= r;
		output[1]= g;
		output[2]= b;
		return output;
	}
}