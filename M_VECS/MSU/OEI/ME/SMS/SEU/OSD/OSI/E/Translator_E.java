package MSU.OEI.ME.SMS.SEU.OSD.OSI.E;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.Verbal;
import SVQ.stable.StablePOS;
import MSU.OCI.ME.SMS.translator.C.Translator;
import OCI.ME.analysis.C.A;
import OCI.ME.analysis.C.BinaryForest_A;
public class Translator_E implements Translator{
	public Map<String, String> poscc;
	public Map<String, String> posec;
	public Map<String, String> posee;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public Map<String, String> fulletc;
	public Map<String, String> fullcte;
	public void IV_(BinaryForest_A _A) throws IOException {
		posec= _A.getPosEnToCn();
		posee= _A.getPosEnToEn();
		poscc= _A.getPosCnToCn();
		etc= _A.getEnToCn();
		cte= _A.getCnToEn();
		fulletc= _A.getFullEnToCn();
		fullcte= _A.getFullCnToEn();
	}

	public String EnglishStringToChineseString(A _A, String EnglishString) {
		String[] nodes = _A.parserEnglishString(EnglishString);
		StringBuilder sb = new StringBuilder();
		for(String temp:nodes) {
			char[] caseTemp = temp.toCharArray();
			caseTemp[StablePOS.INT_ONE] = String.valueOf(caseTemp[StablePOS.INT_ONE])
					.toUpperCase().charAt(StablePOS.INT_ONE);
			if(etc.containsKey(temp)) {
				sb.append(etc.get(temp).split(StablePOS.NLP_DOT)[StablePOS.INT_ONE]);
			}else if(fulletc.containsKey(String.valueOf(caseTemp))){
				sb.append(fulletc.get(String.valueOf(caseTemp)));
			}else {
				sb.append(temp);
			}
			sb.append(StablePOS.SPACE_STRING);
		}
		return sb.toString();
	}
	
	public String ChineseStringToEnglishString(A _A, String ChineseString) {
		List<String> nodes = _A.parserString(ChineseString);
		StringBuilder sb = new StringBuilder();
		Iterator<String> it = nodes.iterator();
		while(it.hasNext()) {
			String temp = it.next();
			if(cte.containsKey(temp)) {
				sb.append(cte.get(temp));
			}else if(fullcte.containsKey(temp)){
				sb.append(fullcte.get(temp));
			}else {
				sb.append(temp);
			}
			sb.append(StablePOS.SPACE_STRING);
		}
		return sb.toString();
	}

	public String MixedStringToChineseString(A _A, String mixedString) {
		List<String> nodes = _A.parserMixedString(mixedString.toLowerCase());
		StringBuilder sb = new StringBuilder();
		Iterator<String> it = nodes.iterator();
		while(it.hasNext()) {
			String temp = it.next();
			if(poscc.containsKey(temp)) {
				sb.append(temp);
			}else {
				String[] strings = _A.parserEnglishString(temp);
				for(String string:strings) {
					if(string == null || string.length() < StablePOS.INT_ONE) {
						string = StablePOS.EMPTY_STRING;
					}
					if(etc.containsKey(string)) {
						sb.append(etc.get(string).split(StablePOS.NLP_DOT)[StablePOS.INT_ZERO]);
					}else if(fulletc.containsKey(string)){
						sb.append(fulletc.get(string));
					}else {
						sb.append(temp);
					}
				}
			}
		}
		return sb.toString();
	}

	public String ChineseStringToEnglishStringWithPOS(A _A, String ChineseString) {
		List<String> nodes = _A.parserString(ChineseString);
		StringBuilder sb = new StringBuilder();
		Iterator<String> it = nodes.iterator();
		while(it.hasNext()) {
			String temp = it.next();
			if(cte.containsKey(temp)) {
				sb.append(cte.get(temp));
			}else if(fullcte.containsKey(temp)){
				sb.append(fullcte.get(temp));
			}else {
				sb.append(temp);
			}
			if(poscc.containsKey(temp)) {
				sb.append(StablePOS.NLP_SYMBO_SLASH);
				sb.append(poscc.get(temp));
			}
			sb.append(StablePOS.SPACE_STRING);
		}
		return sb.toString();
	}

