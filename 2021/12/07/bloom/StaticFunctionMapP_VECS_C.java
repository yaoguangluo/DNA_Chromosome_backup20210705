package SEM.bloom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import OCI.ME.analysis.C.A;
import PCI.ASQ.basic.RatioMatrix;
import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
import PCI.ASQ.demension.Line2D;
import PCI.ASQ.demension.Line3D;

//������test ��main ������û�в��ԣ��Ժ�
//�����õ� һЩ�Ͻӿڼ� http://tinos.qicp.vip/data.html
//����Ȩ�� + ���� = ������
public interface StaticFunctionMapP_VECS_C {

	public static void load(StaticFunctionMapP_VECS_E staticFunctionMapP_VECS_E) {
		// TODO Auto-generated method stub
		//�Ժ��װ
		staticFunctionMapP_VECS_E.annotationMap.put("aNNTest", "aNNTest");
		staticFunctionMapP_VECS_E.annotationMap.put("dNNTest", "dNNTest");
		staticFunctionMapP_VECS_E.annotationMap.put("rNNTest", "rNNTest");
		staticFunctionMapP_VECS_E.annotationMap.put("sensingTest", "sensingTest");
		staticFunctionMapP_VECS_E.annotationMap.put("educationLevelTest", "educationLevelTest");
		staticFunctionMapP_VECS_E.annotationMap.put("literarinessLevelTest", "literarinessLevelTest");
		staticFunctionMapP_VECS_E.annotationMap.put("successICATest", "successICATest");
		staticFunctionMapP_VECS_E.annotationMap.put("getSideEnd2D", "getSideEnd2D");
		staticFunctionMapP_VECS_E.annotationMap.put("getSideEnd3D", "getSideEnd3D");
		staticFunctionMapP_VECS_E.annotationMap.put("addNewPositionWithoutHeart", "addNewPositionWithoutHeart");
		staticFunctionMapP_VECS_E.annotationMap.put("addNewPositionWithHeart", "addNewPositionWithHeart");
		staticFunctionMapP_VECS_E.annotationMap.put("getShortestSamplePosition2DGroup", "getShortestSamplePosition2DGroup");
		staticFunctionMapP_VECS_E.annotationMap.put("getShorterSamplePosition2DGroupsWithScale", "getShorterSamplePosition2DGroupsWithScale");
		staticFunctionMapP_VECS_E.annotationMap.put("getShortestSamplePosition3DGroup", "getShortestSamplePosition3DGroup");
		staticFunctionMapP_VECS_E.annotationMap.put("getShortestSamplePosition3DGroupsWithScale", "getShortestSamplePosition3DGroupsWithScale");
		staticFunctionMapP_VECS_E.annotationMap.put("fissilePosition2D", "fissilePosition2D");
		staticFunctionMapP_VECS_E.annotationMap.put("fissilePosition3D", "fissilePosition3D");
		staticFunctionMapP_VECS_E.annotationMap.put("fusionPosition2DwithHeart", "fusionPosition2DwithHeart");
		staticFunctionMapP_VECS_E.annotationMap.put("fusionPosition3DwithHeart", "fusionPosition3DwithHeart");
		staticFunctionMapP_VECS_E.annotationMap.put("getTSPIsolationGroups2D", "getTSPIsolationGroups2D");
		staticFunctionMapP_VECS_E.annotationMap.put("getTSPIsolationGroups3D", "getTSPIsolationGroups3D");
		staticFunctionMapP_VECS_E.annotationMap.put("getTSPForestIsolationGroups2D", "getTSPForestIsolationGroups2D");
		staticFunctionMapP_VECS_E.annotationMap.put("getTSPForestIsolationGroups3D", "getTSPForestIsolationGroups3D");
		staticFunctionMapP_VECS_E.annotationMap.put("trackTracePosition2DHeartsWithSingerGroup", "trackTracePosition2DHeartsWithSingerGroup");
		staticFunctionMapP_VECS_E.annotationMap.put("trackTracePosition3DHeartsWithSingerGroup", "trackTracePosition3DHeartsWithSingerGroup");
		staticFunctionMapP_VECS_E.annotationMap.put("trackTracePosition2DByHearts", "trackTracePosition2DByHearts");
		staticFunctionMapP_VECS_E.annotationMap.put("trackTracePosition3DByHearts", "trackTracePosition3DByHearts");
		staticFunctionMapP_VECS_E.annotationMap.put("trackTracePosition2DHeartsWithFissileGroups", "trackTracePosition2DHeartsWithFissileGroups");
		staticFunctionMapP_VECS_E.annotationMap.put("trackTracePosition3DHeartsWithFissileGroups", "trackTracePosition3DHeartsWithFissileGroups");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanDistanceFromPositions2D", "findMeanDistanceFromPositions2D");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanDistanceFromPositions3D", "findMeanDistanceFromPositions3D");
		staticFunctionMapP_VECS_E.annotationMap.put("findPascalMeanDistanceByEachPositions2D", "findPascalMeanDistanceByEachPositions2D");
		staticFunctionMapP_VECS_E.annotationMap.put("findPascalMeanDistanceByEachPositions3D", "findPascalMeanDistanceByEachPositions3D");
		staticFunctionMapP_VECS_E.annotationMap.put("getPosition2DsGroupPascalHearts", "getPosition2DsGroupPascalHearts");
		staticFunctionMapP_VECS_E.annotationMap.put("getPosition3DsGroupPascalHearts", "getPosition3DsGroupPascalHearts");
		staticFunctionMapP_VECS_E.annotationMap.put("getPosition2DsGroupPascalMids", "getPosition2DsGroupPascalMids");
	
