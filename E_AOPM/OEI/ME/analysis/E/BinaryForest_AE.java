package OEI.ME.analysis.E;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import OCI.ME.analysis.C.BinaryForest_A;
import PEQ.AMV.ECS.test.SensingTest;
import SVQ.stable.StablePOS;

public class BinaryForest_AE extends AE implements BinaryForest_A {
	
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
	
	public Map<String, String> getPosEnToCn() {
		return fHMMList.getPosEnToCn();
	}

	public Map<String, String> getPosEnToEn() {
		return fHMMList.getPosEnToEn();
	}
	@Override
	public Map<String, String> getPosCnToCn() {
		return fHMMList.getPosCnToCn();
	}

	public Map<String, String> getFullEnToCn() {
		return fHMMList.getFullEnToCn();
	}

	public Map<String, String> getFullCnToEn() {
		return fHMMList.getFullCnToEn();
	}
	
	public Map<String, String> getEnToCn() {
		return fHMMList.getEnToCn();
	}

	public Map<String, String> getCnToEn() {
		return fHMMList.getCnToEn();
	}
}