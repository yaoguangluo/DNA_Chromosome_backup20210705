package OSI.OPE.AOPM.VECS.IDUQ.OVU.PQE.flash;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.tree.TreePath;

import ME.APM.VSQ.App;
//import OCI.ME.analysis.C.A;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OSI.OPE.MSQ.OVU.PQE.nodeInfo.NodeInfo;
import OSI.OPE.MSQ.OVU.PQE.nodeProject.NodeProject;
import OSI.OPE.OVQ.MSQ.OVU.PQE.platForm.UnicornJSplitPane;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.U_RelatedLineVPS;

public class GUISample extends JApplet implements MouseMotionListener
, MouseListener, ItemListener, ActionListener, Runnable{	
	private static final long serialVersionUID= 5270675501794340912L;
	public GUISample() {
		getContentPane().setBackground(new Color(255,255,255));
	}
	public Map<String, Object> nodeReflection= new HashMap<>();
	public String fileCurrentpath;
	public int w, h;
	public int flash= 0;
	public int count= 0;
	public String currentNodeName;
	public int currentNodeID;
	public String currentNodePrimaryKey;
	public LinkList first;
	public int currentx, currenty;
	public int choose= 0;
	public int oldx, oldy;
	public int newx, newy;
	public int is_O= 0;
	public String treeNodeName;
	public NodeShow nodeView;
	public NodeProject nodeProject;
	public NodeInfo nodeInfo;
	public UnicornJSplitPane mainSplitPane;
	public UnicornJSplitPane leftSplitPane;
	public UnicornJSplitPane rightSplitPane;
	public UnicornJSplitPane righttopSplitPane;
	public JScrollPane righttopScrollPane;
	public JScrollPane rightdownScrollPane;
	public JScrollPane rightrightScrollPane;
	public JTextPane rightBotJTextPane;
	public ThisCanvas canvas;
	public PopupMenu popupMenu, nodeMenu, itemMenu, engineMenu;
	public MenuItem save, saveAs, delete, load, boot, bootETL, osgis;
	public MenuItem menuItem;
	public MenuItem configre, run, show, dNode, dLine;
	public Thread thread, threadApplet; 
	public JTextPane text;
	public Object[][] tableData_old; 
	public U_RelatedLineVPS updateRelatedLine;
	public App u;
	public CogsBinaryForest_AE _A;
	public Map<String, String> pos;
	public void run() {
		try {
			Thread.sleep(100);
			nodeProject.setBounds(0, 0, leftSplitPane.getWidth()
					, leftSplitPane.getDividerLocation());
			Thread.sleep(1000);
			nodeProject.validate();
			while(true){   
				try{
					Thread.sleep(5000);
					this.validate();
				}catch (InterruptedException e) {}
				this.validate();
			}  
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
	
	public void start(){
		if(thread== null){
			thread=  new Thread(this);
			thread.start();
		}
	}

	public void stop() {
	}

	public void IV_(){
		try {
			new GUISample_XCDX_CreateMap().CreatMap(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		new GUISample_XCDX_Register().Register(this);    //Registrar();
		this.resize(w,h);	
	}

	public void IV_(Object[][] tableData_old,JTextPane text, App u
			, CogsBinaryForest_AE _A, Map<String, String> pos){
		try {
			this.text= text;
			this.tableData_old= tableData_old;
			this.u= u;
			this._A= _A;
			this.pos= pos;
			new GUISample_XCDX_CreateMap().CreatMap(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		new GUISample_XCDX_Register().Register(this);
		this.resize(w,h);	
	}
	public void actionPerformed(ActionEvent arg0) {}
	public void itemStateChanged(ItemEvent arg0) {}
	public void mouseClicked(MouseEvent arg0) {}
	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	public void mousePressed(MouseEvent arg0) {}
	public void mouseReleased(MouseEvent arg0) {
		//TreePath path= nodeView.tree.getPathForLocation(arg0.getX(), arg0.getY());
		TreePath path= nodeView.tree.getSelectionPath();
		if (path != null){
			nodeView.tree.setSelectionPath(path);
			if (3== arg0.getButton()){
			popupMenu.show(nodeView.tree, arg0.getX(), arg0.getY());
			}else {
				//engineMenu.show(canvas, 0, 0);
			}
		}else {
			engineMenu.show(canvas, 0, 0);
		}	
	}
	public void mouseDragged(MouseEvent arg0) {}
	public void mouseMoved(MouseEvent arg0) {}
}
