package VPC.transaction;

import MSU.AMS.VQS.SQV.SI.OSU.SMV.http.SessionValidation;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.Initon;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.InitonLinkDNA;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.TokenPDI;
import PEU.P.dna.TokenCerts;

//把token pdi例子进行拆分成 3个函数，之后方便集成到data swap 包中。
//肽展作者 罗瑶光
//编码作者 罗瑶光
//见 VPC.transaction
//见 DNA元基催化与肽计算 第841页公式
//20210828
public class PdeSwapFix{
	public static String pdcToPde(String pdc, String lock, String de, String ds, String ie, String is) {
		SessionValidation sessionValidation= new SessionValidation();
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(pdc, true, lock);
		TokenPDI pDE_RNA_Formular= new TokenPDI();
		TokenPDI pDE_RNA_Formular1= new TokenPDI();
		pDE_RNA_Formular1.pdedeKey= de;
		pDE_RNA_Formular1.pdedsKey= ds;
		pDE_RNA_Formular1.pdeieKey= ie;
		pDE_RNA_Formular1.pdeisKey= is;
		pDE_RNA_Formular.doKeyUnPress(tokenCerts.getPdnPassword(), pDE_RNA_Formular1, true);
		return pDE_RNA_Formular1.pde;
	}

	public static String pdcToPds(String pdc, String lock, String de, String ds, String ie, String is) {
		SessionValidation sessionValidation= new SessionValidation();
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(pdc, true, lock);
		TokenPDI pDE_RNA_Formular= new TokenPDI();
		TokenPDI pDE_RNA_Formular1= new TokenPDI();
		pDE_RNA_Formular1.pdedeKey= de;
		pDE_RNA_Formular1.pdedsKey= ds;
		pDE_RNA_Formular1.pdeieKey= ie;
		pDE_RNA_Formular1.pdeisKey= is;
		pDE_RNA_Formular.doKeyUnPress(tokenCerts.getPdnPassword(), pDE_RNA_Formular1, true);
		return pDE_RNA_Formular1.pds;
	}

	//刚检查pds to pde 似乎被猫腻了，我测试下
	//罗瑶光 MPOASCEV
	public static String pdeToPds(String pds, String lock, String de, String ds, String ie, String is) {
		FullDNATokenPDI pDE_RNA_Formular2= new FullDNATokenPDI();
		pDE_RNA_Formular2.pdeieKey= ie;
		pDE_RNA_Formular2.pdeisKey= is;
		pDE_RNA_Formular2.pdedeKey= de;
		pDE_RNA_Formular2.pdedsKey= ds;
		System.out.println("准备计算元基DNA序列："+ pds);
		//pds~pde
		Initon[] initon= new Initon[pds.length()];
		for(int i= 0; i< pds.length(); i++) {
			if(initon[i]== null) {
				initon[i]= new Initon();
			}
			initon[i].I_Initon(""+ pds.charAt(i)); 
			if(i+ 1< pds.length()) {
				if(initon[i+ 1]== null) {
					initon[i+ 1]= new Initon();
				}
				initon[i].next= initon[i+ 1];
				initon[i+ 1].prev= initon[i];		
			}
		}	
		InitonLinkDNA initonLinkDNA= new InitonLinkDNA();
		Initon InitonPDEM= pDE_RNA_Formular2.doDecrementM(initon[0], initonLinkDNA, pDE_RNA_Formular2);
		Initon InitonPDEP= pDE_RNA_Formular2.doDecrementP(InitonPDEM, initonLinkDNA, pDE_RNA_Formular2);	
		Initon InitonPDEO= pDE_RNA_Formular2.doDecrementO(InitonPDEP, initonLinkDNA, pDE_RNA_Formular2);
		Initon InitonPDEA= pDE_RNA_Formular2.doDecrementA(InitonPDEO, initonLinkDNA, pDE_RNA_Formular2); 
		Initon InitonPDES= pDE_RNA_Formular2.doDecrementS(InitonPDEA, initonLinkDNA, pDE_RNA_Formular2, true);
		Initon InitonPDEC= pDE_RNA_Formular2.doDecrementC(InitonPDES, initonLinkDNA, pDE_RNA_Formular2);
		Initon InitonPDEE= pDE_RNA_Formular2.doDecrementE(InitonPDEC, initonLinkDNA, pDE_RNA_Formular2, true);
		Initon InitonPDEV= pDE_RNA_Formular2.doDecrementV(InitonPDEE, initonLinkDNA, pDE_RNA_Formular2);
		while(InitonPDEV.hasNext()) { 
			pDE_RNA_Formular2.pds+= InitonPDEV.getStore();
			InitonPDEV= InitonPDEV.next;
		} 
		pDE_RNA_Formular2.pds+= InitonPDEV.getStore();
		while(InitonPDEV.hasPrev()) {
			InitonPDEV= InitonPDEV.prev;
		}
		return pDE_RNA_Formular2.pds;
	}

