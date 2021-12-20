package SEM.bloom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import AEU.OPM.VEC.ica.EducationRatio;
import AEU.OPM.VEC.ica.InitBehaviorICAKernel;
import AVQ.ASQ.OVQ.OSQ.VSQ.obj.Verbal;
import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import MSU.OCI.ME.SMS.translator.C.Translator;
import MSU.OEI.ME.SMS.SEU.OSD.OSI.E.Translator_E;
import MSV.OSQ.sets.DetaDouble;
import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.BinaryForest_AE;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import PCI.ASQ.basic.RatioMatrix;
import PCI.ASQ.classification.AMV_MVS_VSQ_Classification;
import PCI.ASQ.classification.AMV_MVS_VSQ_HeartsSample;
import PCI.ASQ.classification.Fissile;
import PCI.ASQ.classification.FuzzProbabailityClassification;
import PCI.ASQ.classification.ProbabilityClassification;
import PCI.ASQ.cluster.Fusion;
import PCI.ASQ.cluster.SideEnd;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import PCI.ASQ.demension.Line2D;
import PCI.ASQ.demension.Line3D;
import PCI.ASQ.desolation.ErrorAsserts;
import PCI.ASQ.ica.CorrelationICA;
import PCI.ASQ.image.ImagePixClassification;
import PCI.ASQ.image.ImagePixExtract;
import PCI.ASQ.image.ImagePixGroupFilter;
import PCI.ASQ.image.ImagePixGroupPercentage;
import PCI.ASQ.isolation.ForestIsolation;
import PCI.ASQ.isolation.Isolation;
import PCI.ASQ.nlp.NLPTopicMatch;
import PCI.ASQ.pca.FindPCAMeanDistance;
import PCI.ASQ.pca.Find_AMV_MVS_VSQ_GroupPascalHearts;
import PCI.ASQ.pca.FusionPCAFilter;
import PCI.ASQ.pca.PCAMeanOfFuzzPC;
import PCI.ASQ.pca.PCA_AMV_MVS_VSQ_Filter;
import PCI.ASQ.probability.GetListOfArrayRatio;
import PCI.ASQ.probability.Percentage;
import PCI.ASQ.ratio.DistanceRatio;
import PCI.ASQ.ratio.IncrementRatio;
import PCI.ASQ.score.ProbabilityScore;
import PCI.ASQ.statistic.FindIncrement;
import PCI.ASQ.statistic.FindMean;
import PCI.ASQ.statistic.FindSum;
import PCI.ASQ.statistic.ShareholdCount;
import PCI.ASQ.trace.TraceFissile_AMV_MVS_VSQ_ByHearts;
import PCI.ASQ.trace.TraceFissile_AMV_MVS_VSQ_Hearts;
import PCI.ASQ.trace.Trace_AMV_MVS_VSQ_Hearts;
import PCI.ASQ.tsp.YaoguangLuoEulerRingTSP;
import PCI.ASQ.tsp.YaoguangLuoEulerRingTSP2D;
import PCI.ASQ.tsp.YaoguangLuoEulerRingTSP3D;
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
//稍后加pvecs组的static class前缀。
public class StaticFunctionMapP_VECS_E implements StaticFunctionMapP_VECS_C {
	public Map<String, String> annotationMap= new HashMap<>();
	@SuppressWarnings("unused")
	public void translateChineseToEnglish(String v)throws IOException {
		A _A = new CogsBinaryForest_AE();
		_A.IV_Mixed();
		Map<String, String> ce= ((BinaryForest_AE)_A).getCnToEn();
		Map<String, String> ec= ((BinaryForest_AE)_A).getEnToCn();
		Map<String, String> poscc= ((BinaryForest_AE)_A).getPosCnToCn();
		Map<String, String> posec= ((BinaryForest_AE)_A).getPosEnToCn();
		Map<String, String> posee= ((BinaryForest_AE)_A).getPosEnToEn();
		Map<String, String> fce= ((BinaryForest_AE)_A).getFullCnToEn();
		Map<String, String> fec= ((BinaryForest_AE)_A).getFullEnToCn();
		System.out.println("输入");
		// String v = "如流枫之回雪，若浣花洗月";
		////			 //String v = "数据一直在更新中";
		//			String v = "中国正在崛起的道路上奔跑";
		//			String v = "我一直在奔跑，我需要一双翅膀！";
		//			String v = "他也一直在奔跑，他同样需要一双翅膀！";
		System.out.println(v);
		Translator ts = new Translator_E();
		ts.IV_((BinaryForest_AE)_A); 
		//			TimeCheck t = new TimeCheck();
		//			t.begin();
		List<Verbal> verbals = ts.index(_A, v);
		String ch = ts.getChineseSentenseFromVerbalList(verbals);
		//			t.end();
		System.out.println("中文");
		System.out.println(ch);

		for(int i=0;i<verbals.size();i++) {
			System.out.print(verbals.get(i).getChinese());
			System.out.print(verbals.get(i).getEnglish());
			System.out.print(verbals.get(i).getExplain());
			System.out.println(verbals.get(i).getPartOfSpeech());
		}
		List<Verbal> verbalsFix = ts.fixPos(verbals);
		String en = ts.getEnglishSentenseFromVerbalFixList(verbalsFix);
		System.out.println("");
		System.out.println("英文");
		System.out.println(en);

		for(int i=0;i<verbalsFix.size();i++) {
			System.out.print(verbalsFix.get(i).getChinese());
			System.out.print(verbalsFix.get(i).getEnglish());
			System.out.print(verbalsFix.get(i).getExplain());
			System.out.println(verbalsFix.get(i).getPartOfSpeech());
		}

		System.out.println("");
		System.out.println("中文解释");
		for(int i=0;i<verbals.size();i++) {
			System.out.print(verbals.get(i).getExplain()==null?verbals.get(i).getChinese():verbals.get(i).getExplain());
		}
		//			t.duration();

		//			ReadEnglish readEnglish = new ReadEnglish();
		//			readEnglish.setPreReadText(en);
		//			readEnglish.start();
	}

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

