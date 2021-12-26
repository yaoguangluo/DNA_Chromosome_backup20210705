package SEM.bloom;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import ME.APM.VSQ.App;

//著作权人 + 作者 = 罗瑶光
public interface StaticFunctionMapI_VECS_C {
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapI_VECS_E staticFunctionMapI_VECS_C, Map<String, Object> output) throws IOException {
		String[] 传参因子= (String[]) output.get("传参因子");
		int 因子= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("main")){ 
			StaticFunctionMapI_VECS_E.main(null);//稍后分出去
			output.put("I_VECS_main", "void");//非void接口就直接put进去即可。
		};
		if(callFunctionKey.equalsIgnoreCase("doTestWithImageAPP")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_VECS_C.doTestWithImageAPP((App)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doFourJianPDErosion")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {//24组设计完后统一用 linked map 以后接口写法传参只有linked map 一个变量
				map= staticFunctionMapI_VECS_C.doFourJianPDErosion((int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),
						(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),
						(int)inputValues.get(传参因子[因子++]),(BufferedImage)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doFourSuanPDErosion")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_VECS_C.doFourSuanPDErosion((int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),
						(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),
						(int)inputValues.get(传参因子[因子++]),(BufferedImage)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doEightSuanPDErosion")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_VECS_C.doEightSuanPDErosion((int)inputValues.get(传参因子[因子++]), (int)inputValues.get(传参因子[因子++]), (int)inputValues.get(传参因子[因子++]),
						(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),
						(int)inputValues.get(传参因子[因子++]),(BufferedImage)inputValues.get(传参因子[因子++]));
			}			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doEightJianPDErosion")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_VECS_C.doEightJianPDErosion((int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),
						(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),
						(int)inputValues.get(传参因子[因子++]),(BufferedImage)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doFirstPDErosionWithTop")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.doFirstPDErosionWithTop((double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]),
						(double)inputValues.get(传参因子[因子++]),(int[][])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(BufferedImage)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doSecondPDErosionWithTop")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.doSecondPDErosionWithTop((double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]),
						(double)inputValues.get(传参因子[因子++]),(int[][])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(BufferedImage)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doThirdPDErosionWithTop")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.doThirdPDErosionWithTop((double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]),
						(double)inputValues.get(传参因子[因子++]),(int[][])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(List<String>)inputValues.get(传参因子[因子++]), (BufferedImage)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("initDeciphring")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.initDeciphring((String)inputValues.get(传参因子[因子++]), (int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doTestWithFilePath")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.doTestWithFilePath((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doTestWithImage")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_VECS_C.doTestWithImage((Image)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doTestWithBufferedImage")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.doTestWithBufferedImage((BufferedImage)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("staticMain")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.staticMain((String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doPDERangePDI16")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_VECS_C.doPDERangePDI16((int[][])inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}
	
	public static void load(StaticFunctionMapI_VECS_E staticFunctionMapI_VECS_E) {
		// TODO Auto-generated method stub
		//稍后封装
		staticFunctionMapI_VECS_E.annotationMap.put("main", "main");
		staticFunctionMapI_VECS_E.annotationMap.put("doTestWithImageAPP", "doTestWithImageAPP");
		staticFunctionMapI_VECS_E.annotationMap.put("doFourJianPDErosion", "doFourJianPDErosion");
		staticFunctionMapI_VECS_E.annotationMap.put("doFourSuanPDErosion", "doFourSuanPDErosion");
		staticFunctionMapI_VECS_E.annotationMap.put("doEightSuanPDErosion", "doEightSuanPDErosion");
		staticFunctionMapI_VECS_E.annotationMap.put("doEightJianPDErosion", "doEightJianPDErosion");
		staticFunctionMapI_VECS_E.annotationMap.put("doFirstPDErosionWithTop", "doFirstPDErosionWithTop");
		staticFunctionMapI_VECS_E.annotationMap.put("doSecondPDErosionWithTop", "doSecondPDErosionWithTop");
		staticFunctionMapI_VECS_E.annotationMap.put("doThirdPDErosionWithTop", "doThirdPDErosionWithTop");
		staticFunctionMapI_VECS_E.annotationMap.put("initDeciphring", "initDeciphring");
		staticFunctionMapI_VECS_E.annotationMap.put("doTestWithFilePath", "doTestWithFilePath");
		staticFunctionMapI_VECS_E.annotationMap.put("doTestWithImage", "doTestWithImage");
		staticFunctionMapI_VECS_E.annotationMap.put("doTestWithBufferedImage", "doTestWithBufferedImage");
		staticFunctionMapI_VECS_E.annotationMap.put("staticMain", "staticMain");
		staticFunctionMapI_VECS_E.annotationMap.put("doPDERangePDI16", "doPDERangePDI16");
	}
	//SkinPathDoubleDetectTripFix2D_E{
	public List<String> doTestWithImageAPP(App u) throws IOException; 
	public Double[] doFourJianPDErosion(int 腐蚀浓度,int 像素阀值,int 像素比精度, int 像素差精度,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException;
	public Double[] doFourSuanPDErosion(int 腐蚀浓度,int 像素阀值,int 像素比精度, int 像素差精度,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException;
	public Double[] doEightSuanPDErosion(int 腐蚀浓度,int 像素阀值,int 像素比精度, int 像素差精度,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException;
	public Double[] doEightJianPDErosion(int 腐蚀浓度,int 像素阀值,int 像素比精度, int 像素差精度,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException;
	public void doFirstPDErosionWithTop(double fourJian, double fourSuan, double eightJian, double eightSuan
			, int[][] scoreMatrix, int top, BufferedImage bufferedImage)throws IOException;
	public void doSecondPDErosionWithTop(double fourJian, double fourSuan, double eightJian, double eightSuan, int[][] scoreMatrix
			, int top, int times, BufferedImage bufferedImage)throws IOException;
	public void doThirdPDErosionWithTop(double fourJian, double fourSuan, double eightJian, double eightSuan, int[][] scoreMatrix
			, int top, int times, List<String> output, BufferedImage bufferedImage)throws IOException;
	public void initDeciphring(String string, int type) throws NumberFormatException, IOException;


	//SkinPathDetectTrip_E{
	public void doTestWithFilePath(String testImagePath) throws IOException;
	public List<String> doTestWithImage(Image testImagePath) throws IOException;
	public void doTestWithBufferedImage(BufferedImage testImagePath) throws IOException;

	//SkinPathDoubleDetectTripFix2D	
	public void staticMain(String[] string) throws IOException;

	//16进制带精度腐蚀肽展计算观测
	public int[][] doPDERangePDI16(int[][] input, int 酸碱scale);		
	//monitor.rp= new RangePDI().IPE_AOPM_VECS_IDUQ_TXH_AC(monitor.rp, monitor.facy);
}
