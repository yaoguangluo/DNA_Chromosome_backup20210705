package PEU.P.dna;

import java.util.Map;

import ESU.string.String_ESU;
import ME.APM.VSQ.App;
import MSU.AMS.VQS.SQV.SI.OSU.SMV.http.SessionValidation;
import OSI.AOP.PCS.PP.company_E.LoginServiceImpl;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.TokenPDI;
import PEU.P.md5.Usr;
import PEU.P.md5.UsrToken;
//从VPC分离出来
//MD5的token也是罗瑶光先生设计的,这里分出来到 dna processor, 备注下
public class DNAAuth {
	//写个新的DNA status 跟之前的区分开来
	//稍后合并下，并新陈代谢下 把status的 裁出来。
	public static boolean DNAAuthStatusCheckEmailAndPds(App app, String string, Map<String, String> data) throws Exception {
		//同理稍后做pds
		String uEmail= "id";
		String uPassword= "password";
		//检查是否有email id
		if(!data.containsKey(uEmail)|| !data.containsKey(uPassword)) {
			uEmail= "uEmail";
			uPassword= "uPassword";
			if(!data.containsKey(uEmail)|| !data.containsKey(uPassword)) {
				return false;
			}
		}
		//检查db是否有email id
		Usr usr= LoginServiceImpl.findUsrByUEmail(data.get(uEmail));
		if(null== usr.getuEmail()) {
			return false;
		}
		//数据库取密
		UsrToken usrToken= LoginServiceImpl.findUsrTokenByUId(Integer.valueOf(usr.getuId()));
		if(null== usrToken.getuPassword()) {
			return false;
		}
		//取密进行加密
		String[] MD5dice_DNA= usrToken.getuKey().split(">_<");
		if(0== MD5dice_DNA.length) {
			return false;
		}
		//humanpassword-> tvmpassword
		SessionValidation sessionValidation= new SessionValidation();
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(data.get(uPassword), true, MD5dice_DNA[0]);
		//tvmpassword->pde,dps
		TokenPDI tokenPDI= new TokenPDI();
		TokenPDI bootTokenPDI= new TokenPDI();
		tokenPDI.pdedeKey= MD5dice_DNA[1];
		tokenPDI.pdedsKey= MD5dice_DNA[2];
		tokenPDI.pdeieKey= MD5dice_DNA[3];
		tokenPDI.pdeisKey= MD5dice_DNA[4];
		bootTokenPDI.doKeyUnPress(tokenCerts.getPdnPassword(), tokenPDI, true);
		//对比 入参密码的加密 与 DB获取PDE密码
		if(tokenPDI.pds.equals(usrToken.getuPassword())) {
			return true;
		}
		return false;
	}
	//写个新的DNA status 跟之前的区分开来
	public static boolean DNAAuthStatusCheckEmailAndPde(App app, String string, Map<String, String> data) throws Exception {
		String uEmail= "id";
		String uPassword= "password";
		//检查是否有email id
		if(!data.containsKey(uEmail)|| !data.containsKey(uPassword)) {
			return false;
		}
		//检查db是否有email id
		Usr usr= LoginServiceImpl.findUsrByUEmail(data.get(uEmail));
		if(null== usr.getuEmail()) {
			return false;
		}
		//数据库取密
		UsrToken usrToken= LoginServiceImpl.findUsrTokenByUId(Integer.valueOf(usr.getuId()));
		if(null== usrToken.getuPassword()) {
			return false;
		}
		//对比 入参密码的加密 与 DB获取PDE密码
		if(data.get(uPassword).equals(usrToken.getuPassword())) {
			return true;
		}
		return false;
	}
	
	//写个新的DNA status 跟之前的区分开来
	public static boolean DNAAuthStatusCheckEmailAndPassword(App app, String string, Map<String, String> data) throws Exception {
		String uEmail= "id";
		String uPassword= "password";
		//检查是否有email id
		if(!data.containsKey(uEmail)|| !data.containsKey(uPassword)) {
			uEmail= "uEmail";
			uPassword= "uPassword";
			if(!data.containsKey(uEmail)|| !data.containsKey(uPassword)) {
				return false;
			}
		}
		//检查db是否有email id
		Usr usr= LoginServiceImpl.findUsrByUEmail(data.get(uEmail));
		if(null== usr.getuEmail()) {
			if(null!= data.get("uType")) {
				if(data.get("uType").equals("register")) {
					return true;
				}
			}
			return false;
		}
		//数据库取密
		UsrToken usrToken= LoginServiceImpl.findUsrTokenByUId(Integer.valueOf(usr.getuId()));
		if(null== usrToken.getuPassword()) {
			return false;
		}
		//取密进行加密
		String[] MD5dice_DNA= usrToken.getuKey().split(">_<");
		if(0== MD5dice_DNA.length) {
			return false;
		}
		//humanpassword-> tvmpassword
		SessionValidation sessionValidation= new SessionValidation();
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(data.get(uPassword), true, MD5dice_DNA[0]);
		//tvmpassword->pde,dps
		TokenPDI tokenPDI= new TokenPDI();
		TokenPDI bootTokenPDI= new TokenPDI();
		tokenPDI.pdedeKey= MD5dice_DNA[1];
		tokenPDI.pdedsKey= MD5dice_DNA[2];
		tokenPDI.pdeieKey= MD5dice_DNA[3];
		tokenPDI.pdeisKey= MD5dice_DNA[4];
		bootTokenPDI.doKeyUnPress(tokenCerts.getPdnPassword(), tokenPDI, true);
		//对比 入参密码的加密 与 DB获取PDE密码
		if(tokenPDI.pde.equals(usrToken.getuPassword())) {
			return true;
		}
		return false;
	}
	
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
}