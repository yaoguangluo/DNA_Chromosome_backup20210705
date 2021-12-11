package SEM.bloom;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
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

import ESU.array.Array_ESU;
import ESU.array.Double_ESU;
import ESU.csv.CSV_ESU;
import ESU.date.Date_ESU;
import ESU.hash.Hash_ESU;
import ESU.http.HttpUnicode;
import ESU.image.ImageToList;
import ESU.image.Image_ESU;
import ESU.image.ToolkitImageToBufferImage;
import ESU.iterator.Iterator_ESU;
import ESU.json.Json_ESU;
import ESU.list.List_ESU;
import ESU.map.Map_ESU;
import ESU.matrix.Matrix_ESU;
import ESU.matrix3D.Matrix3D_ESU;
import ESU.object.Object_ESU;
import ESU.string.String_ESU;
import ESU.stringBuilder.StringBuilder_ESU;
import ESU.tinos.vector.Vector_ESU;
import ESU.txt.TXT_ESU;
import ESU.xml.XML_ESU;
import OEU.LYG4DQS4D.LYG9DWithDoubleTopSort5D;
//著作权人+作者= 罗瑶光
//第一次完善了下， 因为改动了3个static 字符， 稍后养疗经运行下，看不会出bug不。毕竟不是static value ，只是static 函数而已， 
//纠正一处 S大写函数开头 小写s， 相关的元基花 华瑞集 几个相关文件 也要改成 s
public class StaticFunctionMapU_VECS_E implements StaticFunctionMapU_VECS_C{
	public static void main(String[] argv) throws IOException {
		String[] strings1D= new String[16];
		strings1D[0]= "dh罗31韵律";
		strings1D[1]= "dh罗11瑶林";
		strings1D[2]= "dh罗2瑶光";
		strings1D[3]= "dh罗4韵律";
		strings1D[2]= "dh罗2尧光";
		strings1D[3]= "dh罗4运律";
		strings1D[4]= "dh罗6瑶d林";
		strings1D[5]= "dh罗瑶0.6光";
		strings1D[6]= "dh罗瑶0.3f光";
		strings1D[7]= "dh罗瑶0.61e7光";
		strings1D[8]= "dh罗瑶0.3e61光";
		strings1D[9]= "dh罗瑶0.3e6光";
		strings1D[10]= "dh罗瑶0.6e2光";
		strings1D[11]= "dh罗瑶0.3e1光";
		strings1D[12]= "dh罗韵111.21律";
		strings1D[13]= "dh罗韵15.21律";
		strings1D[14]= "dh罗瑶g林";
		strings1D[15]= "dhv罗1.09瑶光";
		StaticFunctionMapU_VECS_C.笔画拼音排序稍后进行把传参设计下(strings1D);

		/*输出结果
		 * 
		 *
dh罗瑶0.3e1光
dh罗瑶0.3e6光
dh罗瑶0.3e61光
dh罗瑶0.3f光
dh罗瑶0.6光
dh罗瑶0.61e7光
dh罗瑶0.6e2光
dh罗瑶g林
dh罗韵111.21律
dh罗韵15.21律
dh罗11瑶林
dh罗2尧光
dh罗31韵律
dh罗4运律
dh罗6瑶d林
dhv罗1.09瑶光

		 * 
		 * */
	}

	//稍后加前缀
	@Override
	public Map<Double, Map<String, Boolean>> getMapFromDoubleStringArray(Double[] score, String[] nameScore) {
		return Double_ESU.getMapFromDoubleStringArray(score, nameScore);
	}

	@Override
	public Map<Integer, Map<String, Boolean>> getMapFromIntStringArray(int[] score, String[] nameScore) {
		return Double_ESU.getMapFromIntStringArray(score, nameScore);
	}

	@Override
	public Map<Integer, Map<String, Boolean>> getMapFromIntStringArray_ZhongYao(int[] score, String[] nameScore) {
		return Double_ESU.getMapFromIntStringArray_ZhongYao(score, nameScore);
	}

