package OEI.SVQ.MPC.fhmm.E;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import SVQ.stable.StablePOS;
import OCI.SVQ.MPC.fhmm.C.FMHMMList;
import OEI.ME.euclid.E.Euclid_CE;
public class FMHMMList_E implements FMHMMList {
	private Map<String, String> words;
	private Map<Long, FMHMMNode> linkedHashMap;
	@SuppressWarnings(StablePOS.RAW_TYPES)
	private Map<Integer, Map> linkedHashMapRoot;
	@SuppressWarnings(StablePOS.RAW_TYPES)
	public Map<Integer, Map> getRoot() {
		return this.linkedHashMapRoot;
	}

	public void index() throws IOException {
		words= new ConcurrentHashMap<>();
		linkedHashMap= new ConcurrentHashMap<>();
		linkedHashMapRoot= new ConcurrentHashMap<>();
		InputStream inputStream= getClass().getResourceAsStream(StablePOS.WORDS_SOURSE_LINK_POS_CN_TO_CN);
		BufferedReader cReader= new BufferedReader(new InputStreamReader(inputStream, StablePOS.UTF8_STRING));
		String cInputString;
		Here:
			while ((cInputString = cReader.readLine()) != null) {
				if(!(!cInputString.replace(StablePOS.SPACE_STRING, StablePOS.EMPTY_STRING).equals(StablePOS.EMPTY_STRING)
						&& cInputString.split(StablePOS.NLP_SYMBO_SLASH).length > StablePOS.INT_ONE )) {
					continue Here;
				}
				words.put(cInputString.split(StablePOS.NLP_SYMBO_SLASH)[StablePOS.INT_ZERO], cInputString
						.split(StablePOS.NLP_SYMBO_SLASH)[StablePOS.INT_ONE]);
				linkedHashMap = loopLoadForest(cInputString);
			}
		cReader.close();
		linkedHashMapRoot = new Euclid_CE().mCogsEuclid(linkedHashMap);
	}

	public Map<Long, FMHMMNode> loopLoadForest(String cInputString) {
		Here:
			for (int i = StablePOS.INT_ZERO; i < cInputString.length(); i++) {
				if (linkedHashMap.containsKey(Long.valueOf(cInputString.charAt(i)))) {
					FMHMMNode fHHMMNode = linkedHashMap.get(Long.valueOf(cInputString.charAt(i)));
					linkedHashMap = doNeroPostCognitive(fHHMMNode, cInputString, i);
					continue Here;
				} else {
					FMHMMNode fHHMMNode = new FMHMMNode();
					fHHMMNode.I_Vb(StablePOS.EMPTY_STRING + cInputString.charAt(i));
					if (i + StablePOS.INT_ONE < cInputString.length()) {
						Map<String, Integer> next = new ConcurrentHashMap<>();
						next.put(StablePOS.EMPTY_STRING + cInputString.charAt(i + StablePOS.INT_ONE), StablePOS.INT_ONE);
						fHHMMNode.I_Next(next);
					}
					linkedHashMap.put(Long.valueOf(cInputString.charAt(i)), fHHMMNode);
				}
			}
	return linkedHashMap;
	}

	public Map<Long, FMHMMNode> doNeroPostCognitive(FMHMMNode fFHMMNode, String cInputString, int i) {
		if (fFHMMNode.getNext() != null) {
			if (i + StablePOS.INT_ONE < cInputString.length()) {
				linkedHashMap = doCheckAndRunNeroPostFix(fFHMMNode, cInputString, i);
			}
		} else {
			ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
			if (i + StablePOS.INT_ONE < cInputString.length()) {
				concurrentHashMap.put(StablePOS.EMPTY_STRING + cInputString.charAt(i + StablePOS.INT_ONE),
						StablePOS.INT_ONE);
			}
			fFHMMNode.I_Next(concurrentHashMap);
			linkedHashMap.put(Long.valueOf(cInputString.charAt(i)), fFHMMNode);
		}
		return linkedHashMap;
	}

