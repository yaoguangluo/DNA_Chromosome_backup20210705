package OSI.OPE.SI.MCI.OEI.OVU.PQE.extOSGI;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.Sort;
public class OSGI_chansfer {
	//增加tin shell output map， 罗瑶光20211008
	public OSGI_chansfer(LinkNode node, LinkNode first){
		first= Sort.sort(first);
		LinkNode linkNode= new LinkNode();
		linkNode= first;
		//节点只有上中下3个input，于是优化成 max=3；
		int max= 0;
		while(null!= linkNode){
			if(node.tBeconnect
					//&&node.tBeconnectID== linkNode.ID
					&&node.tBeconnetName.equals(linkNode.name)
					&& (node.tBeconnectPrimaryKey.equalsIgnoreCase(linkNode.primaryKey))){
				node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.toptablein 
				= linkNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.tableout;//链接是手操作的，在一键链接的时候输出不适用，准备修改成执行后操作，tableout记录
				node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topgin 
				= linkNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.gout;
				node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.topOutput 
				= linkNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut;//准备把执行shellpanel后的 output tinmap 拿出来
				//return; // 涉及多个节点测试
				max++ ;
			}
			if(node.mBeconnect
					//&&node.mBeconnectID== linkNode.ID
					&& node.mBeconnetName.equals(linkNode.name)
					&& (node.mBeconnectPrimaryKey.equalsIgnoreCase(linkNode.primaryKey))){
				node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.midtablein 
				= linkNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.tableout;
				node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.midgin 
				= linkNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.gout;
				node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.midOutput 
				= linkNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut;
				//return;
				max++ ;
			}	
			if(node.dBeconnect
					//&&node.dBeconnectID== linkNode.ID
					&& node.dBeconnetName.equals(linkNode.name)
					&& (node.dBeconnectPrimaryKey.equalsIgnoreCase(linkNode.primaryKey))){
				node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.downtablein 
				= linkNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.tableout;
				node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.downgin 
				= linkNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.gout;
				node.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.downOutput 
				= linkNode.thisFace.SQ_OSU_MSQ_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ.outputOut;
				//return;
				max++ ;
			}	
			if(null== linkNode.next|| 3== max){//以后节点类型多了就重新设计。20211011 罗瑶光
				break;
			}
			linkNode=linkNode.next;
		}
	}
}
