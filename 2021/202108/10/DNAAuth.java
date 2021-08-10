package PEU.P.dna;

import java.util.Map;

import ESU.string.String_ESU;
import ME.APM.VSQ.App;
import MSU.AMS.VQS.SQV.SI.OSU.SMV.http.SessionValidation;
import OSI.AOP.PCS.PP.company_E.LoginServiceImpl;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.TokenPDI;
import PEU.P.md5.Usr;
import PEU.P.md5.UsrToken;
//��VPC�������
//MD5��tokenҲ��������������Ƶ�,����ֳ����� dna processor, ��ע��
public class DNAAuth {
	//д���µ�DNA status ��֮ǰ�����ֿ���
	//�Ժ�ϲ��£����³´�л�� ��status�� �ó�����
	public static boolean DNAAuthStatusCheckEmailAndPds(App app, String string, Map<String, String> data) throws Exception {
		//ͬ���Ժ���pds
		String uEmail= "id";
		String uPassword= "password";
		//����Ƿ���email id
		if(!data.containsKey(uEmail)|| !data.containsKey(uPassword)) {
			uEmail= "uEmail";
			uPassword= "uPassword";
			if(!data.containsKey(uEmail)|| !data.containsKey(uPassword)) {
				return false;
			}
		}
		//���db�Ƿ���email id
		Usr usr= LoginServiceImpl.findUsrByUEmail(data.get(uEmail));
		if(null== usr.getuEmail()) {
			return false;
		}
		//���ݿ�ȡ��
		UsrToken usrToken= LoginServiceImpl.findUsrTokenByUId(Integer.valueOf(usr.getuId()));
		if(null== usrToken.getuPassword()) {
			return false;
		}
		//ȡ�ܽ��м���
		String[] MD5dice_DNA= usrToken.getuKey().split(">_<");
		if(0== MD5dice_DNA.length) {
			return false;
		}
		//humanpassword-> tvmpassword
		SessionValidation sessionValidation= new SessionValidation();
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(data.get(uPassword), true, MD5dice_DNA[0]);
		//tvmpassword->pde,dps
		TokenPDI tokenPDI= new TokenPDI();
		TokenPDI bootTokenPDI= new TokenPDI();
		tokenPDI.pdedeKey= MD5dice_DNA[1];
		tokenPDI.pdedsKey= MD5dice_DNA[2];
		tokenPDI.pdeieKey= MD5dice_DNA[3];
		tokenPDI.pdeisKey= MD5dice_DNA[4];
		bootTokenPDI.doKeyUnPress(tokenCerts.getPdnPassword(), tokenPDI, true);
		//�Ա� �������ļ��� �� DB��ȡPDE����
		if(tokenPDI.pds.equals(usrToken.getuPassword())) {
			return true;
		}
		return false;
	}
	//д���µ�DNA status ��֮ǰ�����ֿ���
	public static boolean DNAAuthStatusCheckEmailAndPde(App app, String string, Map<String, String> data) throws Exception {
		String uEmail= "id";
		String uPassword= "password";
		//����Ƿ���email id
		if(!data.containsKey(uEmail)|| !data.containsKey(uPassword)) {
			return false;
		}
		//���db�Ƿ���email id
		Usr usr= LoginServiceImpl.findUsrByUEmail(data.get(uEmail));
		if(null== usr.getuEmail()) {
			return false;
		}
		//���ݿ�ȡ��
		UsrToken usrToken= LoginServiceImpl.findUsrTokenByUId(Integer.valueOf(usr.getuId()));
		if(null== usrToken.getuPassword()) {
			return false;
		}
		//�Ա� �������ļ��� �� DB��ȡPDE����
		if(data.get(uPassword).equals(usrToken.getuPassword())) {
			return true;
		}
		return false;
	}
	
	//д���µ�DNA status ��֮ǰ�����ֿ���
	public static boolean DNAAuthStatusCheckEmailAndPassword(App app, String string, Map<String, String> data) throws Exception {
		String uEmail= "id";
		String uPassword= "password";
		//����Ƿ���email id
		if(!data.containsKey(uEmail)|| !data.containsKey(uPassword)) {
			uEmail= "uEmail";
			uPassword= "uPassword";
			if(!data.containsKey(uEmail)|| !data.containsKey(uPassword)) {
				return false;
			}
		}
		//���db�Ƿ���email id
		Usr usr= LoginServiceImpl.findUsrByUEmail(data.get(uEmail));
		if(null== usr.getuEmail()) {
			if(null!= data.get("uType")) {
				if(data.get("uType").equals("register")) {
					return true;
				}
			}
			return false;
		}
		//���ݿ�ȡ��
		UsrToken usrToken= LoginServiceImpl.findUsrTokenByUId(Integer.valueOf(usr.getuId()));
		if(null== usrToken.getuPassword()) {
			return false;
		}
		//ȡ�ܽ��м���
		String[] MD5dice_DNA= usrToken.getuKey().split(">_<");
		if(0== MD5dice_DNA.length) {
			return false;
		}
		//humanpassword-> tvmpassword
		SessionValidation sessionValidation= new SessionValidation();
		TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(data.get(uPassword), true, MD5dice_DNA[0]);
		//tvmpassword->pde,dps
		TokenPDI tokenPDI= new TokenPDI();
		TokenPDI bootTokenPDI= new TokenPDI();
		tokenPDI.pdedeKey= MD5dice_DNA[1];
		tokenPDI.pdedsKey= MD5dice_DNA[2];
		tokenPDI.pdeieKey= MD5dice_DNA[3];
		tokenPDI.pdeisKey= MD5dice_DNA[4];
		bootTokenPDI.doKeyUnPress(tokenCerts.getPdnPassword(), tokenPDI, true);
		//�Ա� �������ļ��� �� DB��ȡPDE����
		if(tokenPDI.pde.equals(usrToken.getuPassword())) {
			return true;
		}
		return false;
	}
	