	@Override
	public List<AMV_MVS_VSQ_2D> getSideEnd2D(List<AMV_MVS_VSQ_2D> list, double scale) {
		return SideEnd.getSideEnd2D(list, scale);
	}

	@Override
	public List<AMV_MVS_VSQ_3D> getSideEnd3D(List<AMV_MVS_VSQ_3D> list, double scale) {
		return SideEnd.getSideEnd3D(list, scale);
	}

	@Override
	public Map<Double, List<AMV_MVS_VSQ_2D>> addNewPositionWithoutHeart(Map<Double, List<AMV_MVS_VSQ_2D>> groups,
			AMV_MVS_VSQ_2D position2d, double scaleDistance) {
		return AMV_MVS_VSQ_Classification.addNewPositionWithoutHeart(groups, position2d, scaleDistance) ;
	}

	@Override
	public Map<Double, List<AMV_MVS_VSQ_2D>> addNewPositionWithHeart(Map<Double, List<AMV_MVS_VSQ_2D>> groups,
			AMV_MVS_VSQ_2D position2d, Map<Double, AMV_MVS_VSQ_2D> hearts, double scaleDistance) {
		return AMV_MVS_VSQ_Classification.addNewPositionWithHeart(groups, position2d, hearts, scaleDistance);
	}

	@Override
	public Map<Double, List<AMV_MVS_VSQ_2D>> fissilePosition2D(List<AMV_MVS_VSQ_2D> groups, double scale) {
		return Fissile.fissilePosition2D(groups, scale);
	}

	@Override
	public Map<Double, List<AMV_MVS_VSQ_3D>> fissilePosition3D(List<AMV_MVS_VSQ_3D> groups, double scale) {
		return Fissile.fissilePosition3D(groups, scale);
	}

	@Override
	public Map<Double, List<AMV_MVS_VSQ_2D>> fusionPosition2DwithHeart(Map<Double, List<AMV_MVS_VSQ_2D>> groups,
			Map<Double, AMV_MVS_VSQ_2D> groupsHeart, double scale) {
		return Fusion.fusionPosition2DwithHeart(groups, groupsHeart, scale);
	}

	@Override
	public Map<Double, List<AMV_MVS_VSQ_3D>> fusionPosition3DwithHeart(Map<Double, List<AMV_MVS_VSQ_3D>> groups,
			Map<Double, AMV_MVS_VSQ_3D> groupsHeart, double scale) {
		return Fusion.fusionPosition3DwithHeart(groups, groupsHeart, scale);
	}

	@Override
	public Map<Double, List<AMV_MVS_VSQ_2D>> getTSPIsolationGroups2D(List<AMV_MVS_VSQ_2D> groups, double scale) {
		return Isolation.getTSPIsolationGroups2D(groups, scale);
	}

	@Override
	public Map<Double, List<AMV_MVS_VSQ_3D>> getTSPIsolationGroups3D(List<AMV_MVS_VSQ_3D> groups, double scale) {
		return Isolation.getTSPIsolationGroups3D(groups, scale);
	}

