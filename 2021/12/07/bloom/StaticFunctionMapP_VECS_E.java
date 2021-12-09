package SEM.bloom;

import java.io.IOException;

import AEU.OPM.VEC.ica.EducationRatio;
import AEU.OPM.VEC.ica.InitBehaviorICAKernel;
import MSV.OSQ.sets.DetaDouble;
import PEQ.AMV.ECS.test.ANNTest;
import PEQ.AMV.ECS.test.DNNTest;
import PEQ.AMV.ECS.test.RNN_IDETest;
import PEQ.AMV.ECS.test.SensingTest;
import PEQ.OPM.VEC.test.EducationLevelTest;
import PEQ.OPM.VEC.test.LiterarinessLevelTest;
import PEQ.OPM.VEC.test.SuccessICATest;
import PEU.P.nlp.DETA_ANN_HMM;
import SVQ.stable.StableString;

//进行了test 的main 整理，还没有测试，稍后。
//可以用的 一些老接口见 http://tinos.qicp.vip/data.html
//著作权人 + 作者 = 罗瑶光
public class StaticFunctionMapP_VECS_E implements StaticFunctionMapP_VECS_C {

	public String[][] aNNTest(String string) throws IOException, InstantiationException, IllegalAccessException {
		//ANNTest ANNTest = new ANNTest();
		SensingTest sensingTest= new SensingTest();
		//SUM OF ANN MAP CULUMN KERNEL内核提取加 String参数。
		String[][] preAnnMatrix= sensingTest.getMatrix(string);
		String[][] AnnMatrix= new DETA_ANN_HMM().summing_P(preAnnMatrix);	
		for(int j = 0; j < AnnMatrix.length; j++) {
			double sum = 0;
			for(int i = 7; i < AnnMatrix[0].length; i++) {
				sum += Double.valueOf(AnnMatrix[j][i]);
			}
			if(sum >= 0.6) {
				System.out.println(AnnMatrix[j][0]+AnnMatrix[j][1] + AnnMatrix[j][2] + AnnMatrix[j][3] + "ANN:" + sum);
			}
		}
		return AnnMatrix;
	}

	public String[][] dNNTest(String string) throws IOException, InstantiationException, IllegalAccessException {
		DNNTest dNNTest=new DNNTest();
		ANNTest aNNTest= new ANNTest();
		String[][] ann= aNNTest.getANNMatrix(string);
		String[][] dnn= dNNTest.getDNNMatrix(ann);
		//		String[][] ann= aNNTest.getANNMatrix(string, _A);
		//		String[][] dnn= dNNTest.getDNNMatrix(ann, _A, string);
		for(int i=0;i<dnn.length;i++) {
			//lwa的思维refer 文森特 领英2年前  数据挖掘教材 展示过 lwa 的思想，这里也标注下。
			//之前第三修订版的著作权申请和github中 rnn 的左开始向右计算 有refer 文森特大名关于 曾发布左边开始的卷积计算的文字描述。
			//领英去年7月冻结我的 账号后，我就再没有关注过文森特了。因为我对外就一个领英，和 微信的 脸书同步关联，我在国内从不翻墙 搞鬼。
			double dnn_lwa = DetaDouble.parseDouble(dnn[i][3]);
			if(dnn_lwa>100) {
				System.out.print(ann[i][0] + ":");
				System.out.print(ann[i][1] + ":");
				System.out.print(ann[i][2] + ":");
				System.out.print(ann[i][3] + ":");
				System.out.print(dnn[i][0] + ":");
				System.out.print(dnn[i][3] + ":");
				System.out.println("");
			}
		}
		return dnn;//输出的是dnn，不是lwa加工。
	}

	public String[][] rNNTest(String string) throws IOException, InstantiationException, IllegalAccessException {
		RNN_IDETest rNN_IDETest= new RNN_IDETest();
		return rNN_IDETest.getIDEMatrix(string);	
	}

	public String[][] sensingTest(String string) throws IOException {
		SensingTest sensingTest = new SensingTest();
		return sensingTest.getMatrix(string);
	}

	public void educationLevelTest(String[] input) throws IOException {
		//ICA kernel
		double[][] kernel = new double[3][];
		kernel[0] = new EducationRatio().getEducationKernel(input[0]);
		kernel[1] = new EducationRatio().getEducationKernel(input[1]);
		kernel[2] = new EducationRatio().getEducationKernel(input[2]);

		//ANN kernel
		double[][] kernelRatio = new double[3][];
		kernelRatio[0] = new EducationRatio().getEducationRatioKernel(kernel[0]);
		kernelRatio[1] = new EducationRatio().getEducationRatioKernel(kernel[1]);
		kernelRatio[2] = new EducationRatio().getEducationRatioKernel(kernel[2]);
		EducationLevelTest educationLevelTest = new EducationLevelTest();
		educationLevelTest.IQ_EducationLevel(kernelRatio);
	}

	public void literarinessLevelTest(String[] input) throws IOException {
		//ICA kernel
		double[][] kernel = new double[3][];
		kernel[0] = new InitBehaviorICAKernel().getBehaviorICAKernel(input[0]);
		kernel[1] = new InitBehaviorICAKernel().getBehaviorICAKernel(input[1]);
		kernel[2] = new InitBehaviorICAKernel().getBehaviorICAKernel(input[2]);
		LiterarinessLevelTest educationLevelTest = new LiterarinessLevelTest();
		educationLevelTest.IQ_EducationLevel(kernel);
	}

	public void successICATest(String[] input) throws IOException {
		//ICA kernel
		double[][] kernel = new double[3][];
		kernel[0] = new InitBehaviorICAKernel().getBehaviorICAKernel(input[0]);
		kernel[1] = new InitBehaviorICAKernel().getBehaviorICAKernel(input[1]);
		kernel[2] = new InitBehaviorICAKernel().getBehaviorICAKernel(input[2]);
		SuccessICATest successICATest=new SuccessICATest();
		successICATest.IQ_KernelCNN(kernel);
		for(int i=0;i<successICATest.kernelCNN.length;i++) {
			for(int j=0;j<successICATest.kernelCNN[0].length;j++) {
				System.out.print(successICATest.kernelCNN[i][j] + " ");
			}
			System.out.println();
		}
	}
	//测试成功了，稍后优化。
	@SuppressWarnings("unused")
	public static void main(String[] argv) throws InstantiationException, IllegalAccessException, IOException {
		String string= StableString.text1;
		String[][] string1= new StaticFunctionMapP_VECS_E().aNNTest(string);	
		String[][] string2= new StaticFunctionMapP_VECS_E().dNNTest(string);	
		String[][] string3= new StaticFunctionMapP_VECS_E().rNNTest(string);	
		String[][] string4= new StaticFunctionMapP_VECS_E().sensingTest(string);	

		String[] strings= new String[3];
		strings[0]= StableString.text1;
		strings[1]= StableString.text2;
		strings[2]= StableString.text3;
		new StaticFunctionMapP_VECS_E().educationLevelTest(strings);	
		new StaticFunctionMapP_VECS_E().literarinessLevelTest(strings);	
		new StaticFunctionMapP_VECS_E().successICATest(strings);	
	}
}
