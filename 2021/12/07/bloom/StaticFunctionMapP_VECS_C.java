package SEM.bloom;

import java.io.IOException;

//进行了test 的main 整理，还没有测试，稍后。
//可以用的 一些老接口见 http://tinos.qicp.vip/data.html
//著作权人 + 作者 = 罗瑶光
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
