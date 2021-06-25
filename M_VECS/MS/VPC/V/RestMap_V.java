package MS.VPC.V;
import java.io.BufferedReader;


import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ME.APM.VSQ.App;
import MS.OP.SM.AOP.MEC.SIQ.cache.DetaCache_M;
import SVQ.stable.StablePOS;
import SVQ.stable.StableWeb;
import OSI.AOP.VPC.rest.VPC;
import PEU.P.zip.*;
//���������VPC�ı�ʶ,�����ķ������,���кܶ෽�����̳�,�ҾͲ������ķ�������. VPCS ��STABLE�Ϳ��Խ��
//�ǲ�����д��.
public class RestMap_V {
	public static void main(String[] args){

	}

	public static void IQ_Response(Socket socket) {

	}

	public static void returnResponse(Socket socket) {

	}

	public static void IQ_Response(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {

	}

	public static void returnResponse(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {
		vPCSResponse.getSleeper_H().D_ThreadById(vPCSResponse.getHashCode());
	}

	public static void P_Rest(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception {
		String output = VPC.forward(null, vPCSRequest.getRequestLink(), vPCSRequest.getRequestValue());
		PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(vPCSResponse.getSocket()
				.getOutputStream(),"UTF-8")),true);
		printWriter.println("HTTP/1.1 200 OK\n\n"); 
		output=output.charAt(0)=='"'?output.substring(1,output.length()):output;
		output=output.charAt(output.length()-1)=='"'?output.substring(0
				, output.length()-1):output;
		output.replace("\\\"","\"");
		printWriter.println(output);
		printWriter.flush();
		printWriter.close();	
		vPCSResponse.getSleeper_H().D_ThreadById(vPCSResponse.getSocket().hashCode());
	}
	
	public static void P_Rest(App app, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception {
		//VPC�����Ӽ̳�, ������� overrider ������, Ҳ�кܶ෽��, ��osgi, ��Ȼ,�����������map��ʶ,��ˬ.
		//indexVPCMapPillows.get(vPCSRequest.gettag())...;
		//���ڽ���deta����վ�����������webҳ, ���ƾ�app��û���漰, ��� pillow tag ����VPC ������rest map ������ȼ��Ժ� 
		String output= VPC.forward(app, vPCSRequest.getRequestLink()
				, vPCSRequest.getRequestValue());
		PrintWriter printWriter= new PrintWriter(new BufferedWriter(new OutputStreamWriter(vPCSResponse.getSocket()
				.getOutputStream(),StableWeb.CHARSET_UTF_8)),true);
		printWriter.println("HTTP/1.1 200 OK\n\n"); 
		output=output.charAt(StablePOS.INT_ZERO)=='"'?output.substring(StablePOS.INT_ONE, output.length())
				:output;
		output=output.charAt(output.length()-StablePOS.INT_ONE)=='"'?output.substring(StablePOS.INT_ZERO
				, output.length()-StablePOS.INT_ONE):output;
		printWriter.println(output.replace("\\\"","\""));
		System.out.println("db:"+4);
		printWriter.flush();
		printWriter.close();	
		vPCSResponse.getSleeper_H().D_ThreadById(vPCSResponse.getSocket().hashCode());	
	}

	public static void P_View(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {

	}

	public static void P_Bytes(VPCSRequest vPCSRequest
			, VPCSResponse vPCSResponse) throws IOException {
		List<byte[]> list;
		DataOutputStream dataOutputStream = new DataOutputStream(vPCSResponse.getSocket().getOutputStream());
		if(null != DetaCache_M.getCacheOfBytesList(vPCSRequest.getRequestFilePath())){
			list = DetaCache_M.getCacheOfBytesList(vPCSRequest.getRequestFilePath());
		}else{
			FileInputStream fileInputStream = new FileInputStream(new File(vPCSRequest.getRequestFilePath()));
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			byte[] byteArray = new byte[StableWeb.BUFFER_RANGE_MAX];
			int lengthOfFile = StablePOS.INT_ZERO;
			list = new ArrayList<>();
			//���while����˼������ ��ƪ���£�https://blog.csdn.net/top_code/article/details/41042413
			//�ǳ����ɴ���len�ĳ��������лл��
			while((lengthOfFile = fileInputStream.read(byteArray, StablePOS.INT_ZERO
					, StableWeb.BUFFER_RANGE_MAX)) != StablePOS.INT_ERROR){
				byteArrayOutputStream.write(byteArray, StablePOS.INT_ZERO, lengthOfFile);
			}
			fileInputStream.close();
			byte[] sniper = GzipUtil.compress(byteArrayOutputStream.toByteArray());
			list.add(0, vPCSResponse.getResponseContentType().getBytes(StableWeb.CHARSET_UTF8));
			list.add(0, (StableWeb.HEADER_CONTENT_LENGTH + sniper.length + StableWeb.STRING_SPACE_ENTER)
					.getBytes(StableWeb.CHARSET_UTF8));
			list.add(0, StableWeb.HEADER_CACHE_CONTROL.getBytes(StableWeb.CHARSET_UTF8));
			list.add(0, StableWeb.HEADER_CONTENT_ENCODING_GZIP.getBytes(StableWeb.CHARSET_UTF8));
			list.add(0, StableWeb.HEADER_ACCEPT_RANGES_BYTES.getBytes(StableWeb.CHARSET_UTF8));
			list.add(0, StableWeb.HEADER_HOST.getBytes(StableWeb.CHARSET_UTF8));
			list.add(0, StableWeb.HEADER_HTTP_200_OK.getBytes(StableWeb.CHARSET_UTF8));
			if(null != sniper && sniper.length>StablePOS.INT_ZERO) {
				list.add(sniper);
			}
			DetaCache_M.putCacheOfBytesList(vPCSRequest.getRequestFilePath(), list);
		}	
		Iterator<byte[]> iterator = list.iterator();
		while(iterator.hasNext()){
			dataOutputStream.write(iterator.next());	
		}	
		dataOutputStream.flush();
		dataOutputStream.close();
	}

	public static void P_Buffer(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws IOException {
		String builderToString;
		if(null != DetaCache_M.getCacheOfString(vPCSRequest.getRequestFilePath())){
			builderToString = DetaCache_M.getCacheOfString(vPCSRequest.getRequestFilePath());
		}else{
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append(StableWeb.HEADER_HTTP_200_OK);
			stringBuilder.append(StableWeb.HEADER_HOST);
			stringBuilder.append(StableWeb.HEADER_CACHE_CONTROL);
			stringBuilder.append(vPCSResponse.getResponseContentType());
			FileInputStream fileInputStream = new FileInputStream(new File(vPCSRequest.getRequestFilePath())); 
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream
					, vPCSRequest.getRequestFileCode()); 
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader); 
			String line = null; 
			while ((line = bufferedReader.readLine()) != null) { 
				stringBuilder.append(line); 
			}
			bufferedReader.close();
			builderToString = stringBuilder.toString();
			DetaCache_M.putCacheOfString(vPCSRequest.getRequestFilePath(), builderToString);
		}
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(vPCSResponse.getSocket()
				.getOutputStream(), vPCSRequest.getRequestFileCode()));
		bufferedWriter.write(builderToString);
		bufferedWriter.flush();
		bufferedWriter.close();	
	}

	public static void P_BufferBytes(VPCSRequest vPCSRequest
			, VPCSResponse vPCSResponse) throws UnsupportedEncodingException, IOException {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(StableWeb.HEADER_HTTP_200_OK);
		stringBuilder.append(StableWeb.HEADER_HOST);
		stringBuilder.append(StableWeb.HEADER_CACHE_CONTROL);
		stringBuilder.append(StableWeb.HEADER_CONTENT_ENCODING_GZIP);
		stringBuilder.append(vPCSResponse.getResponseContentType());
		String builderToString= stringBuilder.toString();
		String contentBuilderToString;
		if(null != DetaCache_M.getCacheOfString(vPCSRequest.getRequestFilePath())){
			contentBuilderToString = DetaCache_M
					.getCacheOfString(vPCSRequest.getRequestFilePath());
		}else{
			StringBuilder contentBuilder = new StringBuilder();
			FileInputStream fileInputStream = new FileInputStream(new File(vPCSRequest
					.getRequestFilePath()));
			int lengthOfFile = StablePOS.INT_ZERO;
			byte[] byteArray = new byte[StableWeb.BUFFER_RANGE_MAX];
			while ((lengthOfFile = fileInputStream.read(byteArray)) != StablePOS.INT_ERROR){
				contentBuilder.append(new String(byteArray, StablePOS.INT_ZERO, lengthOfFile
						, StableWeb.CHARSET_UTF_8));
			}
			fileInputStream.close();
			contentBuilderToString = contentBuilder.toString();
			DetaCache_M.putCacheOfString(vPCSRequest.getRequestFilePath(), contentBuilderToString);
		}	
		DataOutputStream dataOutputStream = new DataOutputStream(vPCSResponse.getSocket().getOutputStream());
		dataOutputStream.write(builderToString.getBytes(StableWeb.CHARSET_UTF8));
		dataOutputStream.write(GzipUtil.compress(contentBuilderToString.getBytes(StableWeb.CHARSET_UTF8)));
		dataOutputStream.flush();
		dataOutputStream.close();
	}

	public static void P_BytesWithoutZip(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws IOException {
		List<byte[]> list;
		DataOutputStream dataOutputStream = new DataOutputStream(vPCSResponse.getSocket().getOutputStream());
		if(DetaCache_M.getCacheOfBytesList(vPCSRequest.getRequestFilePath()) != null){
			list = DetaCache_M.getCacheOfBytesList(vPCSRequest.getRequestFilePath());
		}else{
			FileInputStream fileInputStream = new FileInputStream(new File(vPCSRequest.getRequestFilePath()));
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			byte[] byteArray = new byte[1024];
			int len = 0;
			list= new ArrayList<>();
			//��������while����˼������ ��ƪ���£�https://blog.csdn.net/top_code/article/details/41042413
			//�ǳ����ɴ���len�ĳ��������лл��
			while((len = fileInputStream.read(byteArray, 0, 1024))!=-1){
				byteArrayOutputStream.write(byteArray, 0, len);
			}
			fileInputStream.close();
			byte[] sniper =byteArrayOutputStream.toByteArray();
			list.add(0, vPCSResponse.getResponseContentType().getBytes("UTF8"));
			list.add(0, ("Content-Length: " + sniper.length + " \n").getBytes("UTF8"));
			list.add(0, ("Cache-control: max-age=315360000 \n").getBytes("UTF8"));
			list.add(0, "Accept-Ranges: bytes \n".getBytes("UTF8"));
			list.add(0, "Host:deta software  \n".getBytes("UTF8"));
			list.add(0, "HTTP/1.1 200 OK \n".getBytes("UTF8"));
			list.add(sniper);
			DetaCache_M.putCacheOfBytesList(vPCSRequest.getRequestFilePath(), list);
		}	
		Iterator<byte[]> iterator = list.iterator();
		while(iterator.hasNext()){
			byte[] bytes = null;
			int i= 0;
			try {
				bytes=iterator.next();
				if(bytes.length>10000) {
					int last= bytes.length%10000;
					for(i= 0; i< bytes.length- 10000; i+= 10000) {
						byte[] serparBytes = new byte[10000];
						for(int j= 0; j< 10000; j++) {
							serparBytes[j]= bytes[i+ j];
						}
						Thread.sleep(250);
						dataOutputStream.write(serparBytes);
						dataOutputStream.flush();
					}
					byte[] serparBytes = new byte[last];
//					i-=10000;
					for(int j=0; j<last;j++) {
						serparBytes[j]= bytes[i+ j];
					}
					dataOutputStream.write(serparBytes);
				}else {
					dataOutputStream.write(bytes);
				}
			}catch(Exception e) {
				System.out.print(i);
				System.out.print(bytes.length);
				System.out.print(vPCSRequest.getRequestLink());
				System.out.print(vPCSRequest.getRequestFilePath());
				e.printStackTrace();
			}
		}	
		dataOutputStream.flush();
		dataOutputStream.close();
	}
}