	@Override
	public String arrayToJson(Gson gson, Object[] object) {
		return Array_ESU.arrayToJson(gson, object);
	}

	@Override
	public String arrayToXml(Gson gson, Object[] object) {
		return Array_ESU.arrayToXml(gson, object);
	}

	@Override
	public Map<String, Object> arrayToMap(Gson gson, Object[] objects) {
		return Array_ESU.arrayToMap(gson, objects);
	}

	@Override
	public Vector<Object> arrayToVector(Gson gson, Object[] objects) {
		return Array_ESU.arrayToVector(gson, objects);
	}

	@Override
	public List<Object> arrayToList(Object[] objects) {
		return Array_ESU.arrayToList(objects);
	}

	@Override
	public Iterator<Object> arrayToIterator(Object[] objects) {
		return arrayToIterator(objects);
	}

	@Override
	public Set<Object> arrayToSet(Object[] objects) {
		return Array_ESU.arrayToSet(objects);
	}

	@Override
	public Object[][] arrayToMatrix(Object[] objects, int widthRange) {
		return Array_ESU.arrayToMatrix(objects, widthRange);
	}

	@Override
	public Object[][][] arrayToMatrix3D(Object[] objects, int widthRange, int heightRange) {
		return Array_ESU.arrayToMatrix3D(objects, widthRange, heightRange);
	}

	@Override
	public Object[][] xlsOrCsvFileToObjectMartix(String filePath, int pageSheetIndex) throws IOException {
		return CSV_ESU.xlsOrCsvFileToObjectMartix(filePath, pageSheetIndex);
	}

	@Override
	public List<Object[]> xlsOrCsvFileToListObject(String filePath, int pageSheetIndex) throws IOException {
		return CSV_ESU.xlsOrCsvFileToListObject(filePath, pageSheetIndex);
	}

	@Override
	public List<Object[]> xlsOrCsvFileToRangedListObject(String filePath, int pageSheetIndex,
			Map<Integer, Boolean> rows, Map<Integer, Boolean> culumns) throws IOException {
		return CSV_ESU.xlsOrCsvFileToRangedListObject(filePath, pageSheetIndex, rows, culumns);
	}

	@Override
	public Object[][] xlsOrCsvFileToRangedObjectMartix(String filePath, int pageSheetIndex, Map<Integer, Boolean> rows,
			Map<Integer, Boolean> culumns) throws IOException {
		return CSV_ESU.xlsOrCsvFileToRangedObjectMartix(filePath, pageSheetIndex, rows, culumns); 
	}

	@Override
	public String dateToGMTString(Date date) {
		return Date_ESU.dateToGMTString(date);
	}

	@Override
	public String dateToYYYYMMDD(Date date) {
		return Date_ESU.dateToYYYYMMDD(date);
	}

	@Override
	public String dateToHHMMSS(Date date) {
		return Date_ESU.dateToHHMMSS(date);
	}

	@Override
	public String dateToMiliSeconds(Date date) {
		return Date_ESU.dateToMiliSeconds(date);
	}

	@Override
	public String getCurrentMiliSeconds(Date date) {
		return Date_ESU.getCurrentMiliSeconds(date);
	}

	@Override
	public Timestamp dateToTimeStamp(Date date) {
		return Date_ESU.dateToTimeStamp(date);
	}

	@Override
	public long timeStampToMiliSeconds(Timestamp timestamp) {
		return Date_ESU.timeStampToMiliSeconds(timestamp);
	}

	@Override
	public String timeStampToMiliSecondsWithSize(Timestamp timestamp, int size) {
		return Date_ESU.timeStampToMiliSecondsWithSize(timestamp, size);
	}

	@Override
	public String dateStringToMiliSeconds(String string) {
		return Date_ESU.dateStringToMiliSeconds(string);
	}

