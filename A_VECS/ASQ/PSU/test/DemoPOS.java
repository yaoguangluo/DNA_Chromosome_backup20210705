package ASQ.PSU.test;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import OCI.ME.analysis.C.A;
//import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OEI.ME.analysis.E.BinaryForest_AE;
import static java.lang.System.*;

public class DemoPOS {
	public static void main(String[] args) throws IOException {
		A _A = new CogsBinaryForest_AE();
		_A.IV_Mixed();//.init();
		Map<String, String> nlp = ((BinaryForest_AE) _A).getPosCnToCn();
		List<String> sets = new ArrayList<>();
		String[] ss = new String[37];
		String[] ss1 = new String[37];
		ss[0] = "";
		ss[1] = "���Ϸ�������";
		ss[2] = "��˵��ȷʵ��?????";
		ss[3] = "";
		ss[4] = "";
		ss[5] = "��߲�Ʒ����";
		ss[6] = "�����ѧ����";
		ss[7] = "������ѧ��ǰ��Ӧ?????";
		ss[8] = "Ϊ�����?????";
		ss[9] = "����������ƽ�Ȼ�����ԭ��";
		ss[10] = "Ϊ����칫��";
		ss[11] = "���µ�ȷ��������";
		ss[12] = "�����Ű��ֻ�?????";
		ss[13] = "������̧����";
		ss[14] = "ѧ����������";
		ss[15] = "ѧ�������������?????";
		ss[16] = "ѧ������?????";
		ss[17] = "�о�����ˮƽ";
		ss[18] = "�й�����?????";
		ss[19] = "�Ұ���������";
		ss[20] = "�й�ϲ��?????";
		ss[21] = "�й��Ȱ�?????";
		ss[22] = "������ȥ����?????";
		ss[23] = "������ͷ����?????";
		ss[24] = "����������һ����?????";
		ss[25] = "���������н�������??";
		ss[26] = "";
		ss[27] = "�����������廪��?????";
		ss1[0] = "";
		ss1[1] = "????? ????? ���� ����";
		ss1[2] = "????? ????? ????? ȷʵ ����";
		ss1[3] = "";
		ss1[4] = "";
		ss1[5] = "��� ��Ʒ ����";
		ss1[6] = "���� ��ѧ ����";
		ss1[7] = "���� ��ѧ????? ????? ????? ӦƸ";
		ss1[8] = "????? ���� ����";
		ss1[9] = "���� ���� ????? ƽ�� ���� ????? ԭ��";
		ss1[10] = "????? ���� �칫?????";
		ss1[11] = "���� ��ȷ ????? ????? ����";
		ss1[12] = "????? ????? ????? ���� ????? ?????";
		ss1[13] = "????? ????? ????? ????? ����";
		ss1[14] = "ѧ��????? ���� ?????";
		ss1[15] = "ѧ�� ????? ���� ��� ��ҵ";
		ss1[16] = "ѧ��????? ��Ϸ";
		ss1[17] = "�о� ���� ˮƽ";
		ss1[18] = "�й� ????? ��ҵ";
		ss1[19] = "????? ????? ���� ����";
		ss1[20] = "";
		ss1[21] = "";
		ss1[22] = "����????? ????? ���� ?????";
		ss1[23] = "���� ��ͷ���� ?????";
		ss1[24] = "���� ���� ????? ?????????? �н�";
		ss1[25] = "���� ????? ????? ????? ????? ���� ��??";
		ss1[26] = "";
		ss1[27] = "????? ���� ���� �廪 ��ѧ";
		ss[28] = "";
		ss1[28] = "";
		ss[29] = "";
		ss1[29] = "";
		
		ss[30] = "  ";
		ss1[30]= "  ";
		ss[31] = " ";
		ss1[31] = "";
		ss[32] = "   ";
		ss1[32]= " ";
		ss[33] = "���˼����岻?????";
		ss[34]= "���˼��кܸ�?????";
		ss1[33] = "????? �˼� ���� ����";
		ss1[34]= "���� ????? ????? ????? �ɾ�";
		ss[35] = "��Ȩ����������Ӧ";
		ss[36] = "���û���?????";
		ss1[35] = "��Ȩ ���� ????? ????? ��Ӧ";
		ss1[36] = " ????? �û� ����";
		for (int i = 0; i < ss.length; i++) {
			System.out.println("������?���Ӳ�?????-->" + ss[i]);
			sets = _A.parserString(ss[i].replace(" ", ""));//��?��?????
			out.print("����������ʵ���-->");
			for (int j = 0; j < sets.size(); j++) {
				if (!sets.get(j).replaceAll("\\s+", "").equals("")) {
					out.print(sets.get(j) + " ");
				}
			}
			out.println();
			out.println("�����õ��ִ�Ч��-->" + ss1[i]);
			for (int k = 0; k < sets.size(); k++) {
				if (!sets.get(k).replaceAll("\\s+", "").equals("")) {
					nlp.get(sets.get(k));
					out.println(sets.get(k) + "/" + nlp.get(sets.get(k)) + "  ");
				}
			}
			out.println("");
		}
	}
}