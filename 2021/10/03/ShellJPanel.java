package ME.APM.VSQ.OPE.config;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
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
//				app.jTabbedpane.validate();
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
					Map<String, Object> output = new HashMap<>();
					try {
						output = E_PLSearch_E.E_PLSearch(plSearch.replace("\r\n",""), false);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					//输出 检测
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
					//稍后涉及分页20211001
					stringBuilder= stringBuilder.length()>18000? stringBuilder.delete(18000, stringBuilder.length()):stringBuilder;
					outputjTextPane.setText(stringBuilder.toString());
					outputjTextPane.validate();
				}
			}
		});
		this.add(jlabel_flush_button);
		
		jTextPane= new JTextPane();
		JScrollPane jsp_jTextPane= new JScrollPane(jTextPane);
		jsp_jTextPane.setBounds(10+ 0* 150, 20+ 1* 15+ 30, 765, 220);
//		jTextPane.setText("tableName:中药同源:select;\r\n"
//				+ "condition:or:功效|contains|清热:功效|contains|解毒;\r\n"
//				+ "condition:and:性味|!contains|热:脉络|contains|肺;\r\n"
//				+ "condition:and:风险规避|fliter|毒:风险规避|fliter|孕;\r\n"
//				+ "getCulumns:功效:风险规避|as|风险:脉络:性味:中药名称|as|药名;\r\n"
//				+ "aggregation:风险|color|yellow;\r\n"
//				+ "aggregation:药名|color|red;\r\n"
//				+ "aggregation:功效|parser|pos;\r\n"
//				+ "aggregation:0|limit|20;\r\n"
//				+ "aggregation:药名|sortString|increment;");
		
//		jTextPane.setText("表名:中药同源:选择;\r\n"
//				+ "条件:或:功效|包含|清热:功效|包含|解毒;\r\n"
//				+ "条件:和:性味|不包含|热:脉络|包含|肺;\r\n"
//				+ "条件:和:风险规避|过滤|毒:风险规避|过滤|孕;\r\n"
//				+ "获取列名:功效:风险规避|改名|风险:脉络:性味:中药名称|改名|药名;\r\n"
//				+ "操作:风险|颜色|黄色;\r\n"
//				+ "操作:药名|颜色|红色;\r\n"
//				+ "操作:功效|分词|词性;\r\n"
//				+ "操作:0|行至|20;\r\n"
//				+ "操作:药名|字符排序|从小到大;");
//稍后改名		
		jTextPane.setText("获取表名:中药同源:进行选择;\r\n"
				+ "条件为:或:功效|包含|清热:功效|包含|解毒;\r\n"
				+ "条件为:和:性味|不包含|热:脉络|包含|肺;\r\n"
				+ "条件为:和:风险规避|过滤掉|毒:风险规避|过滤掉|孕;\r\n"
				+ "获取表列名:功效:风险规避|改名为|风险:脉络:性味:中药名称|改名为|药名;\r\n"
				+ "操作:风险|颜色标记为|黄色;\r\n"
				+ "操作:药名|颜色标记为|红色;\r\n"
				+ "操作:功效|进行分词|词性;\r\n"
				+ "操作:0|行至|20;\r\n"
				+ "操作:药名|进行字符排序|从小到大;");
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