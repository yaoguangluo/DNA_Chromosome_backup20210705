package OSM.shell;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ShellReplace {
	//�Ժ�ʼ
	//�ļ��滻
	//������
	public void replaceString(String fileDirectroyPath, String searchString, String needReplaceString) throws IOException {
//		1 ȷ���ļ���
//		2 �ļ����ļ�������
//		3 ȫ�������滻
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
					@SuppressWarnings("resource")
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
					//�Ȼ���Ժ�ɹ����滻��֮ǰ��Ҫ�����滻���ļ�
					//...file.delete();
					//...fileOut.changeFileName(filePath+ file.getName());
					//Ȼ���¼��������Ϊ��־�ļ�
					//...replaceLog(...);
				}
			}
		}
	}
	
	//�ļ�����Ӧɸѡ
	public void replaceStringWithFileName(String fileDirectroyPath, String searchString, String needReplaceString, String fileName) {
//		1 ȷ���ļ���
//		2 �ļ����ļ�����������ļ���
//		3 ȫ�������滻
	}
	
	//�ļ���׺ɸѡ
	public void replaceStringWithFileType(String fileDirectroyPath, String searchString, String needReplaceString, String fileType) {
//		1 ȷ���ļ���
//		2 �ļ����ļ�����������ļ����ͺ�׺��Ӧ
//		3 ȫ�������滻
	}
	
	//�ļ���Сɸѡ
	public void replaceStringWithFileSize(String fileDirectroyPath, String searchString, String needReplaceString, long filesize_KB) {
//		1 ȷ���ļ���
//		2 �ļ����ļ�����������ļ���С
//		3 ȫ�������滻
	}

	//�ļ���Сɸѡ
	public void replaceStringWithFileLines(String fileDirectroyPath, String searchString, String needReplaceString, long beginLine, long endLine) {
//		1 ȷ���ļ���
//		2 �ļ����ļ�������������Ӧ���м�
//		3 ȫ�������滻 
	}
	
	public static void main(String[] argv) throws IOException {
		new ShellReplace().replaceString("C:\\Users\\Lenovo\\Desktop\\DNA_RNA\\2021\\repalceSample", "�����¾ʹ��¼���", "������"); 
	}
}