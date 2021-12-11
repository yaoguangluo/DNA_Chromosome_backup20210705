package SEM.bloom;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.json.JSONArray;
import org.json.JSONObject;

import ME.APM.VSQ.App;
import PEI.thread.MakeContainerZNSZ;
import PEU.P.classification.ObjectClassification;
import PEU.P.dna.Token;
import PEU.P.image.ConvexHull.Vertex;
import PEU.P.md5.Usr;
import PEU.P.md5.UsrToken;
import PEU.P.movie.LYGFileIO;
import PEU.P.table.TableSorterZYNK;
import PEU.P.time.TimeCheck;
// ����Ȩ��+ ����= ������
//С����˼������Դ������ϸrefer ���ͺ�������������ע�͡�
// �Ժ�һһ�ѽӿں������� ʵ������
public class StaticFunctionMapU_AOPM_E implements StaticFunctionMapU_AOPM_C{
	//Cache_M ��ѡjdk�� ��
	//ObjectClassification
	public Map<String, Map<String, Object>>mapClassification(Map<String, Object> input, String[] keywords){
		return ObjectClassification.mapClassification(input, keywords);
	};

	public Map<String, Map<String, Object>>mapClassification2D(Map<String, Object> input, String[] keywords){
		return ObjectClassification.mapClassification2D(input, keywords);
	};// �Ժ�һһ�ѽӿں������� ʵ������

	public Map<String, String[]>stringClassification2D(String[] input, String[] keywords){
		return null;};// �Ժ�һһ�ѽӿں������� ʵ������
	public Map<String, List<String>>listClassification2D(List<String> input, String[] keywords){
		return null;};// �Ժ�һһ�ѽӿں������� ʵ���������������������������еġ�

	//ObjectCombination {
	public Map<String, Object> mapCombination(Map<String, Object> output, Map<String, Object> destination){
		return destination;};
	public List<Object> listCombination(List<Object> output, List<Object> destination){
		return destination;};
	public int[] intArrayCombination(int[] output, int[] destination){
		return destination;};
	public double[] doubleArrayCombination(double[] output, double[] destination){
		return destination;};
	public long[] longArrayCombination(long[] output, long[] destination){
		return destination;};
	public float[] floatArrayCombination(float[] output, float[] destination){
		return destination;};
	public String[] StringArrayCombination(String[] output, String[] destination){
		return destination;};
	public char[] charArrayCombination(char[] output, char[] destination){
		return destination;};
	public byte[] byteArrayCombination(byte[] output, byte[] destination){
		return destination;};
	public Vector<Object> vectorCombination(Vector<Object> output, Vector<Object> destination){
		return destination;};

	//DNAAuth {
	public boolean DNAAuthStatusCheckEmailAndPds(App app, String string, Map<String, String> data) throws Exception{
		return false;};
	public boolean DNAAuthStatusCheckEmailAndPde(App app, String string, Map<String, String> data) throws Exception{
		return false;};
	public boolean DNAAuthStatusCheckEmailAndPassword(App app, String string, Map<String, String> data) throws Exception{
		return false;};
	public boolean DNAAuthCheck(App app, String string, Map<String, String> data) throws Exception{
		return false;};

