package OEU.LYG4DQS4D;
//import java.io.BufferedReader;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.HashMap;
//20200314 ���������µ�С�߷���˴߻�����5��˼�롣

//20200818 ���������µ�С�߷���˴߻�����9��˼�롣
//����ͬƴ��ͬ�ʻ����ְ�char��int��С����20210529
//������
import java.util.Map;
//import SVQ.stable.StableFile;
//import PEU.S.verbal.VerbalSource;
//���콫�³´�л����Ӧ�õ� ����ƴ���ʻ��ִ���.
//������
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