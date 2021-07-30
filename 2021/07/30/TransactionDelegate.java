package VPC.transaction;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.google.gson.Gson;

import OSI.AOP.PCS.PP.company_E.LoginServiceImpl;
import PEU.P.md5.StringUtil;
import PEU.P.md5.Token;
import PEU.P.md5.TokenUtil;
import PEU.P.md5.Usr;
import PEU.P.md5.UsrToken;
//import PEU.P.md5.TokenUtil;
//import PEU.P.md5.Usr;
import VPC.VQS.DSU.utils.DetaFrontEndUtil;

public class TransactionDelegate {
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
		JSONObject jsobj=new JSONObject();
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
		usr = LoginServiceImpl.findUsrByUEmail(uEmail);
		JSONObject jsobjToken = new JSONObject();
		jsobjToken.put("u_id", usr.getuId());
		jsobjToken.put("u_level", "low");
		jsobjToken.put("u_password", TokenUtil.getSecondMD5Password(uPassword));
		LoginServiceImpl.IU_RowByTablePath("backend", "usrToken", jsobjToken);
		return transactionLogin(uEmail, uPassword);
	}
	
	
	
	
}