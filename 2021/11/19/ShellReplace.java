package OSM.shell;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

public class ShellReplace {
	//�Ժ�ʼ
	//�ļ��滻
	//������
	public String searchString;
	public String needReplaceString;
	public String fileType;
	public String fileName;
	public String fileDirectroyPath;
	public long filesize_KB;
	public long fileLinesBegin;
	public long fileLinesEnd;


	public void replaceString(String fileDirectroyPath, String searchString, String needReplaceString) throws IOException {
		//1 ȷ���ļ���
		//2 �ļ����ļ�������
		//3 ȫ�������滻
		this.searchString= searchString;
		this.needReplaceString= needReplaceString;
		this.fileDirectroyPath= fileDirectroyPath;
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
					//�Ժ�����ļ����͹���
					String filePath= file.getPath();
					//��ʼ�滻 �Ȼῴ���Ƿ��� /���� ��ʧ�����⡣
					File fileOut= new File(filePath+ "_replaced");
					FileWriter fileWriter= new FileWriter(fileOut, true);
					InputStream inputStreamb= new FileInputStream(file);
					//������ƶ�ȡ�ļ��ı������⣬�Ժ�Ҫ��Ʊ����ʶ��
					BufferedReader cReaderb= new BufferedReader(new InputStreamReader(inputStreamb, "GBK"));
					//index
					String cInputStringb;
					while ((cInputStringb= cReaderb.readLine())!= null) {
						//�Ժ�����г�����ơ�,��������һ�����⣬�����еı� ����һ����ʼΪһ�� searchString������滻���ݡ�
						cInputStringb= cInputStringb.replace(searchString, needReplaceString);
						fileWriter.write(cInputStringb);
						fileWriter.write("\r\n");
						fileWriter.flush();
					}
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
		this.filesize_KB= Long.valueOf(conditions.get("filesize_KB"));
		this.fileLinesBegin= Long.valueOf(conditions.get("beginLine"));
		this.fileLinesEnd= Long.valueOf(conditions.get("endLine"));
		this.searchString= conditions.get("searchString");
		this.needReplaceString= conditions.get("needReplaceString");
		this.fileDirectroyPath= conditions.get("fileDirectroyPath");
		//�Ժ������ȥ�ء�
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

	//�ļ���Сɸѡ
	public void replaceStringWithFileSize(String fileDirectroyPath, String searchString
			, String needReplaceString, long filesize_KB) throws IOException {
		//1 ȷ���ļ���
		//2 �ļ����ļ�����������ļ���С
		//3 ȫ�������滻
		this.filesize_KB= filesize_KB;
		this.searchString= searchString;
		this.needReplaceString= needReplaceString;
		this.fileDirectroyPath= fileDirectroyPath;
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

	public static void main(String[] argv) throws IOException {
		new ShellReplace().replaceString("C:\\Users\\Lenovo\\Desktop\\DNA_RNA\\2021\\repalceSample", "��������", "hahahah"); 
	}
}