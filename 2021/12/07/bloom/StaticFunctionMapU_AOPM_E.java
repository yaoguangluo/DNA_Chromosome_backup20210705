package SEM.bloom;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.sound.sampled.UnsupportedAudioFileException;
import ME.APM.VSQ.App;
import PEI.thread.MakeContainerZNSZ;
import PEU.P.classification.ObjectClassification;
import PEU.P.combination.ObjectCombination;
import PEU.P.dna.DNAAuth;
import PEU.P.dna.StringUtil;
import PEU.P.dna.Token;
import PEU.P.dna.TokenUtil;
import PEU.P.image.CheckRange;
import PEU.P.image.Closing;
import PEU.P.image.ConvexHull;
import PEU.P.image.ConvexHull.Vertex;
import PEU.P.image.Dilation;
import PEU.P.image.Emboss;
import PEU.P.image.Erosion;
import PEU.P.image.GetMean;
import PEU.P.image.Guassian;
import PEU.P.image.HitAndMiss;
import PEU.P.image.HoughTransform;
import PEU.P.image.Laplacian;
import PEU.P.image.Mask;
import PEU.P.image.Median;
import PEU.P.image.Opening;
import PEU.P.image.PrintMoments;
import PEU.P.image.ReadWritePng;
import PEU.P.image.RedRaf;
import PEU.P.image.Reflection;
import PEU.P.image.Sobel;
import PEU.P.image.Strech;
import PEU.P.image.Threshold;
import PEU.P.matrix.CnnMeasure;
import PEU.P.md5.Usr;
import PEU.P.md5.UsrToken;
import PEU.P.movie.LYGFileIO;
import PEU.P.nlp.DETA_ANN_HMM;
import PEU.P.nlp.DETA_DNN;
import PEU.P.table.TableSorterZYNK;
import PEU.P.time.TimeCheck;
import PEU.P.wave.Common;
import PEU.P.wave.Copy;
import PEU.P.wave.DFT;
import PEU.P.wave.FFT;
import PEU.P.wave.Laplasian;
import PEU.P.wave.MaxAndMin;
import PEU.P.wave.PeakStatistic;
import PEU.P.wave.Proportion;
import PEU.P.wave.Quantification;
import PEU.P.wave.Shehold;
import PEU.P.wave.Tailor;
import PEU.P.zip.BootBackup;
import PEU.P.zip.GzipUtil;
import PEU.P.zip.UnZip;
import PVU.P.image.Filter;
// 著作权人+ 作者= 罗瑶光
//小函数思想与来源，见详细refer ，和函数的描述文字注释。
// 稍后一一把接口函数主体 实例化。
public class StaticFunctionMapU_AOPM_E implements StaticFunctionMapU_AOPM_C{
	//Cache_M 入选jdk， 略
	public Map<String, String> annotationMap= new HashMap<>();
	//ObjectClassification
	public Map<String, Map<String, Object>>mapClassification(Map<String, Object> input, String[] keywords){
		return ObjectClassification.mapClassification(input, keywords);
	};

	public Map<String, Map<String, Object>>mapClassification2D(Map<String, Object> input, String[] keywords){
		return ObjectClassification.mapClassification2D(input, keywords);
	};// 稍后一一把接口函数主体 实例化。

	public Map<String, String[]>stringClassification2D(String[] input, String[] keywords){
		return ObjectClassification.stringClassification2D(input, keywords);
	};// 稍后一一把接口函数主体 实例化。
	public Map<String, List<String>>listClassification2D(List<String> input, String[] keywords){
		return ObjectClassification.listClassification2D(input, keywords);
	};// 稍后一一把接口函数主体 实例化。。。。。。。。下面所有的。

	//ObjectCombination {
	public Map<String, Object> mapCombination(Map<String, Object> output, Map<String, Object> destination){
		return ObjectCombination.mapCombination(output, destination);
	};
	public List<Object> listCombination(List<Object> output, List<Object> destination){
		return ObjectCombination.listCombination(output, destination);
	};
	public int[] intArrayCombination(int[] output, int[] destination){
		return ObjectCombination.intArrayCombination(output, destination);
	};
	public double[] doubleArrayCombination(double[] output, double[] destination){
		return ObjectCombination.doubleArrayCombination(output, destination);
	};
	public long[] longArrayCombination(long[] output, long[] destination){
		return ObjectCombination.longArrayCombination(output, destination);
	};
	public float[] floatArrayCombination(float[] output, float[] destination){
		return ObjectCombination.floatArrayCombination(output, destination);
	};
	public String[] StringArrayCombination(String[] output, String[] destination){
		return ObjectCombination.StringArrayCombination(output, destination);
	};
	public char[] charArrayCombination(char[] output, char[] destination){
		return ObjectCombination.charArrayCombination(output, destination);
	};
	public byte[] byteArrayCombination(byte[] output, byte[] destination){
		return ObjectCombination.byteArrayCombination(output, destination);
	};
	public Vector<Object> vectorCombination(Vector<Object> output, Vector<Object> destination){
		return ObjectCombination.vectorCombination(output, destination);
	};

