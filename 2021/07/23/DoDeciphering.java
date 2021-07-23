package ISQ.VSU.feature;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//import PEU.P.image.ReadWritePng;

public class DoDeciphering{
	public String outputFilePath;
	public void setOutputFilePath(String outputPath) {
		outputFilePath= outputPath;
	} 
	public void imageDeciphering(String indexFileCategoryPath) throws IOException {
		//1 �����ļ����ַ���
		File file= new File(indexFileCategoryPath);
		doInerFiles(file);
		//2 �����ļ���������ͼƬ
		//3 ÿ��ͼƬ����ѵ��ȡֵ
		//4 ѵ��ֵ���м�¼
	}
	public void doInerFiles(File file) throws IOException {
		if(file.isDirectory()) {
			File[] files= file.listFiles();
			for(File currentFile:files) {
				doInerFiles(currentFile);
			}
		}else {
			if(file.isFile()) {
				if(null!= file.getPath()) {
					String filePath= file.getPath();
					if(filePath.contains(".jpg")|| filePath.contains(".jpeg")|| filePath.contains(".png")) {
					//if(filePath.contains(".png")) {
						//3 ÿ��ͼƬ����ѵ��ȡֵ
						int[][][] getSkinBy= new GetSkinBy().getSkinBy(filePath);
						int[][][] doPDEofSkin= new DoPDEofSkin().doPDEofSkin_IDUQ(getSkinBy, 95);
						//new	ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB.jpg", doPDEofSkin);
						double[] getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, 10, 8, 8);
						double[] getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
						//4 ѵ��ֵ���м�¼
						File fileOut= new File(outputFilePath);
						//�Ҳ����������ݿ�, ������txt �в�������.
						//�Ժ�ѵ�����ݱȽ�����׼ȷ��,���õ������ݿ�.
						FileWriter fileWriter = null;
						fileWriter= new FileWriter(fileOut, true);
						fileWriter.write("f>" + file.getName());
						for(int i= 0; i< getStatisticRatio.length; i++) {
							fileWriter.write(">d>" + getStatisticRatio[i]* 10000);
						}
						fileWriter.write("\r\n");
						fileWriter.close();
					}
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		DoDeciphering doDeciphering= new DoDeciphering();
		doDeciphering.setOutputFilePath("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt");
		doDeciphering.imageDeciphering("D:\\bu20210606\\����ͼƬ\\����ͼƬ\\pgSearch");
		
	}
}
