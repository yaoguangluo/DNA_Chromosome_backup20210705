package OEU.LYG4DQS4D;
//import java.io.BufferedReader;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.HashMap;
//20200314 集成了最新的小高峰过滤催化排序5代思想。

//20200818 集成了最新的小高峰过滤催化排序9代思想。
//增加同拼音同笔画的字按char的int大小区分20210529
//罗瑶光
import java.util.Map;
//import SVQ.stable.StableFile;
//import PEU.S.verbal.VerbalSource;
//今天将新陈代谢技术应用到 中文拼音笔画分词上.
//罗瑶光
public class LYG10DWCMSSort13D_XCDX_C_A_S extends LYG10DWCMSSort13D_XCDX_C_U_A implements LYG10DWCMSSort13D_XCDX_C_A_S_C{
	public void quick4DChineseStringArray1D(String[] strings, int scale, Map<String, String> map
			, int range, int deeps, Map<String, Integer> bihua) {
		this.pinyin= map;
		this.range= range;
		this.deeps= deeps;
		this.bihua= bihua;
		processKernel(strings, 0, strings.length- 1, scale, 0);
	}

	public boolean quick4DChineseStringArrayWithSmallInTwoChar(String[] strings, int leftPosition
			, int rightPosition, int scale, Map<String, String> map, int range, int deeps) {
		this.pinyin= map;
		this.range= range;
		this.deeps= deeps;
		String oldValue=strings[0].toString();
		processKernel(strings, leftPosition, rightPosition, scale, 0);
		if(oldValue.equalsIgnoreCase(strings[0])){
			return true;
		}else {
			return false;
		}
	}

	public int quick4DChineseStringArrayWithSmallInTwoChar3Returns(String[] strings, int leftPosition
			, int rightPosition, int scale, Map<String, String> map, int range, int deeps) {
		this.pinyin= map;
		this.range= range;
		this.deeps= deeps;
		String oldValue=strings[0].toString();
		processKernel(strings, leftPosition, rightPosition, scale, 0);

		//先1 等 后1    先 1等 后2
		//先1 等 后1    先 1 不等 后2
		//先1 不等 后1    先 1等 后2
		//先1 不等 后1    先 1不等 后2

		if(strings[0].equals(strings[1])) {
			return 0;
		}
		if(oldValue.equalsIgnoreCase(strings[0])) {
			return 1;
		}
		if(!oldValue.equalsIgnoreCase(strings[0])) {
			return -1;
		}
		if(oldValue.equalsIgnoreCase(strings[1])) {
			return -1;
		}
		if(!oldValue.equalsIgnoreCase(strings[1])) {
			return 1;
		}
		return 0;
	}

	public int quick4DChineseStringArrayWithSmallInTwoChar3bihuaReturns(String[] strings, int leftPosition
			, int rightPosition, int scale, Map<String, String> map, Map<String, Integer> bihua, int range, int deeps) {
		this.pinyin= map;
		this.range= range;
		this.deeps= deeps;
		this.bihua= bihua;
		String oldValue=strings[0].toString();
		processKernel(strings, leftPosition, rightPosition, scale, 0);

		//先1 等 后1    先 1等 后2
		//先1 等 后1    先 1 不等 后2
		//先1 不等 后1    先 1等 后2
		//先1 不等 后1    先 1不等 后2
		if(strings[0].equals(strings[1])) {
			return 0;
		}
		if(oldValue.equalsIgnoreCase(strings[0])) {
			return 1;
		}
		if(!oldValue.equalsIgnoreCase(strings[0])) {
			return -1;
		}
		if(oldValue.equalsIgnoreCase(strings[1])) {
			return -1;
		}
		if(!oldValue.equalsIgnoreCase(strings[1])) {
			return 1;
		}
		return 0;
	}

	public boolean findSmallWithTwoCharWithpinyin(Map<String, String> pinyinMap, String x1, String x2
			, int scale, int point){
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
			boolean hasX1= pinyinMap.containsKey(""+ x1.charAt(point));
			boolean hasX2= pinyinMap.containsKey(""+ x2.charAt(point));
			if(!(!hasX1|| !hasX2)){
				String[] js= new String[2];
				js[0]= pinyinMap.get(""+ x1.charAt(point));
				js[1]= pinyinMap.get(""+ x2.charAt(point));
				boolean change= processSortpinyin(js, 3);
				if(change) {
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
}