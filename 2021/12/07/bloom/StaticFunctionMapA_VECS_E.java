package SEM.bloom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import AEU.AVC.SUQ.engine.EmotionInit;
import AEU.AVC.SUQ.engine.EnvironmentInit;
import AEU.AVC.SUQ.engine.LenovoInit;
import AEU.OCI.AVC.SUQ.estimation.C.EmotionSample;
import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import SVQ.stable.StableCommon;
//用来索引函数 注册类
//罗瑶光
public class StaticFunctionMapA_VECS_E implements StaticFunctionMapA_VECS_C{
	@Override
	public List<String> parserMixedStringToList(String inputString) throws IOException {
		CogsBinaryForest_AE _A = new CogsBinaryForest_AE();
		_A.IV_Mixed();
		List<String> sets = new ArrayList<>();
		sets= _A.parserMixedString(inputString);
		//罗瑶光
		return sets;
	}

	@Override
	public List<String> posReader(String inputString) throws IOException {
		CogsBinaryForest_AE _A = new CogsBinaryForest_AE();
		_A.IV_Mixed();
		Map<String, String> pos = _A.getPosCnToCn();
		List<String> sets = new ArrayList<>();
		sets= _A.parserMixedString(inputString);
		List<String> list= new ArrayList<>();
		Iterator<String> iterator= sets.iterator();
		while(iterator.hasNext()) {
			String string= iterator.next(); 
			if (!string.replaceAll("\\s+", "").equals("")) {
				list.add(string+ "/"+ pos.get(string));
			}else {
				list.add(string+ "/"+ "未知");
			}
		}
		return list;
	}

	@Override
	public List<String> dnnReader(String inputString) throws IOException {
		// TODO Auto-generated method stub
		//dnn不属于这个元基组， 稍后并出去。
		return null;
	}

	@Override
	public List<String> mindReader(String inputString) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	//先把main test 加进来， 稍后整改 输出。
	@Override
	public List<String> emotionReader(String inputString) throws IOException {
		EmotionInit emotionInit = new EmotionInit();
		emotionInit.IV_(inputString);
		return null;
	}

	@Override
	public List<String> educationReader(String inputString) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, EmotionSample> environmentReader(String inputString) throws IOException {
		EnvironmentInit environmentInit = new EnvironmentInit();
		environmentInit.IV_(inputString);
		Map<String, EmotionSample> environmentSampleMap = environmentInit.getEmotionSampleMap();
		return environmentSampleMap;
	}

	@Override
	public Map<String, Object> lenovoReader(String inputString) throws IOException {
		LenovoInit lenovoInit= new LenovoInit();
		lenovoInit.IV_(inputString);
		//Map<String, EmotionSample> environmentSampleMap= lenovoInit.getEnvironmentInit().getEmotionSampleMap();
		Map<String, Object> lenovo= lenovoInit.getSensingMap().getLenovoMap();
		return lenovo;
	}

	@Override
	public List<String> frequencyReader(String inputString) throws IOException {
		CogsBinaryForest_AE _A = new CogsBinaryForest_AE();
		_A.IV_Mixed();
		List<String> sets = new ArrayList<>();
		sets= _A.parserMixedString(inputString);
		Map<Integer, WordFrequency> fwa = _A.getWordFrequencyByReturnSortMap(sets);
		List<String> list= new ArrayList<>();
		Iterator<Integer> iterator= fwa.keySet().iterator();
		while(iterator.hasNext()) {
			int intValue= iterator.next();//32bit 上限 65535 
			list.add(fwa.get(intValue).getWord() + StableCommon.STRING_SYMBOL_PER + fwa.get(intValue).getFrequency());
		}
		return list;//是前序遍历，应用记得从大到小。
	}
}