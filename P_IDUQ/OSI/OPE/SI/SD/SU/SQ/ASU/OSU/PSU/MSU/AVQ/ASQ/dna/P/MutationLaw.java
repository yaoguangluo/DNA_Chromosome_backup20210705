package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P;
public class MutationLaw{
	public RST mutation(RST father, RST mother) {
		RST son= new RST();
		//random
		if(Math.random()>0.5) {
			son.I_FatherDeque(father.getFatherDeque());
		}else {
			son.I_FatherDeque(mother.getFatherDeque());
		}
		
		if(Math.random()<0.5) {
			son.I_MotherDeque(mother.getMotherDeque());
		}else {
			son.I_MotherDeque(father.getMotherDeque());
		}	
		return son;
	}
}