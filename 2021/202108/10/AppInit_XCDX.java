package ME.APM.VSQ;

import java.awt.event.KeyEvent;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import MVQ.label.DetaLabelConjunction;
import MVQ.slider.DetaSlider;
import MVQ.tabbedpane.DetabbedPane;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OSI.AOP.VPC.server.RestServer;
import OSQ.disk.GetDisk;
import PEI.thread.MakeContainer_ZHONG_YAO;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import SVQ.stable.StableFile;
import MSU.OEI.ME.SMS.SEU.OSD.OSI.E.Translator_E;
import ME.APM.VSQ.OPE.hospital.DetaLabelStables;
public class AppInit_XCDX {	
	@SuppressWarnings({ "deprecation" })
	public void IV_(App app) throws IOException{
		//Register Medicine Report
		DetaLabelConjunction.detaLabelConjunction = new DetaLabelConjunction();
		DetaLabelConjunction.detaLabelConjunction.IV_();
		//Register ELEC hospital global actions clean 
		DetaLabelStables.stableImages= new DetaLabelStables();
		DetaLabelStables.stableImages.setStableImages();
		DetaLabelStables.stableImages.setTarget(false);
		//Register DNA
		StableFile.DNA_PDN.put(this.getClass().getCanonicalName(), true);
		if(!new GetDisk().getKey().replaceAll(" ", "").contains("BFBFF000806E9-79530339318")) {
			//System.out.println(new GetDisk().getKey());
			//return;
		}
		try {
			Process process;
			process = Runtime.getRuntime().exec(  
					new String[] {"wmic", "cpu", "get", "ProcessorId"});
			process.getOutputStream().close();
			String value= "";
			@SuppressWarnings("resource")
			Scanner sc= new Scanner(process.getInputStream()); 
			while(sc.hasNext()) {
				value+=sc.next();	
			}
			value+= new GetDisk().getKey();
			if(!value.equalsIgnoreCase("ProcessorIdBFEBFBFF000806E9-7953033931825660327-1051895781")) {
				//return;
			}
		} catch (IOException e2) {
			e2.printStackTrace();
		}  
		app.frameConfig= new JFrame("软件配置面板");
		app.frameConfig.setIconImage(app.logo.getImage());
		app.frameConfig.setLayout(null);
		app.frameConfig.setSize(800, 750);
		app.frameConfig.resize(800, 750);
		app.frameConfig.setResizable(false);
		//
		app.appConfig= new AppConfig();
		app.frameConfig.add(app.appConfig);
		app.frameConfig.setVisible(true);
		app.frameConfig.show();
		app.frameConfig.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		app.frameConfig.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowevent) {
				//String command= "taskkill /im dm_new.exe /f";  
				if(app.appConfig.SectionJPanel.isConfig) {
					app.frameConfig.removeAll();
					app.frameConfig.disable();
					System.gc();
					System.exit(0);
				}
			}
		});

		app.appInstance= app;
		app.appConfig.IV_(app.appInstance);
		//stop cursor
		while(app.appConfig.SectionJPanel.isConfig) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		app._A= new CogsBinaryForest_AE();
		if(app.appConfig.SectionJPanel.jTextPane!= null) {
			String text= app.appConfig.SectionJPanel.jTextPane.getText();
			text="\r\n"+ "----当前版本有效期100天."+ text;
			text="\r\n"+ "..."+ text;
			app.appConfig.SectionJPanel.jTextPane.setText(text);
		}
		app.jTabbedpane= new DetabbedPane(1000-60, 20, Color.black);// 存放选项卡的组件
		try {
			RestServer rest= new RestServer(app);
			rest.start();
			app.appConfig.SectionJPanel.jTextPane.setText("rest inject");
			if(app.appConfig.SectionJPanel.jTextPane!= null) {
				String text= app.appConfig.SectionJPanel.jTextPane.getText();
				text="\r\n"+ "----当前版本有效期100天."+ text;
				text="\r\n"+ "..."+ text;
				text="\r\n"+ "----载入德塔 Socket流 PLSQL数据库 映射添加完毕！"+ text;
				text="\r\n"+ "..."+ text;
				text="\r\n"+ "----载入德塔中文分词分析子系统完毕！"+ text;
				text="\r\n"+ "..."+ text;
				app.appConfig.SectionJPanel.jTextPane.setText(text);
			}
			while(!app.ready) {
				Thread.sleep(300);
			}
			Thread.sleep(2000);
			app._A.IV_Mixed();
			app.pos= app._A.getPosCnToCn();
			app.pose= app._A.getPosEnToEn();
			app.posec= app._A.getPosEnToCn();
			app.etc= app._A.getEnToCn();
			app.cte= app._A.getFullCnToEn();
			app.posFullec= app._A.getFullEnToCn();
			app.posFullce= app._A.getFullCnToEn();
			app.pinyin= app._A.getPinYin();
			app.ctt= app._A.getCtT();
			app.ctk= app._A.getCtA();
			app.ctr= app._A.getCtR();
			app.ctj= app._A.getCtJ();
			if(app.appConfig.SectionJPanel.jTextPane!= null) {
				String text= app.appConfig.SectionJPanel.jTextPane.getText();
				text="\r\n"+ "----当前版本有效期100天."+ text;
				text="\r\n"+ "..."+ text;
				text="\r\n"+ "----载入德塔 Socket流 PLSQL数据库 映射添加完毕！"+ text;
				text="\r\n"+ "..."+ text;
				text="\r\n"+ "----载入德塔中文分词分析子系统完毕！"+ text;
				text="\r\n"+ "..."+ text;
				text="\r\n"+ "----载入德塔 多国语言词库 映射添加完毕！"+ text;
				text="\r\n"+ "..."+ text;
				app.appConfig.SectionJPanel.jTextPane.setText(text);
			}
			app.translator= new Translator_E();
			app.translator.IV_(app._A);
			app.text= new JTextPane();
			app.jText= new JTextPane();
			app.jxText= new JTextPane();
			UIManager.put("ScrollBarUI", "OSI.OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornScrollBarUI");	
			app.jTabbedpane.setBounds(0, 60, 1345, 980);
			app.tabNames= new ArrayList<>();
			app.tabNames.add("中药本草");
			app.tabNames.add("数据分析");
			app.tabNames.add("智能相诊");
			app.tabNames.add("智能声诊");
			app.tabNames.add("奇门遁甲");
			app.tabNames.add("西医内科");
			app.tabNames.add("中医方剂诊治");
			app.tabNames.add("中医诊断");
			app.tabNames.add("古籍经典");
			app.tabNames.add("中医生殖");
			app.tabNames.add("西医生殖");
			app.tabNames.add("西医急诊");
			app.tabNames.add("大外科");
			app.tabNames.add("中医外伤");
			app.tabNames.add("西药处方");
			app.tabNames.add("编辑页");
			app.tabNames.add("哈里森大内科");

			app.jsp_name= new JScrollPane(app.app_XCDX.name());
			app.jsp_name.setBounds(10+50, 6, 580- 300, 50);

			app.jlabel_filter= new JLabel("包含过滤:");  
			app.jlabel_filter.setForeground(Color.WHITE); 
			app.jlabel_filter.setBounds(60+ 15+ 7+ 585+ 100, -6, 100, 50);

			app.jsp_name_filter= null;
			app.jsp_name_filter= new JScrollPane(app.app_XCDX.name_filter());
			app.jsp_name_filter.setBounds(60+15+30+580+ 100+ 40, 8, 580- 455, 22);	

			app.jlabel_filter_not_have= new JLabel("有关经络:");  
			app.jlabel_filter_not_have.setForeground(Color.WHITE); 
			app.jlabel_filter_not_have.setBounds(50+15+7+485+7, 20, 100, 50);

			app.jsp_name_filter_not_have= null;
			app.jsp_name_filter_not_have= new JScrollPane(app.app_XCDX.name_filter_not_have());
			app.jsp_name_filter_not_have.setBounds(50+15+7+485+7+20+ 40, 6+28, 580- 459, 22);

			app.risk_filter= new JLabel("风险过滤:");  
			app.risk_filter.setForeground(Color.WHITE);
			app.risk_filter.setBounds(10+ 350, 6, 100, 25);

			app.feel_filter= new JLabel("无关性味:"); 
			app.feel_filter.setForeground(Color.WHITE);
			app.feel_filter.setBounds(60+15+7+585+ 100, 20, 100, 50);

			app.jsp_nameFeelFilter= null;
			app.jsp_nameFeelFilter= new JScrollPane(app.app_XCDX.nameFeelFilter());
			app.jsp_nameFeelFilter.setBounds(60+15+30+580+ 100+ 40, 6+28, 580- 455, 22);


			app.jingmai_filter= new JLabel("线性观测:");  
			app.jingmai_filter.setForeground(Color.WHITE);
			app.jingmai_filter.setBounds(10+350, 21, 100, 50);


			app.look = new DetaSlider(0, 20);
			app.look.setSnapToTicks(true);
			app.look.setPaintTicks(true);
			app.look.setMajorTickSpacing(5);
			app.look.setMinorTickSpacing(1);
			app.look.setValue(0);
			app.look.addChangeListener(
					new ChangeListener(){
						public void stateChanged(ChangeEvent event){
							JSlider source = (JSlider) event.getSource();
							app.lookrot = source.getValue();
							app.appInstance.keyReleased(null);	
						}
					});
			app.look.setBounds(10+350+60, 36, 135, 20);

			app.xingwei_filter= new JLabel("功效过滤:");  
			app.xingwei_filter.setForeground(Color.WHITE); 
			app.xingwei_filter.setBounds(60+15+7+585, -6, 100, 50);

			app.zonghe_filter= new JLabel("配伍过滤:");  
			app.zonghe_filter.setForeground(Color.WHITE); 
			app.zonghe_filter.setBounds(50+15+7+485+7, -6, 100, 50);

			app.shuming_filter= new JLabel("术名过滤:");  
			app.shuming_filter.setForeground(Color.WHITE); 
			app.shuming_filter.setBounds(1+350+100+10, -6, 100, 50);

			app.zonghe_filter_box= new JCheckBox();
			app.zonghe_filter_box.setBounds(50+15+7+485+60+7, 8, 20, 20);
			app.zonghe_filter_box.setBackground(Color.ORANGE);

			app.zonghe_filter_box.addActionListener(app);

			app.shuming_filter_box= new JCheckBox();
			app.shuming_filter_box.setBounds(1+350+100+60+10, 8, 20, 20);
			app.shuming_filter_box.setBackground(Color.GREEN);

			app.jingmai_filter_box= new JCheckBox();
			app.jingmai_filter_box.setBounds(60+ 15+ 30+ 580+ 40, 8, 20, 20);
			app.jingmai_filter_box.setBackground(Color.BLUE);

			app.feel_filter_box= new JCheckBox();
			app.feel_filter_box.setBounds(60+15+30+580+40, 8, 20, 20);
			app.feel_filter_box.setBackground(Color.MAGENTA);

			app.risk_filter_box= new JCheckBox();
			app.risk_filter_box.setBounds(10+350+60, 8, 20, 20);
			app.risk_filter_box.setBackground(Color.RED);

			app.jPanel= new JPanel();
			app.jPanel.setLayout(null);
			app.jPanel.setBounds(0, 0, 1470, 980-50+ app.rangeHigh);
			app.jPanel.setBackground(Color.BLACK);

			new APPInit_XCDX_AddMainButton().IV_(app, app.jPanel);

			app.jPanel.add(app.jsp_name);
			app.jPanel.add(app.jsp_name_filter);
			app.jPanel.add(app.jlabel_filter);
			app.jPanel.add(app.jsp_name_filter_not_have);
			app.jPanel.add(app.jlabel_filter_not_have);
			app.jPanel.add(app.jTabbedpane);
			app.jPanel.add(app.risk_filter);
			app.jPanel.add(app.feel_filter);
			app.jPanel.add(app.xingwei_filter);
			app.jPanel.add(app.risk_filter_box);
			app.jPanel.add(app.look);
			app.jPanel.add(app.jsp_nameFeelFilter);
			app.jPanel.add(app.jingmai_filter);
			app.jPanel.add(app.feel_filter_box);
			//jPanel.add(jingmai_filter_box);
			app.jPanel.add(app.zonghe_filter);
			app.jPanel.add(app.shuming_filter);
			app.jPanel.add(app.zonghe_filter_box);
			app.jPanel.add(app.shuming_filter_box);
			app.jPanel.setPreferredSize(new Dimension(1330, 730+ 40+ app.rangeHigh));
			app.jScrollPane= new JScrollPane(app.jPanel);
			app.jScrollPane.setBounds(0, 0, 1335, 730+ 50+ app.rangeHigh);	
			app.appConfig.SectionJPanel.jTextPane.setText(app.appConfig.SectionJPanel.jTextPane.getText()
					+ "trap app.rangeHigh"+ app.rangeHigh);
			
			app.setLayout(null);  
			app.getContentPane().add(app.jScrollPane);
			app.jScrollPane.setViewportView(app.jPanel);
			app.setBounds(0, 0, 1345, 770+ 25+ app.rangeHigh);
			app.setVisible(true);
			Container jpanelFirst= new Container();
			MakeContainer_ZHONG_YAO makeContainer_ZHONG_YAO= null;
			makeContainer_ZHONG_YAO= new MakeContainer_ZHONG_YAO(app._A, jpanelFirst, app, app.tabNames
					, app.pos, app.jTabbedpane);
			makeContainer_ZHONG_YAO.start();
			app.appConfig.SectionJPanel.jTextPane.setText(app.appConfig.SectionJPanel.jTextPane.getText()+ "trap inject zhongyao");
			app.jTabbedpane.addTab(app.tabNames.get(0), new ImageIcon(), jpanelFirst, "first");
			app.jTabbedpane.setMnemonicAt(0, KeyEvent.VK_0); 
			app.jTabbedpane.setBackgroundAt(0, new Color(253, 233, 254));
			app.jTabbedpane.addChangeListener(app);
			Thread.sleep(300);
			app.mouseClicked(null);
			app.appConfig.SectionJPanel.jTextPane.setText(app.appConfig.SectionJPanel.jTextPane.getText()+"\r\n\r\n"+ "server inject");
			new AppInit_XCDX_PageLoad().IV_(app);
		} catch (IOException | InterruptedException e4) {
			app.jTabbedpane.validate();
			app.appConfig.SectionJPanel.jTextPane.setText(app.appConfig.SectionJPanel.jTextPane.getText()+"\r\n\r\n"+ "error app init");
			//e4.printStackTrace();
		}
	}
}