		staticFunctionMapP_VECS_E.annotationMap.put("getPosition3DsGroupPascalMids", "getPosition3DsGroupPascalMids");
		staticFunctionMapP_VECS_E.annotationMap.put("getPosition2DsGroupPascalDirection", "getPosition2DsGroupPascalDirection");
		staticFunctionMapP_VECS_E.annotationMap.put("getPosition3DsGroupPascalDirection", "getPosition3DsGroupPascalDirection");
		staticFunctionMapP_VECS_E.annotationMap.put("getPosition3DsGroupPascalDirection", "getPosition3DsGroupPascalDirection");
		staticFunctionMapP_VECS_E.annotationMap.put("getPosition2DsGroupPascalDirection", "getPosition2DsGroupPascalDirection");
		staticFunctionMapP_VECS_E.annotationMap.put("getYaoguangLuo2DEulerRingTSP", "getYaoguangLuo2DEulerRingTSP");
		staticFunctionMapP_VECS_E.annotationMap.put("getYaoguangLuo3DEulerRingTSP", "getYaoguangLuo3DEulerRingTSP");
		staticFunctionMapP_VECS_E.annotationMap.put("getYaoguangLuo2DEulerRingTSP2D", "getYaoguangLuo2DEulerRingTSP2D");
		staticFunctionMapP_VECS_E.annotationMap.put("getYaoguangLuo3DEulerRingTSP2D", "getYaoguangLuo3DEulerRingTSP2D");
		staticFunctionMapP_VECS_E.annotationMap.put("getYaoguangLuo2DEulerRingTSP3D", "getYaoguangLuo2DEulerRingTSP3D");
		staticFunctionMapP_VECS_E.annotationMap.put("getYaoguangLuo3DEulerRingTSP3D", "getYaoguangLuo3DEulerRingTSP3D");
		
