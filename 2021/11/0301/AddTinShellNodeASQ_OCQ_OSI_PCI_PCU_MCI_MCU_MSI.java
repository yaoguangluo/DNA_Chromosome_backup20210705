package OSI.OSU.SI.ASQ.OSD.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.tinShell;
import java.awt.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;

import OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash.ThisCanvas;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;

public class AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI{	
	//public AddTinShellRun addTinShellRun;//�ó���pipe line �����á�
	public AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text) throws IOException{
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= new ImageIcon(this.getClass().getResource("editPaneReader.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("Tin��shell�ű�");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
	}
	public AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() throws IOException{
		thisIcon= new ImageIcon(this.getClass().getResource("editPaneReader.jpg"));
		SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("Tin��shell�ű�");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
	}
	public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) throws IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ= new AddTinShellView();
		//������ʱ������ɣ���null check ���ֿ�
		SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI= new AddTinShellRun();
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES= new AddTinShellPanel((AddTinShellRun) SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI, this.text, this.tableData_old);
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AOI_AOD_AOU_AOQ_VES.config();
		showed= false;
		isConfiged= true;//��¼����
	}
	//��һ��etlִ�е�ʱ����Ϊû���������࣬���Ը��಻��cast�����ࡣ���ǿ�ʼ��Ƴ������newģʽ��
	public void OPE_E(JTextPane jTextPane)  throws FileNotFoundException, IOException, CloneNotSupportedException{
		AddTinShellView _OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ= (AddTinShellView)SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ;
		//addTinShellRun=  new AddTinShellRun();//SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI;
		//SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI
		//�Ȱ�tinshellrun�ó�����һ��ִ�е��ϲ�ȥ���ٵ��������������� 20211103
		if(null!= SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topOutput) {
			System.out.println(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topOutput.size());
		}
		if(null!= SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.midOutput) {
			System.out.println(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.midOutput.size());
		}
		if(null!= SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.downOutput) {
			System.out.println(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.downOutput.size());
		}
		((AddTinShellRun)SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI).run(_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ, this);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane)  throws Exception{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.view();
		showed = true;
	}
	public OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI AOP_MVE_CSI_DUQ() throws CloneNotSupportedException, IOException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI = new AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text);   
		return SQ_OSU_MSQ_OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;  
	}
}
