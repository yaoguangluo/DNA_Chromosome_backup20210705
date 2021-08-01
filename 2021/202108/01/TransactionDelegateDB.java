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
	
	//�������ݿ�ϲ���login ��register
	//����׼��׼������DNAPassword�� ������20210731
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
	
	//��ӡһ��pde�� lock ������dma �����ݿ���в������Ƿ��½��֤
	@SuppressWarnings("unused")
	public static void main(String[] ARGS) throws UnsupportedEncodingException {
		String id= "313699483@QQ.COM";
		String idString= String_ESU.charsetSwap(id, "GBK", "GBK");
		String idEncoder= String_ESU.stringToURIencode(idString, "UTF8");
		String password= "Fengyue1985!";
		//����
		SessionValidation sessionValidation= new SessionValidation();
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(password, false, null);
		PEU.P.dna.Token token= sessionValidation.sessionInitByTokenPDICertsDNA(tokenCerts);
		String passwordString= String_ESU.charsetSwap(token.getmPassword(), "GBK", "GBK");
		String passwordEncoder= String_ESU.stringToURIencode(passwordString, "UTF8");
		System.out.println("pds--1>"+ tokenCerts.getPds());
		System.out.println("pde--1>"+ token.getmPassword());
		
		String de= token.getUpdsde(); //��ӦPDS ����Կ�׼���
		String ds= token.getUpdsds(); //��ӦPDS ����Կ�׼���
		String ie= token.getUpdsie(); //��ӦPDS ����Կ�׼���
		String is= token.getUpdsis(); //��ӦPDS ����Կ�׼���
		String lock= tokenCerts.getPdnLock()+ ">_<"+ de+ ">_<"+ ds+ ">_<"+ ie+ ">_<"+ is;//��Ӧ�ǶԳƵ�ɸ��ģ������
		System.out.println("lock--1>"+ lock);
		
	}
	
	//�����Ϻ�������ģ�������һ���µ�DNA��ͷ ������
	//���ݿ�token�Ĵ����pde�� token��pds
	//token��֤������pds���ȶԵ�pde  
	//��������������Ҿ����register�� ע��һ��pde����������Ϳ�����֤�����½�����ˡ�
	//������ 20210731
	public static Map<String, Object> transactionLoginDB_DNA(String uEmail, String uPassword)throws Exception {
		Usr usr = LoginServiceImpl.findUsrByUEmail(uEmail);
		UsrToken usrToken = LoginServiceImpl.findUsrTokenByUId(usr.getuId());
		//DNA SESSION �滻
		//�ϱ�� getuKey ����dna��getPdnLock�� ��Ҫ���ľ��ǰ�pds4������Կ��Ҳ�ϲ���
	    //�ȶ�����ʽΪ >_< �ֿ� �� lock>_<de>_<ds>_<ie>_<is, split�ͺô����ˡ�
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
		String de= token.getUpdsde(); //��ӦPDS ����Կ�׼���
		String ds= token.getUpdsds(); //��ӦPDS ����Կ�׼���
		String ie= token.getUpdsie(); //��ӦPDS ����Կ�׼���
		String is= token.getUpdsis(); //��ӦPDS ����Կ�׼���
		String lock= tokenCerts.getPdnLock()+ ">_<"+ de+ ">_<"+ ds+ ">_<"+ ie+ ">_<"+ is;//��Ӧ�ǶԳƵ�ɸ��ģ������
	    
		//Token token = TokenUtil.getNewTokenFromUsrAndUsrToken(usr, usrToken);
		//ȥ������Կ������PDE, ����ʱ�� pds �� id ����
		token.I_Updsie("");
		token.I_Updsis("");
		token.I_Updsde("");
		token.I_Updsds("");
		token.I_uKey("");
		token.I_mPassword("");
	
		//// ��������ʱ��, EMAIL �� pds 3��
		token.I_uEmail(uEmail);
		String json = new Gson().toJson(token);
		String jsonToken = StringUtil.encode(json);
		LoginServiceImpl.U_UsrTokenByUId(usr.getuId(), lock, passwordPDE, token.getuTime()/1000);
		Map<String, Object> out= new HashMap<>();
		out.put("userToken", jsonToken);// ��������ʱ��, EMAIL �� pds 3��
		out.put("userEmail", uEmail);
		out.put("loginInfo", "success");
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
		
		//ģ��Ӹ������˺�: 313699483@QQ.COM, ����: fengyue1985
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
		
		String de= token.getUpdsde(); //��ӦPDS ����Կ�׼���
		String ds= token.getUpdsds(); //��ӦPDS ����Կ�׼���
		String ie= token.getUpdsie(); //��ӦPDS ����Կ�׼���
		String is= token.getUpdsis(); //��ӦPDS ����Կ�׼���
		String lock= tokenCerts.getPdnLock()+ ">_<"+ de+ ">_<"+ ds+ ">_<"+ ie+ ">_<"+ is;//��Ӧ�ǶԳƵ�ɸ��ģ������
	    
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