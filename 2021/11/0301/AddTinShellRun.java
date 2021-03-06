package OSI.OSU.SI.ASQ.OSD.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.tinShell;
import java.awt.ScrollPane;

import java.io.IOException;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

import javax.swing.JFrame;

import ME.APM.VSQ.HRJFrame;
import ME.APM.VSQ.OPE.config.ShellJPanel;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
//midshell downshell, PLETL的时代开始了。稍后增加pletl的mid down 计算命令集合。
public class AddTinShellRun extends OSU_AVQ_ASQ_OPE_OPC_ECI{
	private static final long serialVersionUID= 1L;
	public int value= 0;
	public String filepath;
	public ShellJPanel shellJPanel;
	public AddTinShellRun() throws IOException{	
		super();
	}
	//把SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut的地址位剥离出来，避免计算重叠，
	//罗瑶光20211009
	@SuppressWarnings("unchecked")
	public void run(AddTinShellView SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ
			, AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI)
					throws IOException, CloneNotSupportedException{
		//因为没有在连接的线重画，触发tablein 入参，于是在准备设计找到下节点的时候来入参。罗瑶光20211103
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.tableout= this.toptablein; 	 
		//SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut= this.topOutput; 
		//if(null== SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut) {
		//	 SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut= new HashMap<String, Object>();
		//}
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut= new TinMap();
//		if(null!= this.topOutput) {//我先设置成top为mainshell mid和down为附加shell，这样就可以设计 附加shell的命令了。
//			SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut= this.topOutput.clone();
//		}
//		if(null!= this.midOutput) {
//			SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut.put("midShell", this.midOutput.clone());
//		}
//		if(null!= this.downOutput) {
//			SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut.put("downShell", this.downOutput.clone());
//		}
		
		
		if(null!= topOutput) {
			SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut= topOutput.clone();
		}
		Map<String, Object> map= (Map<String, Object>)SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut.get("TinShellETL");
		if(null!= midOutput&& null!= map) {
			map.put("midShell", midOutput.clone());
		}
		if(null!= downOutput&& null!= map) {
			map.put("downShell", downOutput.clone());
		}
		if(null!= map) {
			SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut.put("TinShellETL", map);
		}
		
//		if(null!= this.topOutput) {
//			Iterator<String> iterator= this.topOutput.keySet().iterator(); 
//			while(iterator.hasNext()) {
//				String string= iterator.next();
//				ConcurrentHashMap<String, Object> newMap= new ConcurrentHashMap<>();
//				ConcurrentHashMap<String, Object> map= (ConcurrentHashMap<String, Object>)this.topOutput.get(string);
//				Iterator<String> iterators= map.keySet().iterator(); 
//				while(iterators.hasNext()) {
//					String strings= iterators.next();
//					newMap.put(strings, map.get(strings));
//				}
//				SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut.put(string, newMap);
//			}
//		}
		//把node configure实行的时候进行保存
		//先设计一种 只有上链接的模式，以后在设计三种的
		JFrame jframe= new JFrame();
		//把SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut的地址位剥离出来，避免计算重叠，
		shellJPanel= new ShellJPanel(addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI, HRJFrame.NE, SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ
				, null== this.topOutput? new TinMap(): this.topOutput, this.midOutput, this.downOutput);
		//之前统一节点界面是300*300，因为这个改成800*750，不太好就干脆分开来
		ScrollPane scrollPane= new ScrollPane();
		scrollPane.setSize(810, 760);
		scrollPane.add(shellJPanel);
		jframe.setLayout(null);
		jframe.add(scrollPane);
		jframe.setSize(810,760);
		jframe.setIconImage(HRJFrame.NE.logo.getImage());
		jframe.setResizable(false);
		jframe.setVisible(true);
	}
	public void bootAsDoc() throws CloneNotSupportedException, InterruptedException {
//		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.tableout= this.toptablein; 	 
//		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut= new TinMap();
//		if(null!= topOutput) {
//			SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut= topOutput.clone();
//		}
//		Map<String, Object> map= (Map<String, Object>)SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut.get("TinShellETL");
//		if(null!= midOutput&& null!= map) {
//			map.put("midShell", midOutput.clone());
//		}
//		if(null!= downOutput&& null!= map) {
//			map.put("downShell", downOutput.clone());
//		}
//		if(null!= map) {
//			SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut.put("TinShellETL", map);
//		}
//		shellJPanel= new ShellJPanel(addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI, HRJFrame.NE, SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ
//				, null== this.topOutput? new TinMap(): this.topOutput, this.midOutput, this.downOutput);
//		JFrame jframe= new JFrame(); //从上面复制下来，稍后去重。
//		ScrollPane scrollPane= new ScrollPane();
//		scrollPane.setSize(810, 760);
//		scrollPane.add(shellJPanel);
//		jframe.setLayout(null);
//		jframe.add(scrollPane);
//		jframe.setSize(810,760);
//		jframe.setIconImage(HRJFrame.NE.logo.getImage());
//		jframe.setResizable(false);
//		jframe.setVisible(true);
		Thread.sleep(25);//属于中断操作 避免卡顿。
		shellJPanel.jlabel_button.doClick();
		shellJPanel.jlabel_button_clear.doClick();
		shellJPanel.jlabel_init_button.doClick();
		shellJPanel.jlabel_debug_button.doClick();
		shellJPanel.jlabel_flush_button.doClick();
	}
	public void bootAsDoc(AddTinShellView addTinShellView,
			AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI) throws InterruptedException {
		Thread.sleep(25);//属于中断操作 避免卡顿。
		shellJPanel.jlabel_button.doClick();
		shellJPanel.jlabel_button_clear.doClick();
		shellJPanel.jlabel_init_button.doClick();
		shellJPanel.jlabel_debug_button.doClick();
		shellJPanel.jlabel_flush_button.doClick();
	}
}
