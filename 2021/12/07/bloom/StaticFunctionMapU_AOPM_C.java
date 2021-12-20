package SEM.bloom;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.sound.sampled.UnsupportedAudioFileException;

import ME.APM.VSQ.App;
import PEU.P.dna.Token;
import PEU.P.image.ConvexHull.Vertex;
import PEU.P.md5.Usr;
import PEU.P.md5.UsrToken;
import PEU.P.table.TableSorterZYNK;
import PEU.P.time.TimeCheck;
//����Ȩ��+ ����= ������
public interface StaticFunctionMapU_AOPM_C {
	public static void load(StaticFunctionMapU_AOPM_E staticFunctionMapU_AOPM_E) {
		// TODO Auto-generated method stub
		//�Ժ��װ
		staticFunctionMapU_AOPM_E.annotationMap.put("mapClassification", "mapClassification");
		staticFunctionMapU_AOPM_E.annotationMap.put("mapClassification2D", "mapClassification2D");
		staticFunctionMapU_AOPM_E.annotationMap.put("stringClassification2D", "stringClassification2D");
		staticFunctionMapU_AOPM_E.annotationMap.put("listClassification2D", "listClassification2D");
		staticFunctionMapU_AOPM_E.annotationMap.put("mapCombination", "mapCombination");
		staticFunctionMapU_AOPM_E.annotationMap.put("listCombination", "listCombination");
		staticFunctionMapU_AOPM_E.annotationMap.put("intArrayCombination", "intArrayCombination");
		staticFunctionMapU_AOPM_E.annotationMap.put("doubleArrayCombination", "doubleArrayCombination");
		staticFunctionMapU_AOPM_E.annotationMap.put("longArrayCombination", "longArrayCombination");
		staticFunctionMapU_AOPM_E.annotationMap.put("floatArrayCombination", "floatArrayCombination");
		staticFunctionMapU_AOPM_E.annotationMap.put("StringArrayCombination", "StringArrayCombination");
		staticFunctionMapU_AOPM_E.annotationMap.put("charArrayCombination", "charArrayCombination");
		staticFunctionMapU_AOPM_E.annotationMap.put("byteArrayCombination", "byteArrayCombination");
		staticFunctionMapU_AOPM_E.annotationMap.put("vectorCombination", "vectorCombination");
		staticFunctionMapU_AOPM_E.annotationMap.put("DNAAuthStatusCheckEmailAndPds", "DNAAuthStatusCheckEmailAndPds");
		staticFunctionMapU_AOPM_E.annotationMap.put("DNAAuthStatusCheckEmailAndPde", "DNAAuthStatusCheckEmailAndPde");
		staticFunctionMapU_AOPM_E.annotationMap.put("DNAAuthStatusCheckEmailAndPassword", "DNAAuthStatusCheckEmailAndPassword");
		staticFunctionMapU_AOPM_E.annotationMap.put("DNAAuthCheck", "DNAAuthCheck");
		staticFunctionMapU_AOPM_E.annotationMap.put("encode", "encode");
		staticFunctionMapU_AOPM_E.annotationMap.put("decode", "decode");
		staticFunctionMapU_AOPM_E.annotationMap.put("EncoderByMd5", "EncoderByMd5");
		staticFunctionMapU_AOPM_E.annotationMap.put("EncoderByDNA", "EncoderByDNA");
		staticFunctionMapU_AOPM_E.annotationMap.put("getNewTokenFromUsrAndUsrToken", "getNewTokenFromUsrAndUsrToken");
		staticFunctionMapU_AOPM_E.annotationMap.put("getSecondMD5Password", "getSecondMD5Password");
		staticFunctionMapU_AOPM_E.annotationMap.put("getFirstMD5Password", "getFirstMD5Password");
		staticFunctionMapU_AOPM_E.annotationMap.put("getFirstDNAPassword", "getFirstDNAPassword");
		staticFunctionMapU_AOPM_E.annotationMap.put("getNewTokenFromUsrAndUsrTokenByDNA", "getNewTokenFromUsrAndUsrTokenByDNA");
		staticFunctionMapU_AOPM_E.annotationMap.put("CheckRange_P", "CheckRange_P");
		staticFunctionMapU_AOPM_E.annotationMap.put("Closing_P", "Closing_P");
		staticFunctionMapU_AOPM_E.annotationMap.put("Color_P", "Color_P");
		staticFunctionMapU_AOPM_E.annotationMap.put("convexHull", "convexHull");
		staticFunctionMapU_AOPM_E.annotationMap.put("compareSlope", "compareSlope");
		staticFunctionMapU_AOPM_E.annotationMap.put("PNGWrite", "PNGWrite");
		staticFunctionMapU_AOPM_E.annotationMap.put("CSVWrite", "CSVWrite");
		staticFunctionMapU_AOPM_E.annotationMap.put("Dilation_P", "Dilation_P");
		staticFunctionMapU_AOPM_E.annotationMap.put("Emboss_P", "Emboss_P");
		staticFunctionMapU_AOPM_E.annotationMap.put("Erosion_P", "Erosion_P");
		staticFunctionMapU_AOPM_E.annotationMap.put("print_Mean", "print_Mean");
		staticFunctionMapU_AOPM_E.annotationMap.put("print_Mean", "print_Mean");
		staticFunctionMapU_AOPM_E.annotationMap.put("Guassian_P_2D", "Guassian_P_2D");
		staticFunctionMapU_AOPM_E.annotationMap.put("Guassian_P_1D", "Guassian_P_1D");
		staticFunctionMapU_AOPM_E.annotationMap.put("Guassian_P", "Guassian_P");
		staticFunctionMapU_AOPM_E.annotationMap.put("HitAndMiss_P", "HitAndMiss_P");
		staticFunctionMapU_AOPM_E.annotationMap.put("HoughTransformLoop", "HoughTransformLoop");
		staticFunctionMapU_AOPM_E.annotationMap.put("IV_HTMatrix", "IV_HTMatrix");
		staticFunctionMapU_AOPM_E.annotationMap.put("Laplacian_P", "Laplacian_P");
		staticFunctionMapU_AOPM_E.annotationMap.put("Mask_P", "Mask_P");
		staticFunctionMapU_AOPM_E.annotationMap.put("Median_P", "Median_P");
		staticFunctionMapU_AOPM_E.annotationMap.put("Opening_P", "Opening_P");
		staticFunctionMapU_AOPM_E.annotationMap.put("PrintCurrent", "PrintCurrent");
		staticFunctionMapU_AOPM_E.annotationMap.put("writePNG", "writePNG");
		staticFunctionMapU_AOPM_E.annotationMap.put("GRNpngRead", "GRNpngRead");
		staticFunctionMapU_AOPM_E.annotationMap.put("REDpngRead", "REDpngRead");
		staticFunctionMapU_AOPM_E.annotationMap.put("BLUpngRead", "BLUpngRead");
		staticFunctionMapU_AOPM_E.annotationMap.put("sizeHW", "sizeHW");
		staticFunctionMapU_AOPM_E.annotationMap.put("createBufferImage", "createBufferImage");
		staticFunctionMapU_AOPM_E.annotationMap.put("smallToNormal", "smallToNormal");
		staticFunctionMapU_AOPM_E.annotationMap.put("PadImage", "PadImage");
		staticFunctionMapU_AOPM_E.annotationMap.put("RegionGet", "RegionGet");
		staticFunctionMapU_AOPM_E.annotationMap.put("buildGraph", "buildGraph");
		staticFunctionMapU_AOPM_E.annotationMap.put("Sobel_P", "Sobel_P");
		staticFunctionMapU_AOPM_E.annotationMap.put("Sobel_P_WithMask", "Sobel_P_WithMask");
		staticFunctionMapU_AOPM_E.annotationMap.put("Strech_P", "Strech_P");
		staticFunctionMapU_AOPM_E.annotationMap.put("Threshold_P", "Threshold_P");
		staticFunctionMapU_AOPM_E.annotationMap.put("getCnnMeansure", "getCnnMeansure");
		staticFunctionMapU_AOPM_E.annotationMap.put("WAVtoLYG", "WAVtoLYG");
		staticFunctionMapU_AOPM_E.annotationMap.put("summing_P", "summing_P");
		staticFunctionMapU_AOPM_E.annotationMap.put("initATableSorterZYNK", "initATableSorterZYNK");
		staticFunctionMapU_AOPM_E.annotationMap.put("initATimeCheck", "initATimeCheck");
		
		staticFunctionMapU_AOPM_E.annotationMap.put("zhiShu", "zhiShu");
		staticFunctionMapU_AOPM_E.annotationMap.put("copy2d", "copy2d");
		staticFunctionMapU_AOPM_E.annotationMap.put("copy1d", "copy1d");
		staticFunctionMapU_AOPM_E.annotationMap.put("copy1dx2", "copy1dx2");
		
		staticFunctionMapU_AOPM_E.annotationMap.put("initADFT", "initADFT");
		staticFunctionMapU_AOPM_E.annotationMap.put("initAFFT", "initAFFT");
		staticFunctionMapU_AOPM_E.annotationMap.put("guassian1d", "guassian1d");
		staticFunctionMapU_AOPM_E.annotationMap.put("laplasian1d", "laplasian1d");
		staticFunctionMapU_AOPM_E.annotationMap.put("max_v", "max_v");
		staticFunctionMapU_AOPM_E.annotationMap.put("max_i", "max_i");
	 
		staticFunctionMapU_AOPM_E.annotationMap.put("min_v", "min_v");
		staticFunctionMapU_AOPM_E.annotationMap.put("min_i", "min_i");
		staticFunctionMapU_AOPM_E.annotationMap.put("median1d", "median1d");
		staticFunctionMapU_AOPM_E.annotationMap.put("fengTong1", "fengTong1");
		staticFunctionMapU_AOPM_E.annotationMap.put("fengPaixX", "fengPaixX");
		staticFunctionMapU_AOPM_E.annotationMap.put("fengPaiyY", "fengPaiyY");
		staticFunctionMapU_AOPM_E.annotationMap.put("fengPaiXx", "fengPaiXx");
		staticFunctionMapU_AOPM_E.annotationMap.put("fengPaiYy", "fengPaiYy");
		staticFunctionMapU_AOPM_E.annotationMap.put("newX", "newX");
		
		staticFunctionMapU_AOPM_E.annotationMap.put("newY", "newY");
		staticFunctionMapU_AOPM_E.annotationMap.put("newXY", "newXY");
		staticFunctionMapU_AOPM_E.annotationMap.put("newXYBest", "newXYBest");
		staticFunctionMapU_AOPM_E.annotationMap.put("newYwithoutBound", "newYwithoutBound");
		staticFunctionMapU_AOPM_E.annotationMap.put("newXYYwithoutBound", "newXYYwithoutBound");
		staticFunctionMapU_AOPM_E.annotationMap.put("liangHuaDengChaAdd", "liangHuaDengChaAdd");
		staticFunctionMapU_AOPM_E.annotationMap.put("liangHuaXiHua", "liangHuaXiHua");
		
		staticFunctionMapU_AOPM_E.annotationMap.put("liangHuaDengChaMines", "liangHuaDengChaMines");
		staticFunctionMapU_AOPM_E.annotationMap.put("liangHuaEqualDelete", "liangHuaEqualDelete");
		staticFunctionMapU_AOPM_E.annotationMap.put("liangHuaXiHuaHalfSide", "liangHuaXiHuaHalfSide");
		staticFunctionMapU_AOPM_E.annotationMap.put("shehold1", "shehold1");
		staticFunctionMapU_AOPM_E.annotationMap.put("caiJian1", "caiJian1");
		staticFunctionMapU_AOPM_E.annotationMap.put("unZipWithPath", "unZipWithPath");
		staticFunctionMapU_AOPM_E.annotationMap.put("bootBackupByUsingGzip", "bootBackupByUsingGzip");
		staticFunctionMapU_AOPM_E.annotationMap.put("fileToZip", "fileToZip");
		staticFunctionMapU_AOPM_E.annotationMap.put("compress", "compress");
		staticFunctionMapU_AOPM_E.annotationMap.put("uncompress", "uncompress");
		
		staticFunctionMapU_AOPM_E.annotationMap.put("P_Heart", "P_Heart");
		staticFunctionMapU_AOPM_E.annotationMap.put("P_Model", "P_Model");
	}
	//Cache_M ��ѡjdk�� ��
	//ObjectClassification
	public Map<String, Map<String, Object>>mapClassification(Map<String, Object> input, String[] keywords);
	public Map<String, Map<String, Object>>mapClassification2D(Map<String, Object> input, String[] keywords);
	public Map<String, String[]>stringClassification2D(String[] input, String[] keywords);
	public Map<String, List<String>>listClassification2D(List<String> input, String[] keywords);

