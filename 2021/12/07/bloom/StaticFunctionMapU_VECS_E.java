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

public class StaticFunctionMapU_VECS_E implements StaticFunctionMapU_VECS_C{
	public static void main(String[] argv) throws IOException {
		String[] strings1D= new String[16];
		strings1D[0]= "dh��31����";
		strings1D[1]= "dh��11����";
		strings1D[2]= "dh��2����";
		strings1D[3]= "dh��4����";
		strings1D[2]= "dh��2Ң��";
		strings1D[3]= "dh��4����";
		strings1D[4]= "dh��6��d��";
		strings1D[5]= "dh����0.6��";
		strings1D[6]= "dh����0.3f��";
		strings1D[7]= "dh����0.61e7��";
		strings1D[8]= "dh����0.3e61��";
		strings1D[9]= "dh����0.3e6��";
		strings1D[10]= "dh����0.6e2��";
		strings1D[11]= "dh����0.3e1��";
		strings1D[12]= "dh����111.21��";
		strings1D[13]= "dh����15.21��";
		strings1D[14]= "dh����g��";
		strings1D[15]= "dhv��1.09����";
		StaticFunctionMapU_VECS_C.�ʻ�ƴ�������Ժ���аѴ��������(strings1D);

		/*������
		 * 
		 *
dh����0.3e1��
dh����0.3e6��
dh����0.3e61��
dh����0.3f��
dh����0.6��
dh����0.61e7��
dh����0.6e2��
dh����g��
dh����111.21��
dh����15.21��
dh��11����
dh��2Ң��
dh��31����
dh��4����
dh��6��d��
dhv��1.09����

		 * 
		 * */
	}