	public Map<Long, FMHMMNode> doCheckAndRunNeroPostFix(FMHMMNode fFHMMNode, String cInputString, int i) {
		if (!fFHMMNode.getNext().containsKey(StablePOS.EMPTY_STRING + cInputString.charAt(i + StablePOS.INT_ONE))) {
			Map<String, Integer> map = fFHMMNode.getNext();
			map.put(StablePOS.EMPTY_STRING + cInputString.charAt(i + StablePOS.INT_ONE), StablePOS.INT_ONE);
			fFHMMNode.I_Next(map);
			linkedHashMap.put(Long.valueOf(cInputString.charAt(i)), fFHMMNode);
		}
		return linkedHashMap;
	}

	public Map<String, String> getWords() {
		return this.words;
	}

	public Map<Long, FMHMMNode> getMap() {
		return this.linkedHashMap;
	}

	public Map<String, String> getPosEnToEn() {
		return null;
	}

	public Map<String, String> getEnToCn() {
		return null;
	}

	public Map<String, String> getCnToEn() {
		return null;
	}

	public void indexEnToCn() throws IOException {
	}

	public void indexCnToEn() throws IOException {
	}

	public Map<String, String> getPosEnToCn() {
		return null;
	}

	public Map<String, String> getPosCnToCn() {
		return null;
	}

	public void indexPosEnToCn() throws IOException {
	}

	public void indexPosEnToEn() throws IOException {
	}

	public void indexPosCnToEn() throws IOException {
	}

	public Map<String, String> getPosCnToEn() {
		return null;
	}

	public void indexFullEnToCn() throws IOException {
	}

	public void indexFullCnToEn() throws IOException {	
	}

	public Map<String, String> getFullEnToCn() {
		return null;
	}

	public Map<String, String> getFullCnToEn() {
		return null;
	}

	@Override
	public List<String> englishStringToWordsList(String string) {
		return null;
	}

	@Override
	public void indexFullCnToJp() throws IOException {
		
	}

	@Override
	public void indexFullCnToRs() throws IOException {
		
	}

	@Override
	public void indexFullCnToAb() throws IOException {
		
	}

	@Override
	public void indexFullCnToFn() throws IOException {
		
	}

	@Override
	public void indexFullCnToGm() throws IOException {
		
	}

	@Override
	public void indexFullCnToKo() throws IOException {
		
	}

	@Override
	public void indexFullCnToSp() throws IOException {
		
	}

	@Override
	public void indexFullCnToPy() throws IOException {
		
	}

	@Override
	public Map<String, String> getFullCnToJp() {
		return null;
	}

	@Override
	public Map<String, String> getFullCnToRs() {
		return null;
	}

	@Override
	public Map<String, String> getFullCnToAb() {
		return null;
	}

	@Override
	public Map<String, String> getFullCnToFn() {
		return null;
	}

	@Override
	public Map<String, String> getFullCnToGm() {
		return null;
	}

	@Override
	public Map<String, String> getFullCnToKo() {
		return null;
	}

	@Override
	public Map<String, String> getFullCnToSp() {
		return null;
	}

	@Override
	public Map<String, String> getFullCnToPy() {
		return null;
	}

	@Override
	public void indexFullNegative() throws IOException {
		
	}

	@Override
	public void indexFullPositive() throws IOException {
		
	}

	@Override
	public Map<String, String> getFullNegative() {
		return null;
	}

	@Override
	public Map<String, String> getFullPositive() {
		return null;
	}

	@Override
	public Map<Long, FMHMMNode>[] getMaps() {
		return null;
	}

	@Override
	public Map<Long, Map<String, String>> getWordsForests() {
		return null;
	}

	@Override
	public void indexMixed() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void studyNewPos(String string, String posStudy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, String> getStudyPos() {
		return null;
	}

	@Override
	public Map<String, String> getFullCnToTt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void indexFullCnToTt() throws IOException {
		// TODO Auto-generated method stub
		
	}
}