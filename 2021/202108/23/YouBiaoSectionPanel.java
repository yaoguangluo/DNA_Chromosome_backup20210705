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
import javax.swing.JTextPane;

import ME.APM.VSQ.App;

public class YouBiaoSectionPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * ������
	 */
	private static final long serialVersionUID= 1L;
	public String[] tabNames= {"��ҩ����", "���ݷ���", "��������", "��������",
			"���Ŷݼ�", "��ҽ�ڿ�", "��ҽ��������", "��ҽ���",
			"�ż�����", "��ҽ��ֳ", "��ҽ����", "��ҽ����",
			"�����", "��ҽ����", "��ҩ����", "�༭ҳ",
			"����ɭ���ڿ�","��ٿ�","�п�","�����","��Ⱦ��","��������",
			"�����","�����","�����","�ִ�����","��ҽѧ","������","��ҽ����","�Ŵ�ѧ"};
	public JCheckBox jlabel_box[];
	public boolean[] tabNamesHook= new boolean[30];
	public boolean isConfig= true;
	public JCheckBox jlabel_end_boxs;
	public JCheckBox jlabel_end_boxs1;
	public JCheckBox jlabel_end_boxs2;
	public JCheckBox jlabel_end_boxs3;
	public JCheckBox jlabel_peizhi_di25;
	public JTextPane jTextPane;
	public JCheckBox jlabel_peizhi_di2511;
	@SuppressWarnings("unused")
	private JCheckBox jlabel_peizhi_di2512;
	@SuppressWarnings("unused")
	private JCheckBox jlabel_peizhi_di2513;
