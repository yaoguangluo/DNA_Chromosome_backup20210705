package OSM.shell;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ShellReplace {
	//稍后开始
	//文件替换
	//罗瑶光
	public void replaceString(String fileDirectroyPath, String searchString, String needReplaceString) throws IOException {
//		1 确定文件夹
//		2 文件夹文件遍历，
//		3 全文搜索替换
		File file= new File(fileDirectroyPath);
		if(file.isFile()) {
			fileDirectroyPath= file.getPath();
		}
		File fileDirectroy= new File(fileDirectroyPath);
		if(fileDirectroy.isDirectory()) {
			File[] files= file.listFiles();
			for(File currentFile:files) {
				doInerFilesReplace(currentFile, searchString, needReplaceString);
			}
		}
	}
	
	public void doInerFilesReplace(File file, String searchString, String needReplaceString) throws IOException {
		if(file.isDirectory()) {
			File[] files= file.listFiles();
			for(File currentFile:files) {
				doInerFilesReplace(currentFile, searchString, needReplaceString);
			}
		}else {
			if(file.isFile()) {
				if(null!= file.getPath()) {
					//稍后设计文件类型过滤
					String filePath= file.getPath();
					//开始替换 等会看下是否有 /符号 丢失的问题。
					File fileOut= new File(filePath+ "_replaced");
					FileWriter fileWriter= new FileWriter(fileOut, true);
					InputStream inputStreamb= new FileInputStream(file);
					//这里设计读取文件的编码问题，稍后要设计编码的识别。
					@SuppressWarnings("resource")
					BufferedReader cReaderb= new BufferedReader(new InputStreamReader(inputStreamb, "GBK"));
					//index
					String cInputStringb;
					while ((cInputStringb= cReaderb.readLine())!= null) {
						//稍后设计行长度设计。,这里会出现一种问题，就是行的边 和下一行起始为一个 searchString，造成替换逃逸。
						cInputStringb= cInputStringb.replace(searchString, needReplaceString);
						fileWriter.write(cInputStringb);
						fileWriter.write("\r\n");
						fileWriter.flush();
					}
					fileWriter.close();
					//等会测试后成功就替换掉之前需要搜索替换的文件
					//...file.delete();
					//...fileOut.changeFileName(filePath+ file.getName());
					//然后记录操作。成为日志文件
					//...replaceLog(...);
				}
			}
		}
	}
	
	//文件名对应筛选
	public void replaceStringWithFileName(String fileDirectroyPath, String searchString, String needReplaceString, String fileName) {
//		1 确定文件夹
//		2 文件夹文件遍历，相关文件名
//		3 全文搜索替换
	}
	
	//文件后缀筛选
	public void replaceStringWithFileType(String fileDirectroyPath, String searchString, String needReplaceString, String fileType) {
//		1 确定文件夹
//		2 文件夹文件遍历，相关文件类型后缀对应
//		3 全文搜索替换
	}
	
	//文件大小筛选
	public void replaceStringWithFileSize(String fileDirectroyPath, String searchString, String needReplaceString, long filesize_KB) {
//		1 确定文件夹
//		2 文件夹文件遍历，相关文件大小
//		3 全文搜索替换
	}

	//文件大小筛选
	public void replaceStringWithFileLines(String fileDirectroyPath, String searchString, String needReplaceString, long beginLine, long endLine) {
//		1 确定文件夹
//		2 文件夹文件遍历，搜索对应的行间
//		3 全文搜索替换 
	}
	
	public static void main(String[] argv) throws IOException {
		new ShellReplace().replaceString("C:\\Users\\Lenovo\\Desktop\\DNA_RNA\\2021\\repalceSample", "件此事就此事件此", "罗瑶光"); 
	}
}