	//ObjectCombination {
	public Map<String, Object> mapCombination(Map<String, Object> output, Map<String, Object> destination);
	public List<Object> listCombination(List<Object> output, List<Object> destination);
	public int[] intArrayCombination(int[] output, int[] destination);
	public double[] doubleArrayCombination(double[] output, double[] destination);
	public long[] longArrayCombination(long[] output, long[] destination);
	
	public float[] floatArrayCombination(float[] output, float[] destination);
	public String[] StringArrayCombination(String[] output, String[] destination);
	public char[] charArrayCombination(char[] output, char[] destination);
	public byte[] byteArrayCombination(byte[] output, byte[] destination);
	public Vector<Object> vectorCombination(Vector<Object> output, Vector<Object> destination);

	//DNAAuth {
	public boolean DNAAuthStatusCheckEmailAndPds(App app, String string, Map<String, String> data) throws Exception;
	public boolean DNAAuthStatusCheckEmailAndPde(App app, String string, Map<String, String> data) throws Exception;
	public boolean DNAAuthStatusCheckEmailAndPassword(App app, String string, Map<String, String> data) throws Exception;
	public boolean DNAAuthCheck(App app, String string, Map<String, String> data) throws Exception;

	//StringUtil {
	public String encode(String input) throws Exception;
	public String decode(String str) ;
	public String EncoderByMd5(String salt, String pwd, int enctimes) throws NoSuchAlgorithmException, UnsupportedEncodingException;
	public String EncoderByMd5(String salt, String pwd) throws NoSuchAlgorithmException, UnsupportedEncodingException;
	public String EncoderByDNA(String key, String uPassword, Token token);

