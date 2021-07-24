package ME.APM.VSQ;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import AVQ.ASQ.OVQ.OSQ.VSQ.obj.Verbal;
//import AVQ.OEQ.cap.Monitor;
import AVQ.OEQ.cap.Monitor_XCDX;
import IMO.EVU.bi_P.CoAuthorForWord;
import IMS.EUQ.SP.SoundWaveJPanel;
import ISQ.VSU.feature.SkinPathDetectTrip_E;
import ME.APM.VSQ.Harrison.CecilPage;
import ME.APM.VSQ.editPane.EditPane;
import ME.APM.VSQ.fuchankexue.FckxPage;
import ME.APM.VSQ.guJiJingDian.FyydPage;
import ME.APM.VSQ.image.ImageIndex;
import ME.APM.VSQ.jiZhenKeXue.JzkxPage;
import ME.APM.VSQ.waiShangKeXue.WskxPage;
import ME.APM.VSQ.xiYiNeiKe.XynkPage;
import ME.APM.VSQ.xiYiWaiKe.WkxPage;
import ME.APM.VSQ.xiYiYaoCai.XyscPage;
import ME.APM.VSQ.yaoCaiTu.YaoCaiIndex;
import ME.APM.VSQ.zhongYiFuChan.FqzPage;
import ME.APM.VSQ.zhongYiNeiKeXue.ZynkxPage;
import ME.APM.VSQ.zhongYiZhenDuanXue.ZyzdxPage;
import SVQ.stable.StableTag;
import MSU.OCI.ME.SMS.translator.C.Translator;
import MSU.OEI.ME.SMS.SEU.OSD.OSI.E.Translator_E;
import MVQ.button.DetaButton;
import MVQ.tabbedpane.DetabbedPane;
import MVQ.textfield.CfxTextField;
//import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OSI.AOP.neo.tts.ReadChinese;
import SVQ.stable.StableAnnotation;
import OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash.GUISample;
import OSI.OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI;
//import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
import OSI.VSQ.SSI.ASU.OSU.PSU.MSU.ASU.MPE.AOP.MEC.SIQ.search.ZhongYaoSearch;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

import SVQ.stable.StableFile;
import SVQ.stable.StableMapsInitons;

