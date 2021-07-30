package OSI.AOP.VPC.PP.port_E;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;

import OSI.AOP.PCS.PP.company_E.LoginServiceImpl;
import VPC.transaction.TransactionDelegate;

public class RestLoginPort_E {//implements RestLoginPort {

	public static Map<String, Object> login(String uEmail, String uPassword) throws Exception {
		Map<String, Object> map = TransactionDelegate.transactionLogin(uEmail, uPassword);
		return map;
	}
	//分离出来方便之后继承
	public static Map<String, Object> loginDB(String uEmail, String uPassword) throws Exception {
		Map<String, Object> map = TransactionDelegate.transactionLoginDB(uEmail, uPassword);
		return map;
	}
	
	public static Map<String, Object> logout(String uEmail, String uToken) throws IOException {
		Map<String, Object> output = new HashMap<String, Object>();
		output.put("userEmail", "friend");
		output.put("userToken", "123456");
		return output;
	}

	public static Map<String, Object> register(String uEmail, String uEmailEnsure, String uName, String uPassword,
			String uPassWDEnsure, String uAddress, String uPhone, String uWeChat,
			String uQq, String uAge, String uSex) throws Exception {
		Map<String, Object> output = TransactionDelegate.transactionRegister(uEmail, uEmailEnsure, uName, uPassword,
				uPassWDEnsure, uAddress, uPhone, uWeChat,
				uQq, uAge, uSex);
		return output;
	}

	public static Map<String, Object> change(String uEmail, String uChange, String uChangeEnsure, String uToken,
			String uPassword) throws IOException {
		return null;
	}

	public static Map<String, Object> find(String uEmail) throws IOException {
		return null;
	}
	
	//合并db20210730 罗瑶光 因为改了 元基标识，先用MD5的调试好，然后整包之后换DNA
	public static Map<String, Object> checkStatus(String token) throws NumberFormatException, JSONException, Exception {
		Map<String, Object> output = new HashMap<String, Object>();
		String checkStatus = LoginServiceImpl.checkTokenStatusAndGetLevel(token, "level", output);
		if(checkStatus.contains("invalid")) {
			output.put("loginInfo", "unsuccess");
			output.put("returnResult", checkStatus);
			return output;
		}
		output.put("loginInfo", "success");
		output.put("returnResult", checkStatus);
		return output;
	}
}