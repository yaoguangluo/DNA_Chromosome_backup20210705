package OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash;
import javax.swing.JFrame;

import SVQ.stable.StableAnnotation;
public class Flash extends GUISample{
	private static final long serialVersionUID = 1L;
	@SuppressWarnings(StableAnnotation.TAG_DEPRECATION)
	public static void main(String args[]){
		GUISample NE= new GUISample();
		JFrame frame= new JFrame("Deta ETL 1.0.2");   
        frame.setLayout(null);   
        frame.resize(800, 440);   
        frame.show();         
        frame.add(NE);   
        NE.init();
		NE.start();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}