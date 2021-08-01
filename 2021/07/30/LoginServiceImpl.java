package OSI.AOP.PCS.PP.company_E;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

import org.json.JSONObject;

import OSI.AOP.PCS.PP.factory_E.LoginDAOImpl;
//import OSI.AOP.PCS.view.Usr;
//import OSI.AOP.PCS.view.UsrToken;
import PEU.P.dna.Token;
import PEU.P.md5.Usr;
import PEU.P.md5.UsrToken;
import VPC.VQS.DSU.utils.StringUtil;
import VPC.VQS.DSU.utils.TokenUtil;

//@Service
public class LoginServiceImpl {// implements LoginService {

//	@Autowired
//	private LoginDAO loginDAO;

	public static Usr findUsrByUEmail(String uEmail) throws IOException {
		Usr usr = LoginDAOImpl.selectUsrByUEmail(uEmail);
		return usr;
	}

	public static UsrToken findUsrTokenByUId(Integer uId) throws IOException {
		UsrToken usrToken = LoginDAOImpl.selectUsrTokenByUId(uId);
		return usrToken;
	}

	public static void U_UsrTokenByUId(Integer uId, String key, String uPassword, long uTime) throws IOException {
		LoginDAOImpl.U_UsrTokenByUId(uId, key, uPassword, uTime);
	}

	public static void IU_RowByTablePath(String baseName, String tableName, JSONObject jsobj) throws FileNotFoundException, IOException {
		LoginDAOImpl.IU_RowByTablePath(baseName, tableName, jsobj);
	}

	public static String checkStatus(String token, String level) throws Exception {
		if (null == token) {
			return "invalid ..";
		}
		String json = StringUtil.decode(token);
		JSONObject js;
		try {
			js = new JSONObject(json);
		}catch(Exception e) {
			return "invalid ..";
		}
		long uTime = js.getLong("uTime");
		String uPassword = js.getString("mPassword");
		String uEmail = js.getString("uEmail");
		
		Usr usr= findUsrByUEmail(uEmail);
		UsrToken usrToken = findUsrTokenByUId(usr.getuId());
		//String password = TokenUtil.getFirstMD5Password(js.getString("uKey"), usrToken.getuPassword());
		
		//������DNA �滻����, ֮������������.
		//���ע��, �����ukey�� ɸ�Ӽ��ܷ�ʽ, ���ܺ� ��������һ�����������ͬ��ɸ�Ӽ��ܽ������, 
		//�ҵ�dna���ܸ�����, ������ɻ�ԭ�� ��key, �����key, ͬ����Ҫ����, �����ݿ�, 
		//��Ϊ�ҵ�dna����������, һ�ֵ�������key���ܵķ�ʽ, һ���ǰ��Ѿ����ɵ���key��ԭ. ��Ȼ����ܺ������б仯.
		//�������ƾ���û���õ��⺯��, ���ȼ�����, ��˵����. ������
		//��׼��������������ģ��, �ҽ��������, �Ӹ�session��֤,ƥ��ͨ���ͺ�˼���ȡֵ, ��ͨ��, ��������֤. ��Ҳ�Ƿ������Լ�.
		//��tcp.http������������SESSION���� ģ�������Ƭ��.
		
		String key= "";
		String[] lock= new String[12];
        lock[0] = "A"; lock[3] = "O"; lock[6] = "P"; lock[9]  = "M";
        lock[1] = "V"; lock[4] = "E"; lock[7] = "C"; lock[10] = "S";
        lock[2] = "I"; lock[5] = "D"; lock[8] = "U"; lock[11] = "Q";
        for(int loop= 0; loop< 4; loop++) {
        	int i= (int)(Math.random()* 12)% 12;
            key+= lock[i];
        }
        Token sessiontoken= new Token();
        js.put("uKey", key);
		String dnaPassword= TokenUtil.getFirstDNAPassword(key, usrToken.getuPassword(), sessiontoken);
		sessiontoken.I_uEmail(usr.getuEmail());
		sessiontoken.I_uKey(key);
		//sessiontoken.
		sessiontoken.I_uTime(new Date().getTime());
		//token.I_mPassword(mPassword);
		sessiontoken.I_mPassword(dnaPassword);
		//return sessiontoken
		//if (!uPassword.equals(password)) {
		if (!uPassword.equals(dnaPassword)) {
			return "invalid ..";
		}
		long nowTime = new Date().getTime();
		if(uTime + 600000 < nowTime) {
			return "invalid 10..";
		}
		
		if(level.contains("level")) {
			String uLevel = usrToken.getuLevel();
			if(!uLevel.contains("high")) {
				return "invalid ..";
			}
		}
		return "valid";
	}
	
	
	public static String checkTokenStatusAndGetLevel(String token, String level, Map<String, Object> output) throws Exception {
		if (null == token || token.equalsIgnoreCase("undefined")) {
			return "invalid ..";
		}
		String json = StringUtil.decode(token);
		JSONObject js;
		try {
			js = new JSONObject(json);
		}catch(Exception e) {
			return "invalid ..";
		}
		long uTime= js.getLong("uTime");
		String uPassword= js.getString("mPassword");
		String uEmail= js.getString("uEmail");
		Usr usr= findUsrByUEmail(uEmail);
		UsrToken usrToken= findUsrTokenByUId(usr.getuId());
		String password= TokenUtil.getFirstMD5Password(js.getString("uKey"), usrToken.getuPassword());
		if (!uPassword.equals(password)) {
			return "invalid ..";
		}
		long nowTime = new Date().getTime();
		if(uTime + 600000 < nowTime) {
			return "invalid ..";
		}

		if(level.contains("level")) {
			String uLevel = usrToken.getuLevel();
			if(!uLevel.contains("high")) {
				return "invalid .";
			}
		}
		output.put("usrName", "." + usr.getuId());
		return "valid" + usrToken.getuLevel();
	}
	
	
}