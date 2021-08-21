package AVQ.OEQ.cap;
import java.awt.*;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.bytedeco.javacpp.opencv_core.IplImage;
import org.bytedeco.javacv.Java2DFrameConverter;
import org.bytedeco.javacv.OpenCVFrameConverter;
import org.bytedeco.javacv.OpenCVFrameGrabber;

import MVQ.button.DetaButton;
import OSI.AOP.freetts.thread.read.ReadEnglish;
import OSI.SSI.ASU.OSU.PSU.MSU.pde.DecadeToPDS;

public class Monitor_XCDX extends JApplet{
	private static final long serialVersionUID = 1L;
	public int[][] mskr;
	public int[][] mskb;
	public int[][] mskg;
	public int[][] diffg;
	public int[][] diffr;
	public int[][] diffb;
	public int[][] rp;
	public int[][] gp;
	public int[][] bp;
	public int[][] r2r;
	public int[][] r2g;
	public int[][] r2b;
	public int[][] gpcar;
	public int[][] gpcag;
	public int[][] gpcab;
		
	public int[][] showOCLDr;
	public int[][] showORGNr;
	public int[][] showOCLDg;
	public int[][] showORGNg;
	public int[][] showOCLDb;
	public int[][] showORGNb;
	public int findr= 0;
	public boolean isRedButton= false;
	public boolean isGreenButton= false;
	public boolean isBlueButton= false;
	public boolean isStreButton= false;
	public boolean isSblButton= false;
	public boolean isRcaButton= false;
	public boolean isPcaButton= false;
	public boolean isPcfButton= false;
	public boolean isbt52Stop= false;
	public boolean isbt53Stop= false;
	public boolean isbt60Stop= false;
	public boolean isbt73Stop= false;
	public boolean isbt80Stop= false;
	public boolean isbt81Stop= false;
	public boolean isbt82Stop= false;
	public boolean isbt83Stop= false;
	public boolean isbt62Stop= false;
	public boolean isbt43Stop= false;
	public boolean isbt41Stop= false;
	public boolean isbt88Stop= false;
	public boolean isbt113Stop= false;
	public boolean recordStop= true;
	public DecadeToPDS decadeToPDS= new DecadeToPDS();
	public BufferedImage stopBufferedImage;
	public Map<String, Boolean> eyeShows= new HashMap<>();
	public ArrayList<int[][]> imageList= new ArrayList<>();
	public boolean isStop= false;	
	public String time = "";
	public String newtime = "";
	public long mi = 0;
	public long newmi = 0;
	public IplImage ipl;
	public IplImage newcv;
	public JSlider sliderx;
	public JSlider sliderz;
	public JSlider slidery;
	public JSlider slidert;
	public JSlider sliderl;
	public Box br= new Box(BoxLayout.X_AXIS);  
	public Box bg= new Box(BoxLayout.X_AXIS);  
	public Box bb= new Box(BoxLayout.X_AXIS);  
	public JSlider sliderr;
	public JSlider sliderg;
	public JSlider sliderb;
	public JButton btr;
	public JButton btg;
	public JButton btb;
	public int facr= 0;
	public int facg= 0;
	public int facb= 0;

	public JButton bt1;
	public JButton bt2;
	public JButton bt3;
	public JButton bt4;
	public JButton bt5;

	public JButton bt00;
	public JButton bt01;
	public JButton bt02;
	public JButton bt03;

	public JButton bt10;
	public JButton bt11;
	public JButton bt12;
	public JButton bt13;

	public JButton bt20;
	public JButton bt21;
	public JButton bt22;
	public JButton bt23;

	public JButton bt30;
	public JButton bt31;
	public JButton bt32;
	public JButton bt33;

	public JButton bt40;
	public JButton bt41;
	public JButton bt42;
	public JButton bt43;

	public JButton bt50;
	public JButton bt51;
	public JButton bt52;
	public JButton bt53;

	public JButton bt60;
	public JButton bt61;
	public JButton bt62;
	public JButton bt63;

