package OEU.LYG4DQS4D;
////import java.io.BufferedReader;
////import java.io.InputStream;
////import java.io.InputStreamReader;
////import java.util.HashMap;
////20200314 集成了最新的小高峰过滤催化排序5代思想。
//
////20200818 集成了最新的小高峰过滤催化排序9代思想。
////增加同拼音同笔画的字按char的int大小区分20210529
////罗瑶光
//import java.util.Map;
//import SVQ.stable.StableFile;
//import PEU.S.verbal.VerbalSource;
//今天将新陈代谢技术应用到 中文拼音笔画分词上.
//罗瑶光
public class LYG10DWCMSSort13D_XCDX_P_A extends LYG10DWCMSSort13D_XCDX_S{

	protected boolean findSmall2D(String[][] kernel, int scale, int point
			, int i, int j, int rightPosition, int culumn) {
		if(kernel[i][culumn].length()<= point
				|| kernel[j][culumn].length()<= point) {
			if(kernel[i][culumn].length()< kernel[j][culumn].length()) {
				for(int p= 0; p< scale; p++) {
					if(!(kernel[i][culumn].length()<= p|| kernel[j][culumn].length()<= p)) {
						if(kernel[i][culumn].charAt(p)!= kernel[j][culumn].charAt(p)) {
							return false;
						}
					}
				}
				return true;
			}
			return false;
		}else {
			boolean hasXi= pinyin.containsKey(""+ kernel[i][culumn].charAt(point));
			boolean hasXj= pinyin.containsKey(""+ kernel[j][culumn].charAt(point));
			if(!(!hasXi|| !hasXj)){
				String[] js= new String[2];
				js[0]= this.pinyin.get(""+ kernel[i][culumn].charAt(point));
				js[1]= this.pinyin.get(""+ kernel[j][culumn].charAt(point));
				boolean change= processSortpinyin(js, 3);
				if(!(!change|| i>= j)) {
					return true;
				}
				return false;
			}else if(!(hasXi|| hasXj)){
				if(kernel[i][culumn].toLowerCase().charAt(point)
						> kernel[j][culumn].toLowerCase().charAt(point)) {
					if(i< j) {
						return true;
					}
					return false;
				}else if(kernel[i][culumn].toLowerCase().charAt(point)
						== kernel[j][culumn].toLowerCase().charAt(point)) {
					if(kernel[i][culumn].charAt(point)
							> kernel[j][culumn].charAt(point)) {
						if(i< j) {
							return true;
						}
						return false;
					}
					return false;
				}
				return false;
			}else if(!(hasXi|| !hasXj)){
				if(i< j) {
					if(!(i== rightPosition || j== rightPosition)) {
						return true;
					}
					return false;
				}
				return false;
			}
		}
		return false;
	}
}