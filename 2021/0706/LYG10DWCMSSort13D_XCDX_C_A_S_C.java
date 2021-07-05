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
public interface LYG10DWCMSSort13D_XCDX_C_A_S_C{
	void quick4DChineseStringArray1D(String[] strings, int scale, Map<String, String> map
			, int range, int deeps, Map<String, Integer> bihua);

	boolean quick4DChineseStringArrayWithSmallInTwoChar(String[] strings, int leftPosition
			, int rightPosition, int scale, Map<String, String> map, int range, int deeps);

	int quick4DChineseStringArrayWithSmallInTwoChar3Returns(String[] strings, int leftPosition
			, int rightPosition, int scale, Map<String, String> map, int range, int deeps);

	int quick4DChineseStringArrayWithSmallInTwoChar3bihuaReturns(String[] strings, int leftPosition
			, int rightPosition, int scale, Map<String, String> map, Map<String, Integer> bihua, int range, int deeps);

	boolean findSmallWithTwoCharWithpinyin(Map<String, String> pinyinMap, String x1, String x2
			, int scale, int point);
}