	public JButton bt70;
	public JButton bt71;
	public JButton bt72;
	public JButton bt73;

	public JButton bt80;
	public JButton bt81;
	public JButton bt82;
	public JButton bt83;

	public JButton bt84;
	public JButton bt85;
	public JButton bt86;
	public JButton bt87;

	public JButton bt88;
	public JButton bt89;
	public JButton bt90;
	public JButton bt91;

	public DetaButton bt92;	
	
	public DetaButton bt111;	
	public DetaButton bt112;	
	public DetaButton bt113;	
	public DetaButton bt114;	
	
	public DetaButton bt121;	
	public DetaButton bt122;	
	public DetaButton bt123;	
	public DetaButton bt124;	
	
	public DetaButton bt131;	
	public DetaButton bt132;	
	public DetaButton bt133;	
	public DetaButton bt134;	
	
	public DetaButton bt141;	
	public DetaButton bt142;	
	public DetaButton bt143;	
	public DetaButton bt144;	
	
	public DetaButton bt151;	
	public DetaButton bt152;	
	public DetaButton bt153;	
	public DetaButton bt154;	

	public org.bytedeco.javacv.Frame frame;
	public int encry[][][];
	public int encry_new[][][];
	public int encry_fs[][][];
	public IplImage difcv;
	public IplImage oldcv;
	public Image oldImage;
	public BufferedImage imageForOutput;
	public ReadEnglish readEnglish;
	public Image newImage;
	public Java2DFrameConverter paintConverter;
	public Image difImage;
	public Box sliderBox = new Box(BoxLayout.Y_AXIS);  
	public Box buttonBox0= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox1= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox2= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox3= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox4= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox5= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox6= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox7= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox8= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox9= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox10= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox11= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox12= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox13= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox14= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox15= new Box(BoxLayout.X_AXIS);  

	public Box b1= new Box(BoxLayout.X_AXIS);  
	public Box b2= new Box(BoxLayout.X_AXIS);  
	public Box b3= new Box(BoxLayout.X_AXIS);  
	public Box b4= new Box(BoxLayout.X_AXIS);  
	public Box b5= new Box(BoxLayout.X_AXIS);  
	public Box b6= new Box(BoxLayout.X_AXIS);  
	public Box b7= new Box(BoxLayout.X_AXIS);  

		public Button btn;
		public int[][] gdif;
		public OpenCVFrameGrabber grabber;
		public OpenCVFrameConverter.ToIplImage converter;
		public int stop= 0;
		public int has= 0;
		public int reg= 0;
		public int facx= 7;
		public int facy= 100;
		public int facz= 50;
		public int fact= 50;
		public int facl= 3;
		public long last= 0;
		int encry_c= 2;
		int encry_c_new= 2;
		int encry_c_fs= 2;
		int[][] out;
		int[][] out_oldr= null;
		int[][] out_oldg= null;
		int[][] out_oldb= null;

