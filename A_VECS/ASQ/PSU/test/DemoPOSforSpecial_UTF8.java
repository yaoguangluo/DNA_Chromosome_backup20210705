package ASQ.PSU.test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OEI.ME.analysis.E.BinaryForest_AE;
import static java.lang.System.*;

public class DemoPOSforSpecial_UTF8 {
	public static void main(String[] args) throws IOException {
		A _A = new CogsBinaryForest_AE();
		_A.IV_Mixed();
		Map<String, String> nlp = ((BinaryForest_AE)_A).getPosCnToCn();
		List<String> sets = new ArrayList<>();
		String[] ss = new String[1];
		String[] ss1 = new String[1];
		ss[0] = "涓嵂锛氫腹?????15g璧ゅ嫼15g 妗冧粊9g 涓夋１10g ";
		ss1[0] = "雮橂姅 鞚检潉 ?????????? 頃橁碃 鞛堧嫟 ";
		for (int i = 0; i < ss.length; i++) {
			System.out.println("瓒呯骇鍙�?澶嶆潅鐥�?????-->" + ss[i]);
			sets = _A.parserMixedString(ss[i].replace("  ", " "));//璇�?鍒�?????
			out.print("鍒嗘瀽澶勭悊鐪熷疄缁撴灉-->");
			for (int j = 0; j < sets.size(); j++) {
				if (!sets.get(j).replaceAll("\\s+", "").equals("")) {
					out.print(sets.get(j) + " ");
				}
			}
			out.println();
			out.println("鏈熸湜寰楀埌鍒嗚瘝鏁堟灉-->" + ss1[i]);
			for (int k = 0; k < sets.size(); k++) {
				if (!sets.get(k).replaceAll("\\s+", "").equals("")) {
					nlp.get(sets.get(k));
					out.println(sets.get(k) + "/" + nlp.get(sets.get(k)) + "  ");
				}
			}
			out.println("");
		}
		
		String vv="鐢熻倴鍏斾箣鍓嶇敓娲昏櫧鐒惰繃寰椾笉鏄壒鍒殑瀵岃锛屼絾鑷冲皯鏃ュ瓙杩囧緱杩樼畻鑸掑績锛屾病閬囧埌杩囦粈涔堣緝澶х殑鎰忓锛岃繖瀵逛簬鐢熻倴鐨勪汉鑰岃█涔熺畻鏄竴涓笉閿欑殑缁撴灉銆備絾鐢熻倴鍏旂殑浜烘瘯绔熸槸?????涓緢鏈夌姘旂殑灞炵浉锛屾墍浠ュ湪6鏈堝紑濮嬶紝鐢熻倴鍏旂殑浜哄懡鐞嗕箣涓储杩愭彁鍗囷紝鍒版椂鍊欑敓鑲栧厰鐨勪汉鍙鎶撲綇鏈轰細锛岃嚜~!@#$%^&*()_+`1234567890-= {}:\"|?><[]\\';,./'銆傦紝銆侊紘锛氣埗??????鈥�?????藛藝锕曪赴锕旓箹锕懧仿�?????.赂;锛伮达紵锛侊綖鈥斔夛綔鈥栵紓銆冿絸@锕÷匡箯锕嬶箤锔�?锕�#?????$?????&?????%*锕★耿锕︼工鈥愶浚炉鈥曪龚藛藴锕嶏箮+=<颅颅锛縚-\\藝~锕夛箠锛堬級銆�???锕涳箿????锛伙冀????{}銆�???锔碉阜锔匡腹锔絖锕侊箖锔伙付锔革箑锔猴妇藟锕傦箘?????";
		for(int i=0;i<vv.length();i++) {
			//out.println((int)(vv.charAt(i)));
		}
	}
}