	//TokenUtil {
	public Token getNewTokenFromUsrAndUsrToken(Usr usr, UsrToken usrToken)throws Exception;
	public String getSecondMD5Password(String uPassword) throws Exception;
	public String getFirstMD5Password(String key, String uPassword) throws Exception;
	public String getFirstDNAPassword(String key, String uPassword, Token token);
	public Token getNewTokenFromUsrAndUsrTokenByDNA(Usr usr, UsrToken usrToken)throws Exception;

	//image
	// CheckRange {
	public int[][] CheckRange_P(int[][] g) throws IOException;

	//Closing {
	public int[][] Closing_P(int[][]g,int[][]kenel);

	//Color_P {
	public String Color_P(int r,int g,int b);

	//ConvexHull {		
	public List<Vertex> convexHull(List<Vertex> vertices);
	public int compareSlope(int dy2, int dx2, int dy1, int dx1) ;
	public void PNGWrite(int[][] g, int pix, String output) throws IOException;
	public void CSVWrite(int[][] g, int pix, String outputcsv) throws IOException;

	//Dilation{
	public int[][] Dilation_P(int[][] g, int[][] kenel) ;

	//Emboss {
	public int[][] Emboss_P( int[][] g) throws IOException ;

	//Erosion{
	public int[][] Erosion_P(int[][] g, int[][] kenel);

