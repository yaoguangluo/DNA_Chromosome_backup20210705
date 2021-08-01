package VPC.transaction;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.google.gson.Gson;

import ESU.string.String_ESU;
import MSU.AMS.VQS.SQV.SI.OSU.SMV.http.SessionValidation;
import OSI.AOP.PCS.PP.company_E.LoginServiceImpl;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.TokenPDI;
import PEU.P.dna.TokenCerts;
import PEU.P.md5.StringUtil;
import PEU.P.md5.Token;
import PEU.P.md5.TokenUtil;
import PEU.P.md5.Usr;
import PEU.P.md5.UsrToken;
//import PEU.P.md5.TokenUtil;
//import PEU.P.md5.Usr;
import VPC.VQS.DSU.utils.DetaFrontEndUtil;

public class TransactionDelegateDB {
	@SuppressWarnings("deprecation")
	public static Map<String, Object> transactionLogin(String uEmail, String uPassword)throws Exception {
		String response = DetaFrontEndUtil.backEndRequest("login?uEmail="+ URLEncoder.encode(uEmail) 
		+ "&uPassword=" + URLEncoder.encode(uPassword));
		Map<String, Object> out= PCS.VQS.DSU.V.VtoV.JsonObjectToMap(new JSONObject(response));
		return out;
	}

	@SuppressWarnings("deprecation")
	public static Map<String, Object> transactionRegister(String uEmail, String uEmailEnsure, String uName, String uPassword,
			String uPassWDEnsure, String uAddress, String uPhone, String uWeChat, String uQq, String uAge,
			String uSex) throws Exception {
		String response= DetaFrontEndUtil.backEndRequest("register?uEmail=" + URLEncoder.encode(uEmail) 
		+ "&uName="+ URLEncoder.encode(uName)
		+ "&uPassword="+ URLEncoder.encode(uPassword));
		Map<String, Object> out= PCS.VQS.DSU.V.VtoV.JsonObjectToMap(new JSONObject(response));
		return out;
	}
	
	//新增数据库合并的login 和register
	//今天准备准被换下DNAPassword， 罗瑶光20210731
	public static Map<String, Object> transactionLoginDB(String uEmail, String uPassword)throws Exception {
		Usr usr = LoginServiceImpl.findUsrByUEmail(uEmail);
		UsrToken usrToken = LoginServiceImpl.findUsrTokenByUId(usr.getuId());
		String password = TokenUtil.getSecondMD5Password(uPassword);
		if (!password.equals(usrToken.getuPassword())) {
			Map<String, Object> out = new HashMap<>();
			out.put("loginInfo", "unsuccess");
			out.put("returnResult", "unsuccess");
			return out;
		}
		Token token = TokenUtil.getNewTokenFromUsrAndUsrToken(usr, usrToken);
		String json = new Gson().toJson(token);
		String jsonToken = StringUtil.encode(json);
		LoginServiceImpl.U_UsrTokenByUId(usr.getuId(), token.getuKey(), password, token.getuTime()/1000);
		Map<String, Object> out = new HashMap<>();
		out.put("userToken", jsonToken);
		out.put("userEmail", uEmail);
		out.put("loginInfo", "success");
		return out;
	}
	
	//打印一个pde和 lock 出来，dma 改数据库进行测试下是否登陆验证
	@SuppressWarnings("unused")
	public static void main(String[] ARGS) throws UnsupportedEncodingException {
		String id= "313699483@QQ.COM";
		String idString= String_ESU.charsetSwap(id, "GBK", "GBK");
		String idEncoder= String_ESU.stringToURIencode(idString, "UTF8");
		String password= "Fengyue1985!";
		//加密
		SessionValidation sessionValidation= new SessionValidation();
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(password, false, null);
		PEU.P.dna.Token token= sessionValidation.sessionInitByTokenPDICertsDNA(tokenCerts);
		String passwordString= String_ESU.charsetSwap(token.getmPassword(), "GBK", "GBK");
		String passwordEncoder= String_ESU.stringToURIencode(passwordString, "UTF8");
		System.out.println("pds--1>"+ tokenCerts.getPds());
		System.out.println("pde--1>"+ token.getmPassword());
		
		String de= token.getUpdsde(); //对应PDS 概率钥匙加密
		String ds= token.getUpdsds(); //对应PDS 概率钥匙加密
		String ie= token.getUpdsie(); //对应PDS 概率钥匙加密
		String is= token.getUpdsis(); //对应PDS 概率钥匙加密
		String lock= tokenCerts.getPdnLock()+ ">_<"+ de+ ">_<"+ ds+ ">_<"+ ie+ ">_<"+ is;//对应非对称的筛子模拟上锁
		System.out.println("lock--1>"+ lock);
		
	}
	
