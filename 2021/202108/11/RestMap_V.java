package MS.VPC.V;
import java.io.BufferedWriter;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import ME.APM.VSQ.App;
import SVQ.stable.StablePOS;
import SVQ.stable.StableWeb;
import OSI.AOP.MS.VPC.server.ServerRestMap_Standard;
import OSI.AOP.MS.VPC.server.VPCSRequest;
import OSI.AOP.MS.VPC.server.VPCSResponse;
import OSI.AOP.VPC.rest.VPC;
//���������VPC�ı�ʶ,�����ķ������,���кܶ෽�����̳�,�ҾͲ������ķ�������. VPCS ��STABLE�Ϳ��Խ��
//�ǲ�����д��.
public class RestMap_V extends ServerRestMap_Standard {
	public static void P_Rest(App app, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception {
		//VPC�����Ӽ̳�, ������� overrider ������, Ҳ�кܶ෽��, ��osgi, ��Ȼ,�����������map��ʶ,��ˬ.
		//indexVPCMapPillows.get(vPCSRequest.gettag())...;
		//���ڽ���deta����վ�����������webҳ, ���ƾ�app��û���漰, ��� pillow tag ����VPC ������rest map ������ȼ��Ժ� 
		String output= VPC.forward(app, vPCSRequest.getRequestLink()
				, vPCSRequest.getRequestValue());
		output= output.length()> 0? output:" ";
		PrintWriter printWriter= new PrintWriter(new BufferedWriter(new OutputStreamWriter(vPCSResponse.getSocket()
				.getOutputStream(),StableWeb.CHARSET_UTF_8)),true);
		printWriter.println(StableWeb.HEADER_HTTP_200_OK_DOUBLE_ENTER); 
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
	
	public static void P_RestDB(App app, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception {
		//VPC�����Ӽ̳�, ������� overrider ������, Ҳ�кܶ෽��, ��osgi, ��Ȼ,�����������map��ʶ,��ˬ.
		//indexVPCMapPillows.get(vPCSRequest.gettag())...;
		//���ڽ���deta����վ�����������webҳ, ���ƾ�app��û���漰, ��� pillow tag ����VPC ������rest map ������ȼ��Ժ� 
		String output= VPC.forwardDB(app, vPCSRequest.getRequestLink().replace("//","/")
				, vPCSRequest.getRequestValue());
		output= output.length()> 0? output: " ";
		PrintWriter printWriter= new PrintWriter(new BufferedWriter(new OutputStreamWriter(vPCSResponse.getSocket()
				.getOutputStream(),StableWeb.CHARSET_UTF_8)),true);
		printWriter.println(StableWeb.HEADER_HTTP_200_OK_DOUBLE_ENTER); 
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
}