//	private JComponent jlabelpeizhi2255;
//	private JComponent jlabelpeizhi2256;
//	private JComponent jlabelpeizhi2257;
	@SuppressWarnings("unused")
	private JCheckBox jlabel_peizhi_di2515;
	@SuppressWarnings("unused")
	private App appInThisClass;
	public YouBiaoSectionPanel(App app){
//		initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB5.txt", 5);
//		initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt", 6);
//		initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_17.txt", 17);
		appInThisClass= app;
		jlabel_box= new JCheckBox[30];
		this.setLayout(null);
		this.setBounds(0, 0, 800, 600);
		this.setBackground(Color.BLACK);
		//copy tab
		
		JLabel ��Ԫ�ḯʴŨ��= new JLabel("��Ԫ��Ũ��"+ ":");  
		��Ԫ�ḯʴŨ��.setForeground(Color.white);
		��Ԫ�ḯʴŨ��.setBounds(10+ 0* 130, 20+ 25* 0, 150, 25);
		JTextField ��Ԫ�ḯʴŨ��JTextField= new JTextField();
		��Ԫ�ḯʴŨ��JTextField.setBounds(10+ 0* 130+ 110, 20+ 25* 0, 50, 25);
		��Ԫ�ḯʴŨ��JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanFuTxt= ��Ԫ�ḯʴŨ��JTextField.getText().trim();
			}
		});
		��Ԫ�ḯʴŨ��JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonSuanFuTxt= ��Ԫ�ḯʴŨ��JTextField.getText().trim();
			}
		});
		��Ԫ�ḯʴŨ��JTextField.setText("5");
		appInThisClass.fourInitonSuanFuTxt= "5";
		this.add(��Ԫ�ḯʴŨ��);
		this.add(��Ԫ�ḯʴŨ��JTextField);	
		
		JLabel ��Ԫ�ʴŨ��= new JLabel("��Ԫ��Ũ��"+ ":");  
		��Ԫ�ʴŨ��.setForeground(Color.white);
		��Ԫ�ʴŨ��.setBounds(10+ 2* 90, 20+ 25* 0, 150, 25);
		JTextField ��Ԫ�ʴŨ��JTextField= new JTextField();
		��Ԫ�ʴŨ��JTextField.setBounds(10+ 2* 90+ 110, 20+ 25* 0, 50, 25);
		��Ԫ�ʴŨ��JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianFuTxt= ��Ԫ�ʴŨ��JTextField.getText().trim();
			}
		});
		��Ԫ�ʴŨ��JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonJianFuTxt= ��Ԫ�ʴŨ��JTextField.getText().trim();
			}
		});
		��Ԫ�ʴŨ��JTextField.setText("95");
		appInThisClass.fourInitonJianFuTxt= "95";
		this.add(��Ԫ�ʴŨ��);
		this.add(��Ԫ�ʴŨ��JTextField);	
		
		JLabel ʮ��Ԫ�ʴŨ��= new JLabel("ʮ��Ԫ��Ũ��"+ ":");  
		ʮ��Ԫ�ʴŨ��.setForeground(Color.white);
		ʮ��Ԫ�ʴŨ��.setBounds(10+ 4* 90, 20+ 25* 0, 150, 25);
		JTextField ʮ��Ԫ�ʴŨ��JTextField= new JTextField();
		ʮ��Ԫ�ʴŨ��JTextField.setBounds(10+ 4* 90+ 110, 20+ 25* 0, 50, 25);
		ʮ��Ԫ�ʴŨ��JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianFuTxt= ʮ��Ԫ�ʴŨ��JTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ʴŨ��JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonJianFuTxt= ʮ��Ԫ�ʴŨ��JTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ʴŨ��JTextField.setText("5");
		appInThisClass.sixteenInitonJianFuTxt= "5";
		this.add(ʮ��Ԫ�ʴŨ��);
		this.add(ʮ��Ԫ�ʴŨ��JTextField);	
		
		
		JLabel ʮ��Ԫ�ḯʴŨ��= new JLabel("ʮ��Ԫ��Ũ��"+ ":");  
		ʮ��Ԫ�ḯʴŨ��.setForeground(Color.white);
		ʮ��Ԫ�ḯʴŨ��.setBounds(10+ 6* 90, 20+ 25* 0, 150, 25);
		JTextField ʮ��Ԫ�ḯʴŨ��JTextField= new JTextField();
		ʮ��Ԫ�ḯʴŨ��JTextField.setBounds(10+ 6* 90+ 110, 20+ 25* 0, 50, 25);
		ʮ��Ԫ�ḯʴŨ��JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanFuTxt= ʮ��Ԫ�ḯʴŨ��JTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ḯʴŨ��JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonSuanFuTxt= ʮ��Ԫ�ḯʴŨ��JTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ḯʴŨ��JTextField.setText("95");
		appInThisClass.sixteenInitonSuanFuTxt= "95";
		this.add(ʮ��Ԫ�ḯʴŨ��);
		this.add(ʮ��Ԫ�ḯʴŨ��JTextField);	
		
		//���ط�ֵ
		//���ر�ֵ
		//���ؾ�ֵ
		
		JLabel ��Ԫ�ḯʴ���ط�ֵ= new JLabel("��Ԫ�����ط�ֵ"+ ":");  
		��Ԫ�ḯʴ���ط�ֵ.setForeground(Color.white);
		��Ԫ�ḯʴ���ط�ֵ.setBounds(10+ 0* 150, 20+ 25* 1, 150, 25);
		JTextField ��Ԫ�ḯʴ���ط�ֵJTextField= new JTextField();
		��Ԫ�ḯʴ���ط�ֵJTextField.setBounds(10+ 0* 150+ 110, 20+ 25* 1, 50, 25);
		��Ԫ�ḯʴ���ط�ֵJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanFaTxt= ��Ԫ�ḯʴ���ط�ֵJTextField.getText().trim();
			}
		});
		��Ԫ�ḯʴ���ط�ֵJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonSuanFaTxt= ��Ԫ�ḯʴ���ط�ֵJTextField.getText().trim();
			}
		});
		��Ԫ�ḯʴ���ط�ֵJTextField.setText("10");
		appInThisClass.fourInitonSuanFaTxt= "10";
		this.add(��Ԫ�ḯʴ���ط�ֵ);
		this.add(��Ԫ�ḯʴ���ط�ֵJTextField);	

		JLabel ��Ԫ�ḯʴ���ر�ֵ= new JLabel("��Ԫ�����ر�ֵ"+ ":");  
		��Ԫ�ḯʴ���ر�ֵ.setForeground(Color.white);
		��Ԫ�ḯʴ���ر�ֵ.setBounds(10+ 0* 150, 20+ 25* 2, 150, 25);
		JTextField ��Ԫ�ḯʴ���ر�ֵJTextField= new JTextField();
		��Ԫ�ḯʴ���ر�ֵJTextField.setBounds(10+ 0* 150+ 110, 20+ 25* 2, 50, 25);
		��Ԫ�ḯʴ���ر�ֵJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanBiTxt= ��Ԫ�ḯʴ���ر�ֵJTextField.getText().trim();
			}
		});
		��Ԫ�ḯʴ���ط�ֵJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonSuanBiTxt= ��Ԫ�ḯʴ���ر�ֵJTextField.getText().trim();
			}
		});
		��Ԫ�ḯʴ���ر�ֵJTextField.setText("5");
		appInThisClass.fourInitonSuanBiTxt= "5";
		this.add(��Ԫ�ḯʴ���ر�ֵ);
		this.add(��Ԫ�ḯʴ���ر�ֵJTextField);	
		
		JLabel ��Ԫ�ḯʴ���ؾ���= new JLabel("��Ԫ�����ؾ���"+ ":");  
		��Ԫ�ḯʴ���ؾ���.setForeground(Color.white);
		��Ԫ�ḯʴ���ؾ���.setBounds(10+ 0* 150, 20+ 25* 3, 150, 25);
		JTextField ��Ԫ�ḯʴ���ؾ���JTextField= new JTextField();
		��Ԫ�ḯʴ���ؾ���JTextField.setBounds(10+ 0* 150+ 110, 20+ 25* 3, 50, 25);
		��Ԫ�ḯʴ���ؾ���JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanJingTxt= ��Ԫ�ḯʴ���ؾ���JTextField.getText().trim();
			}
		});
		��Ԫ�ḯʴ���ط�ֵJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonSuanJingTxt= ��Ԫ�ḯʴ���ؾ���JTextField.getText().trim();
			}
		});
		��Ԫ�ḯʴ���ؾ���JTextField.setText("8");
		appInThisClass.fourInitonSuanJingTxt= "8";
		this.add(��Ԫ�ḯʴ���ؾ���);
		this.add(��Ԫ�ḯʴ���ؾ���JTextField);	
		
		JLabel ��Ԫ�ḯʴ����PCA= new JLabel("��Ԫ������PCA"+ ":");  
		��Ԫ�ḯʴ����PCA.setForeground(Color.white);
		��Ԫ�ḯʴ����PCA.setBounds(10+ 0* 150, 20+ 25* 4, 150, 25);
		JTextField ��Ԫ�ḯʴ����PCAJTextField= new JTextField();
		��Ԫ�ḯʴ����PCAJTextField.setBounds(10+ 0* 150+ 110, 20+ 25* 4, 50, 25);
		��Ԫ�ḯʴ����PCAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanPCATxt= ��Ԫ�ḯʴ����PCAJTextField.getText().trim();
			}
		});
		��Ԫ�ḯʴ����PCAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonSuanPCATxt= ��Ԫ�ḯʴ����PCAJTextField.getText().trim();
			}
		});
		��Ԫ�ḯʴ����PCAJTextField.setText("25");
		appInThisClass.fourInitonSuanPCATxt= "25";
		this.add(��Ԫ�ḯʴ����PCA);
		this.add(��Ԫ�ḯʴ����PCAJTextField);	
		
		
		JLabel ��Ԫ�ḯʴ����ICA= new JLabel("��Ԫ������ICA"+ ":");  
		��Ԫ�ḯʴ����ICA.setForeground(Color.white);
		��Ԫ�ḯʴ����ICA.setBounds(10+ 0* 150, 20+ 25* 5, 150, 25);
		JTextField ��Ԫ�ḯʴ����ICAJTextField= new JTextField();
		��Ԫ�ḯʴ����ICAJTextField.setBounds(10+ 0* 150+ 110, 20+ 25* 5, 50, 25);
		��Ԫ�ḯʴ����ICAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanICATxt= ��Ԫ�ḯʴ����ICAJTextField.getText().trim();
			}
		});
		��Ԫ�ḯʴ����ICAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonSuanICATxt= ��Ԫ�ḯʴ����ICAJTextField.getText().trim();
			}
		});
		��Ԫ�ḯʴ����ICAJTextField.setText("15");
		appInThisClass.fourInitonSuanICATxt= "15";
		this.add(��Ԫ�ḯʴ����ICA);
		this.add(��Ԫ�ḯʴ����ICAJTextField);	
		
		JLabel ��Ԫ�ḯʴ����ECA= new JLabel("��Ԫ������ECA"+ ":");  
		��Ԫ�ḯʴ����ECA.setForeground(Color.white);
		��Ԫ�ḯʴ����ECA.setBounds(10+ 0* 150, 20+ 25* 6, 150, 25);
		JTextField ��Ԫ�ḯʴ����ECAJTextField= new JTextField();
		��Ԫ�ḯʴ����ECAJTextField.setBounds(10+ 0* 150+ 110, 20+ 25* 6, 50, 25);
		��Ԫ�ḯʴ����ECAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanECATxt= ��Ԫ�ḯʴ����ECAJTextField.getText().trim();
			}
		});
		��Ԫ�ḯʴ����ECAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonSuanECATxt= ��Ԫ�ḯʴ����ECAJTextField.getText().trim();
			}
		});
		��Ԫ�ḯʴ����ECAJTextField.setText("20");
		appInThisClass.fourInitonSuanECATxt= "20";
		this.add(��Ԫ�ḯʴ����ECA);
		this.add(��Ԫ�ḯʴ����ECAJTextField);	
		
		JLabel ��Ԫ�ḯʴ����UPCA= new JLabel("��Ԫ������UPCA"+ ":");  
		��Ԫ�ḯʴ����UPCA.setForeground(Color.white);
		��Ԫ�ḯʴ����UPCA.setBounds(10+ 0* 150, 20+ 25* 7, 150, 25);
		JTextField ��Ԫ�ḯʴ����UPCAJTextField= new JTextField();
		��Ԫ�ḯʴ����UPCAJTextField.setBounds(10+ 0* 150+ 110, 20+ 25* 7, 50, 25);
		��Ԫ�ḯʴ����UPCAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanUPCATxt= ��Ԫ�ḯʴ����UPCAJTextField.getText().trim();
			}
		});
		��Ԫ�ḯʴ����UPCAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonSuanUPCATxt= ��Ԫ�ḯʴ����UPCAJTextField.getText().trim();
			}
		});
		��Ԫ�ḯʴ����UPCAJTextField.setText("15");
		appInThisClass.fourInitonSuanUPCATxt= "15";
		this.add(��Ԫ�ḯʴ����UPCA);
		this.add(��Ԫ�ḯʴ����UPCAJTextField);	
	///////////////////////////////////////////////////////////////////////////////////////////	
		
		//���ط�ֵ
		//���ر�ֵ
		//���ؾ�ֵ
		JLabel ��Ԫ�ʴ���ط�ֵ= new JLabel("��Ԫ�����ط�ֵ"+ ":");  
		��Ԫ�ʴ���ط�ֵ.setForeground(Color.white);
		��Ԫ�ʴ���ط�ֵ.setBounds(10+ 2* 90, 20+ 25* 1, 150, 25);
		JTextField ��Ԫ�ʴ���ط�ֵJTextField= new JTextField();
		��Ԫ�ʴ���ط�ֵJTextField.setBounds(10+ 2* 90+ 110, 20+ 25* 1, 50, 25);
		��Ԫ�ʴ���ط�ֵJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianFaTxt= ��Ԫ�ʴ���ط�ֵJTextField.getText().trim();
			}
		});
		��Ԫ�ʴ���ط�ֵJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonJianFaTxt= ��Ԫ�ʴ���ط�ֵJTextField.getText().trim();
			}
		});
		��Ԫ�ʴ���ط�ֵJTextField.setText("10");
		appInThisClass.fourInitonJianFaTxt= "10";
		this.add(��Ԫ�ʴ���ط�ֵ);
		this.add(��Ԫ�ʴ���ط�ֵJTextField);	

		JLabel ��Ԫ�ʴ���ر�ֵ= new JLabel("��Ԫ�����ر�ֵ"+ ":");  
		��Ԫ�ʴ���ر�ֵ.setForeground(Color.white);
		��Ԫ�ʴ���ر�ֵ.setBounds(10+ 2* 90, 20+ 25* 2, 150, 25);
		JTextField ��Ԫ�ʴ���ر�ֵJTextField= new JTextField();
		��Ԫ�ʴ���ر�ֵJTextField.setBounds(10+ 2* 90+ 110, 20+ 25* 2, 50, 25);
		��Ԫ�ʴ���ر�ֵJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianBiTxt= ��Ԫ�ʴ���ر�ֵJTextField.getText().trim();
			}
		});
		��Ԫ�ʴ���ط�ֵJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonJianBiTxt= ��Ԫ�ʴ���ر�ֵJTextField.getText().trim();
			}
		});
		��Ԫ�ʴ���ر�ֵJTextField.setText("8");
		appInThisClass.fourInitonJianBiTxt= "8";
		this.add(��Ԫ�ʴ���ر�ֵ);
		this.add(��Ԫ�ʴ���ر�ֵJTextField);	
		
		JLabel ��Ԫ�ʴ���ؾ���= new JLabel("��Ԫ�����ؾ���"+ ":");  
		��Ԫ�ʴ���ؾ���.setForeground(Color.white);
		��Ԫ�ʴ���ؾ���.setBounds(10+ 2* 90, 20+ 25* 3, 150, 25);
		JTextField ��Ԫ�ʴ���ؾ���JTextField= new JTextField();
		��Ԫ�ʴ���ؾ���JTextField.setBounds(10+ 2* 90+ 110, 20+ 25* 3, 50, 25);
		��Ԫ�ʴ���ؾ���JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianJingTxt= ��Ԫ�ʴ���ؾ���JTextField.getText().trim();
			}
		});
		��Ԫ�ʴ���ط�ֵJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonJianJingTxt= ��Ԫ�ʴ���ؾ���JTextField.getText().trim();
			}
		});
		��Ԫ�ʴ���ؾ���JTextField.setText("8");
		appInThisClass.fourInitonJianJingTxt= "8";
		this.add(��Ԫ�ʴ���ؾ���);
		this.add(��Ԫ�ʴ���ؾ���JTextField);	
		
		JLabel ��Ԫ�ʴ����PCA= new JLabel("��Ԫ������PCA"+ ":");  
		��Ԫ�ʴ����PCA.setForeground(Color.white);
		��Ԫ�ʴ����PCA.setBounds(10+ 2* 90, 20+ 25* 4, 150, 25);
		JTextField ��Ԫ�ʴ����PCAJTextField= new JTextField();
		��Ԫ�ʴ����PCAJTextField.setBounds(10+ 2* 90+ 110, 20+ 25* 4, 50, 25);
		��Ԫ�ʴ����PCAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianPCATxt= ��Ԫ�ʴ����PCAJTextField.getText().trim();
			}
		});
		��Ԫ�ʴ����PCAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonJianPCATxt= ��Ԫ�ʴ����PCAJTextField.getText().trim();
			}
		});
		��Ԫ�ʴ����PCAJTextField.setText("25");
		appInThisClass.fourInitonJianPCATxt= "25";
		this.add(��Ԫ�ʴ����PCA);
		this.add(��Ԫ�ʴ����PCAJTextField);	
		
		
		JLabel ��Ԫ�ʴ����ICA= new JLabel("��Ԫ������ICA"+ ":");  
		��Ԫ�ʴ����ICA.setForeground(Color.white);
		��Ԫ�ʴ����ICA.setBounds(10+ 2* 90, 20+ 25* 5, 150, 25);
		JTextField ��Ԫ�ʴ����ICAJTextField= new JTextField();
		��Ԫ�ʴ����ICAJTextField.setBounds(10+ 2* 90+ 110, 20+ 25* 5, 50, 25);
		��Ԫ�ʴ����ICAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianICATxt= ��Ԫ�ʴ����ICAJTextField.getText().trim();
			}
		});
		��Ԫ�ʴ����ICAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonJianICATxt= ��Ԫ�ʴ����ICAJTextField.getText().trim();
			}
		});
		��Ԫ�ʴ����ICAJTextField.setText("15");
		appInThisClass.fourInitonJianICATxt= "15";
		this.add(��Ԫ�ʴ����ICA);
		this.add(��Ԫ�ʴ����ICAJTextField);	
		
		JLabel ��Ԫ�ʴ����ECA= new JLabel("��Ԫ������ECA"+ ":");  
		��Ԫ�ʴ����ECA.setForeground(Color.white);
		��Ԫ�ʴ����ECA.setBounds(10+ 2* 90, 20+ 25* 6, 150, 25);
		JTextField ��Ԫ�ʴ����ECAJTextField= new JTextField();
		��Ԫ�ʴ����ECAJTextField.setBounds(10+ 2* 90+ 110, 20+ 25* 6, 50, 25);
		��Ԫ�ʴ����ECAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianECATxt= ��Ԫ�ʴ����ECAJTextField.getText().trim();
			}
		});
		��Ԫ�ʴ����ECAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonJianECATxt= ��Ԫ�ʴ����ECAJTextField.getText().trim();
			}
		});
		��Ԫ�ʴ����ECAJTextField.setText("20");
		appInThisClass.fourInitonJianECATxt= "20";
		this.add(��Ԫ�ʴ����ECA);
		this.add(��Ԫ�ʴ����ECAJTextField);	
		
		JLabel ��Ԫ�ʴ����UPCA= new JLabel("��Ԫ������UPCA"+ ":");  
		��Ԫ�ʴ����UPCA.setForeground(Color.white);
		��Ԫ�ʴ����UPCA.setBounds(10+ 2* 90, 20+ 25* 7, 150, 25);
		JTextField ��Ԫ�ʴ����UPCAJTextField= new JTextField();
		��Ԫ�ʴ����UPCAJTextField.setBounds(10+ 2* 90+ 110, 20+ 25* 7, 50, 25);
		��Ԫ�ʴ����UPCAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianUPCATxt= ��Ԫ�ʴ����UPCAJTextField.getText().trim();
			}
		});
		��Ԫ�ʴ����UPCAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonJianUPCATxt= ��Ԫ�ʴ����UPCAJTextField.getText().trim();
			}
		});
		��Ԫ�ʴ����UPCAJTextField.setText("15");
		appInThisClass.fourInitonJianUPCATxt= "15";
		this.add(��Ԫ�ʴ����UPCA);
		this.add(��Ԫ�ʴ����UPCAJTextField);	
	///////////////////////////////////////////////////////////////////////////////////////////	
		
		//���ط�ֵ
		//���ر�ֵ
		//���ؾ�ֵ
		JLabel ʮ��Ԫ�ʴ���ط�ֵ= new JLabel("ʮ��Ԫ�����ط�ֵ"+ ":");  
		ʮ��Ԫ�ʴ���ط�ֵ.setForeground(Color.white);
		ʮ��Ԫ�ʴ���ط�ֵ.setBounds(10+ 4* 90, 20+ 25* 1, 150, 25);
		JTextField ʮ��Ԫ�ʴ���ط�ֵJTextField= new JTextField();
		ʮ��Ԫ�ʴ���ط�ֵJTextField.setBounds(10+ 4* 90+ 110, 20+ 25* 1, 50, 25);
		ʮ��Ԫ�ʴ���ط�ֵJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianFaTxt= ʮ��Ԫ�ʴ���ط�ֵJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ʴ���ط�ֵJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonJianFaTxt= ʮ��Ԫ�ʴ���ط�ֵJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ʴ���ط�ֵJTextField.setText("10");
		appInThisClass.sixteenInitonJianFaTxt= "10";
		this.add(ʮ��Ԫ�ʴ���ط�ֵ);
		this.add(ʮ��Ԫ�ʴ���ط�ֵJTextField);	

		JLabel ʮ��Ԫ�ʴ���ر�ֵ= new JLabel("ʮ��Ԫ�����ر�ֵ"+ ":");  
		ʮ��Ԫ�ʴ���ر�ֵ.setForeground(Color.white);
		ʮ��Ԫ�ʴ���ر�ֵ.setBounds(10+ 4* 90, 20+ 25* 2, 150, 25);
		JTextField ʮ��Ԫ�ʴ���ر�ֵJTextField= new JTextField();
		ʮ��Ԫ�ʴ���ر�ֵJTextField.setBounds(10+ 4* 90+ 110, 20+ 25* 2, 50, 25);
		ʮ��Ԫ�ʴ���ر�ֵJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianBiTxt= ʮ��Ԫ�ʴ���ر�ֵJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ʴ���ط�ֵJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonJianBiTxt= ʮ��Ԫ�ʴ���ر�ֵJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ʴ���ر�ֵJTextField.setText("2");
		appInThisClass.sixteenInitonJianBiTxt= "2";
		this.add(ʮ��Ԫ�ʴ���ر�ֵ);
		this.add(ʮ��Ԫ�ʴ���ر�ֵJTextField);	
		
		JLabel ʮ��Ԫ�ʴ���ؾ���= new JLabel("ʮ��Ԫ�����ؾ���"+ ":");  
		ʮ��Ԫ�ʴ���ؾ���.setForeground(Color.white);
		ʮ��Ԫ�ʴ���ؾ���.setBounds(10+ 4* 90, 20+ 25* 3, 150, 25);
		JTextField ʮ��Ԫ�ʴ���ؾ���JTextField= new JTextField();
		ʮ��Ԫ�ʴ���ؾ���JTextField.setBounds(10+ 4* 90+ 110, 20+ 25* 3, 50, 25);
		ʮ��Ԫ�ʴ���ؾ���JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianJingTxt= ʮ��Ԫ�ʴ���ؾ���JTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ʴ���ط�ֵJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonJianJingTxt= ʮ��Ԫ�ʴ���ؾ���JTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ʴ���ؾ���JTextField.setText("8");
		appInThisClass.sixteenInitonJianJingTxt= "8";
		this.add(ʮ��Ԫ�ʴ���ؾ���);
		this.add(ʮ��Ԫ�ʴ���ؾ���JTextField);	
		
		JLabel ʮ��Ԫ�ʴ����PCA= new JLabel("ʮ��Ԫ������PCA"+ ":");  
		ʮ��Ԫ�ʴ����PCA.setForeground(Color.white);
		ʮ��Ԫ�ʴ����PCA.setBounds(10+ 4* 90, 20+ 25* 4, 150, 25);
		JTextField ʮ��Ԫ�ʴ����PCAJTextField= new JTextField();
		ʮ��Ԫ�ʴ����PCAJTextField.setBounds(10+ 4* 90+ 110, 20+ 25* 4, 50, 25);
		ʮ��Ԫ�ʴ����PCAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianPCATxt= ʮ��Ԫ�ʴ����PCAJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ʴ����PCAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonJianPCATxt= ʮ��Ԫ�ʴ����PCAJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ʴ����PCAJTextField.setText("1");
		appInThisClass.sixteenInitonJianPCATxt= "1";
		this.add(ʮ��Ԫ�ʴ����PCA);
		this.add(ʮ��Ԫ�ʴ����PCAJTextField);	
		
		
		JLabel ʮ��Ԫ�ʴ����ICA= new JLabel("ʮ��Ԫ������ICA"+ ":");  
		ʮ��Ԫ�ʴ����ICA.setForeground(Color.white);
		ʮ��Ԫ�ʴ����ICA.setBounds(10+ 4* 90, 20+ 25* 5, 150, 25);
		JTextField ʮ��Ԫ�ʴ����ICAJTextField= new JTextField();
		ʮ��Ԫ�ʴ����ICAJTextField.setBounds(10+ 4* 90+ 110, 20+ 25* 5, 50, 25);
		ʮ��Ԫ�ʴ����ICAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianICATxt= ʮ��Ԫ�ʴ����ICAJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ʴ����ICAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonJianICATxt= ʮ��Ԫ�ʴ����ICAJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ʴ����ICAJTextField.setText("1");
		appInThisClass.sixteenInitonJianICATxt= "1";
		this.add(ʮ��Ԫ�ʴ����ICA);
		this.add(ʮ��Ԫ�ʴ����ICAJTextField);	
		
		JLabel ʮ��Ԫ�ʴ����ECA= new JLabel("ʮ��Ԫ������ECA"+ ":");  
		ʮ��Ԫ�ʴ����ECA.setForeground(Color.white);
		ʮ��Ԫ�ʴ����ECA.setBounds(10+ 4* 90, 20+ 25* 6, 150, 25);
		JTextField ʮ��Ԫ�ʴ����ECAJTextField= new JTextField();
		ʮ��Ԫ�ʴ����ECAJTextField.setBounds(10+ 4* 90+ 110, 20+ 25* 6, 50, 25);
		ʮ��Ԫ�ʴ����ECAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianECATxt= ʮ��Ԫ�ʴ����ECAJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ʴ����ECAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonJianECATxt= ʮ��Ԫ�ʴ����ECAJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ʴ����ECAJTextField.setText("1");
		appInThisClass.sixteenInitonJianECATxt= "1";
		this.add(ʮ��Ԫ�ʴ����ECA);
		this.add(ʮ��Ԫ�ʴ����ECAJTextField);	
		
		JLabel ʮ��Ԫ�ʴ����UPCA= new JLabel("ʮ��Ԫ������UPCA"+ ":");  
		ʮ��Ԫ�ʴ����UPCA.setForeground(Color.white);
		ʮ��Ԫ�ʴ����UPCA.setBounds(10+ 4* 90, 20+ 25* 7, 150, 25);
		JTextField ʮ��Ԫ�ʴ����UPCAJTextField= new JTextField();
		ʮ��Ԫ�ʴ����UPCAJTextField.setBounds(10+ 4* 90+ 110, 20+ 25* 7, 50, 25);
		ʮ��Ԫ�ʴ����UPCAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianUPCATxt= ʮ��Ԫ�ʴ����UPCAJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ʴ����UPCAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonJianUPCATxt= ʮ��Ԫ�ʴ����UPCAJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ʴ����UPCAJTextField.setText("45");
		appInThisClass.sixteenInitonJianUPCATxt= "45";
		this.add(ʮ��Ԫ�ʴ����UPCA);
		this.add(ʮ��Ԫ�ʴ����UPCAJTextField);	
	///////////////////////////////////////////////////////////////////////////////////////////			
		


		//���ط�ֵ
		//���ر�ֵ
		//���ؾ�ֵ
		JLabel ʮ��Ԫ�ḯʴ���ط�ֵ= new JLabel("ʮ��Ԫ�����ط�ֵ"+ ":");  
		ʮ��Ԫ�ḯʴ���ط�ֵ.setForeground(Color.white);
		ʮ��Ԫ�ḯʴ���ط�ֵ.setBounds(10+ 6* 90, 20+ 25* 1, 150, 25);
		JTextField ʮ��Ԫ�ḯʴ���ط�ֵJTextField= new JTextField();
		ʮ��Ԫ�ḯʴ���ط�ֵJTextField.setBounds(10+ 6* 90+ 110, 20+ 25* 1, 50, 25);
		ʮ��Ԫ�ḯʴ���ط�ֵJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanFaTxt= ʮ��Ԫ�ḯʴ���ط�ֵJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ḯʴ���ط�ֵJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonSuanFaTxt= ʮ��Ԫ�ḯʴ���ط�ֵJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ḯʴ���ط�ֵJTextField.setText("10");
		appInThisClass.sixteenInitonSuanFaTxt= "10";
		this.add(ʮ��Ԫ�ḯʴ���ط�ֵ);
		this.add(ʮ��Ԫ�ḯʴ���ط�ֵJTextField);	

		JLabel ʮ��Ԫ�ḯʴ���ر�ֵ= new JLabel("ʮ��Ԫ�����ر�ֵ"+ ":");  
		ʮ��Ԫ�ḯʴ���ر�ֵ.setForeground(Color.white);
		ʮ��Ԫ�ḯʴ���ر�ֵ.setBounds(10+ 6* 90, 20+ 25* 2, 150, 25);
		JTextField ʮ��Ԫ�ḯʴ���ر�ֵJTextField= new JTextField();
		ʮ��Ԫ�ḯʴ���ر�ֵJTextField.setBounds(10+ 6* 90+ 110, 20+ 25* 2, 50, 25);
		ʮ��Ԫ�ḯʴ���ر�ֵJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanBiTxt= ʮ��Ԫ�ḯʴ���ر�ֵJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ḯʴ���ط�ֵJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonSuanBiTxt= ʮ��Ԫ�ḯʴ���ر�ֵJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ḯʴ���ر�ֵJTextField.setText("2");
		appInThisClass.sixteenInitonSuanBiTxt= "2";
		this.add(ʮ��Ԫ�ḯʴ���ر�ֵ);
		this.add(ʮ��Ԫ�ḯʴ���ر�ֵJTextField);	

		JLabel ʮ��Ԫ�ḯʴ���ؾ���= new JLabel("ʮ��Ԫ�����ؾ���"+ ":");  
		ʮ��Ԫ�ḯʴ���ؾ���.setForeground(Color.white);
		ʮ��Ԫ�ḯʴ���ؾ���.setBounds(10+ 6* 90, 20+ 25* 3, 150, 25);
		JTextField ʮ��Ԫ�ḯʴ���ؾ���JTextField= new JTextField();
		ʮ��Ԫ�ḯʴ���ؾ���JTextField.setBounds(10+ 6* 90+ 110, 20+ 25* 3, 50, 25);
		ʮ��Ԫ�ḯʴ���ؾ���JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanJingTxt= ʮ��Ԫ�ḯʴ���ؾ���JTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ḯʴ���ط�ֵJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonSuanJingTxt= ʮ��Ԫ�ḯʴ���ؾ���JTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ḯʴ���ؾ���JTextField.setText("8");
		appInThisClass.sixteenInitonSuanJingTxt= "8";
		this.add(ʮ��Ԫ�ḯʴ���ؾ���);
		this.add(ʮ��Ԫ�ḯʴ���ؾ���JTextField);	

		JLabel ʮ��Ԫ�ḯʴ����PCA= new JLabel("ʮ��Ԫ������PCA"+ ":");  
		ʮ��Ԫ�ḯʴ����PCA.setForeground(Color.white);
		ʮ��Ԫ�ḯʴ����PCA.setBounds(10+ 6* 90, 20+ 25* 4, 150, 25);
		JTextField ʮ��Ԫ�ḯʴ����PCAJTextField= new JTextField();
		ʮ��Ԫ�ḯʴ����PCAJTextField.setBounds(10+ 6* 90+ 110, 20+ 25* 4, 50, 25);
		ʮ��Ԫ�ḯʴ����PCAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanPCATxt= ʮ��Ԫ�ḯʴ����PCAJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ḯʴ����PCAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonSuanPCATxt= ʮ��Ԫ�ḯʴ����PCAJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ḯʴ����PCAJTextField.setText("1");
		appInThisClass.sixteenInitonSuanPCATxt= "1";
		this.add(ʮ��Ԫ�ḯʴ����PCA);
		this.add(ʮ��Ԫ�ḯʴ����PCAJTextField);	


		JLabel ʮ��Ԫ�ḯʴ����ICA= new JLabel("ʮ��Ԫ������ICA"+ ":");  
		ʮ��Ԫ�ḯʴ����ICA.setForeground(Color.white);
		ʮ��Ԫ�ḯʴ����ICA.setBounds(10+ 6* 90, 20+ 25* 5, 150, 25);
		JTextField ʮ��Ԫ�ḯʴ����ICAJTextField= new JTextField();
		ʮ��Ԫ�ḯʴ����ICAJTextField.setBounds(10+ 6* 90+ 110, 20+ 25* 5, 50, 25);
		ʮ��Ԫ�ḯʴ����ICAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanICATxt= ʮ��Ԫ�ḯʴ����ICAJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ḯʴ����ICAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonSuanICATxt= ʮ��Ԫ�ḯʴ����ICAJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ḯʴ����ICAJTextField.setText("1");
		appInThisClass.sixteenInitonSuanICATxt= "1";
		this.add(ʮ��Ԫ�ḯʴ����ICA);
		this.add(ʮ��Ԫ�ḯʴ����ICAJTextField);	

		JLabel ʮ��Ԫ�ḯʴ����ECA= new JLabel("ʮ��Ԫ������ECA"+ ":");  
		ʮ��Ԫ�ḯʴ����ECA.setForeground(Color.white);
		ʮ��Ԫ�ḯʴ����ECA.setBounds(10+ 6* 90, 20+ 25* 6, 150, 25);
		JTextField ʮ��Ԫ�ḯʴ����ECAJTextField= new JTextField();
		ʮ��Ԫ�ḯʴ����ECAJTextField.setBounds(10+ 6* 90+ 110, 20+ 25* 6, 50, 25);
		ʮ��Ԫ�ḯʴ����ECAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanECATxt= ʮ��Ԫ�ḯʴ����ECAJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ḯʴ����ECAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonSuanECATxt= ʮ��Ԫ�ḯʴ����ECAJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ḯʴ����ECAJTextField.setText("1");
		appInThisClass.sixteenInitonSuanECATxt= "1";
		this.add(ʮ��Ԫ�ḯʴ����ECA);
		this.add(ʮ��Ԫ�ḯʴ����ECAJTextField);	

		JLabel ʮ��Ԫ�ḯʴ����UPCA= new JLabel("ʮ��Ԫ������UPCA"+ ":");  
		ʮ��Ԫ�ḯʴ����UPCA.setForeground(Color.white);
		ʮ��Ԫ�ḯʴ����UPCA.setBounds(10+ 6* 90, 20+ 25* 7, 150, 25);
		JTextField ʮ��Ԫ�ḯʴ����UPCAJTextField= new JTextField();
		ʮ��Ԫ�ḯʴ����UPCAJTextField.setBounds(10+ 6* 90+ 110, 20+ 25* 7, 50, 25);
		ʮ��Ԫ�ḯʴ����UPCAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanUPCATxt= ʮ��Ԫ�ḯʴ����UPCAJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ḯʴ����UPCAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonSuanUPCATxt= ʮ��Ԫ�ḯʴ����UPCAJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ḯʴ����UPCAJTextField.setText("45");
		appInThisClass.sixteenInitonSuanUPCATxt= "45";
		this.add(ʮ��Ԫ�ḯʴ����UPCA);
		this.add(ʮ��Ԫ�ḯʴ����UPCAJTextField);		


		/////////////////////////Ȩ��

		
		JLabel ʮ��Ԫ�ḯʴȨ��scale= new JLabel("ʮ��Ԫ��Ȩ��scale"+ ":");  
		ʮ��Ԫ�ḯʴȨ��scale.setForeground(Color.white);
		ʮ��Ԫ�ḯʴȨ��scale.setBounds(10+ 6* 90, 20+ 25* 9, 150, 25);
		JTextField ʮ��Ԫ�ḯʴȨ��scaleJTextField= new JTextField();
		ʮ��Ԫ�ḯʴȨ��scaleJTextField.setBounds(10+ 6* 90+ 110, 20+ 25* 9, 50, 25);
		ʮ��Ԫ�ḯʴȨ��scaleJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanScaleTxt= ʮ��Ԫ�ḯʴȨ��scaleJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ḯʴȨ��scaleJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonSuanScaleTxt= ʮ��Ԫ�ḯʴȨ��scaleJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ḯʴȨ��scaleJTextField.setText("1");
		appInThisClass.sixteenInitonSuanScaleTxt= "1";
		this.add(ʮ��Ԫ�ḯʴȨ��scale);
		this.add(ʮ��Ԫ�ḯʴȨ��scaleJTextField);		
	/////
		JLabel ʮ��Ԫ�ʴȨ��scale= new JLabel("ʮ��Ԫ��Ȩ��scale"+ ":");  
		ʮ��Ԫ�ʴȨ��scale.setForeground(Color.white);
		ʮ��Ԫ�ʴȨ��scale.setBounds(10+ 4* 90, 20+ 25* 9, 150, 25);
		JTextField ʮ��Ԫ�ʴȨ��scaleJTextField= new JTextField();
		ʮ��Ԫ�ʴȨ��scaleJTextField.setBounds(10+ 4* 90+ 110, 20+ 25* 9, 50, 25);
		ʮ��Ԫ�ʴȨ��scaleJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianScaleTxt= ʮ��Ԫ�ʴȨ��scaleJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ʴȨ��scaleJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonJianScaleTxt= ʮ��Ԫ�ʴȨ��scaleJTextField.getText().trim();
			}
		});
		ʮ��Ԫ�ʴȨ��scaleJTextField.setText("1");
		appInThisClass.sixteenInitonJianScaleTxt= "1";
		this.add(ʮ��Ԫ�ʴȨ��scale);
		this.add(ʮ��Ԫ�ʴȨ��scaleJTextField);		
		//////
		JLabel ��Ԫ�ḯʴȨ��scale= new JLabel("��Ԫ��ʴȨ��scale"+ ":");  
		��Ԫ�ḯʴȨ��scale.setForeground(Color.white);
		��Ԫ�ḯʴȨ��scale.setBounds(10+ 2* 90, 20+ 25* 9, 150, 25);
		JTextField ��Ԫ�ḯʴȨ��scaleJTextField= new JTextField();
		��Ԫ�ḯʴȨ��scaleJTextField.setBounds(10+ 2* 90+ 110, 20+ 25* 9, 50, 25);
		��Ԫ�ḯʴȨ��scaleJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanScaleTxt= ��Ԫ�ḯʴȨ��scaleJTextField.getText().trim();
			}
		});
		��Ԫ�ḯʴȨ��scaleJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonSuanScaleTxt= ��Ԫ�ḯʴȨ��scaleJTextField.getText().trim();
			}
		});
		��Ԫ�ḯʴȨ��scaleJTextField.setText("0.001");
		appInThisClass.fourInitonSuanScaleTxt= "0.001";
		this.add(��Ԫ�ḯʴȨ��scale);
		this.add(��Ԫ�ḯʴȨ��scaleJTextField);		
		
		
		JLabel ��Ԫ�ʴȨ��scale= new JLabel("��Ԫ��ʴȨ��scale"+ ":");  
		��Ԫ�ʴȨ��scale.setForeground(Color.white);
		��Ԫ�ʴȨ��scale.setBounds(10+ 0* 90, 20+ 25* 9, 150, 25);
		JTextField ��Ԫ�ʴȨ��scaleJTextField= new JTextField();
		��Ԫ�ʴȨ��scaleJTextField.setBounds(10+ 0* 90+ 110, 20+ 25* 9, 50, 25);
		��Ԫ�ʴȨ��scaleJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianScaleTxt= ��Ԫ�ʴȨ��scaleJTextField.getText().trim();
			}
		});
		��Ԫ�ʴȨ��scaleJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonJianScaleTxt= ��Ԫ�ʴȨ��scaleJTextField.getText().trim();
			}
		});
		��Ԫ�ʴȨ��scaleJTextField.setText("1");
		appInThisClass.fourInitonJianScaleTxt= "1";
		this.add(��Ԫ�ʴȨ��scale);
		this.add(��Ԫ�ʴȨ��scaleJTextField);		
		
		
		
		
		
		
		
		
		
	//file	
		
		
		
		JLabel ��Ԫ�ḯʴѵ���ļ���ַ= new JLabel("��Ԫ�ḯʴѵ���ļ���ַ"+ ":");  
		��Ԫ�ḯʴѵ���ļ���ַ.setForeground(Color.white);
		��Ԫ�ḯʴѵ���ļ���ַ.setBounds(10+ 0* 150, 20+ 25* 13, 150, 50);
		
		JTextField ��Ԫ�ḯʴѵ���ļ���ַJTextField= new JTextField();
		��Ԫ�ḯʴѵ���ļ���ַJTextField.setBounds(10+ 0* 150+ 160, 20+ 25* 13, 550, 50);
		��Ԫ�ḯʴѵ���ļ���ַJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanTxt= ��Ԫ�ḯʴѵ���ļ���ַJTextField.getText().trim();
			}
		});
		��Ԫ�ḯʴѵ���ļ���ַJTextField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				appInThisClass.fourInitonSuanTxt= ��Ԫ�ḯʴѵ���ļ���ַJTextField.getText().trim();
			}
			
		});
		��Ԫ�ḯʴѵ���ļ���ַJTextField.setText("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt");
		appInThisClass.fourInitonSuanTxt= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt";
		this.add(��Ԫ�ḯʴѵ���ļ���ַ);
		this.add(��Ԫ�ḯʴѵ���ļ���ַJTextField);	
		
		//
		JLabel ��Ԫ���Ը�ʴѵ���ļ���ַ= new JLabel("��Ԫ�ʴѵ���ļ���ַ"+ ":");  
		��Ԫ���Ը�ʴѵ���ļ���ַ.setForeground(Color.white);
		��Ԫ���Ը�ʴѵ���ļ���ַ.setBounds(10+ 0* 150, 20+ 25* 16, 150, 50);
		
		JTextField ��Ԫ���Ը�ʴѵ���ļ���ַJTextField= new JTextField();
		��Ԫ���Ը�ʴѵ���ļ���ַJTextField.setBounds(10+ 0* 150+ 160, 20+ 25* 16, 550, 50);
		��Ԫ���Ը�ʴѵ���ļ���ַJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianTxt= ��Ԫ���Ը�ʴѵ���ļ���ַJTextField.getText().trim();
			}
		});
		��Ԫ���Ը�ʴѵ���ļ���ַJTextField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				appInThisClass.fourInitonJianTxt= ��Ԫ���Ը�ʴѵ���ļ���ַJTextField.getText().trim();
			}
			
		});
		��Ԫ���Ը�ʴѵ���ļ���ַJTextField.setText("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB5.txt");
		appInThisClass.fourInitonJianTxt= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB5.txt";
		this.add(��Ԫ���Ը�ʴѵ���ļ���ַ);
		this.add(��Ԫ���Ը�ʴѵ���ļ���ַJTextField);	
		
		//
		//ʮ��Ԫ�ḯʴ��ַ
		JLabel ʮ��Ԫ���Ը�ʴѵ���ļ���ַ= new JLabel("ʮ��Ԫ�ḯʴѵ���ļ���ַ"+ ":");  
		ʮ��Ԫ���Ը�ʴѵ���ļ���ַ.setForeground(Color.white);
		ʮ��Ԫ���Ը�ʴѵ���ļ���ַ.setBounds(10+ 0* 150, 20+ 25* 19, 150, 50);
		
		JTextField ʮ��Ԫ���Ը�ʴѵ���ļ���ַJTextField= new JTextField();
		ʮ��Ԫ���Ը�ʴѵ���ļ���ַJTextField.setBounds(10+ 0* 150+ 160, 20+ 25* 19, 550, 50);
		ʮ��Ԫ���Ը�ʴѵ���ļ���ַJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanTxt= ʮ��Ԫ���Ը�ʴѵ���ļ���ַJTextField.getText().trim();
			}
		});
		ʮ��Ԫ���Ը�ʴѵ���ļ���ַJTextField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				appInThisClass.sixteenInitonSuanTxt= ʮ��Ԫ���Ը�ʴѵ���ļ���ַJTextField.getText().trim();
			}
			
		});
		ʮ��Ԫ���Ը�ʴѵ���ļ���ַJTextField.setText("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_suan_17.txt");
		appInThisClass.sixteenInitonSuanTxt= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_suan_17.txt";
		this.add(ʮ��Ԫ���Ը�ʴѵ���ļ���ַ);
		this.add(ʮ��Ԫ���Ը�ʴѵ���ļ���ַJTextField);	
		
		
		
		//ʮ��Ԫ�ʴ��ַ
		JLabel ʮ��Ԫ���Ը�ʴѵ���ļ���ַ= new JLabel("ʮ��Ԫ�ʴѵ���ļ���ַ"+ ":");  
		ʮ��Ԫ���Ը�ʴѵ���ļ���ַ.setForeground(Color.white);
		ʮ��Ԫ���Ը�ʴѵ���ļ���ַ.setBounds(10+ 0* 150, 20+ 25* 22, 150, 50);
		
		JTextField ʮ��Ԫ���Ը�ʴѵ���ļ���ַJTextField= new JTextField();
		ʮ��Ԫ���Ը�ʴѵ���ļ���ַJTextField.setBounds(10+ 0* 150+ 160, 20+ 25* 22, 550, 50);
		ʮ��Ԫ���Ը�ʴѵ���ļ���ַJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianTxt= ʮ��Ԫ���Ը�ʴѵ���ļ���ַJTextField.getText().trim();
			}
		});
		ʮ��Ԫ���Ը�ʴѵ���ļ���ַJTextField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				appInThisClass.sixteenInitonJianTxt= ʮ��Ԫ���Ը�ʴѵ���ļ���ַJTextField.getText().trim();
			}
			
		});
		ʮ��Ԫ���Ը�ʴѵ���ļ���ַJTextField.setText("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_jian_17.txt");
		appInThisClass.sixteenInitonJianTxt= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_jian_17.txt";
		this.add(ʮ��Ԫ���Ը�ʴѵ���ļ���ַ);
		this.add(ʮ��Ԫ���Ը�ʴѵ���ļ���ַJTextField);	
		
		
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