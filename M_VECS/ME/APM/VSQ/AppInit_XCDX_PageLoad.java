package ME.APM.VSQ;

import OSI.AOP.PCS.server.BootVPCSBackEnd;
import OSI.AOP.VPC.server.BootVPCSFrontEnd;
import OSQ.disk.GetDisk;
import PEI.thread.MakeContainerBJY;
import PEI.thread.MakeContainerGJJD;
import PEI.thread.MakeContainerHLS;
import PEI.thread.MakeContainerQMDJ;
import PEI.thread.MakeContainerSJFX;
import PEI.thread.MakeContainerXXFC;
import PEI.thread.MakeContainerXYCF;
import PEI.thread.MakeContainerXYJZ;
import PEI.thread.MakeContainerXYNK;
import PEI.thread.MakeContainerXYWK;
import PEI.thread.MakeContainerZNXZ;
import PEI.thread.MakeContainerZYFC;
import PEI.thread.MakeContainerZYNKFJ;
import PEI.thread.MakeContainerZYWS;
import PEI.thread.MakeContainerZYZD;
import java.awt.Container;
import java.io.IOException;
import java.util.Scanner;
public class AppInit_XCDX_PageLoad {	
	public void IV_(App app) throws IOException{
		//Register Medicine Report
		try {
			if(app.appConfig.SectionJPanel.jlabel_peizhi_di2511.isSelected()) {
				//front
				new BootVPCSFrontEnd(app).start();
				Thread.sleep(5);
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----������� ǰ�˷����� ��ϣ�"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				//backend
				new BootVPCSBackEnd(app._A).start();
				Thread.sleep(6);
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----������� ��˷����� ��ϣ�"+ text;
					text="\r\n"+ "..."+ text;
					text="\r\n"+ "----������� ���ݷ������� ��ϣ�"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[1]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----�����������ݷ���ҳ�棡"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				Container jpanelSecond= new Container();  
				MakeContainerSJFX makeContainerSJFX= new MakeContainerSJFX(app.tableData_old, app.text, app._A,jpanelSecond, app
						,app.jTabbedpane,app.tabNames, app.pos, app.pose, app.etc, app.cte);
				makeContainerSJFX.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[2]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----����������������ҳ�棡"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				Container jpanelThird= new Container();  
				MakeContainerZNXZ makeContainerZNXZ= new MakeContainerZNXZ(app._A,jpanelThird, app,app.jTabbedpane
						, app.tabNames, app.pos, app.pose, app.etc, app.cte);
				makeContainerZNXZ.start();
				Thread.sleep(300);
			}

			//			if(app.appConfig.SectionJPanel.tabNamesHook[3]) {
			//				if(app.appConfig.SectionJPanel.jTextPane!= null) {
			//					String text= app.appConfig.SectionJPanel.jTextPane.getText();
			//					text="\r\n"+ "----����������������ҳ�棡"+ text;
			//					text="\r\n"+ "..."+ text;
			//					app.appConfig.SectionJPanel.jTextPane.setText(text);
			//				}
			//				Container jpanelFourth= new Container();
			//				app.MakeContainerZNSZ c4= new MakeContainerZNSZ(app._A, jpanelFourth, app,app.jTabbedpane, app.tabNames, app.pos, app.pose, app.etc, app.cte);
			//				c4.start();
			//				Thread.sleep(300);
			//			}

			if(app.appConfig.SectionJPanel.tabNamesHook[4]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----�����������Ŷݼ�ҳ�棡"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				Container jpanel5= new Container();  
				MakeContainerQMDJ makeContainerQMDJ=new MakeContainerQMDJ(app._A,jpanel5, app, app.jTabbedpane, app.tabNames, app.pos
						,app.pose, app.etc, app.cte);
				makeContainerQMDJ.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[5]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----����������ҽ�ڿ�ҳ�棡"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerXYNK makeContainerXYNK= new MakeContainerXYNK(app._A,app, app.jTabbedpane, app.tabNames, app.pos
						,app.pose, app.etc, app.cte);
				makeContainerXYNK.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[6]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----����������ҽ����ҳ�棡"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerZYNKFJ makeContainerZYNKFJ= new MakeContainerZYNKFJ(app._A,app, app.jTabbedpane, app.tabNames, app.pos
						,app.pose, app.etc, app.cte);
				makeContainerZYNKFJ.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[7]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----����������ҽ���ҳ�棡"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerZYZD makeContainerZYZD= new MakeContainerZYZD(app._A,app,app.jTabbedpane, app.tabNames, app.pos
						,app.pose, app.etc, app.cte);
				makeContainerZYZD.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[8]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----��������ż�����ҳ�棡"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerGJJD makeContainerGJJD= new MakeContainerGJJD(app._A,app, app.jTabbedpane, app.tabNames, app.pos
						,app.pose, app.etc, app.cte);
				makeContainerGJJD.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[9]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----����������ҽ����ҳ�棡"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerZYFC makeContainerZYFC= new MakeContainerZYFC(app._A,app,app.jTabbedpane, app.tabNames, app.pos
						,app.pose, app.etc, app.cte);
				makeContainerZYFC.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[10]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----�������� ��ҽ���� ҳ�棡"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerXXFC makeContainerXXFC= new MakeContainerXXFC(app._A,app, app.jTabbedpane, app.tabNames,  app.pos
						,app.pose, app.etc, app.cte);
				makeContainerXXFC.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[11]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----�������� ��ҽ���� ҳ�棡"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerXYJZ makeContainerXYJZ=new MakeContainerXYJZ(app._A,app, app.jTabbedpane, app.tabNames, app.pos
						,app.pose, app.etc, app.cte);
				makeContainerXYJZ.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[12]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----�������� ��ҽ��� ҳ�棡"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerXYWK makeContainerXYWK= new MakeContainerXYWK(app._A,app, app.jTabbedpane, app.tabNames, app.pos
						,app.pose, app.etc, app.cte);
				makeContainerXYWK.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[13]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----�������� ��ҽ���� ҳ�棡"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerZYWS makeContainerZYWS= new MakeContainerZYWS(app._A,app, app.jTabbedpane, app.tabNames,  app.pos
						,app.pose, app.etc, app.cte);
				makeContainerZYWS.start();	
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[14]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----�������� ��ҽ���� ҳ�棡"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerXYCF makeContainerXYCF=new MakeContainerXYCF(app._A,app, app.jTabbedpane, app.tabNames,  app.pos
						,app.pose, app.etc, app.cte);
				makeContainerXYCF.start();
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[15]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text= "\r\n"+ "----�������� �༭ҳ ҳ�棡"+ text;
					text= "\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerBJY makeContainerBJY= new MakeContainerBJY(app._A, app, app.jTabbedpane, app.tabNames, app.pos,app.pose,app.etc
						, app.cte, app.pinyin, app.ctj, app.ctt, app.ctk, app.ctr);
				makeContainerBJY.start();	
				Thread.sleep(300);
			}

			if(app.appConfig.SectionJPanel.tabNamesHook[16]) {
				if(app.appConfig.SectionJPanel.jTextPane!= null) {
					String text= app.appConfig.SectionJPanel.jTextPane.getText();
					text="\r\n"+ "----�������� ����ɭҽ�� ҳ�棡"+ text;
					text="\r\n"+ "..."+ text;
					app.appConfig.SectionJPanel.jTextPane.setText(text);
				}
				MakeContainerHLS makeContainerHLS= new MakeContainerHLS(app._A, app, app.jTabbedpane, app.tabNames, app.pos
						, app.pose, app.etc, app.cte, app.posec, app.posFullec);
				makeContainerHLS.start();
			}
			if(app.appConfig.SectionJPanel.jTextPane!= null) {
				String text= app.appConfig.SectionJPanel.jTextPane.getText();
				text="\r\n"+ "----����������� ��ӭʹ�� ���ƾ� ������ҽѧ���������ƣ�����ҽԺϵͳ��"+ text;
				text="\r\n"+ "----Ψһ�汾��:BFEBFBFF-000906EA-13909532-49137476-6916="+ text;
				text="\r\n"+ "..."+ text;
				app.appConfig.SectionJPanel.jTextPane.setText(text);
			}

			try {
				Process process;
				process = Runtime.getRuntime().exec(  
						new String[] {"wmic", "cpu", "get", "ProcessorId"});
				process.getOutputStream().close();
				String value= "";
				Scanner scanner= new Scanner(process.getInputStream()); 
				while(scanner.hasNext()) {
					value+=scanner.next();	
				}
				value+= new GetDisk().getKey();
				scanner.close();
				if(!value.equalsIgnoreCase("ProcessorIdBFEBFBFF000806E9-7953033931825660327-1051895781")) {
					//return;
				}
			} catch (IOException e2) {
				e2.printStackTrace();
			}  
			app.disableCursor= false;
		} catch (IOException | InterruptedException e4) {
			app.jTabbedpane.validate();
			e4.printStackTrace();
		}
	}
}