	public List<Verbal> index(A _A, String mixedString) {
		List<Verbal> verbals = new CopyOnWriteArrayList<>();
		List<String> nodes = _A.parserMixedString(mixedString.toLowerCase());
		Iterator<String> it = nodes.iterator();
		while(it.hasNext()) {
			String word = it.next();
			Verbal verbal = new Verbal();
			if(poscc.containsKey(word)) {
				verbal.I_Chinese(word);
				verbal.I_PartOfSpeech(poscc.get(word));
				if(cte.containsKey(word)) {
					verbal.I_English(cte.get(word));
					if(etc.containsKey(cte.get(word))) {
						verbal.I_Explain(etc.get(cte.get(word)));
					}
				}else if(fullcte.containsKey(word)){
					verbal.I_English(fullcte.get(word));
					verbal.I_Explain(fullcte.get(word));
				}
			}else if(posee.containsKey(word)) {
				verbal.I_English(word);
				if(fulletc.containsKey(word)) {
					verbal.I_Chinese(fulletc.get(word));
				}
				if(poscc.containsKey(fulletc.get(word))) {
					verbal.I_PartOfSpeech(poscc.get(fulletc.get(word)));
				}
				if(etc.containsKey(word)) {
					verbal.I_Explain(etc.get(word));
				}
			}else {
				verbal.I_English(word);
				verbal.I_Chinese(fulletc.get(word));
				verbal.I_PartOfSpeech(StablePOS.NLP_NULL);
				verbal.I_Explain(StablePOS.NLP_NULL);
			}	
			verbals.add(verbal);
		}
		return verbals;
	}

