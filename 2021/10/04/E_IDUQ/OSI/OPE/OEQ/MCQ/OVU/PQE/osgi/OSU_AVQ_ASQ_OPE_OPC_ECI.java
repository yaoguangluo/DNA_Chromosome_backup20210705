package OSI.OPE.OEQ.MCQ.OVU.PQE.osgi;
import java.util.Map;



import javax.sound.sampled.AudioInputStream;
import javax.swing.JPanel;
import javax.swing.JTable;

import OSI.OSU.SI.ASQ.OSD.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.tinShell.TinMap;
import PEU.P.movie.LYGFileIO;

public class OSU_AVQ_ASQ_OPE_OPC_ECI extends JPanel implements Cloneable{
	private static final long serialVersionUID = 1L;
	public OSU_AVQ_ASQ_OPE_OPC_ECI addr;
	public JTable toptablein;
	public Map<String, Integer> topMapIn;
	public int[][] topgin;
	public String topsin;
	public AudioInputStream topaisin;
	public LYGFileIO toplygin;
	public TinMap topOutput;//准备做文章流计算的内存 罗瑶光20211008
	
	public JTable midtablein;
	public int[][] midgin;
	public AudioInputStream midaisin;
	public LYGFileIO midlygin;
	public TinMap midOutput;//准备做文章流计算的内存 罗瑶光20211008

	public JTable downtablein;
	public int[][] downgin;
	public AudioInputStream downaisin;
	public LYGFileIO downlygin;
	public TinMap downOutput;//准备做文章流计算的内存 罗瑶光20211008
	
	public OSU_AVQ_ASQ_OPE_OPC_ECI(){
	}
	@Override  
	public OSU_AVQ_ASQ_OPE_OPC_ECI clone() {  
		return addr;  
	}
}
