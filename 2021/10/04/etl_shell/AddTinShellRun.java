package OSI.OSU.SI.ASQ.OSD.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.tinShell;
import java.awt.ScrollPane;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.JFrame;

import ME.APM.VSQ.HRJFrame;
import ME.APM.VSQ.OPE.config.ShellJPanel;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;

public class AddTinShellRun extends OSU_AVQ_ASQ_OPE_OPC_ECI{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public AddTinShellRun( ) throws IOException{	
		super();
	}
	
	public void run(final AddTinShellView SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ) throws IOException{
		 SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.tableout= this.toptablein; 	
		 SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut= this.topOutput; 
		 
		 if(null== SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut) {
			 SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut= new HashMap<String, Object>();
		 }
		 //�����һ�� ֻ�������ӵ�ģʽ���Ժ���������ֵ�
		 JFrame jframe =new JFrame();
		 ShellJPanel ShellJPanel= new ShellJPanel(HRJFrame.NE, SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut);
		 //֮ǰͳһ�ڵ������300*300����Ϊ����ĳ�800*750����̫�þ͸ɴ�ֿ���
		 ScrollPane scrollPane= new ScrollPane();
		 scrollPane.setSize(810, 760);
		 scrollPane.add(ShellJPanel);
		 jframe.setLayout(null);
		 jframe.add(scrollPane);
		 jframe.setSize(810,760);
		 jframe.setIconImage(HRJFrame.NE.logo.getImage());
		 jframe.setResizable(false);
		 jframe.setVisible(true);
	}
}