	// GetMean {
	public double print_Mean(int[][] outDIR);
	public double print_Mean(double[][] outDIR);

	////Group_O { �Ժ�� �Ǹ�������Ȩ�ļ�ʮ���߳�ȥ��
	//public double[][] GO(int[][] kener,int[][] refG,int[] size);

	//Guassian {
	public int[][] Guassian_P_2D(int[][] g,int d,int e,double sig) throws IOException;
	public int[][] Guassian_P_1D(int[][] g,int frection,int kernel,double sig) throws IOException;
	public BufferedImage Guassian_P(BufferedImage lygimage, double d, double e,double k)throws IOException ;

	// HitAndMiss{
	public int[][] HitAndMiss_P(int[][] g, int pix, int[][] kenel) throws IOException;

	//HoughTransform {
	public void HoughTransformLoop(int[][] g, int pix,int scale);
	public void IV_HTMatrix(int[][] g) ;

	//Laplacian {
	public int[][] Laplacian_P( int[][] g) throws IOException;

	//Mask {
	public int[][] Mask_P(int[][] mag,int[][]dir) throws IOException;

	//Median {
	public int[][] Median_P(int[][] g,int d,int e) throws IOException;
	public BufferedImage Median_P(BufferedImage lygimage, int d, int e) throws IOException;