		int[][] out_old2r= null;
		int[][] out_old2g= null;
		int[][] out_old2b= null;
		int[][] out_old1= null;
		int[][] out_old2= null;
		int[][] out_old3= null;
		int[][] out_old4= null;
		int[][] out_old5= null;
		int q= 0;
		int q_new= 0;
		int q_fs= 0;
		int finalEncry[][];
		int finalEncryNew[][];
		int finalEncryFs[][];
		public Image img;
		public boolean isbt114Stop;
		public boolean isbt121Stop;
		public boolean isbt122Stop;
		public boolean isbt123Stop;
		public boolean isbt124Stop;
		public boolean isbt132Stop;
		public static void main(String[] argv) {
			Monitor_XCDX m= new Monitor_XCDX();
			m.init();
			m.setVisible(true);
			JFrame f= new JFrame();
			f.setLayout(null);
			f.add(m);
			m.sliderx= new JSlider(0, 360);
			m.sliderx.setSnapToTicks(true);
			m.sliderx.setPaintTicks(true);
			m.sliderx.setMajorTickSpacing(5);
			m.sliderx.setMinorTickSpacing(1);
			m.sliderx.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source= (JSlider) event.getSource();  
							m.facx= source.getValue(); 
						}
					});  

			m.slidery = new JSlider(0,360);
			m.slidery.setSnapToTicks(true);
			m.slidery.setPaintTicks(true);
			m.slidery.setMajorTickSpacing(5);
			m.slidery.setMinorTickSpacing(0);
			m.slidery.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							m.facy = source.getValue();  
						}
					});  

			m.sliderz = new JSlider(0,360);
			m.sliderz.setSnapToTicks(true);
			m.sliderz.setPaintTicks(true);
			m.sliderz.setMajorTickSpacing(5);
			m.sliderz.setMinorTickSpacing(0);
			m.sliderz.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							m.facz = source.getValue();  
						}
					});  
			m.slidert= new JSlider(0,100);
			m.slidert.setSnapToTicks(true);
			m.slidert.setPaintTicks(true);
			m.slidert.setMajorTickSpacing(5);
			m.slidert.setMinorTickSpacing(1);
			m.slidert.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							m.fact= source.getValue();  
						}
					});
			m.sliderl = new JSlider(0,360);
			m.sliderl.setSnapToTicks(true);
			m.sliderl.setPaintTicks(true);
			m.sliderl.setMajorTickSpacing(5);
			m.sliderl.setMinorTickSpacing(0);
			m.sliderl.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {
							JSlider source= (JSlider) event.getSource();
							m.facl= source.getValue();  
						}
					});
			m.sliderBox.add(m.sliderx);
			m.sliderBox.add(m.slidery);
			m.sliderBox.add(m.sliderz);
			m.sliderBox.add(m.slidert);
			m.sliderBox.add(m.sliderl);
			m.sliderBox.setBounds(000, 860, 1200, 750);
			f.add(m.sliderBox);
			f.setTitle("ButtonDemo");
			f.setLocationRelativeTo(null);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(1000,1050);
			f.setVisible(true);
		}
		@Override
		public void init() {
			decadeToPDS.IV_(decadeToPDS);
			readEnglish= new ReadEnglish();
			grabber= new OpenCVFrameGrabber(0);
			converter= new OpenCVFrameConverter.ToIplImage();
			try {
				if(!grabber.equals(null)) {
					grabber.start();
				}
				Thread.sleep(2000);
				frame = grabber.grab();
			} catch (Exception e) {
				e.printStackTrace();
			}
			paintConverter = new Java2DFrameConverter();
			difImage = paintConverter.getBufferedImage(frame, 1);
			BufferedImage imageInit = (BufferedImage) difImage;
			encry = new int[encry_c][imageInit.getWidth()][imageInit.getHeight()];
			encry_new = new int[encry_c_new][imageInit.getWidth()][imageInit.getHeight()];
			encry_fs = new int[encry_c_fs][imageInit.getWidth()][imageInit.getHeight()];	
			out_oldr = new int[imageInit.getWidth()][imageInit.getHeight()];
			out_oldg = new int[imageInit.getWidth()][imageInit.getHeight()];
			out_oldb = new int[imageInit.getWidth()][imageInit.getHeight()];
			out_old1 = new int[imageInit.getWidth()][imageInit.getHeight()];
			out_old2r = new int[imageInit.getWidth()][imageInit.getHeight()];
			out_old2g = new int[imageInit.getWidth()][imageInit.getHeight()];
			out_old2b = new int[imageInit.getWidth()][imageInit.getHeight()];
			out_old3 = new int[imageInit.getWidth()][imageInit.getHeight()];
			out_old4 = new int[imageInit.getWidth()][imageInit.getHeight()];
			out_old5 = new int[imageInit.getWidth()][imageInit.getHeight()];
			this.setBounds(5, 5, 895, 675-48);
			this.start();
		}

		public void stop() {
			try {
				if(grabber!=null) {
					grabber.stop();
				}
				stop = 1;
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

		public void start(){
		}

		public void paint(Graphics g){
			try {
				Monitor_XCDX_Animation.XCDX_paint(this, g);
			}catch(Exception e) {
				//To do
			}
		}

		public void expand(int[][] show, int i, int j, int fac, int k) {
			if(k== 1) {
				for(int v= 0; v< fac; v++) {
					for(int h= 0; h< fac; h++) {
						if(i+ v>= 0 && i+ v< show.length&& h+ j>= 0&& h+ j< show[0].length) {
							show[i+ v][h+ j]= 255;
						}
					}
				}
			}
			if(k== 2) {
				for(int v= -fac; v< 0; v++) {
					for(int h= 0; h< fac; h++) {
						if(i+ v>= 0&& i+ v< show.length&& h+ j>= 0&& h+ j< show[0].length) {
							show[i+ v][h+ j]= 255;
						}
					}
				}
			}
			if(k== 3) {
				for(int v= 0; v< fac; v++) {
					for(int h= -fac; h< 0; h++) {
						if(i+ v>= 0&& i+ v< show.length&& h+ j>= 0&& h+ j< show[0].length) {
							show[i+v][h+j]=255;
						}
					}
				}
			}
			if(k== 4) {
				for(int v= -fac; v< 0; v++) {
					for(int h= -fac; h< 0; h++) {
						if(i+ v>= 0 && i+ v< show.length&& h+ j>= 0&& h+ j< show[0].length) {
							show[i+ v][h+ j]=255;
						}
					}
				}
			}
		}
		public int[][] findDiff(int[][] out, int[][] out_old) {
			int[][] diff= new int[out.length][out[0].length];
			if(out_old!= null) {
				for (int i= 0; i< diff[0].length; ++i) {
					for (int j= 0; j< diff.length; ++j) {
						if(out[j][i]!= out_old[j][i]) {
							diff[j][i]= out[j][i];
						}
						out_old[j][i]= out[j][i];
					}
				}
			}else {
				diff= out;
			}	
			return diff;
		}

		public int getMskFilter(int[][] fb, int[][] msk, int i, int j, int size, Map<String, Integer> map) {
			if(fb[j][i]!= 255) {
				return size;
			}
			if(msk[j][i]== 1) {
				return size;
			}
			if(size> 3000) {
				return size;
			}
			size++;
			map.put(j+ ","+ i, 1);
			msk[j][i]= 1 ;
			if(i+ 1< fb[0].length) {
				size= getMskFilter(fb, msk, i+1, j, size, map);
			}
			if(i- 1 >= 0) {
				size = getMskFilter(fb, msk, i- 1, j, size, map);
			}
			if(j+ 1 < fb.length) {
				size= getMskFilter(fb, msk, i, j+ 1, size, map);
			}
			if(j- 1>= 0) {
				size= getMskFilter(fb, msk, i, j- 1, size, map);
			}	
			return size; 
		}

		public ArrayList<Cordination> findCordination() {
			ArrayList<Cordination> clist= new ArrayList<Cordination>();
			BufferedImage difTemp= (BufferedImage) difImage;
			int h= difTemp.getHeight();
			int w= difTemp.getWidth();
			gdif= new int[h][w];
			int cp= -16777216;
			// µÃµ½map
			for(int i= 0; i< h; i++) {
				for(int j= 0; j< w; j++) {
					if(difTemp.getRGB(j, i)!= cp) {
						gdif[i][j]= 1;
					}
				}
			}
			// ¼ÆËã±ßÔµ
			Cordination c= new Cordination();
			c.h0= 999999;
			c.w0= 999999;
			c.h1= 0;
			c.w1= 0;
			for(int i= 0; i< h; i++) {
				for(int j= 0; j< w; j++) {
					if (gdif[i][j]== 1) {
						if (c.h0> i) {
							c.h0= i;
						}
						if (c.w0> j) {
							c.w0= j;
						}
						if (c.h1< i) {
							c.h1= i;
						}
						if (c.w1< i) {
							c.w1= i;
						}
					}
				}
			}
			clist.add(c);
			return clist;
		}
}