	@Override
	public Map<Double, List<AMV_MVS_VSQ_2D>> getTSPForestIsolationGroups2D(List<AMV_MVS_VSQ_2D> groups, double scale) {	
		return ForestIsolation.getTSPForestIsolationGroups2D(groups, scale);
	}

	@Override
	public Map<Double, List<AMV_MVS_VSQ_3D>> getTSPForestIsolationGroups3D(List<AMV_MVS_VSQ_3D> groups, double scale) {
		return ForestIsolation.getTSPForestIsolationGroups3D(groups, scale);
	}

	@Override
	public List<AMV_MVS_VSQ_2D> trackTracePosition2DHeartsWithSingerGroup(List<AMV_MVS_VSQ_2D> coods) {
		return Trace_AMV_MVS_VSQ_Hearts.trackTracePosition2DHeartsWithSingerGroup(coods);
	}

	@Override
	public List<AMV_MVS_VSQ_3D> trackTracePosition3DHeartsWithSingerGroup(List<AMV_MVS_VSQ_3D> coods) {
		return Trace_AMV_MVS_VSQ_Hearts.trackTracePosition3DHeartsWithSingerGroup(coods);
	}

	@Override
	public List<AMV_MVS_VSQ_2D> trackTracePosition2DByHearts(List<AMV_MVS_VSQ_2D> hearts) {
		return TraceFissile_AMV_MVS_VSQ_ByHearts.trackTracePosition2DByHearts(hearts);
	}

	@Override
	public List<AMV_MVS_VSQ_3D> trackTracePosition3DByHearts(List<AMV_MVS_VSQ_3D> hearts) {
		return TraceFissile_AMV_MVS_VSQ_ByHearts.trackTracePosition3DByHearts(hearts);
	}

	@Override
	public Map<Double, List<AMV_MVS_VSQ_2D>> trackTracePosition2DHeartsWithFissileGroups(List<AMV_MVS_VSQ_2D> coods,
			double distanceScale) {
		return TraceFissile_AMV_MVS_VSQ_Hearts.trackTracePosition2DHeartsWithFissileGroups(coods, distanceScale);
	}

	@Override
	public Map<Double, List<AMV_MVS_VSQ_3D>> trackTracePosition3DHeartsWithFissileGroups(List<AMV_MVS_VSQ_3D> coods,
			double distanceScale) {
		return TraceFissile_AMV_MVS_VSQ_Hearts.trackTracePosition3DHeartsWithFissileGroups(coods, distanceScale);
	}

	@Override
	public double findMeanDistanceFromPositions2D(List<AMV_MVS_VSQ_2D> position2Ds, double oberserverPCAScale,
			int sortRangeScale) {
		return FindPCAMeanDistance.findMeanDistanceFromPositions2D(position2Ds, oberserverPCAScale, sortRangeScale);
	}

	@Override
	public double findMeanDistanceFromPositions3D(List<AMV_MVS_VSQ_3D> position3Ds, double oberserverPCAScale,
			int sortRangeScale) {
		return FindPCAMeanDistance.findMeanDistanceFromPositions3D(position3Ds, oberserverPCAScale, sortRangeScale);
	}

	@Override
	public double[] findPascalMeanDistanceByEachPositions2D(List<AMV_MVS_VSQ_2D> position2Ds, double oberserverPCAScale,
			int sortRangeScale) {
		return FindPCAMeanDistance.findPascalMeanDistanceByEachPositions2D(position2Ds, oberserverPCAScale, sortRangeScale);
	}

	@Override
	public double[] findPascalMeanDistanceByEachPositions3D(List<AMV_MVS_VSQ_3D> position3Ds, double oberserverPCAScale,
			int sortRangeScale) {
		return FindPCAMeanDistance.findPascalMeanDistanceByEachPositions3D(position3Ds, oberserverPCAScale, sortRangeScale);
	}

	@Override
	public Map<Double, AMV_MVS_VSQ_2D> getPosition2DsGroupPascalHearts(ArrayList<AMV_MVS_VSQ_2D> groups, double scale) {
		return Find_AMV_MVS_VSQ_GroupPascalHearts.getPosition2DsGroupPascalHearts(groups, scale);
	}

	@Override
	public Map<Double, AMV_MVS_VSQ_3D> getPosition3DsGroupPascalHearts(ArrayList<AMV_MVS_VSQ_3D> groups, double scale) {
		return Find_AMV_MVS_VSQ_GroupPascalHearts.getPosition3DsGroupPascalHearts(groups, scale);
	}

