package OEU.LYG4DQS4D;
//import java.io.BufferedReader;
//import java.io.InputStream;
//import java.io.InputStreamReader;
import java.util.HashMap;
//20200314 集成了最新的小高峰过滤催化排序5代思想。

//20200818 集成了最新的小高峰过滤催化排序9代思想。
//增加同拼音同笔画的字按char的int大小区分20210529
//罗瑶光
import java.util.Map;

//import SVQ.stable.StableFile;
//import PEU.S.verbal.VerbalSource;
//今天将新陈代谢技术应用到 中文拼音笔画分词上.
//罗瑶光
public class LYG10DWCMSSort13D_XCDX_S implements LYG10DWCMSSort13D_XCDX_S_C{
	Map<String, Boolean> find= new HashMap<>();
	public Map<String, String> pinyin;
	Map<String, Integer> filter= new HashMap<>();
	int range;
	int deeps;
	String numbers= "0123456789.Ee";
	public Map<String, Integer> bihua;

	public boolean findSmallWithTwoChar(String x1, String x2
			, int scale, int point) {
		if(x1.length()<= point|| x2.length()<= point) {
			if(x1.length()< x2.length()) {
				for(int p= 0; p< scale; p++) {
					if(!(x1.length()<= p|| x2.length()<= p)) {
						if(x1.charAt(p)!= x2.charAt(p)) {
							return false;
						}
					}
				}
				return true;
			}
			return false;
		}else { 
			boolean hasX1= pinyin.containsKey(""+ x1.charAt(point));
			boolean hasX2= pinyin.containsKey(""+ x2.charAt(point));
			if(!(!hasX1|| !hasX2)){
				String[] js= new String[2];
				js[0]= this.pinyin.get(""+ x1.charAt(point));
				js[1]= this.pinyin.get(""+ x2.charAt(point));
				boolean changepinyin= processSortpinyin(js, 3);
				if(changepinyin) {
					return true;
				}
				return false;
			}else if(!(hasX1|| hasX2)){
				if(x1.toLowerCase().charAt(point)> x2.toLowerCase().charAt(point)) {
					return true;
				}else if(x1.toLowerCase().charAt(point)== x2.toLowerCase().charAt(point)) {
					if(x1.charAt(point)> x2.charAt(point)) {
						return true;
					}
					return false;
				}
				return false;
			}else if(!(hasX1|| !hasX2)){
				return true;
			}
		}
		return false;
	}

	public boolean processSortpinyin(String[] kernel, int scale) {
		for(int k= 0; k< scale; k++) {
			if(kernel[0].length()<= k|| kernel[1].length()<= k) {
				if(kernel[0].length()< kernel[1].length()) {
					return true;
				}
				return false;
			}
			if(kernel[0].toLowerCase().charAt(k)
					> kernel[1].toLowerCase().charAt(k)) {
				return true;
			}
			if(kernel[0].toLowerCase().charAt(k)
					< kernel[1].toLowerCase().charAt(k)) {
				return false;
			}
		}
		if(kernel[0].length()< kernel[1].length()) {
			return true;
		}
		return false;
	}
}