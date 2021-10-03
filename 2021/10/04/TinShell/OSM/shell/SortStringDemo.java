package OSM.shell;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import OEU.LYG4DQS4D.LYG10DWCMSSort13D_XCDX_C_A_S;
import PEU.P.table.TableSorterZYNK;
import PEU.S.verbal.VerbalSource;
import SVQ.stable.StableFile;

public class SortStringDemo{
	public static Map<String, String> pinYin= null;
	public static Map<String, Integer> biHua= null;
	public static void initMap() {
		try {
			if(null!= pinYin|| null!= biHua) {
				return;
			}
			InputStream inputStreamp= new VerbalSource().getClass().getResourceAsStream(StableFile.PinYinCN_lyg);
			BufferedReader cReaderp= new BufferedReader(new InputStreamReader(inputStreamp, "GBK"));
			//index
			String cInputStringp;
			Map<String, String> map= new HashMap<>();
			biHua= new HashMap<>();
			while ((cInputStringp= cReaderp.readLine())!= null) {
				String[] words= cInputStringp.split("->");
				if(words.length>1) {
					map.put(words[0], words[1]);
				}
			}
			cReaderp.close();
			InputStream inputStreamb= new VerbalSource().getClass().getResourceAsStream(StableFile.BiHuaCN_lyg);
			BufferedReader cReaderb= new BufferedReader(new InputStreamReader(inputStreamb, "GBK"));
			//index
			String cInputStringb;
			while ((cInputStringb= cReaderb.readLine())!= null) {
				String[] words= cInputStringb.split("->");
				if(words.length>1) {
					biHua.put(words[0], Integer.valueOf(words[1]));
				}
			}
			pinYin= map;
			cReaderb.close();
		}catch(Exception e) {

		}
	}

	@SuppressWarnings("unused")
	public static void main(String[] argv) {
		initMap();
		TableSorterZYNK tableSorterZYNK= new TableSorterZYNK();
		String[] strings= new String[10];
		strings[0]= "luoyÂÞÑþ¹âuang";
		strings[1]= "ÂÞÑþ¹â";
		strings[2]= "Ñþ¹â";
		strings[3]= "ÂÞÑþ";
		strings[4]= "yaoguang";
		strings[5]= "yÑþ¹âg";
		strings[6]= "yaogÑþ¹âng";
		strings[7]= "yÑþ¹âguang";
		strings[8]= "yaÂÞÑþ¹âang";
		strings[9]= "yaoguang";


		int returnInt= new LYG10DWCMSSort13D_XCDX_C_A_S()
				.quick4DChineseStringArrayWithSmallInTwoChar3bihuaReturns(strings
						, 0, 9, 30, pinYin, biHua, 7, 70);

		for(String string:strings){
			System.out.println(string);
		}

	}
}