	@Override
	public Map<Double, AMV_MVS_VSQ_2D> getPosition2DsGroupPascalMids(ArrayList<AMV_MVS_VSQ_2D> groups, double scale) {
		return Find_AMV_MVS_VSQ_GroupPascalHearts.getPosition2DsGroupPascalMids(groups, scale);
	}

	@Override
	public Map<Double, AMV_MVS_VSQ_3D> getPosition3DsGroupPascalMids(ArrayList<AMV_MVS_VSQ_3D> groups, double scale) {
		return Find_AMV_MVS_VSQ_GroupPascalHearts.getPosition3DsGroupPascalMids(groups, scale);
	}

	@Override
	public Map<Double, Line2D> getPosition2DsGroupPascalDirection(Map<Double, AMV_MVS_VSQ_2D> pascalHearts,
			Map<Double, AMV_MVS_VSQ_2D> pascalMids) {
		return Find_AMV_MVS_VSQ_GroupPascalHearts.getPosition2DsGroupPascalDirection(pascalHearts, pascalMids);
	}

	@Override
	public Map<Double, Line3D> getPosition3DsGroupPascalDirection(Map<Double, AMV_MVS_VSQ_3D> pascalHearts,
			Map<Double, AMV_MVS_VSQ_3D> pascalMids) {
		return Find_AMV_MVS_VSQ_GroupPascalHearts.getPosition3DsGroupPascalDirection(pascalHearts, pascalMids);
	}

	@Override
	public Map<Double, Line3D> getPosition3DsGroupPascalDirection(ArrayList<AMV_MVS_VSQ_3D> groups, double scale) {
		return Find_AMV_MVS_VSQ_GroupPascalHearts.getPosition3DsGroupPascalDirection(groups, scale);
	}

	@Override
	public Map<Double, Line2D> getPosition2DsGroupPascalDirection(ArrayList<AMV_MVS_VSQ_2D> groups, double scale) {
		return Find_AMV_MVS_VSQ_GroupPascalHearts.getPosition2DsGroupPascalDirection(groups, scale);
	}

	@Override
	public List<Line2D> getYaoguangLuo2DEulerRingTSP(List<AMV_MVS_VSQ_2D> AMV_MVS_VSQs) {
		return YaoguangLuoEulerRingTSP.getYaoguangLuo2DEulerRingTSP(AMV_MVS_VSQs);
	}

	@Override
	public List<Line3D> getYaoguangLuo3DEulerRingTSP(List<AMV_MVS_VSQ_3D> AMV_MVS_VSQs) {
		return YaoguangLuoEulerRingTSP.getYaoguangLuo3DEulerRingTSP(AMV_MVS_VSQs);
	}

	@Override
	public List<Line2D> getYaoguangLuo2DEulerRingTSP2D(List<AMV_MVS_VSQ_2D> AMV_MVS_VSQs) {
		return YaoguangLuoEulerRingTSP2D.getYaoguangLuo2DEulerRingTSP2D(AMV_MVS_VSQs);
	}

	@Override
	public List<Line3D> getYaoguangLuo3DEulerRingTSP2D(List<AMV_MVS_VSQ_3D> AMV_MVS_VSQs) {
		return YaoguangLuoEulerRingTSP2D.getYaoguangLuo3DEulerRingTSP2D(AMV_MVS_VSQs);
	}

	@Override
	public List<Line2D> getYaoguangLuo2DEulerRingTSP3D(List<AMV_MVS_VSQ_2D> positions, int sortRangeScale,
			int sortDeepsScale) {
		return YaoguangLuoEulerRingTSP3D.getYaoguangLuo2DEulerRingTSP3D(positions, sortRangeScale, sortDeepsScale);
	}

	@Override
	public List<Line3D> getYaoguangLuo3DEulerRingTSP3D(List<AMV_MVS_VSQ_3D> positions, int sortRangeScale,
			int sortDeepsScale) {
		return YaoguangLuoEulerRingTSP3D.getYaoguangLuo3DEulerRingTSP3D(positions, sortRangeScale, sortDeepsScale) ;
	}

	@Override
	public int[][] getImagePix2DGroupFilter(int[][] inputPixMatrix, int RBG, int distanceScale, int max, int min) {
		return ImagePixGroupFilter.getImagePix2DGroupFilter(inputPixMatrix, RBG, distanceScale, max, min);
	}

	@Override
	public int[][][] getImagePix3DGroupFilter(int[][][] inputPixMatrix, int RBG, int distanceScale, int max, int min) {
		return ImagePixGroupFilter.getImagePix3DGroupFilter(inputPixMatrix, RBG, distanceScale, max, min); 
	}

