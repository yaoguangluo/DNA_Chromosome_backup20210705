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