	@Override
	public Map<Double, Map<String, Boolean>> getMapFromDoubleStringArray(Double[] score, String[] nameScore) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, Map<String, Boolean>> getMapFromIntStringArray(int[] score, String[] nameScore) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, Map<String, Boolean>> getMapFromIntStringArray_ZhongYao(int[] score, String[] nameScore) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String arrayToJson(Gson gson, Object[] object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String arrayToXml(Gson gson, Object[] object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> arrayToMap(Gson gson, Object[] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<Object> arrayToVector(Gson gson, Object[] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> arrayToList(Object[] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Object> arrayToIterator(Object[] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Object> arrayToSet(Object[] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[][] arrayToMatrix(Object[] objects, int widthRange) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[][][] arrayToMatrix3D(Object[] objects, int widthRange, int heightRange) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[][] xlsOrCsvFileToObjectMartix(String filePath, int pageSheetIndex) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> xlsOrCsvFileToListObject(String filePath, int pageSheetIndex) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> xlsOrCsvFileToRangedListObject(String filePath, int pageSheetIndex,
			Map<Integer, Boolean> rows, Map<Integer, Boolean> culumns) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[][] xlsOrCsvFileToRangedObjectMartix(String filePath, int pageSheetIndex, Map<Integer, Boolean> rows,
			Map<Integer, Boolean> culumns) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String dateToGMTString(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String dateToYYYYMMDD(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String dateToHHMMSS(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String dateToMiliSeconds(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCurrentMiliSeconds(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Timestamp dateToTimeStamp(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long timeStampToMiliSeconds(Timestamp timestamp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String timeStampToMiliSecondsWithSize(Timestamp timestamp, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String dateStringToMiliSeconds(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String hashTableToJson(Gson gson, Hashtable<String, Object> hashtable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String hashTableToXml(Gson gson, Hashtable<String, Object> hashtable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> hashTableToList(Gson gson, Hashtable<String, Object> hashtable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] hashTableToObjectArray(Gson gson, Hashtable<String, Object> hashtable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getJson(String urlString, String jsonString) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String postXML(String urlString, String XMLString) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String postJsonWithSercurity(String urlString, String jsonString) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String postXMLWithSercurity(String urlString, String XMLString) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHTML(String urlString, Object object) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pixTableToFile(String pngOutputPath, int[][] pix, String fileType) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pixRGBTableToFile(String pngOutputPath, int[][] pixRed, int[][] pixGreen, int[][] pixBlue,
			String fileType) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bufferedImageToFile(String pngOutputPath, BufferedImage bufferedImage, String fileType)
			throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imageToFile(String pngOutputPath, Image image, String fileType) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bufferedImageToScaleImageFile(String pngOutputPath, BufferedImage bufferedImage, String fileType,
			int scale) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> waveImageFileToArrayWithBlack(String FilePath) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> waveImageToArrayWithBlack(BufferedImage bufferedImage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> waveImageToArrayWithColor(BufferedImage bufferedImage, int colorRange) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Integer> waveImageFileToArrayWithColor(String FilePath, int colorRange) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<Integer, List<Integer>> waveImageFileToArrayMapWithBlack(String FilePath) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<Integer, List<Integer>> waveImageToArrayMapWithBlack(BufferedImage bufferedImage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BufferedImage toolkitImageIconToBufferImage(int positionX, int positionY, ImageIcon imageIcon) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BufferedImage toolkitImageToBufferImage(Image image, int positionX, int positionY, int width, int height,
			ImageObserver imageObserver) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BufferedImage toolkitImageToBufferImageAboutIconConfig(Image image, int positionX, int positionY) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String iteratorToJsonString(Gson gson, Iterator<Object> iterator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object stringIteratorToJsonString(Gson gson, Iterator<String> iterator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String iteratorToXml(Gson gson, Iterator<Object> iterator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String iteratorToMap(Gson gson, Iterator<Object> iterator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] iteratorToObjectArray(Gson gson, Iterator<Object> iterator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> iteratorToList(Gson gson, Iterator<Object> iterator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> jsonArrayToList(JSONArray jSONArray) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String jsonObjectToString(JSONObject jSONObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hashtable<String, Object> jsonObjectToHashtable(Gson gson, JSONObject jSONObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String jsonObjectToXml(JSONObject jSONObject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listToJsonString(Gson gson, List<Object> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object stringListToJsonString(Gson gson, List<String> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listToXml(Gson gson, List<Object> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listToMap(Gson gson, List<Object> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] listToObjectArray(List<Object> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] StringlistToStringArray(List<String> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Object> listToIterator(List<Object> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<Object> listToVector(List<Object> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Object> listToSet(List<Object> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] listToArray(List<String> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> mapToList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hashtable<String, Object> mapToHash(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double[] sort(double[] array, int range, int deeps) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> xmlToList(String string, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<Object> xmlToVector(String string, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Object> xmlToSets(String string, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hashtable<String, Object> xmlToHashtable(String xmlString, Gson gson) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[][] txtFileToObjectMatrix(String filePath, String stopBy) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[][] txtFileToObjectMatrixWithRange(String filePath, String stopBy, int rangeBegin, int rangeEnd)
			throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> txtFileToListStringWithRange(String filePath, String stopBy, int rangeBegin, int rangeEnd)
			throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> txtFileToListString(String filePath) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String[]> txtFileToListStringArray(String filePath, String stopBy) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> vectorToMap(Vector<Object> vector) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> vectorToList(Vector<Object> vector) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] vectorToArray(Vector<Object> vector) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Object> vectorToIterator(Vector<Object> vector) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String vectorToJsonString(Gson gson, Vector<Object> vector) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Object> vectorToSet(Vector<Object> vector) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char[] stringBuilderToCharArray(StringBuilder stringBuilder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String stringBuilderToString(StringBuilder stringBuilder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String stringBuilderToJson(Gson gson, StringBuilder stringBuilder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String stringBuilderToXml(Gson gson, StringBuilder stringBuilder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] stringBuilderToSplitArray(String stopBy, StringBuilder stringBuilder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> stringBuilderToMap(Gson gson, StringBuilder stringBuilder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] stringToArray(String stopBy, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String stringArrayToString(String[] strings) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String stringToURIencode(String string, String encoding) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String stringToURIencode(String string) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String uRIencodeToURIdecode(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String uRIencodeToURIdecode(String string, String encode) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] stringToCharASCII(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String charsetSwap(String string, String inputCharset, String outputCharset)
			throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String objectToJsonString(Gson gson, Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[][][] matrixShiftSwapXYZ(Object[][][] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[][][] matrixInclineSwapXY(Object[][][] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[][][] matrixInclineSwapXZ(Object[][][] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[][][] matrixInclineSwapYZ(Object[][][] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[][][] matrixReverseSwap(Object[][][] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[][][] matrixReverseSwapXY(Object[][][] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[][][] matrixReverseSwapXZ(Object[][][] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[][][] matrixReverseSwapYZ(Object[][][] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] matrixToArray(Object[][][] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[][] matrixInclineSwap(Object[][] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[][] matrixPostSwap(Object[][] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[][] matrixInSwap(Object[][] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[][] matrixReverseSwap(Object[][] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] matrixToArray(Object[][] objects) {
		// TODO Auto-generated method stub
		return null;
	}
}
