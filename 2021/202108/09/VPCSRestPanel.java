package OPM.ESU.admin;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ME.APM.VSQ.App;
import SVQ.stable.StableHTTP;

public class VPCSRestPanel extends JPanel implements MouseListener, KeyListener, ActionListener{
	/**
	 * 罗瑶光
	 * 以后统一改 for loop 进行init 组件
	 */
	private static final long serialVersionUID= 1L;
	public JCheckBox jlabel_box[];
	private App appInThisClass;
	public VPCSRestPanel(App app){
		appInThisClass= app;
		jlabel_box= new JCheckBox[30];
		this.setLayout(null);
		this.setBounds(0, 0, 800, 600);
		this.setBackground(Color.BLACK);
		//copy tab
		
		JLabel 前端接口= new JLabel("前端接口"+ ":");  
		前端接口.setForeground(Color.white);
		前端接口.setBounds(10+ 0* 130, 20+ 25* 0, 150, 25);
		JTextField 前端接口JTextField= new JTextField();
		前端接口JTextField.setBounds(10+ 0* 130+ 160, 20+ 25* 0, 50, 25);
		前端接口JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.前端接口Txt= 前端接口JTextField.getText().trim();
			}
		});
		前端接口JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.前端接口Txt= 前端接口JTextField.getText().trim();
			}
		});
		前端接口JTextField.setText(StableHTTP.PORT_FRONTEND);
		appInThisClass.前端接口Txt= StableHTTP.PORT_FRONTEND;
		this.add(前端接口);
		this.add(前端接口JTextField);	
		
		JLabel 后端接口= new JLabel("后端接口"+ ":");  
		后端接口.setForeground(Color.white);
		后端接口.setBounds(10+ 0* 130, 20+ 25* 1, 150, 25);
		JTextField 后端接口JTextField= new JTextField();
		后端接口JTextField.setBounds(10+ 0* 130+ 160, 20+ 25* 1, 50, 25);
		后端接口JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.后端接口Txt= 后端接口JTextField.getText().trim();
			}
		});
		后端接口JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.后端接口Txt= 后端接口JTextField.getText().trim();
			}
		});
		后端接口JTextField.setText(StableHTTP.PORT_BACKEND);
		appInThisClass.后端接口Txt= StableHTTP.PORT_BACKEND;
		this.add(后端接口);
		this.add(后端接口JTextField);	
			
		JLabel 数据库接口= new JLabel("数据库接口"+ ":");  
		数据库接口.setForeground(Color.white);
		数据库接口.setBounds(10+ 0* 130, 20+ 25* 2, 150, 25);
		JTextField 数据库接口JTextField= new JTextField();
		数据库接口JTextField.setBounds(10+ 0* 130+ 160, 20+ 25* 2, 50, 25);
		数据库接口JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.数据库接口Txt= 数据库接口JTextField.getText().trim();
			}
		});
		数据库接口JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.数据库接口Txt= 数据库接口JTextField.getText().trim();
			}
		});
		数据库接口JTextField.setText(StableHTTP.PORT_DATABASE);
		appInThisClass.数据库接口Txt= StableHTTP.PORT_DATABASE;
		this.add(数据库接口);
		this.add(数据库接口JTextField);	
		
		
		JLabel 缓存接口= new JLabel("缓存接口"+ ":");  
		缓存接口.setForeground(Color.white);
		缓存接口.setBounds(10+ 0* 130, 20+ 25* 3, 150, 25);
		JTextField 缓存接口JTextField= new JTextField();
		缓存接口JTextField.setBounds(10+ 0* 130+ 160, 20+ 25* 3, 50, 25);
		缓存接口JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.缓存接口Txt= 缓存接口JTextField.getText().trim();
			}
		});
		缓存接口JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.缓存接口Txt= 缓存接口JTextField.getText().trim();
			}
		});
		缓存接口JTextField.setText(StableHTTP.PORT_CACHE);
		appInThisClass.缓存接口Txt= StableHTTP.PORT_CACHE;
		this.add(缓存接口);
		this.add(缓存接口JTextField);	
		
		
		JLabel 蓝牙接口= new JLabel("蓝牙接口"+ ":");  
		蓝牙接口.setForeground(Color.white);
		蓝牙接口.setBounds(10+ 0* 130, 20+ 25* 4, 150, 25);
		JTextField 蓝牙接口JTextField= new JTextField();
		蓝牙接口JTextField.setBounds(10+ 0* 130+ 160, 20+ 25* 4, 50, 25);
		蓝牙接口JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.蓝牙接口Txt= 蓝牙接口JTextField.getText().trim();
			}
		});
		蓝牙接口JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.蓝牙接口Txt= 蓝牙接口JTextField.getText().trim();
			}
		});
		蓝牙接口JTextField.setText(StableHTTP.PORT_BLUETOOTH);
		appInThisClass.蓝牙接口Txt= StableHTTP.PORT_BLUETOOTH;
		this.add(蓝牙接口);
		this.add(蓝牙接口JTextField);	
		
		JLabel Tel终端接口= new JLabel("Tel终端接口"+ ":");  
		Tel终端接口.setForeground(Color.white);
		Tel终端接口.setBounds(10+ 0* 130, 20+ 25* 5, 150, 25);
		JTextField Tel终端接口JTextField= new JTextField();
		Tel终端接口JTextField.setBounds(10+ 0* 130+ 160, 20+ 25* 5, 50, 25);
		Tel终端接口JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.Tel终端Txt= Tel终端接口JTextField.getText().trim();
			}
		});
		Tel终端接口JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.Tel终端Txt= Tel终端接口JTextField.getText().trim();
			}
		});
		Tel终端接口JTextField.setText(StableHTTP.PORT_TELPORT);
		appInThisClass.Tel终端Txt= StableHTTP.PORT_TELPORT;
		this.add(Tel终端接口);
		this.add(Tel终端接口JTextField);	
	
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