	public static boolean DNAAuthCheck(App app, String string, Map<String, String> data) throws Exception {
		//���ƾ���DNA����չʾ ȫ�ּ����Կ �����Ѿ��ɹ�,.
		String id= data.containsKey("id")? data.get("id"): "";
		String password= data.get("password");
		String de= data.containsKey("de")? data.get("de"): "";// data.get("de");
		String ds= data.containsKey("ds")? data.get("id"): "";// data.get("ds");
		String ie= data.containsKey("ie")? data.get("ie"): "";// data.get("ie");
		String is= data.containsKey("is")? data.get("is"): "";// data.get("is");
		String lock= data.containsKey("lock")? data.get("lock"): "";// data.get("lock");//Ҳ���ѷ����ݱ���.����rest���淢��.
		TokenPDI pDE_RNA_Formular= new TokenPDI();
		TokenPDI pDE_RNA_Formular1= new TokenPDI();
		TokenPDI pDE_RNA_Formular2= new TokenPDI();
		pDE_RNA_Formular2.pdeieKey= de;
		pDE_RNA_Formular2.pdeisKey= ds;
		pDE_RNA_Formular2.pdedeKey= ie;
		pDE_RNA_Formular2.pdedsKey= is;

		//System.out.println("׼������Ԫ��DNA���У�"+ token.getmPassword());
		//�����ϰ汾���ɣ���ȥ��dnn�����DNA�����ݲ��ԡ������� 20210730 
		//if(null== password) {
			id= "313699483@qq.com";
			String idString= String_ESU.charsetSwap(id, "GBK", "GBK");
			String idEncoder= String_ESU.stringToURIencode(idString, "UTF8");
			password= "Fengyue1985!";
			//����
			SessionValidation sessionValidation= new SessionValidation();
			TokenCerts tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(password, false, null);
			Token token= sessionValidation.sessionInitByTokenPDICertsDNA(tokenCerts);
			String passwordString= String_ESU.charsetSwap(token.getmPassword(), "GBK", "GBK");
			String passwordEncoder= String_ESU.stringToURIencode(passwordString, "UTF8");
			System.out.println("pds--1>"+ tokenCerts.getPds());
			id= idEncoder.toString();
			password= passwordEncoder.toString();
			de= token.getUpdsde();
			ds= token.getUpdsds();
			ie= token.getUpdsie();
			is= token.getUpdsis();	
			pDE_RNA_Formular2.pdeieKey= de;
			pDE_RNA_Formular2.pdeisKey= ds;
			pDE_RNA_Formular2.pdedeKey= ie;
			pDE_RNA_Formular2.pdedsKey= is;
			lock= tokenCerts.getPdnLock();
		//}
		pDE_RNA_Formular2.doSessionKeyUnPress(password, pDE_RNA_Formular2, true);
		System.out.println("pds--2>"+ pDE_RNA_Formular2.pds);

		@SuppressWarnings("unused")
		String DB_id= "313699483@qq.com";

		//String DB_id= id;
		//ģ�Ȿ�����ݿ����DB_password �����ݿ�user����ͨ��DB_id ����ȡ. ��Һ�����. 
		String DB_password= "Fengyue1985!";

		//String lock= data.get("lock");//Ҳ���ѷ����ݱ���.����rest���淢��.
		//DB_password to lock DB
		sessionValidation= new SessionValidation();
		tokenCerts= sessionValidation.sessionTokenCertsInitWithHumanWordsByDNA(DB_password, true, lock);
		pDE_RNA_Formular1.pdedeKey= de;
		pDE_RNA_Formular1.pdedsKey= ds;
		pDE_RNA_Formular1.pdeieKey= ie;
		pDE_RNA_Formular1.pdeisKey= is;
		pDE_RNA_Formular.doKeyUnPress(tokenCerts.getPdnPassword(), pDE_RNA_Formular1, true);
		System.out.println("pds--3>"+ pDE_RNA_Formular1.pds);
		//��ʼ�ȶ�
		if(!pDE_RNA_Formular1.pde.equalsIgnoreCase(password)? true: false) {
			return false;
			//�ɹ��ͷ�����,���ɹ��ͷ�����ʧ��.
			//�Ժ���ʱ���Ұ�װ�������� DNA VPCS �������ȼ����͡�
			//������ 20210422
		}
		return true;
	}
}