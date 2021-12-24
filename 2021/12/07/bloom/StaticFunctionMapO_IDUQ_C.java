package SEM.bloom;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JTextPane;

import MSU.AMS.VQS.SQV.SI.OSU.SMV.http.SessionValidation;
import OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash.ThisCanvas;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OSI.OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroDoc;

//����Ȩ��+ ����= ������
//Refer��Դ������ ��DNA Ԫ���߻����ļ��� �����޶��汾 V039010912��
//֤���ţ���������-2021-L-00268255 (�л����񹲺͹� ���Ұ�Ȩ�Ǽ�����)
public interface StaticFunctionMapO_IDUQ_C {
	public static void callFunction(String callFunctionKey, StaticFunctionMapO_IDUQ_E staticFunctionMapO_IDUQ_C, Map<String, Object> output) throws IOException
	, UnsupportedAudioFileException, InterruptedException, CloneNotSupportedException {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("U_")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {//java �������ȫ������ �����ʱ��object �Զ�ȥƥ��ɴ������͵ģ� ����ת��null ����˹�ֹ���� ��дһ��exception ����ģ�顣�����Ҿ��ۡ�
				staticFunctionMapO_IDUQ_C.U_((String)inputValues.get(��������[����++]), (LinkNode)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getRandomDNAkey")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_IDUQ_C.getRandomDNAkey((SessionValidation)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("Save")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_IDUQ_C.Save((LinkNode)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("bootCell")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_IDUQ_C.bootCell((LinkNode)inputValues.get(��������[����++]),(JTextPane)inputValues.get(��������[����++])
						,(ThisCanvas)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("BootNeroDoc")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapO_IDUQ_C.BootNeroDoc((LinkList)inputValues.get(��������[����++]), (String) inputValues.get(��������[����++])
						, (NodeShow) inputValues.get(��������[����++])
						, (JTextPane) inputValues.get(��������[����++]), (ThisCanvas) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("vpcsRegister")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_IDUQ_C.vpcsRegister((LinkList)inputValues.get(��������[����++]), (String) inputValues.get(��������[����++])
						, (NodeShow) inputValues.get(��������[����++])
						, (JTextPane) inputValues.get(��������[����++]), (ThisCanvas) inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("register")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapO_IDUQ_C.register((BootNeroDoc)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	public static void load(StaticFunctionMapO_IDUQ_E staticFunctionMapO_IDUQ_E) {
		// TODO Auto-generated method stub
		//�Ժ��װ
		staticFunctionMapO_IDUQ_E.annotationMap.put("U_", "U_");
		staticFunctionMapO_IDUQ_E.annotationMap.put("getRandomDNAkey", "getRandomDNAkey");
		staticFunctionMapO_IDUQ_E.annotationMap.put("Save", "Save");
		staticFunctionMapO_IDUQ_E.annotationMap.put("bootCell", "bootCell");
		staticFunctionMapO_IDUQ_E.annotationMap.put("BootNeroDoc", "BootNeroDoc");
		staticFunctionMapO_IDUQ_E.annotationMap.put("vpcsRegister", "vpcsRegister");
		staticFunctionMapO_IDUQ_E.annotationMap.put("register", "register");
	}
	//SaveAnd_U_File{
	public void U_(String fileCurrentpath, LinkNode first);

	// SaveAs_I_File{
	//׼����ʼӦ�ò����¡�
	public Map<String, String> getRandomDNAkey(SessionValidation sessionValidation, String password)
			throws UnsupportedEncodingException;
	public void Save(LinkNode first) ;

	// BootNeroCell{
	public void bootCell(LinkNode linkNode, JTextPane rightBotJTextPane
			, ThisCanvas canvas) throws IOException, UnsupportedAudioFileException
	, InterruptedException, CloneNotSupportedException;	

	//BootNeroDoc extends Thread implements Runnable{
	public OSI.OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroDoc BootNeroDoc(LinkList first, String fileCurrentpath, NodeShow nodeView
			, JTextPane rightBotJTextPane, ThisCanvas canvas);

	// H_Keeper{
	public void vpcsRegister(LinkList first, String fileCurrentpath, NodeShow nodeView
			, JTextPane rightBotJTextPane, ThisCanvas canvas);

	// Pillow{
	public void register(BootNeroDoc bootNeroDoc);
}