	@Override
	public String hashTableToJson(Gson gson, Hashtable<String, Object> hashtable) {
		return Hash_ESU.hashTableToJson(gson, hashtable);
	}

	@Override
	public String hashTableToXml(Gson gson, Hashtable<String, Object> hashtable) {
		return Hash_ESU.hashTableToXml(gson, hashtable);
	}

	@Override
	public List<Object> hashTableToList(Gson gson, Hashtable<String, Object> hashtable) {
		return Hash_ESU.hashTableToList(gson, hashtable);
	}

	@Override
	public Object[] hashTableToObjectArray(Gson gson, Hashtable<String, Object> hashtable) {
		return Hash_ESU.hashTableToObjectArray(gson, hashtable);
	}

	@Override
	public String getJson(String urlString, String jsonString) throws IOException {
		return new HttpUnicode().getJson(urlString, jsonString);
	}

	@Override
	public String postXML(String urlString, String XMLString) throws IOException {
		return new HttpUnicode().postXML(urlString, XMLString);
		//这个函数 refer java.net 白皮书教材。我的写法是按照印度买的 java how to program 蓝皮书写的
		//记得章节是 http sever client socket通信 两本书都在美国 4年前没带回来。
	}

	@Override
	public String postJsonWithSercurity(String urlString, String jsonString) throws IOException {
		return new HttpUnicode().postJsonWithSercurity(urlString, jsonString);
	}

	@Override
	public String postXMLWithSercurity(String urlString, String XMLString) throws IOException {
		return new HttpUnicode().postXMLWithSercurity(urlString, XMLString);
	}

	@Override
	public String getHTML(String urlString, Object object) throws IOException {
		return new HttpUnicode().getHTML(urlString, object);
	}

	@Override
	public void pixTableToFile(String pngOutputPath, int[][] pix, String fileType) throws IOException {
		Image_ESU.pixTableToFile(pngOutputPath, pix, fileType);
	}

	@Override
	public void pixRGBTableToFile(String pngOutputPath, int[][] pixRed, int[][] pixGreen, int[][] pixBlue,
			String fileType) throws IOException {
		Image_ESU.pixRGBTableToFile(pngOutputPath, pixRed, pixGreen, pixBlue, fileType);
	}

	@Override
	public void bufferedImageToFile(String pngOutputPath, BufferedImage bufferedImage, String fileType)
			throws IOException {
		Image_ESU.bufferedImageToFile(pngOutputPath, bufferedImage, fileType);

	}

	@Override
	public void imageToFile(String pngOutputPath, Image image, String fileType) throws IOException {
		Image_ESU.imageToFile(pngOutputPath, image, fileType);

	}

	@Override
	public void bufferedImageToScaleImageFile(String pngOutputPath, BufferedImage bufferedImage, String fileType,
			int scale) throws IOException {
		Image_ESU.bufferedImageToScaleImageFile(pngOutputPath, bufferedImage, fileType, scale); 

	}

	@Override
	public List<Integer> waveImageFileToArrayWithBlack(String FilePath) throws IOException {
		return ImageToList.waveImageFileToArrayWithBlack(FilePath);
	}

	@Override
	public List<Integer> waveImageToArrayWithBlack(BufferedImage bufferedImage) {
		return ImageToList.waveImageToArrayWithBlack(bufferedImage);
	}

	@Override
	public List<Integer> waveImageToArrayWithColor(BufferedImage bufferedImage, int colorRange) {
		return ImageToList.waveImageToArrayWithColor(bufferedImage, colorRange);
	}

	@Override
	public List<Integer> waveImageFileToArrayWithColor(String filePath, int colorRange) throws IOException {
		return ImageToList.waveImageFileToArrayWithColor(filePath, colorRange);
	}

	@Override
	public HashMap<Integer, List<Integer>> waveImageFileToArrayMapWithBlack(String filePath) throws IOException {
		return ImageToList.waveImageFileToArrayMapWithBlack(filePath);
	}

