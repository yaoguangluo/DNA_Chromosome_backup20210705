package ME.APM.VSQ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
//׼����������
//������
//20211028
public class ��ѧ��{
	public static List<String> ��ѧ�ʿ�;
	public static Map<String, String> �����Ĵʿ�;
	public static void ��ʼ�ʿ�() throws IOException {
		if(null== ��ѧ�ʿ�) {
			��ѧ�ʿ�= new ArrayList<>();
			InputStream in= new ��ѧ��().getClass().getResourceAsStream("BToW.lyg");
			BufferedReader cReader= new BufferedReader(new InputStreamReader(in));  
			String ctempString= null; 
			while ((ctempString= cReader.readLine()) != null) {  
				if(!ctempString.replace(" ","").equals("")) {
					��ѧ�ʿ�.add(ctempString);	
				}
			}
			cReader.close();
		}
		
		if(null== �����Ĵʿ�) {
			�����Ĵʿ�= new HashMap<>();
			InputStream in= new ��ѧ��().getClass().getResourceAsStream("WToB.lyg");
			BufferedReader cReader= new BufferedReader(new InputStreamReader(in));  
			String ctempString= null; 
			while ((ctempString= cReader.readLine())!= null) {  
				if(!ctempString.replace(" ","").equals("")) {
					if(ctempString.contains("/")) {
						String[] strings= ctempString.split("/");
						�����Ĵʿ�.put(strings[0], strings[1]);
					}
				}
			}
			cReader.close();
		}
	}
    //�ٶ�һ�㣬����һ��
	public static String ���ִ���(App app, String input) {
		List<String> list= app._A.parserMixedString(input);
		Iterator<String> iteratorList= list.iterator();
		StringBuilder stringBuilder= new StringBuilder();
		Here:
		while(iteratorList.hasNext()) {
			String stringIteratorList= iteratorList.next();
			if(1< stringIteratorList.length()) {
				Iterator<String> iterator= ��ѧ�ʿ�.iterator();
				while(iterator.hasNext()) {
					String string= iterator.next();
					if(string.contains(stringIteratorList)) {
						stringBuilder.append(string);
						continue Here;
					}
				}	
			}
			stringBuilder.append(stringIteratorList);
		}
		return stringBuilder.toString();
	}
	//�ٶ��������ȸ�,���������¶�ƪ
	public static String ������ȫ�Ĵ���(String input) {
		String output= input.toString();
		Iterator<String> iterator= �����Ĵʿ�.keySet().iterator();
		while(iterator.hasNext()) {
			String string= iterator.next();
			output= output.replace(string, �����Ĵʿ�.get(string));
		}
		return output;
	}
	//�ٶȿ죬����һ�㣬������רҵ�׻��ġ�
	public static String ���������Դ���(App app, String input) {
		StringBuilder stringBuilder= new StringBuilder();
		List<String> list= app._A.parserMixedString(input);
		Iterator<String> iteratorList= list.iterator();
		while(iteratorList.hasNext()) {
			String string= iteratorList.next();
			if(�����Ĵʿ�.containsKey(string)) {
				stringBuilder.append(�����Ĵʿ�.get(string));
			}else {
				stringBuilder.append(string);
			}
		}
		return stringBuilder.toString();
	}
}