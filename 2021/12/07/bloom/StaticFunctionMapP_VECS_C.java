package SEM.bloom;

import java.io.IOException;

//������test ��main ������û�в��ԣ��Ժ�
//�����õ� һЩ�Ͻӿڼ� http://tinos.qicp.vip/data.html
//����Ȩ�� + ���� = ������
public interface StaticFunctionMapP_VECS_C {

	public static void load() {
		// TODO Auto-generated method stub
		
	}	
	public String[][] aNNTest(String string) throws IOException, InstantiationException, IllegalAccessException;
	public String[][] dNNTest(String string) throws IOException, InstantiationException, IllegalAccessException;
	public String[][] rNNTest(String string) throws IOException, InstantiationException, IllegalAccessException;
	public String[][] sensingTest(String string) throws IOException;
	public void educationLevelTest(String[] strings) throws IOException;
	public void literarinessLevelTest(String[] strings) throws IOException;
	public void successICATest(String[] strings) throws IOException;

}
