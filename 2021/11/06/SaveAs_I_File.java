package OSI.OPE.MSI.OEI.SOI.SMQ.save;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.FileWriter;

import MVQ.filenameFilter.TXTFilter;
import SVQ.stable.StableAnnotation;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
//import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI_XCDX;
//׼������Ӧ�¼���ֲ�����
public class SaveAs_I_File{
	public static void Save(LinkNode first) {
		FileDialog filedialog= new FileDialog(new Frame(), StableAnnotation.DOC_CREATE
				, FileDialog.LOAD);
		filedialog.setFilenameFilter(new TXTFilter(StableAnnotation.FILE_FORMAT_ETL));
		filedialog.setVisible(true);
		String fileSavepath= filedialog.getDirectory()+ filedialog.getFile();
		System.out.println(fileSavepath);
		if(new File(fileSavepath).isFile()
				&& fileSavepath.contains(StableAnnotation.FILE_FORMAT_ETL)) {
			System.out.println(StableAnnotation.DOC_EXIST);
			return;
		}
		fileSavepath= fileSavepath+ StableAnnotation.FILE_FORMAT_ETL;
		System.out.println(fileSavepath);
		//create file and save
		try {
			FileWriter fileWriter= new FileWriter(fileSavepath);
			LinkNode node= first;
			while(null!= node) {
				//����ȡ��û�Ѷȡ��������Ϣд���ļ���
				//�ڵ����꣬�ڵ����� �ڵ������
				String NodeCoordinationX= ""+ node.x;
				String NodeCoordinationY= ""+ node.y;
				String NodeName= ""+ node.name;
				String NodeID=""+ node.ID;
				String flash=""+ node.flash;
				String beconnect= ""+ node.beconnect;
				String leftChoose= ""+ node.leftChoose;
				String rightChoose= ""+ node.rightChoose;
				String tBeconnect= ""+ node.tBeconnect;
				String tBeconnectX= ""+ node.tBeconnectX;
				String tBeconnectY= ""+ node.tBeconnectY;
				String tBeconnetName= ""+ node.tBeconnetName;
				String tBeconnectID= ""+ node.tBeconnectID;
				//String tBeconnectPrimaryKey= ""+ node.dBeconnectPrimaryKey;//è�����
				String tBeconnectPrimaryKey= ""+ node.tBeconnectPrimaryKey;//�޳�,�Ժ��ĵ���Ҳ�Ż��¡������� 20211102
				String mBeconnect= ""+ node.mBeconnect;
				String mBeconnectX= ""+ node.mBeconnectX;
				String mBeconnectY= ""+ node.mBeconnectY;
				String mBeconnetName= ""+ node.mBeconnetName;
				String mBeconnectID= ""+ node.mBeconnectID;
				String mBeconnectPrimaryKey= ""+ node.mBeconnectPrimaryKey;
				String dBeconnect= ""+ node.dBeconnect;
				String dBeconnectX= ""+ node.dBeconnectX;
				String dBeconnectY= ""+ node.dBeconnectY;
				String dBeconnetName= ""+ node.dBeconnetName;
				String dBeconnectID= ""+ node.dBeconnectID;
				String dBeconnectPrimaryKey= ""+ node.dBeconnectPrimaryKey;
				String primaryKey= ""+ node.primaryKey;
				String nodeConfiguration= ""+ node.thisFace.nodeConfiguration.replace("\r\n", "");//Ԫ�����ܻ���
				nodeConfiguration= nodeConfiguration.substring(0, nodeConfiguration.length()> 5000? 5000:nodeConfiguration.length());//���������
				String isConfiged= ""+ node.thisFace.isConfiged;
				String isExecuted= ""+ node.thisFace.isExecuted;
				//����
				//����Ԫ���������������ʽ��ֱ�ӵ��ýӿھ����ˣ��Ȳ�����Կ�׸��ʼ���,������Ҫ����ı������ࡢ
				//������20211106
				//���Ҫ�üǵ��ı��ĳ���Ҫ��Ⱑ����Ҫһ�м�ǧ������Ҳ����һ��дһ�У���Ȼ��ʱ����лῨ�����ĳ�bufferIO�����ȵ����¡�
				//new FullDNATokenPDI_XCDX().initonETLSect("");
				//new FullDNATokenPDI().initonDeSect("");
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("NodeCoordinationX:"+ NodeCoordinationX));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("NodeName:"+ NodeName));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("NodeCoordinationY:"+ NodeCoordinationY));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("NodeID:"+ NodeID));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("flash:"+ flash));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("beconnect:"+ beconnect));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("leftChoose:"+ leftChoose));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("rightChoose:"+ rightChoose));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("tBeconnect:"+ tBeconnect));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("tBeconnectX:"+ tBeconnectX));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("tBeconnectY:"+ tBeconnectY));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("tBeconnetName:"+ tBeconnetName));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("tBeconnectID:"+ tBeconnectID));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("tBeconnectPrimaryKey:"+ tBeconnectPrimaryKey));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("mBeconnect:"+ mBeconnect));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("mBeconnectX:"+ mBeconnectX));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("mBeconnectY:"+ mBeconnectY));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("mBeconnetName:"+ mBeconnetName));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("mBeconnectID:"+ mBeconnectID));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("mBeconnectPrimaryKey:"+ mBeconnectPrimaryKey));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("dBeconnect:"+ dBeconnect));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("dBeconnectX:"+ dBeconnectX));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("dBeconnectY:"+ dBeconnectY));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("dBeconnetName:"+ dBeconnetName));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("dBeconnectID:"+ dBeconnectID));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("dBeconnectPrimaryKey:"+ dBeconnectPrimaryKey));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("primaryKey:"+ primaryKey));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("nodeConfiguration:"+ nodeConfiguration));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("isConfiged:"+ isConfiged));
				fileWriter.write("\r\n");
				fileWriter.write(new FullDNATokenPDI_XCDX().initonETLSect("isExecuted:"+ isExecuted));
				fileWriter.write("\r\n");
				//�ָ�
				String split="##############################";
				fileWriter.write("\r\n");
				fileWriter.write(split);
				fileWriter.flush();
				if(null== node.next) {
					break;
				}
				node= node.next;
			}	
			fileWriter.close();
		}catch(Exception saveFile) {
		}
	}
}