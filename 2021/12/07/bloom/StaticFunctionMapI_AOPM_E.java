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
public class StaticFunctionMapI_AOPM_E implements StaticFunctionMapI_AOPM_C {
	public BigWord getBigWord() {
		return new BigWord();
	}
	public Classify getClassify() {
		return new Classify();
	}
	public CoAuthor getCoAuthor(Map<String, Object> dic_li, CogsBinaryForest_AE _A
			, Map<String, String> pos)  {
		return new  CoAuthor(dic_li,  _A,  pos) ;
	}
	public CoAuthorForWord getCoAuthorForWord(App u, CogsBinaryForest_AE _A
			, Map<String, String> pos) throws HeadlessException, InterruptedException {
		return new CoAuthorForWord(u,_A, pos);
	}
	public CoDNAAuthorForWord getCoDNAAuthorForWord(App u, A _A, Map<String, String> pos) throws HeadlessException, InterruptedException {
		return new CoDNAAuthorForWord(u,_A, pos);
	}
	public Histogram getHistogram() {
		return new Histogram();
	}
	public LineMed getLineMed() {
		return new LineMed();
	}
	public Jpv getJpv() {
		return new Jpv();
	}
	public Recoder getRecoder() {
		return new Recoder();
	}
	public VoicejPanel getVoicejPanel() {
		return new VoicejPanel();
	}
	public LYGFileIO getLYGFileIO() {
		return new LYGFileIO();
	}
}