	//把FullDNATokenPDI 类里 do_PDE_RNA_FullFormular_Back 函数中的 SCEV MPOA 注释的部分 分出来到在这里。
	//罗瑶光 VECSAOPM
	public static String pdsToPde(String pds, String lock, String de, String ds, String ie, String is) {
		FullDNATokenPDI pDE_RNA_Formular2= new FullDNATokenPDI();
		pDE_RNA_Formular2.pdeieKey= ie;
		pDE_RNA_Formular2.pdeisKey= is;
		pDE_RNA_Formular2.pdedeKey= de;
		pDE_RNA_Formular2.pdedsKey= ds;
		System.out.println("准备计算元基DNA序列："+ pds);
		//pds~pde
		Initon[] initon= new Initon[pds.length()];
		for(int i= 0; i< pds.length(); i++) {
			if(initon[i]== null) {
				initon[i]= new Initon();
			}
			initon[i].I_Initon(""+ pds.charAt(i)); 
			if(i+ 1< pds.length()) {
				if(initon[i+ 1]== null) {
					initon[i+ 1]= new Initon();
				}
				initon[i].next= initon[i+ 1];
				initon[i+ 1].prev= initon[i];		
			}
		}	
		InitonLinkDNA initonLinkDNA= new InitonLinkDNA();
		Initon InitonPDE1V= pDE_RNA_Formular2.doIncrementV(initon[0], initonLinkDNA, pDE_RNA_Formular2);	
		Initon InitonPDE1E= pDE_RNA_Formular2.doIncrementE(InitonPDE1V, initonLinkDNA, pDE_RNA_Formular2, true);
		Initon InitonPDE1C= pDE_RNA_Formular2.doIncrementC(InitonPDE1E, initonLinkDNA, pDE_RNA_Formular2); 
		Initon InitonPDE2S= pDE_RNA_Formular2.doIncrementS(InitonPDE1C, initonLinkDNA, pDE_RNA_Formular2, true);
		Initon InitonPDE1A= pDE_RNA_Formular2.doIncrementA(InitonPDE2S, initonLinkDNA, pDE_RNA_Formular2);
		Initon InitonPDE1O= pDE_RNA_Formular2.doIncrementO(InitonPDE1A, initonLinkDNA, pDE_RNA_Formular2);
		Initon InitonPDE1P= pDE_RNA_Formular2.doIncrementP(InitonPDE1O, initonLinkDNA, pDE_RNA_Formular2);	
		Initon InitonPDE1M= pDE_RNA_Formular2.doIncrementM(InitonPDE1P, initonLinkDNA, pDE_RNA_Formular2);
		while(InitonPDE1M.hasNext()) { 
			pDE_RNA_Formular2.pde+= InitonPDE1M.getStore();
			InitonPDE1M= InitonPDE1M.next;
		} 
		pDE_RNA_Formular2.pde+= InitonPDE1M.getStore();
		while(InitonPDE1M.hasPrev()) {
			InitonPDE1M= InitonPDE1M.prev;
		}
		return pDE_RNA_Formular2.pde;
	}