	//Opening {
	public int[][] Opening_P(int[][]g,int[][]kenel);
	//PrintMoments{
	public void PrintCurrent(int[][]g,int pix) ;

	//ReadWritePng {	
	public void writePNG(String args,  int[][] outmag) throws IOException;
	public void writePNG(String args,  int[][][] outmag) throws IOException;
	public int[][] GRNpngRead(String args) throws IOException;
	public int[][] GRNpngRead(BufferedImage image) throws IOException;
	public int[][] REDpngRead(String args) throws IOException;
	public int[][] REDpngRead(BufferedImage image) throws IOException;
	public int[][] BLUpngRead(String args) throws IOException;	
	public int[][] BLUpngRead(BufferedImage image) throws IOException;
	public int[] sizeHW(String args) throws IOException;
	public BufferedImage createBufferImage(int[][] r, int[][] g, int[][] b);

	//RedRaf{
	public int[][] smallToNormal(int r[][],int s, int b) ;	

	//Reflection {//renhat���ڵ��Ժ��޳�ȥ
	public int[][] PadImage (int[][] _image, int height, int width);

	//RegionGet {
	public void RegionGet(int[][] g) throws IOException;
	public void buildGraph(int[][] g,String output) throws IOException;

	//Sobel {
	public int[][] Sobel_P( int[][] g,int choice) throws IOException;
	public int[][] Sobel_P_WithMask(int[][]  g, int choice, int mask) throws IOException;

	//Strech {
	public int[][] Strech_P(int[][] g,double d,double e) throws IOException;
	public BufferedImage Strech_P(BufferedImage lygimage, double d, double e) throws IOException;

	//Threshold {
	public int[][] Threshold_P(int[][] g, int Td);
	public int[][] Threshold_P_Section(int[][] g, int Ts, int Td);

	////VtoV{ �Ƴ�����Ȩ�� �� u vecs �Ѿ����ֵ��Ժ��޳���ȥ����ע�͵�
	//public JSONObject XmlToJsonObject(String response);
	//public Map<String, Object> JsonObjectToMap(JSONObject response);
	//public String MapToJsonString(Map<String, Object> response);
	//public String ListToJsonString(List<Object> response);
	//public String ObjectToJsonString(Object response);
	//public Map<String, Object> XmlToMap(String response);
	//public String MapToXml(Map<String, Object> response);
	//public List<Object> JsonArrayToList(JSONArray jobj);

	//CnnMeasure{
	public double[][] getCnnMeansure(double inputs[][]);

	//StringUtil { ����git�� ��������refer �� ��������汾����refer ������ϸ˵��
	//md5 �ٷ� ע���£��Ժ��� dna MD5����Ϊ��� ��� ������eclipse����һ�¸ա�
	//public String encode(String input) throws Exception ;
	//public String decode(String str) throws UnsupportedEncodingException;
	//public String EncoderByMd5(String salt, String pwd, int enctimes) throws NoSuchAlgorithmException, UnsupportedEncodingException ;
	//public String EncoderByMd5(String salt, String pwd) throws NoSuchAlgorithmException, UnsupportedEncodingException ;

