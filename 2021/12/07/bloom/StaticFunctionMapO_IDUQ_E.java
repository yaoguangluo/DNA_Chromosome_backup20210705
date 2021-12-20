package SEM.bloom;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JTextPane;

import MSU.AMS.VQS.SQV.SI.OSU.SMV.http.SessionValidation;
import OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash.ThisCanvas;
import OSI.OPE.MSI.OEI.SOI.SMQ.save.SaveAnd_U_File;
import OSI.OPE.MSI.OEI.SOI.SMQ.save.SaveAs_I_File;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OSI.OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroCell;
import OSI.OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroDoc;
import OSI.OPE.VPC.S.H_Keeper.H_Keeper;
import OSI.OPE.VPC.S.V.Pillow;

//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public class StaticFunctionMapO_IDUQ_E implements StaticFunctionMapO_IDUQ_C {
	public Map<String, String> annotationMap= new HashMap<>();
	//SaveAnd_U_File{
	public void U_(String fileCurrentpath, LinkNode first) {
		SaveAnd_U_File.U_(fileCurrentpath, first); 
	}

	// SaveAs_I_File{
	//准备开始应用测试下。
	public Map<String, String> getRandomDNAkey(SessionValidation sessionValidation, String password)
			throws UnsupportedEncodingException{
		return SaveAs_I_File.getRandomDNAkey(sessionValidation, password);
	}

	public void Save(LinkNode first) {
		SaveAs_I_File.Save(first);
	}

	// BootNeroCell{
	public void bootCell(LinkNode linkNode, JTextPane rightBotJTextPane
			, ThisCanvas canvas) throws IOException, UnsupportedAudioFileException
	, InterruptedException, CloneNotSupportedException{
		BootNeroCell.bootCell(linkNode, rightBotJTextPane, canvas);
	}	

	//BootNeroDoc extends Thread implements Runnable{
	public OSI.OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroDoc BootNeroDoc(LinkList first, String fileCurrentpath, NodeShow nodeView
			, JTextPane rightBotJTextPane, ThisCanvas canvas){
		return new BootNeroDoc(first, fileCurrentpath, nodeView, rightBotJTextPane, canvas);
	}

	// H_Keeper{
	public void vpcsRegister(LinkList first, String fileCurrentpath, NodeShow nodeView
			, JTextPane rightBotJTextPane, ThisCanvas canvas) {
		H_Keeper.vpcsRegister(first, fileCurrentpath, nodeView, rightBotJTextPane, canvas);
	}

	// Pillow{
	public void register(BootNeroDoc bootNeroDoc) {
		Pillow.register(bootNeroDoc);
	}
}
