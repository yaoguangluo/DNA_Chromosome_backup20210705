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

 /*
  * 准备开始设计命令形式 ，再想想就开始设计了。
  *     设:路径:等于:"http://.......";
  *     设:原字符串:等于:"..";
  *     设:替换字符串:等于:"...";
  *     设:日志路径:等于:"...";
  *     确定文件夹:路径:进行搜索
  *     确定日志:路径;  //稍后我会改成shell命令记录，最后移出去到etl档案保存里去。
  *     将:字符串:替换为:替换;
  *     条件为:文件类型|包含|java;
  *     条件为:文件大小KB|小于|200;
  *     条件为:文件名|包含|哈哈;
  *     条件为:替换|5|行间至|10;
  *     ============================================
  *     
  *     
  *     我在思考，设中的变量如果要区分 用\ 那么将有\：\; \| \\ 四种符号区分。
  *     但是我的冯若依曼逻辑流是先区分： 再做slash区分。于是出现问题。怎么解决这个问题。
  *     我想到一种方式，之后会写一个split 函数 用正则来区分： 和 \：
  *     
  *     作者：罗瑶光
  *     2021/11/22
  *     
  *     
  *     最近示例
设:路径:为:C\:\\Users\\Lenovo\\Desktop\\DNA_RNA\\2021\\repalceSample;
设:变量:为:tin.royal;
确定文件夹:路径:进行搜索;
匹配条件:文件类型:包含:txt;
匹配条件:文件大小KB:小于:200;
匹配条件:文件名:包含:ha;
匹配条件:替换:15:行间至:25;
将:变量:替换为:tin神;

  * */

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

	private void doInnerFilesReplace(File file, String searchString, String needReplaceString) throws IOException {
		if(file.isDirectory()) {
			File[] files= file.listFiles();
			for(File currentFile:files) {
				doInnerFilesReplace(currentFile, searchString, needReplaceString);
			}
		}else {
			if(file.isFile()) {
				if(null!= file.getPath()) {
					//稍后设计文件类型过滤
					String filePath= file.getPath();
					String currentFileName= file.getName();
					if(null!= this.fileName&& !this.fileName.isEmpty()) {
						if(!currentFileName.contains(this.fileName)) {
							return;
						}	
					}
					if(null!= this.fileType&& !this.fileType.isEmpty()) {
						if(!currentFileName.contains(this.fileType)) {
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
					if(currentFileName.contains("Backup")) {
						return;
					}
					//开始替换 等会看下是否有 /符号 丢失的问题。
					File fileOut= new File(filePath+ "_replaced");
					File fileOutBackup= new File(filePath+ "_replaceBackup");

					FileWriter fileWriter= new FileWriter(fileOut, true);
					FileWriter fileWriterBackup= new FileWriter(fileOutBackup, true);

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
								//备份。稍后回滚直接替换回去就可以了，没必要搞成数据的logbin 那么麻烦。
								fileWriterBackup.write(cInputStringb);
								fileWriterBackup.write("\r\n");
								fileWriterBackup.flush();	
								//稍后设计行长度设计。,这里会出现一种问题，就是行的边 和下一行起始为一个 searchString，造成替换逃逸。
								cInputStringb= cInputStringb.replace(searchString, needReplaceString);
								fileWriter.write(cInputStringb);
								fileWriter.write("\r\n");
								fileWriter.flush();	
							}else {
								//非替换部分进行复制
								fileWriter.write(cInputStringb);
								fileWriter.write("\r\n");
								fileWriter.flush();
							}	
						}else {
							//非替换部分进行复制
							fileWriter.write(cInputStringb);
							fileWriter.write("\r\n");
							fileWriter.flush();
						}
						count++; 
					}
					fileWriterBackup.close();
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
				doInnerFilesReplace(currentFile, searchString, needReplaceString);
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
		conditions.put("searchString", "socnsocn");
		conditions.put("needReplaceString", "xixi。");
		conditions.put("fileDirectroyPath", "C:\\Users\\Lenovo\\Desktop\\DNA_RNA\\2021\\repalceSample");
		conditions.put("replaceLogPath", "C:\\Users\\Lenovo\\Desktop\\DNA_RNA\\2021\\repalceSample\\replace_Log.lyg");
		ShellReplace shellReplace=	new ShellReplace();
		shellReplace.replaceStringWithLogRecording(conditions); 

		//稍后写rollback
		//思考了下改成最简单的策略。
		//替换回来非常轻松了。直接将backup文件替换即可。
		shellReplace.rollbackWithRecordingLog(conditions);
	}

	private void rollbackWithRecordingLog(Map<String, String> conditions) throws IOException {
		File file= new File(fileDirectroyPath);
		if(file.isFile()) {
			fileDirectroyPath= file.getPath();
		}
		File fileDirectroy= new File(fileDirectroyPath);
		if(fileDirectroy.isDirectory()) {
			File[] files= file.listFiles();
			for(File currentFile:files) {
				doInnerFilesReplaceBackup(currentFile, searchString, needReplaceString);
			}
		}
	}

	private void doInnerFilesReplaceBackup(File file, String searchString, String needReplaceString) {
		if(file.isDirectory()) {
			File[] files= file.listFiles();
			for(File currentFile:files) {
				doInnerFilesReplaceBackup(currentFile, searchString, needReplaceString);
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
						long currentFileSize= file.length()/ 1024;//....
						if(currentFileSize> this.fileSize_KB) {
							return;
						}	
					}
					if(currentFileName.contains("Backup")) {//文件原备份不参与回滚
						return;
					}
					//开始替换 等会看下是否有 /符号 丢失的问题。
					File fileOutBackup= new File(filePath+ "_replaceBackup");
					file.delete();
					if(!file.exists()) {
						if(fileOutBackup.renameTo(new File(filePath))) {
							System.out.println("succcess");
						}else {
							System.out.println("unsucccess");
						}	
					}
				}
			}
		}
	}

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
		//fileWriter.write("################记录################");//没必要这么复杂，不然还不如做个数据替换binlog。
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