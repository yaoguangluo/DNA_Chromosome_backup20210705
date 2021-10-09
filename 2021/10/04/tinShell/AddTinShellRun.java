package OSI.OSU.SI.ASQ.OSD.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.tinShell;
import java.awt.ScrollPane;

import java.io.IOException;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.concurrent.ConcurrentHashMap;

import javax.swing.JFrame;

import ME.APM.VSQ.HRJFrame;
import ME.APM.VSQ.OPE.config.ShellJPanel;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.*;
//midshell downshell, PLETL的时代开始了。稍后增加pletl的mid down 计算命令集合。
public class AddTinShellRun extends OSU_AVQ_ASQ_OPE_OPC_ECI{
	private static final long serialVersionUID= 1L;
	public int value= 0;
	public String filepath;
	public AddTinShellRun() throws IOException{	
		super();
	}
	//把SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut的地址位剥离出来，避免计算重叠，
	//罗瑶光20211009
	public void run(final AddTinShellView SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ) throws IOException, CloneNotSupportedException{
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.tableout= this.toptablein; 	 
		//SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut= this.topOutput; 
		//if(null== SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut) {
		//	 SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut= new HashMap<String, Object>();
		//}
		SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut= new TinMap();
		if(null!= this.topOutput) {//我先设置成top为mainshell mid和down为附加shell，这样就可以设计 附加shell的命令了。
			SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut= this.topOutput.clone();
		}
		if(null!= this.midOutput) {
			SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut.put("midShell", this.midOutput.clone());
		}
		if(null!= this.downOutput) {
			SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut.put("downShell", this.downOutput.clone());
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
		//先设计一种 只有上链接的模式，以后在设计三种的
		JFrame jframe= new JFrame();
		//把SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut的地址位剥离出来，避免计算重叠，
		ShellJPanel ShellJPanel= new ShellJPanel(HRJFrame.NE, SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ
				, null== this.topOutput? new TinMap(): this.topOutput);
		//之前统一节点界面是300*300，因为这个改成800*750，不太好就干脆分开来
		ScrollPane scrollPane= new ScrollPane();
		scrollPane.setSize(810, 760);
		scrollPane.add(ShellJPanel);
		jframe.setLayout(null);
		jframe.add(scrollPane);
		jframe.setSize(810,760);
		jframe.setIconImage(HRJFrame.NE.logo.getImage());
		jframe.setResizable(false);
		jframe.setVisible(true);
	}
}
