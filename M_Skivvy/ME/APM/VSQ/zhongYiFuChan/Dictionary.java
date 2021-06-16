package ME.APM.VSQ.zhongYiFuChan;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

import SVQ.stable.StableFile;

import java.util.List;
import java.util.Map;
public class Dictionary{	
	public List<String> dic_list;
	public Map<String, String> dic_map;
	public List<String> txtToListName() throws IOException{
		List<String> TEMP_list = new ArrayList<>();
		TEMP_list.add(StableFile.������Ů�Ƹ���_��_��ɽ_txt);
		TEMP_list.add(StableFile.��Ӥ��Ҫ_��_Ѧ��_txt);
		TEMP_list.add(StableFile.�����±�_��_¬����_txt);
		TEMP_list.add(StableFile.���ױ���_��_����_txt);
		TEMP_list.add(StableFile.�����;�__������_txt);
		TEMP_list.add(StableFile.���ưٱ�_��_ׯ����_txt);
		TEMP_list.add(StableFile.��������___txt);
		TEMP_list.add(StableFile.�������_��_�����_txt);
		TEMP_list.add(StableFile.����������Ҫ_��_������_txt);
		TEMP_list.add(StableFile.������Ů��_��_��ɽ_txt); 
		TEMP_list.add(StableFile.�������п��ر࿼��_��_��ɽ_txt); 
		return TEMP_list;
	}
	
	public Map<String, String> listNameToMap(List<String> dic_list) throws IOException{
		Map<String, String> dic_map = new ConcurrentHashMap<String, String>();
		for(int i = 0; i < dic_list.size(); i++) {
			String para = "";
			String name = dic_list.get(i).toString();
			InputStream in = this.getClass().getResourceAsStream(name);
			BufferedReader cReader;
			if(name.equalsIgnoreCase(StableFile.��Ӥ��Ҫ_��_Ѧ��_txt) 
					|| name.equalsIgnoreCase(StableFile.���ױ���_��_����_txt)
							|| name.equalsIgnoreCase(StableFile.������Ů�Ƹ���_��_��ɽ_txt)) {
				 cReader= new BufferedReader(new InputStreamReader(in, "UTF-16"));  
			}else {
				 cReader= new BufferedReader(new InputStreamReader(in, "GBK"));  
			}
			String ctempString= null; 
			int index= 0;
			while ((ctempString= cReader.readLine())!= null) {  
				if(!ctempString.replace(" ", "").equals("")) {
					para+= ctempString;
					if(ctempString.replace(" ", "").contains("^^")) {	
						dic_map.put(name+(index++), para.replace("\\s+", " "));
						para= "";
					}
				}
			}
			cReader.close();
		}
		return dic_map;
	}
}