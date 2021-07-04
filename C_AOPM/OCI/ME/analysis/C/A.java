package OCI.ME.analysis.C;
import java.io.IOException;
import java.util.List;
//import java.util.Map;
//
//import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
//import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
//import PEQ.AMV.ECS.test.SensingTest;
public interface A {
	void IV_() throws IOException;
	void IV_Mixed() throws IOException;
	List<String> parserString(String input);
	void I_FixWords(int charPosition, String inputString,StringBuilder[] fixWords);
	String[] parserEnglishString(String englishString);
	List<String> parserMixedString(String mixedString);
}