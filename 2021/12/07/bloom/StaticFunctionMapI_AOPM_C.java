package SEM.bloom;

import java.awt.HeadlessException;
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

	public static void load(StaticFunctionMapI_AOPM_E staticFunctionMapI_AOPM_E) {
		// TODO Auto-generated method stub
		//稍后封装
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
