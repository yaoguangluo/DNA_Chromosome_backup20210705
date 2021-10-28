package ME.APM.VSQ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//准备导入数据
//罗瑶光
//20211028
public class 文学性{
	public static List<String> 文学词库;
	public static void 初始词库() throws IOException {
		if(null== 文学词库) {
			文学词库= new ArrayList<>();
			InputStream in= new 文学性().getClass().getResourceAsStream("BToW.lyg");
			BufferedReader cReader= new BufferedReader(new InputStreamReader(in));  
			String ctempString= null; 
			while ((ctempString= cReader.readLine()) != null) {  
				if(!ctempString.replace(" ","").equals(""))
					文学词库.add(ctempString);
			}
			cReader.close();
		}
	}

	public static String 文字处理(App app, String input) {
		List<String> list= app._A.parserMixedString(input);
		Iterator<String> iteratorList= list.iterator();
		StringBuilder stringBuilder= new StringBuilder();
		while(iteratorList.hasNext()) {
			String stringIteratorList= iteratorList.next();
			Iterator<String> iterator= 文学词库.iterator();
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

	public static void 测试() {

	}
}