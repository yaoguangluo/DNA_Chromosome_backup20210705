package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P;

public class DatingLaw{
	public RST dating(RST father, RST mother) {
		RST son= new RST();
		//random
		if(Math.random()>0.5) {
			son.I_FatherDeque(father.getFatherDeque());
		}else {
			son.I_FatherDeque(father.getMotherDeque());
		}
		
		if(Math.random()<0.5) {
			son.I_MotherDeque(mother.getMotherDeque());
		}else {
			son.I_MotherDeque(mother.getFatherDeque());
		}	
		return son;
	}
}