package OSM.shell;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ShellReplace {
	//稍后开始
	//文件替换
	//罗瑶光
	public String searchString;
	public String needReplaceString;
	public String fileType;
	public String fileName;
	public String fileDirectroyPath;
	private String replaceLogPath;
	public long fileSize_KB;
	public long fileLinesBegin;
	public long fileLinesEnd;

	public void replaceString(String fileDirectroyPath, String searchString, String needReplaceString) throws IOException {
		//1 确定文件夹
		//2 文件夹文件遍历，
		//3 全文搜索替换
		this.searchString= searchString;
		this.needReplaceString= needReplaceString;
		this.fileDirectroyPath= fileDirectroyPath;
		start();
	}

	private void doInerFilesReplace(File file, String searchString, String needReplaceString) throws IOException {
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
					String currentFileName= file.getName();
					if(null!= this.fileName&& !this.fileName.isEmpty()) {
						if(currentFileName.contains(this.fileName)) {
							return;
						}	
					}
					if(null!= this.fileType&& !this.fileType.isEmpty()) {
						if(currentFileName.contains(this.fileType)) {
							return;
						}	
					}
					if(0!= this.fileSize_KB) {
						//...
						long currentFileSize= file.length()/ 1024;//....
						if(currentFileSize> this.fileSize_KB) {
							return;
						}	
					}
					//开始替换 等会看下是否有 /符号 丢失的问题。
					File fileOut= new File(filePath+ "_replaced");
					FileWriter fileWriter= new FileWriter(fileOut, true);
					InputStream inputStreamb= new FileInputStream(file);
					//这里设计读取文件的编码问题，稍后要设计编码的识别。
					BufferedReader cReaderb= new BufferedReader(new InputStreamReader(inputStreamb, "GBK"));
					String cInputStringb;
					//index
					long beginLines= this.fileLinesBegin;
					long endLines= this.fileLinesEnd;
					long count= 0;
					while ((cInputStringb= cReaderb.readLine())!= null) { 
						if(count>= beginLines) {
							if(0== endLines|| count<= endLines ) {
								//稍后设计行长度设计。,这里会出现一种问题，就是行的边 和下一行起始为一个 searchString，造成替换逃逸。
								cInputStringb= cInputStringb.replace(searchString, needReplaceString);
								fileWriter.write(cInputStringb);
								fileWriter.write("\r\n");
								fileWriter.flush();	
							}	
						}
						count++; 
					}
					fileWriter.close();
					cReaderb.close();
					inputStreamb.close();
					//等会测试后成功就替换掉之前需要搜索替换的文件
					//...file.delete();
					file.delete();
					if(!file.exists()) {
						if(fileOut.renameTo(new File(filePath))) {
							System.out.println("succcess");
						}else {
							System.out.println("unsucccess");
						}	
					}
					//...fileOut.changeFileName(filePath+ file.getName());
					//然后记录操作。成为日志文件

					//...replaceLog(...);
					//我在思考记录这些操作的日志文件储存在哪。
				}
			}
		}
	}

	//稍后设计成map来存储这些String条件变量。
	public void replaceStringWithFileName(String fileDirectroyPath, String searchString
			, Map<String, String> conditions) throws IOException {
		this.fileType= conditions.get("fileType");
		this.fileName= conditions.get("fileName");
		this.fileSize_KB= Long.valueOf(conditions.get("filesize_KB"));
		this.fileLinesBegin= Long.valueOf(conditions.get("beginLine"));
		this.fileLinesEnd= Long.valueOf(conditions.get("endLine"));
		this.searchString= conditions.get("searchString");
		this.needReplaceString= conditions.get("needReplaceString");
		this.fileDirectroyPath= conditions.get("fileDirectroyPath");
		//稍后对下面去重。
		start();
	}

	//稍后变线程
	public void start() throws IOException {
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

	//文件名对应筛选
	public void replaceStringWithFileName(String fileDirectroyPath, String searchString
			, String needReplaceString, String fileName) throws IOException {
		//1 确定文件夹
		//2 文件夹文件遍历，相关文件名
		//3 全文搜索替换
		this.fileName= fileName;
		this.searchString= searchString;
		this.needReplaceString= needReplaceString;
		this.fileDirectroyPath= fileDirectroyPath;
		start();
	}

	//文件后缀筛选
	public void replaceStringWithFileType(String fileDirectroyPath, String searchString
			, String needReplaceString, String fileType) throws IOException {
		//1 确定文件夹
		//2 文件夹文件遍历，相关文件类型后缀对应
		//3 全文搜索替换
		this.fileType= fileType;
		this.searchString= searchString;
		this.needReplaceString= needReplaceString;
		this.fileDirectroyPath= fileDirectroyPath;
		start();
	}

	//文件大小筛选
	public void replaceStringWithFileSize(String fileDirectroyPath, String searchString
			, String needReplaceString, long filesize_KB) throws IOException {
		//1 确定文件夹
		//2 文件夹文件遍历，相关文件大小
		//3 全文搜索替换
		this.fileSize_KB= filesize_KB;
		this.searchString= searchString;
		this.needReplaceString= needReplaceString;
		this.fileDirectroyPath= fileDirectroyPath;
		start();
	}

	//文件大小筛选
	public void replaceStringWithFileLines(String fileDirectroyPath, String searchString
			, String needReplaceString, long beginLine, long endLine) throws IOException {
		//1 确定文件夹
		//2 文件夹文件遍历，搜索对应的行间
		//3 全文搜索替换 
		this.fileLinesBegin= beginLine;
		this.fileLinesEnd= endLine;
		this.searchString= searchString;
		this.needReplaceString= needReplaceString;
		this.fileDirectroyPath= fileDirectroyPath;
		start();
	}

	public static void main(String[] argv) throws IOException {
		//new ShellReplace().replaceString("C:\\Users\\Lenovo\\Desktop\\DNA_RNA\\2021\\repalceSample", ">_<", "..>_<.."); 
		Map<String, String> conditions= new HashMap<>();
		conditions.put("fileType", "");
		conditions.put("fileName", "");
		conditions.put("filesize_KB", "");
		conditions.put("beginLine", "");
		conditions.put("endLine", "");
		conditions.put("searchString", "yaoguang");
		conditions.put("needReplaceString", ">_<");
		conditions.put("fileDirectroyPath", "C:\\Users\\Lenovo\\Desktop\\DNA_RNA\\2021\\repalceSample");
		conditions.put("replaceLogPath", "C:\\Users\\Lenovo\\Desktop\\DNA_RNA\\2021\\repalceSample\\replace_Log.lyg");
		ShellReplace shellReplace= new ShellReplace();
		shellReplace.replaceStringWithLogRecording(conditions); 

		//稍后写rollback
		//可以有效替换，但是会把本来就是替换的值也替换回原来的值了，所以要增加设计数据的替换坐标
		//1 记录替换的文件。
		//2 记录替换的文件中相关替换的数据的坐标。
		//3 记录文件中替换的前缀和后缀。关联，区分逃逸替换数据。
		//		shellReplace.rollbackWithRecordingLog(conditions);
	}

	//	private void rollbackWithRecordingLog(Map<String, String> conditions) throws IOException {
	//		// TODO Auto-generated method stub
	//		//...
	//		InputStream inputStreamb= new FileInputStream(conditions.get("replaceLogPath"));
	//		//这里设计读取文件的编码问题，稍后要设计编码的识别。
	//		BufferedReader cReaderb= new BufferedReader(new InputStreamReader(inputStreamb, "GBK"));
	//		String cInputStringb;
	//		//index
	//		while ((cInputStringb= cReaderb.readLine())!= null) { 
	//			if(!cInputStringb.isEmpty()) {
	//1 记录替换的文件。
	//2 记录替换的文件中相关替换的数据的坐标。
	//3 记录文件中替换的前缀和后缀。关联，区分逃逸替换数据。
	//				String[] strings= cInputStringb.split("-->");
	//				if(1< strings.length) {
	//					System.out.println(cInputStringb);
	//					conditions.put(strings[0], strings[1]);
	//				}else {
	//					System.out.println(strings[0]);
	//					conditions.put(strings[0], "");
	//				}
	//			}
	//		}
	//		cReaderb.close();
	//		inputStreamb.close();
	//		//
	//		String string= conditions.get("needReplaceString").toString();
	//		conditions.put("needReplaceString", conditions.get("searchString"));
	//		conditions.put("searchString", string);
	//		//
	//		start();
	//	}

	//设计一种简单的log模式先。
	public void replaceStringWithLogRecording(Map<String, String> conditions) throws IOException {
		//记录
		//稍后对下面去重。
		this.replaceLogPath= conditions.get("replaceLogPath");
		File fileOut= new File(this.replaceLogPath);
		FileWriter fileWriter= new FileWriter(fileOut, true);
		//index
		Iterator<String> iterator= conditions.keySet().iterator();
		while(iterator.hasNext()) {
			String string= iterator.next();
			String writeString= string+ "-->"+ conditions.get(string);
			System.out.println(writeString);
			fileWriter.write(writeString);
			fileWriter.write("\r\n");
			fileWriter.flush();	
		}	
		fileWriter.close();
		//替换
		this.fileType= conditions.get("fileType");
		this.fileName= conditions.get("fileName");
		this.fileSize_KB= Long.valueOf(conditions.get("filesize_KB").isEmpty()? "0": conditions.get("filesize_KB"));
		this.fileLinesBegin= Long.valueOf(conditions.get("beginLine").isEmpty()? "0": conditions.get("beginLine"));
		this.fileLinesEnd= Long.valueOf(conditions.get("endLine").isEmpty()? "0": conditions.get("endLine"));
		this.searchString= conditions.get("searchString");
		this.needReplaceString= conditions.get("needReplaceString");
		this.fileDirectroyPath= conditions.get("fileDirectroyPath");
		start();
	}

}
