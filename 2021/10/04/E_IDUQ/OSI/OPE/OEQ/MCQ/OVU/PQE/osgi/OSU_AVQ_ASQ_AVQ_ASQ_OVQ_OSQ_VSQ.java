package OSI.OPE.OEQ.MCQ.OVU.PQE.osgi;
import java.awt.Panel;

import java.awt.ScrollPane;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.AudioInputStream;
import javax.swing.JFrame;
import javax.swing.JTable;

import PEU.P.movie.LYGFileIO;

public class OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ extends JFrame implements Cloneable{
	private static final long serialVersionUID = 1L;
	public OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ objectView;
	public ScrollPane scrollPane;
	public Panel panel;
	public int h;
	public int w;
	public boolean close= false;
	public JTable tableout;
	public Map<String, Integer> topMapOut;
	public int[][] gout;
	public AudioInputStream aisout;
	public AudioInputStream aiscurout;
	public LYGFileIO lygout;
	public BufferedImage imageout;
	public HashMap<String, Object> outputOut;//准备做文章流计算的内存 罗瑶光20211008
	public OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ() {
	}
	public void view() throws Exception{
	}
	public OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ clone() {  	
		return objectView;  
	}  
}