	@Override
	public HashMap<Integer, List<Integer>> waveImageToArrayMapWithBlack(BufferedImage bufferedImage) {
		return ImageToList.waveImageToArrayMapWithBlack(bufferedImage);
	}

	@Override
	public BufferedImage toolkitImageIconToBufferImage(int positionX, int positionY, ImageIcon imageIcon) {
		return new ToolkitImageToBufferImage().toolkitImageIconToBufferImage(positionX, positionY, imageIcon);
	}

	@Override
	public BufferedImage toolkitImageToBufferImage(Image image, int positionX, int positionY, int width, int height,
			ImageObserver imageObserver) {
		return new ToolkitImageToBufferImage().toolkitImageToBufferImage(image, positionX, positionY, width, height, imageObserver);
	}

	@Override
	public BufferedImage toolkitImageToBufferImageAboutIconConfig(Image image, int positionX, int positionY) {
		return new ToolkitImageToBufferImage().toolkitImageToBufferImageAboutIconConfig(image, positionX, positionY);
	}

	@Override
	public String iteratorToJsonString(Gson gson, Iterator<Object> iterator) {
		return Iterator_ESU.iteratorToJsonString(gson, iterator);
	}

	@Override
	public Object stringIteratorToJsonString(Gson gson, Iterator<String> iterator) {
		return Iterator_ESU.stringIteratorToJsonString(gson, iterator);
	}

	@Override
	public String iteratorToXml(Gson gson, Iterator<Object> iterator) {
		return Iterator_ESU.iteratorToXml(gson, iterator);
	}

	@Override
	public String iteratorToMap(Gson gson, Iterator<Object> iterator) {
		return Iterator_ESU.iteratorToMap(gson, iterator);
	}

	@Override
	public Object[] iteratorToObjectArray(Gson gson, Iterator<Object> iterator) {
		return Iterator_ESU.iteratorToObjectArray(gson, iterator);
	}

	@Override
	public List<Object> iteratorToList(Gson gson, Iterator<Object> iterator) {
		return Iterator_ESU.iteratorToList(gson, iterator);
	}

	@Override
	public List<Object> jsonArrayToList(JSONArray jSONArray) {
		return Json_ESU.jsonArrayToList(jSONArray);
	}

	@Override
	public String jsonObjectToString(JSONObject jSONObject) {
		return Json_ESU.jsonObjectToString(jSONObject);
	}

	@Override
	public Hashtable<String, Object> jsonObjectToHashtable(Gson gson, JSONObject jSONObject) {
		return Json_ESU.jsonObjectToHashtable(gson, jSONObject);
	}

	@Override
	public String jsonObjectToXml(JSONObject jSONObject) {
		return Json_ESU.jsonObjectToXml(jSONObject);
	}

	@Override
	public String listToJsonString(Gson gson, List<Object> list) {
		return List_ESU.listToJsonString(gson, list);
	}

	@Override
	public Object stringListToJsonString(Gson gson, List<String> list) {
		return List_ESU.stringListToJsonString(gson, list);
	}

	@Override
	public String listToXml(Gson gson, List<Object> list) {
		return List_ESU.listToXml(gson, list);
	}

	@Override
	public String listToMap(Gson gson, List<Object> list) {
		return List_ESU.listToMap(gson, list);
	}

	@Override
	public Object[] listToObjectArray(List<Object> list) {
		return List_ESU.listToObjectArray(list);
	}

	@Override
	public String[] stringlistToStringArray(List<String> list) {
		return List_ESU.stringlistToStringArray(list);
	}

	@Override
	public Iterator<Object> listToIterator(List<Object> list) {
		return List_ESU.listToIterator(list);
	}

	@Override
	public Vector<Object> listToVector(List<Object> list) {
		return List_ESU.listToVector(list);
	}

	@Override
	public Set<Object> listToSet(List<Object> list) {
		return List_ESU.listToSet(list);
	}

