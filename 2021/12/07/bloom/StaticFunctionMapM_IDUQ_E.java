package SEM.bloom;

import OSI.SSI.ASU.OSU.PSU.MSU.ouler.Q_OulerRing;
import OSI.SSI.ASU.OSU.PSU.MSU.ouler.Q_OulerRing16;
import OSI.SSI.ASU.OSU.PSU.MSU.pde.DecadeToPDS;
import OSI.SSI.ASU.OSU.PSU.MSU.pde.DecadeToPDS16;
import OSI.SSI.ASU.OSU.PSU.MSU.pds.PDE_PDS_DL;
import OSI.SSI.ASU.OSU.PSU.MSU.pds.PDE_PDS_DL16;

//著作权人+ 作者= 罗瑶光
public class StaticFunctionMapM_IDUQ_E implements StaticFunctionMapM_IDUQ_C{

	@Override
	public Q_OulerRing getQ_OulerRing() {
		return new Q_OulerRing();
	}

	@Override
	public Q_OulerRing16 getQ_OulerRing16() {
		return new Q_OulerRing16();
	}

	@Override
	public DecadeToPDS getDecadeToPDS() {
		return new DecadeToPDS();
	}

	@Override
	public DecadeToPDS16 getDecadeToPDS16() {
		return new DecadeToPDS16();
	}

	@Override
	public PDE_PDS_DL getPDE_PDS_DL() {
		return new PDE_PDS_DL();
	}

	@Override
	public PDE_PDS_DL16 getPDE_PDS_DL16() {
		return new PDE_PDS_DL16();
	}

}