	@Override
	public String NLPBestSentenceMatch(String searchString, String[] sampleSentences) throws IOException {
		return NLPTopicMatch.NLPBestSentenceMatch(searchString, sampleSentences); 
	}

	@Override
	public List<String> NLPBestSentencesMatch(String searchString, String[] sampleSentences, int sortStackRange,
			double filterRate) throws IOException {
		return NLPTopicMatch.NLPBestSentencesMatch(searchString, sampleSentences, sortStackRange, filterRate);
	}

	@Override
	public double[] getNLPBestSentencesMatchScore(String searchString, String[] sampleSentences) throws IOException {
		return NLPTopicMatch.getNLPBestSentencesMatchScore(searchString, sampleSentences); 
	}

	@Override
	public double[] getNLPBestSentencesMatchScoreRights(String searchString, String[] sampleSentences, A _A,
			Map<String, String> nlp, Map<String, WordFrequency> keyMap) throws IOException {
		return NLPTopicMatch.getNLPBestSentencesMatchScoreRights(searchString, sampleSentences, _A, nlp, keyMap);
	}

	@Override
	public double findTotalIncrementWithScale(double value, double times, double scale) {
		return FindIncrement.findTotalIncrementWithScale(value, times, scale);
	}

	@Override
	public double findMeanIncrementWithScale(double value, double times, double scale) {
		return FindIncrement.findMeanIncrementWithScale(value, times, scale);
	}

	@Override
	public double findMeanOfFilterDoubleArrayWithScale(double[] input, double filterScale, int sortRangeScale) {
		return FindMean.findMeanOfFilterDoubleArrayWithScale(input, filterScale, sortRangeScale);
	}

	@Override
	public double findMeanOfDoubleArray(double[] input) {
		return FindMean.findMeanOfDoubleArray(input);
	}

	@Override
	public Double[] findMeanOfTwoDoubleArray(Double[] origin, Double[] input) {
		return FindMean.findMeanOfTwoDoubleArray(origin, input);
	}

	@Override
	public Double[][] findMeanOfTwoDoubleArray2D(Double[][] origin, Double[][] input) {
		return FindMean.findMeanOfTwoDoubleArray2D(origin, input);
	}

	@Override
	public double findMeanOfDoubleMatrix2D(double[][] input) {
		return FindMean.findMeanOfDoubleMatrix2D(input);
	}

	@Override
	public double[] findRowMeanOfDoubleMatrix2D(double[][] input) {
		return FindMean.findRowMeanOfDoubleMatrix2D(input);
	}

	@Override
	public double[] findCulumnMeanOfDoubleMatrix2D(double[][] input) {
		return FindMean.findCulumnMeanOfDoubleMatrix2D(input);
	}

	@Override
	public double findMeanOfDoubleMatrix3D(double[][][] input) {
		return FindMean.findMeanOfDoubleMatrix3D(input);
	}

	@Override
	public double findMeanOfDoubleList(List<Double> input) {
		return FindMean.findMeanOfDoubleList(input);
	}

	@Override
	public Double[] findMeanOfMartrix1DList(List<Double[]> input) {
		return FindMean.findMeanOfMartrix1DList(input);
	}

	@Override
	public Double[][] findMeanOfMartrix2DList(List<Double[][]> input) {
		return FindMean.findMeanOfMartrix2DList(input);
	}

	@Override
	public double findSumOfDoubleArray(double[] input) {
		return FindSum.findSumOfDoubleArray(input);
	}

	@Override
	public Double[] findSumOfTwoDoubleArray(Double[] origin, Double[] input) {
		return FindSum.findSumOfTwoDoubleArray(origin, input);
	}

	@Override
	public Double[][] findSumOfTwoDoubleArray2D(Double[][] origin, Double[][] input) {
		return FindSum.findSumOfTwoDoubleArray2D(origin, input);
	}

	@Override
	public double findSumOfDoubleMatrix2D(double[][] input) {
		return FindSum.findSumOfDoubleMatrix2D(input);
	}

	@Override
	public double[] findRowSumOfDoubleMatrix2D(double[][] input) {
		return FindSum.findRowSumOfDoubleMatrix2D(input);
	}

	@Override
	public double[] findCulumnSumOfDoubleMatrix2D(double[][] input) {
		return FindSum.findCulumnSumOfDoubleMatrix2D(input);
	}