	@Override
	public String[] listToArray(List<String> list) {
		return List_ESU.listToArray(list);
	}

	@Override
	public List<Map<String, Object>> mapToList(Map<String, Object> map) {
		return Map_ESU.mapToList(map);
	}

	@Override
	public Hashtable<String, Object> mapToHash(Map<String, Object> map) {
		return Map_ESU.mapToHash(map);
	}

	@Override
	public double[] sort(double[] array, int range, int deeps) {
		return new LYG9DWithDoubleTopSort5D().sort(array, range, deeps);
	}

	@Override
	public List<Object> xmlToList(String string, String key) {
		return XML_ESU.xmlToList(string, key);
	}

	@Override
	public Vector<Object> xmlToVector(String string, String key) {
		return XML_ESU.xmlToVector(string, key);
	}

	@Override
	public Set<Object> xmlToSets(String string, String key) {
		return XML_ESU.xmlToSets(string, key);
	}

	@Override
	public Hashtable<String, Object> xmlToHashtable(String xmlString, Gson gson) {
		return new XML_ESU().xmlToHashtable(xmlString, gson);
	}

	@Override
	public Object[][] txtFileToObjectMatrix(String filePath, String stopBy) throws IOException {
		return TXT_ESU.txtFileToObjectMatrix(filePath, stopBy);
	}

	@Override
	public Object[][] txtFileToObjectMatrixWithRange(String filePath, String stopBy, int rangeBegin, int rangeEnd)
			throws IOException {
		return TXT_ESU.txtFileToObjectMatrixWithRange(filePath, stopBy, rangeBegin, rangeEnd);
	}

	@Override
	public List<String> txtFileToListStringWithRange(String filePath, String stopBy, int rangeBegin, int rangeEnd)
			throws IOException {
		return TXT_ESU.txtFileToListStringWithRange(filePath, stopBy, rangeBegin, rangeEnd);
	}

	@Override
	public List<String> txtFileToListString(String filePath) throws IOException {
		return TXT_ESU.txtFileToListString(filePath);
	}

	@Override
	public List<String[]> txtFileToListStringArray(String filePath, String stopBy) throws IOException {
		return TXT_ESU.txtFileToListStringArray(filePath, stopBy);
	}

	@Override
	public Map<String, Object> vectorToMap(Vector<Object> vector) {
		return Vector_ESU.vectorToMap(vector);
	}

	@Override
	public List<Object> vectorToList(Vector<Object> vector) {
		return Vector_ESU.vectorToList(vector);
	}

	@Override
	public Object[] vectorToArray(Vector<Object> vector) {
		return Vector_ESU.vectorToArray(vector);
	}

	@Override
	public Iterator<Object> vectorToIterator(Vector<Object> vector) {
		return Vector_ESU.vectorToIterator(vector);
	}

	@Override
	public String vectorToJsonString(Gson gson, Vector<Object> vector) {
		return Vector_ESU.vectorToJsonString(gson, vector);
	}

	@Override
	public Set<Object> vectorToSet(Vector<Object> vector) {
		return Vector_ESU.vectorToSet(vector);
	}

	@Override
	public char[] stringBuilderToCharArray(StringBuilder stringBuilder) {
		return StringBuilder_ESU.stringBuilderToCharArray(stringBuilder);
	}

	@Override
	public String stringBuilderToString(StringBuilder stringBuilder) {
		return StringBuilder_ESU.stringBuilderToString(stringBuilder);
	}

	@Override
	public String stringBuilderToJson(Gson gson, StringBuilder stringBuilder) {
		return StringBuilder_ESU.stringBuilderToJson(gson, stringBuilder);
	}

	@Override
	public String stringBuilderToXml(Gson gson, StringBuilder stringBuilder) {
		return StringBuilder_ESU.stringBuilderToXml(gson, stringBuilder);
	}

