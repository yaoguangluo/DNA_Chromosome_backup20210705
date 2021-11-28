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
  * ׼����ʼ���������ʽ ��������Ϳ�ʼ����ˡ�
  *     ��:·��:����:"http://.......";
  *     ��:ԭ�ַ���:����:"..";
  *     ��:�滻�ַ���:����:"...";
  *     ��:��־·��:����:"...";
  *     ȷ���ļ���:·��:��������
  *     ȷ����־:·��;  //�Ժ��һ�ĳ�shell�����¼������Ƴ�ȥ��etl����������ȥ��
  *     ��:�ַ���:�滻Ϊ:�滻;
  *     ����Ϊ:�ļ�����|����|java;
  *     ����Ϊ:�ļ���СKB|С��|200;
  *     ����Ϊ:�ļ���|����|����;
  *     ����Ϊ:�滻|5|�м���|10;
  *     ============================================
  *     
  *     
  *     ����˼�������еı������Ҫ���� ��\ ��ô����\��\; \| \\ ���ַ������֡�
  *     �����ҵķ��������߼����������֣� ����slash���֡����ǳ������⡣��ô���������⡣
  *     ���뵽һ�ַ�ʽ��֮���дһ��split ���� �����������֣� �� \��
  *     
  *     ���ߣ�������
  *     2021/11/22
  *     
  *     
  *     ���ʾ��
��:·��:Ϊ:C\:\\Users\\Lenovo\\Desktop\\DNA_RNA\\2021\\repalceSample;
��:����:Ϊ:tin.royal;
ȷ���ļ���:·��:��������;
ƥ������:�ļ�����:����:txt;
ƥ������:�ļ���СKB:С��:200;
ƥ������:�ļ���:����:ha;
ƥ������:�滻:15:�м���:25;
��:����:�滻Ϊ:tin��;

  * */

public class ShellReplace {
	//�Ժ�ʼ
	//�ļ��滻
	//������
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
		//1 ȷ���ļ���
		//2 �ļ����ļ�������
		//3 ȫ�������滻
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
					//�Ժ�����ļ����͹���
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
					//��ʼ�滻 �Ȼῴ���Ƿ��� /���� ��ʧ�����⡣
					File fileOut= new File(filePath+ "_replaced");
					File fileOutBackup= new File(filePath+ "_replaceBackup");

					FileWriter fileWriter= new FileWriter(fileOut, true);
					FileWriter fileWriterBackup= new FileWriter(fileOutBackup, true);

					InputStream inputStreamb= new FileInputStream(file);
					//������ƶ�ȡ�ļ��ı������⣬�Ժ�Ҫ��Ʊ����ʶ��
					BufferedReader cReaderb= new BufferedReader(new InputStreamReader(inputStreamb, "GBK"));
					String cInputStringb;
					//index
					long beginLines= this.fileLinesBegin;
					long endLines= this.fileLinesEnd;
					long count= 0;
					while ((cInputStringb= cReaderb.readLine())!= null) { 
						if(count>= beginLines) {
							if(0== endLines|| count<= endLines ) {
								//���ݡ��Ժ�ع�ֱ���滻��ȥ�Ϳ����ˣ�û��Ҫ������ݵ�logbin ��ô�鷳��
								fileWriterBackup.write(cInputStringb);
								fileWriterBackup.write("\r\n");
								fileWriterBackup.flush();	
								//�Ժ�����г�����ơ�,��������һ�����⣬�����еı� ����һ����ʼΪһ�� searchString������滻���ݡ�
								cInputStringb= cInputStringb.replace(searchString, needReplaceString);
								fileWriter.write(cInputStringb);
								fileWriter.write("\r\n");
								fileWriter.flush();	
							}else {
								//���滻���ֽ��и���
								fileWriter.write(cInputStringb);
								fileWriter.write("\r\n");
								fileWriter.flush();
							}	
						}else {
							//���滻���ֽ��и���
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
					//�Ȼ���Ժ�ɹ����滻��֮ǰ��Ҫ�����滻���ļ�
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
					//Ȼ���¼��������Ϊ��־�ļ�

					//...replaceLog(...);
					//����˼����¼��Щ��������־�ļ��������ġ�
				}
			}
		}
	}

	//�Ժ���Ƴ�map���洢��ЩString����������
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
		//�Ժ������ȥ�ء�
		start();
	}

	//�Ժ���߳�
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

	//�ļ�����Ӧɸѡ
	public void replaceStringWithFileName(String fileDirectroyPath, String searchString
			, String needReplaceString, String fileName) throws IOException {
		//1 ȷ���ļ���
		//2 �ļ����ļ�����������ļ���
		//3 ȫ�������滻
		this.fileName= fileName;
		this.searchString= searchString;
		this.needReplaceString= needReplaceString;
		this.fileDirectroyPath= fileDirectroyPath;
		start();
	}

	//�ļ���׺ɸѡ
	public void replaceStringWithFileType(String fileDirectroyPath, String searchString
			, String needReplaceString, String fileType) throws IOException {
		//1 ȷ���ļ���
		//2 �ļ����ļ�����������ļ����ͺ�׺��Ӧ
		//3 ȫ�������滻
		this.fileType= fileType;
		this.searchString= searchString;
		this.needReplaceString= needReplaceString;
		this.fileDirectroyPath= fileDirectroyPath;
		start();
	}

	//�ļ���Сɸѡ
	public void replaceStringWithFileSize(String fileDirectroyPath, String searchString
			, String needReplaceString, long filesize_KB) throws IOException {
		//1 ȷ���ļ���
		//2 �ļ����ļ�����������ļ���С
		//3 ȫ�������滻
		this.fileSize_KB= filesize_KB;
		this.searchString= searchString;
		this.needReplaceString= needReplaceString;
		this.fileDirectroyPath= fileDirectroyPath;
		start();
	}

	//�ļ���Сɸѡ
	public void replaceStringWithFileLines(String fileDirectroyPath, String searchString
			, String needReplaceString, long beginLine, long endLine) throws IOException {
		//1 ȷ���ļ���
		//2 �ļ����ļ�������������Ӧ���м�
		//3 ȫ�������滻 
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
		conditions.put("needReplaceString", "xixi��");
		conditions.put("fileDirectroyPath", "C:\\Users\\Lenovo\\Desktop\\DNA_RNA\\2021\\repalceSample");
		conditions.put("replaceLogPath", "C:\\Users\\Lenovo\\Desktop\\DNA_RNA\\2021\\repalceSample\\replace_Log.lyg");
		ShellReplace shellReplace=	new ShellReplace();
		shellReplace.replaceStringWithLogRecording(conditions); 

		//�Ժ�дrollback
		//˼�����¸ĳ���򵥵Ĳ��ԡ�
		//�滻�����ǳ������ˡ�ֱ�ӽ�backup�ļ��滻���ɡ�
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
					//�Ժ�����ļ����͹���
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
					if(currentFileName.contains("Backup")) {//�ļ�ԭ���ݲ�����ع�
						return;
					}
					//��ʼ�滻 �Ȼῴ���Ƿ��� /���� ��ʧ�����⡣
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

	//���һ�ּ򵥵�logģʽ�ȡ�
	public void replaceStringWithLogRecording(Map<String, String> conditions) throws IOException {
		//��¼
		//�Ժ������ȥ�ء�
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
		//fileWriter.write("################��¼################");//û��Ҫ��ô���ӣ���Ȼ���������������滻binlog��
		//�滻
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