package SEM.bloom;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
import VPC.transaction.PdeSwapFix;

//����Ȩ��+ ����= ������
//Refer��Դ������ ��DNA Ԫ���߻����ļ��� �����޶��汾 V039010912��
//֤���ţ���������-2021-L-00268255 (�л����񹲺͹� ���Ұ�Ȩ�Ǽ�����)
public interface StaticFunctionMapV_AOPM_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	public static void callFunction(String callFunctionKey, StaticFunctionMapV_AOPM_E staticFunctionMapV_AOPM_C
			, Map<String, Object> output) throws IOException {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("PdeSwapPdcToPde")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapPdcToPde((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("PdeSwapPdcToPds")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapPdcToPds((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("PdeSwapPdeToPds")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapPdeToPds((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("PdeSwapPdsToPde")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapPdsToPde((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("PdeSwapFixpdcToPde")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapFixpdcToPde((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("PdeSwapFixpdcToPds")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapFixpdcToPds((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("PdeSwapFixpdsToPde")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapFixpdsToPde((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("PdeSwapFixpdeToPds")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapFixpdeToPds((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]),(String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("PdeSwapFixtextToPdw")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapFixtextToPdw((FullDNATokenPDI)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("PdeSwapFixtextToPdw")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapFixtextToPdw((FullDNATokenPDI)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("PdeSwapFixpdwToPdc")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.PdeSwapFixpdwToPdc((FullDNATokenPDI)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("DetaDBUtilDBRequest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.DetaDBUtilDBRequest((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("DetaDBUtilbackEndRequest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.DetaDBUtilbackEndRequest((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("DetaDBUtilcacheRequest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.DetaDBUtilcacheRequest((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("IV_CulumnNameType")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapV_AOPM_C.IV_CulumnNameType();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("withoutCulumnNameType")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.withoutCulumnNameType((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("DetaFrontEndUtilbackEndRequest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.DetaFrontEndUtilbackEndRequest((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("DetaFrontEndUtilbackEndRequest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.DetaFrontEndUtilbackEndRequest((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("DetaFrontEndUtilhuaRuiJiRequest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.DetaFrontEndUtilhuaRuiJiRequest((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("DetaFrontEndUtilcacheRequest")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.DetaFrontEndUtilcacheRequest((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("IV_DB")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapV_AOPM_C.IV_DB((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};

		if(callFunctionKey.equalsIgnoreCase("compress")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.compress((String)inputValues.get(��������[����++])
						,(String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("uncompress")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapV_AOPM_C.uncompress((byte[])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	public static void load(StaticFunctionMapV_AOPM_E staticFunctionMapV_AOPM_E) {
		// TODO Auto-generated method stub
		//�Ժ��װ
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapPdcToPde", "pdc:lock:de:ds:ie:is"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapPdcToPds", "pdc:lock:de:ds:ie:is"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapPdeToPds", "pds:lock:de:ds:ie:is"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapPdsToPde", "pds:lock:de:ds:ie:is"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdcToPde", "pdc:lock:de:ds:ie:is"); 

		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdcToPds", "pdc:lock:de:ds:ie:is"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdeToPds", "pds:lock:de:ds:ie:is"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdsToPde", "pds:lock:de:ds:ie:is"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixtextToPdw", "pDE_RNA_FullFormular:password"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("PdeSwapFixpdwToPdc", "pDE_RNA_FullFormular"); 
		
		StaticFunctionMapV_AOPM_C.annotationMap.put("DetaDBUtilDBRequest", "request"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("DetaDBUtilbackEndRequest", "request"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("DetaDBUtilcacheRequest", "request"); 

		StaticFunctionMapV_AOPM_C.annotationMap.put("IV_CulumnNameType", "void"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("withoutCulumnNameType", "culumnTypeString"); 	

		StaticFunctionMapV_AOPM_C.annotationMap.put("DetaFrontEndUtilbackEndRequest", "request"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("DetaFrontEndUtilhuaRuiJiRequest", "request"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("DetaFrontEndUtilcacheRequest", "request"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("IV_DB", "request"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("compress", "data"); 
		StaticFunctionMapV_AOPM_C.annotationMap.put("uncompress", "data"); 
	}

	//PdeSwap{
	public String PdeSwapPdcToPde(String pdc, String lock, String de, String ds, String ie, String is);
	public String PdeSwapPdcToPds(String pdc, String lock, String de, String ds, String ie, String is);
	//�ռ��pds to pde �ƺ���è���ˣ��Ҳ�����
	//������ MPOASCEV
	public String PdeSwapPdeToPds(String pds, String lock, String de, String ds, String ie, String is);
	//��FullDNATokenPDI ���� do_PDE_RNA_FullFormular_Back �����е� SCEV MPOA ע�͵Ĳ��� �ֳ����������
	//������ VECSAOPM
	public String PdeSwapPdsToPde(String pds, String lock, String de, String ds, String ie, String is);
	//PdeSwapFix{
	public String PdeSwapFixpdcToPde(String pdc, String lock, String de, String ds, String ie, String is);
	public String PdeSwapFixpdcToPds(String pdc, String lock, String de, String ds, String ie, String is);

	//�ռ��pds to pde �ƺ���è���ˣ��Ҳ�����
	//������ MPOASCEV
	public String PdeSwapFixpdeToPds(String pds, String lock, String de, String ds, String ie, String is);

	//��FullDNATokenPDI ���� do_PDE_RNA_FullFormular_Back �����е� SCEV MPOA ע�͵Ĳ��� �ֳ����������
	//������ VECSAOPM
	public String PdeSwapFixpdsToPde(String pds, String lock, String de, String ds, String ie, String is);
	public String PdeSwapFixtextToPdw(FullDNATokenPDI pDE_RNA_FullFormular, String password) ;
	public String PdeSwapFixpdwToPdc(FullDNATokenPDI pDE_RNA_FullFormular) ;
	//�������test demo չʾ�� ����-> ����-> ����+������-> ��Կ,pds��pde���� -> pdsתpde��֤-> pdeתpds��֤
	//ȫ����װ�ɺ���
	//������ 20210830
	public static void main(String[] argv) {
		FullDNATokenPDI pDE_RNA_FullFormular= new FullDNATokenPDI();
		pDE_RNA_FullFormular.text= "��������";
		pDE_RNA_FullFormular.pdw= PdeSwapFix.textToPdw(pDE_RNA_FullFormular, pDE_RNA_FullFormular.text);
		pDE_RNA_FullFormular.code= PdeSwapFix.pdwToPdc(pDE_RNA_FullFormular);
		System.out.println("����: "+ pDE_RNA_FullFormular.pdw);
		System.out.println("����: "+ pDE_RNA_FullFormular.lock);
		System.out.println("ɢ������:"+ pDE_RNA_FullFormular.code);
		////////////////////////////////////////////////////
		pDE_RNA_FullFormular.doKeyPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular, false);
		System.out.println("��̬��չ��Ԫ����Կ��E: "+ pDE_RNA_FullFormular.pdedeKey);
		System.out.println("��̬��չ��Ԫ����Կ��S: "+ pDE_RNA_FullFormular.pdedsKey);
		System.out.println("��̬��չ��Ԫ: "+ pDE_RNA_FullFormular.pds);
		System.out.println("��̬��չ��Ԫ����Կ��E: "+ pDE_RNA_FullFormular.pdeieKey);
		System.out.println("��̬��չ��Ԫ����Կ��S: "+ pDE_RNA_FullFormular.pdeisKey);
		System.out.println("��̬��չ��Ԫ: "+ pDE_RNA_FullFormular.pde);
		//////////////////////////////////////////////////////
		pDE_RNA_FullFormular.time= "" + System.currentTimeMillis();
		pDE_RNA_FullFormular.cacheId= "ID" + Math.random() + ":" + Math.random();
		System.out.println("ʱ��:  " + pDE_RNA_FullFormular.time);
		System.out.println("�˺���������ַ���:  " + pDE_RNA_FullFormular.cacheId);
		/////////////////////////////////////////////////////
		pDE_RNA_FullFormular.session_key= pDE_RNA_FullFormular.pde;
		System.out.println("Session: " + pDE_RNA_FullFormular.session_key);
		System.out.println("=============================================================================");
		System.out.println("��ʼǰ����֤��");
		System.out.println("��ʼSession������ " + pDE_RNA_FullFormular.session_key);
		System.out.println("��ʼ����Կ�׽�����" + pDE_RNA_FullFormular.pdedeKey+ pDE_RNA_FullFormular.pdedsKey
				+ pDE_RNA_FullFormular.pdeieKey+ pDE_RNA_FullFormular.pdeisKey);
		/////////////////////////////////////////////////
		FullDNATokenPDI pDE_RNA_FullFormular1= new FullDNATokenPDI();
		pDE_RNA_FullFormular1.pdedeKey= pDE_RNA_FullFormular.pdedeKey.toString();
		pDE_RNA_FullFormular1.pdedsKey= pDE_RNA_FullFormular.pdedsKey.toString();
		pDE_RNA_FullFormular1.pdeieKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular1.pdeisKey= pDE_RNA_FullFormular.pdeisKey.toString();
		pDE_RNA_FullFormular.doKeyUnPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular1, true);
		System.out.println();
		System.out.println("�õ�ԭ��ԪԪ��DNA���У�"+ pDE_RNA_FullFormular.pds);
		System.out.println("�õ��½�ԪԪ��DNA���У�"+ pDE_RNA_FullFormular1.pds);
		System.out.println("�õ�ԭԪ��DNA���У�"+ pDE_RNA_FullFormular.pde);
		System.out.println("�õ���Ԫ��DNA���У�"+ pDE_RNA_FullFormular1.pde);
		System.out.println("��֤��ȷ��");
		System.out.println(pDE_RNA_FullFormular.pde.equals(pDE_RNA_FullFormular1.pde)? "��ȷ": "ʧ��");

		/////////////////////////////////////////
		System.out.println("=======================================================================");
		System.out.println("��ʼpde��Ԫ��֤��");
		FullDNATokenPDI pDE_RNA_FullFormular2= new FullDNATokenPDI();
		pDE_RNA_FullFormular2.pdeieKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular2.pdeisKey= pDE_RNA_FullFormular.pdeisKey.toString();
		pDE_RNA_FullFormular2.pdedeKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular2.pdedsKey= pDE_RNA_FullFormular.pdeisKey.toString();
		System.out.println("׼������Ԫ��DNA���У�"+ pDE_RNA_FullFormular1.pde);
		String pds= PdeSwapFix.pdeToPds(pDE_RNA_FullFormular1.pde, "",  pDE_RNA_FullFormular2.pdedeKey
				,  pDE_RNA_FullFormular2.pdedsKey
				,  pDE_RNA_FullFormular2.pdeieKey
				,  pDE_RNA_FullFormular2.pdeisKey);
		System.out.println("pds");
		System.out.println("pds");
		System.out.println(pDE_RNA_FullFormular1.pds);
		System.out.println(pds);
		//////////////////////////////////////////////////////////////////
		System.out.println("��ʼpds��Ԫ��֤��");
		FullDNATokenPDI pDE_RNA_FullFormular3= new FullDNATokenPDI();
		pDE_RNA_FullFormular3.pdeieKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular3.pdeisKey= pDE_RNA_FullFormular.pdeisKey.toString();
		pDE_RNA_FullFormular3.pdedeKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular3.pdedsKey= pDE_RNA_FullFormular.pdeisKey.toString();

		String pde= PdeSwapFix.pdsToPde(pDE_RNA_FullFormular1.pds, "",  pDE_RNA_FullFormular3.pdedeKey
				, pDE_RNA_FullFormular3.pdedsKey
				, pDE_RNA_FullFormular3.pdeieKey
				, pDE_RNA_FullFormular3.pdeisKey);
		System.out.println("pde");
		System.out.println("pde");
		System.out.println(pDE_RNA_FullFormular1.pde);
		System.out.println(pde);
	}

	//DetaDBUtil {
	public String DetaDBUtilDBRequest(String request) throws IOException ;
	public String DetaDBUtilbackEndRequest(String request) throws IOException ;
	public String DetaDBUtilcacheRequest(String request) throws IOException ;
	public void IV_CulumnNameType() ;
	public boolean withoutCulumnNameType(String culumnTypeString) ;

	// DetaFrontEndUtil {
	public String DetaFrontEndUtilbackEndRequest(String request) throws IOException;
	//�Ȳ��� �Ժ���� ����rest�� ǰ�˻��Ǻ�˻������ݿ⡣
	public String DetaFrontEndUtilhuaRuiJiRequest(String request) throws IOException ;
	public String DetaFrontEndUtilcacheRequest(String request) throws IOException ;

	//DetaUtil {
	public void IV_DB(String dbConfigPath);

	//GzipUtil {
	// ѹ��
	public byte[] compress(byte[] data) throws IOException;
	public byte[] compress(String str, String stringTypes) throws IOException;
	public byte[] uncompress(byte[] data) throws IOException;
	//jogl ��ͼ��
}