	//WAVtoLYG{ ��ǰ�����Ƶ�ļ��ܺ����á�
	public void WAVtoLYG(String WAVf, String LYGf) throws IOException, UnsupportedAudioFileException;
	//LYGFileIO
	//public LYGFileIO initWithFFT(double fft[], MakeContainerZNSZ makeContainerZNSZ);
	//public void lygRead(String filepath) throws IOException ;
	//public void lygWrite(String string) throws IOException ;
	//public void IQ_header(RandomAccessFile raf) throws IOException ;
	//public void IV_ByAudioBytes(AudioFormat af) ;

	//DETA_ANN_HMM {
	public String[][] summing_P(String[][] inputNLP) throws IOException, InstantiationException, IllegalAccessException;
	//DETA_DNN {
	public String[][] summing_P(String[][] ann, String[][] rnn) throws IOException, InstantiationException, IllegalAccessException ;

	//sort he search û��ʵ�ü�ֵ  �� top5Dsort���ԣ��Ժ��һ�� ���ƾ��ı��search �����ȡ������ɺ�����
	//�����˲����� �ԣ��������ͳһ�ӿڣ���Ϊ�漰�����������򣬱���ȥ���ŵ�������ٸ����з���

	//tablesort 
	public TableSorterZYNK initATableSorterZYNK(); 
	public TimeCheck initATimeCheck();

	//wave 
	//Common{
	public double[] zhiShu(double[] input, double scale,double shehold);

	//Copy{
	public double[][] copy2d(double[][] input,double scale);
	public double[]copy1d(double[] input,double scale);
	public double[]copy1dx2(double[] input,double scale);

	//DFT
	public void initADFT();

	//FFT
	public void initAFFT();

	//Guassian{
	public double[] guassian1d(double[] input, double scale);

	//Laplasian{
	public double[] laplasian1d(double[] input, double scale);

	//MaxAndMin{
	public double max_v(double[] input) ;
	public double max_i(double[] input) ;
	public double min_v(double[] input,double rank);
	public double min_i(double[] input, double rank) ;

	//Median{
	public double[] median1d(double[] input, double scale ) ;

	//PeakStatistic{
	public double[][] fengTong1(double[] input);
	public double[][] fengPaixX(double[][] input) ;
	public double[][] fengPaiyY(double[][] input);
	public double[][] fengPaiXx(double[][] input);
	public double[][] fengPaiYy(double[][] input);

	//Proportion{
	public double[] newX(double[] input, double width) ;
	public double[] newY(double[] input, double hight) ;
	public double[] newXY(double[] input, double width, double hight ) ;
	public double[] newXYBest(double[] input, double width, double hight ) ;
	public double[] newYwithoutBound(double[] input, double hight);
	public double[] newXYYwithoutBound(double[] input, double width, double hight );

	//Quantification{
	public double[] liangHuaDengChaAdd(double[] input, double scale) ;
	public double[] liangHuaXiHua(double[] input,double scale) ;

	public double[] liangHuaDengChaMines(double[] input, int scale);
	public double[] liangHuaEqualDelete(double[] input) ;
	public double[] liangHuaXiHuaHalfSide(double[] input) ;
	//Shehold{
	public double[] shehold1(double[] input, double scale) ;
	//Tailor{
	public double[] caiJian1(double[] input, double left,double right) ;

	//UnZip {
	public void unZipWithPath(String zipFullPath, String zipCategory);

	//BootBackup {  
	public void bootBackupByUsingGzip(String zipPath);
	//sourceFilePath is a root category of ��ѹ�����ļ�Ŀ¼
	//zipFilePath is a zip category of ѹ�����ļ�Ŀ¼��
	//fileName is a zip file name
	public boolean fileToZip(String sourceFilePath, String zipFilePath, String fileName);

	//GzipUtil {
	// ѹ��
	public byte[] compress(byte[] data) throws IOException;
	public byte[] compress(String str, String stringTypes) throws IOException;
	public byte[] uncompress(byte[] data) throws IOException;

	//Filter{
	public int[][] P_Heart(int[][] rp1, int distance, int scale);
	public int[][] P_Model(int[][] rp1, int[][] yanjing);//�ֲڰ汾�Ժ��Ż���
}