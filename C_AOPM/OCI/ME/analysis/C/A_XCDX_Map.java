package OCI.ME.analysis.C;
import java.io.IOException;

import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
//import PEQ.AMV.ECS.test.SensingTest;
public interface A_XCDX_Map {
    Map<String, WordFrequency> getWordFrequencyMap(List<String> sets) throws IOException;
	Map<Integer,WordFrequency> getWordFrequencyByReturnSortMap(List<String> sets) throws IOException;
	Map<Integer,WordFrequency> sortWordFrequencyMapToUnsortMap(Map<String,WordFrequency> map);
	Map<Integer,WordFrequency> sortWordFrequencyMapToSortMap(Map<String,WordFrequency> map);
	Map<String,WordFrequency> parserStringByReturnFrequencyMap(String inputString);
	Map<String,WordFrequency> parserMixStringByReturnFrequencyMap(String key);
	List<WordFrequency> sortWordFrequencyMap(Map<String,WordFrequency> map) throws IOException;
	List<WordFrequency> getWordFrequency(List<String> sets)throws IOException;
	EmotionMap getEmotionMap();	
}