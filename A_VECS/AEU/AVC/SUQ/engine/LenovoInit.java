package AEU.AVC.SUQ.engine;
import java.io.IOException;

import java.util.Map;

import AEU.OCI.AVC.SUQ.estimation.C.EmotionSample;
import OCI.AMV.ECS.SVQ.MPC.fhmm.C.SensingMap;
import OCI.ME.analysis.C.A;
import OEI.AMV.ECS.SVQ.MPC.SOQ.OEM.E.SensingMap_E;
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
		lenovoInit.init(StableString.text1);
		Map<String, EmotionSample> environmentSampleMap = lenovoInit.getEnvironmentInit().getEmotionSampleMap();
		Map<String, Object> lenovo = lenovoInit.getSensingMap().getLenovoMap();
	}

	public void init(String text) throws IOException {
		environmentInit = new EnvironmentInit();
		environmentInit.init(text);
		sensingMap = new SensingMap_E();
		sensingMap.initLenovoMap(environmentInit.get_A());	
	}
	
	public void initExclude_A(String text, A _A) throws IOException {
		environmentInit = new EnvironmentInit();
		environmentInit.initExclude_A(text, _A);
		sensingMap = new SensingMap_E();
		sensingMap.initLenovoMap(environmentInit.get_A());	
	}
}