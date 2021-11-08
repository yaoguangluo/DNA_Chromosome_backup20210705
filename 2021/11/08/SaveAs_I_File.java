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

//准备把响应事件移植到这里。
//设计成一个档案文件一个密钥文件。
//作者罗瑶光
public class SaveAs_I_File{
	//准备开始应用测试下。
	public static Map<String, String> getRandomDNAkey(SessionValidation sessionValidation, String password)
			throws UnsupportedEncodingException {
		if(null!= sessionValidation) {
			sessionValidation= new SessionValidation();
		}
		String[] string= new String[4];
		Map<String, String> map= new HashMap<>();
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
		string[2]= passwordPDS;//不可逆计算，可用于登陆验证
		string[3]= keyETL;
		map.put(Stable.DNA_TOKEN_LOCK, tokenCerts.getPdnPassword());
		map.put(Stable.DNA_TOKEN_PDE, passwordPDE);
		map.put(Stable.DNA_TOKEN_PDS, passwordPDS);
		map.put(Stable.DNA_TOKEN_KEY, keyETL);
		return map;
		// 注释清楚点如下： 好理解 罗瑶光 20211108
		// 原始数据 <-可逆-> 物理元基加密 <-可逆-> 筛子锁加密 <-不可逆-> 肽展加密PDE <-可逆-> 肽丝化加密pds 
		// <--------------------可逆--------------------->         <--------------可逆------------>
		//                                             <---不可逆--->      
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
			//String[] string= SaveAs_I_File.getRandomDNAkey(sessionValidation, Stable.EMPTY_STRING);
			FileWriter fileWriter= new FileWriter(fileSavepath);
			FileWriter fileWriterKey= new FileWriter(fileSavepath + ".dna");
			LinkNode node= first;
			while(null!= node) {
				//挨个取。没难度。逐个把信息写入文件。
				//节点坐标，节点名， 节点关联，
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
				//String tBeconnectPrimaryKey= Stable.EMPTY_STRING+ node.dBeconnectPrimaryKey;//猫腻横行
				String tBeconnectPrimaryKey= Stable.EMPTY_STRING+ node.tBeconnectPrimaryKey;//无耻,稍后文档我也优化下。罗瑶光 20211102
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
						+ node.thisFace.nodeConfiguration.replace(Stable.LINE_ENTER, Stable.EMPTY_STRING);//元基加密换算
				nodeConfiguration= nodeConfiguration.substring(0
						, nodeConfiguration.length()> 5000? 5000:nodeConfiguration.length());//避免过长。
				String isConfiged= Stable.EMPTY_STRING+ node.thisFace.isConfiged;
				String isExecuted= Stable.EMPTY_STRING+ node.thisFace.isExecuted;
				//配置
				//采用元基础的物理加密形式，直接调用接口就是了，先不采用钥匙概率加密,避免需要保存的变量过多、
				//罗瑶光20211106
				//大家要用记得文本的长度要检测啊，不要一行几千上万字也这样一下写一行，不然到时候读行会卡死，改成bufferIO。我先点醒下。
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
				//分割
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