public class App extends JApplet implements MouseListener, KeyListener, ActionListener, ChangeListener{	
	private static final long serialVersionUID= 1L;
	public GUISample gUISample;
	public String databaseRootPath;
	public List<String> CacheStringPiple= new CopyOnWriteArrayList<>();
	public Map<String, String> CacheString= new ConcurrentHashMap<>();
	public JFrame frameConfig;
	public int rangeHigh= 40;
	public int row= 0;
	public SoundWaveJPanel soundWaveJPanel;
	public int col= 0;
	public boolean disableCursor= true;
	public Translator translator;
	public JTextPane text;
	public JTextPane jText;
	protected JTextPane jxText;
	public String key;
	public JFrame frame;
	public JFrame frameHospital;
	public String hint;
	public AppSearch appSearch;
	public AppHospital appHospital;
	public AppConfig appConfig;
	public CogsBinaryForest_AE _A;
	public CoAuthorForWord coAuthorForWord;
	public Monitor_XCDX monitor;
	public JSlider look;
	public Map<String, String> pos;
	public Map<String, String> posec;
	public Map<String, String> pose;
	public Map<String, String> posFullec;
	public Map<String, String> posFullce;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public Map<String, String> pinyin;
	public Map<String, String> ctk;
	public Map<String, String> ctj;
	public Map<String, String> ctt;
	public List<OSU_AVQ_ASQ_ASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI> searchList= new ArrayList<>();; 
	public JCheckBox risk_filter_box;
	public JCheckBox feel_filter_box;
	public JCheckBox jingmai_filter_box;
	public JCheckBox gongxiao_filter_box;
	public JCheckBox zonghe_filter_box;
	public JCheckBox shuming_filter_box;
	public DetabbedPane jTabbedpane;
	public List<String> sets;
	public XynkPage xynkPage;
	public ZynkxPage zynkxPage;
	public ZyzdxPage zyzdxPage;
	public FyydPage fyydPage;
	public FqzPage fqzPage;
	public FckxPage fckxPage;
	public JzkxPage jzkxPage;
	public WkxPage wkxPage;
	public WskxPage wskxPage;
	public XyscPage xyscPage;
	public CecilPage cecil;
	public EditPane editPane;
	public JLabel yaoCaiLabel;
	public JTextPane data;
	public JPanel panel_yt;
	public JTextField name;
	public JTextField nameHospital;
	public JTextField name_filter;
	public javax.swing.JTable table;  
	public Object[][] tableData_old;
	public DefaultTableModel newTableModel= null;
	public List<String> dic_list;
	public List<String> copy;
	public Map<String, Object> dic_map= new HashMap<>();
	public Map<String, Object> dic_li= new HashMap<>();
	public Map<String, Object> dic_hai= new HashMap<>();
	public Map<String, Object> dic_xz= new HashMap<>();
	public Map<String, Object> dic_ya= new HashMap<>();
	public Map<String, Object> dic_jm= new HashMap<>();
	public Map<String, Object> dic_xw= new HashMap<>();
	public Map<String, Object> dic_cy= new HashMap<>();
	public Map<String, Object> dic_cj= new HashMap<>();
	public Map<String, Object> dic_jj= new HashMap<>();
	public Map<String, Object> dic_zf= new HashMap<>();
	public Map<String, Object> dic_yl= new HashMap<>();
	public Map<String, Object> dic_yw= new HashMap<>();
	public Map<String, Object> dic_index= new HashMap<>();
	public JPanel panel= new JPanel(); 
	public JButton buttonCTE;
	public JButton buttonFRS;
	public JButton buttonETC;
	public JButton buttonADD;
	public JButton buttonGXB;
	public JButton buttonBCJ;
	public JFrame frameTag;
	public TagSearch tagSearch;
	public ImageIcon logo= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.logo_png));  
	public ImageIcon pnga= new ImageIcon(this.getClass().getResource(StableFile.sc_a_png)); 
	public ImageIcon pngo= new ImageIcon(this.getClass().getResource(StableFile.sc_o_png)); 
	public ImageIcon pnge= new ImageIcon(this.getClass().getResource(StableFile.sc_e_png)); 
	public ImageIcon pngi= new ImageIcon(this.getClass().getResource(StableFile.sc_i_png)); 
	public ImageIcon pngu= new ImageIcon(this.getClass().getResource(StableFile.sc_u_png)); 
	public ImageIcon shoujueyin= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.�������İ���_png)); 
	public ImageIcon shoushaoyang= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.������������_png));  
	public ImageIcon shoushaoyin= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.�������ľ�_png));  
	public ImageIcon shoutaiyang= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.��̫��С����_png));  
	public ImageIcon shoutaiyin= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.��̫���ξ�_png));  
	public ImageIcon shouyangmin= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.�������󳦾�_png));  
	public ImageIcon zujueyin= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.�������ξ�_png));  
	public ImageIcon zushaoyang= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.����������_png));
	public ImageIcon zushaoyin= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.����������_png));  
	public ImageIcon zutaiyang= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.��̫�����׾�_png));  
	public ImageIcon zutaiyin= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.��̫��Ƣ��_png));  
	public ImageIcon zuyangmin= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.������θ��_png));  
	public ImageIcon png88 = new ImageIcon(new ImageIndex().getClass().getResource(StableFile.bagua_png));  
	public ImageIcon wsp = new ImageIcon(new ImageIndex().getClass().getResource(StableFile.wsp_png));  
	public ImageIcon wwp = new ImageIcon(new ImageIndex().getClass().getResource(StableFile.wwp_png));  
	public ImageIcon wxp = new ImageIcon(new ImageIndex().getClass().getResource(StableFile.wxp_png));
	public ImageIcon shun = new ImageIcon(new ImageIndex().getClass().getResource(StableFile.shun_png));  
	public ImageIcon bagua_bgbz= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.bagua_bgbz_png));  
	public ImageIcon bagua_ljbz= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.bagua_ljbz_png));  
	public ImageIcon bagua_sjbz= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.bagua_sjbz_png));
	public ImageIcon bagua_qxbz= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.bagua_qxbz_png));  
	public ImageIcon bagua_gzxs= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.bagua_gzxs_png));  
	public ImageIcon bagua_skch= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.bagua_skch_png));  
	public ImageIcon bagua_MHYS= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.bagua_MHYS_png));  
	public ImageIcon bagua_YHZP= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.bagua_YHZP_png));  
	public ImageIcon bagua_QNZS= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.bagua_QNZS_png)); 
	public ImageIcon bagua_YDLR= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.bagua_YDLR_png)); 
	public ImageIcon bagua_HLLS= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.bagua_HLLS_png)); 
	public ImageIcon bagua_ZSBZ= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.bagua_ZSBZ_png));
	public ImageIcon bagua_KYCQ= new ImageIcon(new ImageIndex().getClass().getResource(StableFile.bagua_KYCQ_png));
	public ImageIcon qp4= new ImageIcon(new ImageIndex().getClass().getResource(StableFile._4qp_png));  
	public ImageIcon pngy_2_1= new ImageIcon(new YaoCaiIndex().getClass().getResource(StableFile.yc_2_1_png));  
	public Object[] columnTitle= {StableTag.columnTitle_0, StableTag.columnTitle_1, StableTag.columnTitle_2
			, StableTag.columnTitle_3, StableTag.columnTitle_4, StableTag.columnTitle_5, StableTag.columnTitle_6
			, StableTag.columnTitle_7, StableTag.columnTitle_8, StableTag.columnTitle_9, StableTag.columnTitle_10
			, StableTag.columnTitle_11, StableTag.columnTitle_12, StableTag.columnTitle_13, StableTag.columnTitle_14};
	public CfxTextField name_filter_not_have;
	public Map<String, String> ctr;
	public CfxTextField nameFeelFilter;
	public JScrollPane jsp_name= null;
	public boolean ready= false;
	public App appInstance;
	public ReadChinese readChinese;
	public DetaButton buttonCTV;
	public int lookrot;
	public List<String> tabNames;
	public BufferedImage tempBufferedImage;
	public int �߻���ֵrot;
	public boolean DNASearchIsClick;
	public AppInit_XCDX appInit;
	public String dbConfigPath;
	public boolean bootDBInTXTWay= false;
	public boolean bootDBInBaseWay= false;
	public boolean bootDBInWebWay= false;
	public App_XCDX app_XCDX;
	public JPanel jPanel;
	public JScrollPane jsp_name_filter;
	public JLabel jlabel_filter;
	public JScrollPane jsp_name_filter_not_have;
	public JLabel jlabel_filter_not_have;
	public JLabel risk_filter;
	public JLabel feel_filter;
	public JLabel xingwei_filter;
	public JScrollPane jsp_nameFeelFilter;
	public JLabel jingmai_filter;
	public JLabel zonghe_filter;
	public JLabel shuming_filter;
	public JScrollPane jScrollPane;
	public void init(){
		try {
			StableMapsInitons.init();
			SkinPathDetectTrip_E.initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB5.txt", 5);
			SkinPathDetectTrip_E.initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6.txt", 6);
			SkinPathDetectTrip_E.initDeciphring("C:\\Users\\Lenovo\\Desktop\\deciphering\\F_DB6_17.txt", 17);
			app_XCDX= new App_XCDX();
			app_XCDX.IV_(this);
			appInit= new AppInit_XCDX();
			appInit.IV_(this);
		} catch (IOException e) {
			this.appConfig.SectionJPanel.jTextPane.setText(this.appConfig.SectionJPanel.jTextPane.getText()+ "trap error app");
			//e.printStackTrace();
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
	}

	//����
	@Override
	public void keyReleased(KeyEvent arg0) {
		String zhongyao= StableTag.STRING_EMPTY;
		key= name.getText();
		String forE= key.toLowerCase().toString();
		if(key!= null && !key.replace(StableTag.STRING_SPACE, StableTag.STRING_EMPTY)
				.equals(StableTag.STRING_EMPTY) && key.length()>50) {
			key= key.substring(0, 30);
		}
		if(forE!= null&& !forE.replace(StableTag.STRING_SPACE, StableTag.STRING_EMPTY)
				.equals(StableTag.STRING_EMPTY) && forE.length()>110) {
			forE= forE.substring(0, 110);
		}
		key = key.length()== 0? StableTag.STRING_EMPTY: translator.MixedStringToChineseString(_A, key);
		if(key.replaceAll("\\s+", StableTag.STRING_SPACE).equalsIgnoreCase(StableTag.STRING_SPACE)){
			key=StableTag.STRING_EMPTY;
		}
		zhongyao= key.toString();
		Here:
			for(int i= 0; i< key.length(); i++) {
				if(StableAnnotation.feng.contains(StableTag.STRING_EMPTY+ key.charAt(i))) {
					key+= "��";
					continue Here;
				}
				if(StableAnnotation.han.contains(StableTag.STRING_EMPTY+ key.charAt(i))) {
					key+= "�纮";
					continue Here;
				}
				if(StableAnnotation.hot.contains(StableTag.STRING_EMPTY+ key.charAt(i))) {
					key+= "����";
					continue Here;
				}
				if(StableAnnotation.shi.contains(StableTag.STRING_EMPTY+ key.charAt(i))) {
					key+= "��ʪ";
					continue Here;
				}
				if(StableAnnotation.huo.contains(StableTag.STRING_EMPTY+ key.charAt(i))) {
					key+= "��";
					continue Here;
				}
				if(StableAnnotation.zao.contains(StableTag.STRING_EMPTY+ key.charAt(i))) {
					key+= "��";
					continue Here;
				}
				if(StableAnnotation.liuYin.contains(StableTag.STRING_EMPTY+ key.charAt(i))) {
					key+= "����";
					continue Here;
				}
				if(StableAnnotation.qiQing.contains(StableTag.STRING_EMPTY+ key.charAt(i))) {
					key+= "����";
					continue Here;
				}
				if(StableAnnotation.wangYang.contains(StableTag.STRING_EMPTY+ key.charAt(i))) {
					key+= "����";
					continue Here;
				}
				if(StableAnnotation.wangYin.contains(StableTag.STRING_EMPTY+ key.charAt(i))) {
					key+= "����";
					continue Here;
				}
				if(StableAnnotation.jiBaoShiChang.contains(StableTag.STRING_EMPTY+ key.charAt(i))) {
					key+= "����ʧ��";
					continue Here;
				}
				if(StableAnnotation.yinShiBuJie.contains(StableTag.STRING_EMPTY+ key.charAt(i))) {
					key+= "��ʳ����";
					continue Here;
				}
				if(StableAnnotation.tiaoShiPianShe.contains(StableTag.STRING_EMPTY+ key.charAt(i))) {
					key+= "��ʳƫʳ";
					continue Here;
				}
				if(StableAnnotation.biaoHan.contains(StableTag.STRING_EMPTY+ key.charAt(i))) {
					key+= "��";
					continue Here;
				}
				if(StableAnnotation.biaoRe.contains(StableTag.STRING_EMPTY+ key.charAt(i))) {
					key+= "����";
					continue Here;
				}
				if(StableAnnotation.yuXue.contains(StableTag.STRING_EMPTY+ key.charAt(i))) {
					key+= "��";
				}
			}
		if(xynkPage!= null) {
			this.xynkPage.key= zhongyao.toString();
			this.xynkPage.keyReleased(null);
		}
		if(zynkxPage!= null) {
			this.zynkxPage.key= zhongyao.toString();
			this.zynkxPage.keyReleased(null);
		}
		if(zyzdxPage!= null) {
			this.zyzdxPage.key= zhongyao.toString();
			this.zyzdxPage.keyReleased(null);
		}
		if(fyydPage!= null) {
			this.fyydPage.key= zhongyao.toString();
			this.fyydPage.keyReleased(null);
		}
		if(fqzPage!= null) {
			this.fqzPage.key= zhongyao.toString();
			this.fqzPage.keyReleased(null);
		}
		if(fckxPage!= null) {
			this.fckxPage.key= zhongyao.toString();
			this.fckxPage.keyReleased(null);
		}
		if(jzkxPage!= null) {
			this.jzkxPage.key= zhongyao.toString();
			this.jzkxPage.keyReleased(null);
		}
		if(wkxPage!= null) {
			this.wkxPage.key= zhongyao.toString();
			this.wkxPage.keyReleased(null);
		}
		if(wskxPage!= null) {
			this.wskxPage.key= zhongyao.toString();
			this.wskxPage.keyReleased(null);
		}
		if(xyscPage!= null) {
			this.xyscPage.key= zhongyao.toString();
			this.xyscPage.keyReleased(null);
		}
		if(editPane!= null) {
			this.editPane.key= zhongyao.toString();
			this.editPane.keyReleased(null);
		}
		for(int i= 0; i< this.searchList.size(); i++) {
			try {
				searchList.get(i).AOP_VEC_SQ(null, zhongyao.toString());
			} catch (IOException e) {
				System.out.println("error");
			}
		}

		Translator ts= new Translator_E();
		try {
			ts.IV_(_A);
		} catch (IOException e) {
		} 
		List<Verbal> verbals= ts.index(_A, forE);
		if(cecil!= null) {
			this.cecil.verbals= verbals;
			this.cecil.keyReleased(null);
		}
		new ZhongYaoSearch().zhongYaoSearch(this, zhongyao, forE, key);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		//if(arg0.getID())
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(zonghe_filter_box.isSelected()) {
			for(int i = 0; i < newTableModel.getRowCount(); i++){
				for(int j = 0; j < newTableModel.getRowCount(); j++){
					if(i!= j) {
						if(newTableModel.getValueAt(i, 5).toString()
								.contains(newTableModel.getValueAt(j, 2).toString())) {
							newTableModel.removeRow(j);
							j-= 1;
						}
					}
				}
			}
			newTableModel.fireTableDataChanged();
		}else {
			this.keyReleased(null);;
		}
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		if(null!= soundWaveJPanel) {
			soundWaveJPanel.reg= 0;
			if(null!= soundWaveJPanel.waveJpanel) {
				soundWaveJPanel.waveJpanel.reg= 0;	
			}
			this.validate();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				this.validate();
			}
		}
	}
}