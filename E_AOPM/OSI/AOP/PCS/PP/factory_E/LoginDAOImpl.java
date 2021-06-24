package OSI.AOP.PCS.PP.factory_E;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;

import OSI.AOP.PCS.view.Usr;
import OSI.AOP.PCS.view.UsrFull;
import OSI.AOP.PCS.view.UsrToken;
import PCS.VQS.DSU.V.VtoV;
import VPC.VQS.DSU.utils.DetaDBUtil;
//import org.springframework.stereotype.Service;
@SuppressWarnings({"unused", "deprecation"})
//@Service
public class LoginDAOImpl{// implements LoginDAO{
	@SuppressWarnings("unchecked")
	public static Usr selectUsrByUId(Integer uId) throws IOException {
		String json = DetaDBUtil.DBRequest("/selectRowsByAttribute?baseName=" + "backend" + "&tableName=" 
	+ "usr" + "&culumnName=" + URLEncoder.encode("u_id") + "&value=" + uId + "&email=" 
				+ URLEncoder.encode("313699483@qq.com") + "&password=" 
				+ URLEncoder.encode("Fengyue1985!") + "&auth=" + "0");
		Map<String, Object> map = (Map<String, Object>) VtoV.JsonObjectToMap(new JSONObject(json));
		List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("obj");
		Usr usr = new Usr();
		if(list.size() > 0) {
			usr.I_uAddress(list.get(0).get("u_address")!=null?list.get(0).get("u_address").toString():"");
			usr.I_uAge(Integer.valueOf(list.get(0).get("u_age")!=null?list.get(0).get("u_age").toString():"0"));
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

	@SuppressWarnings("unchecked")
	public static UsrToken selectUsrTokenByUId(Integer uId) throws IOException {
		String json = DetaDBUtil.DBRequest("/selectRowsByAttribute?baseName=" + "backend" + "&tableName=" 
				+ "usrToken" + "&culumnName=" + "u_id" + "&value=" + uId + "&email=" + URLEncoder.encode("313699483@qq.com") 
				+ "&password=" + URLEncoder.encode("Fengyue1985!") + "&auth=" + "0");		
		Map<String, Object> map = (Map<String, Object>) VtoV.JsonObjectToMap(new JSONObject(json));
		List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("obj");
		UsrToken usrToken = new UsrToken();
		if(list.size() > 0) {	
			usrToken.I_uId(Integer.valueOf(list.get(0).get("u_id").toString()));
			usrToken.I_uKey(list.get(0).get("u_key")!=null?list.get(0).get("u_key").toString():"");
			usrToken.I_uPassword(list.get(0).get("u_password").toString());
			usrToken.I_uTime(Integer.valueOf(list.get(0).get("u_time")!=null?list.get(0).get("u_time").toString():"0"));
			usrToken.I_uLevel(list.get(0).get("u_level")!=null?list.get(0).get("u_level").toString():"");
		}
		return usrToken;
	}

	public static UsrFull selectUsrFullByUId(Integer uId) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public static Usr selectUsrByUEmail(String uEmail) throws IOException {
		String json = DetaDBUtil.DBRequest("/selectRowsByAttribute?baseName=" + "backend" + "&tableName=" 
				+ "usr" + "&culumnName=" + URLEncoder.encode("u_email") + "&value=" + URLEncoder.encode(uEmail) + "&email=" + URLEncoder.encode("313699483@qq.com") 
				+ "&password=" + URLEncoder.encode("Fengyue1985!") + "&auth=" + "0");
		Map<String, Object> map = (Map<String, Object>) VtoV.JsonObjectToMap(new JSONObject(json));
		List<Map<String, Object>> list = (List<Map<String, Object>>) map.get("obj");
		Usr usr = new Usr();
		if(list.size() > 0) {
			usr.I_uAddress(list.get(0).get("u_address")!=null?list.get(0).get("u_address").toString():"");
			usr.I_uAge(Integer.valueOf(list.get(0).get("u_age")!=null?list.get(0).get("u_age").toString():"0"));
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

	public static void U_UsrByUId(Integer uId, String uName, String uAge, String uSex, String uPhone, String uAddress,
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
		String json = DetaDBUtil.DBRequest("/updateRowByTablePathAndAttribute?baseName=" + "backend" + "&tableName=" 
				+ "usr" + "&culumnName=" + URLEncoder.encode("u_email") + "&value=" + URLEncoder.encode(uEmail) 
				+ "&email=" + URLEncoder.encode("313699483@qq.com") 
				+ "&password=" + URLEncoder.encode("Fengyue1985!") + "&auth=" + "0");		
	}

	public static void U_UsrTokenByUId(Integer uId, String uKey, String uPassword, long uTime) throws IOException {
		JSONObject jobj = new JSONObject();
		jobj.put("u_id", uId);
		jobj.put("u_key", uKey);
		jobj.put("u_password", uPassword);
		jobj.put("u_time", uTime);
		String json = DetaDBUtil.DBRequest("/updateRowByTablePathAndAttribute?baseName=" + "backend" + "&tableName=" 
				+ "usrToken" + "&culumnName=" + URLEncoder.encode("u_id") + "&value=" + uId + "&email=" 
				+ URLEncoder.encode("313699483@qq.com") + "&password=" + URLEncoder.encode("Fengyue1985!") + "&auth=" + "0");		
	}

	public static void IU_Usr(String uName, String uAge, String uSex, String uPhone, String uAddress, String uWeChat,
			String uClass, String uEmail, String uQq) {
		// TODO Auto-generated method stub
		
	}

	public static void IU_Usroken(Integer uId, String uKey, String uPassword, long uTime) {
		// TODO Auto-generated method stub
		
	}

	public static void IU_RowByTablePath(String baseName, String tableName, JSONObject culumnOfNewRow) throws FileNotFoundException, IOException {
		String json = DetaDBUtil.DBRequest("/insertRowByBaseName?baseName=" + baseName + "&tableName=" 
				+ tableName + "&culumnOfNewRow=" + culumnOfNewRow.toString() + "&email="
				+ URLEncoder.encode("313699483@qq.com") + "&password=" + URLEncoder.encode("Fengyue1985!") 
				+ "&auth=" + "0");		
	}
}