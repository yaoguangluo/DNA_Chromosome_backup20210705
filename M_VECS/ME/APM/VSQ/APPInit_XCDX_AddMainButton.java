package ME.APM.VSQ;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.tinos.listen.ReadToWav;
import MVQ.button.CfxButton;
public class APPInit_XCDX_AddMainButton{
	@SuppressWarnings({ "deprecation" })
	public void IV_(App app, JPanel jPanel) throws IOException{
			MVQ.button.DetaButton jlabel_button= new MVQ.button.DetaButton("��:");
			jlabel_button.setBounds(2, 6, 56, 23);
			jlabel_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(null== app.frame) {
						app.appSearch= new AppSearch();
						app.appSearch.IV_(app.name);
						app.appSearch.setBounds(0, 0, 785, 655);
						app.appSearch.setVisible(true);
						app.appSearch.show();
						app.frame= new JFrame("���ӻ���վ V1.1.0");
						//frame.setLayout(null);
						app.frame.setSize(780, 650);
						app.frame.setLocation(300, 300);
						app.frame.setResizable(false);
						app.frame.add(app.appSearch);
						app.frame.setVisible(true);
						app.frame.show();
						app.frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
					}else {
						app.frame.setVisible(true);
						app.frame.show();
					}
				}
			});

			MVQ.button.DetaButton yin_button= new MVQ.button.DetaButton("��:");
			yin_button.setBounds(2, 33, 56, 23);
			yin_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						app.name.setText(new ReadToWav().listen());
					} catch (LineUnavailableException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (UnsupportedAudioFileException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});

			JButton addChuFang= new CfxButton("����ҽԺ", 100, 50, Color.red); 
			addChuFang.setBounds(50+50+760+130+130-100-50, 6, 100, 50);
			addChuFang.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//
					String preAdd= "������֢Ԥ���Ƽ���������ҽ���η�������ӵ��ҽʦ�ʸ�֤��Ա���ط������飬����֤�������лл!";
					preAdd+= "\r\n\r\n *************************\r\n\r\n";
					preAdd+= "���ۺ�֤�������";
					preAdd+= "\r\n\r\n *************************\r\n\r\n";
					//��ҽ��ϣ�
					preAdd+= "��ҽ��ϣ�\r\n\r\n";
					for(int i=0;i<5;i++) {
						preAdd+= "֤������"+ (null==app.zyzdxPage.table.getValueAt(i, 2)?"":app.zyzdxPage.table.getValueAt(i, 2).toString())
								//	+ "֤�����ݣ�"+	(null==zyzdx.table.getValueAt(i, 5)?"":zyzdx.table.getValueAt(i, 5).toString())
								+ "�����ԣ�"+	(null==app.zyzdxPage.table.getValueAt(i, 1)?"":app.zyzdxPage.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "�ڿ���ϣ�\r\n\r\n";
					//�ڿƷ�����
					for(int i=0;i<5;i++) {
						preAdd+= "֤������"+ (null==app.xynkPage.table.getValueAt(i, 2)?"":app.xynkPage.table.getValueAt(i, 2).toString())
								//	+ "֤�����壺"+	(null==xynkPage.table.getValueAt(i, 9)?"":xynkPage.table.getValueAt(i, 9).toString())
								+ "�����ԣ�"+	(null==app.xynkPage.table.getValueAt(i, 1)?"":app.xynkPage.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "��ҽ��ϣ�\r\n\r\n";
					//��ҽ���
					for(int i=0;i<5;i++) {
						preAdd+= "֤������"+ (null==app.jzkxPage.table.getValueAt(i, 2)?"":app.jzkxPage.table.getValueAt(i, 2).toString())
								+ "�����ԣ�"+	(null==app.jzkxPage.table.getValueAt(i, 1)?"":app.jzkxPage.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "�����ϣ�\r\n\r\n";
					//��Ʒ�����
					for(int i=0;i<5;i++) {
						preAdd+= "֤�����ݣ�"+ (null==app.wkxPage.table.getValueAt(i, 2)?"":app.wkxPage.table.getValueAt(i, 2).toString())
								+ "�����ԣ�"+	(null==app.wkxPage.table.getValueAt(i, 1)?"":app.wkxPage.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "\r\n\r\n *************************\r\n\r\n";
					preAdd+= "Сר��ϵͳ�����ϣ���ѡ����";
					preAdd+= "\r\n\r\n *************************\r\n\r\n";
					preAdd+= "������ϣ�\r\n\r\n";
					//���׷�����
					for(int i=0;i<5;i++) {
						preAdd+= "֤�����ݣ�"+ (null==app.fckxPage.table.getValueAt(i, 2)?"":app.fckxPage.table.getValueAt(i, 2).toString())
								+ "�����ԣ�"+	(null==app.fckxPage.table.getValueAt(i, 1)?"":app.fckxPage.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}

					preAdd+= "�˿ƣ�\r\n\r\n";
					//�˿Ʒ�����
					for(int i=0;i<5;i++) {
						preAdd+= "֤�����ݣ�"+ (null==app.wskxPage.table.getValueAt(i, 2)?"":app.wskxPage.table.getValueAt(i, 2).toString())
								+ "�����ԣ�"+	(null==app.wskxPage.table.getValueAt(i, 1)?"":app.wskxPage.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}

					String xiYaoTuiJian="";
					xiYaoTuiJian+= "*************************\r\n\r\n";
					xiYaoTuiJian+= "����ҽ�����ҩ������򣨿�ѡ����";
					xiYaoTuiJian+= "\r\n\r\n *************************\r\n\r\n";
					xiYaoTuiJian+= "��ҩ�Ƽ���\r\n\r\n";
					//������
					for(int i=0;i<20;i++) {
						xiYaoTuiJian+= "�Ƽ�����"+ (null==app.xyscPage.table.getValueAt(i, 2)?"":app.xyscPage.table.getValueAt(i, 2).toString())
								+ "��Ӧ���ݣ�"+	(null==app.xyscPage.table.getValueAt(i, 8)?"":app.xyscPage.table.getValueAt(i, 8).toString())
								+ "�����ԣ�"+	(null==app.xyscPage.table.getValueAt(i, 1)?"":app.xyscPage.table.getValueAt(i, 1).toString());
						xiYaoTuiJian+= "\r\n\r\n";
					}
					preAdd+= xiYaoTuiJian;
					preAdd+= "�����Ƽ���\r\n\r\n";
					//����������
					for(int i=0;i<5;i++) {
						preAdd+= "�Ƽ�����"+ (null==app.zynkxPage.table.getValueAt(i, 2)?"":app.zynkxPage.table.getValueAt(i, 2).toString())
								+ "�Ƽ����ݣ�"+(null==app.zynkxPage.table.getValueAt(i, 4)?"":app.zynkxPage.table.getValueAt(i, 4).toString())
								+ "�����ԣ�"+	(null==app.zynkxPage.table.getValueAt(i, 1)?"":app.zynkxPage.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "\r\n\r\n";

					String zhongYaoTuiJian="";
					//
					zhongYaoTuiJian+= "*************************";
					zhongYaoTuiJian+= "\r\n\r\n";
					zhongYaoTuiJian+= "������ҩ�Ƽ�����������Ȩ��������ӵ�д���Ȩְҵҩʦ���ط���ҩ����ݲ�������޸ġ�лл!";
					zhongYaoTuiJian+= "\r\n\r\n *************************";
					zhongYaoTuiJian+= "\r\n\r\n";
					for(int r= 0; r< (app.newTableModel.getRowCount()< 30? app.newTableModel.getRowCount(): 30); r++) {
						if(app.newTableModel.getValueAt(r, 2)!= null&& !app.newTableModel.getValueAt(r, 2).toString().isEmpty()) {
							zhongYaoTuiJian+= app.newTableModel.getValueAt(r, 2);
						}
						zhongYaoTuiJian+= "/";
						if(app.newTableModel.getValueAt(r, 6)!= null&&!app.newTableModel.getValueAt(r, 6).toString().isEmpty()) {
							String temp= app.newTableModel.getValueAt(r, 6).toString();
							String value= "";
							for(int i = 0; i < temp.length(); i++){
								if(temp.charAt(i)<128 || temp.charAt(i)=='~') {
									value+=temp.charAt(i);
								}else {
									value+=" ";
								}
							}
							String[] temps = value.replaceAll("\\s+", " ").split(" ");
							if(temps.length>0 && temps[0].split("~").length > 1) {
								//value = temps[0].split("~")[1];
								value = temps[0].split("~")[0].charAt(temps[0].split("~")[0].length()-1)+"~";
								value += temps[0].split("~")[1].replaceAll("g+", "");
								value += "g;";
							}else {
								value = "���������;";
							}
							zhongYaoTuiJian += value;
						}else {
							zhongYaoTuiJian += "���������;";
						}
						if(r%2!=0) {
							zhongYaoTuiJian += "\r\n\r\n";
						}else {
							zhongYaoTuiJian += "\r\n\r\n";
						}
					}
					preAdd+= zhongYaoTuiJian;
					if(app.text.getText().length()< 8000) {
						if(preAdd.length()< 8000) {
							if(!app.text.getText().isEmpty()) {
								app.text.setText(preAdd+ "\r\n\r\n"+ app.text.getText());
							}else {
								app.text.setText(preAdd);
							}
						}
					}else {
						app.text.setText(preAdd);
					}
					app.text.validate();

					if(app.jText.getText().length()< 8000) {
						if(zhongYaoTuiJian.length()< 8000) {
							if(!app.jText.getText().isEmpty()) {
								app.jText.setText(zhongYaoTuiJian+ "\r\n\r\n"+ app.jText.getText());
							}else {
								app.jText.setText(zhongYaoTuiJian);
							}
						}
					}else {
						app.jText.setText(zhongYaoTuiJian);
					}
					app.jText.validate();

					if(app.jxText.getText().length()< 8000) {
						if(xiYaoTuiJian.length()< 8000) {
							if(!app.jxText.getText().isEmpty()) {
								app.jxText.setText(xiYaoTuiJian+ "\r\n\r\n"+ app.jxText.getText());
							}else {
								app.jxText.setText(xiYaoTuiJian);
							}
						}
					}else {
						app.jxText.setText(xiYaoTuiJian);
					}
					app.jxText.validate();


					if(null== app.frameHospital) {
						app.appHospital= new AppHospital();
						app.appHospital.IV_(app.jText, app.appInstance);
						app.appHospital.setBounds(0, 0, 1145, 455);
						app.appHospital.setVisible(true);
						app.appHospital.show();
						app.frameHospital= new JFrame("����ҽԺ����Ƽ����� V0.0.3");
						//frame.setLayout(null);
						app.frameHospital.setSize(1140, 650);
						app.frameHospital.setLocation(300, 300);
						app.frameHospital.setResizable(false);
						app.frameHospital.add(app.appHospital);
						app.frameHospital.setVisible(true);
						app.frameHospital.show();
						app.frameHospital.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
					}else {						
						app.appHospital= new AppHospital();
						app.appHospital.IV_(app.jText, app.appInstance);
						app.appHospital.setBounds(0, 0, 1145, 455);
						app.appHospital.setVisible(true);
						app.appHospital.show();
						app.frameHospital= new JFrame("����ҽԺ����Ƽ����� V0.0.3");
						//frame.setLayout(null);
						app.frameHospital.setSize(1140, 650);
						app.frameHospital.setLocation(300, 300);
						app.frameHospital.setResizable(false);
						app.frameHospital.add(app.appHospital);
						app.frameHospital.setVisible(true);
						app.frameHospital.show();
						app.frameHospital.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
					}
					app.jText.validate();
				}
			});

			JButton button2= new CfxButton("��������", 100, 50, Color.cyan); 
			button2.setBounds(30+60+760+130+130+130-100-50, 6, 100, 50);
			button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String link= "http://tinos.qicp.vip/data.html";
						Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+link);
					} catch (IOException e1) {	
						app.jTabbedpane.validate();
					}
				}
			});

			JButton button5= new CfxButton("����ί", 100, 50, Color.orange); 
			button5.setBounds(10+ 70+ 760+ 130+ 130+ 130+ 130- 100- 50, 6, 100, 50);
			button5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String link="http://www.nhc.gov.cn";
						Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+link);
					} catch (IOException e1) {	
						app.jTabbedpane.validate();
					}
				}
			});	
			jPanel.add(addChuFang);
			jPanel.add(button2);
			jPanel.add(button5);
			jPanel.add(jlabel_button);
			jPanel.add(yin_button);
	}
}