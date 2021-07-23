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
		//1 输入文件夹字符串
		File file= new File(indexFileCategoryPath);
		doInerFiles(file);
		//2 遍历文件夹下所有图片
		//3 每个图片进行训练取值
		//4 训练值进行记录
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
						//3 每个图片进行训练取值
						int[][][] getSkinBy= new GetSkinBy().getSkinBy(filePath);
						int[][][] doPDEofSkin= new DoPDEofSkin().doPDEofSkin_IDUQ(getSkinBy, 95);
						//new	ReadWritePng().writePNG("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB.jpg", doPDEofSkin);
						double[] getStatisticCount= new GetStatisticCount().getStatisticCount(doPDEofSkin, 10, 8, 8);
						double[] getStatisticRatio= new GetStatisticRatio().getStatisticRatio(getStatisticCount);
						//4 训练值进行记录
						File fileOut= new File(outputFilePath);
						//我不建议用数据库, 建议用txt 行操作即可.
						//以后训练数据比较完善准确了,再用德塔数据库.
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
		doDeciphering.imageDeciphering("D:\\bu20210606\\搜索图片\\搜索图片\\pgSearch");
		
	}
}
