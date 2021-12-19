package SEM.bloom;
import java.io.IOException;
import java.util.HashMap;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Map;
//���������ļ���
//������
//���̣�1�ȹ��̹��ɣ�Ȼ��2���࣬���3ͳ��ִ�нӿڵ����java�ļ���4����map������
public class StaticClassMap{
	public static Map<String, Object>  staticClassMap= new HashMap<>();
	public StaticClassMap(String string) throws IOException {
		if("A_VECS".equals(string)) {
			//..���������ļ�����������ע�ắ����
			//�ִ� ������ ��з����������������ı��������Ӿ�����
			//�ִ�
			StaticFunctionMapA_VECS_C.load();//static ���
			staticClassMap.put("A_VECS",new StaticFunctionMapA_VECS_E());//CE�ӿ��Ȼ�

		}
		if("A_IDUQ".equals(string)) {
			//..��չ��ʽ�� dna���ܣ�vpcs�������� 
			StaticFunctionMapA_IDUQ_C.load();//static ���
			staticClassMap.put("A_IDUQ",new StaticFunctionMapA_IDUQ_E());//CE�ӿ��Ȼ�
		}
		
		if("O_VECS".equals(string)) {
			//..tinshell�� ���ķ��������ݿ����ԣ���ɢ���ұ任��
			StaticFunctionMapO_VECS_C.load();//static ���
			staticClassMap.put("O_VECS",new StaticFunctionMapO_VECS_E());//CE�ӿ��Ȼ�
		}
		if("O_IDUQ".equals(string)) {
			//..etl �ĵ���ִ�У� ���档
			StaticFunctionMapO_IDUQ_C.load();//static ���
			staticClassMap.put("O_IDUQ",new StaticFunctionMapO_IDUQ_E());//CE�ӿ��Ȼ�
		}
		
		if("P_VECS".equals(string)) {
			//..����Ԥ����������
			StaticFunctionMapP_VECS_C.load();//static ���
			staticClassMap.put("P_VECS",new StaticFunctionMapP_VECS_E());//CE�ӿ��Ȼ�
		}
		if("P_IDUQ".equals(string)) {
			//..dna�Ŵ��ӽ����
			StaticFunctionMapP_IDUQ_C.load();//static ���
			staticClassMap.put("P_IDUQ",new StaticFunctionMapP_IDUQ_E());//CE�ӿ��Ȼ�
		}
		
		if("M_VECS".equals(string)) {
			//..���ݿ� ��ɾ�Ĳ顣����ؼ�����ӡ�������ά�ʻ����
			StaticFunctionMapM_VECS_C.load();//static ���
			staticClassMap.put("M_VECS",new StaticFunctionMapM_VECS_E());//CE�ӿ��Ȼ�
		}
		if("M_IDUQ".equals(string)) {
			//..ŷ�� Ԫ�����ƻ�·�� Ԫ�����Ʊ任��
			StaticFunctionMapM_IDUQ_C.load();//static ���
			staticClassMap.put("M_IDUQ",new StaticFunctionMapM_IDUQ_E());//CE�ӿ��Ȼ�
		}
		
		if("V_AOPM".equals(string)) {
			//..dna ����Կ�׷ǶԳƱ任���ܣ� ���棬��ά�Ӿ���
			StaticFunctionMapV_AOPM_C.load();//static ���
			staticClassMap.put("V_AOPM",new StaticFunctionMapV_AOPM_E());//CE�ӿ��Ȼ�
		}
		if("V_IDUQ".equals(string)) {
			//..etl������������棬etl��ȡ�ĵ���
			StaticFunctionMapV_IDUQ_C.load();//static ���
			staticClassMap.put("V_IDUQ",new StaticFunctionMapV_IDUQ_E());//CE�ӿ��Ȼ�
		}
		
		if("E_AOPM".equals(string)) {
			//..�����ִʺ��������
			StaticFunctionMapE_AOPM_C.load();//static ���
			staticClassMap.put("E_AOPM",new StaticFunctionMapE_AOPM_E());//CE�ӿ��Ȼ�
		}
		if("E_IDUQ".equals(string)) {
			//..etl �������������� osgi ���ע�����
			StaticFunctionMapE_IDUQ_C.load();//static ���
			staticClassMap.put("E_IDUQ",new StaticFunctionMapE_IDUQ_E());//CE�ӿ��Ȼ�
		}
		
		if("C_AOPM".equals(string)) {
			//..vpcs���������ģ� ��Ȼ���Դ������
			StaticFunctionMapC_AOPM_C.load();//static ���
			staticClassMap.put("C_AOPM",new StaticFunctionMapC_AOPM_E());//CE�ӿ��Ȼ�
		}
		if("C_IDUQ".equals(string)) {
			//..��Ȼ���� ��������
			StaticFunctionMapC_IDUQ_C.load();//static ���
			staticClassMap.put("C_IDUQ",new StaticFunctionMapC_IDUQ_E());//CE�ӿ��Ȼ�
		}
		
		if("S_AOPM".equals(string)) {
			//..���ݼ�¼����
			StaticFunctionMapS_AOPM_C.load();//static ���
			staticClassMap.put("S_AOPM",new StaticFunctionMapS_AOPM_E());//CE�ӿ��Ȼ�
		}
		if("S_IDUQ".equals(string)) {
			//..���ԣ����������ݲ�������
			StaticFunctionMapS_IDUQ_C.load();//static ���
			staticClassMap.put("S_IDUQ",new StaticFunctionMapS_IDUQ_E());//CE�ӿ��Ȼ�
		}
		
		if("I_AOPM".equals(string)) {
			//..������¼����ά���ݷ����Ǽ�
			StaticFunctionMapI_AOPM_C.load();//static ���
			staticClassMap.put("I_AOPM",new StaticFunctionMapI_AOPM_E());//CE�ӿ��Ȼ�
		}
		if("I_VECS".equals(string)) {
			//..�ĸ�ʴ�� �Ǿ���Ӿ���ͼƬ����
			StaticFunctionMapI_VECS_C.load();//static ���
			staticClassMap.put("I_VECS",new StaticFunctionMapI_VECS_E());//CE�ӿ��Ȼ�
		}
		
		if("D_AOPM".equals(string)) {
			//..�����쳣����
			StaticFunctionMapD_AOPM_C.load();//static ���
			staticClassMap.put("A_AOPM",new StaticFunctionMapD_AOPM_E());//CE�ӿ��Ȼ�
		}
		if("D_VECS".equals(string)) {
			//..�����쳣�������Ժ�ѹ����� ɾ���� �Ƶ���������
			StaticFunctionMapD_VECS_C.load();//static ���
			staticClassMap.put("D_VECS",new StaticFunctionMapD_VECS_E());//CE�ӿ��Ȼ�
		}
		
		if("U_AOPM".equals(string)) {
			//..����任����
			StaticFunctionMapU_AOPM_C.load();//static ���
			staticClassMap.put("U_AOPM",new StaticFunctionMapU_AOPM_E());//CE�ӿ��Ȼ�
		}
		if("U_VECS".equals(string)) {
			//..���ݱ任����
			StaticFunctionMapU_VECS_C.load();//static ���
			StaticFunctionMapU_VECS_E staticFunctionMapU_VECS_E= new StaticFunctionMapU_VECS_E();
			staticClassMap.put("U_VECS", staticFunctionMapU_VECS_E);//CE�ӿ��Ȼ�
			staticFunctionMapU_VECS_E.annotationMap.put("main", "main");//ע��һ��main�ӿ�
			//����..����ע�ᡣ��
			//����
		}
		
		if("Q_AOPM".equals(string)) {
			//..��Ԫdna�ӽ�������
			StaticFunctionMapQ_AOPM_C.load();//static ���
			staticClassMap.put("Q_AOPM",new StaticFunctionMapQ_AOPM_E());//CE�ӿ��Ȼ�
		}
		if("Q_VECS".equals(string)) {
			//..dna������ ���ݿ�orm�� ��������
			StaticFunctionMapQ_VECS_C.load();//static ���
			staticClassMap.put("Q_VECS",new StaticFunctionMapQ_VECS_E());//CE�ӿ��Ȼ�
		}
		// TODO Auto-generated constructor stub
	}
	
}