package AEU.AVC.SUQ.engine;
import java.io.IOException;

import java.util.Map;

import AEU.OCI.AVC.SUQ.estimation.C.EmotionSample;
import OCI.AMV.ECS.SVQ.MPC.fhmm.C.SensingMap;
import OEI.AMV.ECS.SVQ.MPC.SOQ.OEM.E.SensingMap_E;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import SVQ.stable.StableString;
public class LenovoInit{
	public SensingMap getSensingMap() {
		return sensingMap;
	}

	public void I_SensingMap(SensingMap sensingMap) {
		this.sensingMap = sensingMap;
	}

	public EnvironmentInit getEnvironmentInit() {
		return environmentInit;
	}

	public void I_EnvironmentInit(EnvironmentInit environmentInit) {
		this.environmentInit = environmentInit;
	}

	private SensingMap sensingMap;
	private EnvironmentInit environmentInit;

	@SuppressWarnings("unused")
	public static void main(String[] argv) throws IOException {
		LenovoInit lenovoInit = new LenovoInit();
		lenovoInit.IV_(StableString.text1);
		Map<String, EmotionSample> environmentSampleMap = lenovoInit.getEnvironmentInit().getEmotionSampleMap();
		Map<String, Object> lenovo = lenovoInit.getSensingMap().getLenovoMap();
	}

	public void IV_(String text) throws IOException {
		environmentInit = new EnvironmentInit();
		environmentInit.IV_(text);
		sensingMap = new SensingMap_E();
		sensingMap.IV_LenovoMap(environmentInit.get_A());	
	}
	
	public void IV_Exclude_A(String text, CogsBinaryForest_AE _A) throws IOException {
		environmentInit = new EnvironmentInit();
		environmentInit.IV_Exclude_A(text, _A);
		sensingMap = new SensingMap_E();
		sensingMap.IV_LenovoMap(environmentInit.get_A());	
	}
}