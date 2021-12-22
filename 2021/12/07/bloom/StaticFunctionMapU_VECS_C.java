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

	@SuppressWarnings({"static-access", "unchecked"})
	public static void callFunction(String callFunctionKey, StaticFunctionMapU_VECS_E staticFunctionMapU_VECS_C, Map<String, Object> output) throws IOException {
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
				if(inputValues.containsKey("score")&& inputValues.containsKey("nameScore")) {
					find= true;
				}else {
					find= false;
				}
			}
			//////////////////////////////////////////////////////////////////////////////////////	

			//��������,�ͼ��ȫ�ִ���
			if(!find) {//����һ���ӿ�û�з�������ӿ���Ҫ������ʱ���ͼ��ȫ�ִ���
				inputValues= (Map<String, Object>) output.get("inputValues");//ȡ�洢ֵ
			}
			//����ض���������Ƿ�ƥ��
			if(null!= inputValues) {
				if(inputValues.containsKey("score")&& inputValues.containsKey("nameScore")) {
					find= true;
				}	
			}//��������Ƴɲ��ģʽ�������ٶȽ���100����ֹ���Ȳ����ǣ�
			/////////////////////////////////////////////////////////////////////////////////////////////////	

			//����Ƿ�������
			if(find) {
				Double[] score= (Double[])inputValues.get("score"); 
				String[] nameScore= (String[])inputValues.get("nameScore");	
				//��ʼ����
				Object map= staticFunctionMapU_VECS_C.getMapFromDoubleStringArray(score, nameScore);
				//�洢����
				Map<String, Object> returnValue= new HashMap<>();
				returnValue.put("interfaceReturn", map);
				//���
				output.put("getMapFromDoubleStringArray", returnValue);
				output.put("lastInterfaceName", "getMapFromDoubleStringArray");//�Ժ���Ƴɿ� �����������е�ģʽ��
				output.put("lastInterfaceBackfeed", "success");
			}else {
				output.put("lastInterfaceName", "getMapFromDoubleStringArray");
				output.put("lastInterfaceBackfeed", "faild");
			}

		};//��������ͬ��
		if(callFunctionKey.equalsIgnoreCase("getMapFromIntStringArray")){

		};
		if(callFunctionKey.equalsIgnoreCase("getMapFromIntStringArray_ZhongYao")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("arrayToJson")){

		};
		if(callFunctionKey.equalsIgnoreCase("arrayToXml")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("arrayToMap")){

		};
		if(callFunctionKey.equalsIgnoreCase("arrayToVector")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("arrayToList")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("arrayToIterator")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("arrayToSet")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("arrayToMatrix")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("arrayToMatrix3D")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("xlsOrCsvFileToObjectMartix")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("xlsOrCsvFileToListObject")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("xlsOrCsvFileToRangedListObject")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("xlsOrCsvFileToRangedObjectMartix")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("dateToGMTString")){

		};
		if(callFunctionKey.equalsIgnoreCase("dateToYYYYMMDD")){

		};
		if(callFunctionKey.equalsIgnoreCase("dateToHHMMSS")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("dateToMiliSeconds")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("getCurrentMiliSeconds")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("dateToTimeStamp")){

		};
		if(callFunctionKey.equalsIgnoreCase("timeStampToMiliSeconds")){

		};
		if(callFunctionKey.equalsIgnoreCase("timeStampToMiliSecondsWithSize")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("dateStringToMiliSeconds")){

		};
		if(callFunctionKey.equalsIgnoreCase("hashTableToJson")){

		};
		if(callFunctionKey.equalsIgnoreCase("hashTableToXml")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("hashTableToList")){

		};
		if(callFunctionKey.equalsIgnoreCase("hashTableToObjectArray")){

		};
		if(callFunctionKey.equalsIgnoreCase("getJson")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("postXML")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("postJsonWithSercurity")){  

		};
		if(callFunctionKey.equalsIgnoreCase("postXMLWithSercurity")){  

		};
		if(callFunctionKey.equalsIgnoreCase("getHTML")){

		};
		if(callFunctionKey.equalsIgnoreCase("pixTableToFile")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("pixRGBTableToFile")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("bufferedImageToFile")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("imageToFile")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("bufferedImageToScaleImageFile")){

		};
		if(callFunctionKey.equalsIgnoreCase("waveImageFileToArrayWithBlack")){

		};
		if(callFunctionKey.equalsIgnoreCase("waveImageToArrayWithBlack")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("waveImageToArrayWithColor")){

		};
		if(callFunctionKey.equalsIgnoreCase("waveImageFileToArrayWithColor")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("waveImageFileToArrayMapWithBlack")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("waveImageToArrayMapWithBlack")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("toolkitImageIconToBufferImage")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("toolkitImageToBufferImage")){

		};
		if(callFunctionKey.equalsIgnoreCase("toolkitImageToBufferImageAboutIconConfig")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("iteratorToJsonString")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("stringIteratorToJsonString")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("iteratorToXml")){

		};
		if(callFunctionKey.equalsIgnoreCase("iteratorToMap")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("iteratorToObjectArray")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("iteratorToList")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("jsonArrayToList")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("jsonObjectToString")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("jsonObjectToHashtable")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("jsonObjectToXml")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("listToJsonString")){

		};
		if(callFunctionKey.equalsIgnoreCase("stringListToJsonString")){

		};
		if(callFunctionKey.equalsIgnoreCase("listToXml")){

		};
		if(callFunctionKey.equalsIgnoreCase("listToMap")){

		};
		if(callFunctionKey.equalsIgnoreCase("listToObjectArray")){

		};
		if(callFunctionKey.equalsIgnoreCase("stringlistToStringArray")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("listToIterator")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("listToVector")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("listToSet")){

		};
		if(callFunctionKey.equalsIgnoreCase("listToArray")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("mapToList")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("mapToHash")){

		};
		if(callFunctionKey.equalsIgnoreCase("sort")){

		};
		if(callFunctionKey.equalsIgnoreCase("xmlToList")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("xmlToVector")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("xmlToSets")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("xmlToHashtable")){

		};
		if(callFunctionKey.equalsIgnoreCase("txtFileToObjectMatrix")){

		};
		if(callFunctionKey.equalsIgnoreCase("txtFileToObjectMatrixWithRange")){

		};
		if(callFunctionKey.equalsIgnoreCase("txtFileToListStringWithRange")){

		};
		if(callFunctionKey.equalsIgnoreCase("txtFileToListString")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("txtFileToListStringArray")){

		};
		if(callFunctionKey.equalsIgnoreCase("vectorToMap")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("vectorToList")){

		};
		if(callFunctionKey.equalsIgnoreCase("vectorToArray")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("vectorToIterator")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("vectorToJsonString")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("vectorToSet")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("stringBuilderToCharArray")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("stringBuilderToString")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("stringBuilderToJson")){

		};
		if(callFunctionKey.equalsIgnoreCase("stringBuilderToXml")){

		};
		if(callFunctionKey.equalsIgnoreCase("stringBuilderToSplitArray")){

		};
		if(callFunctionKey.equalsIgnoreCase("stringBuilderToMap")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("stringToArray")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("stringArrayToString")){

		};
		if(callFunctionKey.equalsIgnoreCase("stringToURIencode")){

		};
		if(callFunctionKey.equalsIgnoreCase("stringToURIencode")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("uRIencodeToURIdecode")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("uRIencodeToURIdecode")){

		};
		if(callFunctionKey.equalsIgnoreCase("stringToCharASCII")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("charsetSwap")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("objectToJsonString")){

		};
		if(callFunctionKey.equalsIgnoreCase("matrixShiftSwapXYZ")){

		};
		if(callFunctionKey.equalsIgnoreCase("matrixInclineSwapXY")){ 

		};
		if(callFunctionKey.equalsIgnoreCase("matrixInclineSwapXZ")){

		};
		if(callFunctionKey.equalsIgnoreCase("matrixInclineSwapYZ")){

		};
		if(callFunctionKey.equalsIgnoreCase("matrixReverseSwap")){

		};
		if(callFunctionKey.equalsIgnoreCase("matrixReverseSwapXY")){

		};
		if(callFunctionKey.equalsIgnoreCase("matrixReverseSwapXZ")){

		};
		if(callFunctionKey.equalsIgnoreCase("matrixReverseSwapYZ")){

		};
		if(callFunctionKey.equalsIgnoreCase("matrixToArray")){

		};
		if(callFunctionKey.equalsIgnoreCase("matrixInclineSwap")){

		};
		if(callFunctionKey.equalsIgnoreCase("matrixPostSwap")){

		};
		if(callFunctionKey.equalsIgnoreCase("matrixInSwap")){

		};
		if(callFunctionKey.equalsIgnoreCase("matrixReverseSwap")){

		};
		if(callFunctionKey.equalsIgnoreCase("matrixToArray")){

		};	
	}

	public static void load(StaticFunctionMapU_VECS_E staticFunctionMapU_VECS_E) {
		// TODO Auto-generated method stub
		staticFunctionMapU_VECS_E.annotationMap.put("main", "main");//ע��һ��main�ӿ�
		staticFunctionMapU_VECS_E.annotationMap.put("getMapFromDoubleStringArray", "getMapFromDoubleStringArray");//ע��һ��main�ӿ�
		staticFunctionMapU_VECS_E.annotationMap.put("getMapFromIntStringArray", "getMapFromIntStringArray");
		staticFunctionMapU_VECS_E.annotationMap.put("getMapFromIntStringArray_ZhongYao", "getMapFromIntStringArray_ZhongYao");
		staticFunctionMapU_VECS_E.annotationMap.put("arrayToJson", "arrayToJson");
		staticFunctionMapU_VECS_E.annotationMap.put("arrayToXml", "arrayToXml");
		staticFunctionMapU_VECS_E.annotationMap.put("arrayToMap", "arrayToMap");
		staticFunctionMapU_VECS_E.annotationMap.put("arrayToVector", "arrayToVector");
		staticFunctionMapU_VECS_E.annotationMap.put("arrayToList", "arrayToList");
		staticFunctionMapU_VECS_E.annotationMap.put("arrayToIterator", "arrayToIterator");
		staticFunctionMapU_VECS_E.annotationMap.put("arrayToSet", "arrayToSet");
		staticFunctionMapU_VECS_E.annotationMap.put("arrayToMatrix", "arrayToMatrix");
		staticFunctionMapU_VECS_E.annotationMap.put("arrayToMatrix3D", "arrayToMatrix3D");
		staticFunctionMapU_VECS_E.annotationMap.put("xlsOrCsvFileToObjectMartix", "xlsOrCsvFileToObjectMartix");
		staticFunctionMapU_VECS_E.annotationMap.put("xlsOrCsvFileToListObject", "xlsOrCsvFileToListObject");
		staticFunctionMapU_VECS_E.annotationMap.put("xlsOrCsvFileToRangedListObject", "xlsOrCsvFileToRangedListObject");
		staticFunctionMapU_VECS_E.annotationMap.put("xlsOrCsvFileToRangedObjectMartix", "xlsOrCsvFileToRangedObjectMartix");
		staticFunctionMapU_VECS_E.annotationMap.put("dateToGMTString", "dateToGMTString");
		staticFunctionMapU_VECS_E.annotationMap.put("dateToYYYYMMDD", "dateToYYYYMMDD");
		staticFunctionMapU_VECS_E.annotationMap.put("dateToHHMMSS", "dateToHHMMSS");
		staticFunctionMapU_VECS_E.annotationMap.put("dateToMiliSeconds", "dateToMiliSeconds");
		staticFunctionMapU_VECS_E.annotationMap.put("getCurrentMiliSeconds", "getCurrentMiliSeconds");
		staticFunctionMapU_VECS_E.annotationMap.put("dateToTimeStamp", "dateToTimeStamp");
		staticFunctionMapU_VECS_E.annotationMap.put("timeStampToMiliSeconds", "timeStampToMiliSeconds");
		staticFunctionMapU_VECS_E.annotationMap.put("timeStampToMiliSecondsWithSize", "timeStampToMiliSecondsWithSize");
		staticFunctionMapU_VECS_E.annotationMap.put("dateStringToMiliSeconds", "dateStringToMiliSeconds");
		staticFunctionMapU_VECS_E.annotationMap.put("hashTableToJson", "hashTableToJson");
		staticFunctionMapU_VECS_E.annotationMap.put("hashTableToXml", "hashTableToXml");
		staticFunctionMapU_VECS_E.annotationMap.put("hashTableToList", "hashTableToList");
		staticFunctionMapU_VECS_E.annotationMap.put("hashTableToObjectArray", "hashTableToObjectArray");
		staticFunctionMapU_VECS_E.annotationMap.put("getJson", "getJson");
		staticFunctionMapU_VECS_E.annotationMap.put("postXML", "postXML");
		staticFunctionMapU_VECS_E.annotationMap.put("postJsonWithSercurity", "postJsonWithSercurity");
		staticFunctionMapU_VECS_E.annotationMap.put("postXMLWithSercurity", "postXMLWithSercurity");
		staticFunctionMapU_VECS_E.annotationMap.put("getHTML", "getHTML");
		staticFunctionMapU_VECS_E.annotationMap.put("pixTableToFile", "pixTableToFile");
		staticFunctionMapU_VECS_E.annotationMap.put("pixRGBTableToFile", "pixRGBTableToFile");
		staticFunctionMapU_VECS_E.annotationMap.put("bufferedImageToFile", "bufferedImageToFile");
		staticFunctionMapU_VECS_E.annotationMap.put("imageToFile", "imageToFile");
		staticFunctionMapU_VECS_E.annotationMap.put("bufferedImageToScaleImageFile", "bufferedImageToScaleImageFile");
		staticFunctionMapU_VECS_E.annotationMap.put("waveImageFileToArrayWithBlack", "waveImageFileToArrayWithBlack");
		staticFunctionMapU_VECS_E.annotationMap.put("waveImageToArrayWithBlack", "waveImageToArrayWithBlack");
		staticFunctionMapU_VECS_E.annotationMap.put("waveImageToArrayWithColor", "waveImageToArrayWithColor");
		staticFunctionMapU_VECS_E.annotationMap.put("waveImageFileToArrayWithColor", "waveImageFileToArrayWithColor");
		staticFunctionMapU_VECS_E.annotationMap.put("waveImageFileToArrayMapWithBlack", "waveImageFileToArrayMapWithBlack");
		staticFunctionMapU_VECS_E.annotationMap.put("waveImageToArrayMapWithBlack", "waveImageToArrayMapWithBlack");
		staticFunctionMapU_VECS_E.annotationMap.put("toolkitImageIconToBufferImage", "toolkitImageIconToBufferImage");
		staticFunctionMapU_VECS_E.annotationMap.put("toolkitImageToBufferImage", "toolkitImageToBufferImage");
		staticFunctionMapU_VECS_E.annotationMap.put("toolkitImageToBufferImageAboutIconConfig", "toolkitImageToBufferImageAboutIconConfig");
		staticFunctionMapU_VECS_E.annotationMap.put("iteratorToJsonString", "iteratorToJsonString");
		staticFunctionMapU_VECS_E.annotationMap.put("stringIteratorToJsonString", "stringIteratorToJsonString");
		staticFunctionMapU_VECS_E.annotationMap.put("iteratorToXml", "iteratorToXml");
		staticFunctionMapU_VECS_E.annotationMap.put("iteratorToMap", "iteratorToMap");
		staticFunctionMapU_VECS_E.annotationMap.put("iteratorToObjectArray", "iteratorToObjectArray");
		staticFunctionMapU_VECS_E.annotationMap.put("iteratorToList", "iteratorToList");
		staticFunctionMapU_VECS_E.annotationMap.put("jsonArrayToList", "jsonArrayToList");
		staticFunctionMapU_VECS_E.annotationMap.put("jsonObjectToString", "jsonObjectToString");
		staticFunctionMapU_VECS_E.annotationMap.put("jsonObjectToHashtable", "jsonObjectToHashtable");
		staticFunctionMapU_VECS_E.annotationMap.put("jsonObjectToXml", "jsonObjectToXml");
		staticFunctionMapU_VECS_E.annotationMap.put("listToJsonString", "listToJsonString");
		staticFunctionMapU_VECS_E.annotationMap.put("stringListToJsonString", "stringListToJsonString");
		staticFunctionMapU_VECS_E.annotationMap.put("listToXml", "listToXml");
		staticFunctionMapU_VECS_E.annotationMap.put("listToMap", "listToMap");
		staticFunctionMapU_VECS_E.annotationMap.put("listToObjectArray", "listToObjectArray");
		staticFunctionMapU_VECS_E.annotationMap.put("stringlistToStringArray", "stringlistToStringArray");
		staticFunctionMapU_VECS_E.annotationMap.put("listToIterator", "listToIterator");
		staticFunctionMapU_VECS_E.annotationMap.put("listToVector", "listToVector");
		staticFunctionMapU_VECS_E.annotationMap.put("listToSet", "listToSet");
		staticFunctionMapU_VECS_E.annotationMap.put("listToArray", "listToArray");
		staticFunctionMapU_VECS_E.annotationMap.put("mapToList", "mapToList");
		staticFunctionMapU_VECS_E.annotationMap.put("mapToHash", "mapToHash");
		staticFunctionMapU_VECS_E.annotationMap.put("sort", "sort");
		staticFunctionMapU_VECS_E.annotationMap.put("xmlToList", "xmlToList");
		staticFunctionMapU_VECS_E.annotationMap.put("xmlToVector", "xmlToVector");
		staticFunctionMapU_VECS_E.annotationMap.put("xmlToSets", "xmlToSets");
		staticFunctionMapU_VECS_E.annotationMap.put("xmlToHashtable", "xmlToHashtable");
		staticFunctionMapU_VECS_E.annotationMap.put("txtFileToObjectMatrix", "txtFileToObjectMatrix");
		staticFunctionMapU_VECS_E.annotationMap.put("txtFileToObjectMatrixWithRange", "txtFileToObjectMatrixWithRange");
		staticFunctionMapU_VECS_E.annotationMap.put("txtFileToListStringWithRange", "txtFileToListStringWithRange");
		staticFunctionMapU_VECS_E.annotationMap.put("txtFileToListString", "txtFileToListString");
		staticFunctionMapU_VECS_E.annotationMap.put("txtFileToListStringArray", "txtFileToListStringArray");
		staticFunctionMapU_VECS_E.annotationMap.put("vectorToMap", "vectorToMap");
		staticFunctionMapU_VECS_E.annotationMap.put("vectorToList", "vectorToList");
		staticFunctionMapU_VECS_E.annotationMap.put("vectorToArray", "vectorToArray");
		staticFunctionMapU_VECS_E.annotationMap.put("vectorToIterator", "vectorToIterator");
		staticFunctionMapU_VECS_E.annotationMap.put("vectorToJsonString", "vectorToJsonString");
		staticFunctionMapU_VECS_E.annotationMap.put("vectorToSet", "vectorToSet");
		staticFunctionMapU_VECS_E.annotationMap.put("stringBuilderToCharArray", "stringBuilderToCharArray");
		staticFunctionMapU_VECS_E.annotationMap.put("stringBuilderToString", "stringBuilderToString");
		staticFunctionMapU_VECS_E.annotationMap.put("stringBuilderToJson", "stringBuilderToJson");
		staticFunctionMapU_VECS_E.annotationMap.put("stringBuilderToXml", "stringBuilderToXml");
		staticFunctionMapU_VECS_E.annotationMap.put("stringBuilderToSplitArray", "stringBuilderToSplitArray");
		staticFunctionMapU_VECS_E.annotationMap.put("stringBuilderToMap", "stringBuilderToMap");
		staticFunctionMapU_VECS_E.annotationMap.put("stringToArray", "stringToArray");
		staticFunctionMapU_VECS_E.annotationMap.put("stringArrayToString", "stringArrayToString");
		staticFunctionMapU_VECS_E.annotationMap.put("stringToURIencode", "stringToURIencode");
		staticFunctionMapU_VECS_E.annotationMap.put("stringToURIencode", "stringToURIencode");
		staticFunctionMapU_VECS_E.annotationMap.put("uRIencodeToURIdecode", "uRIencodeToURIdecode");
		staticFunctionMapU_VECS_E.annotationMap.put("uRIencodeToURIdecode", "uRIencodeToURIdecode");
		staticFunctionMapU_VECS_E.annotationMap.put("stringToCharASCII", "stringToCharASCII");
		staticFunctionMapU_VECS_E.annotationMap.put("charsetSwap", "charsetSwap");
		staticFunctionMapU_VECS_E.annotationMap.put("objectToJsonString", "objectToJsonString");
		staticFunctionMapU_VECS_E.annotationMap.put("matrixShiftSwapXYZ", "matrixShiftSwapXYZ");
		staticFunctionMapU_VECS_E.annotationMap.put("matrixInclineSwapXY", "matrixInclineSwapXY");
		staticFunctionMapU_VECS_E.annotationMap.put("matrixInclineSwapXZ", "matrixInclineSwapXZ");
		staticFunctionMapU_VECS_E.annotationMap.put("matrixInclineSwapYZ", "matrixInclineSwapYZ");
		staticFunctionMapU_VECS_E.annotationMap.put("matrixReverseSwap", "matrixReverseSwap");
		staticFunctionMapU_VECS_E.annotationMap.put("matrixReverseSwapXY", "matrixReverseSwapXY");
		staticFunctionMapU_VECS_E.annotationMap.put("matrixReverseSwapXZ", "matrixReverseSwapXZ");
		staticFunctionMapU_VECS_E.annotationMap.put("matrixReverseSwapYZ", "matrixReverseSwapYZ");
		staticFunctionMapU_VECS_E.annotationMap.put("matrixToArray", "matrixToArray");
		staticFunctionMapU_VECS_E.annotationMap.put("matrixInclineSwap", "matrixInclineSwap");
		staticFunctionMapU_VECS_E.annotationMap.put("matrixPostSwap", "matrixPostSwap");
		staticFunctionMapU_VECS_E.annotationMap.put("matrixInSwap", "matrixInSwap");
		staticFunctionMapU_VECS_E.annotationMap.put("matrixReverseSwap", "matrixReverseSwap");
		staticFunctionMapU_VECS_E.annotationMap.put("matrixToArray", "matrixToArray");	
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
	//				, new TypeToken<Map<String, Object>>(){}.getType()){  };
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
	//				, new TypeToken<Map<String, Object>>(){}.getType());
	//	}

	public Vector<Object> xmlToVector(String string, String key);
	public Set<Object> xmlToSets(String string, String key);
	public Hashtable<String, Object> xmlToHashtable(String xmlString, Gson gson);

	//TXT_ESU{
	//ע���ֽڱ���Ķ�д��ȷ
	public Object[][] txtFileToObjectMatrix(String filePath, String stopBy) throws IOException ;
	public Object[][] txtFileToObjectMatrixWithRange(String filePath, String stopBy, int rangeBegin, int rangeEnd) throws IOException;
	public List<String> txtFileToListStringWithRange(String filePath, String stopBy, int rangeBegin, int rangeEnd) throws IOException;
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
	public String charsetSwap(String string, String inputCharset, String outputCharset)throws UnsupportedEncodingException;

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
