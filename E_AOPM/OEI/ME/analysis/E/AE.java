package OEI.ME.analysis.E;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
//import AVQ.ASQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import SVQ.stable.StablePOS;
//import ME.utils.WordFrequencyUtil;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import OCI.ME.analysis.C.A;
import OCI.ME.liner.C.Quick6DLuoYaoguangSort;
import OCI.ME.nero.C.NERO_C_OneTime;
import OCI.ME.nlp.C.NLP_C;
//import OCI.ME.pos.C.POS_C;
//import OCI.ME.pos.C.Pos_C_XCDX;
import OCI.ME.pos.C.Pos_C_XCDX_P;
import OCI.SVQ.MPC.fhmm.C.FHMMList;
import OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import OEI.ME.liner.E.Quick6DLuoYaoguangSort3DMap_E;
import OEI.ME.nero.E.NERO_C_OneTime_E;
import OEI.ME.nlp.E.NLP_CE;
//import OEI.ME.pos.E.POS_CE;
//import OEI.ME.pos.E.Pos_CE_XCDX;
import OEI.ME.pos.E.Pos_CE_XCDX_P;
import OEI.SVQ.MPC.fhmm.E.FMHMMListOneTime_E;

import java.util.Iterator;
import java.util.LinkedList;

import PEQ.AMV.ECS.test.SensingTest;
public class AE implements A {
	protected FHMMList fHMMList;
	protected NERO_C_OneTime neroController;
	protected NLP_C nlpController;
	protected Pos_C_XCDX_P posController;
	protected Quick6DLuoYaoguangSort quick6DLuoYaoguangSort;	
	protected Map<Long, FMHMMNode> forestRoots;
	protected Map<Long, Map<String, String>> wordsForests;
	protected Map<Long, FMHMMNode> []forestsRoots;
	protected Map<String, String> wordsForest;
	protected EmotionMap emotionMap;
	protected SensingTest sensingTest;
	public void IV_() throws IOException {
		this.fHMMList= new FMHMMListOneTime_E();
		fHMMList.index();
		fHMMList.indexPosEnToCn();
		fHMMList.indexPosEnToEn();
		fHMMList.indexEnToCn();
		fHMMList.indexCnToEn();
		fHMMList.indexFullEnToCn();
		fHMMList.indexFullCnToEn();
		neroController= new NERO_C_OneTime_E();
		nlpController= new NLP_CE();
		posController= new Pos_CE_XCDX_P();
		quick6DLuoYaoguangSort= new Quick6DLuoYaoguangSort3DMap_E();
		forestRoots= fHMMList.getMap();
		forestsRoots= fHMMList.getMaps();
		wordsForest= fHMMList.getPosCnToCn();
		wordsForests= fHMMList.getWordsForests();
	}

	public void IV_Mixed() throws IOException {
		this.fHMMList= new FMHMMListOneTime_E();
		fHMMList.indexMixed();
		fHMMList.indexPosEnToCn();
		fHMMList.indexPosEnToEn();
		fHMMList.indexEnToCn();
		fHMMList.indexCnToEn();
		fHMMList.indexFullEnToCn();
		fHMMList.indexFullCnToEn();
		fHMMList.indexFullCnToPy();
		fHMMList.indexFullCnToKo();;
		fHMMList.indexFullCnToJp();;
		fHMMList.indexFullCnToTt();
		fHMMList.indexFullCnToRs();
		fHMMList.indexFullCnToAb();
		neroController= new NERO_C_OneTime_E();
		nlpController= new NLP_CE();
		posController= new Pos_CE_XCDX_P();
		quick6DLuoYaoguangSort= new Quick6DLuoYaoguangSort3DMap_E();
		forestRoots= fHMMList.getMap();
		forestsRoots= fHMMList.getMaps();
		wordsForest= fHMMList.getPosCnToCn();
		wordsForests= fHMMList.getWordsForests();
		emotionMap= new EmotionMap_E(); 
		emotionMap.IV_MotivationMap();
		emotionMap.IV_NegativeMap();
		emotionMap.IV_PositiveMap();
		emotionMap.IV_TrendingMap();
		emotionMap.IV_PredictionMap();
		sensingTest= new SensingTest();
	}
	
