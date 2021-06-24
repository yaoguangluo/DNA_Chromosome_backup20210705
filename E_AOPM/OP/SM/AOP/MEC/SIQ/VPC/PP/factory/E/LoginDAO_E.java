package OP.SM.AOP.MEC.SIQ.VPC.PP.factory.E;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import MSI.OP.SM.AOP.MEC.SIQ.SM.OSU.E.IU_Rows_E;
import MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.Q_Rows_E;
import MSU.OP.SM.AOP.MEC.SIQ.SM.update.E.U_Rows_E;
import OP.SM.AOP.MEC.SIQ.VPC.view.UsrFull;
import PEU.P.cache.*;
import PEU.P.md5.*;

public class LoginDAO_E {
	//	@Autowired
	//	private SelectRows selectRows;
	//	
	//	@Autowired
	//	private UpdateRows updateRows;
	//	
	//	@Autowired
	//	private InsertRows insertRows;

	public static Usr selectUsrByUId(Integer uId) throws IOException {
		List<Map<String, Object>> list = Q_Rows_E.selectRowsByAttribute("backend", "usr", "u_id", "" + uId);	
		Usr usr = new Usr();
		if(list.size() > 0) {
			usr.I_uAddress(list.get(0).get("u_address")
					!=null?list.get(0).get("u_address").toString():"");
			usr.I_uAge(Integer.valueOf(list.get(0).get("u_age")
					!=null?list.get(0).get("u_age").toString():"0"));
			usr.I_uClass(list.get(0).get("u_class")!=null?list.get(0).get("u_class").toString():"");
			usr.I_uEmail(list.get(0).get("u_email").toString());
			usr.I_uId(Integer.valueOf(list.get(0).get("u_id").toString()));
			usr.I_uName(list.get(0).get("u_name").toString());
			usr.I_uPhone(list.get(0).get("u_phone")!=null?list.get(0).get("u_phone").toString():"");
			usr.I_uQq(list.get(0).get("u_qq")!=null?list.get(0).get("u_qq").toString():"");
			usr.I_uSex(list.get(0).get("u_sex")!=null?list.get(0).get("u_sex").toString():"");
			usr.I_uWeChat(list.get(0).get("u_weChat")!=null?list.get(0).get("u_weChat").toString():"");
		}
		return usr;
	}

	public static UsrToken selectUsrTokenByUId(Integer uId) throws IOException {
		List<Map<String, Object>> list 
		= Q_Rows_E.selectRowsByAttribute("backend", "usrToken", "u_id", ""+uId);	
		UsrToken usrToken = new UsrToken();
		if(list.size() > 0) {	
			usrToken.I_uId(Integer.valueOf(list.get(0).get("u_id").toString()));
			usrToken.I_uKey(list.get(0).get("u_key")
					!= null?list.get(0).get("u_key").toString():"");
			usrToken.I_uPassword(list.get(0).get("u_password").toString());
			usrToken.I_uTime(Integer.valueOf(list.get(0).get("u_time")
					!= null?list.get(0).get("u_time").toString():"0"));
			usrToken.I_uLevel(list.get(0).get("u_level")
					!= null?list.get(0).get("u_level").toString():"");
		}
		return usrToken;
	}

	public static UsrFull selectUsrFullByUId(Integer uId) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Usr selectUsrByUEmail(String uEmail) throws IOException {
		List<Map<String, Object>> list = Q_Rows_E.selectRowsByAttribute("backend", "usr", "u_email", uEmail);	
		Usr usr = new Usr();
		if(list.size() > 0) {
			usr.I_uAddress(list.get(0).get("u_address")
					!= null?list.get(0).get("u_address").toString():"");
			usr.I_uAge(Integer.valueOf(list.get(0).get("u_age")
					!= null?list.get(0).get("u_age").toString():"0"));
			usr.I_uClass(list.get(0).get("u_class")
					!= null?list.get(0).get("u_class").toString():"");
			usr.I_uEmail(list.get(0).get("u_email").toString());
			usr.I_uId(Integer.valueOf(list.get(0).get("u_id").toString()));
			usr.I_uName(list.get(0).get("u_name").toString());
			usr.I_uPhone(list.get(0).get("u_phone")
					!= null?list.get(0).get("u_phone").toString():"");
			usr.I_uQq(list.get(0).get("u_qq")
					!= null?list.get(0).get("u_qq").toString():"");
			usr.I_uSex(list.get(0).get("u_sex")
					!= null?list.get(0).get("u_sex").toString():"");
			usr.I_uWeChat(list.get(0).get("u_weChat")
					!= null?list.get(0).get("u_weChat").toString():"");
			usr.I_uPassword(list.get(0).get("u_password")
					!= null?list.get(0).get("u_password").toString():"");
		}
		return usr;
	}

	public static void U_UsrByUId(Integer uId, String uName, String uAge
			, String uSex, String uPhone, String uAddress,
			String uWeChat, String uClass, String uEmail, String uQq) throws IOException {
		JSONObject jobj = new JSONObject();
		jobj.put("u_id", uId);
		jobj.put("u_name", uName);
		jobj.put("u_age", uAge);
		jobj.put("u_sex", uSex);
		jobj.put("u_phone", uPhone);
		jobj.put("u_address", uAddress);
		jobj.put("u_weChat", uWeChat);
		jobj.put("u_class", uClass);
		jobj.put("u_email", uEmail);
		jobj.put("u_qq", uQq);
		U_Rows_E.updateRowByTablePathAndAttribute(Cache_M.getCacheInfo("DBPath")
				.getValue()+"/backend/usr"
				, "u_id", "" + uId, jobj);
		// TODO Auto-generated method stub
	}

	public static void U_UsrTokenByUId(Integer uId, String uKey, String uPassword
			, long uTime) throws IOException {
		JSONObject jobj = new JSONObject();
		jobj.put("u_id", uId);
		jobj.put("u_key", uKey);
		jobj.put("u_password", uPassword);
		jobj.put("u_time", uTime);
		U_Rows_E.updateRowByTablePathAndAttribute(Cache_M.getCacheInfo("DBPath")
				.getValue()+"/backend/usrToken"
				, "u_id", "" + uId, jobj);
		// TODO Auto-generated method stub	
	}

	public static void insertUsr(String uName, String uAge, String uSex, String uPhone
			, String uAddress, String uWeChat,
			String uClass, String uEmail, String uQq) {
		// TODO Auto-generated method stub

	}

	public static void insertUsroken(Integer uId, String uKey, String uPassword, long uTime) {
		// TODO Auto-generated method stub

	}

	public static void insertRowByTablePath(String baseName, String tableName
			, JSONObject jsobj) throws Exception {
		IU_Rows_E.insertRowByBaseName(baseName, tableName, jsobj, true);
	}

}