	//StringUtil {
	public String encode(String input) throws Exception{
		return input;};
	public String decode(String str){
		return str;};
	public String EncoderByMd5(String salt, String pwd, int enctimes) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		return pwd;};
	public String EncoderByMd5(String salt, String pwd) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		return pwd;};
	public String EncoderByDNA(String key, String uPassword, Token token){
		return uPassword;};

	//TokenUtil {
	public Token getNewTokenFromUsrAndUsrToken(Usr usr, UsrToken usrToken)throws Exception{
		return null;};
	public String getSecondMD5Password(String uPassword) throws Exception{
		return uPassword;};
	public String getFirstMD5Password(String key, String uPassword) throws Exception{
		return uPassword;};
	public String getFirstDNAPassword(String key, String uPassword, Token token){
		return uPassword;};
	public Token getNewTokenFromUsrAndUsrTokenByDNA(Usr usr, UsrToken usrToken)throws Exception{
		return null;};

	//image
	// CheckRange {
	public int[][] CheckRange_P(int[][] g) throws IOException{
		return g;};

	//Closing {
	public int[][] Closing_P(int[][]g,int[][]kenel){
		return kenel;};

	//Color_P {
	public String Color_P(int r,int g,int b){
		return null;};

	//ConvexHull {		
	public List<Vertex> convexHull(List<Vertex> vertices){
		return vertices;};
	public int compareSlope(int dy2, int dx2, int dy1, int dx1){
		return dx1;};
	public void PNGWrite(int[][] g, int pix, String output) throws IOException{};
	public void CSVWrite(int[][] g, int pix, String outputcsv) throws IOException{};

	//Dilation{
	public int[][] Dilation_P(int[][] g, int[][] kenel){
		return kenel;};

	//Emboss {
	public int[][] Emboss_P( int[][] g) throws IOException{
		return g;};

	//Erosion{
	public int[][] Erosion_P(int[][] g, int[][] kenel){
		return kenel;};

	// GetMean {
	public double print_Mean(int[][] outDIR){
		return 0;};
	public double print_Mean(double[][] outDIR){
		return 0;};

	//Group_O { �Ժ�� �Ǹ�������Ȩ�ļ�ʮ���߳�ȥ��
	public double[][] GO(int[][] kener,int[][] refG,int[] size ){
		return null;};

	//Guassian {
	public int[][] Guassian_P_2D(int[][] g,int d,int e,double sig) throws IOException{
		return g;};
	public int[][] Guassian_P_1D(int[][] g,int frection,int kernel,double sig) throws IOException{
		return g;};
	public BufferedImage Guassian_P(BufferedImage lygimage, double d, double e,double k)throws IOException{
		return lygimage;};

	// HitAndMiss{
	public int[][] HitAndMiss_P(int[][] g, int pix, int[][] kenel) throws IOException{
		return kenel;};

	//HoughTransform {
	public void HoughTransformLoop(int[][] g, int pix,int scale){};
	public void IV_HTMatrix(int[][] g){};

	//Laplacian {
	public int[][] Laplacian_P( int[][] g) throws IOException{
		return g;};

	//Mask {
	public int[][] Mask_P(int[][] mag,int[][]dir) throws IOException{
		return dir;};

	//Median {
	public int[][] Median_P(int[][] g,int d,int e) throws IOException{
		return g;};
	public BufferedImage Median_P(BufferedImage lygimage, int d, int e) throws IOException{
		return lygimage;};

	//Opening {
	public int[][] Opening_P(int[][]g,int[][]kenel){
		return kenel;};
	//PrintMoments{
	public void PrintCurrent(int[][]g,int pix){};

	//ReadWritePng {	
	public void writePNG(String args,  int[][] outmag) throws IOException{};
	public void writePNG(String args,  int[][][] outmag) throws IOException{};
	public int[][] GRNpngRead(String args) throws IOException{
		return null;};
	public int[][] GRNpngRead(BufferedImage image) throws IOException{
		return null;};
	public int[][] REDpngRead(String args) throws IOException{
		return null;};
	public int[][] REDpngRead(BufferedImage image) throws IOException{
		return null;};
	public int[][] BLUpngRead(String args) throws IOException{
		return null;};	
	public int[][] BLUpngRead(BufferedImage image) throws IOException{
		return null;};
	public int[] sizeHW(String args) throws IOException{
		return null;};
	public BufferedImage createBufferImage(int[][] r, int[][] g, int[][] b){
		return null;};

	//RedRaf{
	public int[][] smallToNormal(int r[][],int s, int b){
		return r;};	

	//Reflection {//renhat���ڵ��Ժ��޳�ȥ
	public int[][] PadImage (int[][] _image, int height, int width){
		return _image;};

	//RegionGet {
	public void RegionGet(int[][] g) throws IOException{};
	public void buildGraph(int[][] g,String output) throws IOException{};

	//Sobel {
	public int[][] Sobel_P( int[][] g,int choice) throws IOException{
		return g;};
	public int[][] Sobel_P_WithMask(int[][]  g, int choice, int mask) throws IOException{
		return g;};

	//Strech {
	public int[][] Strech_P(int[][] g,double d,double e) throws IOException{
		return g;};
	public BufferedImage Strech_P(BufferedImage lygimage, double d, double e) throws IOException{
		return lygimage;};

	//Threshold {
	public int[][] Threshold_P(int[][] g, int Td){
		return g;};
	public int[][] Threshold_P_Section(int[][] g, int Ts, int Td){
		return g;};

	//VtoV{ �Ƴ�����Ȩ�� �� u vecs �Ѿ����ֵ��Ժ��޳���ȥ�� 
	public JSONObject XmlToJsonObject(String response ){
		return null;};
	public Map<String, Object> JsonObjectToMap(JSONObject response ){
		return null;};
	public String MapToJsonString(Map<String, Object> response ){
		return null;};
	public String ListToJsonString(List<Object> response ){
		return null;};
	public String ObjectToJsonString(Object response ){
		return null;};
	public Map<String, Object> XmlToMap(String response){
		return null;};
	public String MapToXml(Map<String, Object> response){
		return null;};
	public List<Object> JsonArrayToList(JSONArray jobj){
		return null;};

	//CnnMeasure{
	public double[][] getCnnMeansure(double inputs[][]){
		return inputs;};

	//StringUtil { ����git�� ��������refer �� ��������汾����refer ������ϸ˵��
	//md5 �ٷ� ע���£��Ժ��� dna MD5����Ϊ��� ��� ������eclipse����һ�¸ա�
	//	public String encode(String input) throws Exception{};
	//	public String decode(String str) throws UnsupportedEncodingException{};
	//	public String EncoderByMd5(String salt, String pwd, int enctimes) throws NoSuchAlgorithmException, UnsupportedEncodingException{};
	//	public String EncoderByMd5(String salt, String pwd) throws NoSuchAlgorithmException, UnsupportedEncodingException{};

	//WAVtoLYG{ ��ǰ�����Ƶ�ļ��ܺ����á�
	public void WAVtoLYG(String WAVf, String LYGf) throws IOException, UnsupportedAudioFileException{};
	//LYGFileIO
	public LYGFileIO initWithFFT(double fft[], MakeContainerZNSZ makeContainerZNSZ){
		return null;};
	public void lygRead(String filepath) throws IOException{};
	public void lygWrite(String string) throws IOException{};
	public void IQ_header(RandomAccessFile raf) throws IOException{};
	public void IV_ByAudioBytes(AudioFormat af){};

	//DETA_ANN_HMM {
	public String[][] summing_P(String[][] inputNLP) throws IOException, InstantiationException, IllegalAccessException{
		return inputNLP;};
	//DETA_DNN {
	public String[][] summing_P(String[][] ann, String[][] rnn) throws IOException, InstantiationException, IllegalAccessException{
		return rnn;};

	//sort he search û��ʵ�ü�ֵ  �� top5Dsort���ԣ��Ժ��һ�� ���ƾ��ı��search �����ȡ������ɺ�����
	//�����˲����� �ԣ��������ͳһ�ӿڣ���Ϊ�漰�����������򣬱���ȥ���ŵ�������ٸ����з���

	//tablesort 
	public TableSorterZYNK initATableSorterZYNK(){
		return null;}; 
	public TimeCheck initATimeCheck(){
		return null;};

	//wave 
	//Common{
	public double[] zhiShu(double[] input, double scale,double shehold){
		return input;};

	//Copy{
	public double[][] copy2d(double[][] input,double scale){
		return input;};
	public double[]copy1d(double[] input,double scale){
		return input;};
	public double[]copy1dx2(double[] input,double scale){
		return input;};

	//DFT
	public void initADFT(){};

	//FFT
	public void initAFFT(){};

	//Guassian{
	public double[] guassian1d(double[] input, double scale ){
		return input;};

	//Laplasian{
	public double[] laplasian1d(double[] input, double scale ){
		return input;};

	//MaxAndMin{
	public double max_v(double[] input){
		return 0;};
	public double max_i(double[] input){
		return 0;};
	public double min_v(double[] input,double rank){
		return rank;};
	public double min_i(double[] input, double rank){
		return rank;};

	//Median{
	public double[] median1d(double[] input, double scale ){
		return input;};

	//PeakStatistic{
	public double[][] fengTong1(double[] input){
		return null;};
	public double[][] fengPaixX(double[][] input){
		return input;};
	public double[][] fengPaiyY(double[][] input){
		return input;};
	public double[][] fengPaiXx(double[][] input){
		return input;};
	public double[][] fengPaiYy(double[][] input){
		return input;};

	//Proportion{
	public double[] newX(double[] input, double width){
		return input;};
	public double[] newY(double[] input, double hight){
		return input;};
	public double[] newXY(double[] input, double width, double hight ){
		return input;};
	public double[] newXYBest(double[] input, double width, double hight ){
		return input;};
	public double[] newYwithoutBound(double[] input, double hight){
		return input;};
	public double[] newXYYwithoutBound(double[] input, double width, double hight ){
		return input;};

	//Quantification{
	public double[] liangHuaDengChaAdd(double[] input, double scale){
		return input;};
	public double[] liangHuaXiHua(double[] input,double scale){
		return input;};

	public double[] liangHuaDengChaMines(double[] input, int scale){
		return input;};
	public double[] liangHuaEqualDelete(double[] input){
		return input;};
	public double[] liangHuaXiHuaHalfSide(double[] input){
		return input;};
	//Shehold{
	public double[] shehold1(double[] input, double scale){
		return input;};
	//Tailor{
	public double[] caiJian1(double[] input, double left,double right){
		return input;};

	//UnZip {
	public void unZipWithPath(String zipFullPath, String zipCategory){};

	//BootBackup {  
	public void bootBackupByUsingGzip(String zipPath){};
	//sourceFilePath is a root category of ��ѹ�����ļ�Ŀ¼
	//zipFilePath is a zip category of ѹ�����ļ�Ŀ¼��
	//fileName is a zip file name
	public boolean fileToZip(String sourceFilePath, String zipFilePath, String fileName){
		return false;};

	//GzipUtil {
	// ѹ��
	public byte[] compress(byte[] data) throws IOException{
		return data;};
	public byte[] compress(String str, String stringTypes) throws IOException{
		return null;};
	public byte[] uncompress(byte[] data) throws IOException{
		return data;};

	//Filter{
	public int[][] P_Heart(int[][] rp1, int distance, int scale){
		return rp1;};
	public int[][] P_Model(int[][] rp1, int[][] yanjing){
		return yanjing;};//�ֲڰ汾�Ժ��Ż���
}