	public List<String> parserMixedString(String mixedString) {
		mixedString+= StablePOS.SPACE_STRING_DISTINCTION;
		int inputStringLength= mixedString.length();
		List<String> outputList = new LinkedList<>();
		int forestDepth = StablePOS.INT_ZERO;
		int countInputStringLength;
		StringBuilder[] fixWords = new StringBuilder[StablePOS.INT_TWO];
		fixWords[StablePOS.INT_ZERO] = new StringBuilder();
		fixWords[StablePOS.INT_ONE] = new StringBuilder();
		StringBuilder stringBuilder = new StringBuilder();
		int find = StablePOS.INT_ZERO;
		Here:
			for (int charPosition = StablePOS.INT_ZERO;charPosition<inputStringLength;charPosition
					+=(countInputStringLength==StablePOS.INT_ZERO?StablePOS.INT_ONE:countInputStringLength)) {
				if(mixedString.charAt(charPosition) < StablePOS.INT_TEN_SOUTHANDS && charPosition < inputStringLength 
						- StablePOS.INT_ONE){
					if(find == StablePOS.INT_ZERO) {
						fixWords[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWords[StablePOS.INT_ZERO].length());
					}
					fixWords[StablePOS.INT_ZERO].append(mixedString.charAt(charPosition));
					countInputStringLength = StablePOS.INT_ONE;
					find = StablePOS.INT_ONE;
					continue Here;
				}
				if(StablePOS.INT_ONE == find) {
					find = StablePOS.INT_ZERO;
					Iterator<String> it = fHMMList.englishStringToWordsList(fixWords[StablePOS.INT_ZERO].toString()).iterator();
					StringBuilder number= new StringBuilder();
					while(it.hasNext()) {
						String temp = it.next();
						if(StablePOS.NUMBERS.contains(temp)) {
							number.append(temp);
						}else {
							if(number.length()>0) {
								outputList.add(number.toString());
								number.delete(0, number.length());
							}
							outputList.add(temp);	
						}	
					}
					if(number.length()>0) {
						outputList.add(number.toString());
						number.delete(0, number.length());
					}
					fixWords[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWords[StablePOS.INT_ZERO].length());
				}			
				stringBuilder.delete(StablePOS.INT_ZERO, stringBuilder.length());
				stringBuilder = neroController.getBinaryForestRecurWordOneTime(stringBuilder.append(mixedString
						.charAt(charPosition)), mixedString, charPosition, inputStringLength, forestRoots, forestDepth
						, charPosition + StablePOS.INT_ONE);
				String countWordNode = stringBuilder.toString();
				int compare = countInputStringLength = countWordNode.length();
				if (StablePOS.INT_ONE == compare) {
					outputList.add(countWordNode);
					fixWords[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWords[StablePOS.INT_ZERO].length());
					fixWords[StablePOS.INT_ZERO].append(countWordNode);
					continue Here;
				}
				if (StablePOS.INT_TWO == compare) {
					countInputStringLength = nlpController.doSlangPartAndPOSCheckForTwoChar(countInputStringLength, outputList
							, stringBuilder, wordsForest, fixWords, posController, charPosition, mixedString);
					continue Here;
				}
				if (StablePOS.INT_THREE == compare) {
					I_FixWords(charPosition, mixedString, fixWords);
					countInputStringLength = nlpController.doPOSAndEMMCheckOfThree(countInputStringLength, outputList
							, wordsForest, stringBuilder, fixWords, posController, charPosition, mixedString);
					continue Here;
				}
				if (StablePOS.INT_FOUR == compare) {
					I_FixWords(charPosition, mixedString, fixWords);
					countInputStringLength = nlpController.doSlangCheck(countInputStringLength, outputList, stringBuilder
							, wordsForest, fixWords, posController, charPosition, mixedString);
				}
			}
		return outputList;
	}

	public List<String> parserString(String inputString) {
		List<String> outputList= new LinkedList<>();
		int inputStringLength= inputString.length();
		int forestDepth= StablePOS.INT_ZERO;
		int countInputStringLength;
		StringBuilder[] fixWords= new StringBuilder[StablePOS.INT_TWO];
		fixWords[StablePOS.INT_ZERO]= new StringBuilder();
		fixWords[StablePOS.INT_ONE]= new StringBuilder();
		StringBuilder stringBuilder= new StringBuilder();
		int find= StablePOS.INT_ZERO;
		Here:
			for (int charPosition= StablePOS.INT_ZERO; charPosition< inputStringLength; charPosition
					+= (countInputStringLength!= StablePOS.INT_ZERO? countInputStringLength: StablePOS.INT_ONE)) {
				if(StablePOS.INT_ONE_TWO_EIGHT> inputString.charAt(charPosition)){
					if(fixWords[StablePOS.INT_ZERO].length()> StablePOS.INT_ZERO) {
						if(fixWords[StablePOS.INT_ZERO].charAt(fixWords[StablePOS.INT_ZERO].length()- StablePOS.INT_ONE)
								< StablePOS.INT_ONE_TWO_EIGHT) {
							fixWords[StablePOS.INT_ZERO].append(inputString.charAt(charPosition));
							countInputStringLength= StablePOS.INT_ONE;
							find= StablePOS.INT_ONE;
							continue Here;
						}
						fixWords[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWords[StablePOS.INT_ZERO].length());
					}
					find= StablePOS.INT_ONE;
					fixWords[StablePOS.INT_ZERO].append(inputString.charAt(charPosition));
					countInputStringLength= StablePOS.INT_ONE;
					continue Here;
				}
				if(find== StablePOS.INT_ONE) {
					find= StablePOS.INT_ZERO;
					outputList.add(fixWords[StablePOS.INT_ZERO].toString());
				}
				stringBuilder.delete(StablePOS.INT_ZERO, stringBuilder.length());
				stringBuilder= neroController.getBinaryForestRecurWordOneTime(stringBuilder.append(inputString
						.charAt(charPosition)), inputString, charPosition, inputStringLength, forestRoots, forestDepth
						, charPosition+ StablePOS.INT_ONE);
				String countWordNode= stringBuilder.toString();
				int compare= countInputStringLength= countWordNode.length();
				if (compare== StablePOS.INT_ONE) {
					outputList.add(countWordNode);
					fixWords[StablePOS.INT_ZERO].delete(StablePOS.INT_ZERO, fixWords[StablePOS.INT_ZERO].length());
					fixWords[StablePOS.INT_ZERO].append(countWordNode);
					continue Here;
				}
				if (compare== StablePOS.INT_TWO) {
					countInputStringLength= nlpController.doSlangPartAndPOSCheckForTwoChar(countInputStringLength, outputList
							, stringBuilder, wordsForest, fixWords, posController, charPosition, inputString);
					continue Here;
				}
				if (compare== StablePOS.INT_THREE) {
					I_FixWords(charPosition, inputString, fixWords);
					countInputStringLength= nlpController.doPOSAndEMMCheckOfThree(countInputStringLength, outputList
							, wordsForest, stringBuilder, fixWords, posController, charPosition, inputString);
					continue Here;
				}
				if (compare== StablePOS.INT_FOUR) {
					I_FixWords(charPosition, inputString, fixWords);
					countInputStringLength= nlpController.doSlangCheck(countInputStringLength, outputList, stringBuilder
							, wordsForest, fixWords, posController, charPosition, inputString);
				}
			}
		return outputList;
	}
	
