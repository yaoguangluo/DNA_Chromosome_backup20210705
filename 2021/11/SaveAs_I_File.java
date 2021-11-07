package OSI.OPE.MSI.OEI.SOI.SMQ.save;
import java.awt.FileDialog;

import java.awt.Frame;
import java.io.File;
import java.io.FileWriter;
import java.io.UnsupportedEncodingException;

import ESU.string.String_ESU;
import MSU.AMS.VQS.SQV.SI.OSU.SMV.http.SessionValidation;
import MVQ.filenameFilter.TXTFilter;
import SVQ.stable.StableAnnotation;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
//import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
//import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI_XCDX;
import PEU.P.dna.Token;
import PEU.P.dna.TokenCerts;

//׼������Ӧ�¼���ֲ�����
//��Ƴ�һ�������ļ�һ����Կ�ļ���
//����������
public class SaveAs_I_File{
	//׼����ʼӦ�ò����¡�
	public static String[] getRandomDNAkey(SessionValidation sessionValidation, String password)
			throws UnsupportedEncodingException {
		if(null!= sessionValidation) {
			sessionValidation= new SessionValidation();
		}
		String[] string= new String[4];
		//����lock
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA_ETL(password, false, null);
		//����pde��pds
		Token token= sessionValidation.sessionInitByTokenPDICertsDNA(tokenCerts);
		String passwordString= String_ESU.charsetSwap(token.getmPassword(), "GBK", "GBK");
		String passwordEncoder= String_ESU.stringToURIencode(passwordString, "UTF8");
		//System.out.println("pds--1>"+ tokenCerts.getPds());
		String passwordPDE= passwordEncoder.toString();//�Ժ�������װ��lineд�еĺ���������ѭ��
		String passwordPDS= token.getmPasswordPDS().toString();
		String lock= tokenCerts.getPdnLock();
		String de= token.getUpdsde();
		String ds= token.getUpdsds();
		String ie= token.getUpdsie();
		String is= token.getUpdsis();
		String keyETL=lock+ ">_<"+ de+ ">_<"+ ds+ ">_<"+ ie+ ">_<"+ is;
		string[0]= tokenCerts.getPdnPassword();//������㣬����������
		string[1]= passwordPDE;//��������㣬�����ڵ�½��֤
		string[3]= passwordPDS;//��������㣬�����ڵ�½��֤
		string[3]= keyETL;
		return string;
	}

	public static void Save(LinkNode first) {
		//��ʼ�� dna�����ļ��ĺ���
		//����
		//������Ƶ�һ�μ������������ô����ÿһ�ж�Ҫ���м��ܡ�
		//׼��������ּ�����ʽ����һ�� pde������ܣ��ڶ���pds������ܣ������ּ򵥵���������ܡ�
		//׼����ʼ�������� 20211117
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
			SessionValidation sessionValidation= new SessionValidation();
			//String[] string= SaveAs_I_File.getRandomDNAkey(sessionValidation, "");
			FileWriter fileWriter= new FileWriter(fileSavepath);
			FileWriter fileWriterKey= new FileWriter(fileSavepath + ".dna");
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
				fileWriterKey.write("\r\n");
				String[] string= getRandomDNAkey(sessionValidation, "NodeCoordinationX:"+ NodeCoordinationX);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "NodeName:"+ NodeName);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "NodeCoordinationY:"+ NodeCoordinationY);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "NodeID:"+ NodeID);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "flash:"+ flash);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "beconnect:"+ beconnect);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "leftChoose:"+ leftChoose);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "rightChoose:"+ rightChoose);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "tBeconnect:"+ tBeconnect);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "tBeconnectX:"+ tBeconnectX);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "tBeconnectY:"+ tBeconnectY);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "tBeconnetName:"+ tBeconnetName);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "tBeconnectID:"+ tBeconnectID);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "tBeconnectPrimaryKey:"+ tBeconnectPrimaryKey);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "mBeconnect:"+ mBeconnect);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "mBeconnectX:"+ mBeconnectX);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "mBeconnectY:"+ mBeconnectY);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "mBeconnetName:"+ mBeconnetName);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "mBeconnectID:"+ mBeconnectID);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "mBeconnectPrimaryKey:"+ mBeconnectPrimaryKey);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "dBeconnect:"+ dBeconnect);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "dBeconnectX:"+ dBeconnectX);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "dBeconnectY:"+ dBeconnectY);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "dBeconnetName:"+ dBeconnetName);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "dBeconnectID:"+ dBeconnectID);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "dBeconnectPrimaryKey:"+ dBeconnectPrimaryKey);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "primaryKey:"+ primaryKey);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "nodeConfiguration:"+ nodeConfiguration);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "isConfiged:"+ isConfiged);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				string= getRandomDNAkey(sessionValidation, "isExecuted:"+ isExecuted);
				fileWriter.write(string[0]);
				fileWriterKey.write(string[3]);

				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");
				//�ָ�
				String split="##############################";
				fileWriter.write("\r\n");
				fileWriterKey.write("\r\n");

				fileWriter.write(split);
				fileWriter.flush();
				fileWriterKey.write(split);
				fileWriterKey.flush();

				if(null== node.next) {
					break;
				}
				node= node.next;
			}	
			fileWriter.close();
			fileWriterKey.close();
		}catch(Exception saveFile) {
		}
	}
}