	//不在老函数里面改，重命名一个新的DNA开头 罗瑶光
	//数据库token的存根是pde， token是pds
	//token验证是输入pds，比对的pde  
	//这个函数设计完后我就设计register， 注册一个pde存根，这样就可以验证这个登陆函数了。
	//罗瑶光 20210731
	public static Map<String, Object> transactionLoginDB_DNA(String uEmail, String uPassword)throws Exception {
		Usr usr = LoginServiceImpl.findUsrByUEmail(uEmail);
		UsrToken usrToken = LoginServiceImpl.findUsrTokenByUId(usr.getuId());
		//DNA SESSION 替换
		//老表的 getuKey 就是dna的getPdnLock， 我要做的就是把pds4个概率钥匙也合并。
	    //先定个格式为 >_< 分开 如 lock>_<de>_<ds>_<ie>_<is, split就好处理了。
		String[] MD5dice_DNA= usrToken.getuKey().split(">_<");
		SessionValidation sessionValidation= new SessionValidation();
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(uPassword, true, MD5dice_DNA[0]);
		TokenPDI pDE_RNA_Formular= new TokenPDI();
		TokenPDI pDE_RNA_Formular1= new TokenPDI();
		pDE_RNA_Formular1.pdedeKey= MD5dice_DNA[1];
		pDE_RNA_Formular1.pdedsKey= MD5dice_DNA[2];
		pDE_RNA_Formular1.pdeieKey= MD5dice_DNA[3];
		pDE_RNA_Formular1.pdeisKey= MD5dice_DNA[4];
		
		pDE_RNA_Formular.doKeyUnPress(tokenCerts.getPdnPassword(), pDE_RNA_Formular1, true);
		System.out.println("pds--3>"+ pDE_RNA_Formular1.pds);
		//
		if (!pDE_RNA_Formular1.pde.equals(usrToken.getuPassword())) {
			Map<String, Object> out = new HashMap<>();
			out.put("loginInfo", "unsuccess");
			out.put("returnResult", "unsuccess");
			return out;
		}
		
		sessionValidation= new SessionValidation();
		tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(uPassword, false, null);
		PEU.P.dna.Token token= sessionValidation.sessionInitByTokenPDICertsDNA(tokenCerts);
		String passwordString= String_ESU.charsetSwap(token.getmPassword(), "GBK", "GBK");
		String passwordEncoder= String_ESU.stringToURIencode(passwordString, "UTF8");
		System.out.println("pds--1>"+ token.getmPasswordPDS());
		String passwordPDE= passwordEncoder.toString();
		String de= token.getUpdsde(); //对应PDS 概率钥匙加密
		String ds= token.getUpdsds(); //对应PDS 概率钥匙加密
		String ie= token.getUpdsie(); //对应PDS 概率钥匙加密
		String is= token.getUpdsis(); //对应PDS 概率钥匙加密
		String lock= tokenCerts.getPdnLock()+ ">_<"+ de+ ">_<"+ ds+ ">_<"+ ie+ ">_<"+ is;//对应非对称的筛子模拟上锁
	    
		//Token token = TokenUtil.getNewTokenFromUsrAndUsrToken(usr, usrToken);
		//去掉概率钥匙密码PDE, 仅仅时间 pds 和 id 即可
		token.I_Updsie("");
		token.I_Updsis("");
		token.I_Updsde("");
		token.I_Updsds("");
		token.I_uKey("");
		token.I_mPassword("");
	
		//// 仅仅含有时间, EMAIL 和 pds 3个
		token.I_uEmail(uEmail);
		String json = new Gson().toJson(token);
		String jsonToken = StringUtil.encode(json);
		LoginServiceImpl.U_UsrTokenByUId(usr.getuId(), lock, passwordPDE, token.getuTime()/1000);
		Map<String, Object> out= new HashMap<>();
		out.put("userToken", jsonToken);// 仅仅含有时间, EMAIL 和 pds 3个
		out.put("userEmail", uEmail);
		out.put("loginInfo", "success");
		return out;
	}
	
