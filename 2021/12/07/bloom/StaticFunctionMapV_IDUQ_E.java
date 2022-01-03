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

//著作权人+ 作者= 罗瑶光
public class StaticFunctionMapV_IDUQ_E implements StaticFunctionMapV_IDUQ_C {
	public Map<String, String> annotationMap= new HashMap<>();
	@Override
	public MakeContainerSJFX 初始ETL(App app, Container jpanelSecond) {
		MakeContainerSJFX makeContainerSJFX= new MakeContainerSJFX(app.tableData_old, app.text, app._A
				, jpanelSecond, app, app.jTabbedpane,app.tabNames, app.pos, app.pose, app.etc, app.cte);
		makeContainerSJFX.start();
		return makeContainerSJFX;
	}

	@Override
	public GUISample 仅仅初始ETL(Object[][] tableData_old, JTextPane text, App app
			, CogsBinaryForest_AE _A, Map<String, String> pos) {
		GUISample gUISample= new GUISample();
		gUISample.IV_(tableData_old,text, app, _A, pos);
		gUISample.start();	
		gUISample.validate();
		return gUISample;
	}

	//调通了下，不要使用老接口，建议写新的节点。参照已有的 image read节点即可。
	//之后进行复杂场景设计。
	@Override
	public void 展示ETL() throws IOException {
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
	public void ETL文档读取() {	
	}

	@Override
	public void ETL文档执行() {
	}

	@Override
	public void ETL文档保存() {
	}
	// LoadFile{
	public String getOrigianlTextByLock(String inputString, String lockString) {
		return LoadFile.getOrigianlTextByLock(inputString, lockString);
	}

	public LinkNode Load(LinkNode first, NodeShow nodeView, File file, LinkList thislist) {
		return LoadFile.Load(first, nodeView, file, thislist);
	}

	public static void main(String[] argv) throws IOException {
		new StaticFunctionMapV_IDUQ_E().展示ETL();
	}
}