	public static String textToPdw(FullDNATokenPDI pDE_RNA_FullFormular, String password) {
		pDE_RNA_FullFormular.text= "控制吸收";
		pDE_RNA_FullFormular.pdw= pDE_RNA_FullFormular.initonSect(pDE_RNA_FullFormular.text);
		return pDE_RNA_FullFormular.pdw;
	}

	public static String pdwToPdc(FullDNATokenPDI pDE_RNA_FullFormular) {
		String[] lock= new String[12];
		lock[0] = "A"; lock[3] = "O"; lock[6] = "P"; lock[9]  = "M";
		lock[1] = "V"; lock[4] = "E"; lock[7] = "C"; lock[10] = "S";
		lock[2] = "I"; lock[5] = "D"; lock[8] = "U"; lock[11] = "Q";
		int i= (int)(Math.random()* 12)% 12;
		pDE_RNA_FullFormular.lock+= lock[i];
		i= (int)(Math.random()* 12)% 12;
		pDE_RNA_FullFormular.lock+= lock[i];
		i= (int)(Math.random()* 12)% 12;
		pDE_RNA_FullFormular.lock+= lock[i];
		i= (int)(Math.random()* 12)% 12;
		pDE_RNA_FullFormular.lock+= lock[i];
		for(i= 0; i< pDE_RNA_FullFormular.pdw.length(); i++) {
			pDE_RNA_FullFormular.code+= pDE_RNA_FullFormular.lock + pDE_RNA_FullFormular.pdw.charAt(i);
		}
		return pDE_RNA_FullFormular.code;
	}
	//下面这个test demo 展示了 密码-> 肽文-> 肽锁+肽密码-> 密钥,pds和pde密码 -> pds转pde验证-> pde转pds验证
	//全部封装成函数
	//罗瑶光 20210830
	public static void main(String[] argv) {
		FullDNATokenPDI pDE_RNA_FullFormular= new FullDNATokenPDI();
		pDE_RNA_FullFormular.text= "控制吸收";
		pDE_RNA_FullFormular.pdw= PdeSwapFix.textToPdw(pDE_RNA_FullFormular, pDE_RNA_FullFormular.text);
		pDE_RNA_FullFormular.code= PdeSwapFix.pdwToPdc(pDE_RNA_FullFormular);
		System.out.println("肽语: "+ pDE_RNA_FullFormular.pdw);
		System.out.println("肽锁: "+ pDE_RNA_FullFormular.lock);
		System.out.println("散列肽语:"+ pDE_RNA_FullFormular.code);
		////////////////////////////////////////////////////
		pDE_RNA_FullFormular.doKeyPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular, false);
		System.out.println("静态肽展降元概率钥匙E: "+ pDE_RNA_FullFormular.pdedeKey);
		System.out.println("静态肽展降元概率钥匙S: "+ pDE_RNA_FullFormular.pdedsKey);
		System.out.println("静态肽展降元: "+ pDE_RNA_FullFormular.pds);
		System.out.println("静态肽展增元概率钥匙E: "+ pDE_RNA_FullFormular.pdeieKey);
		System.out.println("静态肽展增元概率钥匙S: "+ pDE_RNA_FullFormular.pdeisKey);
		System.out.println("静态肽展增元: "+ pDE_RNA_FullFormular.pde);
		//////////////////////////////////////////////////////
		pDE_RNA_FullFormular.time= "" + System.currentTimeMillis();
		pDE_RNA_FullFormular.cacheId= "ID" + Math.random() + ":" + Math.random();
		System.out.println("时间:  " + pDE_RNA_FullFormular.time);
		System.out.println("账号随机缓存字符串:  " + pDE_RNA_FullFormular.cacheId);
		/////////////////////////////////////////////////////
		pDE_RNA_FullFormular.session_key= pDE_RNA_FullFormular.pde;
		System.out.println("Session: " + pDE_RNA_FullFormular.session_key);
		System.out.println("=============================================================================");
		System.out.println("开始前序验证：");
		System.out.println("开始Session解析： " + pDE_RNA_FullFormular.session_key);
		System.out.println("开始概率钥匙解析：" + pDE_RNA_FullFormular.pdedeKey+ pDE_RNA_FullFormular.pdedsKey
				+ pDE_RNA_FullFormular.pdeieKey+ pDE_RNA_FullFormular.pdeisKey);
		/////////////////////////////////////////////////
		FullDNATokenPDI pDE_RNA_FullFormular1= new FullDNATokenPDI();
		pDE_RNA_FullFormular1.pdedeKey= pDE_RNA_FullFormular.pdedeKey.toString();
		pDE_RNA_FullFormular1.pdedsKey= pDE_RNA_FullFormular.pdedsKey.toString();
		pDE_RNA_FullFormular1.pdeieKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular1.pdeisKey= pDE_RNA_FullFormular.pdeisKey.toString();
		pDE_RNA_FullFormular.doKeyUnPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular1, true);
		System.out.println();
		System.out.println("得到原降元元基DNA序列："+ pDE_RNA_FullFormular.pds);
		System.out.println("得到新降元元基DNA序列："+ pDE_RNA_FullFormular1.pds);
		System.out.println("得到原元基DNA序列："+ pDE_RNA_FullFormular.pde);
		System.out.println("得到新元基DNA序列："+ pDE_RNA_FullFormular1.pde);
		System.out.println("验证正确？");
		System.out.println(pDE_RNA_FullFormular.pde.equals(pDE_RNA_FullFormular1.pde)? "正确": "失败");

		/////////////////////////////////////////
		System.out.println("=======================================================================");
		System.out.println("开始pde降元验证：");
		FullDNATokenPDI pDE_RNA_FullFormular2= new FullDNATokenPDI();
		pDE_RNA_FullFormular2.pdeieKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular2.pdeisKey= pDE_RNA_FullFormular.pdeisKey.toString();
		pDE_RNA_FullFormular2.pdedeKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular2.pdedsKey= pDE_RNA_FullFormular.pdeisKey.toString();
		System.out.println("准备计算元基DNA序列："+ pDE_RNA_FullFormular1.pde);
		String pds= PdeSwapFix.pdeToPds(pDE_RNA_FullFormular1.pde, "",  pDE_RNA_FullFormular2.pdedeKey
				,  pDE_RNA_FullFormular2.pdedsKey
				,  pDE_RNA_FullFormular2.pdeieKey
				,  pDE_RNA_FullFormular2.pdeisKey);
		System.out.println("pds");
		System.out.println("pds");
		System.out.println(pDE_RNA_FullFormular1.pds);
		System.out.println(pds);
		//////////////////////////////////////////////////////////////////
		System.out.println("开始pds增元验证：");
		FullDNATokenPDI pDE_RNA_FullFormular3= new FullDNATokenPDI();
		pDE_RNA_FullFormular3.pdeieKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular3.pdeisKey= pDE_RNA_FullFormular.pdeisKey.toString();
		pDE_RNA_FullFormular3.pdedeKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular3.pdedsKey= pDE_RNA_FullFormular.pdeisKey.toString();

		String pde= PdeSwapFix.pdsToPde(pDE_RNA_FullFormular1.pds, "",  pDE_RNA_FullFormular3.pdedeKey
				,  pDE_RNA_FullFormular3.pdedsKey
				,  pDE_RNA_FullFormular3.pdeieKey
				,  pDE_RNA_FullFormular3.pdeisKey);
		System.out.println("pde");
		System.out.println("pde");
		System.out.println(pDE_RNA_FullFormular1.pde);
		System.out.println(pde);
	}
}