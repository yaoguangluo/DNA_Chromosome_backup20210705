package OSI.AOP.VPC.rest;
import java.io.File;
import java.io.IOException;
import java.util.Map;

import ESU.string.String_ESU;
import ME.APM.VSQ.App;
import MSU.AMS.VQS.SQV.SI.OSU.SMV.http.SessionValidation;
import OP.SM.AOP.MEC.SIQ.VPC.PP.port.E.RestDBPLSQL_E;
import OSI.AOP.MS.VPC.C.DBCategory_C;
import OSI.AOP.PCS.PP.port_E.RestLoginPortImpl;
import OSI.AOP.VPC.C.Config_C;
//import OSI.AOP.VPC.C.DBCategory_C;
import OSI.AOP.VPC.C.D_C;
import OSI.AOP.VPC.C.IU_C;
import OSI.AOP.VPC.C.Q_C;
import OSI.AOP.VPC.C.U_C;
import OSI.AOP.VPC.PP.port_E.RestAskPort_E;
import OSI.AOP.VPC.PP.port_E.RestLoginPort_E;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.TokenPDI;
import PEU.P.dna.Token;
import PEU.P.dna.TokenCerts;
import PEU.P.map.*;
public class VPC {
	public static boolean DNAAuthCheck(App app, String string, Map<String, String> data) throws Exception {
		//养疗经的DNA加密展示 全局检查密钥 调试已经成功,.
		String id= data.containsKey("id")? data.get("id"): "";
		String password= data.get("password");
		String de= data.containsKey("de")? data.get("de"): "";// data.get("de");
		String ds= data.containsKey("ds")? data.get("id"): "";// data.get("ds");
		String ie= data.containsKey("ie")? data.get("ie"): "";// data.get("ie");
		String is= data.containsKey("is")? data.get("is"): "";// data.get("is");
		String lock= data.containsKey("lock")? data.get("lock"): "";// data.get("lock");//也可已放数据表中.不在rest里面发送.
		TokenPDI pDE_RNA_Formular= new TokenPDI();
		TokenPDI pDE_RNA_Formular1= new TokenPDI();
		TokenPDI pDE_RNA_Formular2= new TokenPDI();
		pDE_RNA_Formular2.pdeieKey= de;
		pDE_RNA_Formular2.pdeisKey= ds;
		pDE_RNA_Formular2.pdedeKey= ie;
		pDE_RNA_Formular2.pdedsKey= is;

		//System.out.println("准备计算元基DNA序列："+ token.getmPassword());
		//加了老版本集成，先去掉dnn计算的DNA假数据测试。罗瑶光 20210730 
		//if(null== password) {
			id= "313699483@qq.com";
			String idString= String_ESU.charsetSwap(id, "GBK", "GBK");
			String idEncoder= String_ESU.stringToURIencode(idString, "UTF8");
			password= "Fengyue1985!";
			//加密
			SessionValidation sessionValidation= new SessionValidation();
			TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(password, false, null);
			Token token= sessionValidation.sessionInitByTokenPDICertsDNA(tokenCerts);
			String passwordString= String_ESU.charsetSwap(token.getmPassword(), "GBK", "GBK");
			String passwordEncoder= String_ESU.stringToURIencode(passwordString, "UTF8");
			System.out.println("pds--1>"+ tokenCerts.getPds());
			id= idEncoder.toString();
			password= passwordEncoder.toString();
			de= token.getUpdsde();
			ds= token.getUpdsds();
			ie= token.getUpdsie();
			is= token.getUpdsis();	
			pDE_RNA_Formular2.pdeieKey= de;
			pDE_RNA_Formular2.pdeisKey= ds;
			pDE_RNA_Formular2.pdedeKey= ie;
			pDE_RNA_Formular2.pdedsKey= is;
			lock= tokenCerts.getPdnLock();
		//}
		pDE_RNA_Formular2.doSessionKeyUnPress(password, pDE_RNA_Formular2, true);
		System.out.println("pds--2>"+ pDE_RNA_Formular2.pds);

		@SuppressWarnings("unused")
		String DB_id= "313699483@qq.com";

		//String DB_id= id;
		//模拟本地数据库计算DB_password 在数据库user表中通过DB_id 来获取. 大家好理解吧. 
		String DB_password= "Fengyue1985!";

		//String lock= data.get("lock");//也可已放数据表中.不在rest里面发送.
		//DB_password to lock DB
		sessionValidation= new SessionValidation();
		tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(DB_password, true, lock);
		pDE_RNA_Formular1.pdedeKey= de;
		pDE_RNA_Formular1.pdedsKey= ds;
		pDE_RNA_Formular1.pdeieKey= ie;
		pDE_RNA_Formular1.pdeisKey= is;
		pDE_RNA_Formular.doKeyUnPress(tokenCerts.getPdnPassword(), pDE_RNA_Formular1, true);
		System.out.println("pds--3>"+ pDE_RNA_Formular1.pds);
		//开始比对
		if(!pDE_RNA_Formular1.pde.equalsIgnoreCase(password)? true: false) {
			return false;
			//成功就放下走,不成功就返回了失败.
			//以后有时间我包装成完美的 DNA VPCS 包。优先级降低。
			//罗瑶光 20210422
		}
		return true;
	}
	//逐步分离出来，方便vpcs 之后继承。
	public static String forwardDB(App app, String string, Map<String, String> data) throws Exception {
//		if(!DNAAuthCheck(app, string, data)) {
//			return "";
//		}
		//controller
		string= string.replace("//","/");
		if(string.contains("/select")){
			return Q_C.exec(string, data);	
		}
		if(string.contains("/setDB")){
			return Config_C.exec(string, data);	
		}
		if(string.contains("/insert")){
			return IU_C.exec(string, data);	
		}
		if(string.contains("/delete")){
			return D_C.exec(string, data);	
		}
		if(string.contains("/update")){
			return U_C.exec(string, data);	
		}
		if(string.contains("DBCategory")){
			return DBCategory_C.exec(string, data);	
		}
		//plsql稍后继承
		if(string.equalsIgnoreCase("/execDetaPLSQL")){
			return VtoV.ObjectToJsonString(RestDBPLSQL_E.restDBPLSQLImpl(data.get("token") ,data.get("email")
					, data.get("password"), data.get("auth"), data.get("LYGQuery"), data.get("mod")));
		}	
		//restMap  // 准备改成1次进入由原来的 前端 后端数据库， 变成前端 数据库。 模式为前端加cache，后端加数据库。 罗瑶光
		if(string.equalsIgnoreCase("/login")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.loginDB(data.get("uEmail"),data.get("uPassword")));	
		}
		if(string.equalsIgnoreCase("/find")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.find(data.get("uEmail")));
		}
		if(string.equalsIgnoreCase("/logout")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.logout(data.get("uEmail"), data.get("uToken")));
		}
		if(string.equalsIgnoreCase("/register")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.registerDB(data.get("uEmail"), data.get("uEmailEnsure")
					, data.get("uName"), data.get("uPassword"), data.get("uPassWDEnsure"), data.get("uAddress")
					, data.get("uPhone"), data.get("uWeChat"), data.get("uQq"), data.get("uAge"), data.get("uSex")));	
		}
		if(string.equalsIgnoreCase("/change")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.change(data.get("uEmail"), data.get("uChange")
					, data.get("uChangeEnsure"),data.get("uToken"), data.get("uPassword")));	
		}
		if(string.equalsIgnoreCase("/checkStatus")){
			return VtoV.ObjectToJsonString(RestLoginPortImpl.checkStatus(data.get("token")));	
		}
		if(string.equalsIgnoreCase("/ask")){
			return VtoV.ObjectToJsonString(RestAskPort_E.ask(data.get("ip"), data.get("token")
					, data.get("message"), data.get("pointIp")));
		}
		if(string.equalsIgnoreCase("/feedBack")){
			return VtoV.ObjectToJsonString(RestAskPort_E.feedBack(data.get("ip"), data.get("token")
					, data.get("pointIp")));
		}
		if(string.equalsIgnoreCase("/getAskers")){
			return VtoV.ObjectToJsonString(RestAskPort_E.getAskers(data.get("token")));
		}	
		return "";
	}
	
	public static String forward(App app, String string, Map<String, String> data) throws Exception {
		if(!DNAAuthCheck(app, string, data)) {
			return "";
		}
		//controller
		if(string.contains("/select")){
			return Q_C.exec(string, data);	
		}
		if(string.contains("/setDB")){
			return Config_C.exec(string, data);	
		}
		if(string.contains("/insert")){
			return IU_C.exec(string, data);	
		}
		if(string.contains("/delete")){
			return D_C.exec(string, data);	
		}
		if(string.contains("/update")){
			return U_C.exec(string, data);	
		}
		if(string.contains("DBCategory")){
			return DBCategory_C.exec(string, data);	
		}
		//restMap  // 准备改成1次进入由原来的 前端 后端数据库， 变成前端 数据库。 模式为前端加cache，后端加数据库。 罗瑶光
		if(string.equalsIgnoreCase("/login")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.login(data.get("uEmail"),data.get("uPassword")));	
		}
		if(string.equalsIgnoreCase("/find")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.find(data.get("uEmail")));
		}
		if(string.equalsIgnoreCase("/logout")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.logout(data.get("uEmail"), data.get("uToken")));
		}
		if(string.equalsIgnoreCase("/register")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.register(data.get("uEmail"), data.get("uEmailEnsure")
					, data.get("uName"), data.get("uPassword"), data.get("uPassWDEnsure"), data.get("uAddress")
					, data.get("uPhone"), data.get("uWeChat"), data.get("uQq"), data.get("uAge"), data.get("uSex")));	
		}
		if(string.equalsIgnoreCase("/change")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.change(data.get("uEmail"), data.get("uChange")
					, data.get("uChangeEnsure"),data.get("uToken"), data.get("uPassword")));	
		}
		//		if(string.equalsIgnoreCase("/checkStatus")){
		//			return VtoV.ObjectToJsonString(RestLoginPortImpl.checkStatus(data.get("token")));	
		//		}
		if(string.equalsIgnoreCase("/ask")){
			return VtoV.ObjectToJsonString(RestAskPort_E.ask(data.get("ip"), data.get("token")
					, data.get("message"), data.get("pointIp")));
		}
		if(string.equalsIgnoreCase("/feedBack")){
			return VtoV.ObjectToJsonString(RestAskPort_E.feedBack(data.get("ip"), data.get("token")
					, data.get("pointIp")));
		}
		if(string.equalsIgnoreCase("/getAskers")){
			return VtoV.ObjectToJsonString(RestAskPort_E.getAskers(data.get("token")));
		}	
		if(string.equalsIgnoreCase("/dataWS")){
			return RestAskPort_E.dataWS(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataCX")){
			return RestAskPort_E.dataCX(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataCY")){
			return RestAskPort_E.dataCY(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataXL")){
			return RestAskPort_E.dataXL(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataRN")){
			return RestAskPort_E.dataRN(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataCG")){
			return RestAskPort_E.dataCG(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataCJ")){
			return RestAskPort_E.dataCJ(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataCL")){
			return RestAskPort_E.dataCL(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataXX")){
			return RestAskPort_E.dataXX(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataHF")){
			return RestAskPort_E.dataHF(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataCP")){
			return RestAskPort_E.dataCP(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataZF")){
			return RestAskPort_E.dataZF(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataZY")){
			return RestAskPort_E.dataZY(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataXY")){
			return RestAskPort_E.dataXY(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataYT")){
			return RestAskPort_E.dataYT(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataZT")){
			return RestAskPort_E.dataZT(data.get("message"));
		}	
		if(string.equalsIgnoreCase("/dataXT")){
			return RestAskPort_E.dataXT(data.get("message"));
		}	
		return "";
	}

	public static String getCode(String filePath) throws IOException{
		if(filePath.contains(".html")||filePath.contains(".js")){
			return "UTF-8";
		}
		return "GBK";
	}

	public static String getFilePath(String string) {
		String root = new File("src/main/resources/static").getAbsolutePath().replace("\\", "/");
		if(null==string||string.equalsIgnoreCase("")||string.equalsIgnoreCase("/")){
			string = "/index.html";
		}
		return root + string;
	}
}