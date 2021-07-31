package PEU.P.dna;

import java.util.Date;

//import PEU.P.dna.Token;
import PEU.P.md5.*;

public class TokenUtil {
	//把楼上的web代码合并养料经的元基版代码，先调通下MD5 token的流水，稍后换 dna的流水， 罗瑶光20210730
	public static Token getNewTokenFromUsrAndUsrToken(Usr usr, UsrToken usrToken) throws Exception {
		String key = String.valueOf(Double.valueOf(Math.random() * 10000000).intValue());
		String mPassword = TokenUtil.getFirstMD5Password(key, usrToken.getuPassword());
		Token token = new Token();
		token.I_uEmail(usr.getuEmail());
		token.I_uKey(key);
		token.I_uTime(new Date().getTime());
		token.I_mPassword(mPassword);
		return token;
	}

	public static String getSecondMD5Password(String uPassword) throws Exception {
		return StringUtil.EncoderByMd5("Author:Yaoguang Luo", uPassword, 8);
	}
	public static String getFirstMD5Password(String key, String uPassword) throws Exception {
		return StringUtil.EncoderByMd5(key, uPassword, 8);
	}
	//等下把上面的3个MD5涉及的工程所有文件 整体替换为 下面的DNA加密
	//罗瑶光
	public static String getFirstDNAPassword(String key, String uPassword, Token token) {
		return StringUtil.EncoderByDNA(key, uPassword, token);
	}
	
	public static Token getNewTokenFromUsrAndUsrTokenByDNA(Usr usr, UsrToken usrToken) throws Exception {
		String key= "";
		String[] lock= new String[12];
        lock[0] = "A"; lock[3] = "O"; lock[6] = "P"; lock[9]  = "M";
        lock[1] = "V"; lock[4] = "E"; lock[7] = "C"; lock[10] = "S";
        lock[2] = "I"; lock[5] = "D"; lock[8] = "U"; lock[11] = "Q";
        for(int loop= 0; loop< 4; loop++) {
        	int i= (int)(Math.random()* 12)% 12;
            key+= lock[i];
        }
        Token token= new Token();
		String dnaPassword= TokenUtil.getFirstDNAPassword(key, usrToken.getuPassword(), token);
		token.I_uEmail(usr.getuEmail());
		token.I_uKey(key);
		token.I_uTime(new Date().getTime());
		//token.I_mPassword(mPassword);
		token.I_mPassword(dnaPassword);
		return token;
	}
}