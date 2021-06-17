package AEU.OPM.VEC.ica;

import java.io.IOException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import SVQ.stable.StablePOS;
import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;

public class EducationRatio{

	public double[] getEducationKernel(String text) throws IOException {
		A _A = new CogsBinaryForest_AE();
		_A.init();
		Map<String, String> pos = _A.getPosCnToCn();
		List<String> sets = _A.parserString(text);
		Map<Integer, WordFrequency> map = _A.getWordFrequencyByReturnSortMap(sets);
		double[] output = new double[StablePOS.INT_SEVEN];
		output[StablePOS.INT_ZERO] = sets.size();
		Iterator<Integer> iterator = map.keySet().iterator();
		Here:
			while(iterator.hasNext()) {
				WordFrequency wordFrequency = map.get(iterator.next());
				if(!pos.containsKey(wordFrequency.getWord())) {
					continue Here;
				}
				if(pos.get(wordFrequency.getWord()).contains(StablePOS.NLP_ZI_MING)){
					output[StablePOS.INT_ONE]+= StablePOS.INT_ONE;
					continue Here;
				}
				if(pos.get(wordFrequency.getWord()).contains(StablePOS.NLP_ZI_DONG)){
					output[StablePOS.INT_TWO]+= StablePOS.INT_ONE;
					continue Here;
				}
				if(pos.get(wordFrequency.getWord()).contains(StablePOS.NLP_ZI_WEI)){
					output[StablePOS.INT_FOUR]+= StablePOS.INT_ONE;
					continue Here;
				}
				if(pos.get(wordFrequency.getWord()).contains(StablePOS.NLP_ZI_XING)){
					output[StablePOS.INT_THREE]+= StablePOS.INT_ONE;
					continue Here;
				}
				if(pos.get(wordFrequency.getWord()).contains(StablePOS.NLP_ZI_FU)){
					output[StablePOS.INT_FIVE]+= StablePOS.INT_ONE;
					continue Here;
				}
				if(pos.get(wordFrequency.getWord()).contains(StablePOS.NLP_ZI_JIE)){
					output[StablePOS.INT_SIX]+= StablePOS.INT_ONE;
				}
			}	
		return output;
	}

	public double[] getEducationRatioKernel(double[] input) {
		double[] output=new double[input.length];
		for(int i=StablePOS.INT_ZERO;i<input.length;i++) {
			output[i]=input[i]/input[StablePOS.INT_ZERO];
		}
		return output;
	}
}