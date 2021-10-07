package OSI.OPE.OEQ.MCQ.OVU.PQE.osgi;
import java.util.HashMap;
import java.util.Map;



import javax.sound.sampled.AudioInputStream;
import javax.swing.JPanel;
import javax.swing.JTable;

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
	public HashMap<String, Object> topOutput;//准备做文章流计算的内存 罗瑶光20211008
	
	public JTable midtablein;
	public int[][] midgin;
	public AudioInputStream midaisin;
	public LYGFileIO midlygin;
	public HashMap<String, Object> midOutput;//准备做文章流计算的内存 罗瑶光20211008

	public JTable downtablein;
	public int[][] downgin;
	public AudioInputStream downaisin;
	public LYGFileIO downlygin;
	public HashMap<String, Object> downOutput;//准备做文章流计算的内存 罗瑶光20211008
	
	public OSU_AVQ_ASQ_OPE_OPC_ECI(){
	}
	@Override  
	public OSU_AVQ_ASQ_OPE_OPC_ECI clone() {  
		return addr;  
	}
}
