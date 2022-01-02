package SEM.bloom;

import java.awt.HeadlessException;
import java.io.IOException;
import java.util.HashMap;
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
//著作权人+ 作者= 罗瑶光
public interface StaticFunctionMapI_AOPM_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapI_AOPM_E staticFunctionMapI_AOPM_C
			, Map<String, Object> output) throws IOException, HeadlessException, InterruptedException {
		String[] 传参因子= (String[]) output.get("传参因子");
		int 因子= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("getBigWord")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getBigWord();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getClassify")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getClassify();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getCoAuthor")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getCoAuthor((Map<String, Object>)inputValues.get(传参因子[因子++])
						, (CogsBinaryForest_AE)inputValues.get(传参因子[因子++])
						, (Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getCoAuthorForWord")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getCoAuthorForWord((App)inputValues.get(传参因子[因子++])
						, (CogsBinaryForest_AE)inputValues.get(传参因子[因子++])
						, (Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getCoDNAAuthorForWord")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getCoDNAAuthorForWord((App)inputValues.get(传参因子[因子++])
						, (A)inputValues.get(传参因子[因子++]), (Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getHistogram")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getHistogram();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getLineMed")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getLineMed();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getJpv")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getJpv();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("getRecoder")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getRecoder();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("getVoicejPanel")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getVoicejPanel();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("getLYGFileIO")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_AOPM_C.getLYGFileIO();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	
	public static void load(StaticFunctionMapI_AOPM_E staticFunctionMapI_AOPM_E) {
		// TODO Auto-generated method stub
		//稍后封装
		StaticFunctionMapI_AOPM_C.annotationMap.put("getBigWord", "void");
		StaticFunctionMapI_AOPM_C.annotationMap.put("getClassify", "void");
		StaticFunctionMapI_AOPM_C.annotationMap.put("getCoAuthor", "dic_li:_A:pos");
		StaticFunctionMapI_AOPM_C.annotationMap.put("getCoAuthorForWord", "u:_A:pos");//稍后优化传参变量名的 传参因子格式。
		StaticFunctionMapI_AOPM_C.annotationMap.put("getCoDNAAuthorForWord", "u:_A:pos");
		StaticFunctionMapI_AOPM_C.annotationMap.put("getHistogram", "void");
		StaticFunctionMapI_AOPM_C.annotationMap.put("getLineMed", "void");
		StaticFunctionMapI_AOPM_C.annotationMap.put("getJpv", "void");
		StaticFunctionMapI_AOPM_C.annotationMap.put("getRecoder", "void");
		StaticFunctionMapI_AOPM_C.annotationMap.put("getVoicejPanel", "void");
		StaticFunctionMapI_AOPM_C.annotationMap.put("getLYGFileIO", "void");
	}
	//重名稍后
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
	//声音略 私人不更进研究
}
