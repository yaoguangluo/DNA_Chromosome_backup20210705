package SEM.bloom;

import OCI.AMV.ECS.SVQ.MPC.fhmm.C.SensingMap;
import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import OCI.ME.analysis.C.A;
import OCI.ME.analysis.C.A_XCDX_Map;
import OCI.ME.analysis.C.BinaryForest_A;
import OCI.ME.analysis.C.CogsBinaryForest_A;
import OCI.ME.euclid.C.Euclid_C;
import OCI.ME.liner.C.Quick6DLuoYaoguangSort;
import OCI.ME.nero.C.NERO_C;
import OCI.ME.nero.C.NERO_C_OneTime;
import OCI.ME.nlp.C.NLP_C;
import OCI.ME.nlp.C.Nlp_C_XCDX_A;
import OCI.ME.nlp.C.Nlp_C_XCDX_S;
import OCI.ME.pos.C.Pos_C_XCDX_E;
import OCI.ME.pos.C.Pos_C_XCDX_O;
import OCI.ME.pos.C.Pos_C_XCDX_P;
import OCI.OPM.VEC.SVQ.MPC.fhmm.C.BehaviorMap;
import OCI.SVQ.MPC.fhmm.C.FMHMMList;
import OEI.AMV.ECS.SVQ.MPC.SOQ.OEM.E.SensingMap_E;
import OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import OEI.ME.analysis.E.AE;
import OEI.ME.analysis.E.AE_XCDX_Map;
import OEI.ME.analysis.E.BinaryForest_AE;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OEI.ME.euclid.E.Euclid_CE;
import OEI.ME.liner.E.Quick6DLuoYaoguangSort_E;
import OEI.ME.nero.E.NERO_CE;
import OEI.ME.nero.E.NERO_C_OneTime_E;
import OEI.ME.nlp.E.Nlp_CE_XCDX;
import OEI.ME.nlp.E.Nlp_CE_XCDX_A;
import OEI.ME.nlp.E.Nlp_CE_XCDX_S;
import OEI.ME.pos.E.Pos_CE_XCDX_E;
import OEI.ME.pos.E.Pos_CE_XCDX_O;
import OEI.ME.pos.E.Pos_CE_XCDX_P;
import OEI.OPM.VEC.SVQ.MPC.fhmm.E.BehaviorMap_E;
import OEI.SVQ.MPC.fhmm.E.FMHMMList_E;
//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public class StaticFunctionMapE_AOPM_E implements StaticFunctionMapE_AOPM_C {

	@Override
	public SensingMap getSensingMap() {
		return new SensingMap_E();
	}

	@Override
	public EmotionMap getEmotionMap() {
		return new EmotionMap_E();
	}

	@Override
	public CogsBinaryForest_A getCogsBinaryForest_A() {
		return new CogsBinaryForest_AE();
	}

	@Override
	public Euclid_C getEuclid_C() {
		return new Euclid_CE();
	}

	@Override
	public Quick6DLuoYaoguangSort getQuick6DLuoYaoguangSort() {
		return new Quick6DLuoYaoguangSort_E();
	}

	@Override
	public NERO_C_OneTime getNERO_C_OneTime() {
		return new NERO_C_OneTime_E();
	}
	
	@Override
	public NERO_C getNERO_C() {
		return new NERO_CE();
	}
	
	@Override
	public NLP_C getNLP_C() {
		return new Nlp_CE_XCDX();
	}

	@Override
	public BehaviorMap getBehaviorMap() {
		return new BehaviorMap_E();
	}

	@Override
	public FMHMMList getFMHMMList() {
		return new FMHMMList_E();
	}

	@Override
	public Pos_C_XCDX_P getPos_C_XCDX_P() {
		return new Pos_CE_XCDX_P();
	}

	@Override
	public Pos_C_XCDX_E getPos_C_XCDX_E() {
		return new Pos_CE_XCDX_E();
	}

	@Override
	public Pos_C_XCDX_O getPos_C_XCDX_O() {
		return new Pos_CE_XCDX_O();
	}

	@Override
	public Nlp_C_XCDX_S getNlp_C_XCDX_S() {
		return new Nlp_CE_XCDX_S();
	}

	@Override
	public Nlp_C_XCDX_A getNlp_C_XCDX_A() {
		return new Nlp_CE_XCDX_A();
	}

	@Override
	public A_XCDX_Map getA_XCDX_Map() {
		return new AE_XCDX_Map();
	}

	@Override
	public A getA() {
		return new AE();
	}

	@Override
	public BinaryForest_A getBinaryForest_A() {
		return new BinaryForest_AE();
	}
	
}
