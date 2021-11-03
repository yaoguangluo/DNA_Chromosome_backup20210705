package ME.APM.VSQ.OPE.config;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//import java.beans.Beans;
//import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import ME.APM.VSQ.App;
import ME.APM.VSQ.HRJFrame;
import OSA.shell.XA_ShellTables;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ;
import OSI.OSU.SI.ASQ.OSD.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.tinShell.TinMap;
import OSM.shell.E_pl_XA_E;
public class ShellJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{
	/**
	 * �Ժ�����Ż��� �����Ȩ�ĸ�ʽ��
	 * ������
	 */
	private static final long serialVersionUID= 1L;
	public JCheckBox jlabel_box[];
	public boolean[] tabNamesHook= new boolean[30];
	public boolean isConfig= true;
	public JTextPane jTextPane;

	public JTextPane outputjTextPane;
	public String plsearch;
	public Map<String, Object> output;//׼����������������ڴ� ������20211008

	public MVQ.button.DetaButton jlabel_button_clear, jlabel_button, jlabel_init_button, jlabel_debug_button, jlabel_flush_button;
	@SuppressWarnings("unused")
	private App appInThisClass;
	@SuppressWarnings("unused")
	private JCheckBox jlabel_peizhi_di2515;
	public ShellJPanel(OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI, App app
			, OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ sQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ
			, TinMap topOutput, TinMap midOutput, TinMap downOutput){
		appInThisClass= app;
		jlabel_box= new JCheckBox[30];
		this.setLayout(null);
		this.setBounds(0, 0, 800, 600);
		this.setBackground(Color.BLACK);
		//copy tab
		jlabel_button= new MVQ.button.DetaButton("�������");
		jlabel_button.setBounds(10, 20, 100, 30);
		jlabel_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//				tabNamesHook[0]= true;
				//				isConfig= false;
				jTextPane.setText("");
				jTextPane.updateUI();
				app.jTabbedpane.validate();
				app.validate();
			}
		});
		this.add(jlabel_button);

		jlabel_button_clear= new MVQ.button.DetaButton("���ˢ��");
		jlabel_button_clear.setBounds(10+1*(100+30), 20, 100, 30);
		jlabel_button_clear.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				//  tabNamesHook[0]= true;
				//  isConfig= false;
				//��յ�ʱ�����output �ص�����
				//sQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut.remove("TinShellETL");
				//if(null!= topOutput) {

				//  ��ԭ����
				//outputout
				//tinsheletl midshell  downshell
				//	�ṹ��Ϊ
				//outputout
				//tinsheletl
				//midshell  downshell
				//��ȡ�ļ���node.thisFace���ٵ� addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI��׼��д��һ�ָ����Ĵ������ģʽ���Ժ�
				//������
				if(null!= addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.nodeConfiguration) {
					if(!addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.nodeConfiguration.replace(" ","").isEmpty()) {
						jTextPane.setText(addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.nodeConfiguration);
					}
				}
				try {
					if(null!= topOutput) {
						sQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut= topOutput.clone();
					}
					Map<String, Object> map
					= (Map<String, Object>)sQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut.get("TinShellETL");
					if(null!= midOutput&& null!= map) {
						map.put("midShell", midOutput.clone());
					}
					if(null!= downOutput&& null!= map) {
						map.put("downShell", downOutput.clone());
					}
					if(null!= map) {
						sQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut.put("TinShellETL", map);
					}
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				outputjTextPane.setText("\"����ʹ�� ���ƾ� 1.8.8.8.0 Tin Shellϵͳ(8.8.8.0) . . .\"");
				outputjTextPane.updateUI();
				//				app.jTabbedpane.validate();
				app.validate();
			}
		});
		this.add(jlabel_button_clear);

		jlabel_init_button= new MVQ.button.DetaButton("��ʼ�ű�");
		jlabel_init_button.setBounds(10+2*(100+30), 20, 100, 30);
		jlabel_init_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(null!= app) {
					app.jTabbedpane.validate();
					app.validate();
					//���ű��ۺϷ��ࡢ
					//����ִ�нű������
					//
					if(null!= HRJFrame.NE) {
						XA_ShellTables.addInitSearchShellTable(HRJFrame.NE);
					}
					outputjTextPane.setText("�Ѿ���ʼ�ű����ݡ���ע��ָ������Ϊ3000��");
					outputjTextPane.updateUI();
					app.jTabbedpane.validate();
					app.validate();
				}
			}
		});
		this.add(jlabel_init_button);

		jlabel_debug_button= new MVQ.button.DetaButton("����ű�");
		jlabel_debug_button.setBounds(10+3*(100+30), 20, 100, 30);
		jlabel_debug_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(null!= app) {
					app.jTabbedpane.validate();
					app.validate();
					//���ű��ۺϷ��ࡢ
					//����ִ�нű������
					addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.nodeConfiguration= jTextPane.getText().toString();
				}
			}
		});
		this.add(jlabel_debug_button);

		jlabel_flush_button= new MVQ.button.DetaButton("ִ�нű�");
		jlabel_flush_button.setBounds(10+ 4*(100+ 30), 20, 100, 30);
		jlabel_flush_button.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				if(null!= app) {
					app.jTabbedpane.validate();
					app.validate();
					//���ű��ۺϷ��ࡢ
					//����ִ�нű������
					//
					if(null!= addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.nodeConfiguration) {
						if(!addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.nodeConfiguration.replace(" ","").isEmpty()) {
							jTextPane.setText(addTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI.nodeConfiguration);
						}
					}
					//ִ��shell
					String plSearch= jTextPane.getText();
					try {                                                                 
						if(!sQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut.containsKey("TinShellETL")) {
							sQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut.put("TinShellETL", new ConcurrentHashMap<String, Object>());
						}
						output= E_pl_XA_E.E_pl_XA(plSearch.replace("\r\n", "")
								, false, (Map<String, Object>)sQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut.get("TinShellETL"));
						//��ʼ�漰PLETL������ �����¶�Ҫ���Ͱ�outputOut ��������VPCS������
						//����
						//�������ȥ��output�� mid down ����
						if(output.containsKey("midShell")) {
							output.remove("midShell");
						}
						if(output.containsKey("downShell")) {
							output.remove("downShell");
						}
						sQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut.put("TinShellETL", output);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					//��� ���
					outputjTextPane.setContentType("text/html");
					System.out.println("end:"+output.size());
					Iterator<String> iterator= output.keySet().iterator();
					StringBuilder stringBuilder=new StringBuilder();
					int max= 50;
					int i= 0;
					while(iterator.hasNext()){
						if(i++> max) {
							break;
						}
						String string= iterator.next();
						System.out.println(output.get(string));
						stringBuilder.append("/r/n"+output.get(string).toString());
					}
					//�Ժ��漰��ҳ20211001
					stringBuilder= stringBuilder.length()>300000? stringBuilder.delete(300000, stringBuilder.length()):stringBuilder;
					outputjTextPane.setText(stringBuilder.toString());
					outputjTextPane.validate();
				}
			}
		});
		this.add(jlabel_flush_button);

		jTextPane= new JTextPane();
		JScrollPane jsp_jTextPane= new JScrollPane(jTextPane);
		jsp_jTextPane.setBounds(10+ 0* 150, 20+ 1* 15+ 30, 765, 220);
		//		jTextPane.setText("tableName:��ҩͬԴ:select;\r\n"
		//				+ "condition:or:��Ч|contains|����:��Ч|contains|�ⶾ;\r\n"
		//				+ "condition:and:��ζ|!contains|��:����|contains|��;\r\n"
		//				+ "condition:and:���չ��|fliter|��:���չ��|fliter|��;\r\n"
		//				+ "getCulumns:��Ч:���չ��|as|����:����:��ζ:��ҩ����|as|ҩ��;\r\n"
		//				+ "aggregation:����|color|yellow;\r\n"
		//				+ "aggregation:ҩ��|color|red;\r\n"
		//				+ "aggregation:��Ч|parser|pos;\r\n"
		//				+ "aggregation:0|limit|20;\r\n"
		//				+ "aggregation:ҩ��|sortString|increment;");

		//		jTextPane.setText("����:��ҩͬԴ:ѡ��;\r\n"
		//				+ "����:��:��Ч|����|����:��Ч|����|�ⶾ;\r\n"
		//				+ "����:��:��ζ|������|��:����|����|��;\r\n"
		//				+ "����:��:���չ��|����|��:���չ��|����|��;\r\n"
		//				+ "��ȡ����:��Ч:���չ��|����|����:����:��ζ:��ҩ����|����|ҩ��;\r\n"
		//				+ "����:����|��ɫ|��ɫ;\r\n"
		//				+ "����:ҩ��|��ɫ|��ɫ;\r\n"
		//				+ "����:��Ч|�ִ�|����;\r\n"
		//				+ "����:0|����|20;\r\n"
		//				+ "����:ҩ��|�ַ�����|��С����;");
		//�Ժ����		
		//		jTextPane.setText("��ȡ����:��ҩͬԴ:����ѡ��;
		//		����Ϊ:��:��Ч|��������|���ȿ���|0;
		//		����Ϊ:��:��ҩ����|�ַ������ȴ���|3;
		//		����Ϊ:��:��Ч|����|���Ƚⶾ:��Ч|����|����;
		//		����Ϊ:��:��ζ|������|��:����|����|��;
		//		����Ϊ:��:���չ��|���˵�|��:���չ��|���˵�|��;
		//		��ȡ������:��Ч:���չ��|����Ϊ|����:����:��ζ:��ҩ����|����Ϊ|ҩ��;
		//		����:0|����|20;
		//		����:����|��ɫ���Ϊ|��ɫ;
		//		����:ҩ��|��ɫ���Ϊ|��ɫ;
		//		����:��Ч|���зִ�|DNN;
		//				+ "����:ҩ��|�����ַ�����|��С����;");
		//���������

		jTextPane.setText("��ȡ����:��ҽ���:����ѡ��;\r\n"
				+ "����Ϊ:��:�ʼ�|����|����:�ʼ�|����|����;\r\n"
				+ "��ȡ������:ID:��֢;\r\n"
				+ "����:0|����|30;\r\n"
				+ "����:��֢|���зִ�|������ɫ;\r\n"
				+ "����:ID|������������|��С����;"
				+ "����:ID|��ɫ���Ϊ|��ɫ;");
		//	+ "����:ҩ��|�����ַ�����|��С����;");
		//  + "PLETL:�нڵ�|���б��ϲ�|����Ϊ|ID|ģʽΪ|������;"

		//  �������������� rest���� ���ȷ��ų�ͻ��
		//  + "����:����1|://localhost......;" (�������)//�Ժ�

		//  + "PLTCP:��֢|����WEB����|�ӿ�Ϊ|localhost|�˿�Ϊ|8000|����Ϊ|�ִ�;" 
		//  + "PLTCP:��֢|����WEB����|�ӿ�Ϊ|localhost|�˿�Ϊ|8000|����Ϊ|DNN;" 
		//  + "PLTCP:��֢|����WEB����|�ӿ�Ϊ|localhost|�˿�Ϊ|8000|����Ϊ|POS;" 

		//  + "PLETL:�ýڵ�|�������|ģʽΪ|��ӡ;" (�������)
		//  + "PLETL:�ýڵ�|���б���|ģʽΪ|�ļ�|·��Ϊ|F��|����/����Сħ��/��������.lyg;" (�������)
		//  + "PLETL:�ĵ�|����ִ��|ʱ��Ϊ|ʱ���|·��Ϊ|D��|��������Сħ��/��������.etl;" (�������)

		this.add(jsp_jTextPane);
		outputjTextPane= new JTextPane();
		JScrollPane jsp_outputjTextPane= new JScrollPane(outputjTextPane);
		jsp_outputjTextPane.setBounds(10 + 0* 150, 20+ 1* 15+ 30+ 250, 765, 350);
		outputjTextPane.setText("\"����ʹ�� ���ƾ� 1.8.8.8.0 Tin Shellϵͳ(8.8.8.0) . . .\"");
		this.add(jsp_outputjTextPane);
		//jTextPane.setText("����ʹ�� ���ƾ� 1.8.8.8.0 Tin Shellϵͳ(8.8.8.0) . . .");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}
}