	@Override
	public double findSumOfDoubleMatrix3D(double[][][] input) {
		return FindSum.findSumOfDoubleMatrix3D(input);
	}

	@Override
	public double findSumOfDoubleList(List<Double> input) {
		return FindSum.findSumOfDoubleList(input);
	}

	@Override
	public Double[] findSumOfMartrix1DList(List<Double[]> input) {
		return FindSum.findSumOfMartrix1DList(input);
	}

	@Override
	public Double[][] findSumOfMartrix2DList(List<Double[][]> input) {
		return FindSum.findSumOfMartrix2DList(input);
	}

	@Override
	public boolean getErrorAsserts(double inputValue, double[] matchValues, double scale) {
		return ErrorAsserts.getErrorAsserts(inputValue, matchValues, scale);
	}

	@Override
	public boolean getBinaryErrorAsserts(double inputValue, double[] matchValues, double scale, int sortStackRange,
			boolean isSort) {
		return ErrorAsserts.getBinaryErrorAsserts(inputValue, matchValues, scale, sortStackRange, isSort); 
	}

	@Override
	public double getShareholdCount(int[][] input, int sharehold) {
		return ShareholdCount.getShareholdCount(input, sharehold);
	}

	@Override
	public boolean encodeEstimateSumOfScoresList(List<Double> scores, double estimateValue) {
		return ProbabilityScore.encodeEstimateSumOfScoresList(scores, estimateValue);
	}

	@Override
	public boolean encodeEstimateSumOfScoresArray(double[] scores, double estimateValue) {
		return ProbabilityScore.encodeEstimateSumOfScoresArray(scores, estimateValue); 
	}

	@Override
	public boolean getEstimateCartesianSumOfScoresArray(double input, double[] EstimateRatios, double estimateValue) {
		return ProbabilityScore.getEstimateCartesianSumOfScoresArray(input, EstimateRatios, estimateValue);
	}

	@Override
	public boolean getEstimateCartesian1DSumOfScoresArray(double[] inputs, double[] EstimateRatios,
			double estimateValue) {
		return ProbabilityScore.getEstimateCartesian1DSumOfScoresArray(inputs, EstimateRatios, estimateValue);
	}

	@Override
	public boolean[] encodeEstimateInitonsScore(double[] input, double[] estimateRatios, double[] estimateValue) {
		return ProbabilityScore.encodeEstimateInitonsScore(input, estimateRatios, estimateValue);
	}

	@Override
	public boolean[] decodeEstimateInitonsScore(double input, double[] estimateRatios, double[] estimateValue) {
		return ProbabilityScore.decodeEstimateInitonsScore(input, estimateRatios, estimateValue);
	}

	@Override
	public double[] getRightsEstimateScore(double[] inputs, double[] rights) {
		return ProbabilityScore.getRightsEstimateScore(inputs, rights);
	}

	@Override
	public RatioMatrix getSimilarFuzzSetWithScale(RatioMatrix input, List<RatioMatrix> groups, double scale) {
		return PCAMeanOfFuzzPC.getSimilarFuzzSetWithScale(input, groups, scale);
	}

	@Override
	public List<AMV_MVS_VSQ_2D> getShortestSamplePosition2DGroup(AMV_MVS_VSQ_2D inputHeart,
			Map<Double, List<AMV_MVS_VSQ_2D>> groups) {
		return AMV_MVS_VSQ_HeartsSample.getShortestSamplePosition2DGroup(inputHeart, groups);
	}

	@Override
	public Map<Double, List<AMV_MVS_VSQ_2D>> getShorterSamplePosition2DGroupsWithScale(AMV_MVS_VSQ_2D inputHeart,
			Map<Double, List<AMV_MVS_VSQ_2D>> groups, double scale) {
		return AMV_MVS_VSQ_HeartsSample.getShorterSamplePosition2DGroupsWithScale(inputHeart, groups, scale);
	}

	@Override
	public List<AMV_MVS_VSQ_3D> getShortestSamplePosition3DGroup(AMV_MVS_VSQ_3D inputHeart,
			Map<Double, List<AMV_MVS_VSQ_3D>> groups) {
		return AMV_MVS_VSQ_HeartsSample.getShortestSamplePosition3DGroup(inputHeart, groups);
	}

	@Override
	public Map<Double, List<AMV_MVS_VSQ_3D>> getShortestSamplePosition3DGroupsWithScale(AMV_MVS_VSQ_3D inputHeart,
			Map<Double, List<AMV_MVS_VSQ_3D>> groups, double scale) {
		return AMV_MVS_VSQ_HeartsSample.getShortestSamplePosition3DGroupsWithScale(inputHeart, groups, scale);
	}

