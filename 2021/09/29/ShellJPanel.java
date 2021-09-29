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
	
	public JTextPane outputjTextPane;
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
		MVQ.button.DetaButton jlabel_button= new MVQ.button.DetaButton("清空命令");
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
		
		MVQ.button.DetaButton jlabel_button_clear= new MVQ.button.DetaButton("清空输出");
		jlabel_button_clear.setBounds(10+1*(100+30), 20, 100, 30);
		jlabel_button_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				tabNamesHook[0]= true;
//				isConfig= false;
				outputjTextPane.setText("\"正在使用 养疗经 1.8.8.8.0 Tin Shell系统(8.8.8.0) . . .\"");
				outputjTextPane.updateUI();
				app.jTabbedpane.validate();
				app.validate();
			}
		});
		this.add(jlabel_button_clear);
		
		MVQ.button.DetaButton jlabel_init_button= new MVQ.button.DetaButton("初始脚本");
		jlabel_init_button.setBounds(10+2*(100+30), 20, 100, 30);
		jlabel_init_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(null!= app) {
					app.jTabbedpane.validate();
					app.validate();
					//检测脚本综合分类、
					//分类执行脚本编译机
					//
					if(null!= HRJFrame.NE) {
						SearchShellTables.addInitSearchShellTable(HRJFrame.NE);
					}
					outputjTextPane.setText("已经初始脚本数据。。");
					outputjTextPane.updateUI();
					app.jTabbedpane.validate();
					app.validate();
				}
			}
		});
		this.add(jlabel_init_button);
		
		MVQ.button.DetaButton jlabel_debug_button= new MVQ.button.DetaButton("调试脚本");
		jlabel_debug_button.setBounds(10+3*(100+30), 20, 100, 30);
		jlabel_debug_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(null!= app) {
					app.jTabbedpane.validate();
					app.validate();
					//检测脚本综合分类、
					//分类执行脚本编译机
				}
			}
		});
		this.add(jlabel_debug_button);
		
		MVQ.button.DetaButton jlabel_flush_button= new MVQ.button.DetaButton("执行脚本");
		jlabel_flush_button.setBounds(10+ 4*(100+ 30), 20, 100, 30);
		jlabel_flush_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(null!= app) {
					app.jTabbedpane.validate();
					app.validate();
					//检测脚本综合分类、
					//分类执行脚本编译机
					//
					//执行shell
					String plSearch= jTextPane.getText();
					Map<String, Object> output = null;
					try {
						output = E_PLSearch_E.E_PLSearch(plSearch, false);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					//输出 检测
					System.out.println(output.size());
					Iterator<String> iterator= output.keySet().iterator();
					while(iterator.hasNext()){
						System.out.println(output.get(iterator.next()));
						outputjTextPane.setText(outputjTextPane.getText()+"/r/n"+output.get(iterator.next()).toString());
					}
				}
			}
		});
		this.add(jlabel_flush_button);
		
		jTextPane= new JTextPane();
		JScrollPane jsp_jTextPane= new JScrollPane(jTextPane);
		jsp_jTextPane.setBounds(10+ 0* 150, 20+ 1* 15+ 30, 765, 220);
		jTextPane.setText("tableName:中药同源:select;"
				+ "condition:or:中药名称|contains|薄荷;");
		this.add(jsp_jTextPane);
		
		outputjTextPane= new JTextPane();
		JScrollPane jsp_outputjTextPane= new JScrollPane(outputjTextPane);
		jsp_outputjTextPane.setBounds(10 + 0* 150, 20+ 1* 15+ 30+ 250, 765, 350);
		outputjTextPane.setText("\"正在使用 养疗经 1.8.8.8.0 Tin Shell系统(8.8.8.0) . . .\"");
		this.add(jsp_outputjTextPane);
		//jTextPane.setText("正在使用 养疗经 1.8.8.8.0 Tin Shell系统(8.8.8.0) . . .");
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