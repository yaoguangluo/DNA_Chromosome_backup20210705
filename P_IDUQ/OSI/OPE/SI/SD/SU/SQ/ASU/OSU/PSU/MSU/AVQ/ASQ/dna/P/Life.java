package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P;
import java.util.concurrent.ConcurrentLinkedDeque;
public class Life{
	public ConcurrentLinkedDeque<RST> getLife() {
		return lifeDeque;
	}
	
	public void I_Life(ConcurrentLinkedDeque<RST> lifeDeque) {
		this.lifeDeque= lifeDeque;
	}

	private ConcurrentLinkedDeque<RST> lifeDeque;
	public void born() {
		PDN helpFather= new PDN();
		PDN loveFather= new PDN();
		PDN workFather= new PDN();
		PDN studyFather= new PDN();
		PDN safeFather= new PDN();
		PDN creativeFather= new PDN();
		helpFather.IV_(true);
		loveFather.IV_(true);
		workFather.IV_(true);
		studyFather.IV_(true);
		safeFather.IV_(true);
		creativeFather.IV_(true);	
		ConcurrentLinkedDeque<PDN> PdnsFather= new ConcurrentLinkedDeque<>();
		PdnsFather.add(loveFather);
		PdnsFather.add(safeFather);
		PdnsFather.add(studyFather);
		PdnsFather.add(creativeFather);
		PdnsFather.add(workFather);
		PdnsFather.add(helpFather);
		DNA dnaFather= new DNA();
		dnaFather.I_MaskLineDeque(PdnsFather);
		dnaFather.I_FunctionLineDeque(new CopyLaw().copy(PdnsFather));
		dnaFather.I_MaskLineMap(new CopyLaw().copyMap(dnaFather.getFunctionLineDeque()));
		dnaFather.I_FunctionLineMap(new CopyLaw().copyMap(dnaFather.getMaskLineDeque()));
		
		PDN helpMother= new PDN();
		PDN loveMother= new PDN();
		PDN workMother= new PDN();
		PDN studyMother= new PDN();
		PDN safeMother= new PDN();
		PDN creativeMother= new PDN();
		helpMother.IV_(false);
		loveMother.IV_(false);
		workMother.IV_(false);
		studyMother.IV_(false);
		safeMother.IV_(false);
		creativeMother.IV_(false);	
		ConcurrentLinkedDeque<PDN> PdnsMother= new ConcurrentLinkedDeque<>();
		PdnsMother.add(loveMother);
		PdnsMother.add(safeMother);
		PdnsMother.add(studyMother);
		PdnsMother.add(creativeMother);
		PdnsMother.add(workMother);
		PdnsMother.add(helpMother);
		DNA dnaMother= new DNA();
		dnaMother.I_MaskLineDeque(PdnsMother);
		dnaMother.I_FunctionLineDeque(new CopyLaw().copy(PdnsMother));
		dnaMother.I_MaskLineMap(new CopyLaw().copyMap(dnaMother.getFunctionLineDeque()));
		dnaMother.I_FunctionLineMap(new CopyLaw().copyMap(dnaMother.getMaskLineDeque()));
		
		RST rst= new RST();
		rst.I_FatherDeque(dnaFather);
		rst.I_MotherDeque(dnaMother);
		ConcurrentLinkedDeque<RST> born= new ConcurrentLinkedDeque<>();
		born.add(rst);
		this.I_Life(born);
	}

	public void evolve() {

	}

    public void study(String token) {
		
	}
    
	public void IQ_Information() {
		
	}
}