	@Override
	public String[] stringBuilderToSplitArray(String stopBy, StringBuilder stringBuilder) {
		return StringBuilder_ESU.stringBuilderToSplitArray(stopBy, stringBuilder);
	}

	@Override
	public Map<String, Object> stringBuilderToMap(Gson gson, StringBuilder stringBuilder) {
		return StringBuilder_ESU.stringBuilderToMap(gson, stringBuilder);
	}

	@Override
	public String[] stringToArray(String stopBy, String string) {
		return String_ESU.stringToArray(stopBy, string);
	}

	@Override
	public String stringArrayToString(String[] strings) {
		return String_ESU.stringArrayToString(strings);
	}

	@Override
	public String stringToURIencode(String string, String encoding) throws UnsupportedEncodingException {
		return String_ESU.stringToURIencode(string, encoding);
	}

	@Override
	public String stringToURIencode(String string) throws UnsupportedEncodingException {
		return String_ESU.stringToURIencode(string);
	}

	@Override
	public String uRIencodeToURIdecode(String string) {
		return String_ESU.uRIencodeToURIdecode(string);
	}

	@Override
	public String uRIencodeToURIdecode(String string, String encode) throws UnsupportedEncodingException {
		return String_ESU.uRIencodeToURIdecode(string, encode);
	}

	@Override
	public int[] stringToCharASCII(String string) {
		return String_ESU.stringToCharASCII(string);
	}

	@Override
	public String charsetSwap(String string, String inputCharset, String outputCharset)
			throws UnsupportedEncodingException {
		return String_ESU.charsetSwap(string, inputCharset, outputCharset);
	}

	@Override
	public String objectToJsonString(Gson gson, Object object) {
		return Object_ESU.objectToJsonString(gson, object);
	}

	@Override
	public Object[][][] matrixShiftSwapXYZ(Object[][][] objects) {
		return Matrix3D_ESU.matrixShiftSwapXYZ(objects);
	}

	@Override
	public Object[][][] matrixInclineSwapXY(Object[][][] objects) {
		return Matrix3D_ESU.matrixInclineSwapXY(objects);
	}

	@Override
	public Object[][][] matrixInclineSwapXZ(Object[][][] objects) {
		return Matrix3D_ESU.matrixInclineSwapXZ(objects);
	}

	@Override
	public Object[][][] matrixInclineSwapYZ(Object[][][] objects) {
		return Matrix3D_ESU.matrixInclineSwapYZ(objects);
	}

	@Override
	public Object[][][] matrixReverseSwap(Object[][][] objects) {
		return Matrix3D_ESU.matrixReverseSwap(objects);
	}

	@Override
	public Object[][][] matrixReverseSwapXY(Object[][][] objects) {
		return Matrix3D_ESU.matrixReverseSwapXY(objects);
	}

	@Override
	public Object[][][] matrixReverseSwapXZ(Object[][][] objects) {
		return Matrix3D_ESU.matrixReverseSwapXZ(objects);
	}

	@Override
	public Object[][][] matrixReverseSwapYZ(Object[][][] objects) {
		return Matrix3D_ESU.matrixReverseSwapYZ(objects);
	}

	@Override
	public Object[] matrixToArray(Object[][][] objects) {
		return Matrix3D_ESU.matrixToArray(objects);
	}

	@Override
	public Object[][] matrixInclineSwap(Object[][] objects) {
		return Matrix_ESU.matrixInclineSwap(objects);
	}

	@Override
	public Object[][] matrixPostSwap(Object[][] objects) {
		return Matrix_ESU.matrixPostSwap(objects);
	}

	@Override
	public Object[][] matrixInSwap(Object[][] objects) {
		return Matrix_ESU.matrixInSwap(objects);
	}

	@Override
	public Object[][] matrixReverseSwap(Object[][] objects) {
		return Matrix_ESU.matrixReverseSwap(objects);
	}

	@Override
	public Object[] matrixToArray(Object[][] objects) {
		return Matrix_ESU.matrixToArray(objects) ;
	}
}