	//注册函数也用dna设计先分开来。
	@SuppressWarnings("unused")
	public static Map<String, Object> transactionRegisterDB_DNA(String uEmail, String uEmailEnsure, String uName, String uPassword,
			String uPassWDEnsure, String uAddress, String uPhone, String uWeChat, String uQq, String uAge,
			String uSex) throws Exception {
		Usr usr = LoginServiceImpl.findUsrByUEmail(uEmail);
		if(usr.getuEmail()!=null) {
			Map<String, Object> out = new HashMap<>();
			out.put("loginInfo", "unsuccess");
			out.put("returnResult", "unsuccess");
			return out;
		}
		JSONObject jsobj=new JSONObject();
		jsobj.put("u_email", uEmail);
		jsobj.put("u_name", uName);
		
		
		//用dna代替
		//jsobj.put("u_password", TokenUtil.getSecondMD5Password(uPassword));
		
		//模拟加个测试账号: 313699483@QQ.COM, 密码: fengyue1985
		String id= uEmail;
		String idString= String_ESU.charsetSwap(id, "GBK", "GBK");
		String idEncoder= String_ESU.stringToURIencode(idString, "UTF8");
		String password= uPassword;
		//加密
		SessionValidation sessionValidation= new SessionValidation();
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(password, false, null);
		PEU.P.dna.Token token= sessionValidation.sessionInitByTokenPDICertsDNA(tokenCerts);
		String passwordString= String_ESU.charsetSwap(token.getmPassword(), "GBK", "GBK");//pde
		String passwordEncoder= String_ESU.stringToURIencode(passwordString, "UTF8");
		System.out.println("pds--1>"+ tokenCerts.getPds());
				
		jsobj.put("u_password", passwordEncoder);//pde
		jsobj.put("u_address", uAddress);
		jsobj.put("u_phone", uPhone);
		jsobj.put("u_weChat", uWeChat);
		jsobj.put("u_qq", uQq);
		jsobj.put("u_age", uAge);
		jsobj.put("u_sex", uSex);
		jsobj.put("u_id", "random");
		LoginServiceImpl.IU_RowByTablePath("backend", "usr", jsobj);
		usr = LoginServiceImpl.findUsrByUEmail(uEmail);
		JSONObject jsobjToken= new JSONObject();
		jsobjToken.put("u_id", usr.getuId());
		jsobjToken.put("u_level", "low");
		
		String de= token.getUpdsde(); //对应PDS 概率钥匙加密
		String ds= token.getUpdsds(); //对应PDS 概率钥匙加密
		String ie= token.getUpdsie(); //对应PDS 概率钥匙加密
		String is= token.getUpdsis(); //对应PDS 概率钥匙加密
		String lock= tokenCerts.getPdnLock()+ ">_<"+ de+ ">_<"+ ds+ ">_<"+ ie+ ">_<"+ is;//对应非对称的筛子模拟上锁
	    
		jsobjToken.put("baseName", "backend");
		jsobjToken.put("u_key", lock);
		jsobjToken.put("u_password", passwordEncoder);
//		jsobjToken.put("u_password", TokenUtil.getSecondMD5Password(uPassword));
		LoginServiceImpl.IU_RowByTablePath("backend", "usrToken", jsobjToken);
		return transactionLoginDB_DNA(uEmail, uPassword);
	}
	
	public static Map<String, Object> transactionRegisterDB(String uEmail, String uEmailEnsure, String uName, String uPassword,
			String uPassWDEnsure, String uAddress, String uPhone, String uWeChat, String uQq, String uAge,
			String uSex) throws Exception {
		Usr usr = LoginServiceImpl.findUsrByUEmail(uEmail);
		if(usr.getuEmail()!=null) {
			Map<String, Object> out = new HashMap<>();
			out.put("loginInfo", "unsuccess");
			out.put("returnResult", "unsuccess");
			return out;
		}
		JSONObject jsobj= new JSONObject();
		jsobj.put("u_email", uEmail);
		jsobj.put("u_name", uName);
		jsobj.put("u_password", TokenUtil.getSecondMD5Password(uPassword));
		jsobj.put("u_address", uAddress);
		jsobj.put("u_phone", uPhone);
		jsobj.put("u_weChat", uWeChat);
		jsobj.put("u_qq", uQq);
		jsobj.put("u_age", uAge);
		jsobj.put("u_sex", uSex);
		jsobj.put("u_id", "random");
		LoginServiceImpl.IU_RowByTablePath("backend", "usr", jsobj);
		usr= LoginServiceImpl.findUsrByUEmail(uEmail);
		JSONObject jsobjToken= new JSONObject();
		jsobjToken.put("u_id", usr.getuId());
		jsobjToken.put("u_level", "low");
		jsobjToken.put("u_password", TokenUtil.getSecondMD5Password(uPassword));
		LoginServiceImpl.IU_RowByTablePath("backend", "usrToken", jsobjToken);
		return transactionLogin(uEmail, uPassword);
	}
	
	
	
	
	
	
}