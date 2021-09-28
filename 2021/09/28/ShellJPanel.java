package ME.APM.VSQ.OPE.config;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import ME.APM.VSQ.App;
import ME.APM.VSQ.HRJFrame;
import OSA.shell.SearchShellTables;
import OSM.shell.E_PLSearch_E;
public class ShellJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID= 1L;
	public JCheckBox jlabel_box[];
	public boolean[] tabNamesHook= new boolean[30];
	public boolean isConfig= true;
	public JTextPane jTextPane;
	public String plsearch;
	
	@SuppressWarnings("unused")
	private App appInThisClass;
	@SuppressWarnings("unused")
	private JCheckBox jlabel_peizhi_di2515;
	public ShellJPanel(App app){
		appInThisClass= app;
		jlabel_box= new JCheckBox[30];
		this.setLayout(null);
		this.setBounds(0, 0, 800, 600);
		this.setBackground(Color.BLACK);
		//copy tab
		MVQ.button.DetaButton jlabel_button= new MVQ.button.DetaButton("�������");
		jlabel_button.setBounds(10, 20, 100, 30);
		jlabel_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabNamesHook[0]= true;
				isConfig= false;
			}
		});
		this.add(jlabel_button);
		
		MVQ.button.DetaButton jlabel_init_button= new MVQ.button.DetaButton("��ʼ�ű�");
		jlabel_init_button.setBounds(10+100+30, 20, 100, 30);
		jlabel_init_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(null!= app) {
					app.jTabbedpane.validate();
					app.validate();
					//���ű��ۺϷ��ࡢ
					//����ִ�нű������
					//
					if(null!= HRJFrame.NE) {
						SearchShellTables.addInitSearchShellTable(HRJFrame.NE);
					}
					
				}
			}
		});
		this.add(jlabel_init_button);
		
		MVQ.button.DetaButton jlabel_debug_button= new MVQ.button.DetaButton("���Խű�");
		jlabel_debug_button.setBounds(10+2*(100+30), 20, 100, 30);
		jlabel_debug_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(null!= app) {
					app.jTabbedpane.validate();
					app.validate();
					//���ű��ۺϷ��ࡢ
					//����ִ�нű������
					//
				}
			}
		});
		this.add(jlabel_debug_button);
		
		MVQ.button.DetaButton jlabel_flush_button= new MVQ.button.DetaButton("ִ�нű�");
		jlabel_flush_button.setBounds(10+ 3*(100+ 30), 20, 100, 30);
		jlabel_flush_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(null!= app) {
					app.jTabbedpane.validate();
					app.validate();
					//���ű��ۺϷ��ࡢ
					//����ִ�нű������
					//
					//ִ��shell
					String plSearch= jTextPane.getText();
					Map<String, Object> output = null;
					try {
						output = E_PLSearch_E.E_PLSearch(plSearch, false);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					//��� ���
					System.out.println(output.size());
					Iterator<String> iterator= output.keySet().iterator();
					while(iterator.hasNext()){
						System.out.println(output.get(iterator.next()));
					}
				}
			}
		});
		this.add(jlabel_flush_button);
		
		jTextPane= new JTextPane();
		JScrollPane jsp_jTextPane= new JScrollPane(jTextPane);
		jsp_jTextPane.setBounds(10 + 0* 150, 20+ 1* 15+ 30, 765, 450);
		jTextPane.setText("tableName:��ҩͬԴ:select;\r\n"
				+ "condition:or:��ҩ����|contains|����;");
		this.add(jsp_jTextPane);
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