package SEM.bloom;

import java.awt.HeadlessException;
import java.io.IOException;
import java.util.Map;

import IMO.EVU.bi_P.BigWord;
import IMO.EVU.bi_P.Classify;
import IMO.EVU.bi_P.CoAuthor;
import IMO.EVU.bi_P.CoAuthorForWord;
import IMO.EVU.bi_P.CoDNAAuthorForWord;
import IMO.EVU.bi_P.Histogram;
import IMO.EVU.bi_P.LineMed;
import IMS.EUQ.SP.LYGFileIO;
import IMS.EUQ.SP.Recoder;
import IMS.EUQ.recoder.Jpv;
import IMS.EUQ.recoder.VoicejPanel;
import ME.APM.VSQ.App;
import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
//����Ȩ��+ ����= ������
public interface StaticFunctionMapI_AOPM_C {
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapI_AOPM_E staticFunctionMapI_AOPM_C, Map<String, Object> output) throws IOException, HeadlessException, InterruptedException {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("getBigWord")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getBigWord();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getClassify")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getClassify();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getCoAuthor")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getCoAuthor((Map<String, Object>)inputValues.get(��������[����++])
						, (CogsBinaryForest_AE)inputValues.get(��������[����++]), (Map<String, String>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getCoAuthorForWord")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getCoAuthorForWord((App)inputValues.get(��������[����++])
						, (CogsBinaryForest_AE)inputValues.get(��������[����++]), (Map<String, String>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getCoDNAAuthorForWord")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getCoDNAAuthorForWord((App)inputValues.get(��������[����++])
						, (A)inputValues.get(��������[����++]), (Map<String, String>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getHistogram")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getHistogram();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getLineMed")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getLineMed();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getJpv")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getJpv();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("getRecoder")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getRecoder();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("getVoicejPanel")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getVoicejPanel();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("getLYGFileIO")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getLYGFileIO();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	
	public static void load(StaticFunctionMapI_AOPM_E staticFunctionMapI_AOPM_E) {
		// TODO Auto-generated method stub
		//�Ժ��װ
		staticFunctionMapI_AOPM_E.annotationMap.put("getBigWord", "getBigWord");
		staticFunctionMapI_AOPM_E.annotationMap.put("getClassify", "getClassify");
		staticFunctionMapI_AOPM_E.annotationMap.put("getCoAuthor", "getCoAuthor");
		staticFunctionMapI_AOPM_E.annotationMap.put("getCoAuthorForWord", "getCoAuthorForWord");
		staticFunctionMapI_AOPM_E.annotationMap.put("getCoDNAAuthorForWord", "getCoDNAAuthorForWord");
		staticFunctionMapI_AOPM_E.annotationMap.put("getHistogram", "getHistogram");
		staticFunctionMapI_AOPM_E.annotationMap.put("getLineMed", "getLineMed");
		staticFunctionMapI_AOPM_E.annotationMap.put("getJpv", "getJpv");
		staticFunctionMapI_AOPM_E.annotationMap.put("getRecoder", "getRecoder");
		staticFunctionMapI_AOPM_E.annotationMap.put("getVoicejPanel", "getVoicejPanel");
		staticFunctionMapI_AOPM_E.annotationMap.put("getLYGFileIO", "getLYGFileIO");
	}
	//�����Ժ�
	public BigWord getBigWord() ;
	public Classify getClassify() ;
	public CoAuthor getCoAuthor(Map<String, Object> dic_li, CogsBinaryForest_AE _A
			, Map<String, String> pos);
	public CoAuthorForWord getCoAuthorForWord(App u, CogsBinaryForest_AE _A
			, Map<String, String> pos) throws HeadlessException, InterruptedException ;
	public CoDNAAuthorForWord getCoDNAAuthorForWord(App u, A _A, Map<String, String> pos) throws HeadlessException
	, InterruptedException ;
	public Histogram getHistogram() ;
	public LineMed getLineMed() ;
	public Jpv getJpv() ;
	public Recoder getRecoder();
	public VoicejPanel getVoicejPanel();
	public LYGFileIO getLYGFileIO();
	//������ ˽�˲������о�
}