	@Override
	public RatioMatrix getSimilarFuzzSet(RatioMatrix input, List<RatioMatrix> groups) {
		return FuzzProbabailityClassification.getSimilarFuzzSet(input, groups);
	}

	@Override
	public List<RatioMatrix> getSimilarFuzzSetListWithScale(RatioMatrix input, List<RatioMatrix> groups, double scale) {
		return FuzzProbabailityClassification.getSimilarFuzzSetListWithScale(input, groups, scale);
	}

	@Override
	public double getDistanceRatio2D(AMV_MVS_VSQ_2D begin, AMV_MVS_VSQ_2D end) {
		return DistanceRatio.getDistanceRatio2D(begin, end);
	}

	@Override
	public double getARCDistanceRatio2D(AMV_MVS_VSQ_2D begin, AMV_MVS_VSQ_2D end) {
		return DistanceRatio.getARCDistanceRatio2D(begin, end);
	}

	@Override
	public double getTrueARCDistanceRatio2D(AMV_MVS_VSQ_2D begin, AMV_MVS_VSQ_2D end) {
		return DistanceRatio.getTrueARCDistanceRatio2D(begin, end);
	}

	@Override
	public double getDistanceRatio3D(AMV_MVS_VSQ_3D begin, AMV_MVS_VSQ_3D end) {
		return DistanceRatio.getDistanceRatio3D(begin, end);
	}

	@Override
	public double getTrueARCDistanceRatio3D(AMV_MVS_VSQ_3D begin, AMV_MVS_VSQ_3D end) {
		return DistanceRatio.getTrueARCDistanceRatio3D(begin, end);
	}

	@Override
	public List<Double> getPercentListByOuterKey(Double[] array) {
		return GetListOfArrayRatio.getPercentListByOuterKey(array);
	}

	@Override
	public void kernel(List<Double> output, Double[] array, int j) {
		GetListOfArrayRatio.kernel(output, array, j);
	}

	@Override
	public void kernelFix(List<Double> output, Double[] array, int j) {
		GetListOfArrayRatio.kernelFix(output, array, j);
	}

	@Override
	public double findTotalIncrementRatioWithScale(double value, double times, double scale) {
		return IncrementRatio.findTotalIncrementRatioWithScale(value, times, scale);
	}

	@Override
	public double findMeanIncrementRatioWithScale(double value, double times, double scale) {
		return IncrementRatio.findMeanIncrementRatioWithScale(value, times, scale);
	}

	@Override
	public double[] frequencyUpSplit(double[] originFrequency, double[] compareFrequency) {
		return CorrelationICA.frequencyUpSplit(originFrequency, compareFrequency);
	}

	@Override
	public double[] frequencyDownSplit(double[] originFrequency, double[] compareFrequency) {
		return CorrelationICA.frequencyDownSplit(originFrequency, compareFrequency);
	}

	@Override
	public double[] frequencyUpSplitWithScale(double[] originFrequency, double[] compareFrequency, double scale) {
		return CorrelationICA.frequencyUpSplitWithScale(originFrequency, compareFrequency, scale);
	}

	@Override
	public double[] frequencyDownSplitWithScale(double[] originFrequency, double[] compareFrequency, double scale) {
		return CorrelationICA.frequencyDownSplitWithScale(originFrequency, compareFrequency, scale);
	}

	@Override
	public boolean predictionResult(RatioMatrix input, List<RatioMatrix> groups, double scale) {
		return ProbabilityClassification.predictionResult(input, groups, scale);
	}

	@Override
	public String predictionMatrixResult(RatioMatrix input, Map<String, RatioMatrix> groups, double scale) {
		return ProbabilityClassification.predictionMatrixResult(input, groups, scale);
	}

	@Override
	public Map<Integer, ArrayList<AMV_MVS_VSQ_2D>> getImagePixClassificationMap(int[][] pixMap) {
		return ImagePixClassification.getImagePixClassificationMap(pixMap);
	}

	@Override
	public Map<Integer, ArrayList<AMV_MVS_VSQ_3D>> getImagePixClassificationMap(int[][][] pixMap) {
		return ImagePixClassification.getImagePixClassificationMap(pixMap);
	}

	@Override
	public int[] getVWaveFromImagePix(int[][] pixMap, int RGB) {
		return ImagePixExtract.getVWaveFromImagePix(pixMap, RGB);
	}

	@Override
	public int[] getHWaveFromImagePix(int[][] pixMap, int RGB) {
		return ImagePixExtract.getHWaveFromImagePix(pixMap, RGB);
	}

