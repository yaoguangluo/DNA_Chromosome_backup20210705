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

//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public interface StaticFunctionMapO_IDUQ_C {

	public static void load(StaticFunctionMapO_IDUQ_E staticFunctionMapO_IDUQ_E) {
		// TODO Auto-generated method stub
		//稍后封装
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
	//准备开始应用测试下。
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

