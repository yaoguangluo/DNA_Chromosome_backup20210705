package OSI.OPE.OEI.PVI.SOI.SMQ.load;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import SVQ.stable.StableAnnotation;
import OSI.OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.Sort;
import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;
public class LoadFile{
	public static String getOrigianlTextByLock(String inputString, String lockString) {
		String[] lock= new String[12];
		lock[0] = "A"; lock[3] = "O"; lock[6] = "P"; lock[9]  = "M";
		lock[1] = "V"; lock[4] = "E"; lock[7] = "C"; lock[10] = "S";
		lock[2] = "I"; lock[5] = "D"; lock[8] = "U"; lock[11] = "Q";
		StringBuilder stringBuilder= new StringBuilder();
		for(int i= lockString.length(); i< inputString.length(); i+= lockString.length()+ 1) {
			stringBuilder.append(inputString.charAt(i));
		}
		return stringBuilder.toString();
	}
	
	@SuppressWarnings({StableAnnotation.TAG_RESOURCE})
	public static LinkNode Load(LinkNode first, NodeShow nodeView, File file
			, LinkList thislist) {
		//get path
		Map<String, LinkNode> nodeMap= new HashMap<>();
		try {
			InputStream in= new FileInputStream(file);
			BufferedReader cReader= new BufferedReader(new InputStreamReader(in));  
			
			InputStream inKey= new FileInputStream(file.getPath()+ ".dna");
			BufferedReader cReaderKey= new BufferedReader(new InputStreamReader(inKey));  
			
			String ctempString= null; 
			String ctempStringKey= null; 
			Map<String, String> currentNodeMap= new HashMap<>();
			while ((ctempString= cReader.readLine())!= null&& (ctempStringKey= cReaderKey.readLine())!= null ) {  
				if(!ctempString.contains("######################")) {
//					ctempString= new FullDNATokenPDI().initonDeSect(ctempString);//文字变数字再变元基，进行修正。罗瑶光20211106	
//					String lock= "AISD>_<111111111111111>_<11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"
//							+ ">_<1111111111111111>_<10111011101101101110110110110110111011011011101110110110"
//							+ "1101101101101101110110110111011011011011011011011101101101101101101110110111011101";
					//ctempString
					if(!ctempString.isEmpty()) {
						String[] MD5dice_DNA= ctempStringKey.split(">_<");		
						//开始解密
						//这里因为dna加密，概率钥匙不可控，不可逆，变不回来，于是采用简单的锁加密。
						ctempString= LoadFile.getOrigianlTextByLock(ctempString, MD5dice_DNA[0]);
						ctempString= new FullDNATokenPDI().initonDeSect(ctempString);
						if(ctempString.contains(":")&& ctempString.split(":").length>1) {
							currentNodeMap.put(ctempString.split(":")[0]//读表分隔符号与tinshell指令分割冲突，准备采用元基础加密换算。
									, ctempString.replace(ctempString.split(":")[0]+ ":", ""));
						}
					}
				}else {
					LinkNode node= new LinkNode();
					node.beconnect= currentNodeMap.containsKey("beconnect")
							? currentNodeMap.get("beconnect").contains("false")
									? false: true: false;
					node.dBeconnect= currentNodeMap.containsKey("dBeconnect")
							? currentNodeMap.get("dBeconnect").contains("false")
									? false: true: false;
					node.dBeconnectID= currentNodeMap.containsKey("dBeconnectID")
							?Integer.parseInt(currentNodeMap.get("dBeconnectID")):0;
					node.dBeconnectPrimaryKey= currentNodeMap.containsKey
							("dBeconnectPrimaryKey")?currentNodeMap.get
									("dBeconnectPrimaryKey"):"null";
					node.dBeconnectX= currentNodeMap.containsKey("dBeconnectX")
							? Integer.parseInt(currentNodeMap.get("dBeconnectX")):0;
					node.dBeconnectY= currentNodeMap.containsKey("dBeconnectY")
							? Integer.parseInt(currentNodeMap.get("dBeconnectY")):0;
					node.dBeconnetName= currentNodeMap.containsKey("dBeconnetName")
							? currentNodeMap.get("dBeconnetName"):"null";
					node.flash= currentNodeMap.containsKey("flash")
							? Integer.parseInt(currentNodeMap.get("flash")):0;
					node.ID= currentNodeMap.containsKey("NodeID")
							? Integer.parseInt(currentNodeMap.get("NodeID")):0;
					node.leftChoose= currentNodeMap.containsKey("leftChoose")
							? currentNodeMap.get("leftChoose").contains("false")
									? false: true: false;
					node.mBeconnect= currentNodeMap.containsKey("mBeconnect")
							? currentNodeMap.get("mBeconnect").contains("false")
									? false: true: false;
					node.mBeconnectID= currentNodeMap.containsKey("mBeconnectID")
							? Integer.parseInt(currentNodeMap.get("mBeconnectID")):0;
					node.mBeconnectPrimaryKey= currentNodeMap.containsKey
							("mBeconnectPrimaryKey")? currentNodeMap.get
									("mBeconnectPrimaryKey"):"null";
					node.mBeconnectX= currentNodeMap.containsKey("mBeconnectX")
							? Integer.parseInt(currentNodeMap.get("mBeconnectX")):0;
					node.mBeconnectY= currentNodeMap.containsKey("mBeconnectY")
							? Integer.parseInt(currentNodeMap.get("mBeconnectY")):0;
					node.mBeconnetName= currentNodeMap.containsKey("mBeconnetName")
							?currentNodeMap.get("mBeconnetName"):"null";
					node.name= currentNodeMap.containsKey("NodeName")
							?currentNodeMap.get("NodeName"):"null";
					node.rightChoose= currentNodeMap.containsKey("rightChoose")
							? currentNodeMap.get("rightChoose").contains("false")
									? false: true: false;
					node.tBeconnect= currentNodeMap.containsKey("tBeconnect")
							? currentNodeMap.get("tBeconnect").contains("false")
									? false: true: false;
					node.tBeconnectID= currentNodeMap.containsKey("tBeconnectID")
							? Integer.parseInt(currentNodeMap.get("tBeconnectID")):0;
					node.tBeconnectPrimaryKey= currentNodeMap.containsKey
							("tBeconnectPrimaryKey")? currentNodeMap.get
									("tBeconnectPrimaryKey"):"null";
					node.primaryKey= currentNodeMap.containsKey("primaryKey")
							? currentNodeMap.get("primaryKey"):"null";
					node.tBeconnectX= currentNodeMap.containsKey("tBeconnectX")
							? Integer.parseInt(currentNodeMap.get("tBeconnectX")):0;
					node.tBeconnectY= currentNodeMap.containsKey("tBeconnectY")
							? Integer.parseInt(currentNodeMap.get("tBeconnectY")):0;
					node.tBeconnetName= currentNodeMap.containsKey("tBeconnetName")
							? currentNodeMap.get("tBeconnetName"):"null";
					node.x= currentNodeMap.containsKey("NodeCoordinationX")
							? Integer.parseInt(currentNodeMap.get("NodeCoordinationX")):0;
					node.y= currentNodeMap.containsKey("NodeCoordinationY")
							? Integer.parseInt(currentNodeMap.get("NodeCoordinationY")):0;
					node= thislist.addNodeOnlyWithFace(node, nodeView.first);
					node.thisFace.nodeConfiguration= currentNodeMap.containsKey
							("nodeConfiguration")? currentNodeMap.get("nodeConfiguration")//元基解密换算，找了下比较费劲，准备把接口拿出来做成sample
									:"null";//我在思考是用物理加密还是用dna概率钥匙加密，如果是dna概率钥匙加密我还有新增几个变量来存储钥匙。
					node.thisFace.isConfiged= currentNodeMap.containsKey
							("isConfiged")? currentNodeMap.get("isConfiged")
									.contains("false")? false: true: false;
					node.thisFace.isExecuted= currentNodeMap.containsKey
							("isExecuted")? currentNodeMap.get("isExecuted")
									.contains("false")? false: true: false;	
					//增加一个node map 用于 connect链接
					nodeMap.put(node.primaryKey, node);
					if(null== first) {
						first= node;
					}else {
						first.next= node;
						node.pre= first;
						first= first.next;
					}
					currentNodeMap.clear();
				}
			}
		}catch(Exception loadE) {
			loadE.printStackTrace();
		}
		first= Sort.sort(first);
		//避免错序录入，于是增加node链接
		linkNode(first, nodeMap);
		first= Sort.sort(first);
		return first;	
	}
    //似乎被猫腻了。稍后地毯式排查。罗瑶光20211102
	private static void linkNode(LinkNode first, Map<String, LinkNode> nodeMap) {
		// TODO Auto-generated method stub
		while(first!= null) {
			if(first.beconnect) {
				if(first.tBeconnect) {
					first.tNode= nodeMap.get(first.tBeconnectPrimaryKey);
				}
				if(first.mBeconnect) {
					first.mNode= nodeMap.get(first.mBeconnectPrimaryKey);
				}
				if(first.dBeconnect) {
					first.dNode= nodeMap.get(first.dBeconnectPrimaryKey);
				}
			}
			first= first.next;
		}
	}
}