	@Override
	public double getPixPercentByDeterPix(int[][] imagePix, int scaleRBG) {
		return ImagePixGroupPercentage.getPixPercentByDeterPix(imagePix, scaleRBG);
	}
	// 稍后加pvecs组的static class前缀。
	@Override
	public double getClusterPercentByDeterPixGroup(Map<Double, List<AMV_MVS_VSQ_2D>> imagePix, int scaleSUM) {
		//return 前缀.getClusterPercentByDeterPixGroup(imagePix, scaleSUM);
		return ImagePixGroupPercentage.getClusterPercentByDeterPixGroup(imagePix, scaleSUM);
	}

	@Override
	public double getPixPercentByDeterPixGroup(Map<Double, List<AMV_MVS_VSQ_2D>> imagePix, int scaleSUM) {
		return ImagePixGroupPercentage.getPixPercentByDeterPixGroup(imagePix, scaleSUM);
	}
		
	//FusionPCAFilter
	@Override
	public Map<Double, List<AMV_MVS_VSQ_2D>> filterFusion2DSetsWithCountScale(Map<Double, List<AMV_MVS_VSQ_2D>> groups,
			double countScale) {
		// TODO Auto-generated method stub
		return FusionPCAFilter.filterFusion2DSetsWithCountScale(groups, countScale);
	}

	@Override
	public Map<Double, List<AMV_MVS_VSQ_3D>> filterFusion3DSetsWithCountScale(Map<Double, List<AMV_MVS_VSQ_3D>> groups,
			double countScale) {
		// TODO Auto-generated method stub
		return FusionPCAFilter.filterFusion3DSetsWithCountScale(groups, countScale);
	}
	//PCA_AMV_MVS_VSQ_Filter
	@Override
	public List<AMV_MVS_VSQ_2D> filterPosition2DsWithScaledDistance(List<AMV_MVS_VSQ_2D> input, AMV_MVS_VSQ_2D heart,
			double scaleDistacne) {
		// TODO Auto-generated method stub
		return PCA_AMV_MVS_VSQ_Filter.filterPosition2DsWithScaledDistance(input, heart, scaleDistacne);
	}

	@Override
	public List<AMV_MVS_VSQ_3D> filterPosition3DsWithScaledDistance(List<AMV_MVS_VSQ_3D> input, AMV_MVS_VSQ_3D heart,
			double scaleDistacne) {
		// TODO Auto-generated method stub
		return PCA_AMV_MVS_VSQ_Filter.filterPosition3DsWithScaledDistance(input, heart, scaleDistacne);
	}

	@Override
	public Map<Double, List<AMV_MVS_VSQ_2D>> filterPosition2DsWithScaledDistance(
			Map<Double, List<AMV_MVS_VSQ_2D>> input, AMV_MVS_VSQ_2D heart, double scaleDistacne) {
		// TODO Auto-generated method stub
		return PCA_AMV_MVS_VSQ_Filter.filterPosition2DsWithScaledDistance(input, heart, scaleDistacne) ;
	}

	@Override
	public Map<Double, List<AMV_MVS_VSQ_3D>> filterPosition3DsWithScaledDistance(
			Map<Double, List<AMV_MVS_VSQ_3D>> input, AMV_MVS_VSQ_3D heart, double scaleDistacne) {
		// TODO Auto-generated method stub
		return PCA_AMV_MVS_VSQ_Filter.filterPosition3DsWithScaledDistance(input, heart, scaleDistacne);
	}

	
	//Percentage{
	@Override
	public List<Double> getPercentListByOuterKey(List<Double> list, double key) {
		// TODO Auto-generated method stub
		return Percentage.getPercentListByOuterKey(list, key);
	}

	@Override
	public double[] getPercentArrayByOuterKey(double[] array, double key) {
		// TODO Auto-generated method stub
		return Percentage.getPercentArrayByOuterKey(array, key);
	}

	@Override
	public double[] getEachPercentSetOfArray(double[] array) {
		// TODO Auto-generated method stub
		return Percentage.getEachPercentSetOfArray(array);
	}

	@Override
	public double[][] getPercentArrayByOuterKey(double[][] array, double key) {
		// TODO Auto-generated method stub
		return Percentage.getPercentArrayByOuterKey(array, key) ;
	}

	@Override
	public double[][] getEachPercentSetOfArray(double[][] array) {
		// TODO Auto-generated method stub
		return Percentage.getEachPercentSetOfArray(array) ;
	}
}