		staticFunctionMapP_VECS_E.annotationMap.put("getImagePix2DGroupFilter", "getImagePix2DGroupFilter");
		staticFunctionMapP_VECS_E.annotationMap.put("getImagePix3DGroupFilter", "getImagePix3DGroupFilter");
		staticFunctionMapP_VECS_E.annotationMap.put("NLPBestSentenceMatch", "NLPBestSentenceMatch");
		staticFunctionMapP_VECS_E.annotationMap.put("NLPBestSentencesMatch", "NLPBestSentencesMatch");
		staticFunctionMapP_VECS_E.annotationMap.put("getNLPBestSentencesMatchScore", "getNLPBestSentencesMatchScore");
		staticFunctionMapP_VECS_E.annotationMap.put("getNLPBestSentencesMatchScoreRights", "getNLPBestSentencesMatchScoreRights");
		staticFunctionMapP_VECS_E.annotationMap.put("getErrorAsserts", "getErrorAsserts");
		staticFunctionMapP_VECS_E.annotationMap.put("getBinaryErrorAsserts", "getBinaryErrorAsserts");
		staticFunctionMapP_VECS_E.annotationMap.put("findTotalIncrementWithScale", "findTotalIncrementWithScale");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanIncrementWithScale", "findMeanIncrementWithScale");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanOfFilterDoubleArrayWithScale", "findMeanOfFilterDoubleArrayWithScale");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanOfDoubleArray", "findMeanOfDoubleArray");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanOfTwoDoubleArray", "findMeanOfTwoDoubleArray");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanOfTwoDoubleArray2D", "findMeanOfTwoDoubleArray2D");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanOfDoubleMatrix2D", "findMeanOfDoubleMatrix2D");
		staticFunctionMapP_VECS_E.annotationMap.put("findRowMeanOfDoubleMatrix2D", "findRowMeanOfDoubleMatrix2D");
		staticFunctionMapP_VECS_E.annotationMap.put("findCulumnMeanOfDoubleMatrix2D", "findCulumnMeanOfDoubleMatrix2D");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanOfDoubleMatrix3D", "findMeanOfDoubleMatrix3D");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanOfDoubleList", "findMeanOfDoubleList");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanOfMartrix1DList", "findMeanOfMartrix1DList");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanOfMartrix2DList", "findMeanOfMartrix2DList");
		staticFunctionMapP_VECS_E.annotationMap.put("findSumOfDoubleArray", "findSumOfDoubleArray");	
		staticFunctionMapP_VECS_E.annotationMap.put("findSumOfTwoDoubleArray", "findSumOfTwoDoubleArray");
		staticFunctionMapP_VECS_E.annotationMap.put("findSumOfTwoDoubleArray2D", "findSumOfTwoDoubleArray2D");
		
	 
		staticFunctionMapP_VECS_E.annotationMap.put("findSumOfDoubleMatrix2D", "findSumOfDoubleMatrix2D");
		staticFunctionMapP_VECS_E.annotationMap.put("findRowSumOfDoubleMatrix2D", "findRowSumOfDoubleMatrix2D");
		staticFunctionMapP_VECS_E.annotationMap.put("findCulumnSumOfDoubleMatrix2D", "findCulumnSumOfDoubleMatrix2D");
		staticFunctionMapP_VECS_E.annotationMap.put("findSumOfDoubleMatrix3D", "findSumOfDoubleMatrix3D");
		staticFunctionMapP_VECS_E.annotationMap.put("findSumOfDoubleList", "findSumOfDoubleList");
		staticFunctionMapP_VECS_E.annotationMap.put("findSumOfMartrix1DList", "findSumOfMartrix1DList");
		staticFunctionMapP_VECS_E.annotationMap.put("findSumOfMartrix2DList", "findSumOfMartrix2DList");
		staticFunctionMapP_VECS_E.annotationMap.put("getShareholdCount", "getShareholdCount");
		staticFunctionMapP_VECS_E.annotationMap.put("encodeEstimateSumOfScoresList", "encodeEstimateSumOfScoresList");
		staticFunctionMapP_VECS_E.annotationMap.put("encodeEstimateSumOfScoresArray", "encodeEstimateSumOfScoresArray");
		staticFunctionMapP_VECS_E.annotationMap.put("getEstimateCartesianSumOfScoresArray", "getEstimateCartesianSumOfScoresArray");
		staticFunctionMapP_VECS_E.annotationMap.put("getEstimateCartesian1DSumOfScoresArray", "getEstimateCartesian1DSumOfScoresArray");
		staticFunctionMapP_VECS_E.annotationMap.put("encodeEstimateInitonsScore", "encodeEstimateInitonsScore");
		
		staticFunctionMapP_VECS_E.annotationMap.put("decodeEstimateInitonsScore", "decodeEstimateInitonsScore");
		staticFunctionMapP_VECS_E.annotationMap.put("getRightsEstimateScore", "getRightsEstimateScore");
		staticFunctionMapP_VECS_E.annotationMap.put("getSimilarFuzzSetWithScale", "getSimilarFuzzSetWithScale");
		staticFunctionMapP_VECS_E.annotationMap.put("getDistanceRatio2D", "getDistanceRatio2D");
		staticFunctionMapP_VECS_E.annotationMap.put("getARCDistanceRatio2D", "getARCDistanceRatio2D");
		staticFunctionMapP_VECS_E.annotationMap.put("getTrueARCDistanceRatio2D", "getTrueARCDistanceRatio2D");
		staticFunctionMapP_VECS_E.annotationMap.put("getDistanceRatio3D", "getDistanceRatio3D");
		staticFunctionMapP_VECS_E.annotationMap.put("getTrueARCDistanceRatio3D", "getTrueARCDistanceRatio3D");
		staticFunctionMapP_VECS_E.annotationMap.put("getPercentListByOuterKey", "getPercentListByOuterKey");
		staticFunctionMapP_VECS_E.annotationMap.put("kernel", "kernel");
		staticFunctionMapP_VECS_E.annotationMap.put("kernelFix", "kernelFix");
		staticFunctionMapP_VECS_E.annotationMap.put("findTotalIncrementRatioWithScale", "findTotalIncrementRatioWithScale");
		staticFunctionMapP_VECS_E.annotationMap.put("findMeanIncrementRatioWithScale", "findMeanIncrementRatioWithScale");
		staticFunctionMapP_VECS_E.annotationMap.put("frequencyUpSplit", "frequencyUpSplit");
		staticFunctionMapP_VECS_E.annotationMap.put("frequencyDownSplit", "frequencyDownSplit");
		staticFunctionMapP_VECS_E.annotationMap.put("frequencyUpSplitWithScale", "frequencyUpSplitWithScale");
		staticFunctionMapP_VECS_E.annotationMap.put("frequencyDownSplitWithScale", "frequencyDownSplitWithScale");

	

		staticFunctionMapP_VECS_E.annotationMap.put("predictionResult", "predictionResult");
		staticFunctionMapP_VECS_E.annotationMap.put("predictionMatrixResult", "predictionMatrixResult");
		staticFunctionMapP_VECS_E.annotationMap.put("getImagePixClassificationMap", "getImagePixClassificationMap");
		staticFunctionMapP_VECS_E.annotationMap.put("getVWaveFromImagePix", "getVWaveFromImagePix");
		staticFunctionMapP_VECS_E.annotationMap.put("getHWaveFromImagePix", "getHWaveFromImagePix");
		staticFunctionMapP_VECS_E.annotationMap.put("getPixPercentByDeterPix", "getPixPercentByDeterPix");
		staticFunctionMapP_VECS_E.annotationMap.put("getClusterPercentByDeterPixGroup", "getClusterPercentByDeterPixGroup");
		staticFunctionMapP_VECS_E.annotationMap.put("getPixPercentByDeterPixGroup", "getPixPercentByDeterPixGroup");
		staticFunctionMapP_VECS_E.annotationMap.put("filterFusion2DSetsWithCountScale", "filterFusion2DSetsWithCountScale");
		staticFunctionMapP_VECS_E.annotationMap.put("filterFusion3DSetsWithCountScale", "filterFusion3DSetsWithCountScale");
		staticFunctionMapP_VECS_E.annotationMap.put("filterPosition2DsWithScaledDistance", "filterPosition2DsWithScaledDistance");
		staticFunctionMapP_VECS_E.annotationMap.put("filterPosition3DsWithScaledDistance", "filterPosition3DsWithScaledDistance");
		staticFunctionMapP_VECS_E.annotationMap.put("filterPosition2DsWithScaledDistance", "filterPosition2DsWithScaledDistance");
		staticFunctionMapP_VECS_E.annotationMap.put("filterPosition3DsWithScaledDistance", "filterPosition3DsWithScaledDistance");
		staticFunctionMapP_VECS_E.annotationMap.put("getPercentListByOuterKey", "getPercentListByOuterKey");
		staticFunctionMapP_VECS_E.annotationMap.put("getPercentArrayByOuterKey", "getPercentArrayByOuterKey");
		staticFunctionMapP_VECS_E.annotationMap.put("getEachPercentSetOfArray", "getEachPercentSetOfArray");
		staticFunctionMapP_VECS_E.annotationMap.put("getPercentArrayByOuterKey", "getPercentArrayByOuterKey");
	}	


	//public static  ����Ԥ��static ȫ��ͳ����

	//	������
	//	������ŷ����� ��������λ�Ʊ���㷨 20191216 ������
	//	������ŷ����� ���������㷨 20191216 ������
	//	�����˻���2ά���������伫б��̽�������״��㷨����ȡ��Ե�� �ȳ��� ��ԵС�߶μ����ݶȼ����600���� 20191216 ������
	//	�����˻���3ά���������伫б��̽�������״��㷨����ȡ��Ե�� �ȳ��� ��ԵС�߶μ����ݶȼ����600���� 20191218 ������
	//	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/cluster/SideEnd.java
	//
	public List<AMV_MVS_VSQ_2D> getSideEnd2D(List<AMV_MVS_VSQ_2D> list, double scale);
	public List<AMV_MVS_VSQ_3D> getSideEnd3D(List<AMV_MVS_VSQ_3D> list, double scale);


	//	�����˼�����ŷ����¶�̬����ط����㷨 20191217 ������
	//	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/classification/PositionClasification.java
	//
	public Map<Double, List<AMV_MVS_VSQ_2D>> addNewPositionWithoutHeart(Map<Double, List<AMV_MVS_VSQ_2D>> groups
			, AMV_MVS_VSQ_2D position2D, double scaleDistance);
	public Map<Double, List<AMV_MVS_VSQ_2D>> addNewPositionWithHeart(Map<Double, List<AMV_MVS_VSQ_2D>> groups
			, AMV_MVS_VSQ_2D position2D, Map<Double, AMV_MVS_VSQ_2D> hearts, double scaleDistance);

	//position

	public List<AMV_MVS_VSQ_2D> getShortestSamplePosition2DGroup(AMV_MVS_VSQ_2D inputHeart
			, Map<Double, List<AMV_MVS_VSQ_2D>> groups);
	public Map<Double, List<AMV_MVS_VSQ_2D>> getShorterSamplePosition2DGroupsWithScale(AMV_MVS_VSQ_2D inputHeart
			, Map<Double, List<AMV_MVS_VSQ_2D>> groups, double scale);
	public List<AMV_MVS_VSQ_3D> getShortestSamplePosition3DGroup(AMV_MVS_VSQ_3D inputHeart, Map<Double, List<AMV_MVS_VSQ_3D>> groups);
	public Map<Double, List<AMV_MVS_VSQ_3D>> getShortestSamplePosition3DGroupsWithScale(AMV_MVS_VSQ_3D inputHeart
			, Map<Double, List<AMV_MVS_VSQ_3D>> groups, double scale);

	//	�����˴����� ŷ����� 2ά������ �����㷨 20191219 ������
	//	�����˴����� ŷ����� 2ά���꼯 ������ �ھ��㷨 20191219 ������
	//	�����˴����� ŷ����� 3ά������ �����㷨 20191219 ������
	//	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/classification/Fissile.java
	//
	public Map<Double, List<AMV_MVS_VSQ_2D>> fissilePosition2D(List<AMV_MVS_VSQ_2D> groups, double scale);
	public Map<Double, List<AMV_MVS_VSQ_3D>> fissilePosition3D(List<AMV_MVS_VSQ_3D> groups, double scale);

	//	�����˴����� ŷ����� 3ά���꼯 ������ �ھ��㷨 20191219 ������
	//	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/cluster/Fusion.java
	//
	public Map<Double, List<AMV_MVS_VSQ_2D>> fusionPosition2DwithHeart(Map<Double, List<AMV_MVS_VSQ_2D>> groups
			, Map<Double, AMV_MVS_VSQ_2D> groupsHeart, double scale);
	public Map<Double, List<AMV_MVS_VSQ_3D>> fusionPosition3DwithHeart(Map<Double, List<AMV_MVS_VSQ_3D>> groups
			, Map<Double, AMV_MVS_VSQ_3D> groupsHeart, double scale);

	//	�����˴����� 2ά (��ŷ��Ȩ��)����·���Ŵ� ���� �㷨 20191220 ������
	//	�����˴����� 3ά (��ŷ��Ȩ��)����·���Ŵ� ���� �㷨 20191220 ������
	//	https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/isolation/Isolation.java
	//
	public Map<Double, List<AMV_MVS_VSQ_2D>> getTSPIsolationGroups2D(List<AMV_MVS_VSQ_2D> groups, double scale);
	public Map<Double, List<AMV_MVS_VSQ_3D>> getTSPIsolationGroups3D(List<AMV_MVS_VSQ_3D> groups, double scale);

	//	�����˴����� 2ά ����·���Ŵ� ɭ�ֵ�Ԫ ���� �㷨 20191220 ������
	//	�����˴����� 3ά ����·���Ŵ� ɭ�ֵ�Ԫ ���� �㷨 20191220 ������
	//	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/isolation/ForestIsolation.java
	//
	public Map<Double, List<AMV_MVS_VSQ_2D>> getTSPForestIsolationGroups2D(List<AMV_MVS_VSQ_2D> groups, double scale);
	public Map<Double, List<AMV_MVS_VSQ_3D>> getTSPForestIsolationGroups3D(List<AMV_MVS_VSQ_3D> groups, double scale);

	//	���� 2ά ���꼯 ���� ���� �켣 �����㷨 20191221 ������
	//	���� 3ά ���꼯 ���� ���� �켣 �����㷨 20191221 ������
	//	https://gitee.com/DetaChina/Data_Prediction/tree/master/src/org/tinos/deta/trace
	//
	public List<AMV_MVS_VSQ_2D> trackTracePosition2DHeartsWithSingerGroup(List<AMV_MVS_VSQ_2D> coods);
	public List<AMV_MVS_VSQ_3D> trackTracePosition3DHeartsWithSingerGroup(List<AMV_MVS_VSQ_3D> coods);
	public List<AMV_MVS_VSQ_2D> trackTracePosition2DByHearts(List<AMV_MVS_VSQ_2D> hearts);
	public List<AMV_MVS_VSQ_3D> trackTracePosition3DByHearts(List<AMV_MVS_VSQ_3D> hearts);
	public Map<Double, List<AMV_MVS_VSQ_2D>> trackTracePosition2DHeartsWithFissileGroups(List<AMV_MVS_VSQ_2D> coods, double distanceScale);
	public Map<Double, List<AMV_MVS_VSQ_3D>> trackTracePosition3DHeartsWithFissileGroups(List<AMV_MVS_VSQ_3D> coods, double distanceScale);

	//	�������� 2ά �������Ĺ켣�����㷨 20191221 ������
	//	�������� 3ά �������Ĺ켣�����㷨 20191221 ������
	//	���� 2ά ������ƥ�������������������㷨 20191223 ������
	//	���� 3ά ������ƥ�������������������㷨 20191223 ������
	//	���� 2ά���ڴ����� ��� ����λ�� ·�����꼯�Ų��� �㷨 20191223 ������
	//	���� 3ά���ڴ����� ��� ����λ�� ·�����꼯�Ų��� �㷨 20191223 ������
	//	������2ά���Ⱦ����� ���꼯 ɸѡ�㷨�� 20191223 ������
	//	������3ά���Ⱦ����� ���꼯 ɸѡ�㷨�� 20191223 ������
	//	������ С�����ľ��뾫���� 2ά�����ż���ɸѡ �㷨 20191223 ������
	//	������ С�����ľ��뾫���� 3ά�����ż���ɸѡ �㷨 20191223 ������
	//	������ 2ά �ھ��� ���������㷨 20191224 ������
	//	������ 3ά �ھ��� ���������㷨 20191224 ������
	//	������ 2ά ���� �Ӽ������� �ھ��� ɸѡ�㷨 20191224 ������
	//	������ 3ά ���� �Ӽ������� �ھ��� ɸѡ�㷨 20191224 ������
	//	������ 2ά �����ŵĴ����ȼ��� ��Ҫ��Ч����ɷݼ���ƽ��ѹǿ�㷨 20191225 ������
	//	������ 3ά �����ŵĴ����ȼ��� ��Ҫ��Ч����ɷݼ���ƽ��ѹǿ�㷨 20191225 ������
	//	https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/PCA/FindPCAMeanDistance.java
	//
	public double findMeanDistanceFromPositions2D(List<AMV_MVS_VSQ_2D> position2Ds, double oberserverPCAScale, int sortRangeScale);
	public double findMeanDistanceFromPositions3D(List<AMV_MVS_VSQ_3D> position3Ds, double oberserverPCAScale, int sortRangeScale);

	//	������ 2ά �������� ÿһ�������뾫�����ڽ����꼯����С����ƽ��ֵ���� ����ƽ��ֵ�� ��ȡ�Ĳ��ȶ�״̬�۲�/Ԥ�⣨���������ԣ��㷨�� 20191225 ������
	//	������ 3ά �������� ÿһ�������뾫�����ڽ����꼯����С����ƽ��ֵ���� ����ƽ��ֵ�� ��ȡ�Ĳ��ȶ�״̬�۲�/Ԥ�⣨���������ԣ��㷨�� 20191225 ������
	//	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/PCA/FindPCAMeanDistance.java
	//
	public double[] findPascalMeanDistanceByEachPositions2D(List<AMV_MVS_VSQ_2D> position2Ds, double oberserverPCAScale, int sortRangeScale);
	public double[] findPascalMeanDistanceByEachPositions3D(List<AMV_MVS_VSQ_3D> position3Ds, double oberserverPCAScale, int sortRangeScale);

	//	������ 2ά ���꼯�ļ���۲��Ż����� �� �۲��Ȳ� ��ֵ 20191225 ������
	//	������ 3ά ���꼯�ļ���۲��Ż����� �� �۲��Ȳ� ��ֵ 20191225 ������
	//	������ 2ά ���꼯�����˶�����Ԥ���㷨 20191226 ������
	//	������ 3ά ���꼯�����˶�����Ԥ���㷨 20191226 ������
	//	������ 2��3 �������ż������ĺ����ļ� �㷨 �����˾ֲ���֪�Ż� 20191226 ������
	//	������ 2��3ά ͨ�������ŵ� ����ƥ��ָ���ڲ���������� ���� ÿ�������ŵ� ���ĺ����ľ��� ��� ��ȡ��Ч�����ȶ��۲�����ģ�� 20191227 ������
	//	https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/PCA/FindPositionsGroupPascalHearts.java
	//
	public Map<Double, AMV_MVS_VSQ_2D> getPosition2DsGroupPascalHearts(ArrayList<AMV_MVS_VSQ_2D> groups, double scale);
	public Map<Double, AMV_MVS_VSQ_3D> getPosition3DsGroupPascalHearts(ArrayList<AMV_MVS_VSQ_3D> groups, double scale) ;
	public Map<Double, AMV_MVS_VSQ_2D> getPosition2DsGroupPascalMids(ArrayList<AMV_MVS_VSQ_2D> groups, double scale);
	public Map<Double, AMV_MVS_VSQ_3D> getPosition3DsGroupPascalMids(ArrayList<AMV_MVS_VSQ_3D> groups, double scale);

	public Map<Double, Line2D> getPosition2DsGroupPascalDirection(Map<Double, AMV_MVS_VSQ_2D> pascalHearts, Map<Double, AMV_MVS_VSQ_2D> pascalMids);
	public Map<Double, Line3D> getPosition3DsGroupPascalDirection(Map<Double, AMV_MVS_VSQ_3D> pascalHearts, Map<Double, AMV_MVS_VSQ_3D> pascalMids);
	public Map<Double, Line3D> getPosition3DsGroupPascalDirection(ArrayList<AMV_MVS_VSQ_3D> groups, double scale);
	public Map<Double, Line2D> getPosition2DsGroupPascalDirection(ArrayList<AMV_MVS_VSQ_2D> groups, double scale);

	//	������ 2��3ά �ٽ�2�������ŵ��໥�����ȵ��㷨��ģ�۲⣬С��1 ����������1 �ų⡣ 20191227 ������
	//	������ 2��3ά ֧�ָߴ�1������ �� ����ŷ��΢�ֻ�· ����·������ �� TSP�㷨 1�� 20200112 ������
	//	������ 2��3ά ֧�ָߴ�1������ �� ����ŷ��΢�ֻ�· ����·������ �� TSP�㷨 2,3�� 20200317 ������
	//	https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/tsp/YaoguangLuoEulerRingTSP2D.java 
	//	https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/tsp/YaoguangLuoEulerRingTSP3D.java
	public List<Line2D> getYaoguangLuo2DEulerRingTSP(List<AMV_MVS_VSQ_2D> AMV_MVS_VSQs);
	public List<Line3D> getYaoguangLuo3DEulerRingTSP(List<AMV_MVS_VSQ_3D> AMV_MVS_VSQs);

	public List<Line2D> getYaoguangLuo2DEulerRingTSP2D(List<AMV_MVS_VSQ_2D> AMV_MVS_VSQs);
	public List<Line3D> getYaoguangLuo3DEulerRingTSP2D(List<AMV_MVS_VSQ_3D> AMV_MVS_VSQs);

	public List<Line2D> getYaoguangLuo2DEulerRingTSP3D(List<AMV_MVS_VSQ_2D> positions, int sortRangeScale, int sortDeepsScale);
	public List<Line3D> getYaoguangLuo3DEulerRingTSP3D(List<AMV_MVS_VSQ_3D> positions, int sortRangeScale, int sortDeepsScale);
	//
	//	������ 2��3ά ������������Ĺ켣����������꼯�ķ��ݺ����� 20200414 ������
	//	������
	//	�����˱�Ҷ˹���������������ƶ�ƥ���㷨 20191217 ������
	//	�����˱�Ҷ˹��������У�������㷨 20191217 ������
	//	����findMean �������� ���� findSumOfDoubleMatrix3D ���� 20191222 ������
	//	������������ ���� 20191223 ������
	//	���� ģ�����ʼ����Ƴɷݲ�����20191223 ������
	//	���� ��������Ч���ʼ��ϲ�����20191223 ������
	//	������ ���Ƹ��ʼ� ��Ч�ɷݹ��� ��PCA ��ֵ�����㷨 20191223 ������
	//	������ ��������󣬶������С���Ȱٷֱ���ֵ���˺�� �м���Ҫ��Ч�ɷ� �� mean ����㷨�� 20191226 ������
	//	������ ��ָ��������ͼƬ�е�����ռ���㷨�� 20200301 ������
	//	������ ����Fissile����ִ�����Ѻ����ͬ������ ����ɸѡ���� �� ������еĴ�����ռ���㷨�� 20200301 ������
	//	������ ����Fissile����ִ�����Ѻ����ͬ������ ����ɸѡ���� �� ������е�����ռ������㷨�� 20200301 ������
	//	������
	//	���� ���о������ ���Ժ�2��ƥ�� ����ȡ�����Ƿ����ںϸ�״̬�㷨 20191228 ������
	//	���� ����2ά��3ά�����ؾ�����2�ּ�ֵ���� ������ map����ת���۲� �㷨 20190229 ������
	//	���� ��shareholder�ֲ㴦���ͼƬ�������� ��ָ���ľ��ȺͶ�Ӧ���ؽ��а������ŵĴ�С�����ض������㷨 20190302 ������
	//	https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/image/ImagePixGroupFilter.java
	//
	public int[][] getImagePix2DGroupFilter(int[][] inputPixMatrix, int RBG, int distanceScale,int max, int min);
	public int[][][] getImagePix3DGroupFilter(int[][][] inputPixMatrix, int RBG, int distanceScale,int max, int min);


	//	���� �����ؾ���ָ����RBG��ɫֵ�ó����γɲ�����������㷨 20190303 ������
	//	���� 2��3ά ������ �����з���Ч�ɷ�ɸѡ�����㷨 20190303 ������
	//	NLP
	//	NLP Algorithm of Matching The POS Scored Sentence 20191228 Yaoguang. Luo
	//	NLP Algorithm of Matching The POS Scored Sentences 20191229 Yaoguang. Luo
	//	https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/NLP/NLPTopicMatch.java
	//	
	public String NLPBestSentenceMatch(String searchString, String[] sampleSentences) throws IOException ;

	//<<NLP Algorithm of Matching The POS Scored Sentences>>.
	//This prediction algorithm mostly used for matching the ranged sample sentences by using score method.  
	//Theory: Yaoguang.Luo 20191229
	//Application: Yaoguang.Luo
	//Attention: need Deta Parser API OSS 
	//sortStackRange: for the sort stacks filter scale
	//filterRate: for how many sets need to delete 
	public List<String> NLPBestSentencesMatch(String searchString, String[] sampleSentences, int sortStackRange, double filterRate) throws IOException ;
	public double[] getNLPBestSentencesMatchScore(String searchString, String[] sampleSentences) throws IOException;
	public double[] getNLPBestSentencesMatchScoreRights(String searchString, String[] sampleSentences, A _A, Map<String, String> nlp
			, Map<String, WordFrequency> keyMap) throws IOException;

	//����������ڽ��о������ƥ�� ��ȡ�����Ƿ����ںϸ�״̬��
	public boolean getErrorAsserts(double inputValue, double[] matchValues, double scale);	
	public boolean getBinaryErrorAsserts(double inputValue, double[] matchValues, double scale, int sortStackRange, boolean isSort);


	//ͳ��
	public double findTotalIncrementWithScale(double value, double times, double scale);
	public double findMeanIncrementWithScale(double value, double times, double scale);
	//ƽ��
	public double findMeanOfFilterDoubleArrayWithScale(double[] input, double filterScale, int sortRangeScale);
	public double findMeanOfDoubleArray(double[] input);
	public Double[] findMeanOfTwoDoubleArray(Double[] origin, Double[] input);
	public Double[][] findMeanOfTwoDoubleArray2D(Double[][] origin, Double[][] input);
	public double findMeanOfDoubleMatrix2D(double[][] input);
	public double[] findRowMeanOfDoubleMatrix2D(double[][] input);
	public double[] findCulumnMeanOfDoubleMatrix2D(double[][] input);
	public double findMeanOfDoubleMatrix3D(double[][][] input);
	public double findMeanOfDoubleList(List<Double> input);
	public Double[] findMeanOfMartrix1DList(List<Double[]> input);
	public Double[][] findMeanOfMartrix2DList(List<Double[][]> input);
	//���
	public double findSumOfDoubleArray(double[] input);
	public Double[] findSumOfTwoDoubleArray(Double[] origin, Double[] input);
	public Double[][] findSumOfTwoDoubleArray2D(Double[][] origin, Double[][] input);
	public double findSumOfDoubleMatrix2D(double[][] input);
	public double[] findRowSumOfDoubleMatrix2D(double[][] input) ;
	public double[] findCulumnSumOfDoubleMatrix2D(double[][] input);
	public double findSumOfDoubleMatrix3D(double[][][] input);
	public double findSumOfDoubleList(List<Double> input);
	public Double[] findSumOfMartrix1DList(List<Double[]> input);
	public Double[][] findSumOfMartrix2DList(List<Double[][]> input);
	//����
	public double getShareholdCount(int[][] input, int sharehold);
	//����
	public boolean encodeEstimateSumOfScoresList(List<Double> scores, double estimateValue) ;
	public boolean encodeEstimateSumOfScoresArray(double[] scores, double estimateValue) ;
	public boolean getEstimateCartesianSumOfScoresArray(double input, double[] EstimateRatios, double estimateValue);
	public boolean getEstimateCartesian1DSumOfScoresArray(double[] inputs, double[] EstimateRatios, double estimateValue);
	public boolean[] encodeEstimateInitonsScore(double[] input, double[] estimateRatios, double estimateValue[]);
	public boolean[] decodeEstimateInitonsScore(double input, double[] estimateRatios, double estimateValue[]);
	public double[] getRightsEstimateScore(double[] inputs, double[] rights);

	//�������������ģ�����ʼ�ƽ��ֵ������Ҫ�ɷݷ���
	public RatioMatrix getSimilarFuzzSetWithScale(RatioMatrix input, List<RatioMatrix> groups, double scale);
	public RatioMatrix getSimilarFuzzSet(RatioMatrix input, List<RatioMatrix> groups);
	public List<RatioMatrix> getSimilarFuzzSetListWithScale(RatioMatrix input, List<RatioMatrix> groups, double scale);


	//ratio
	public double getDistanceRatio2D(AMV_MVS_VSQ_2D begin, AMV_MVS_VSQ_2D end) ;
	//���ͼ����ٶ�����ȡ��׼ȷб���ݶ� (���ڸ���Ҷ˼��)
	public double getARCDistanceRatio2D(AMV_MVS_VSQ_2D begin, AMV_MVS_VSQ_2D end) ;
	//���ͼ����ٶ�����ȡ������ߵ���ʵ�Ƕ� 
	public double getTrueARCDistanceRatio2D(AMV_MVS_VSQ_2D begin, AMV_MVS_VSQ_2D end) ;
	//��ȡ��������ݶ�
	public double getDistanceRatio3D(AMV_MVS_VSQ_3D begin, AMV_MVS_VSQ_3D end);
	//��ȡ��ʵ��ά�н�
	public double getTrueARCDistanceRatio3D(AMV_MVS_VSQ_3D begin, AMV_MVS_VSQ_3D end) ;
	public List<Double> getPercentListByOuterKey(Double[] array);
	public void kernel(List<Double> output, Double[] array, int j);
	public void kernelFix(List<Double> output, Double[] array, int j);

	public double findTotalIncrementRatioWithScale(double value, double times, double scale);
	public double findMeanIncrementRatioWithScale(double value, double times, double scale);


	//�Ƚϼ򵥵ļ�β��Ƶ��ä�ָ�
	public double[] frequencyUpSplit(double[] originFrequency, double[] compareFrequency);
	public double[] frequencyDownSplit(double[] originFrequency, double[] compareFrequency);
	public double[] frequencyUpSplitWithScale(double[] originFrequency, double[] compareFrequency, double scale);
	public double[] frequencyDownSplitWithScale(double[] originFrequency, double[] compareFrequency, double scale);

	public boolean predictionResult(RatioMatrix input, List<RatioMatrix> groups, double scale);
	public String predictionMatrixResult(RatioMatrix input, Map<String, RatioMatrix> groups, double scale);

	//image
	//˼�룺ͳ���������
	//���ߣ�������
	//��shareholder�ֲ㴦���ͼƬ�������ݽ��� �������ͳ�����
	public Map<Integer, ArrayList<AMV_MVS_VSQ_2D>> getImagePixClassificationMap(int[][] pixMap);
	public Map<Integer, ArrayList<AMV_MVS_VSQ_3D>> getImagePixClassificationMap(int[][][] pixMap);
	public int[] getVWaveFromImagePix(int[][] pixMap, int RGB);
	public int[] getHWaveFromImagePix(int[][] pixMap, int RGB);
	public double getPixPercentByDeterPix(int[][] imagePix, int scaleRBG);
	//�����������Fissile����ִ�����Ѻ����ͬ������ ����ɸѡ���� �� ������еĴ�����ռ�ȡ�
	public double getClusterPercentByDeterPixGroup(Map<Double, List<AMV_MVS_VSQ_2D>> imagePix, int scaleSUM);
	//�����������Fissile����ִ�����Ѻ����ͬ������ ����ɸѡ���� �� ������е�����ռ�ȡ�
	public double getPixPercentByDeterPixGroup(Map<Double, List<AMV_MVS_VSQ_2D>> imagePix, int scaleSUM);
	

	//FusionPCAFilter{
	public Map<Double, List<AMV_MVS_VSQ_2D>> filterFusion2DSetsWithCountScale
	(Map<Double, List<AMV_MVS_VSQ_2D>> groups, double countScale);
	public Map<Double, List<AMV_MVS_VSQ_3D>> filterFusion3DSetsWithCountScale
	(Map<Double, List<AMV_MVS_VSQ_3D>> groups, double countScale);

	//PCA_AMV_MVS_VSQ_Filter
	public List<AMV_MVS_VSQ_2D> filterPosition2DsWithScaledDistance(List<AMV_MVS_VSQ_2D> input
			, AMV_MVS_VSQ_2D heart, double scaleDistacne);
	public List<AMV_MVS_VSQ_3D> filterPosition3DsWithScaledDistance(List<AMV_MVS_VSQ_3D> input
			, AMV_MVS_VSQ_3D heart, double scaleDistacne);
	public Map<Double, List<AMV_MVS_VSQ_2D>> filterPosition2DsWithScaledDistance(Map<Double
			, List<AMV_MVS_VSQ_2D>> input, AMV_MVS_VSQ_2D heart, double scaleDistacne);
	public Map<Double, List<AMV_MVS_VSQ_3D>> filterPosition3DsWithScaledDistance(Map<Double
			, List<AMV_MVS_VSQ_3D>> input, AMV_MVS_VSQ_3D heart, double scaleDistacne);

	//Percentage{
	public List<Double> getPercentListByOuterKey(List<Double> list, double key);
	public double[] getPercentArrayByOuterKey(double[] array, double key);
	public double[] getEachPercentSetOfArray(double[] array);
	public double[][] getPercentArrayByOuterKey(double[][] array, double key);
	public double[][] getEachPercentSetOfArray(double[][] array);

}
