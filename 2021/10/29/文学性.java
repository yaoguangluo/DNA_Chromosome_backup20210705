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
//准备导入数据
//罗瑶光
//20211028
public class 文学性{
	public static List<String> 文学词库;
	public static Map<String, String> 文言文词库;
	public static void 初始词库() throws IOException {
		if(null== 文学词库) {
			文学词库= new ArrayList<>();
			InputStream in= new 文学性().getClass().getResourceAsStream("BToW.lyg");
			BufferedReader cReader= new BufferedReader(new InputStreamReader(in));  
			String ctempString= null; 
			while ((ctempString= cReader.readLine()) != null) {  
				if(!ctempString.replace(" ","").equals("")) {
					文学词库.add(ctempString);	
				}
			}
			cReader.close();
		}
		
		if(null== 文言文词库) {
			文言文词库= new HashMap<>();
			InputStream in= new 文学性().getClass().getResourceAsStream("WToB.lyg");
			BufferedReader cReader= new BufferedReader(new InputStreamReader(in));  
			String ctempString= null; 
			while ((ctempString= cReader.readLine())!= null) {  
				if(!ctempString.replace(" ","").equals("")) {
					if(ctempString.contains("/")) {
						String[] strings= ctempString.split("/");
						文言文词库.put(strings[0], strings[1]);
					}
				}
			}
			cReader.close();
		}
	}
    //速度一般，精度一般
	public static String 文字处理(App app, String input) {
		List<String> list= app._A.parserMixedString(input);
		Iterator<String> iteratorList= list.iterator();
		StringBuilder stringBuilder= new StringBuilder();
		Here:
		while(iteratorList.hasNext()) {
			String stringIteratorList= iteratorList.next();
			if(1< stringIteratorList.length()) {
				Iterator<String> iterator= 文学词库.iterator();
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
	//速度慢，精度高,适用于文章短篇
	public static String 文言文全文处理(String input) {
		String output= input.toString();
		Iterator<String> iterator= 文言文词库.keySet().iterator();
		while(iterator.hasNext()) {
			String string= iterator.next();
			output= output.replace(string, 文言文词库.get(string));
		}
		return output;
	}
	//速度快，精度一般，适用于专业白话文。
	public static String 文言文线性处理(App app, String input) {
		StringBuilder stringBuilder= new StringBuilder();
		List<String> list= app._A.parserMixedString(input);
		Iterator<String> iteratorList= list.iterator();
		while(iteratorList.hasNext()) {
			String string= iteratorList.next();
			if(文言文词库.containsKey(string)) {
				stringBuilder.append(文言文词库.get(string));
			}else {
				stringBuilder.append(string);
			}
		}
		return stringBuilder.toString();
	}
}