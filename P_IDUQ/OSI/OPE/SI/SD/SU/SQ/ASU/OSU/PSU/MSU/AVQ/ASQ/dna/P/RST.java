package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P;

public class RST{
	public DNA getFatherDeque() {
		return fatherDeque;
	}
	
	public void I_FatherDeque(DNA fatherDeque) {
		this.fatherDeque= fatherDeque;
	}
	
	public DNA getMotherDeque() {
		return motherDeque;
	}
	
	public void I_MotherDeque(DNA motherDeque) {
		this.motherDeque= motherDeque;
	}
	
	private DNA fatherDeque;
	private DNA motherDeque;
}