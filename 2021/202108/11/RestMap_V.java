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
//这里出现了VPC的标识,让走四方看清楚,我有很多方法来继承,我就不用走四方的那种. VPCS 的STABLE就可以解决
//是不是我写的.
public class RestMap_V extends ServerRestMap_Standard {
	public static void P_Rest(App app, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) throws Exception {
		//VPC属于子继承, 如果不用 overrider 来分配, 也有很多方法, 如osgi, 当然,我现在用最快map标识,更爽.
		//indexVPCMapPillows.get(vPCSRequest.gettag())...;
		//现在仅仅deta的网站处理服务器有web页, 养疗经app还没有涉及, 因此 pillow tag 区分VPC 函数的rest map 设计优先级稍后 
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
		//VPC属于子继承, 如果不用 overrider 来分配, 也有很多方法, 如osgi, 当然,我现在用最快map标识,更爽.
		//indexVPCMapPillows.get(vPCSRequest.gettag())...;
		//现在仅仅deta的网站处理服务器有web页, 养疗经app还没有涉及, 因此 pillow tag 区分VPC 函数的rest map 设计优先级稍后 
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