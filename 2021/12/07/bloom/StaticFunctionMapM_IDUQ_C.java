package SEM.bloom;

import OSI.SSI.ASU.OSU.PSU.MSU.ouler.Q_OulerRing;
import OSI.SSI.ASU.OSU.PSU.MSU.ouler.Q_OulerRing16;
import OSI.SSI.ASU.OSU.PSU.MSU.pde.DecadeToPDS;
import OSI.SSI.ASU.OSU.PSU.MSU.pde.DecadeToPDS16;
import OSI.SSI.ASU.OSU.PSU.MSU.pds.PDE_PDS_DL;
import OSI.SSI.ASU.OSU.PSU.MSU.pds.PDE_PDS_DL16;

//����Ȩ��+ ����= ������
public interface StaticFunctionMapM_IDUQ_C {

	public static void load(StaticFunctionMapM_IDUQ_E staticFunctionMapM_IDUQ_E) {
		// TODO Auto-generated method stub
		//�Ժ��װ
		staticFunctionMapM_IDUQ_E.annotationMap.put("getQ_OulerRing", "getQ_OulerRing");
		staticFunctionMapM_IDUQ_E.annotationMap.put("getQ_OulerRing16", "getQ_OulerRing16");
		staticFunctionMapM_IDUQ_E.annotationMap.put("getDecadeToPDS", "getDecadeToPDS");
		staticFunctionMapM_IDUQ_E.annotationMap.put("getDecadeToPDS16", "getDecadeToPDS16");
		staticFunctionMapM_IDUQ_E.annotationMap.put("getPDE_PDS_DL", "getPDE_PDS_DL");
		staticFunctionMapM_IDUQ_E.annotationMap.put("getPDE_PDS_DL16", "getPDE_PDS_DL16");

	}
	public Q_OulerRing getQ_OulerRing();
	public Q_OulerRing16 getQ_OulerRing16();
	public DecadeToPDS getDecadeToPDS();
	public DecadeToPDS16 getDecadeToPDS16();
	public PDE_PDS_DL getPDE_PDS_DL();
	public PDE_PDS_DL16 getPDE_PDS_DL16();
	
}
