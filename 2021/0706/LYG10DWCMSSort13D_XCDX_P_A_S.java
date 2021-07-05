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
public class LYG10DWCMSSort13D_XCDX_P_A_S extends LYG10DWCMSSort13D_XCDX_P_U_A{

	public void quick4DChineseStringArray2D(String[][] strings2d, int scale, Map<String, String> map
			, int range, int deeps, int culumn, Map<String, Integer> bihua) {
		this.pinyin= map;
		this.range= range;
		this.deeps= deeps;
		this.bihua= bihua;
		processKernel2D(strings2d, 0, strings2d.length- 1, scale, 0, culumn);
	}
}