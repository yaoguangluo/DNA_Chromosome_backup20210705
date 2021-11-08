package OSI.OPE.MSI.OEI.SOI.SMQ.save;
import java.awt.FileDialog;

import java.awt.Frame;
import java.io.File;
import java.io.FileWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

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
	public static Map<String, String> getRandomDNAkey(SessionValidation sessionValidation, String password)
			throws UnsupportedEncodingException {
		if(null!= sessionValidation) {
			sessionValidation= new SessionValidation();
		}
		String[] string= new String[4];
		Map<String, String> map= new HashMap<>();
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
		string[2]= passwordPDS;//��������㣬�����ڵ�½��֤
		string[3]= keyETL;
		map.put(Stable.DNA_TOKEN_LOCK, tokenCerts.getPdnPassword());
		map.put(Stable.DNA_TOKEN_PDE, passwordPDE);
		map.put(Stable.DNA_TOKEN_PDS, passwordPDS);
		map.put(Stable.DNA_TOKEN_KEY, keyETL);
		return map;
		// ע����������£� ����� ������ 20211108
		// ԭʼ���� <-����-> ����Ԫ������ <-����-> ɸ�������� <-������-> ��չ����PDE <-����-> ��˿������pds 
		// <--------------------����--------------------->         <--------------����------------>
		//                                             <---������--->      
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
			//String[] string= SaveAs_I_File.getRandomDNAkey(sessionValidation, Stable.EMPTY_STRING);
			FileWriter fileWriter= new FileWriter(fileSavepath);
			FileWriter fileWriterKey= new FileWriter(fileSavepath + ".dna");
			LinkNode node= first;
			while(null!= node) {
				//����ȡ��û�Ѷȡ��������Ϣд���ļ���
				//�ڵ����꣬�ڵ����� �ڵ������
				String NodeCoordinationX= Stable.EMPTY_STRING+ node.x;
				String NodeCoordinationY= Stable.EMPTY_STRING+ node.y;
				String NodeName= Stable.EMPTY_STRING+ node.name;
				String NodeID=Stable.EMPTY_STRING+ node.ID;
				String flash=Stable.EMPTY_STRING+ node.flash;
				String beconnect= Stable.EMPTY_STRING+ node.beconnect;
				String leftChoose= Stable.EMPTY_STRING+ node.leftChoose;
				String rightChoose= Stable.EMPTY_STRING+ node.rightChoose;
				String tBeconnect= Stable.EMPTY_STRING+ node.tBeconnect;
				String tBeconnectX= Stable.EMPTY_STRING+ node.tBeconnectX;
				String tBeconnectY= Stable.EMPTY_STRING+ node.tBeconnectY;
				String tBeconnetName= Stable.EMPTY_STRING+ node.tBeconnetName;
				String tBeconnectID= Stable.EMPTY_STRING+ node.tBeconnectID;
				//String tBeconnectPrimaryKey= Stable.EMPTY_STRING+ node.dBeconnectPrimaryKey;//è�����
				String tBeconnectPrimaryKey= Stable.EMPTY_STRING+ node.tBeconnectPrimaryKey;//�޳�,�Ժ��ĵ���Ҳ�Ż��¡������� 20211102
				String mBeconnect= Stable.EMPTY_STRING+ node.mBeconnect;
				String mBeconnectX= Stable.EMPTY_STRING+ node.mBeconnectX;
				String mBeconnectY= Stable.EMPTY_STRING+ node.mBeconnectY;
				String mBeconnetName= Stable.EMPTY_STRING+ node.mBeconnetName;
				String mBeconnectID= Stable.EMPTY_STRING+ node.mBeconnectID;
				String mBeconnectPrimaryKey= Stable.EMPTY_STRING+ node.mBeconnectPrimaryKey;
				String dBeconnect= Stable.EMPTY_STRING+ node.dBeconnect;
				String dBeconnectX= Stable.EMPTY_STRING+ node.dBeconnectX;
				String dBeconnectY= Stable.EMPTY_STRING+ node.dBeconnectY;
				String dBeconnetName= Stable.EMPTY_STRING+ node.dBeconnetName;
				String dBeconnectID= Stable.EMPTY_STRING+ node.dBeconnectID;
				String dBeconnectPrimaryKey= Stable.EMPTY_STRING+ node.dBeconnectPrimaryKey;
				String primaryKey= Stable.EMPTY_STRING+ node.primaryKey;
				String nodeConfiguration= Stable.EMPTY_STRING
						+ node.thisFace.nodeConfiguration.replace(Stable.LINE_ENTER, Stable.EMPTY_STRING);//Ԫ�����ܻ���
				nodeConfiguration= nodeConfiguration.substring(0
						, nodeConfiguration.length()> 5000? 5000:nodeConfiguration.length());//���������
				String isConfiged= Stable.EMPTY_STRING+ node.thisFace.isConfiged;
				String isExecuted= Stable.EMPTY_STRING+ node.thisFace.isExecuted;
				//����
				//����Ԫ���������������ʽ��ֱ�ӵ��ýӿھ����ˣ��Ȳ�����Կ�׸��ʼ���,������Ҫ����ı������ࡢ
				//������20211106
				//���Ҫ�üǵ��ı��ĳ���Ҫ��Ⱑ����Ҫһ�м�ǧ������Ҳ����һ��дһ�У���Ȼ��ʱ����лῨ�����ĳ�bufferIO�����ȵ����¡�
				//new FullDNATokenPDI_XCDX().initonETLSect(Stable.EMPTY_STRING);
				//new FullDNATokenPDI().initonDeSect(Stable.EMPTY_STRING);
				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				Map<String, String> map= getRandomDNAkey(sessionValidation, "NodeCoordinationX:"+ NodeCoordinationX);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "NodeName:"+ NodeName);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "NodeCoordinationY:"+ NodeCoordinationY);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "NodeID:"+ NodeID);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "flash:"+ flash);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "beconnect:"+ beconnect);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "leftChoose:"+ leftChoose);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "rightChoose:"+ rightChoose);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "tBeconnect:"+ tBeconnect);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "tBeconnectX:"+ tBeconnectX);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "tBeconnectY:"+ tBeconnectY);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "tBeconnetName:"+ tBeconnetName);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "tBeconnectID:"+ tBeconnectID);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "tBeconnectPrimaryKey:"+ tBeconnectPrimaryKey);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "mBeconnect:"+ mBeconnect);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "mBeconnectX:"+ mBeconnectX);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "mBeconnectY:"+ mBeconnectY);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "mBeconnetName:"+ mBeconnetName);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "mBeconnectID:"+ mBeconnectID);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "mBeconnectPrimaryKey:"+ mBeconnectPrimaryKey);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "dBeconnect:"+ dBeconnect);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "dBeconnectX:"+ dBeconnectX);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "dBeconnectY:"+ dBeconnectY);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "dBeconnetName:"+ dBeconnetName);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "dBeconnectID:"+ dBeconnectID);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "dBeconnectPrimaryKey:"+ dBeconnectPrimaryKey);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "primaryKey:"+ primaryKey);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "nodeConfiguration:"+ nodeConfiguration);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "isConfiged:"+ isConfiged);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, "isExecuted:"+ isExecuted);
				fileWriter.write(map.get(Stable.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(Stable.DNA_TOKEN_KEY));

				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);
				//�ָ�
				String split="##############################";
				fileWriter.write(Stable.LINE_ENTER);
				fileWriterKey.write(Stable.LINE_ENTER);

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