package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde;

import java.util.List;

public class InitonLinkDNA {
	private Initon initonLink;
	private List<Initon> initonList;
	
	public void I_NextIniton(Initon initon) {
		initonLink= initonLink.addNextInitons(initon);
		initonList.add(initon);
	}
	public void I_PrevIniton(Initon initon) {
		initonLink= initonLink.addPrevInitons(initon);
		initonList.add(0, initon);
	}
	public Initon getInitonLink() {
		return initonLink;
	}
	
	public void I_InitonLink(Initon initons) {
		initonLink= initons;
	}
}