	//DNAAuth {
	public boolean DNAAuthStatusCheckEmailAndPds(App app, String string, Map<String, String> data) throws Exception{
		return DNAAuth.DNAAuthStatusCheckEmailAndPds(app, string, data);
	};
	public boolean DNAAuthStatusCheckEmailAndPde(App app, String string, Map<String, String> data) throws Exception{
		return DNAAuth.DNAAuthStatusCheckEmailAndPde(app, string, data);
	};
	public boolean DNAAuthStatusCheckEmailAndPassword(App app, String string, Map<String, String> data) throws Exception{
		return DNAAuth.DNAAuthStatusCheckEmailAndPassword(app, string, data);
	};
	public boolean DNAAuthCheck(App app, String string, Map<String, String> data) throws Exception{
		return DNAAuth.DNAAuthCheck(app, string, data);
	};

	//StringUtil {
	public String encode(String input) throws Exception{
		return StringUtil.encode(input);
	};
	public String decode(String str){
		return StringUtil.decode(str);
	};
	public String EncoderByMd5(String salt, String pwd, int enctimes) throws NoSuchAlgorithmException
	, UnsupportedEncodingException{
		return StringUtil.EncoderByMd5(salt, pwd, enctimes);
	};
	public String EncoderByMd5(String salt, String pwd) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		return StringUtil.EncoderByMd5(salt, pwd);
	};
	public String EncoderByDNA(String key, String uPassword, Token token){
		return StringUtil.EncoderByDNA(key, uPassword, token);
	};

	//TokenUtil {
	public Token getNewTokenFromUsrAndUsrToken(Usr usr, UsrToken usrToken)throws Exception{
		return TokenUtil.getNewTokenFromUsrAndUsrToken(usr, usrToken);
	};
	public String getSecondMD5Password(String uPassword) throws Exception{
		return TokenUtil.getSecondMD5Password(uPassword);
	};
	public String getFirstMD5Password(String key, String uPassword) throws Exception{
		return TokenUtil.getFirstMD5Password(key, uPassword);
	};
	public String getFirstDNAPassword(String key, String uPassword, Token token){
		return TokenUtil.getFirstDNAPassword(key, uPassword, token);
	};
	public Token getNewTokenFromUsrAndUsrTokenByDNA(Usr usr, UsrToken usrToken)throws Exception{
		return TokenUtil.getNewTokenFromUsrAndUsrTokenByDNA(usr, usrToken);
	};

	//image
	// CheckRange {
	public int[][] CheckRange_P(int[][] g) throws IOException{
		return new CheckRange().P(g);
	};

	//Closing {
	public int[][] Closing_P(int[][]g,int[][]kenel){
		return new Closing().P(g, kenel);
	};

	//Color_P {
	public String Color_P(int r,int g,int b){
		return new PEU.P.image.Color_P().P(r, g, b);
	};

	//ConvexHull {		
	public List<Vertex> convexHull(List<Vertex> vertices){
		return new ConvexHull().convexHull(vertices);
	};
	public int compareSlope(int dy2, int dx2, int dy1, int dx1){
		return new ConvexHull().compareSlope(dy2, dx2, dy1, dx1);
	};
	public void PNGWrite(int[][] g, int pix, String output) throws IOException{
		new ConvexHull().PNGWrite(g, pix, output);
	};
	public void CSVWrite(int[][] g, int pix, String outputcsv) throws IOException{
		new ConvexHull().CSVWrite(g, pix, outputcsv);
	};

	//Dilation{
	public int[][] Dilation_P(int[][] g, int[][] kenel){
		return new Dilation().P(g, kenel);
	};

	//Emboss {
	public int[][] Emboss_P(int[][] g) throws IOException{
		return new Emboss().P(g);
	};

	//Erosion{
	public int[][] Erosion_P(int[][] g, int[][] kenel){
		return new Erosion().P(g, kenel);
	};

	// GetMean {
	public double print_Mean(int[][] outDIR){
		return new GetMean().print_Mean(outDIR);
	};
	public double print_Mean(double[][] outDIR){
		return new GetMean().print_Mean(outDIR);
	};

	//	//Group_O { 稍后把 非个人著作权的几十行踢出去。
	//	public double[][] GO(int[][] kener,int[][] refG,int[] size){
	//		return null;};

	//Guassian {
	public int[][] Guassian_P_2D(int[][] g,int d,int e,double sig) throws IOException{
		return new Guassian().P_2D(g, d, e, sig);	
	};
	public int[][] Guassian_P_1D(int[][] g,int frection,int kernel,double sig) throws IOException{
		return new Guassian().P_1D(g, frection, kernel, sig);
	};
	public BufferedImage Guassian_P(BufferedImage lygimage, double d, double e,double k)throws IOException{
		return new Guassian().P(lygimage, d, e, k);
	};

	// HitAndMiss{
	public int[][] HitAndMiss_P(int[][] g, int pix, int[][] kenel) throws IOException{
		return new HitAndMiss().P(g, pix, kenel);
	};

	//HoughTransform {
	public void HoughTransformLoop(int[][] g, int pix,int scale){
		new HoughTransform().HoughTransformLoop(g, pix, scale);
	};
	public void IV_HTMatrix(int[][] g){
		new HoughTransform().IV_HTMatrix(g);
	};

	//Laplacian {
	public int[][] Laplacian_P( int[][] g) throws IOException{
		return new Laplacian().P(g);
	};

	//Mask {
	public int[][] Mask_P(int[][] mag,int[][]dir) throws IOException{
		return new Mask().P(mag, dir);
	};

	//Median {
	public int[][] Median_P(int[][] g,int d,int e) throws IOException{
		return new Median().P(g, d, e);
	};

	public BufferedImage Median_P(BufferedImage lygimage, int d, int e) throws IOException{
		return new Median().P(lygimage, d, e);
	};

	//Opening {
	public int[][] Opening_P(int[][]g,int[][]kenel){
		return new Opening().P(g, kenel);
	};
	//PrintMoments{
	public void PrintCurrent(int[][]g,int pix){
		new PrintMoments().PrintCurrent(g, pix);
	};

	//ReadWritePng {	
	public void writePNG(String args,  int[][] outmag) throws IOException{
		new ReadWritePng().writePNG(args, outmag);
	};
	public void writePNG(String args,  int[][][] outmag) throws IOException{
		new ReadWritePng().writePNG(args, outmag);
	};
	public int[][] GRNpngRead(String args) throws IOException{
		return new ReadWritePng().GRNpngRead(args);	
	};
	public int[][] GRNpngRead(BufferedImage image) throws IOException{
		return new ReadWritePng().GRNpngRead(image);
	};
	public int[][] REDpngRead(String args) throws IOException{
		return new ReadWritePng().REDpngRead(args);
	};
	public int[][] REDpngRead(BufferedImage image) throws IOException{
		return new ReadWritePng().REDpngRead(image);
	};
	public int[][] BLUpngRead(String args) throws IOException{
		return new ReadWritePng().BLUpngRead(args);
	};	
	public int[][] BLUpngRead(BufferedImage image) throws IOException{
		return new ReadWritePng().BLUpngRead(image);
	};
	public int[] sizeHW(String args) throws IOException{
		return new ReadWritePng().sizeHW(args);
	};
	public BufferedImage createBufferImage(int[][] r, int[][] g, int[][] b){
		return new ReadWritePng().createBufferImage(r, g, b);
	};

	//RedRaf{
	public int[][] smallToNormal(int r[][],int s, int b){
		return new RedRaf().smallToNormal(r, s, b);
	};	

	//Reflection {//renhat教授的稍后剔出去
	public int[][] PadImage (int[][] _image, int height, int width){
		return new Reflection().PadImage(_image, height, width);
	};

	//RegionGet {
	public void RegionGet(int[][] g) throws IOException{
		new PEU.P.image.RegionGet(g);
	};
	public void buildGraph(int[][] g,String output) throws IOException{
		new PEU.P.image.RegionGet(g).buildGraph(g, output);//写法稍后优化下。罗瑶光
	};

	//Sobel {
	public int[][] Sobel_P( int[][] g,int choice) throws IOException{
		return new Sobel().P(g, choice);
	};
	public int[][] Sobel_P_WithMask(int[][]  g, int choice, int mask) throws IOException{
		return new Sobel().P_WithMask(g, choice, mask);
	};

	//Strech {
	public int[][] Strech_P(int[][] g,double d,double e) throws IOException{
		return new Strech().P(g, d, e);
	};
	public BufferedImage Strech_P(BufferedImage lygimage, double d, double e) throws IOException{
		return new Strech().P(lygimage, d, e);
	};

	//Threshold {
	public int[][] Threshold_P(int[][] g, int Td){
		return new Threshold().P(g, Td);
	};
	public int[][] Threshold_P_Section(int[][] g, int Ts, int Td){
		return new Threshold().P_Section(g, Ts, Td);
	};

	//	//VtoV{ 移除著作权的 和 u vecs 已经出现的稍后剔除出去。 先注释掉先
	//	public JSONObject XmlToJsonObject(String response){
	//		return null;};
	//	public Map<String, Object> JsonObjectToMap(JSONObject response){
	//		return null;};
	//	public String MapToJsonString(Map<String, Object> response){
	//		return null;};
	//	public String ListToJsonString(List<Object> response){
	//		return null;};
	//	public String ObjectToJsonString(Object response){
	//		return null;};
	//	public Map<String, Object> XmlToMap(String response){
	//		return null;};
	//	public String MapToXml(Map<String, Object> response){
	//		return null;};
	//	public List<Object> JsonArrayToList(JSONArray jobj){
	//		return null;};

	//CnnMeasure{
	public double[][] getCnnMeansure(double inputs[][]){
		return new CnnMeasure().getCnnMeansure(inputs);
	};

	//StringUtil { 见我git的 备份描述refer 和 著作申请版本备份refer 都有详细说明
	//md5 官方 注释下，以后用 dna MD5的作为纪念。 奇怪 还让我eclipse卡死一下刚。
	//	public String encode(String input) throws Exception{};
	//	public String decode(String str) throws UnsupportedEncodingException{};
	//	public String EncoderByMd5(String salt, String pwd, int enctimes) throws NoSuchAlgorithmException
	//, UnsupportedEncodingException{};
	//	public String EncoderByMd5(String salt, String pwd) throws NoSuchAlgorithmException
	//, UnsupportedEncodingException{};

	//WAVtoLYG{ 以前设计视频的加密很少用。
	public void WAVtoLYG(String WAVf, String LYGf) throws IOException, UnsupportedAudioFileException{
		new PEU.P.movie.WAVtoLYG(WAVf, LYGf);
	};
	//LYGFileIO
	public LYGFileIO initWithFFT(double fft[], MakeContainerZNSZ makeContainerZNSZ){
		return new LYGFileIO();
	};
	//	public void lygRead(String filepath) throws IOException{//稍后加单例接口
	//		new LYGFileIO().lygRead(filepath);
	//	};
	//	public void lygWrite(String string) throws IOException{
	//		new LYGFileIO().lygWrite(string);
	//	};
	//	public void IQ_header(RandomAccessFile raf) throws IOException{
	//		new LYGFileIO().IQ_header(raf);
	//	};
	//	public void IV_ByAudioBytes(AudioFormat af){
	//		new LYGFileIO().IV_ByAudioBytes(af);
	//	};

	//DETA_ANN_HMM {
	public String[][] summing_P(String[][] inputNLP) throws IOException, InstantiationException
	, IllegalAccessException{
		return new DETA_ANN_HMM().summing_P(inputNLP);
	};
	//DETA_DNN {
	public String[][] summing_P(String[][] ann, String[][] rnn) throws IOException, InstantiationException
	, IllegalAccessException{
		return new DETA_DNN().summing_P(ann, rnn);
	};

	//sort he search 没有实用价值  见 top5Dsort，略，稍后我会把 养疗经的表格search 组件提取出来变成函数。
	//声音滤波发音 略，不想设计统一接口，因为涉及武器安防领域，本人去年承诺过，不再个人研发，

	//tablesort 
	public TableSorterZYNK initATableSorterZYNK(){
		return new TableSorterZYNK();
	}; 
	public TimeCheck initATimeCheck(){
		return new TimeCheck();
	};

	//wave 
	//Common{
	public double[] zhiShu(double[] input, double scale,double shehold){
		return new Common().zhiShu(input, scale, shehold);
	};
	//Copy{
	public double[][] copy2d(double[][] input,double scale){
		return new Copy().copy2d(input, scale);
	};
	public double[]copy1d(double[] input,double scale){
		return new Copy().copy1d(input, scale);
	};
	public double[]copy1dx2(double[] input,double scale){
		return new Copy().copy1dx2(input, scale);
	};

	//DFT
	public void initADFT(){
		new DFT(); //稍后设计成传参。
	};

	//FFT
	public void initAFFT(){
		new FFT(); //稍后设计成传参。
	};

	//Guassian{
	public double[] guassian1d(double[] input, double scale){
		return new PEU.P.wave.Guassian().guassian1d(input, scale);
	};

	//Laplasian{
	public double[] laplasian1d(double[] input, double scale){
		return new Laplasian().laplasian1d(input, scale);
	};

	//MaxAndMin{
	public double max_v(double[] input){
		return new MaxAndMin().max_v(input);
	};
	public double max_i(double[] input){
		return new MaxAndMin().max_i(input);
	};
	public double min_v(double[] input,double rank){
		return new MaxAndMin().min_v(input, rank);
	};
	public double min_i(double[] input, double rank){
		return new MaxAndMin().min_i(input, rank);
	};

	//Median{
	public double[] median1d(double[] input, double scale){
		return new PEU.P.wave.Median().median1d(input, scale);
	};

	//PeakStatistic{
	public double[][] fengTong1D(double[] input){
		return new PeakStatistic().fengTong1(input);
	};
	public double[][] fengPaixX(double[][] input){
		return new PeakStatistic().fengPaixX(input);
	};
	public double[][] fengPaiyY(double[][] input){
		return new PeakStatistic().fengPaiyY(input);
	};
	public double[][] fengPaiXx(double[][] input){
		return new PeakStatistic().fengPaiXx(input);
	};
	public double[][] fengPaiYy(double[][] input){
		return new PeakStatistic().fengPaiYy(input);
	};

	//Proportion{
	public double[] newX(double[] input, double width){
		return new Proportion().newX(input, width);
	};
	public double[] newY(double[] input, double hight){
		return new Proportion().newY(input, hight);
	};
	public double[] newXY(double[] input, double width, double hight ){
		return new Proportion().newXY(input, width, hight);
	};
	public double[] newXYBest(double[] input, double width, double hight ){
		return new Proportion().newXYBest(input, width, hight);
	};
	public double[] newYwithoutBound(double[] input, double hight){
		return new Proportion().newYwithoutBound(input, hight);
	};
	public double[] newXYYwithoutBound(double[] input, double width, double hight ){
		return new Proportion().newXYYwithoutBound(input, width, hight);
	};

	//Quantification{
	public double[] liangHuaDengChaAdd(double[] input, double scale){
		return new Quantification().liangHuaDengChaAdd(input, scale);
	};
	public double[] liangHuaXiHua(double[] input,double scale){
		return new Quantification().liangHuaXiHua(input, scale);
	};
	public double[] liangHuaDengChaMines(double[] input, int scale){
		return new Quantification().liangHuaDengChaMines(input, scale);
	};
	public double[] liangHuaEqualDelete(double[] input){
		return new Quantification().liangHuaEqualDelete(input);
	};
	public double[] liangHuaXiHuaHalfSide(double[] input){
		return new Quantification().liangHuaXiHuaHalfSide(input);
	};

	//Shehold{
	public double[] shehold1D(double[] input, double scale){
		return new Shehold().shehold1(input, scale);
	};
	//Tailor{
	public double[] caiJian1D(double[] input, double left,double right){
		return new Tailor().caiJian1(input, left, right);//函数名称123 结尾稍后优化下。 罗瑶光
	};

	//UnZip {
	public void unZipWithPath(String zipFullPath, String zipCategory){
		UnZip.unZipWithPath(zipFullPath, zipCategory);
	};

	//BootBackup {  
	public void bootBackupByUsingGzip(String zipPath){
		BootBackup.bootBackupByUsingGzip(zipPath);
	};
	//sourceFilePath is a root category of 待压缩的文件目录
	//zipFilePath is a zip category of 压缩的文件目录到
	//fileName is a zip file name
	public boolean fileToZip(String sourceFilePath, String zipFilePath, String fileName){
		return BootBackup.fileToZip(sourceFilePath, zipFilePath, fileName);
	};

	//GzipUtil {
	// 压缩
	public byte[] compress(byte[] data) throws IOException{
		return GzipUtil.compress(data);
	};
	public byte[] compress(String str, String stringTypes) throws IOException{
		return GzipUtil.compress(str, stringTypes);
	};
	public byte[] uncompress(byte[] data) throws IOException{
		return GzipUtil.uncompress(data);
	};

	//Filter{
	public int[][] P_Heart(int[][] zuoBiao, int distance, int scale){
		return new Filter().P_Heart(zuoBiao, distance, scale);
	};
	public int[][] P_Model(int[][] zuoBiao, int[][] yanjing){
		return new Filter().P_Model(zuoBiao, yanjing);
	}//粗糙版本以后优化。
}

