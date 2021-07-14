package ISQ.VSU.feature;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;

import javax.swing.ImageIcon;

import ESU.image.ToolkitImageToBufferImage;
import PEU.P.image.ReadWritePng;

//׼������չ��ʽ����Ƹ� Ƥ����������.
//������ 20210710
//���˼�� ��չ��ʴ�任. ������Ӿ�. 
//Ӳ������, imageIO, javaCV.
//��Ϊ��չ��ʽ��˼��GPL2.0��Դ,������Դ��ͬ��GPL2.0��Դ.
public class GetSkinBy{
	public void getSkinBy() {

	}
	public int[][][] getSkinBy(String ͼƬ��ַ) throws IOException {
		int[][][] output= new int[3][][];
		int[][] r= new ReadWritePng().REDpngRead(ͼƬ��ַ);
		int[][] g= new ReadWritePng().GRNpngRead(ͼƬ��ַ); 
		int[][] b= new ReadWritePng().BLUpngRead(ͼƬ��ַ);
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

	//�Ժ�ȥ˼��imageObserver ���ĸ�����
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