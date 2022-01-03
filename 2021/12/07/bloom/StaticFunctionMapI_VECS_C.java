package SEM.bloom;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ME.APM.VSQ.App;

//����Ȩ�� + ���� = ������
public interface StaticFunctionMapI_VECS_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey
			, StaticFunctionMapI_VECS_E staticFunctionMapI_VECS_C, Map<String, Object> output) throws IOException {
		String[] ��������= (String[]) output.get("��������");
		int ����= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("main")){ 
			StaticFunctionMapI_VECS_E.main(null);//�Ժ�ֳ�ȥ
			output.put("I_VECS_main", "void");//��void�ӿھ�ֱ��put��ȥ���ɡ�
		};
		if(callFunctionKey.equalsIgnoreCase("doTestWithImageAPP")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_VECS_C.doTestWithImageAPP((App)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doFourJianPDErosion")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				//24��������ͳһ�� linked map �Ժ�ӿ�д������ֻ��linked map һ������
				map= staticFunctionMapI_VECS_C.doFourJianPDErosion((int)inputValues.get(��������[����++])
						,(int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++])
						,(int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++])
						,(int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++]),
						(int)inputValues.get(��������[����++]),(BufferedImage)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doFourSuanPDErosion")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_VECS_C.doFourSuanPDErosion((int)inputValues.get(��������[����++])
						,(int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++])
						,(int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++])
						,(int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++]),
						(int)inputValues.get(��������[����++]),(BufferedImage)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doEightSuanPDErosion")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_VECS_C.doEightSuanPDErosion((int)inputValues.get(��������[����++])
						, (int)inputValues.get(��������[����++]), (int)inputValues.get(��������[����++])
						,(int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++])
						,(int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++]),
						(int)inputValues.get(��������[����++]),(BufferedImage)inputValues.get(��������[����++]));
			}			
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doEightJianPDErosion")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_VECS_C.doEightJianPDErosion((int)inputValues.get(��������[����++])
						,(int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++])
						,(int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++])
						,(int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++]),
						(int)inputValues.get(��������[����++]),(BufferedImage)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doFirstPDErosionWithTop")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.doFirstPDErosionWithTop((double)inputValues.get(��������[����++])
						,(double)inputValues.get(��������[����++]),(double)inputValues.get(��������[����++])
						,(double)inputValues.get(��������[����++]),(int[][])inputValues.get(��������[����++])
						,(int)inputValues.get(��������[����++]),(BufferedImage)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doSecondPDErosionWithTop")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.doSecondPDErosionWithTop((double)inputValues.get(��������[����++])
						,(double)inputValues.get(��������[����++]),(double)inputValues.get(��������[����++])
						,(double)inputValues.get(��������[����++]),(int[][])inputValues.get(��������[����++])
						,(int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++])
						,(BufferedImage)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doThirdPDErosionWithTop")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.doThirdPDErosionWithTop((double)inputValues.get(��������[����++])
						,(double)inputValues.get(��������[����++]),(double)inputValues.get(��������[����++])
						,(double)inputValues.get(��������[����++]),(int[][])inputValues.get(��������[����++])
						,(int)inputValues.get(��������[����++]),(int)inputValues.get(��������[����++])
						,(List<String>)inputValues.get(��������[����++]), (BufferedImage)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("initDeciphring")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.initDeciphring((String)inputValues.get(��������[����++])
						, (int)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doTestWithFilePath")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.doTestWithFilePath((String)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doTestWithImage")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_VECS_C.doTestWithImage((Image)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doTestWithBufferedImage")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.doTestWithBufferedImage((BufferedImage)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("staticMain")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapI_VECS_C.staticMain((String[])inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
		if(callFunctionKey.equalsIgnoreCase("doPDERangePDI16")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, ��������);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapI_VECS_C.doPDERangePDI16((int[][])inputValues.get(��������[����++])
						,(int)inputValues.get(��������[����++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		};
	}

	public static void load(StaticFunctionMapI_VECS_E staticFunctionMapI_VECS_E) {
		// TODO Auto-generated method stub
		//�Ժ��װ
		StaticFunctionMapI_VECS_C.annotationMap.put("main", "main");
		StaticFunctionMapI_VECS_C.annotationMap.put("doTestWithImageAPP", "app");
		StaticFunctionMapI_VECS_C.annotationMap.put("doFourJianPDErosion", "��ʴŨ��:���ط�ֵ:���رȾ���:���ز��:pcaScale:upcaScale:icaScale:ecaScale:bufferedImage");
		StaticFunctionMapI_VECS_C.annotationMap.put("doFourSuanPDErosion", "��ʴŨ��:���ط�ֵ:���رȾ���:���ز��:pcaScale:upcaScale:icaScale:ecaScale:bufferedImage");
		StaticFunctionMapI_VECS_C.annotationMap.put("doEightSuanPDErosion", "��ʴŨ��:���ط�ֵ:���رȾ���:���ز��:pcaScale:upcaScale:icaScale:ecaScale:bufferedImage");
		StaticFunctionMapI_VECS_C.annotationMap.put("doEightJianPDErosion", "��ʴŨ��:���ط�ֵ:���رȾ���:���ز��:pcaScale:upcaScale:icaScale:ecaScale:bufferedImage");
		StaticFunctionMapI_VECS_C.annotationMap.put("doFirstPDErosionWithTop", "fourJian:fourSuan:eightJian:eightSuan:scoreMatrix:top:bufferedImage");
		StaticFunctionMapI_VECS_C.annotationMap.put("doSecondPDErosionWithTop", "fourJian:fourSuan:eightJian:eightSuan:scoreMatrix:top:times:bufferedImage");
		StaticFunctionMapI_VECS_C.annotationMap.put("doThirdPDErosionWithTop", "fourJian:fourSuan:eightJian:eightSuan:scoreMatrix:top:times:output:bufferedImage");
		StaticFunctionMapI_VECS_C.annotationMap.put("initDeciphring", "string,type");
		StaticFunctionMapI_VECS_C.annotationMap.put("doTestWithFilePath", "testImagePath");
		StaticFunctionMapI_VECS_C.annotationMap.put("doTestWithImage", "testImagePath");
		StaticFunctionMapI_VECS_C.annotationMap.put("doTestWithBufferedImage", "testImagePath");
		StaticFunctionMapI_VECS_C.annotationMap.put("staticMain", "string");
		StaticFunctionMapI_VECS_C.annotationMap.put("doPDERangePDI16", "input:���scale");
	}
	//SkinPathDoubleDetectTripFix2D_E{
	public List<String> doTestWithImageAPP(App app) throws IOException; 
	public Double[] doFourJianPDErosion(int ��ʴŨ��,int ���ط�ֵ,int ���رȾ���, int ���ز��,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException;
	public Double[] doFourSuanPDErosion(int ��ʴŨ��,int ���ط�ֵ,int ���رȾ���, int ���ز��,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException;
	public Double[] doEightSuanPDErosion(int ��ʴŨ��,int ���ط�ֵ,int ���رȾ���, int ���ز��,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException;
	public Double[] doEightJianPDErosion(int ��ʴŨ��,int ���ط�ֵ,int ���رȾ���, int ���ز��,
			int pcaScale, int upcaScale, int icaScale, int ecaScale, BufferedImage bufferedImage) throws IOException;
	public void doFirstPDErosionWithTop(double fourJian, double fourSuan, double eightJian, double eightSuan
			, int[][] scoreMatrix, int top, BufferedImage bufferedImage)throws IOException;
	public void doSecondPDErosionWithTop(double fourJian, double fourSuan
			, double eightJian, double eightSuan, int[][] scoreMatrix
			, int top, int times, BufferedImage bufferedImage)throws IOException;
	public void doThirdPDErosionWithTop(double fourJian, double fourSuan
			, double eightJian, double eightSuan, int[][] scoreMatrix
			, int top, int times, List<String> output, BufferedImage bufferedImage)throws IOException;
	public void initDeciphring(String string, int type) throws NumberFormatException, IOException;


	//SkinPathDetectTrip_E{
	public void doTestWithFilePath(String testImagePath) throws IOException;
	public List<String> doTestWithImage(Image testImagePath) throws IOException;
	public void doTestWithBufferedImage(BufferedImage testImagePath) throws IOException;

	//SkinPathDoubleDetectTripFix2D	
	public void staticMain(String[] string) throws IOException;

	//16���ƴ����ȸ�ʴ��չ����۲�
	public int[][] doPDERangePDI16(int[][] input, int ���scale);		
	//monitor.rp= new RangePDI().IPE_AOPM_VECS_IDUQ_TXH_AC(monitor.rp, monitor.facy);
}
