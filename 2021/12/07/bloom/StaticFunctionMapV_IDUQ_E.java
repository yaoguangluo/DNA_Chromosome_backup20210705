package SEM.bloom;

import java.awt.Container;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash.GUISample;
import OSI.OPE.OEI.PVI.SOI.SMQ.load.LoadFile;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import PEI.thread.MakeContainerSJFX;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import ME.APM.VSQ.App;
import MVQ.tabbedpane.DetabbedPane;
//import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;

//����Ȩ��+ ����= ������
public class StaticFunctionMapV_IDUQ_E implements StaticFunctionMapV_IDUQ_C {
	public Map<String, String> annotationMap= new HashMap<>();
	@Override
	public MakeContainerSJFX ��ʼETL(App app, Container jpanelSecond) {
		MakeContainerSJFX makeContainerSJFX= new MakeContainerSJFX(app.tableData_old, app.text, app._A
				, jpanelSecond, app, app.jTabbedpane,app.tabNames, app.pos, app.pose, app.etc, app.cte);
		makeContainerSJFX.start();
		return makeContainerSJFX;
	}

	@Override
	public GUISample ������ʼETL(Object[][] tableData_old, JTextPane text, App app
			, CogsBinaryForest_AE _A, Map<String, String> pos) {
		GUISample gUISample= new GUISample();
		gUISample.IV_(tableData_old,text, app, _A, pos);
		gUISample.start();	
		gUISample.validate();
		return gUISample;
	}

	//��ͨ���£���Ҫʹ���Ͻӿڣ�����д�µĽڵ㡣�������е� image read�ڵ㼴�ɡ�
	//֮����и��ӳ�����ơ�
	@Override
	public void չʾETL() throws IOException {
		GUISample gUISample= new GUISample();
		App app= new App();
		app.gUISample= gUISample;

		CogsBinaryForest_AE _A= new CogsBinaryForest_AE();
		_A.IV_Mixed();
		Map<String, String> pos= _A.getPosCnToCn();

		JTextPane text= new JTextPane();
		app.jTabbedpane= new DetabbedPane(0, 0, null);

		gUISample.IV_(new Object[10][10], text, app, _A, pos);
		gUISample.start();	
		gUISample.validate();

		JFrame jFrame= new JFrame();
		jFrame.add(gUISample);
		jFrame.setSize(1490, 980);
		jFrame.setVisible(true);	
	}

	@Override
	public void ETL�ĵ���ȡ() {	
	}

	@Override
	public void ETL�ĵ�ִ��() {
	}

	@Override
	public void ETL�ĵ�����() {
	}
	// LoadFile{
	public String getOrigianlTextByLock(String inputString, String lockString) {
		return LoadFile.getOrigianlTextByLock(inputString, lockString);
	}

	public LinkNode Load(LinkNode first, NodeShow nodeView, File file, LinkList thislist) {
		return LoadFile.Load(first, nodeView, file, thislist);
	}

	public static void main(String[] argv) throws IOException {
		new StaticFunctionMapV_IDUQ_E().չʾETL();
	}
}