	public List<Verbal> fixPos(List<Verbal> verbals) {
		for(int i = 0; i < verbals.size(); i++) {
			if(verbals.get(i).getPartOfSpeech() != null) {
				if(verbals.get(i).getPartOfSpeech().contains(StablePOS.NLP_ZI_DONG)){
					if(!verbals.get(i).getPartOfSpeech().contains(StablePOS.NLP_ZI_MING)){
						if(i - StablePOS.INT_ONE > StablePOS.INT_ZERO && verbals.get(i - StablePOS.INT_ONE)
								.getEnglish().contains(StablePOS.NLP_ENGLISH_OF)) {
							Verbal temp = verbals.get(i);
							temp.I_PartOfSpeech(StablePOS.NLP_CI_DONG_MING);
							String english = temp.getEnglish().replace(StablePOS.SPACE_STRING, StablePOS.EMPTY_STRING);
							if(english.charAt(english.length() - StablePOS.INT_ONE) == StablePOS.NLP_CHAR_E) {
								english = StablePOS.NLP_ENGLISH_THE + StablePOS.SPACE_STRING 
										+ english.substring(StablePOS.INT_ZERO, english.length() - StablePOS.INT_ONE) 
										+ StablePOS.NLP_ENGLISH_ING;
							}else {
								english = StablePOS.NLP_ENGLISH_THE + StablePOS.SPACE_STRING + english + StablePOS.NLP_ENGLISH_ING;
							}
							temp.I_English(english);
						}else if(verbals.get(i + StablePOS.INT_ONE).getPartOfSpeech().contains(StablePOS.NLP_ZI_MING)){
							if(i - StablePOS.INT_ONE >= StablePOS.INT_ZERO && !verbals.get(i - StablePOS.INT_ONE).getPartOfSpeech()
									.contains(StablePOS.NLP_ZI_MING)){
								if(!verbals.get(i - StablePOS.INT_ONE).getPartOfSpeech().contains(StablePOS.NLP_ZI_DAI)){
									if(verbals.get(i - StablePOS.INT_ONE).getPartOfSpeech().contains(StablePOS.NLP_ZI_JIE)){
										if(verbals.get(i - StablePOS.INT_ONE).getChinese().contains(StablePOS.NLP_ZI_ZAI)){
											if(verbals.get(i + StablePOS.INT_ONE).getChinese().contains(StablePOS.NLP_ZI_ZHONG)){
												Verbal temp = verbals.get(i + StablePOS.INT_ONE);
												temp.I_English(StablePOS.NLP_ENGLISH_STATUS);
											}
										}
									}
									Verbal temp = verbals.get(i);
									temp.I_PartOfSpeech(StablePOS.NLP_CI_DONG_MING);
									String english = temp.getEnglish().replace(StablePOS.SPACE_STRING, StablePOS.EMPTY_STRING);
									if(english.charAt(english.length()-StablePOS.INT_ONE) == StablePOS.NLP_CHAR_E) {
										english = StablePOS.NLP_ENGLISH_THE + StablePOS.SPACE_STRING 
												+ english.substring(StablePOS.INT_ZERO, english.length() - StablePOS.INT_ONE) 
												+ StablePOS.NLP_ENGLISH_ING;
									}else {
										english = StablePOS.NLP_ENGLISH_THE + StablePOS.SPACE_STRING + english + StablePOS.NLP_ENGLISH_ING;
									}
									temp.I_English(english);
								}
							}
							if(verbals.get(i + StablePOS.INT_TWO).getPartOfSpeech().contains(StablePOS.NLP_ZI_DONG)){
								if(!verbals.get(i + StablePOS.INT_TWO).getPartOfSpeech().contains(StablePOS.NLP_ZI_MING)){
									if(verbals.get(i + StablePOS.INT_THREE).getPartOfSpeech().contains(StablePOS.NLP_ZI_MING)){
										Verbal temp = verbals.get(i + StablePOS.INT_TWO);
										temp.I_PartOfSpeech(StablePOS.NLP_CI_DONG_MING);
										String english = temp.getEnglish().replace(StablePOS.SPACE_STRING, StablePOS.EMPTY_STRING);
										if(english.charAt(english.length() - StablePOS.INT_ONE) == StablePOS.NLP_CHAR_E) {
											english = StablePOS.NLP_ENGLISH_OF + StablePOS.SPACE_STRING +
													StablePOS.NLP_ENGLISH_THE + StablePOS.SPACE_STRING 
													+ english.substring(StablePOS.INT_ZERO, english.length()-StablePOS.INT_ONE) 
													+ StablePOS.NLP_ENGLISH_ING;
										}else {
											english = StablePOS.NLP_ENGLISH_OF + StablePOS.SPACE_STRING +
													StablePOS.NLP_ENGLISH_THE + StablePOS.SPACE_STRING + english + StablePOS.NLP_ENGLISH_ING;
										}
										temp.I_English(english);
									}
								}
							}
						}else if(i - StablePOS.INT_ONE >= StablePOS.INT_ZERO && verbals.get(i - StablePOS.INT_ONE)
								.getPartOfSpeech().contains(StablePOS.NLP_ZI_JIE)){
							Verbal temp = verbals.get(i);
							temp.I_PartOfSpeech(StablePOS.NLP_CI_DONG_MING);
							String english = temp.getEnglish().replace(StablePOS.SPACE_STRING, StablePOS.EMPTY_STRING);
							if(english.charAt(english.length() - StablePOS.INT_ONE) == StablePOS.NLP_CHAR_E) {
								english = StablePOS.NLP_ENGLISH_THE + StablePOS.SPACE_STRING + english.substring(StablePOS.INT_ZERO
										, english.length() - StablePOS.INT_ONE) + StablePOS.NLP_ENGLISH_ING;
							}else {
								english = StablePOS.NLP_ENGLISH_THE + StablePOS.SPACE_STRING  + english + StablePOS.NLP_ENGLISH_ING;
							}
							temp.I_English(english);
						}else if(i - StablePOS.INT_ONE >= StablePOS.INT_ZERO && verbals.get(i - StablePOS.INT_ONE).getPartOfSpeech()
								.contains(StablePOS.NLP_ZI_FU)){
							Verbal temp = verbals.get(i);
							temp.I_PartOfSpeech(StablePOS.NLP_CI_DONG_MING);
							String english = temp.getEnglish().replace(StablePOS.SPACE_STRING, StablePOS.EMPTY_STRING);
							if(english.charAt(english.length() - StablePOS.INT_ONE) == StablePOS.NLP_CHAR_E) {
								english = english.substring(StablePOS.INT_ZERO, english.length() - StablePOS.INT_ONE) 
										+ StablePOS.NLP_ENGLISH_ING;
							}else {
								english += StablePOS.NLP_ENGLISH_ING;
							}
							temp.I_English(english);
						}
					}
				}else if(verbals.get(i).getPartOfSpeech().contains(StablePOS.NLP_ZI_MING)){
					if(i - StablePOS.INT_ONE >= StablePOS.INT_ZERO && verbals.get(i - StablePOS.INT_ONE)
							.getPartOfSpeech().contains(StablePOS.NLP_FU_SHU)){
						Verbal temp = verbals.get(i);
						String english = temp.getEnglish().replace(StablePOS.SPACE_STRING, StablePOS.EMPTY_STRING);
						if(english.charAt(english.length()-1) == StablePOS.NLP_CHAR_H || english.charAt(english.length()-1) 
								== StablePOS.NLP_CHAR_S) {
							english += StablePOS.NLP_ENGLISH_ES;
						}else {
							english += StablePOS.NLP_ENGLISH_S;
						}
						temp.I_English(english);
					}
				}else if(verbals.get(i).getPartOfSpeech().contains(StablePOS.NLP_CI_FU)){
					if(i - StablePOS.INT_ONE >= StablePOS.INT_ZERO && (verbals.get(i-StablePOS.INT_ONE)
							.getPartOfSpeech().contains(StablePOS.NLP_ZI_DAI)
							||verbals.get(i - StablePOS.INT_ONE).getPartOfSpeech().contains(StablePOS.NLP_ZI_MING))){
						if(i-StablePOS.INT_ONE >= StablePOS.INT_ZERO&&verbals.get(i - StablePOS.INT_ONE).getPartOfSpeech()
								.contains(StablePOS.NLP_ZI_复)
								||(verbals.get(i-StablePOS.INT_ONE).getPartOfSpeech().contains(StablePOS.NLP_ZI_单)
										&& verbals.get(i-StablePOS.INT_ONE).getPartOfSpeech().contains(StablePOS.NLP_ZI_一))){
							if(verbals.get(i).getEnglish().contains(StablePOS.NLP_HAVE_HAS)) {
								Verbal temp = verbals.get(i);
								String english = temp.getEnglish().replace(StablePOS.NLP_HAVE_HAS, StablePOS.NLP_HAVE);
								temp.I_English(english);
							}
						}else {
							if(verbals.get(i).getEnglish().contains(StablePOS.NLP_HAVE_HAS)) {
								Verbal temp = verbals.get(i);
								String english = temp.getEnglish().replace(StablePOS.NLP_HAVE_HAS, StablePOS.NLP_HAS);
								temp.I_English(english);
							}
						}
					}	
					if(i-StablePOS.INT_TWO>= StablePOS.INT_ZERO && (verbals.get(i-StablePOS.INT_TWO).getPartOfSpeech()
							.contains(StablePOS.NLP_ZI_DAI) || verbals.get(i-StablePOS.INT_TWO).getPartOfSpeech()
							.contains(StablePOS.NLP_ZI_MING))){
						if(verbals.get(i-StablePOS.INT_TWO).getPartOfSpeech().contains(StablePOS.NLP_ZI_复)
							||(verbals.get(i-StablePOS.INT_TWO).getPartOfSpeech().contains(StablePOS.NLP_ZI_单)
									&&verbals.get(i-StablePOS.INT_TWO).getPartOfSpeech().contains(StablePOS.NLP_ZI_一))){
							if(verbals.get(i).getEnglish().contains(StablePOS.NLP_HAVE_HAS)) {
								Verbal temp = verbals.get(i);
								String english = temp.getEnglish().replace(StablePOS.NLP_HAVE_HAS, StablePOS.NLP_HAVE);
								temp.I_English(english);
							}
						}else {
							if(verbals.get(i).getEnglish().contains(StablePOS.NLP_HAVE_HAS)) {
								Verbal temp = verbals.get(i);
								String english = temp.getEnglish().replace(StablePOS.NLP_HAVE_HAS, StablePOS.NLP_HAS);
								temp.I_English(english);
							}
						}
					}	 
				}	
			}
		}
		return verbals;
	}

	public String getChineseSentenseFromVerbalList(List<Verbal> verbals) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < verbals.size(); i++) {
			sb.append(verbals.get(i).getChinese() == null ? StablePOS.EMPTY_STRING : verbals.get(i).getChinese());
		}
		return sb.toString().replaceAll(StablePOS.NLP_SPASE_REP, StablePOS.SPACE_STRING);
	}

	public String getEnglishSentenseFromVerbalFixList(List<Verbal> verbalsFix) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<verbalsFix.size(); i++) {
			sb.append(verbalsFix.get(i).getEnglish()==null ? StablePOS.EMPTY_STRING : verbalsFix.get(i).getEnglish().toLowerCase());
			sb.append(StablePOS.SPACE_STRING);
		}
		return sb.toString().replaceAll(StablePOS.NLP_SPASE_REP, StablePOS.SPACE_STRING);
	}
}