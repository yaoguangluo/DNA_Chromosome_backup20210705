package PCS.transaction;
import org.json.JSONObject;

import ESU.string.String_ESU;
import MSU.AMS.VQS.SQV.SI.OSU.SMV.http.SessionValidation;
import OSI.AOP.PCS.PP.company_E.LoginServiceImpl;
//import OSI.AOP.PCS.view.Usr;
import PCS.VQS.DSU.V.VtoV;
//import PEU.P.dna.Token;
import PEU.P.dna.TokenCerts;
import PEU.P.md5.Usr;
import VPC.VQS.DSU.utils.DetaDBUtil;
import VPC.transaction.TransactionDelegateDB;
//import PEU.P.dna.TokenUtil;

//import org.springframework.stereotype.Service;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

//@Service
public class TransactionDelegateLogin {
//	@Autowired
//	private LoginService loginService;
	@SuppressWarnings("deprecation")
	public static Map<String, Object> transactionLogin(String uEmail, String uPassword)throws Exception {
		String response = DetaDBUtil.DBRequest("/login?uEmail=" + URLEncoder.encode(uEmail) + "&uPassword=" 
				+ URLEncoder.encode(uPassword));
		Map<String, Object> out= VtoV.JsonObjectToMap(new JSONObject(response));

		//��Ϊ�Ұ�vpcs�ϲ��ˣ����ݿ��8000 vpc ����������80��ǰ��login ���ǳ���Ƕ�ף������Ҿ�ֱ����Ƴ�
		//	���¼�¼202107301618 ������
		
		
		//		Usr usr = loginService.findUsrByUEmail(uEmail);
		//		UsrToken usrToken = loginService.findUsrTokenByUId(usr.getuId());
		//		String password = TokenUtil.getSecondMD5Password(uPassword);
		//		if (!password.equals(usrToken.getuPassword())) {
		//			Map<String, Object> out = new HashMap<>();
		//			out.put("loginInfo", "unsuccess");
		//			out.put("returnResult", "���벻��ȷ");
		//			return out;
		//		}
		//		Token token = TokenUtil.getNewTokenFromUsrAndUsrToken(usr, usrToken);
		//		String json = new Gson().toJson(token);
		//		String jsonToken = StringUtil.encode(json);
		//		loginService.updateUsrTokenByUId(usr.getuId(), token.getuKey(), password, token.getuTime()/1000);
		//		Map<String, Object> out = new HashMap<>();
		//		out.put("userToken", jsonToken);
		//		out.put("userEmail", uEmail);
		//		out.put("loginInfo", "success");
		return out;
	}

	//ע�ắ��Ҳ��dna����ȷֿ�����
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
			
			
			//��dna����
			//jsobj.put("u_password", TokenUtil.getSecondMD5Password(uPassword));
			//ģ��Ӹ������˺�: 313699483@QQ.COM, ����: Fengyue1985!
			String id= uEmail;
			String idString= String_ESU.charsetSwap(id, "GBK", "GBK");
			String idEncoder= String_ESU.stringToURIencode(idString, "UTF8");
			String password= uPassword;
			//����
			SessionValidation sessionValidation= new SessionValidation();
			TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(password, false, null);
			PEU.P.dna.Token token= sessionValidation.sessionInitByTokenPDICertsDNA(tokenCerts);
			String passwordString= String_ESU.charsetSwap(token.getmPassword(), "GBK", "GBK");//pde
			String passwordEncoder= String_ESU.stringToURIencode(passwordString, "UTF8");
			System.out.println("pds--1>"+ tokenCerts.getPds());
					
			jsobj.put("u_password", token.getmPassword());//pde
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
			
			String de= token.getUpdsde(); //��ӦPDS ����Կ�׼���
			String ds= token.getUpdsds(); //��ӦPDS ����Կ�׼���
			String ie= token.getUpdsie(); //��ӦPDS ����Կ�׼���
			String is= token.getUpdsis(); //��ӦPDS ����Կ�׼���
			String lock= tokenCerts.getPdnLock()+ ">_<"+ de+ ">_<"+ ds+ ">_<"+ ie+ ">_<"+ is;//��Ӧ�ǶԳƵ�ɸ��ģ������
		    
			jsobjToken.put("baseName", "backend");
			jsobjToken.put("u_key", lock);
			jsobjToken.put("u_password", token.getmPassword());
//			jsobjToken.put("u_password", TokenUtil.getSecondMD5Password(uPassword));
			LoginServiceImpl.IU_RowByTablePath("backend", "usrToken", jsobjToken);
			return TransactionDelegateDB.transactionLoginDB_DNA(uEmail, uPassword);
		}
//�ѵ�һ��DNA session ע�͵�, �� �������� DNA session	
//	public static Map<String, Object> transactionRegister(String uEmail, String uEmailEnsure, String uName, String uPassword,
//			String uPassWDEnsure, String uAddress, String uPhone, String uWeChat, String uQq, String uAge,
//			String uSex) throws Exception {
//		Usr usr = LoginServiceImpl.findUsrByUEmail(uEmail);
//		if(usr.getuEmail()!= null) {
//			Map<String, Object> out = new HashMap<>();
//			out.put("loginInfo", "unsuccess");
//			out.put("returnResult", "unsuccess");
//			return out;
//		}
//		JSONObject jsobj= new JSONObject();
//		jsobj.put("u_email", uEmail);
//		jsobj.put("u_name", uName);
//		//jsobj.put("u_password", TokenUtil.getSecondMD5Password(uPassword));
//		
//		String key= "";
//		String[] lock= new String[12];
//        lock[0] = "A"; lock[3] = "O"; lock[6] = "P"; lock[9]  = "M";
//        lock[1] = "V"; lock[4] = "E"; lock[7] = "C"; lock[10] = "S";
//        lock[2] = "I"; lock[5] = "D"; lock[8] = "U"; lock[11] = "Q";
//        for(int loop= 0; loop< 4; loop++) {
//        	int i= (int)(Math.random()* 12)% 12;
//            key+= lock[i];
//        }
//        
//		Token sessiontoken= new Token();
//		jsobj.put("u_password", TokenUtil.getFirstDNAPassword(key, uPassword, sessiontoken));
//		
//		jsobj.put("u_address", uAddress);
//		jsobj.put("u_phone", uPhone);
//		jsobj.put("u_weChat", uWeChat);
//		jsobj.put("u_qq", uQq);
//		jsobj.put("u_age", uAge);
//		jsobj.put("u_sex", uSex);
//		jsobj.put("u_id", "random");
//		LoginServiceImpl.IU_RowByTablePath("backend", "usr", jsobj);
//		usr = LoginServiceImpl.findUsrByUEmail(uEmail);
//		JSONObject jsobjToken = new JSONObject();
//		jsobjToken.put("u_id", usr.getuId());
//		jsobjToken.put("u_level", "low");
//		jsobjToken.put("u_password", TokenUtil.getFirstDNAPassword(key, uPassword, sessiontoken));
//		LoginServiceImpl.IU_RowByTablePath("backend", "usrToken", jsobjToken);
//		return transactionLogin(uEmail, uPassword);
//	}
}