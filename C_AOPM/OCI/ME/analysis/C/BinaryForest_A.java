package OCI.ME.analysis.C;

import java.util.Map;

import PEQ.AMV.ECS.test.SensingTest;

public interface BinaryForest_A {
	void studyNewWord(String study, String token, String posStudy);
	Map<String, String> getStudyPos();
	Map<String, String> getPinYin();
	Map<String, String> getCtT();
	Map<String, String> getCtK();
	Map<String, String> getCtJ();
	Map<String, String> getCtR();
	Map<String, String> getCtA();
	Map<String,String> getPosEnToCn();
	Map<String,String> getPosEnToEn();
	Map<String,String> getPosCnToCn();
	Map<String,String> getEnToCn();
	Map<String,String> getCnToEn();
	Map<String,String> getFullEnToCn();
	Map<String,String> getFullCnToEn();
	SensingTest getSensingTest();
}
