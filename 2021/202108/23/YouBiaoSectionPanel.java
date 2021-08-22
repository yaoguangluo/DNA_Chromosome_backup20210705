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
	 * 罗瑶光
	 */
	private static final long serialVersionUID= 1L;
	public String[] tabNames= {"中药本草", "数据分析", "智能相诊", "智能声诊",
			"奇门遁甲", "西医内科", "中医方剂诊治", "中医诊断",
			"古籍经典", "中医生殖", "西医妇幼", "西医急诊",
			"大外科", "中医外伤", "西药处方", "编辑页",
			"哈里森大内科","五官科","男科","老年科","传染科","新生儿科",
			"麻醉科","精神科","脑外科","现代护理","核医学","肿瘤科","西医骨伤","遗传学"};
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
		
		JLabel 四元酸腐蚀浓度= new JLabel("四元酸浓度"+ ":");  
		四元酸腐蚀浓度.setForeground(Color.white);
		四元酸腐蚀浓度.setBounds(10+ 0* 130, 20+ 25* 0, 150, 25);
		JTextField 四元酸腐蚀浓度JTextField= new JTextField();
		四元酸腐蚀浓度JTextField.setBounds(10+ 0* 130+ 110, 20+ 25* 0, 50, 25);
		四元酸腐蚀浓度JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanFuTxt= 四元酸腐蚀浓度JTextField.getText().trim();
			}
		});
		四元酸腐蚀浓度JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonSuanFuTxt= 四元酸腐蚀浓度JTextField.getText().trim();
			}
		});
		四元酸腐蚀浓度JTextField.setText("5");
		appInThisClass.fourInitonSuanFuTxt= "5";
		this.add(四元酸腐蚀浓度);
		this.add(四元酸腐蚀浓度JTextField);	
		
		JLabel 四元碱腐蚀浓度= new JLabel("四元碱浓度"+ ":");  
		四元碱腐蚀浓度.setForeground(Color.white);
		四元碱腐蚀浓度.setBounds(10+ 2* 90, 20+ 25* 0, 150, 25);
		JTextField 四元碱腐蚀浓度JTextField= new JTextField();
		四元碱腐蚀浓度JTextField.setBounds(10+ 2* 90+ 110, 20+ 25* 0, 50, 25);
		四元碱腐蚀浓度JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianFuTxt= 四元碱腐蚀浓度JTextField.getText().trim();
			}
		});
		四元碱腐蚀浓度JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonJianFuTxt= 四元碱腐蚀浓度JTextField.getText().trim();
			}
		});
		四元碱腐蚀浓度JTextField.setText("95");
		appInThisClass.fourInitonJianFuTxt= "95";
		this.add(四元碱腐蚀浓度);
		this.add(四元碱腐蚀浓度JTextField);	
		
		JLabel 十六元碱腐蚀浓度= new JLabel("十六元碱浓度"+ ":");  
		十六元碱腐蚀浓度.setForeground(Color.white);
		十六元碱腐蚀浓度.setBounds(10+ 4* 90, 20+ 25* 0, 150, 25);
		JTextField 十六元碱腐蚀浓度JTextField= new JTextField();
		十六元碱腐蚀浓度JTextField.setBounds(10+ 4* 90+ 110, 20+ 25* 0, 50, 25);
		十六元碱腐蚀浓度JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianFuTxt= 十六元碱腐蚀浓度JTextField.getText().trim();
			}
		});
		十六元碱腐蚀浓度JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonJianFuTxt= 十六元碱腐蚀浓度JTextField.getText().trim();
			}
		});
		十六元碱腐蚀浓度JTextField.setText("5");
		appInThisClass.sixteenInitonJianFuTxt= "5";
		this.add(十六元碱腐蚀浓度);
		this.add(十六元碱腐蚀浓度JTextField);	
		
		
		JLabel 十六元酸腐蚀浓度= new JLabel("十六元酸浓度"+ ":");  
		十六元酸腐蚀浓度.setForeground(Color.white);
		十六元酸腐蚀浓度.setBounds(10+ 6* 90, 20+ 25* 0, 150, 25);
		JTextField 十六元酸腐蚀浓度JTextField= new JTextField();
		十六元酸腐蚀浓度JTextField.setBounds(10+ 6* 90+ 110, 20+ 25* 0, 50, 25);
		十六元酸腐蚀浓度JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanFuTxt= 十六元酸腐蚀浓度JTextField.getText().trim();
			}
		});
		十六元酸腐蚀浓度JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonSuanFuTxt= 十六元酸腐蚀浓度JTextField.getText().trim();
			}
		});
		十六元酸腐蚀浓度JTextField.setText("95");
		appInThisClass.sixteenInitonSuanFuTxt= "95";
		this.add(十六元酸腐蚀浓度);
		this.add(十六元酸腐蚀浓度JTextField);	
		
		//像素阀值
		//像素比值
		//像素精值
		
		JLabel 四元酸腐蚀像素阀值= new JLabel("四元酸像素阀值"+ ":");  
		四元酸腐蚀像素阀值.setForeground(Color.white);
		四元酸腐蚀像素阀值.setBounds(10+ 0* 150, 20+ 25* 1, 150, 25);
		JTextField 四元酸腐蚀像素阀值JTextField= new JTextField();
		四元酸腐蚀像素阀值JTextField.setBounds(10+ 0* 150+ 110, 20+ 25* 1, 50, 25);
		四元酸腐蚀像素阀值JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanFaTxt= 四元酸腐蚀像素阀值JTextField.getText().trim();
			}
		});
		四元酸腐蚀像素阀值JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonSuanFaTxt= 四元酸腐蚀像素阀值JTextField.getText().trim();
			}
		});
		四元酸腐蚀像素阀值JTextField.setText("10");
		appInThisClass.fourInitonSuanFaTxt= "10";
		this.add(四元酸腐蚀像素阀值);
		this.add(四元酸腐蚀像素阀值JTextField);	

		JLabel 四元酸腐蚀像素比值= new JLabel("四元酸像素比值"+ ":");  
		四元酸腐蚀像素比值.setForeground(Color.white);
		四元酸腐蚀像素比值.setBounds(10+ 0* 150, 20+ 25* 2, 150, 25);
		JTextField 四元酸腐蚀像素比值JTextField= new JTextField();
		四元酸腐蚀像素比值JTextField.setBounds(10+ 0* 150+ 110, 20+ 25* 2, 50, 25);
		四元酸腐蚀像素比值JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanBiTxt= 四元酸腐蚀像素比值JTextField.getText().trim();
			}
		});
		四元酸腐蚀像素阀值JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonSuanBiTxt= 四元酸腐蚀像素比值JTextField.getText().trim();
			}
		});
		四元酸腐蚀像素比值JTextField.setText("5");
		appInThisClass.fourInitonSuanBiTxt= "5";
		this.add(四元酸腐蚀像素比值);
		this.add(四元酸腐蚀像素比值JTextField);	
		
		JLabel 四元酸腐蚀像素精度= new JLabel("四元酸像素精度"+ ":");  
		四元酸腐蚀像素精度.setForeground(Color.white);
		四元酸腐蚀像素精度.setBounds(10+ 0* 150, 20+ 25* 3, 150, 25);
		JTextField 四元酸腐蚀像素精度JTextField= new JTextField();
		四元酸腐蚀像素精度JTextField.setBounds(10+ 0* 150+ 110, 20+ 25* 3, 50, 25);
		四元酸腐蚀像素精度JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanJingTxt= 四元酸腐蚀像素精度JTextField.getText().trim();
			}
		});
		四元酸腐蚀像素阀值JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonSuanJingTxt= 四元酸腐蚀像素精度JTextField.getText().trim();
			}
		});
		四元酸腐蚀像素精度JTextField.setText("8");
		appInThisClass.fourInitonSuanJingTxt= "8";
		this.add(四元酸腐蚀像素精度);
		this.add(四元酸腐蚀像素精度JTextField);	
		
		JLabel 四元酸腐蚀像素PCA= new JLabel("四元酸像素PCA"+ ":");  
		四元酸腐蚀像素PCA.setForeground(Color.white);
		四元酸腐蚀像素PCA.setBounds(10+ 0* 150, 20+ 25* 4, 150, 25);
		JTextField 四元酸腐蚀像素PCAJTextField= new JTextField();
		四元酸腐蚀像素PCAJTextField.setBounds(10+ 0* 150+ 110, 20+ 25* 4, 50, 25);
		四元酸腐蚀像素PCAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanPCATxt= 四元酸腐蚀像素PCAJTextField.getText().trim();
			}
		});
		四元酸腐蚀像素PCAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonSuanPCATxt= 四元酸腐蚀像素PCAJTextField.getText().trim();
			}
		});
		四元酸腐蚀像素PCAJTextField.setText("25");
		appInThisClass.fourInitonSuanPCATxt= "25";
		this.add(四元酸腐蚀像素PCA);
		this.add(四元酸腐蚀像素PCAJTextField);	
		
		
		JLabel 四元酸腐蚀像素ICA= new JLabel("四元酸像素ICA"+ ":");  
		四元酸腐蚀像素ICA.setForeground(Color.white);
		四元酸腐蚀像素ICA.setBounds(10+ 0* 150, 20+ 25* 5, 150, 25);
		JTextField 四元酸腐蚀像素ICAJTextField= new JTextField();
		四元酸腐蚀像素ICAJTextField.setBounds(10+ 0* 150+ 110, 20+ 25* 5, 50, 25);
		四元酸腐蚀像素ICAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanICATxt= 四元酸腐蚀像素ICAJTextField.getText().trim();
			}
		});
		四元酸腐蚀像素ICAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonSuanICATxt= 四元酸腐蚀像素ICAJTextField.getText().trim();
			}
		});
		四元酸腐蚀像素ICAJTextField.setText("15");
		appInThisClass.fourInitonSuanICATxt= "15";
		this.add(四元酸腐蚀像素ICA);
		this.add(四元酸腐蚀像素ICAJTextField);	
		
		JLabel 四元酸腐蚀像素ECA= new JLabel("四元酸像素ECA"+ ":");  
		四元酸腐蚀像素ECA.setForeground(Color.white);
		四元酸腐蚀像素ECA.setBounds(10+ 0* 150, 20+ 25* 6, 150, 25);
		JTextField 四元酸腐蚀像素ECAJTextField= new JTextField();
		四元酸腐蚀像素ECAJTextField.setBounds(10+ 0* 150+ 110, 20+ 25* 6, 50, 25);
		四元酸腐蚀像素ECAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanECATxt= 四元酸腐蚀像素ECAJTextField.getText().trim();
			}
		});
		四元酸腐蚀像素ECAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonSuanECATxt= 四元酸腐蚀像素ECAJTextField.getText().trim();
			}
		});
		四元酸腐蚀像素ECAJTextField.setText("20");
		appInThisClass.fourInitonSuanECATxt= "20";
		this.add(四元酸腐蚀像素ECA);
		this.add(四元酸腐蚀像素ECAJTextField);	
		
		JLabel 四元酸腐蚀像素UPCA= new JLabel("四元酸像素UPCA"+ ":");  
		四元酸腐蚀像素UPCA.setForeground(Color.white);
		四元酸腐蚀像素UPCA.setBounds(10+ 0* 150, 20+ 25* 7, 150, 25);
		JTextField 四元酸腐蚀像素UPCAJTextField= new JTextField();
		四元酸腐蚀像素UPCAJTextField.setBounds(10+ 0* 150+ 110, 20+ 25* 7, 50, 25);
		四元酸腐蚀像素UPCAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanUPCATxt= 四元酸腐蚀像素UPCAJTextField.getText().trim();
			}
		});
		四元酸腐蚀像素UPCAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonSuanUPCATxt= 四元酸腐蚀像素UPCAJTextField.getText().trim();
			}
		});
		四元酸腐蚀像素UPCAJTextField.setText("15");
		appInThisClass.fourInitonSuanUPCATxt= "15";
		this.add(四元酸腐蚀像素UPCA);
		this.add(四元酸腐蚀像素UPCAJTextField);	
	///////////////////////////////////////////////////////////////////////////////////////////	
		
		//像素阀值
		//像素比值
		//像素精值
		JLabel 四元碱腐蚀像素阀值= new JLabel("四元碱像素阀值"+ ":");  
		四元碱腐蚀像素阀值.setForeground(Color.white);
		四元碱腐蚀像素阀值.setBounds(10+ 2* 90, 20+ 25* 1, 150, 25);
		JTextField 四元碱腐蚀像素阀值JTextField= new JTextField();
		四元碱腐蚀像素阀值JTextField.setBounds(10+ 2* 90+ 110, 20+ 25* 1, 50, 25);
		四元碱腐蚀像素阀值JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianFaTxt= 四元碱腐蚀像素阀值JTextField.getText().trim();
			}
		});
		四元碱腐蚀像素阀值JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonJianFaTxt= 四元碱腐蚀像素阀值JTextField.getText().trim();
			}
		});
		四元碱腐蚀像素阀值JTextField.setText("10");
		appInThisClass.fourInitonJianFaTxt= "10";
		this.add(四元碱腐蚀像素阀值);
		this.add(四元碱腐蚀像素阀值JTextField);	

		JLabel 四元碱腐蚀像素比值= new JLabel("四元碱像素比值"+ ":");  
		四元碱腐蚀像素比值.setForeground(Color.white);
		四元碱腐蚀像素比值.setBounds(10+ 2* 90, 20+ 25* 2, 150, 25);
		JTextField 四元碱腐蚀像素比值JTextField= new JTextField();
		四元碱腐蚀像素比值JTextField.setBounds(10+ 2* 90+ 110, 20+ 25* 2, 50, 25);
		四元碱腐蚀像素比值JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianBiTxt= 四元碱腐蚀像素比值JTextField.getText().trim();
			}
		});
		四元碱腐蚀像素阀值JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonJianBiTxt= 四元碱腐蚀像素比值JTextField.getText().trim();
			}
		});
		四元碱腐蚀像素比值JTextField.setText("8");
		appInThisClass.fourInitonJianBiTxt= "8";
		this.add(四元碱腐蚀像素比值);
		this.add(四元碱腐蚀像素比值JTextField);	
		
		JLabel 四元碱腐蚀像素精度= new JLabel("四元碱像素精度"+ ":");  
		四元碱腐蚀像素精度.setForeground(Color.white);
		四元碱腐蚀像素精度.setBounds(10+ 2* 90, 20+ 25* 3, 150, 25);
		JTextField 四元碱腐蚀像素精度JTextField= new JTextField();
		四元碱腐蚀像素精度JTextField.setBounds(10+ 2* 90+ 110, 20+ 25* 3, 50, 25);
		四元碱腐蚀像素精度JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianJingTxt= 四元碱腐蚀像素精度JTextField.getText().trim();
			}
		});
		四元碱腐蚀像素阀值JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonJianJingTxt= 四元碱腐蚀像素精度JTextField.getText().trim();
			}
		});
		四元碱腐蚀像素精度JTextField.setText("8");
		appInThisClass.fourInitonJianJingTxt= "8";
		this.add(四元碱腐蚀像素精度);
		this.add(四元碱腐蚀像素精度JTextField);	
		
		JLabel 四元碱腐蚀像素PCA= new JLabel("四元碱像素PCA"+ ":");  
		四元碱腐蚀像素PCA.setForeground(Color.white);
		四元碱腐蚀像素PCA.setBounds(10+ 2* 90, 20+ 25* 4, 150, 25);
		JTextField 四元碱腐蚀像素PCAJTextField= new JTextField();
		四元碱腐蚀像素PCAJTextField.setBounds(10+ 2* 90+ 110, 20+ 25* 4, 50, 25);
		四元碱腐蚀像素PCAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianPCATxt= 四元碱腐蚀像素PCAJTextField.getText().trim();
			}
		});
		四元碱腐蚀像素PCAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonJianPCATxt= 四元碱腐蚀像素PCAJTextField.getText().trim();
			}
		});
		四元碱腐蚀像素PCAJTextField.setText("25");
		appInThisClass.fourInitonJianPCATxt= "25";
		this.add(四元碱腐蚀像素PCA);
		this.add(四元碱腐蚀像素PCAJTextField);	
		
		
		JLabel 四元碱腐蚀像素ICA= new JLabel("四元碱像素ICA"+ ":");  
		四元碱腐蚀像素ICA.setForeground(Color.white);
		四元碱腐蚀像素ICA.setBounds(10+ 2* 90, 20+ 25* 5, 150, 25);
		JTextField 四元碱腐蚀像素ICAJTextField= new JTextField();
		四元碱腐蚀像素ICAJTextField.setBounds(10+ 2* 90+ 110, 20+ 25* 5, 50, 25);
		四元碱腐蚀像素ICAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianICATxt= 四元碱腐蚀像素ICAJTextField.getText().trim();
			}
		});
		四元碱腐蚀像素ICAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonJianICATxt= 四元碱腐蚀像素ICAJTextField.getText().trim();
			}
		});
		四元碱腐蚀像素ICAJTextField.setText("15");
		appInThisClass.fourInitonJianICATxt= "15";
		this.add(四元碱腐蚀像素ICA);
		this.add(四元碱腐蚀像素ICAJTextField);	
		
		JLabel 四元碱腐蚀像素ECA= new JLabel("四元碱像素ECA"+ ":");  
		四元碱腐蚀像素ECA.setForeground(Color.white);
		四元碱腐蚀像素ECA.setBounds(10+ 2* 90, 20+ 25* 6, 150, 25);
		JTextField 四元碱腐蚀像素ECAJTextField= new JTextField();
		四元碱腐蚀像素ECAJTextField.setBounds(10+ 2* 90+ 110, 20+ 25* 6, 50, 25);
		四元碱腐蚀像素ECAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianECATxt= 四元碱腐蚀像素ECAJTextField.getText().trim();
			}
		});
		四元碱腐蚀像素ECAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonJianECATxt= 四元碱腐蚀像素ECAJTextField.getText().trim();
			}
		});
		四元碱腐蚀像素ECAJTextField.setText("20");
		appInThisClass.fourInitonJianECATxt= "20";
		this.add(四元碱腐蚀像素ECA);
		this.add(四元碱腐蚀像素ECAJTextField);	
		
		JLabel 四元碱腐蚀像素UPCA= new JLabel("四元碱像素UPCA"+ ":");  
		四元碱腐蚀像素UPCA.setForeground(Color.white);
		四元碱腐蚀像素UPCA.setBounds(10+ 2* 90, 20+ 25* 7, 150, 25);
		JTextField 四元碱腐蚀像素UPCAJTextField= new JTextField();
		四元碱腐蚀像素UPCAJTextField.setBounds(10+ 2* 90+ 110, 20+ 25* 7, 50, 25);
		四元碱腐蚀像素UPCAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianUPCATxt= 四元碱腐蚀像素UPCAJTextField.getText().trim();
			}
		});
		四元碱腐蚀像素UPCAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonJianUPCATxt= 四元碱腐蚀像素UPCAJTextField.getText().trim();
			}
		});
		四元碱腐蚀像素UPCAJTextField.setText("15");
		appInThisClass.fourInitonJianUPCATxt= "15";
		this.add(四元碱腐蚀像素UPCA);
		this.add(四元碱腐蚀像素UPCAJTextField);	
	///////////////////////////////////////////////////////////////////////////////////////////	
		
		//像素阀值
		//像素比值
		//像素精值
		JLabel 十六元碱腐蚀像素阀值= new JLabel("十六元碱像素阀值"+ ":");  
		十六元碱腐蚀像素阀值.setForeground(Color.white);
		十六元碱腐蚀像素阀值.setBounds(10+ 4* 90, 20+ 25* 1, 150, 25);
		JTextField 十六元碱腐蚀像素阀值JTextField= new JTextField();
		十六元碱腐蚀像素阀值JTextField.setBounds(10+ 4* 90+ 110, 20+ 25* 1, 50, 25);
		十六元碱腐蚀像素阀值JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianFaTxt= 十六元碱腐蚀像素阀值JTextField.getText().trim();
			}
		});
		十六元碱腐蚀像素阀值JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonJianFaTxt= 十六元碱腐蚀像素阀值JTextField.getText().trim();
			}
		});
		十六元碱腐蚀像素阀值JTextField.setText("10");
		appInThisClass.sixteenInitonJianFaTxt= "10";
		this.add(十六元碱腐蚀像素阀值);
		this.add(十六元碱腐蚀像素阀值JTextField);	

		JLabel 十六元碱腐蚀像素比值= new JLabel("十六元碱像素比值"+ ":");  
		十六元碱腐蚀像素比值.setForeground(Color.white);
		十六元碱腐蚀像素比值.setBounds(10+ 4* 90, 20+ 25* 2, 150, 25);
		JTextField 十六元碱腐蚀像素比值JTextField= new JTextField();
		十六元碱腐蚀像素比值JTextField.setBounds(10+ 4* 90+ 110, 20+ 25* 2, 50, 25);
		十六元碱腐蚀像素比值JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianBiTxt= 十六元碱腐蚀像素比值JTextField.getText().trim();
			}
		});
		十六元碱腐蚀像素阀值JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonJianBiTxt= 十六元碱腐蚀像素比值JTextField.getText().trim();
			}
		});
		十六元碱腐蚀像素比值JTextField.setText("2");
		appInThisClass.sixteenInitonJianBiTxt= "2";
		this.add(十六元碱腐蚀像素比值);
		this.add(十六元碱腐蚀像素比值JTextField);	
		
		JLabel 十六元碱腐蚀像素精度= new JLabel("十六元碱像素精度"+ ":");  
		十六元碱腐蚀像素精度.setForeground(Color.white);
		十六元碱腐蚀像素精度.setBounds(10+ 4* 90, 20+ 25* 3, 150, 25);
		JTextField 十六元碱腐蚀像素精度JTextField= new JTextField();
		十六元碱腐蚀像素精度JTextField.setBounds(10+ 4* 90+ 110, 20+ 25* 3, 50, 25);
		十六元碱腐蚀像素精度JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianJingTxt= 十六元碱腐蚀像素精度JTextField.getText().trim();
			}
		});
		十六元碱腐蚀像素阀值JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonJianJingTxt= 十六元碱腐蚀像素精度JTextField.getText().trim();
			}
		});
		十六元碱腐蚀像素精度JTextField.setText("8");
		appInThisClass.sixteenInitonJianJingTxt= "8";
		this.add(十六元碱腐蚀像素精度);
		this.add(十六元碱腐蚀像素精度JTextField);	
		
		JLabel 十六元碱腐蚀像素PCA= new JLabel("十六元碱像素PCA"+ ":");  
		十六元碱腐蚀像素PCA.setForeground(Color.white);
		十六元碱腐蚀像素PCA.setBounds(10+ 4* 90, 20+ 25* 4, 150, 25);
		JTextField 十六元碱腐蚀像素PCAJTextField= new JTextField();
		十六元碱腐蚀像素PCAJTextField.setBounds(10+ 4* 90+ 110, 20+ 25* 4, 50, 25);
		十六元碱腐蚀像素PCAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianPCATxt= 十六元碱腐蚀像素PCAJTextField.getText().trim();
			}
		});
		十六元碱腐蚀像素PCAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonJianPCATxt= 十六元碱腐蚀像素PCAJTextField.getText().trim();
			}
		});
		十六元碱腐蚀像素PCAJTextField.setText("1");
		appInThisClass.sixteenInitonJianPCATxt= "1";
		this.add(十六元碱腐蚀像素PCA);
		this.add(十六元碱腐蚀像素PCAJTextField);	
		
		
		JLabel 十六元碱腐蚀像素ICA= new JLabel("十六元碱像素ICA"+ ":");  
		十六元碱腐蚀像素ICA.setForeground(Color.white);
		十六元碱腐蚀像素ICA.setBounds(10+ 4* 90, 20+ 25* 5, 150, 25);
		JTextField 十六元碱腐蚀像素ICAJTextField= new JTextField();
		十六元碱腐蚀像素ICAJTextField.setBounds(10+ 4* 90+ 110, 20+ 25* 5, 50, 25);
		十六元碱腐蚀像素ICAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianICATxt= 十六元碱腐蚀像素ICAJTextField.getText().trim();
			}
		});
		十六元碱腐蚀像素ICAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonJianICATxt= 十六元碱腐蚀像素ICAJTextField.getText().trim();
			}
		});
		十六元碱腐蚀像素ICAJTextField.setText("1");
		appInThisClass.sixteenInitonJianICATxt= "1";
		this.add(十六元碱腐蚀像素ICA);
		this.add(十六元碱腐蚀像素ICAJTextField);	
		
		JLabel 十六元碱腐蚀像素ECA= new JLabel("十六元碱像素ECA"+ ":");  
		十六元碱腐蚀像素ECA.setForeground(Color.white);
		十六元碱腐蚀像素ECA.setBounds(10+ 4* 90, 20+ 25* 6, 150, 25);
		JTextField 十六元碱腐蚀像素ECAJTextField= new JTextField();
		十六元碱腐蚀像素ECAJTextField.setBounds(10+ 4* 90+ 110, 20+ 25* 6, 50, 25);
		十六元碱腐蚀像素ECAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianECATxt= 十六元碱腐蚀像素ECAJTextField.getText().trim();
			}
		});
		十六元碱腐蚀像素ECAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonJianECATxt= 十六元碱腐蚀像素ECAJTextField.getText().trim();
			}
		});
		十六元碱腐蚀像素ECAJTextField.setText("1");
		appInThisClass.sixteenInitonJianECATxt= "1";
		this.add(十六元碱腐蚀像素ECA);
		this.add(十六元碱腐蚀像素ECAJTextField);	
		
		JLabel 十六元碱腐蚀像素UPCA= new JLabel("十六元碱像素UPCA"+ ":");  
		十六元碱腐蚀像素UPCA.setForeground(Color.white);
		十六元碱腐蚀像素UPCA.setBounds(10+ 4* 90, 20+ 25* 7, 150, 25);
		JTextField 十六元碱腐蚀像素UPCAJTextField= new JTextField();
		十六元碱腐蚀像素UPCAJTextField.setBounds(10+ 4* 90+ 110, 20+ 25* 7, 50, 25);
		十六元碱腐蚀像素UPCAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianUPCATxt= 十六元碱腐蚀像素UPCAJTextField.getText().trim();
			}
		});
		十六元碱腐蚀像素UPCAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonJianUPCATxt= 十六元碱腐蚀像素UPCAJTextField.getText().trim();
			}
		});
		十六元碱腐蚀像素UPCAJTextField.setText("45");
		appInThisClass.sixteenInitonJianUPCATxt= "45";
		this.add(十六元碱腐蚀像素UPCA);
		this.add(十六元碱腐蚀像素UPCAJTextField);	
	///////////////////////////////////////////////////////////////////////////////////////////			
		


		//像素阀值
		//像素比值
		//像素精值
		JLabel 十六元酸腐蚀像素阀值= new JLabel("十六元酸像素阀值"+ ":");  
		十六元酸腐蚀像素阀值.setForeground(Color.white);
		十六元酸腐蚀像素阀值.setBounds(10+ 6* 90, 20+ 25* 1, 150, 25);
		JTextField 十六元酸腐蚀像素阀值JTextField= new JTextField();
		十六元酸腐蚀像素阀值JTextField.setBounds(10+ 6* 90+ 110, 20+ 25* 1, 50, 25);
		十六元酸腐蚀像素阀值JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanFaTxt= 十六元酸腐蚀像素阀值JTextField.getText().trim();
			}
		});
		十六元酸腐蚀像素阀值JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonSuanFaTxt= 十六元酸腐蚀像素阀值JTextField.getText().trim();
			}
		});
		十六元酸腐蚀像素阀值JTextField.setText("10");
		appInThisClass.sixteenInitonSuanFaTxt= "10";
		this.add(十六元酸腐蚀像素阀值);
		this.add(十六元酸腐蚀像素阀值JTextField);	

		JLabel 十六元酸腐蚀像素比值= new JLabel("十六元酸像素比值"+ ":");  
		十六元酸腐蚀像素比值.setForeground(Color.white);
		十六元酸腐蚀像素比值.setBounds(10+ 6* 90, 20+ 25* 2, 150, 25);
		JTextField 十六元酸腐蚀像素比值JTextField= new JTextField();
		十六元酸腐蚀像素比值JTextField.setBounds(10+ 6* 90+ 110, 20+ 25* 2, 50, 25);
		十六元酸腐蚀像素比值JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanBiTxt= 十六元酸腐蚀像素比值JTextField.getText().trim();
			}
		});
		十六元酸腐蚀像素阀值JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonSuanBiTxt= 十六元酸腐蚀像素比值JTextField.getText().trim();
			}
		});
		十六元酸腐蚀像素比值JTextField.setText("2");
		appInThisClass.sixteenInitonSuanBiTxt= "2";
		this.add(十六元酸腐蚀像素比值);
		this.add(十六元酸腐蚀像素比值JTextField);	

		JLabel 十六元酸腐蚀像素精度= new JLabel("十六元酸像素精度"+ ":");  
		十六元酸腐蚀像素精度.setForeground(Color.white);
		十六元酸腐蚀像素精度.setBounds(10+ 6* 90, 20+ 25* 3, 150, 25);
		JTextField 十六元酸腐蚀像素精度JTextField= new JTextField();
		十六元酸腐蚀像素精度JTextField.setBounds(10+ 6* 90+ 110, 20+ 25* 3, 50, 25);
		十六元酸腐蚀像素精度JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanJingTxt= 十六元酸腐蚀像素精度JTextField.getText().trim();
			}
		});
		十六元酸腐蚀像素阀值JTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonSuanJingTxt= 十六元酸腐蚀像素精度JTextField.getText().trim();
			}
		});
		十六元酸腐蚀像素精度JTextField.setText("8");
		appInThisClass.sixteenInitonSuanJingTxt= "8";
		this.add(十六元酸腐蚀像素精度);
		this.add(十六元酸腐蚀像素精度JTextField);	

		JLabel 十六元酸腐蚀像素PCA= new JLabel("十六元酸像素PCA"+ ":");  
		十六元酸腐蚀像素PCA.setForeground(Color.white);
		十六元酸腐蚀像素PCA.setBounds(10+ 6* 90, 20+ 25* 4, 150, 25);
		JTextField 十六元酸腐蚀像素PCAJTextField= new JTextField();
		十六元酸腐蚀像素PCAJTextField.setBounds(10+ 6* 90+ 110, 20+ 25* 4, 50, 25);
		十六元酸腐蚀像素PCAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanPCATxt= 十六元酸腐蚀像素PCAJTextField.getText().trim();
			}
		});
		十六元酸腐蚀像素PCAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonSuanPCATxt= 十六元酸腐蚀像素PCAJTextField.getText().trim();
			}
		});
		十六元酸腐蚀像素PCAJTextField.setText("1");
		appInThisClass.sixteenInitonSuanPCATxt= "1";
		this.add(十六元酸腐蚀像素PCA);
		this.add(十六元酸腐蚀像素PCAJTextField);	


		JLabel 十六元酸腐蚀像素ICA= new JLabel("十六元酸像素ICA"+ ":");  
		十六元酸腐蚀像素ICA.setForeground(Color.white);
		十六元酸腐蚀像素ICA.setBounds(10+ 6* 90, 20+ 25* 5, 150, 25);
		JTextField 十六元酸腐蚀像素ICAJTextField= new JTextField();
		十六元酸腐蚀像素ICAJTextField.setBounds(10+ 6* 90+ 110, 20+ 25* 5, 50, 25);
		十六元酸腐蚀像素ICAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanICATxt= 十六元酸腐蚀像素ICAJTextField.getText().trim();
			}
		});
		十六元酸腐蚀像素ICAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonSuanICATxt= 十六元酸腐蚀像素ICAJTextField.getText().trim();
			}
		});
		十六元酸腐蚀像素ICAJTextField.setText("1");
		appInThisClass.sixteenInitonSuanICATxt= "1";
		this.add(十六元酸腐蚀像素ICA);
		this.add(十六元酸腐蚀像素ICAJTextField);	

		JLabel 十六元酸腐蚀像素ECA= new JLabel("十六元酸像素ECA"+ ":");  
		十六元酸腐蚀像素ECA.setForeground(Color.white);
		十六元酸腐蚀像素ECA.setBounds(10+ 6* 90, 20+ 25* 6, 150, 25);
		JTextField 十六元酸腐蚀像素ECAJTextField= new JTextField();
		十六元酸腐蚀像素ECAJTextField.setBounds(10+ 6* 90+ 110, 20+ 25* 6, 50, 25);
		十六元酸腐蚀像素ECAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanECATxt= 十六元酸腐蚀像素ECAJTextField.getText().trim();
			}
		});
		十六元酸腐蚀像素ECAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonSuanECATxt= 十六元酸腐蚀像素ECAJTextField.getText().trim();
			}
		});
		十六元酸腐蚀像素ECAJTextField.setText("1");
		appInThisClass.sixteenInitonSuanECATxt= "1";
		this.add(十六元酸腐蚀像素ECA);
		this.add(十六元酸腐蚀像素ECAJTextField);	

		JLabel 十六元酸腐蚀像素UPCA= new JLabel("十六元酸像素UPCA"+ ":");  
		十六元酸腐蚀像素UPCA.setForeground(Color.white);
		十六元酸腐蚀像素UPCA.setBounds(10+ 6* 90, 20+ 25* 7, 150, 25);
		JTextField 十六元酸腐蚀像素UPCAJTextField= new JTextField();
		十六元酸腐蚀像素UPCAJTextField.setBounds(10+ 6* 90+ 110, 20+ 25* 7, 50, 25);
		十六元酸腐蚀像素UPCAJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanUPCATxt= 十六元酸腐蚀像素UPCAJTextField.getText().trim();
			}
		});
		十六元酸腐蚀像素UPCAJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonSuanUPCATxt= 十六元酸腐蚀像素UPCAJTextField.getText().trim();
			}
		});
		十六元酸腐蚀像素UPCAJTextField.setText("45");
		appInThisClass.sixteenInitonSuanUPCATxt= "45";
		this.add(十六元酸腐蚀像素UPCA);
		this.add(十六元酸腐蚀像素UPCAJTextField);		


		/////////////////////////权重

		
		JLabel 十六元酸腐蚀权重scale= new JLabel("十六元酸权重scale"+ ":");  
		十六元酸腐蚀权重scale.setForeground(Color.white);
		十六元酸腐蚀权重scale.setBounds(10+ 6* 90, 20+ 25* 9, 150, 25);
		JTextField 十六元酸腐蚀权重scaleJTextField= new JTextField();
		十六元酸腐蚀权重scaleJTextField.setBounds(10+ 6* 90+ 110, 20+ 25* 9, 50, 25);
		十六元酸腐蚀权重scaleJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanScaleTxt= 十六元酸腐蚀权重scaleJTextField.getText().trim();
			}
		});
		十六元酸腐蚀权重scaleJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonSuanScaleTxt= 十六元酸腐蚀权重scaleJTextField.getText().trim();
			}
		});
		十六元酸腐蚀权重scaleJTextField.setText("1");
		appInThisClass.sixteenInitonSuanScaleTxt= "1";
		this.add(十六元酸腐蚀权重scale);
		this.add(十六元酸腐蚀权重scaleJTextField);		
	/////
		JLabel 十六元碱腐蚀权重scale= new JLabel("十六元碱权重scale"+ ":");  
		十六元碱腐蚀权重scale.setForeground(Color.white);
		十六元碱腐蚀权重scale.setBounds(10+ 4* 90, 20+ 25* 9, 150, 25);
		JTextField 十六元碱腐蚀权重scaleJTextField= new JTextField();
		十六元碱腐蚀权重scaleJTextField.setBounds(10+ 4* 90+ 110, 20+ 25* 9, 50, 25);
		十六元碱腐蚀权重scaleJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianScaleTxt= 十六元碱腐蚀权重scaleJTextField.getText().trim();
			}
		});
		十六元碱腐蚀权重scaleJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.sixteenInitonJianScaleTxt= 十六元碱腐蚀权重scaleJTextField.getText().trim();
			}
		});
		十六元碱腐蚀权重scaleJTextField.setText("1");
		appInThisClass.sixteenInitonJianScaleTxt= "1";
		this.add(十六元碱腐蚀权重scale);
		this.add(十六元碱腐蚀权重scaleJTextField);		
		//////
		JLabel 四元酸腐蚀权重scale= new JLabel("四元酸蚀权重scale"+ ":");  
		四元酸腐蚀权重scale.setForeground(Color.white);
		四元酸腐蚀权重scale.setBounds(10+ 2* 90, 20+ 25* 9, 150, 25);
		JTextField 四元酸腐蚀权重scaleJTextField= new JTextField();
		四元酸腐蚀权重scaleJTextField.setBounds(10+ 2* 90+ 110, 20+ 25* 9, 50, 25);
		四元酸腐蚀权重scaleJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanScaleTxt= 四元酸腐蚀权重scaleJTextField.getText().trim();
			}
		});
		四元酸腐蚀权重scaleJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonSuanScaleTxt= 四元酸腐蚀权重scaleJTextField.getText().trim();
			}
		});
		四元酸腐蚀权重scaleJTextField.setText("0.001");
		appInThisClass.fourInitonSuanScaleTxt= "0.001";
		this.add(四元酸腐蚀权重scale);
		this.add(四元酸腐蚀权重scaleJTextField);		
		
		
		JLabel 四元碱腐蚀权重scale= new JLabel("四元碱蚀权重scale"+ ":");  
		四元碱腐蚀权重scale.setForeground(Color.white);
		四元碱腐蚀权重scale.setBounds(10+ 0* 90, 20+ 25* 9, 150, 25);
		JTextField 四元碱腐蚀权重scaleJTextField= new JTextField();
		四元碱腐蚀权重scaleJTextField.setBounds(10+ 0* 90+ 110, 20+ 25* 9, 50, 25);
		四元碱腐蚀权重scaleJTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianScaleTxt= 四元碱腐蚀权重scaleJTextField.getText().trim();
			}
		});
		四元碱腐蚀权重scaleJTextField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				appInThisClass.fourInitonJianScaleTxt= 四元碱腐蚀权重scaleJTextField.getText().trim();
			}
		});
		四元碱腐蚀权重scaleJTextField.setText("1");
		appInThisClass.fourInitonJianScaleTxt= "1";
		this.add(四元碱腐蚀权重scale);
		this.add(四元碱腐蚀权重scaleJTextField);		
		
		
		
		
		
		
		
		
		
	//file	
		
		
		
		JLabel 四元酸腐蚀训练文件地址= new JLabel("四元酸腐蚀训练文件地址"+ ":");  
		四元酸腐蚀训练文件地址.setForeground(Color.white);
		四元酸腐蚀训练文件地址.setBounds(10+ 0* 150, 20+ 25* 13, 150, 50);
		
		JTextField 四元酸腐蚀训练文件地址JTextField= new JTextField();
		四元酸腐蚀训练文件地址JTextField.setBounds(10+ 0* 150+ 160, 20+ 25* 13, 550, 50);
		四元酸腐蚀训练文件地址JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonSuanTxt= 四元酸腐蚀训练文件地址JTextField.getText().trim();
			}
		});
		四元酸腐蚀训练文件地址JTextField.addKeyListener(new KeyListener() {

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
				appInThisClass.fourInitonSuanTxt= 四元酸腐蚀训练文件地址JTextField.getText().trim();
			}
			
		});
		四元酸腐蚀训练文件地址JTextField.setText("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt");
		appInThisClass.fourInitonSuanTxt= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt";
		this.add(四元酸腐蚀训练文件地址);
		this.add(四元酸腐蚀训练文件地址JTextField);	
		
		//
		JLabel 四元碱性腐蚀训练文件地址= new JLabel("四元碱腐蚀训练文件地址"+ ":");  
		四元碱性腐蚀训练文件地址.setForeground(Color.white);
		四元碱性腐蚀训练文件地址.setBounds(10+ 0* 150, 20+ 25* 16, 150, 50);
		
		JTextField 四元碱性腐蚀训练文件地址JTextField= new JTextField();
		四元碱性腐蚀训练文件地址JTextField.setBounds(10+ 0* 150+ 160, 20+ 25* 16, 550, 50);
		四元碱性腐蚀训练文件地址JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.fourInitonJianTxt= 四元碱性腐蚀训练文件地址JTextField.getText().trim();
			}
		});
		四元碱性腐蚀训练文件地址JTextField.addKeyListener(new KeyListener() {

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
				appInThisClass.fourInitonJianTxt= 四元碱性腐蚀训练文件地址JTextField.getText().trim();
			}
			
		});
		四元碱性腐蚀训练文件地址JTextField.setText("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB5.txt");
		appInThisClass.fourInitonJianTxt= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB5.txt";
		this.add(四元碱性腐蚀训练文件地址);
		this.add(四元碱性腐蚀训练文件地址JTextField);	
		
		//
		//十六元酸腐蚀地址
		JLabel 十六元酸性腐蚀训练文件地址= new JLabel("十六元酸腐蚀训练文件地址"+ ":");  
		十六元酸性腐蚀训练文件地址.setForeground(Color.white);
		十六元酸性腐蚀训练文件地址.setBounds(10+ 0* 150, 20+ 25* 19, 150, 50);
		
		JTextField 十六元酸性腐蚀训练文件地址JTextField= new JTextField();
		十六元酸性腐蚀训练文件地址JTextField.setBounds(10+ 0* 150+ 160, 20+ 25* 19, 550, 50);
		十六元酸性腐蚀训练文件地址JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonSuanTxt= 十六元酸性腐蚀训练文件地址JTextField.getText().trim();
			}
		});
		十六元酸性腐蚀训练文件地址JTextField.addKeyListener(new KeyListener() {

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
				appInThisClass.sixteenInitonSuanTxt= 十六元酸性腐蚀训练文件地址JTextField.getText().trim();
			}
			
		});
		十六元酸性腐蚀训练文件地址JTextField.setText("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_suan_17.txt");
		appInThisClass.sixteenInitonSuanTxt= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_suan_17.txt";
		this.add(十六元酸性腐蚀训练文件地址);
		this.add(十六元酸性腐蚀训练文件地址JTextField);	
		
		
		
		//十六元碱腐蚀地址
		JLabel 十六元碱性腐蚀训练文件地址= new JLabel("十六元碱腐蚀训练文件地址"+ ":");  
		十六元碱性腐蚀训练文件地址.setForeground(Color.white);
		十六元碱性腐蚀训练文件地址.setBounds(10+ 0* 150, 20+ 25* 22, 150, 50);
		
		JTextField 十六元碱性腐蚀训练文件地址JTextField= new JTextField();
		十六元碱性腐蚀训练文件地址JTextField.setBounds(10+ 0* 150+ 160, 20+ 25* 22, 550, 50);
		十六元碱性腐蚀训练文件地址JTextField.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				appInThisClass.sixteenInitonJianTxt= 十六元碱性腐蚀训练文件地址JTextField.getText().trim();
			}
		});
		十六元碱性腐蚀训练文件地址JTextField.addKeyListener(new KeyListener() {

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
				appInThisClass.sixteenInitonJianTxt= 十六元碱性腐蚀训练文件地址JTextField.getText().trim();
			}
			
		});
		十六元碱性腐蚀训练文件地址JTextField.setText("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_jian_17.txt");
		appInThisClass.sixteenInitonJianTxt= "C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_jian_17.txt";
		this.add(十六元碱性腐蚀训练文件地址);
		this.add(十六元碱性腐蚀训练文件地址JTextField);	
		
		
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