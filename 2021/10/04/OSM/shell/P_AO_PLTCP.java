package OSM.shell;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import ESU.string.String_ESU;
import ME.APM.VSQ.HRJFrame;
import MSU.AMS.VQS.SQV.SI.OSU.SMV.http.RestCall;
import MSU.AMS.VQS.SQV.SI.OSU.SMV.http.SessionValidation;
import MSV.OSQ.sets.DetaDouble;
import OEU.LYG4DQS4D.LYG10DWCMSSort13D_XCDX_C_A_S;
import OEU.LYG4DQS4D.LYG9DWithDoubleTopSort4D;
import OEU.LYG4DQS4D.Quick_7D_luoyaoguang_Sort;
import OSI.AOP.PCS.PP.port_E.RestNLPPortImpl;
import OSI.OSU.SI.ASQ.OSD.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.tinShell.TinMap;
import PEQ.AMV.ECS.test.ANNTest;
import PEQ.AMV.ECS.test.DNNTest;
import PEQ.AMV.ECS.test.SensingTest;
import PEU.P.dna.Token;
import PEU.P.dna.TokenCerts;
import PEU.P.table.TableSorterZYNK;
@SuppressWarnings({"unused"})
//����ļ���Ҫ������ƹ���web��rest��server��http ����
//+ "PLTCP:��֢|����WEB����|�ӿ�Ϊ|localhost|�˿�Ϊ|8000|����Ϊ|�ִ�;" (������ƣ�
//+ "PLTCP:��֢|����WEB����|�ӿ�Ϊ|localhost|�˿�Ϊ|8000|����Ϊ|DNN;" (������ƣ�
//+ "PLTCP:��֢|����WEB����|�ӿ�Ϊ|localhost|�˿�Ϊ|8000|����Ϊ|POS;" (������ƣ�
//������ 20211014
public class P_AO_PLTCP {
	@SuppressWarnings("unchecked")
	public static void P_PltcpLimitMap(String[] sets, List<Map<String, Object>> output
			, Map<String, Object> object) throws IOException {
		List<Map<String, Object>> outputTemp= new ArrayList<>();
		if(sets[1].equalsIgnoreCase("����WEB����")) {
			//��ѭ��
			List<Map<String, Object>> ��Ҫ������ѵ= (List<Map<String, Object>>)object.get("obj");
			Iterator<Map<String, Object>> outputTempIterator= ��Ҫ������ѵ.iterator();
			while(outputTempIterator.hasNext()) {
				Map<String, Object> rowOutputTempIterator= outputTempIterator.next();
				Map<String, Object> rowValueRowOutputTempIterator
				= (Map<String, Object>)rowOutputTempIterator.get("rowValue");
				//�ȹ̶�����ν����ʽ���Ժ�������Ʊ����ĸ�ʽ��Ŀǰ�Ȱ���������
				String server= sets[3];//�Ժ���� ��ȫ��⡣
				String port= sets[5];
				if(sets[7].contains("�ִ�")) {
					String setOfi= rowValueRowOutputTempIterator.get(sets[0]).toString();
					String string= String_ESU.charsetSwap(setOfi, "GBK", "GBK");
					String encode= String_ESU.stringToURIencode(string, "UTF8");
					//String response= RestCall.backEndRequest(encode);

					//ģ��Ӹ������˺�: 313699483@QQ.COM, ����: fengyue1985
					String id= "313699483@QQ.COM";
					String idString= String_ESU.charsetSwap(id, "GBK", "GBK");
					String idEncoder= String_ESU.stringToURIencode(idString, "UTF8");
					String password= "Fengyue1985!";
					String lock= "AISD>_<111111111111111>_<11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"
							+ ">_<1111111111111111>_<10111011101101101110110110110110111011011011101110110110"
							+ "1101101101101101110110110111011011011011011011011101101101101101101110110111011101";
					String[] MD5dice_DNA= lock.split(">_<");		
					//DNAԪ������
					SessionValidation sessionValidation= new SessionValidation();
					TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(password, true, MD5dice_DNA[0]);
					Token token= sessionValidation.sessionInitByTokenPDICertsDNA(tokenCerts);
					String passwordString= String_ESU.charsetSwap(token.getmPassword(), "GBK", "GBK");
					String passwordEncoder= String_ESU.stringToURIencode(passwordString, "UTF8");
					System.out.println("pds--1>"+tokenCerts.getPds());
					//�������������û�б�ʶ��׼��д��tag����������
					//java ��û��url�ĳ������ƣ����������ͻ᲻������ƭ��ʽ�»���
					//����׼��д��tag��
					//localhost �һ���������������
					//������ 20210731
					URL url = new URL("http://"+ server+ ":"+ port+ "/dataWS?message="+ encode+
							"&id="+ idEncoder+
							"&password="+ password+
							"&de="+ MD5dice_DNA[1] +
							"&ds="+ MD5dice_DNA[2] +
							"&ie="+ MD5dice_DNA[3] +
							"&is="+ MD5dice_DNA[4] +
							"&lock="+ MD5dice_DNA[0]);
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					//������url ��httpconnection, ֻ�ܷ������������������ʹ��,���Ҫ������������, �����������غ���.
					//��������޹�, �Ժ�����.
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
					//
					String[] strings= out.split("\"");
					out= strings.length> 3? strings[3]: "";
					out= String_ESU.uRIencodeToURIdecode(out, "UTF8");

					//����洢�滻
					rowValueRowOutputTempIterator.put(sets[0], out);
					rowOutputTempIterator.put("rowValue", rowValueRowOutputTempIterator);
					outputTemp.add(rowOutputTempIterator);
				}
				if(sets[7].contains("DNN")) {
					String setOfi= rowValueRowOutputTempIterator.get(sets[0]).toString();
					String string= String_ESU.charsetSwap(setOfi, "GBK", "GBK");
					String encode= String_ESU.stringToURIencode(string, "UTF8");
					//String response= RestCall.backEndRequest(encode);

					//ģ��Ӹ������˺�: 313699483@QQ.COM, ����: fengyue1985
					String id= "313699483@QQ.COM";
					String idString= String_ESU.charsetSwap(id, "GBK", "GBK");
					String idEncoder= String_ESU.stringToURIencode(idString, "UTF8");
					String password= "Fengyue1985!";
					String lock= "AISD>_<111111111111111>_<11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"
							+ ">_<1111111111111111>_<10111011101101101110110110110110111011011011101110110110"
							+ "1101101101101101110110110111011011011011011011011101101101101101101110110111011101";
					String[] MD5dice_DNA= lock.split(">_<");		
					//DNAԪ������
					SessionValidation sessionValidation= new SessionValidation();
					TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(password, true, MD5dice_DNA[0]);
					Token token= sessionValidation.sessionInitByTokenPDICertsDNA(tokenCerts);
					String passwordString= String_ESU.charsetSwap(token.getmPassword(), "GBK", "GBK");
					String passwordEncoder= String_ESU.stringToURIencode(passwordString, "UTF8");
					System.out.println("pds--1>"+tokenCerts.getPds());
					//�������������û�б�ʶ��׼��д��tag����������
					//java ��û��url�ĳ������ƣ����������ͻ᲻������ƭ��ʽ�»���
					//����׼��д��tag��
					//localhost �һ���������������
					//������ 20210731
					URL url = new URL("http://"+ server+ ":"+ port+ "/dataCG?message="+ encode+
							"&id="+ idEncoder+
							"&password="+ password+
							"&de="+ MD5dice_DNA[1] +
							"&ds="+ MD5dice_DNA[2] +
							"&ie="+ MD5dice_DNA[3] +
							"&is="+ MD5dice_DNA[4] +
							"&lock="+ MD5dice_DNA[0]);
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					//������url ��httpconnection, ֻ�ܷ������������������ʹ��,���Ҫ������������, �����������غ���.
					//��������޹�, �Ժ�����.
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
					//
					String[] strings= out.split("\"");
					out= strings.length> 3? strings[3]: "";
					out= String_ESU.uRIencodeToURIdecode(out, "UTF8");

					//����洢�滻
					rowValueRowOutputTempIterator.put(sets[0], out);
					rowOutputTempIterator.put("rowValue", rowValueRowOutputTempIterator);
					outputTemp.add(rowOutputTempIterator);
				}
				if(sets[7].contains("POS")) {
					String setOfi= rowValueRowOutputTempIterator.get(sets[0]).toString();
					String string= String_ESU.charsetSwap(setOfi, "GBK", "GBK");
					String encode= String_ESU.stringToURIencode(string, "UTF8");
					//String response= RestCall.backEndRequest(encode);

					//ģ��Ӹ������˺�: 313699483@QQ.COM, ����: fengyue1985
					String id= "313699483@QQ.COM";
					String idString= String_ESU.charsetSwap(id, "GBK", "GBK");
					String idEncoder= String_ESU.stringToURIencode(idString, "UTF8");
					String password= "Fengyue1985!";
					String lock= "AISD>_<111111111111111>_<11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"
							+ ">_<1111111111111111>_<10111011101101101110110110110110111011011011101110110110"
							+ "1101101101101101110110110111011011011011011011011101101101101101101110110111011101";
					String[] MD5dice_DNA= lock.split(">_<");		
					//DNAԪ������
					SessionValidation sessionValidation= new SessionValidation();
					TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(password, true, MD5dice_DNA[0]);
					Token token= sessionValidation.sessionInitByTokenPDICertsDNA(tokenCerts);
					String passwordString= String_ESU.charsetSwap(token.getmPassword(), "GBK", "GBK");
					String passwordEncoder= String_ESU.stringToURIencode(passwordString, "UTF8");
					System.out.println("pds--1>"+tokenCerts.getPds());
					//�������������û�б�ʶ��׼��д��tag����������
					//java ��û��url�ĳ������ƣ����������ͻ᲻������ƭ��ʽ�»���
					//����׼��д��tag��
					//localhost �һ���������������
					//������ 20210731
					URL url = new URL("http://"+ server+ ":"+ port+ "/dataCX?message="+ encode+
							"&id="+ idEncoder+
							"&password="+ password+
							"&de="+ MD5dice_DNA[1] +
							"&ds="+ MD5dice_DNA[2] +
							"&ie="+ MD5dice_DNA[3] +
							"&is="+ MD5dice_DNA[4] +
							"&lock="+ MD5dice_DNA[0]);
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					//������url ��httpconnection, ֻ�ܷ������������������ʹ��,���Ҫ������������, �����������غ���.
					//��������޹�, �Ժ�����.
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
					//
					String[] strings= out.split("\"");
					out= strings.length> 3? strings[3]: "";
					out= String_ESU.uRIencodeToURIdecode(out, "UTF8");

					//����洢�滻
					rowValueRowOutputTempIterator.put(sets[0], out);
					rowOutputTempIterator.put("rowValue", rowValueRowOutputTempIterator);
					outputTemp.add(rowOutputTempIterator);
				}
			}
		}	
		output.clear();
		output.addAll(outputTemp);
	}
}