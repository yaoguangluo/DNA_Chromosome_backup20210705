package ME.APM.VSQ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//׼����������
//������
//20211028
public class ��ѧ��{
	public static List<String> ��ѧ�ʿ�;
	public static void ��ʼ�ʿ�() throws IOException {
		if(null== ��ѧ�ʿ�) {
			��ѧ�ʿ�= new ArrayList<>();
			InputStream in= new ��ѧ��().getClass().getResourceAsStream("BToW.lyg");
			BufferedReader cReader= new BufferedReader(new InputStreamReader(in));  
			String ctempString= null; 
			while ((ctempString= cReader.readLine()) != null) {  
				if(!ctempString.replace(" ","").equals(""))
					��ѧ�ʿ�.add(ctempString);
			}
			cReader.close();
		}
	}

	public static String ���ִ���(App app, String input) {
		List<String> list= app._A.parserMixedString(input);
		Iterator<String> iteratorList= list.iterator();
		StringBuilder stringBuilder= new StringBuilder();
		while(iteratorList.hasNext()) {
			String stringIteratorList= iteratorList.next();
			Iterator<String> iterator= ��ѧ�ʿ�.iterator();
			while(iterator.hasNext()) {
				String string= iterator.next();
				if(string.contains(stringIteratorList)) {
					stringBuilder.append(string);
				}else {
					stringBuilder.append(stringIteratorList);
				}
			}
		}
		return stringBuilder.toString();
	}

	public static void ����() {

	}
}