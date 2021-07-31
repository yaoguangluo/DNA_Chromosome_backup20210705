package MSU.AMS.VQS.SQV.SI.OSU.SMV.http;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import ESU.stable.Stable;
import ESU.string.String_ESU;
import PEU.P.dna.Token;
import PEU.P.dna.TokenCerts;
public class RestCall {
	public static String getJson(String urlString, String jsonString) 
			throws IOException{
		String code= Stable.STRING_EMPTY;
		URL url= new URL(urlString);
		HttpURLConnection connection= (HttpURLConnection)url.openConnection();
		connection.setRequestMethod(Stable.HTTP_GET);
		connection
		.setRequestProperty(Stable.CONTENT_TYPE, Stable.APPLICATION_JSON_UTF8); 
		connection.setDoOutput(true);
		connection.setInstanceFollowRedirects(false);
		StringBuffer sbuffer= new StringBuffer();
		sbuffer.append(jsonString);
		OutputStream os= connection.getOutputStream();
		os.write(sbuffer.toString().getBytes());
		os.flush(); 
		StringBuilder stringBuilder= new StringBuilder();
		BufferedReader bufferedReader= null;
		try {
			InputStream inputStream= connection.getInputStream();
			int caherset_size= connection.getHeaderFields().size();
			for(int i= 0; i< caherset_size; i++) {
				String temp= connection.getHeaderField(i);
				if(temp.contains(Stable.CHARSET)) {
					if(temp.toUpperCase().contains(Stable.CHARSET_GBK)) {
						code= Stable.CHARSET_GBK;
					}	
					if(temp.toUpperCase().contains(Stable.CHARSET_UTF_8)
							|| temp.toUpperCase().contains(Stable.CHARSET_UTF8)) {
						code= Stable.CHARSET_UTF_8;
					}
					if(temp.toUpperCase().contains(Stable.CHARSET_GB2312)) {
						code= Stable.CHARSET_GB2312;
					}
					if(temp.toUpperCase().contains(Stable.CHARSET_ASCII)) {
						code= Stable.CHARSET_ASCII;
					}
					if(temp.toUpperCase().contains(Stable.CHARSET_UNICODE)) {
						code= Stable.CHARSET_UNICODE;
					}
					if(temp.toUpperCase().contains(Stable.CHARSET_ISO_8859_1)) {
						code= Stable.CHARSET_ISO_8859_1;
					}
				}
			}
			if (null!= inputStream) {
				bufferedReader
				=  new BufferedReader(new InputStreamReader(inputStream, code));   
				String lines;
				while ((lines= bufferedReader.readLine()) != null) {
					stringBuilder.append(lines); 	
				}
			} else {
				stringBuilder.append(Stable.STRING_EMPTY);
			}
		} catch (IOException ex) {
			//throw ex;
		} finally {
			if (null!= bufferedReader) {
				try {
					bufferedReader.close();
				} catch (IOException ex) {
					//throw ex;
				}
			}
		}
		return new String(stringBuilder.toString().getBytes(), Stable.CHARSET_UTF_8);	
	}

	
	
	public static String backEndRequest(String request) throws IOException {
		//模拟加个测试账号: 313699483@QQ.COM, 密码: fengyue1985
		String id= "313699483@QQ.COM";
		String idString= String_ESU.charsetSwap(id, "GBK", "GBK");
		String idEncoder= String_ESU.stringToURIencode(idString, "UTF8");
		String password= "Fengyue1985!";
		String lock= "AISD>_<111111111111111>_<11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"
				+ ">_<1111111111111111>_<10111011101101101110110110110110111011011011101110110110"
				+ "1101101101101101110110110111011011011011011011011101101101101101101110110111011101";
		String[] MD5dice_DNA= lock.split(">_<");
				
				//加密
		SessionValidation sessionValidation= new SessionValidation();
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(password, true, MD5dice_DNA[0]);
		Token token= sessionValidation.sessionInitByTokenPDICertsDNA(tokenCerts);
		String passwordString= String_ESU.charsetSwap(token.getmPassword(), "GBK", "GBK");
		String passwordEncoder= String_ESU.stringToURIencode(passwordString, "UTF8");
		System.out.println("pds--1>"+tokenCerts.getPds());
		//这里的数据下面没有标识，准备写个tag来描述下先
		//java 从没有url的长度限制，如果出问题就会不报错，欺骗方式下滑。
		//所以准备写个tag。
		//localhost 我会做个表来描述。
		//罗瑶光 20210731
		URL url = new URL("http://localhost/dataCG?message="+ request+
				"&id="+ idEncoder+
				"&password="+ passwordEncoder+
				"&de="+ MD5dice_DNA[1] +
				"&ds="+ MD5dice_DNA[2] +
				"&ie="+ MD5dice_DNA[3] +
				"&is="+ MD5dice_DNA[4] +
				"&lock="+ MD5dice_DNA[0]);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		//这里是url 的httpconnection, 只能服务器网卡链接情况下使用,如果要本机断网调试, 请查阅网卡相关函数.
		//与程序功能无关, 以后讨论.
		//HttpConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Accept", "application/json");
		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
		}
		BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream()), "GBK"));
		String out = "";
		String out1;
		while ((out1 = br.readLine()) != null) {
			out += out1;
		}
		conn.disconnect();
		return out;
	}
	
	public static String searchLinkWord(String request) throws IOException {
		//System.out.println("http://localhost:8000" + request);
		URL url = new URL("http://localhost:8000" + request);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
		}
		BufferedReader br= new BufferedReader(new InputStreamReader((conn.getInputStream()), "GBK"));
		String out= "";
		String out1;
		while ((out1 = br.readLine()) != null) {
			out += out1;
		}
		conn.disconnect();
		return out;
	}
	
	public static String cacheRequest(String request) throws IOException {
		URL url= new URL("http://localhost:6379/"+ request);
		HttpURLConnection conn= (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Accept", "application/json;charset=utf-8");
		conn.setRequestProperty("Content-Type", "application/json;charset=utf-8");
		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
		}
		BufferedReader br= new BufferedReader(new InputStreamReader((conn.getInputStream()),"UTF-8"));
		String out= "";
		String out1;
		while ((out1 = br.readLine()) != null) {
			out += out1;
		}
		conn.disconnect();
		return out;
	}
}