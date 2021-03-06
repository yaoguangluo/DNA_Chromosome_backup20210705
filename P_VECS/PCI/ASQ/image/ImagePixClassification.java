package PCI.ASQ.image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import PCI.ASQ.demension.AMV_MVS_VSQ_2D;
import PCI.ASQ.demension.AMV_MVS_VSQ_3D;
public class ImagePixClassification{
	//思想：统计与概率论
	//作者：罗瑶光
	//将shareholder分层处理的图片像素数据进行 分类归类统计输出
	public static Map<Integer, ArrayList<AMV_MVS_VSQ_2D>> getImagePixClassificationMap(int[][] pixMap){
		Map<Integer, ArrayList<AMV_MVS_VSQ_2D>> output= new HashMap<>();
		for(int i= 0; i< pixMap.length; i++) {
			for(int j= 0; j< pixMap[0].length; j++) {
				if(pixMap[i][j]> 0) {
					ArrayList<AMV_MVS_VSQ_2D> temp;
					if(output.containsKey(pixMap[i][j])) {
						temp= output.get(pixMap[i][j]);
					}else {
						temp= new ArrayList<>();
					}
					AMV_MVS_VSQ_2D position2D= new AMV_MVS_VSQ_2D(i, j);
					temp.add(position2D);
					output.put(pixMap[i][j], temp);
				}
			}
		}	
		return output;
	}
	
	public static Map<Integer, ArrayList<AMV_MVS_VSQ_3D>> getImagePixClassificationMap(int[][][] pixMap){
		Map<Integer, ArrayList<AMV_MVS_VSQ_3D>> output= new HashMap<>();
		for(int i= 0; i< pixMap.length; i++) {
			for(int j= 0; j< pixMap[0].length; j++) {
				for(int k= 0; k< pixMap[0][0].length; k++) {
					if(pixMap[i][j][k]> 0) {
						ArrayList<AMV_MVS_VSQ_3D> temp;
						if(output.containsKey(pixMap[i][j][k])) {
							temp= output.get(pixMap[i][j][k]);
						}else {
							temp= new ArrayList<>();
						}
						AMV_MVS_VSQ_3D position3D= new AMV_MVS_VSQ_3D(i, j, k);
						temp.add(position3D);
						output.put(pixMap[i][j][k], temp);
					}
				}}
		}	
		return output;
	}
}