package OSI.OPE.OEI.PVI.SOI.SMQ.load;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import SVQ.stable.StableAnnotation;
import SVQ.stable.StableToken;
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
						if(ctempString.contains(StableToken.ETL_SYMBOL_PER)&& ctempString.split(StableToken.ETL_SYMBOL_PER).length>1) {
							currentNodeMap.put(ctempString.split(StableToken.ETL_SYMBOL_PER)[0]//读表分隔符号与tinshell指令分割冲突，准备采用元基础加密换算。
									, ctempString.replace(ctempString.split(StableToken.ETL_SYMBOL_PER)[0]+ StableToken.ETL_SYMBOL_PER, ""));
						}
					}
				}else {
					LinkNode node= new LinkNode();
					node.beconnect= currentNodeMap.containsKey(StableToken.ETL_BECONNECT)
							? currentNodeMap.get(StableToken.ETL_BECONNECT).contains(StableToken.ETL_SYMBOL_FALSE)
									? false: true: false;
					node.dBeconnect= currentNodeMap.containsKey(StableToken.ETL_DBECONNECT)
							? currentNodeMap.get(StableToken.ETL_DBECONNECT).contains(StableToken.ETL_SYMBOL_FALSE)
									? false: true: false;
					node.dBeconnectID= currentNodeMap.containsKey(StableToken.ETL_DBECONNECT_ID)
							?Integer.parseInt(currentNodeMap.get(StableToken.ETL_DBECONNECT_ID)):0;
					node.dBeconnectPrimaryKey= currentNodeMap.containsKey
							(StableToken.ETL_DBECONNECT_PRIMARY_KEY)?currentNodeMap.get
									(StableToken.ETL_DBECONNECT_PRIMARY_KEY):StableToken.ETL_SYMBOL_NULL;
					node.dBeconnectX= currentNodeMap.containsKey(StableToken.ETL_DBECONNECT_X)
							? Integer.parseInt(currentNodeMap.get(StableToken.ETL_DBECONNECT_X)):0;
					node.dBeconnectY= currentNodeMap.containsKey(StableToken.ETL_DBECONNECT_Y)
							? Integer.parseInt(currentNodeMap.get(StableToken.ETL_DBECONNECT_Y)):0;
					node.dBeconnectName= currentNodeMap.containsKey(StableToken.ETL_DBECONNECT_NAME)
							? currentNodeMap.get(StableToken.ETL_DBECONNECT_NAME):StableToken.ETL_SYMBOL_NULL;
					node.flash= currentNodeMap.containsKey(StableToken.ETL_FLASH)
							? Integer.parseInt(currentNodeMap.get(StableToken.ETL_FLASH)):0;
					node.ID= currentNodeMap.containsKey(StableToken.ETL_NODE_ID)
							? Integer.parseInt(currentNodeMap.get(StableToken.ETL_NODE_ID)):0;
					node.leftChoose= currentNodeMap.containsKey(StableToken.ETL_LEFT_CHOOSE)
							? currentNodeMap.get(StableToken.ETL_LEFT_CHOOSE).contains(StableToken.ETL_SYMBOL_FALSE)
									? false: true: false;
					node.mBeconnect= currentNodeMap.containsKey(StableToken.ETL_MBECONNECT)
							? currentNodeMap.get(StableToken.ETL_MBECONNECT).contains(StableToken.ETL_SYMBOL_FALSE)
									? false: true: false;
					node.mBeconnectID= currentNodeMap.containsKey(StableToken.ETL_MBECONNECT_ID)
							? Integer.parseInt(currentNodeMap.get(StableToken.ETL_MBECONNECT_ID)):0;
					node.mBeconnectPrimaryKey= currentNodeMap.containsKey
							(StableToken.ETL_MBECONNECT_PRIMARY_KEY)? currentNodeMap.get
									(StableToken.ETL_MBECONNECT_PRIMARY_KEY):StableToken.ETL_SYMBOL_NULL;
					node.mBeconnectX= currentNodeMap.containsKey(StableToken.ETL_MBECONNECT_X)
							? Integer.parseInt(currentNodeMap.get(StableToken.ETL_MBECONNECT_X)):0;
					node.mBeconnectY= currentNodeMap.containsKey(StableToken.ETL_MBECONNECT_Y)
							? Integer.parseInt(currentNodeMap.get(StableToken.ETL_MBECONNECT_Y)):0;
					node.mBeconnectName= currentNodeMap.containsKey(StableToken.ETL_MBECONNECT_NAME)
							?currentNodeMap.get(StableToken.ETL_MBECONNECT_NAME):StableToken.ETL_SYMBOL_NULL;
					node.name= currentNodeMap.containsKey(StableToken.ETL_NODE_NAME)
							?currentNodeMap.get(StableToken.ETL_NODE_NAME):StableToken.ETL_SYMBOL_NULL;
					node.rightChoose= currentNodeMap.containsKey(StableToken.ETL_RIGHT_CHOOSE)
							? currentNodeMap.get(StableToken.ETL_RIGHT_CHOOSE).contains(StableToken.ETL_SYMBOL_FALSE)
									? false: true: false;
					node.tBeconnect= currentNodeMap.containsKey(StableToken.ETL_TBECONNECT)
							? currentNodeMap.get(StableToken.ETL_TBECONNECT).contains(StableToken.ETL_SYMBOL_FALSE)
									? false: true: false;
					node.tBeconnectID= currentNodeMap.containsKey(StableToken.ETL_TBECONNECT_ID)
							? Integer.parseInt(currentNodeMap.get(StableToken.ETL_TBECONNECT_ID)):0;
					node.tBeconnectPrimaryKey= currentNodeMap.containsKey
							(StableToken.ETL_TBECONNECT_PRIMARY_KEY)? currentNodeMap.get
									(StableToken.ETL_TBECONNECT_PRIMARY_KEY):StableToken.ETL_SYMBOL_NULL;
					node.primaryKey= currentNodeMap.containsKey(StableToken.ETL_PRIMARY_KEY)
							? currentNodeMap.get(StableToken.ETL_PRIMARY_KEY):StableToken.ETL_SYMBOL_NULL;
					node.tBeconnectX= currentNodeMap.containsKey(StableToken.ETL_TBECONNECT_X)
							? Integer.parseInt(currentNodeMap.get(StableToken.ETL_TBECONNECT_X)):0;
					node.tBeconnectY= currentNodeMap.containsKey(StableToken.ETL_TBECONNECT_Y)
							? Integer.parseInt(currentNodeMap.get(StableToken.ETL_TBECONNECT_Y)):0;
					node.tBeconnectName= currentNodeMap.containsKey(StableToken.ETL_TBECONNECT_NAME)
							? currentNodeMap.get(StableToken.ETL_TBECONNECT_NAME):StableToken.ETL_SYMBOL_NULL;
					node.x= currentNodeMap.containsKey(StableToken.ETL_NODE_COORDINATION_X)
							? Integer.parseInt(currentNodeMap.get(StableToken.ETL_NODE_COORDINATION_X)):0;
					node.y= currentNodeMap.containsKey(StableToken.ETL_NODE_COORDINATION_Y)
							? Integer.parseInt(currentNodeMap.get(StableToken.ETL_NODE_COORDINATION_Y)):0;
					node= thislist.addNodeOnlyWithFace(node, nodeView.first);
					node.thisFace.nodeConfiguration= currentNodeMap.containsKey
							(StableToken.ETL_NODE_CONFIGURATION)? currentNodeMap.get(StableToken.ETL_NODE_CONFIGURATION)//元基解密换算，找了下比较费劲，准备把接口拿出来做成sample
									:StableToken.ETL_SYMBOL_NULL;//我在思考是用物理加密还是用dna概率钥匙加密，如果是dna概率钥匙加密我还有新增几个变量来存储钥匙。
					node.thisFace.isConfiged= currentNodeMap.containsKey
							(StableToken.ETL_ISCONFIGED)? currentNodeMap.get(StableToken.ETL_ISCONFIGED)
									.contains(StableToken.ETL_SYMBOL_FALSE)? false: true: false;
					node.thisFace.isExecuted= currentNodeMap.containsKey
							(StableToken.ETL_ISEXECUTED)? currentNodeMap.get(StableToken.ETL_ISEXECUTED)
									.contains(StableToken.ETL_SYMBOL_FALSE)? false: true: false;	
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