	public void I_FixWords(int charPosition, String inputString, StringBuilder[] fixWords) {
		fixWords[StablePOS.INT_ONE].delete(StablePOS.INT_ZERO, fixWords[StablePOS.INT_ONE].length());
		if (charPosition + StablePOS.INT_EIGHT < inputString.length()) {
			fixWords[StablePOS.INT_ONE].append(inputString.substring(charPosition + StablePOS.INT_THREE
					, charPosition + StablePOS.INT_EIGHT));
			return;
		}
		fixWords[StablePOS.INT_ONE].append(inputString.substring(charPosition + StablePOS.INT_THREE
				, inputString.length()));
	}

	public Map<String, String> getEnToCn() {
		return fHMMList.getEnToCn();
	}

	public Map<String, String> getCnToEn() {
		return fHMMList.getCnToEn();
	}
	
	public String[] parserEnglishString(String englishString) {
		String[] words = englishString.replaceAll(StablePOS.NLP_SPASE_REP, StablePOS.SPACE_STRING)
				.split(StablePOS.SPACE_STRING);
		if(StablePOS.INT_ZERO == words.length ) {
			return new String[] {StablePOS.SPACE_STRING};
		}
		return words;
	}

	public Map<String, String> getPosEnToCn() {
		return fHMMList.getPosEnToCn();
	}

	public Map<String, String> getPosEnToEn() {
		return fHMMList.getPosEnToEn();
	}

	public Map<String, String> getPosCnToCn() {
		return fHMMList.getPosCnToCn();
	}

	public Map<String, String> getFullEnToCn() {
		return fHMMList.getFullEnToCn();
	}

	public Map<String, String> getFullCnToEn() {
		return fHMMList.getFullCnToEn();
	}

	public void studyNewWord(String study, String token, String posStudy) {
		//learn new word
		FMHMMNode fFHMMNode= forestRoots.get(Long.valueOf(study.charAt(StablePOS.INT_ZERO)));
		Map<String, Integer> map;
		if(null== fFHMMNode) {
			fFHMMNode= new FMHMMNode();
			map= new ConcurrentHashMap<>();
		}else {
			map= fFHMMNode.getNext();
		}
		map.put(token, StablePOS.INT_ONE);
		fFHMMNode.I_Next(map);
		forestRoots.put(Long.valueOf(study.charAt(StablePOS.INT_ZERO)), fFHMMNode);
		//learn new pos
		fHMMList.studyNewPos(study+token, posStudy);
	}

	@Override
	public Map<String, String> getStudyPos() {
		return fHMMList.getStudyPos();
	}

	@Override
	public Map<String, String> getPinYin() {
		return fHMMList.getFullCnToPy();
	}

	@Override
	public Map<String, String> getCtT() {
		return fHMMList.getFullCnToTt();
	}

	@Override
	public Map<String, String> getCtK() {
		return fHMMList.getFullCnToKo();
	}

	@Override
	public Map<String, String> getCtJ() {
		return fHMMList.getFullCnToJp();
	}

	@Override
	public Map<String, String> getCtR() {
		// TODO Auto-generated method stub
		return fHMMList.getFullCnToRs();
	}

	@Override
	public Map<String, String> getCtA() {
		// TODO Auto-generated method stub
		return fHMMList.getFullCnToAb();
	}


	@Override
	public SensingTest getSensingTest() {
		// TODO Auto-generated method stub
		return this.sensingTest;
	}
}