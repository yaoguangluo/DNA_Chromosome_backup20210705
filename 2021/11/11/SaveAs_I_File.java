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
import SVQ.stable.StableToken;
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
		map.put(StableToken.DNA_TOKEN_LOCK, tokenCerts.getPdnPassword());
		map.put(StableToken.DNA_TOKEN_PDE, passwordPDE);
		map.put(StableToken.DNA_TOKEN_PDS, passwordPDS);
		map.put(StableToken.DNA_TOKEN_KEY, keyETL);
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
			//String[] string= SaveAs_I_File.getRandomDNAkey(sessionValidation, StableToken.EMPTY_STRING);
			FileWriter fileWriter= new FileWriter(fileSavepath);
			FileWriter fileWriterKey= new FileWriter(fileSavepath + ".dna");
			LinkNode node= first;
			while(null!= node) {
				//����ȡ��û�Ѷȡ��������Ϣд���ļ���
				//�ڵ����꣬�ڵ����� �ڵ������
				String NodeCoordinationX= StableToken.EMPTY_STRING+ node.x;
				String NodeCoordinationY= StableToken.EMPTY_STRING+ node.y;
				String NodeName= StableToken.EMPTY_STRING+ node.name;
				String NodeID=StableToken.EMPTY_STRING+ node.ID;
				String flash=StableToken.EMPTY_STRING+ node.flash;
				String beconnect= StableToken.EMPTY_STRING+ node.beconnect;
				String leftChoose= StableToken.EMPTY_STRING+ node.leftChoose;
				String rightChoose= StableToken.EMPTY_STRING+ node.rightChoose;
				String tBeconnect= StableToken.EMPTY_STRING+ node.tBeconnect;
				String tBeconnectX= StableToken.EMPTY_STRING+ node.tBeconnectX;
				String tBeconnectY= StableToken.EMPTY_STRING+ node.tBeconnectY;
				String tBeconnectName= StableToken.EMPTY_STRING+ node.tBeconnectName;
				String tBeconnectID= StableToken.EMPTY_STRING+ node.tBeconnectID;
				//String tBeconnectPrimaryKey= StableToken.EMPTY_STRING+ node.dBeconnectPrimaryKey;//è�����
				String tBeconnectPrimaryKey= StableToken.EMPTY_STRING+ node.tBeconnectPrimaryKey;//�޳�,�Ժ��ĵ���Ҳ�Ż��¡������� 20211102
				String mBeconnect= StableToken.EMPTY_STRING+ node.mBeconnect;
				String mBeconnectX= StableToken.EMPTY_STRING+ node.mBeconnectX;
				String mBeconnectY= StableToken.EMPTY_STRING+ node.mBeconnectY;
				String mBeconnectName= StableToken.EMPTY_STRING+ node.mBeconnectName;
				String mBeconnectID= StableToken.EMPTY_STRING+ node.mBeconnectID;
				String mBeconnectPrimaryKey= StableToken.EMPTY_STRING+ node.mBeconnectPrimaryKey;
				String dBeconnect= StableToken.EMPTY_STRING+ node.dBeconnect;
				String dBeconnectX= StableToken.EMPTY_STRING+ node.dBeconnectX;
				String dBeconnectY= StableToken.EMPTY_STRING+ node.dBeconnectY;
				String dBeconnectName= StableToken.EMPTY_STRING+ node.dBeconnectName;
				String dBeconnectID= StableToken.EMPTY_STRING+ node.dBeconnectID;
				String dBeconnectPrimaryKey= StableToken.EMPTY_STRING+ node.dBeconnectPrimaryKey;
				String primaryKey= StableToken.EMPTY_STRING+ node.primaryKey;
				String nodeConfiguration= StableToken.EMPTY_STRING
						+ node.thisFace.nodeConfiguration.replace(StableToken.LINE_ENTER, StableToken.EMPTY_STRING);//Ԫ�����ܻ���
				nodeConfiguration= nodeConfiguration.substring(0
						, nodeConfiguration.length()> 5000? 5000:nodeConfiguration.length());//���������
				String isConfiged= StableToken.EMPTY_STRING+ node.thisFace.isConfiged;
				String isExecuted= StableToken.EMPTY_STRING+ node.thisFace.isExecuted;
				//����
				//����Ԫ���������������ʽ��ֱ�ӵ��ýӿھ����ˣ��Ȳ�����Կ�׸��ʼ���,������Ҫ����ı������ࡢ
				//������20211106
				//���Ҫ�üǵ��ı��ĳ���Ҫ��Ⱑ����Ҫһ�м�ǧ������Ҳ����һ��дһ�У���Ȼ��ʱ����лῨ�����ĳ�bufferIO�����ȵ����¡�
				//new FullDNATokenPDI_XCDX().initonETLSect(StableToken.EMPTY_STRING);
				//new FullDNATokenPDI().initonDeSect(StableToken.EMPTY_STRING);
				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				Map<String, String> map= getRandomDNAkey(sessionValidation, StableToken.ETL_NODE_COORDINATION_X
						+ StableToken.ETL_SYMBOL_PER+ NodeCoordinationX);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_NODE_NAME
						+ StableToken.ETL_SYMBOL_PER+ NodeName);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_NODE_COORDINATION_Y
						+ StableToken.ETL_SYMBOL_PER+ NodeCoordinationY);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_NODE_ID
						+ StableToken.ETL_SYMBOL_PER+ NodeID);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_FLASH
						+ StableToken.ETL_SYMBOL_PER+ flash);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_BECONNECT
						+ StableToken.ETL_SYMBOL_PER+ beconnect);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_LEFT_CHOOSE
						+ StableToken.ETL_SYMBOL_PER+ leftChoose);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_RIGHT_CHOOSE
						+ StableToken.ETL_SYMBOL_PER+ rightChoose);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_TBECONNECT
						+ StableToken.ETL_SYMBOL_PER+ tBeconnect);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_TBECONNECT_X
						+ StableToken.ETL_SYMBOL_PER+ tBeconnectX);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_TBECONNECT_Y
						+ StableToken.ETL_SYMBOL_PER+ tBeconnectY);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_TBECONNECT_NAME
						+ StableToken.ETL_SYMBOL_PER+ tBeconnectName);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_TBECONNECT_ID
						+ StableToken.ETL_SYMBOL_PER+ tBeconnectID);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_TBECONNECT_PRIMARY_KEY
						+ StableToken.ETL_SYMBOL_PER+ tBeconnectPrimaryKey);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_MBECONNECT
						+ StableToken.ETL_SYMBOL_PER+ mBeconnect);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_MBECONNECT_X
						+ StableToken.ETL_SYMBOL_PER+ mBeconnectX);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_MBECONNECT_Y
						+ StableToken.ETL_SYMBOL_PER+ mBeconnectY);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_MBECONNECT_NAME
						+ StableToken.ETL_SYMBOL_PER+ mBeconnectName);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_MBECONNECT_ID
						+ StableToken.ETL_SYMBOL_PER+ mBeconnectID);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_MBECONNECT_PRIMARY_KEY
						+ StableToken.ETL_SYMBOL_PER+ mBeconnectPrimaryKey);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_DBECONNECT
						+ StableToken.ETL_SYMBOL_PER+ dBeconnect);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_DBECONNECT_X
						+ StableToken.ETL_SYMBOL_PER+ dBeconnectX);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_DBECONNECT_Y
						+ StableToken.ETL_SYMBOL_PER+ dBeconnectY);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_DBECONNECT_NAME
						+ StableToken.ETL_SYMBOL_PER+ dBeconnectName);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_DBECONNECT_ID
						+ StableToken.ETL_SYMBOL_PER+ dBeconnectID);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_DBECONNECT_PRIMARY_KEY
						+ StableToken.ETL_SYMBOL_PER+ dBeconnectPrimaryKey);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_PRIMARY_KEY
						+ StableToken.ETL_SYMBOL_PER+ primaryKey);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_NODE_CONFIGURATION
						+ StableToken.ETL_SYMBOL_PER+ nodeConfiguration);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_ISCONFIGED
						+ StableToken.ETL_SYMBOL_PER+ isConfiged);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				map= getRandomDNAkey(sessionValidation, StableToken.ETL_ISEXECUTED
						+ StableToken.ETL_SYMBOL_PER+ isExecuted);
				fileWriter.write(map.get(StableToken.DNA_TOKEN_LOCK));
				fileWriterKey.write(map.get(StableToken.DNA_TOKEN_KEY));

				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);
				//�ָ�
				String split="##############################";
				fileWriter.write(StableToken.LINE_ENTER);
				fileWriterKey.write(StableToken.LINE_ENTER);

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