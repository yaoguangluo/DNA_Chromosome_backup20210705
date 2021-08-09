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
	 * ������
	 * �Ժ�ͳһ�� for loop ����init ���
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
		
		JLabel ǰ�˽ӿ�= new JLabel("ǰ�˽ӿ�"+ ":");  
		ǰ�˽ӿ�.setForeground(Color.white);
		ǰ�˽ӿ�.setBounds(10+ 0* 130, 20+ 25* 0, 150, 25);
		JTextField ǰ�˽ӿ�JTextField= new JTextField();
		ǰ�˽ӿ�JTextField.setBounds(10+ 0* 130+ 160, 20+ 25* 0, 50, 25);
		ǰ�˽ӿ�JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.ǰ�˽ӿ�Txt= ǰ�˽ӿ�JTextField.getText().trim();
			}
		});
		ǰ�˽ӿ�JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.ǰ�˽ӿ�Txt= ǰ�˽ӿ�JTextField.getText().trim();
			}
		});
		ǰ�˽ӿ�JTextField.setText(StableHTTP.PORT_FRONTEND);
		appInThisClass.ǰ�˽ӿ�Txt= StableHTTP.PORT_FRONTEND;
		this.add(ǰ�˽ӿ�);
		this.add(ǰ�˽ӿ�JTextField);	
		
		JLabel ��˽ӿ�= new JLabel("��˽ӿ�"+ ":");  
		��˽ӿ�.setForeground(Color.white);
		��˽ӿ�.setBounds(10+ 0* 130, 20+ 25* 1, 150, 25);
		JTextField ��˽ӿ�JTextField= new JTextField();
		��˽ӿ�JTextField.setBounds(10+ 0* 130+ 160, 20+ 25* 1, 50, 25);
		��˽ӿ�JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.��˽ӿ�Txt= ��˽ӿ�JTextField.getText().trim();
			}
		});
		��˽ӿ�JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.��˽ӿ�Txt= ��˽ӿ�JTextField.getText().trim();
			}
		});
		��˽ӿ�JTextField.setText(StableHTTP.PORT_BACKEND);
		appInThisClass.��˽ӿ�Txt= StableHTTP.PORT_BACKEND;
		this.add(��˽ӿ�);
		this.add(��˽ӿ�JTextField);	
			
		JLabel ���ݿ�ӿ�= new JLabel("���ݿ�ӿ�"+ ":");  
		���ݿ�ӿ�.setForeground(Color.white);
		���ݿ�ӿ�.setBounds(10+ 0* 130, 20+ 25* 2, 150, 25);
		JTextField ���ݿ�ӿ�JTextField= new JTextField();
		���ݿ�ӿ�JTextField.setBounds(10+ 0* 130+ 160, 20+ 25* 2, 50, 25);
		���ݿ�ӿ�JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.���ݿ�ӿ�Txt= ���ݿ�ӿ�JTextField.getText().trim();
			}
		});
		���ݿ�ӿ�JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.���ݿ�ӿ�Txt= ���ݿ�ӿ�JTextField.getText().trim();
			}
		});
		���ݿ�ӿ�JTextField.setText(StableHTTP.PORT_DATABASE);
		appInThisClass.���ݿ�ӿ�Txt= StableHTTP.PORT_DATABASE;
		this.add(���ݿ�ӿ�);
		this.add(���ݿ�ӿ�JTextField);	
		
		
		JLabel ����ӿ�= new JLabel("����ӿ�"+ ":");  
		����ӿ�.setForeground(Color.white);
		����ӿ�.setBounds(10+ 0* 130, 20+ 25* 3, 150, 25);
		JTextField ����ӿ�JTextField= new JTextField();
		����ӿ�JTextField.setBounds(10+ 0* 130+ 160, 20+ 25* 3, 50, 25);
		����ӿ�JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.����ӿ�Txt= ����ӿ�JTextField.getText().trim();
			}
		});
		����ӿ�JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.����ӿ�Txt= ����ӿ�JTextField.getText().trim();
			}
		});
		����ӿ�JTextField.setText(StableHTTP.PORT_CACHE);
		appInThisClass.����ӿ�Txt= StableHTTP.PORT_CACHE;
		this.add(����ӿ�);
		this.add(����ӿ�JTextField);	
		
		
		JLabel �����ӿ�= new JLabel("�����ӿ�"+ ":");  
		�����ӿ�.setForeground(Color.white);
		�����ӿ�.setBounds(10+ 0* 130, 20+ 25* 4, 150, 25);
		JTextField �����ӿ�JTextField= new JTextField();
		�����ӿ�JTextField.setBounds(10+ 0* 130+ 160, 20+ 25* 4, 50, 25);
		�����ӿ�JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.�����ӿ�Txt= �����ӿ�JTextField.getText().trim();
			}
		});
		�����ӿ�JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.�����ӿ�Txt= �����ӿ�JTextField.getText().trim();
			}
		});
		�����ӿ�JTextField.setText(StableHTTP.PORT_BLUETOOTH);
		appInThisClass.�����ӿ�Txt= StableHTTP.PORT_BLUETOOTH;
		this.add(�����ӿ�);
		this.add(�����ӿ�JTextField);	
		
		JLabel Tel�ն˽ӿ�= new JLabel("Tel�ն˽ӿ�"+ ":");  
		Tel�ն˽ӿ�.setForeground(Color.white);
		Tel�ն˽ӿ�.setBounds(10+ 0* 130, 20+ 25* 5, 150, 25);
		JTextField Tel�ն˽ӿ�JTextField= new JTextField();
		Tel�ն˽ӿ�JTextField.setBounds(10+ 0* 130+ 160, 20+ 25* 5, 50, 25);
		Tel�ն˽ӿ�JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.Tel�ն�Txt= Tel�ն˽ӿ�JTextField.getText().trim();
			}
		});
		Tel�ն˽ӿ�JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.Tel�ն�Txt= Tel�ն˽ӿ�JTextField.getText().trim();
			}
		});
		Tel�ն˽ӿ�JTextField.setText(StableHTTP.PORT_TELPORT);
		appInThisClass.Tel�ն�Txt= StableHTTP.PORT_TELPORT;
		this.add(Tel�ն˽ӿ�);
		this.add(Tel�ն˽ӿ�JTextField);	
	
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