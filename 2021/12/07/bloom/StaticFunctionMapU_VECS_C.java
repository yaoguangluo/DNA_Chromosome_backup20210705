package SEM.bloom;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import javax.swing.ImageIcon;
import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;
import OEU.LYG4DQS4D.LYG10DWCMSSort15D_XCDX_C_U_A;
import PEU.S.verbal.VerbalSource;
import SVQ.stable.StableFile;
//����Ȩ��+����= ������
public interface StaticFunctionMapU_VECS_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	@SuppressWarnings({"static-access", "unchecked"})
	public static void callFunction(String callFunctionKey, StaticFunctionMapU_VECS_E staticFunctionMapU_VECS_C, Map<String, Object> output) throws IOException {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		//Map<String, Object> inputValues
		// TODO Auto-generated method stub
		if(callFunctionKey.equalsIgnoreCase("main")) {
			staticFunctionMapU_VECS_C.main(null);//�Ժ�ֳ�ȥ
			output.put("U_VECS_main", "void");//��void�ӿھ�ֱ��put��ȥ���ɡ�
		}
		if(callFunctionKey.equalsIgnoreCase("getMapFromDoubleStringArray")){
			boolean find= false;
			Map<String, Object> inputValues = null;
			//ȡֵ����, �ȼ����һ���ӿ�
			if(null!= output.get("lastInterfaceBackfeed")) {
				if(output.get("lastInterfaceBackfeed").toString().equalsIgnoreCase("success")) {
					String lastInterfaceReturn= (String) output.get("lastInterfaceName");//ȡ ��һ�����нӿ���
					if(null!= lastInterfaceReturn) {
						Map<String, Object> lastReturns= (Map<String, Object>) output.get(lastInterfaceReturn);//ȡ��һ�����нӿڵķ��ؽ����
						inputValues= (Map<String, Object>) lastReturns.get("interfaceReturn");//
						find= true;
					}	
				}
			}
			//�����һ���ӿ��Ƿ�ƥ��;
			if(find) {
				//if(inputValues.containsKey("score")&& inputValues.containsKey("nameScore")) {
				//	find= true;
				//}else {
				//	find= false;
				//}
				for(int i= 0; i< ��������.length; i++) {//��ѵ���� string i++
					if(!inputValues.containsKey(��������[i])){
						find= false;
					}
				}
			}
			//////////////////////////////////////////////////////////////////////////////////////	

			//��������,�ͼ��ȫ�ִ���
			if(!find) {//����һ���ӿ�û�з�������ӿ���Ҫ������ʱ���ͼ��ȫ�ִ���
				inputValues= (Map<String, Object>) output.get("inputValues");//ȡ�洢ֵ
			}
			//����ض���������Ƿ�ƥ��
			if(null!= inputValues) {
				//if(inputValues.containsKey("score")&& inputValues.containsKey("nameScore")) {
				//	find= true;
				//}	
				find= true;
				for(int i= 0; i< ��������.length; i++) {//��ѵ���� string i++
					if(!inputValues.containsKey(��������[i])){
						find= false;
					}
				}
			}//��������Ƴɲ��ģʽ�������ٶȽ���100����ֹ���Ȳ����ǣ�
			/////////////////////////////////////////////////////////////////////////////////////////////////	
			//����Ƿ�������
			if(find) {
				//Double[] score= (Double[])inputValues.get("score"); 
				//String[] nameScore= (String[])inputValues.get("nameScore");	
				//��ʼ����
				map= staticFunctionMapU_VECS_C.getMapFromDoubleStringArray((Double[])inputValues.get(��������[����++]), (String[])inputValues.get(��������[����++]));
			}
			if(find) {
				//�洢����
				Map<String, Object> returnValue= new HashMap<>();
				returnValue.put("interfaceReturn", map);
				//���
				output.put(callFunctionKey, returnValue);
				output.put("lastInterfaceName", callFunctionKey);//�Ժ���Ƴɿ� �����������е�ģʽ��
				output.put("lastInterfaceBackfeed", "success");
			}else {
				output.put("lastInterfaceName", callFunctionKey);
				output.put("lastInterfaceBackfeed", "faild");
			}
			return;
		};//��������ͬ��
		if(callFunctionKey.equalsIgnoreCase("getMapFromIntStringArray")){
			//pre
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.getMapFromIntStringArray((int[])inputValues.get(��������[����++]), (String[])inputValues.get(��������[����++]));
			}
			//post
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
			return;
		};
		if(callFunctionKey.equalsIgnoreCase("getMapFromIntStringArray_ZhongYao")){ //����˼����ô����Ժ���object�Զ�ʶ�� ���Ǿ� int string ����type ������С�����ˡ�
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.getMapFromIntStringArray_ZhongYao((int[])inputValues.get(��������[����++]), (String[])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("arrayToJson")){//java ��Ȼû��ʶ�����Ĵ������͵� ���鷵�غ�����������һ��һ����С������д
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.arrayToJson((Gson)inputValues.get(��������[����++]), (Object[])inputValues.get(��������[����++]));//����˼����ô����Ժ���object�Զ�ʶ�� ���Ǿ� Gson Object ����type ������С�����ˡ�
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("arrayToXml")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.arrayToXml((Gson)inputValues.get(��������[����++]), (Object[])inputValues.get(��������[����++]));//java ��Ȼû��ʶ�����Ĵ������͵� ���鷵�غ�����������һ��һ����С������д
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("arrayToMap")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.arrayToMap((Gson)inputValues.get(��������[����++]), (Object[])inputValues.get(��������[����++]));//java ��Ȼû��ʶ�����Ĵ������͵� ���鷵�غ�����������һ��һ����С������д
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("arrayToVector")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.arrayToVector((Gson)inputValues.get(��������[����++]), (Object[])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("arrayToList")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.arrayToList((Object[])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("arrayToIterator")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.arrayToIterator((Object[])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("arrayToSet")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.arrayToSet((Object[])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("arrayToMatrix")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.arrayToMatrix((Object[])inputValues.get(��������[����++]), (int)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("arrayToMatrix3D")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.arrayToMatrix3D((Object[])inputValues.get(��������[����++]), (int)inputValues.get(��������[����++])
						, (int)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("xlsOrCsvFileToObjectMartix")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.xlsOrCsvFileToObjectMartix((String)inputValues.get(��������[����++]), (int)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("xlsOrCsvFileToListObject")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.xlsOrCsvFileToListObject((String)inputValues.get(��������[����++]), (int)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("xlsOrCsvFileToRangedListObject")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.xlsOrCsvFileToRangedListObject((String)inputValues.get(��������[����++]), (int)inputValues.get(��������[����++])
						,(Map<Integer, Boolean>)inputValues.get(��������[����++]),(Map<Integer, Boolean>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("xlsOrCsvFileToRangedObjectMartix")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.xlsOrCsvFileToRangedObjectMartix((String)inputValues.get(��������[����++]), (int)inputValues.get(��������[����++])
						, ( Map<Integer, Boolean>)inputValues.get(��������[����++]), (Map<Integer, Boolean>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("dateToGMTString")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.dateToGMTString((Date)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("dateToYYYYMMDD")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.dateToYYYYMMDD((Date)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("dateToHHMMSS")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.dateToHHMMSS((Date)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("dateToMiliSeconds")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.dateToMiliSeconds((Date)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getCurrentMiliSeconds")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.getCurrentMiliSeconds((Date)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("dateToTimeStamp")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.dateToTimeStamp((Date)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("timeStampToMiliSeconds")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.timeStampToMiliSeconds((Timestamp)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("timeStampToMiliSecondsWithSize")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.timeStampToMiliSecondsWithSize((Timestamp)inputValues.get(��������[����++]), (int)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("dateStringToMiliSeconds")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.dateStringToMiliSeconds((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("hashTableToJson")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.hashTableToJson((Gson)inputValues.get(��������[����++]), (Hashtable<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("hashTableToXml")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.hashTableToXml((Gson)inputValues.get(��������[����++]), (Hashtable<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("hashTableToList")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.hashTableToList((Gson)inputValues.get(��������[����++]), (Hashtable<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("hashTableToObjectArray")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.hashTableToObjectArray((Gson)inputValues.get(��������[����++]), (Hashtable<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getJson")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.getJson((String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("postXML")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.postXML((String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("postJsonWithSercurity")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.postJsonWithSercurity((String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("postXMLWithSercurity")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.postXMLWithSercurity((String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("getHTML")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.getHTML((String)inputValues.get(��������[����++]), (Object[])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("pixTableToFile")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_VECS_C.pixTableToFile((String)inputValues.get(��������[����++]), (int[][])inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("pixRGBTableToFile")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_VECS_C.pixRGBTableToFile((String)inputValues.get(��������[����++]), (int[][])inputValues.get(��������[����++])
						, (int[][])inputValues.get(��������[����++]), (int[][])inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("bufferedImageToFile")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_VECS_C.bufferedImageToFile((String)inputValues.get(��������[����++]), (BufferedImage)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("imageToFile")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_VECS_C.imageToFile((String)inputValues.get(��������[����++]), (BufferedImage)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("bufferedImageToScaleImageFile")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_VECS_C.bufferedImageToScaleImageFile((String)inputValues.get(��������[����++]), (BufferedImage)inputValues.get(��������[����++])
						, (String)inputValues.get(��������[����++]), (int)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("waveImageFileToArrayWithBlack")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.waveImageFileToArrayWithBlack((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("waveImageToArrayWithBlack")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.waveImageToArrayWithBlack((BufferedImage)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("waveImageToArrayWithColor")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.waveImageToArrayWithColor((BufferedImage)inputValues.get(��������[����++]), (int)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("waveImageFileToArrayWithColor")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.waveImageFileToArrayWithColor((String)inputValues.get(��������[����++]), (int)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("waveImageFileToArrayMapWithBlack")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.waveImageFileToArrayMapWithBlack((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("waveImageToArrayMapWithBlack")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.waveImageToArrayMapWithBlack((BufferedImage)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("toolkitImageIconToBufferImage")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.toolkitImageIconToBufferImage((int)inputValues.get(��������[����++]), (int)inputValues.get(��������[����++])
						, (ImageIcon)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("toolkitImageToBufferImage")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.toolkitImageToBufferImage((Image)inputValues.get(��������[����++]), (int)inputValues.get(��������[����++])
						, (int)inputValues.get(��������[����++]), (int)inputValues.get(��������[����++]), (int)inputValues.get(��������[����++]), (ImageObserver)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("toolkitImageToBufferImageAboutIconConfig")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.toolkitImageToBufferImageAboutIconConfig((Image)inputValues.get(��������[����++]), (int)inputValues.get(��������[����++])
						, (int)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("iteratorToJsonString")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.iteratorToJsonString((Gson)inputValues.get(��������[����++]), (Iterator<Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("stringIteratorToJsonString")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.stringIteratorToJsonString((Gson)inputValues.get(��������[����++]), (Iterator<String>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("iteratorToXml")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.iteratorToXml((Gson)inputValues.get(��������[����++]), (Iterator<Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("iteratorToMap")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.iteratorToMap((Gson)inputValues.get(��������[����++]), (Iterator<Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("iteratorToObjectArray")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.iteratorToObjectArray((Gson)inputValues.get(��������[����++]), (Iterator<Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("iteratorToList")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.iteratorToList((Gson)inputValues.get(��������[����++]), (Iterator<Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("jsonArrayToList")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.jsonArrayToList((JSONArray)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("jsonObjectToString")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.jsonObjectToString((JSONObject)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("jsonObjectToHashtable")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.jsonObjectToHashtable((Gson)inputValues.get(��������[����++]), (JSONObject)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("jsonObjectToXml")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.jsonObjectToXml((JSONObject)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("listToJsonString")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.listToJsonString((Gson)inputValues.get(��������[����++]), (List<Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("stringListToJsonString")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.stringListToJsonString((Gson)inputValues.get(��������[����++]), (List<String>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("listToXml")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.listToXml((Gson)inputValues.get(��������[����++]), (List<Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("listToMap")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.listToMap((Gson)inputValues.get(��������[����++]), (List<Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("listToObjectArray")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.listToObjectArray((List<Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("stringlistToStringArray")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.stringlistToStringArray((List<String>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("listToIterator")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.listToIterator((List<Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("listToVector")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.listToVector((List<Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("listToSet")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.listToSet((List<Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("listToArray")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.listToArray((List<String>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("mapToList")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.mapToList((Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("mapToHash")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.mapToHash((Map<String, Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("sort")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.sort((double[])inputValues.get(��������[����++]), (int)inputValues.get(��������[����++]), (int)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("xmlToList")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.xmlToList((String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("xmlToVector")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.xmlToVector((String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("xmlToSets")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.xmlToSets((String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("xmlToHashtable")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.xmlToHashtable((String)inputValues.get(��������[����++]), (Gson)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("txtFileToObjectMatrix")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.txtFileToObjectMatrix((String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("txtFileToObjectMatrixWithRange")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.txtFileToObjectMatrixWithRange((String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++])
						, (int)inputValues.get(��������[����++]), (int)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("txtFileToListStringWithRange")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.txtFileToListStringWithRange((String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++])
						, (int)inputValues.get(��������[����++]), (int)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("txtFileToListString")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.txtFileToListString((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("txtFileToListStringArray")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.txtFileToListStringArray((String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("vectorToMap")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.vectorToMap((Vector<Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("vectorToList")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.vectorToList((Vector<Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("vectorToArray")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.vectorToArray((Vector<Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("vectorToIterator")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.vectorToIterator((Vector<Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("vectorToJsonString")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.vectorToJsonString((Gson)inputValues.get(��������[����++]), (Vector<Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("vectorToSet")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.vectorToSet((Vector<Object>)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("stringBuilderToCharArray")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.stringBuilderToCharArray((StringBuilder)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("stringBuilderToString")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.stringBuilderToString((StringBuilder)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("stringBuilderToJson")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.stringBuilderToJson((Gson)inputValues.get(��������[����++]), (StringBuilder)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("stringBuilderToXml")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.stringBuilderToXml((Gson)inputValues.get(��������[����++]), (StringBuilder)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("stringBuilderToSplitArray")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.stringBuilderToSplitArray((String)inputValues.get(��������[����++]), (StringBuilder)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("stringBuilderToMap")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.stringBuilderToMap((Gson)inputValues.get(��������[����++]), (StringBuilder)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("stringToArray")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.stringToArray((String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("stringArrayToString")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.stringArrayToString((String[])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("stringToURIencode")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.stringToURIencode((String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("stringToURIencode")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.stringToURIencode((String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("uRIencodeToURIdecode")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.uRIencodeToURIdecode((String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("uRIencodeToURIdecode")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.uRIencodeToURIdecode((String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("stringToCharASCII")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.stringToCharASCII((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("charsetSwap")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.charsetSwap((String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]), (String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("objectToJsonString")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.objectToJsonString((Gson)inputValues.get(��������[����++]), (Object[])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("matrixShiftSwapXYZ")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.matrixShiftSwapXYZ((Object[][][])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("matrixInclineSwapXY")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.matrixInclineSwapXY((Object[][][])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("matrixInclineSwapXZ")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.matrixInclineSwapXZ((Object[][][])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("matrixInclineSwapYZ")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.matrixInclineSwapYZ((Object[][][])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("matrixReverseSwap")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.matrixReverseSwap((Object[][][])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("matrixReverseSwapXY")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.matrixReverseSwapXY((Object[][][])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("matrixReverseSwapXZ")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.matrixReverseSwapXZ((Object[][][])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("matrixReverseSwapYZ")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.matrixReverseSwapYZ((Object[][][])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("matrixToArray")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.matrixToArray((Object[][][])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("matrixInclineSwap")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.matrixInclineSwap((Object[][])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("matrixPostSwap")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.matrixPostSwap((Object[][])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("matrixInSwap")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.matrixInSwap((Object[][])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("matrixReverseSwap")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.matrixReverseSwap((Object[][][])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("matrixToArray")){
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_VECS_C.matrixToArray((Object[][][])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};	
	}

	public static void load(StaticFunctionMapU_VECS_E staticFunctionMapU_VECS_E) {
		// TODO Auto-generated method stub
		StaticFunctionMapU_VECS_C.annotationMap.put("main", "main");//ע��һ��main�ӿ�
		StaticFunctionMapU_VECS_C.annotationMap.put("getMapFromDoubleStringArray", "score:nameScore");//ע��һ��main�ӿ�
		StaticFunctionMapU_VECS_C.annotationMap.put("getMapFromIntStringArray", "score:nameScore");
		StaticFunctionMapU_VECS_C.annotationMap.put("getMapFromIntStringArray_ZhongYao", "score:nameScore");
		StaticFunctionMapU_VECS_C.annotationMap.put("arrayToJson", "gson:object");
		StaticFunctionMapU_VECS_C.annotationMap.put("arrayToXml", "gson:object");
		StaticFunctionMapU_VECS_C.annotationMap.put("arrayToMap", "gson:objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("arrayToVector", "gson:objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("arrayToList", "gson:objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("arrayToIterator", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("arrayToSet", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("arrayToMatrix", "objects:widthRange");
		StaticFunctionMapU_VECS_C.annotationMap.put("arrayToMatrix3D", "objects:widthRange:heightRange");
		StaticFunctionMapU_VECS_C.annotationMap.put("xlsOrCsvFileToObjectMartix", "filePath:pageSheetIndex");
		StaticFunctionMapU_VECS_C.annotationMap.put("xlsOrCsvFileToListObject", "filePath:pageSheetIndex");
		StaticFunctionMapU_VECS_C.annotationMap.put("xlsOrCsvFileToRangedListObject", "filePath:pageSheetIndex:rows:culumns");
		StaticFunctionMapU_VECS_C.annotationMap.put("xlsOrCsvFileToRangedObjectMartix", "filePath:pageSheetIndex:rows:culumns");
		StaticFunctionMapU_VECS_C.annotationMap.put("dateToGMTString", "date");
		StaticFunctionMapU_VECS_C.annotationMap.put("dateToYYYYMMDD", "date");
		StaticFunctionMapU_VECS_C.annotationMap.put("dateToHHMMSS", "date");
		StaticFunctionMapU_VECS_C.annotationMap.put("dateToMiliSeconds", "date");
		StaticFunctionMapU_VECS_C.annotationMap.put("getCurrentMiliSeconds", "date");
		StaticFunctionMapU_VECS_C.annotationMap.put("dateToTimeStamp", "date");
		StaticFunctionMapU_VECS_C.annotationMap.put("timeStampToMiliSeconds", "timestamp");
		StaticFunctionMapU_VECS_C.annotationMap.put("timeStampToMiliSecondsWithSize", "timestamp:size");
		StaticFunctionMapU_VECS_C.annotationMap.put("dateStringToMiliSeconds", "string");
		StaticFunctionMapU_VECS_C.annotationMap.put("hashTableToJson", "gson:hashtable");
		StaticFunctionMapU_VECS_C.annotationMap.put("hashTableToXml", " gson:hashtable");
		StaticFunctionMapU_VECS_C.annotationMap.put("hashTableToList", "gson:hashtable");
		StaticFunctionMapU_VECS_C.annotationMap.put("hashTableToObjectArray", "gson:hashtable");
		StaticFunctionMapU_VECS_C.annotationMap.put("getJson", "urlString:jsonString");
		StaticFunctionMapU_VECS_C.annotationMap.put("postXML", "urlString:XMLString");
		StaticFunctionMapU_VECS_C.annotationMap.put("postJsonWithSercurity", "urlString:jsonString");
		StaticFunctionMapU_VECS_C.annotationMap.put("postXMLWithSercurity", "urlString:XMLString");
		StaticFunctionMapU_VECS_C.annotationMap.put("getHTML", "urlString:object");
		StaticFunctionMapU_VECS_C.annotationMap.put("pixTableToFile", "pngOutputPath:pix:fileType");
		StaticFunctionMapU_VECS_C.annotationMap.put("pixRGBTableToFile", "pngOutputPath:pixRed:pixGreen:pixBlue:fileType");
		StaticFunctionMapU_VECS_C.annotationMap.put("bufferedImageToFile", "pngOutputPath:bufferedImage:fileType");
		StaticFunctionMapU_VECS_C.annotationMap.put("imageToFile", "pngOutputPath:image:fileType");
		StaticFunctionMapU_VECS_C.annotationMap.put("bufferedImageToScaleImageFile", "pngOutputPath:bufferedImage:fileType:scale");
		StaticFunctionMapU_VECS_C.annotationMap.put("waveImageFileToArrayWithBlack", "FilePath");
		StaticFunctionMapU_VECS_C.annotationMap.put("waveImageToArrayWithBlack", "bufferedImage");
		StaticFunctionMapU_VECS_C.annotationMap.put("waveImageToArrayWithColor", "bufferedImage:colorRange");
		StaticFunctionMapU_VECS_C.annotationMap.put("waveImageFileToArrayWithColor", "FilePath:colorRange");
		StaticFunctionMapU_VECS_C.annotationMap.put("waveImageFileToArrayMapWithBlack", "FilePath");
		StaticFunctionMapU_VECS_C.annotationMap.put("waveImageToArrayMapWithBlack", "bufferedImage");
		StaticFunctionMapU_VECS_C.annotationMap.put("toolkitImageIconToBufferImage", "positionX:positionY:imageIcon");
		StaticFunctionMapU_VECS_C.annotationMap.put("toolkitImageToBufferImage", "image:positionX:positionY:width:height:imageObserver");
		StaticFunctionMapU_VECS_C.annotationMap.put("toolkitImageToBufferImageAboutIconConfig", "image:positionX:positionY");
		
		StaticFunctionMapU_VECS_C.annotationMap.put("iteratorToJsonString", "gson:iterator");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringIteratorToJsonString", "gson:iterator");
		StaticFunctionMapU_VECS_C.annotationMap.put("iteratorToXml", "gson:iterator");
		StaticFunctionMapU_VECS_C.annotationMap.put("iteratorToMap", "gson:iterator");
		StaticFunctionMapU_VECS_C.annotationMap.put("iteratorToObjectArray", "gson:iterator");
		StaticFunctionMapU_VECS_C.annotationMap.put("iteratorToList", "gson:iterator");
		StaticFunctionMapU_VECS_C.annotationMap.put("jsonArrayToList", "jSONArray");
		StaticFunctionMapU_VECS_C.annotationMap.put("jsonObjectToString", "jSONArray");
		StaticFunctionMapU_VECS_C.annotationMap.put("jsonObjectToHashtable", "gson:jSONObject");
		StaticFunctionMapU_VECS_C.annotationMap.put("jsonObjectToXml", "jSONObject");
		StaticFunctionMapU_VECS_C.annotationMap.put("listToJsonString", "gson:list");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringListToJsonString", "gson:list");
		StaticFunctionMapU_VECS_C.annotationMap.put("listToXml", "gson:list");
		StaticFunctionMapU_VECS_C.annotationMap.put("listToMap", "gson:list");
		StaticFunctionMapU_VECS_C.annotationMap.put("listToObjectArray", "gson:list");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringlistToStringArray", "gson:list");
		StaticFunctionMapU_VECS_C.annotationMap.put("listToIterator", "gson:list");
		StaticFunctionMapU_VECS_C.annotationMap.put("listToVector", "gson:list");
		StaticFunctionMapU_VECS_C.annotationMap.put("listToSet", "gson:list");
		StaticFunctionMapU_VECS_C.annotationMap.put("listToArray", "gson:list");
		
		StaticFunctionMapU_VECS_C.annotationMap.put("mapToList", "map");
		StaticFunctionMapU_VECS_C.annotationMap.put("mapToHash", "map");
		StaticFunctionMapU_VECS_C.annotationMap.put("sort", "array:range:deeps");
		StaticFunctionMapU_VECS_C.annotationMap.put("xmlToList", "string:key");
		StaticFunctionMapU_VECS_C.annotationMap.put("xmlToVector", "string:key");
		StaticFunctionMapU_VECS_C.annotationMap.put("xmlToSets", "string:key");
		StaticFunctionMapU_VECS_C.annotationMap.put("xmlToHashtable", "xmlString:gson");
		StaticFunctionMapU_VECS_C.annotationMap.put("txtFileToObjectMatrix", "filePath:stopBy");
		StaticFunctionMapU_VECS_C.annotationMap.put("txtFileToObjectMatrixWithRange", "filePath:stopBy:rangeBegin:rangeEnd");
		StaticFunctionMapU_VECS_C.annotationMap.put("txtFileToListStringWithRange", "filePath:stopBy:rangeBegin:rangeEnd");
		StaticFunctionMapU_VECS_C.annotationMap.put("txtFileToListString", "filePath");
		StaticFunctionMapU_VECS_C.annotationMap.put("txtFileToListStringArray", "filePath, String stopBy");
		StaticFunctionMapU_VECS_C.annotationMap.put("vectorToMap", "vector");
		StaticFunctionMapU_VECS_C.annotationMap.put("vectorToList", "vector");
		StaticFunctionMapU_VECS_C.annotationMap.put("vectorToArray", "vector");
		StaticFunctionMapU_VECS_C.annotationMap.put("vectorToIterator", "vector");
		StaticFunctionMapU_VECS_C.annotationMap.put("vectorToJsonString", "vector");
		StaticFunctionMapU_VECS_C.annotationMap.put("vectorToSet", "vector");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringBuilderToCharArray", "stringBuilder");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringBuilderToString", "stringBuilder");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringBuilderToJson", "gson:stringBuilder");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringBuilderToXml", "gson:stringBuilder");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringBuilderToSplitArray", "stopBy:stringBuilder");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringBuilderToMap", "gson:stringBuilder");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringToArray", "stopBy:string");
		
		StaticFunctionMapU_VECS_C.annotationMap.put("stringArrayToString", "strings");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringToURIencode", "string:encoding");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringToURIencode", "string");
		StaticFunctionMapU_VECS_C.annotationMap.put("uRIencodeToURIdecode", "string");
		StaticFunctionMapU_VECS_C.annotationMap.put("stringToCharASCII", "string");
		StaticFunctionMapU_VECS_C.annotationMap.put("charsetSwap", "string:inputCharset:outputCharset");
		StaticFunctionMapU_VECS_C.annotationMap.put("objectToJsonString", "gson:object");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixShiftSwapXYZ", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixInclineSwapXY", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixInclineSwapXZ", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixInclineSwapYZ", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixReverseSwap", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixReverseSwapXY", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixReverseSwapXZ", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixReverseSwapYZ", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixToArray", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixInclineSwap", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixPostSwap", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixInSwap", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixReverseSwap", "objects");
		StaticFunctionMapU_VECS_C.annotationMap.put("matrixToArray", "objects");	
	}
	//Double_ESU
	public Map<Double, Map<String, Boolean>> getMapFromDoubleStringArray(Double[] score, String[] nameScore);
	public Map<Integer, Map<String, Boolean>> getMapFromIntStringArray(int[] score, String[] nameScore);
	//�Ժ󲢵�int array ���ļ���
	public Map<Integer, Map<String, Boolean>> getMapFromIntStringArray_ZhongYao(int[] score, String[] nameScore);

	//Array_ESU
	public String arrayToJson(Gson gson, Object[] object);
	public String arrayToXml(Gson gson, Object[] object);
	public Map<String, Object> arrayToMap(Gson gson, Object[] objects);
	public Vector<Object> arrayToVector(Gson gson, Object[] objects);
	public List<Object> arrayToList(Object[] objects);
	public Iterator<Object> arrayToIterator(Object[] objects);
	public Set<Object> arrayToSet(Object[] objects);
	public Object[][] arrayToMatrix(Object[] objects, int widthRange);
	public Object[][][] arrayToMatrix3D(Object[] objects, int widthRange, int heightRange);

	//CSV_ESU{
	public Object[][] xlsOrCsvFileToObjectMartix(String filePath, int pageSheetIndex) throws IOException;
	public List<Object[]> xlsOrCsvFileToListObject(String filePath, int pageSheetIndex) throws IOException;
	public List<Object[]> xlsOrCsvFileToRangedListObject(String filePath, int pageSheetIndex, Map<Integer, Boolean> rows
			, Map<Integer, Boolean> culumns) throws IOException;
	public Object[][] xlsOrCsvFileToRangedObjectMartix(String filePath, int pageSheetIndex, Map<Integer, Boolean> rows
			, Map<Integer, Boolean> culumns) throws IOException;

	//Date_ESU
	public String dateToGMTString(Date date);
	public String dateToYYYYMMDD(Date date);
	public String dateToHHMMSS(Date date);
	public String dateToMiliSeconds(Date date);
	public String getCurrentMiliSeconds(Date date);
	public Timestamp dateToTimeStamp(Date date);
	public long timeStampToMiliSeconds(Timestamp timestamp);
	public String timeStampToMiliSecondsWithSize(Timestamp timestamp, int size);	
	public String dateStringToMiliSeconds(String string);

	//Hash_ESU
	public String hashTableToJson(Gson gson, Hashtable<String, Object> hashtable);
	public String hashTableToXml(Gson gson, Hashtable<String, Object> hashtable);
	public List<Object> hashTableToList(Gson gson, Hashtable<String, Object> hashtable);
	public Object[] hashTableToObjectArray(Gson gson, Hashtable<String, Object> hashtable);

	// HttpUnicode{
	//�������������ȥ�꿪�����з��������ʱ���ѩ�����վ����ץ���ݣ�������GBK 
	//utf-8 gb2312 ascii �ȸ�ʽ���ݱȽϻ��ң����ǽ���ͳһ��ʽ����
	public String getJson(String urlString, String jsonString) throws IOException;
	public String postXML(String urlString,String XMLString) throws IOException;
	public String postJsonWithSercurity(String urlString, String jsonString) throws IOException;
	public String postXMLWithSercurity(String urlString, String XMLString)throws IOException;
	public String getHTML(String urlString, Object object) throws IOException;

	//Image_ESU
	public void pixTableToFile(String pngOutputPath, int[][] pix, String fileType) throws IOException;
	public void pixRGBTableToFile(String pngOutputPath, int[][] pixRed, int[][] pixGreen, int[][] pixBlue, String fileType)
			throws IOException;
	public void bufferedImageToFile(String pngOutputPath, BufferedImage bufferedImage, String fileType) throws IOException;
	public void imageToFile(String pngOutputPath, Image image, String fileType)throws IOException;
	public void bufferedImageToScaleImageFile(String pngOutputPath, BufferedImage bufferedImage, String fileType
			, int scale) throws IOException;

	//ImageToList 
	//�ú������ڹ��еȲ���ͼƬ�ļ�ת�������顣
	public List<Integer> waveImageFileToArrayWithBlack(String FilePath) throws IOException;
	//�ú������ڹ��еȲ��λ���ת�������顣
	public List<Integer> waveImageToArrayWithBlack(BufferedImage bufferedImage);
	//�ú������ڹ��еȲ��λ���ת�������顣����������ɫ����
	public List<Integer> waveImageToArrayWithColor(BufferedImage bufferedImage, int colorRange);
	//�ú������ڹ��еȲ���ͼƬ�ļ�ת�������顣����������ɫ����
	public List<Integer> waveImageFileToArrayWithColor(String FilePath, int colorRange) throws IOException;
	//�ú������ڹ��еȲ���ͼƬ�ļ�ת������ͬ��ɫ������༯�ϡ�
	public HashMap<Integer, List<Integer>> waveImageFileToArrayMapWithBlack(String FilePath) throws IOException;
	//�ú������ڹ��еȲ��λ���ת�������顣
	public HashMap<Integer, List<Integer>> waveImageToArrayMapWithBlack(BufferedImage bufferedImage);

	//ToolkitImageToBufferImage
	public BufferedImage toolkitImageIconToBufferImage(int positionX, int positionY, ImageIcon imageIcon);
	public BufferedImage toolkitImageToBufferImage(Image image, int positionX, int positionY, int width
			, int height, ImageObserver imageObserver) ;
	public BufferedImage toolkitImageToBufferImageAboutIconConfig(Image image, int positionX, int positionY);

	//Iterator_ESU
	public String iteratorToJsonString(Gson gson, Iterator<Object> iterator);
	public Object stringIteratorToJsonString(Gson gson, Iterator<String> iterator);
	public String iteratorToXml(Gson gson, Iterator<Object> iterator);
	public String iteratorToMap(Gson gson, Iterator<Object> iterator);
	public Object[] iteratorToObjectArray(Gson gson, Iterator<Object> iterator);
	public List<Object> iteratorToList(Gson gson, Iterator<Object> iterator);

	//Json_ESU
	//  �޳���������Ȩ ���뷶Χ	
	//	public Map<String, Object> jsonObjectToMap(Gson gson
	//			, JSONObject jSONObject){
	//		return gson.fromJson(jSONObject.toString()
	//, new TypeToken<Map<String, Object>>(){}.getType()){  };
	//	}

	public List<Object> jsonArrayToList(JSONArray jSONArray);
	public String jsonObjectToString(JSONObject jSONObject);
	public Hashtable<String, Object> jsonObjectToHashtable(Gson gson,JSONObject jSONObject);
	public String jsonObjectToXml(JSONObject jSONObject);

	//List_ESU
	public String listToJsonString(Gson gson, List<Object> list);
	public Object stringListToJsonString(Gson gson, List<String> list) ;
	public String listToXml(Gson gson, List<Object> list);
	public String listToMap(Gson gson, List<Object> list);
	public Object[] listToObjectArray(List<Object> list);
	public String[] stringlistToStringArray(List<String> list);
	public Iterator<Object> listToIterator(List<Object> list);
	public Vector<Object> listToVector(List<Object> list);
	public Set<Object> listToSet(List<Object> list);
	public String[] listToArray(List<String> list);

	//Map_ESU{
	//  �޳���������Ȩ ���뷶Χ	
	//	public String mapToJsonString(Gson gson, Map<String, Object> map){
	//		return gson.toJson(map);
	//	}
	//
	//	public String mapToXml(Gson gson, Map<String, Object> map){
	//		JSONObject jSONObject= new JSONObject(gson.toJson(map)){  };
	//		return XML.toString(jSONObject);	
	//	}

	public List<Map<String, Object>> mapToList(Map<String, Object> map);
	public Hashtable<String, Object> mapToHash(Map<String, Object> map);

	//LYG9DWithDoubleTopSort5D
	public double[] sort(double[] array, int range, int deeps);

	//LYG10DWithChineseMixStringSort12D
	public static void �ʻ�ƴ�������Ժ���аѴ��������(String[] strings1D) throws IOException {		
		InputStream inputStreamp= new VerbalSource().getClass().getResourceAsStream(StableFile.PinYinCN_lyg);
		BufferedReader cReaderp= new BufferedReader(new InputStreamReader(inputStreamp, "GBK"));
		//index
		String cInputStringp;
		Map<String, String> map= new HashMap<>();
		HashMap<String, Integer> bihua= new HashMap<>();
		while ((cInputStringp= cReaderp.readLine())!= null) {
			String[] words= cInputStringp.split("->");
			if(words.length>1) {
				map.put(words[0], words[1]);
			}
		}
		InputStream inputStreamb= new VerbalSource().getClass().getResourceAsStream(StableFile.BiHuaCN_lyg);
		BufferedReader cReaderb= new BufferedReader(new InputStreamReader(inputStreamb, "GBK"));
		//index
		String cInputStringb;
		while ((cInputStringb= cReaderb.readLine())!= null) {
			String[] words= cInputStringb.split("->");
			if(words.length>1) {
				bihua.put(words[0], Integer.valueOf(words[1]));
			}
		}

		LYG10DWCMSSort15D_XCDX_C_U_A lYG10DWCMSSort15D_XCDX_C_U_A= new LYG10DWCMSSort15D_XCDX_C_U_A();
		lYG10DWCMSSort15D_XCDX_C_U_A.pinyin= map;
		lYG10DWCMSSort15D_XCDX_C_U_A.bihua= bihua;
		lYG10DWCMSSort15D_XCDX_C_U_A.processKernel(strings1D, 0, strings1D.length- 1, 30, 0);

		for(String string:strings1D) {
			System.out.println(string);
		}
		cReaderb.close();
		cReaderp.close();
	}

	// XML_ESU
	//  �޳���������Ȩ ���뷶Χ
	//	public JSONObject xmlToJsonObject(String string){
	//		return XML.toJSONObject(string);
	//	}

	public List<Object> xmlToList(String string, String key) ;

	//  �޳���������Ȩ ���뷶Χ
	//	public Map<String, Object> xmlToMap(Gson gson, String string){
	//		return gson.fromJson(XML.toJSONObject(string).toString()
	//, new TypeToken<Map<String, Object>>(){}.getType());
	//	}

	public Vector<Object> xmlToVector(String string, String key);
	public Set<Object> xmlToSets(String string, String key);
	public Hashtable<String, Object> xmlToHashtable(String xmlString, Gson gson);

	//TXT_ESU{
	//ע���ֽڱ���Ķ�д��ȷ
	public Object[][] txtFileToObjectMatrix(String filePath, String stopBy) throws IOException ;
	public Object[][] txtFileToObjectMatrixWithRange(String filePath, String stopBy, int rangeBegin
			, int rangeEnd) throws IOException;
	public List<String> txtFileToListStringWithRange(String filePath, String stopBy, int rangeBegin
			, int rangeEnd) throws IOException;
	public List<String> txtFileToListString(String filePath)throws IOException;
	public List<String[]> txtFileToListStringArray(String filePath, String stopBy) throws IOException ;

	//Vector_ESU
	public Map<String, Object> vectorToMap(Vector<Object> vector);
	public List<Object> vectorToList(Vector<Object> vector);
	public Object[] vectorToArray(Vector<Object> vector);
	public Iterator<Object> vectorToIterator(Vector<Object> vector);
	public String vectorToJsonString(Gson gson,Vector<Object> vector);
	public Set<Object> vectorToSet(Vector<Object> vector);

	//StringBuilder_ESU{
	public char[] stringBuilderToCharArray(StringBuilder stringBuilder);
	public String stringBuilderToString(StringBuilder stringBuilder);
	public String stringBuilderToJson(Gson gson, StringBuilder stringBuilder);
	public String stringBuilderToXml(Gson gson, StringBuilder stringBuilder);
	public String[] stringBuilderToSplitArray(String stopBy, StringBuilder stringBuilder);
	public Map<String, Object> stringBuilderToMap(Gson gson, StringBuilder stringBuilder);

	//String_ESU{
	public String[] stringToArray(String stopBy, String string);
	public String stringArrayToString(String[] strings);
	public String stringToURIencode(String string, String encoding)throws UnsupportedEncodingException;
	public String stringToURIencode(String string) throws UnsupportedEncodingException;
	public String uRIencodeToURIdecode(String string);
	public String uRIencodeToURIdecode(String string, String encode) throws UnsupportedEncodingException;
	public int[] stringToCharASCII(String string);
	public String charsetSwap(String string, String inputCharset
			, String outputCharset)throws UnsupportedEncodingException;

	//StockCode//������û�к��������ԣ�������ȡ�
	//Object_ESU{
	public String objectToJsonString(Gson gson, Object object);
	//Matrix3D_ESU{
	public Object[][][] matrixShiftSwapXYZ(Object[][][] objects);
	public Object[][][] matrixInclineSwapXY(Object[][][] objects);
	public Object[][][] matrixInclineSwapXZ(Object[][][] objects);
	public Object[][][] matrixInclineSwapYZ(Object[][][] objects);
	public Object[][][] matrixReverseSwap(Object[][][] objects);
	public Object[][][] matrixReverseSwapXY(Object[][][] objects);
	public Object[][][] matrixReverseSwapXZ(Object[][][] objects);
	public Object[][][] matrixReverseSwapYZ(Object[][][] objects);
	public Object[] matrixToArray(Object[][][] objects);

	//Matrix_ESU{
	public Object[][] matrixInclineSwap(Object[][] objects);
	public Object[][] matrixPostSwap(Object[][] objects);
	public Object[][] matrixInSwap(Object[][] objects);
	public Object[][] matrixReverseSwap(Object[][] objects);
	public Object[] matrixToArray(Object[][] objects);
	//Flt ��������ӿڣ� ������ȡ�
}
