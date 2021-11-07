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

//准备把响应事件移植到这里。
//设计成一个档案文件一个密钥文件。
//作者罗瑶光
public class SaveAs_I_File{
	//准备开始应用测试下。
	public static String[] getRandomDNAkey(SessionValidation sessionValidation, String password)
			throws UnsupportedEncodingException {
		if(null!= sessionValidation) {
			sessionValidation= new SessionValidation();
		}
		String[] string= new String[4];
		//生成lock
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA_ETL(password, false, null);
		//生成pde，pds
		Token token= sessionValidation.sessionInitByTokenPDICertsDNA(tokenCerts);
		String passwordString= String_ESU.charsetSwap(token.getmPassword(), "GBK", "GBK");
		String passwordEncoder= String_ESU.stringToURIencode(passwordString, "UTF8");
		//System.out.println("pds--1>"+ tokenCerts.getPds());
		String passwordPDE= passwordEncoder.toString();//稍后把这里封装成line写行的函数，做成循环
		String passwordPDS= token.getmPasswordPDS().toString();
		String lock= tokenCerts.getPdnLock();
		String de= token.getUpdsde();
		String ds= token.getUpdsds();
		String ie= token.getUpdsie();
		String is= token.getUpdsis();
		String keyETL=lock+ ">_<"+ de+ ">_<"+ ds+ ">_<"+ ie+ ">_<"+ is;
		string[0]= tokenCerts.getPdnPassword();//可逆计算，用于锁加密
		string[1]= passwordPDE;//不可逆计算，可用于登陆验证
		string[3]= passwordPDS;//不可逆计算，可用于登陆验证
		string[3]= keyETL;
		return string;
	}

	public static void Save(LinkNode first) {
		//初始化 dna密码文件的函数
		//加密
		//我先设计第一次加密是随机。那么这里每一行都要进行加密。
		//准备设计三种加密形式，第一种 pde级别加密，第二种pds级别加密，第三种简单的物理级别加密。
		//准备开始。罗瑶光 20211117
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
				//挨个取。没难度。逐个把信息写入文件。
				//节点坐标，节点名， 节点关联，
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
				//String tBeconnectPrimaryKey= ""+ node.dBeconnectPrimaryKey;//猫腻横行
				String tBeconnectPrimaryKey= ""+ node.tBeconnectPrimaryKey;//无耻,稍后文档我也优化下。罗瑶光 20211102
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
				String nodeConfiguration= ""+ node.thisFace.nodeConfiguration.replace("\r\n", "");//元基加密换算
				nodeConfiguration= nodeConfiguration.substring(0, nodeConfiguration.length()> 5000? 5000:nodeConfiguration.length());//避免过长。
				String isConfiged= ""+ node.thisFace.isConfiged;
				String isExecuted= ""+ node.thisFace.isExecuted;
				//配置
				//采用元基础的物理加密形式，直接调用接口就是了，先不采用钥匙概率加密,避免需要保存的变量过多、
				//罗瑶光20211106
				//大家要用记得文本的长度要检测啊，不要一行几千上万字也这样一下写一行，不然到时候读行会卡死，改成bufferIO。我先点醒下。
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
				//分割
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
