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
import PEU.P.dna.Token;
import PEU.P.image.ConvexHull;
import PEU.P.image.ConvexHull.Vertex;
import PEU.P.md5.Usr;
import PEU.P.md5.UsrToken;
import PEU.P.table.TableSorterZYNK;
import PEU.P.time.TimeCheck;
//著作权人+ 作者= 罗瑶光
public interface StaticFunctionMapU_AOPM_C {
	public static Map<String, String> annotationMap= new HashMap<>();
	@SuppressWarnings("unchecked")
	public static void callFunction(String callFunctionKey, StaticFunctionMapU_AOPM_E staticFunctionMapU_AOPM_C
			, Map<String, Object> output) throws Exception {
		String[] 传参因子= (String[]) output.get("传参因子");
		int 因子= 0;
		Object map = null;
		if(callFunctionKey.equalsIgnoreCase("mapClassification")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.mapClassification((Map<String, Object>)inputValues.get(传参因子[因子++])
						,(String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "mapClassification") ;
		if(callFunctionKey.equalsIgnoreCase("mapClassification2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.mapClassification2D((Map<String, Object>)inputValues.get(传参因子[因子++])
						,(String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "mapClassification2D");
		if(callFunctionKey.equalsIgnoreCase("stringClassification2D")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.stringClassification2D((String[])inputValues.get(传参因子[因子++])
						,(String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "stringClassification2D");
		if(callFunctionKey.equalsIgnoreCase("listClassification2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.listClassification2D((List<String>)inputValues.get(传参因子[因子++])
						,(String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "listClassification2D");
		if(callFunctionKey.equalsIgnoreCase("mapCombination")){       
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.mapCombination((Map<String, Object>)inputValues.get(传参因子[因子++])
						,(Map<String, Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "mapCombination");
		if(callFunctionKey.equalsIgnoreCase("listCombination")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.listCombination((List<Object>)inputValues.get(传参因子[因子++])
						,(List<Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "listCombination");
		if(callFunctionKey.equalsIgnoreCase("intArrayCombination")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.intArrayCombination((int[])inputValues.get(传参因子[因子++])
						,(int[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "intArrayCombination");
		if(callFunctionKey.equalsIgnoreCase("doubleArrayCombination")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.doubleArrayCombination((double[])inputValues.get(传参因子[因子++])
						,(double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "doubleArrayCombination");
		if(callFunctionKey.equalsIgnoreCase("longArrayCombination")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.longArrayCombination((long[])inputValues.get(传参因子[因子++])
						,(long[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "longArrayCombination");
		if(callFunctionKey.equalsIgnoreCase("floatArrayCombination")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.floatArrayCombination((float[])inputValues.get(传参因子[因子++])
						,(float[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "floatArrayCombination");
		if(callFunctionKey.equalsIgnoreCase("StringArrayCombination")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.StringArrayCombination((String[])inputValues.get(传参因子[因子++])
						,(String[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "StringArrayCombination");
		if(callFunctionKey.equalsIgnoreCase("charArrayCombination")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.charArrayCombination((char[])inputValues.get(传参因子[因子++])
						,(char[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "charArrayCombination");
		if(callFunctionKey.equalsIgnoreCase("byteArrayCombination")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.byteArrayCombination((byte[])inputValues.get(传参因子[因子++])
						,(byte[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "byteArrayCombination");
		if(callFunctionKey.equalsIgnoreCase("vectorCombination")){           
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.vectorCombination((Vector<Object>)inputValues.get(传参因子[因子++])
						,(Vector<Object>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "vectorCombination");
		if(callFunctionKey.equalsIgnoreCase("DNAAuthStatusCheckEmailAndPds")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.DNAAuthStatusCheckEmailAndPds((App)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "DNAAuthStatusCheckEmailAndPds");
		if(callFunctionKey.equalsIgnoreCase("DNAAuthStatusCheckEmailAndPde")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.DNAAuthStatusCheckEmailAndPde((App)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "DNAAuthStatusCheckEmailAndPde");
		if(callFunctionKey.equalsIgnoreCase("DNAAuthStatusCheckEmailAndPassword")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.DNAAuthStatusCheckEmailAndPassword((App)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "DNAAuthStatusCheckEmailAndPassword");
		if(callFunctionKey.equalsIgnoreCase("DNAAuthCheck")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.DNAAuthCheck((App)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(Map<String, String>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "DNAAuthCheck");
		if(callFunctionKey.equalsIgnoreCase("encode")){       
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.encode((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "encode");
		if(callFunctionKey.equalsIgnoreCase("decode")){        
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.decode((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "decode");
		if(callFunctionKey.equalsIgnoreCase("EncoderByMd5")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.EncoderByMd5((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "EncoderByMd5");
		if(callFunctionKey.equalsIgnoreCase("EncoderByDNA")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.EncoderByDNA((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]), (Token)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "EncoderByDNA");
		if(callFunctionKey.equalsIgnoreCase("getNewTokenFromUsrAndUsrToken")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.getNewTokenFromUsrAndUsrToken((Usr)inputValues.get(传参因子[因子++])
						,(UsrToken)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getNewTokenFromUsrAndUsrToken");
		if(callFunctionKey.equalsIgnoreCase("getSecondMD5Password")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.getSecondMD5Password((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getSecondMD5Password");
		if(callFunctionKey.equalsIgnoreCase("getFirstMD5Password")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.getFirstMD5Password((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getFirstMD5Password");
		if(callFunctionKey.equalsIgnoreCase("getFirstDNAPassword")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.getFirstDNAPassword((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(Token)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getFirstDNAPassword");
		if(callFunctionKey.equalsIgnoreCase("getNewTokenFromUsrAndUsrTokenByDNA")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.getNewTokenFromUsrAndUsrTokenByDNA((Usr)inputValues.get(传参因子[因子++])
						,(UsrToken)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getNewTokenFromUsrAndUsrTokenByDNA");
		if(callFunctionKey.equalsIgnoreCase("CheckRange_P")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.CheckRange_P((int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "CheckRange_P");
		if(callFunctionKey.equalsIgnoreCase("Closing_P")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Closing_P((int[][])inputValues.get(传参因子[因子++])
						,(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Closing_P");
		if(callFunctionKey.equalsIgnoreCase("Color_P")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Color_P((int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Color_P");
		if(callFunctionKey.equalsIgnoreCase("convexHull")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.convexHull((List<ConvexHull.Vertex>)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "convexHull");
		if(callFunctionKey.equalsIgnoreCase("compareSlope")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.compareSlope((int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "compareSlope");
		if(callFunctionKey.equalsIgnoreCase("PNGWrite")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.PNGWrite((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "PNGWrite");
		if(callFunctionKey.equalsIgnoreCase("CSVWrite")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.CSVWrite((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "CSVWrite");
		if(callFunctionKey.equalsIgnoreCase("Dilation_P")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Dilation_P((int[][])inputValues.get(传参因子[因子++])
						,(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Dilation_P");
		if(callFunctionKey.equalsIgnoreCase("Emboss_P")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Emboss_P((int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Emboss_P");
		if(callFunctionKey.equalsIgnoreCase("Erosion_P")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Erosion_P((int[][])inputValues.get(传参因子[因子++])
						,(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Erosion_P");
		if(callFunctionKey.equalsIgnoreCase("print_Mean")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.print_Mean((int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "print_Mean");
		if(callFunctionKey.equalsIgnoreCase("print_Mean")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.print_Mean((int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "print_Mean");
		if(callFunctionKey.equalsIgnoreCase("Guassian_P_2D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Guassian_P_2D((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Guassian_P_2D");
		if(callFunctionKey.equalsIgnoreCase("Guassian_P_1D")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Guassian_P_1D((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Guassian_P_1D");
		if(callFunctionKey.equalsIgnoreCase("Guassian_P")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Guassian_P((BufferedImage)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Guassian_P");
		if(callFunctionKey.equalsIgnoreCase("HitAndMiss_P")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.HitAndMiss_P((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "HitAndMiss_P");
		if(callFunctionKey.equalsIgnoreCase("HoughTransformLoop")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.HoughTransformLoop((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "HoughTransformLoop");
		if(callFunctionKey.equalsIgnoreCase("IV_HTMatrix")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.IV_HTMatrix((int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "IV_HTMatrix");
		if(callFunctionKey.equalsIgnoreCase("Laplacian_P")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Laplacian_P((int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Laplacian_P");
		if(callFunctionKey.equalsIgnoreCase("Mask_P")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Mask_P((int[][])inputValues.get(传参因子[因子++])
						,(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Mask_P");
		if(callFunctionKey.equalsIgnoreCase("Median_P")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Median_P((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Median_P");
		if(callFunctionKey.equalsIgnoreCase("Opening_P")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Opening_P((int[][])inputValues.get(传参因子[因子++])
						,(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Opening_P");
		if(callFunctionKey.equalsIgnoreCase("PrintCurrent")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.PrintCurrent((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "PrintCurrent");
		if(callFunctionKey.equalsIgnoreCase("writePNG")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.writePNG((String)inputValues.get(传参因子[因子++])
						,(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "writePNG");
		if(callFunctionKey.equalsIgnoreCase("GRNpngRead")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.GRNpngRead((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "GRNpngRead");
		if(callFunctionKey.equalsIgnoreCase("REDpngRead")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.REDpngRead((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "REDpngRead");
		if(callFunctionKey.equalsIgnoreCase("BLUpngRead")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.BLUpngRead((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "BLUpngRead");
		if(callFunctionKey.equalsIgnoreCase("sizeHW")){        
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.sizeHW((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "sizeHW");
		if(callFunctionKey.equalsIgnoreCase("createBufferImage")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.createBufferImage((int[][])inputValues.get(传参因子[因子++])
						,(int[][])inputValues.get(传参因子[因子++]),(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "createBufferImage");
		if(callFunctionKey.equalsIgnoreCase("smallToNormal")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.smallToNormal((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "smallToNormal");
		if(callFunctionKey.equalsIgnoreCase("PadImage")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.PadImage((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "PadImage");
		if(callFunctionKey.equalsIgnoreCase("RegionGet")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.RegionGet((int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "RegionGet");
		if(callFunctionKey.equalsIgnoreCase("buildGraph")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.buildGraph((int[][])inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "buildGraph");
		if(callFunctionKey.equalsIgnoreCase("Sobel_P")){          
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Sobel_P((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Sobel_P");
		if(callFunctionKey.equalsIgnoreCase("Sobel_P_WithMask")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Sobel_P_WithMask((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Sobel_P_WithMask");
		if(callFunctionKey.equalsIgnoreCase("Strech_P")){       
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Strech_P((int[][])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Strech_P");
		if(callFunctionKey.equalsIgnoreCase("Threshold_P")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.Threshold_P((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "Threshold_P");
		if(callFunctionKey.equalsIgnoreCase("getCnnMeansure")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.getCnnMeansure((double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "getCnnMeansure");
		if(callFunctionKey.equalsIgnoreCase("WAVtoLYG")){       
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.WAVtoLYG((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "WAVtoLYG");
		if(callFunctionKey.equalsIgnoreCase("summing_P")){        
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.summing_P((String[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "summing_P");
		if(callFunctionKey.equalsIgnoreCase("initATableSorterZYNK")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.initATableSorterZYNK();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "initATableSorterZYNK");
		if(callFunctionKey.equalsIgnoreCase("initATimeCheck")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.initATimeCheck();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "initATimeCheck");

		if(callFunctionKey.equalsIgnoreCase("zhiShu")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.zhiShu((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "zhiShu");
		if(callFunctionKey.equalsIgnoreCase("copy2d")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.copy2d((double[][])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "copy2d");
		if(callFunctionKey.equalsIgnoreCase("copy1d")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.copy1d((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "copy1d");
		if(callFunctionKey.equalsIgnoreCase("copy1dx2")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.copy1dx2((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "copy1dx2");

		if(callFunctionKey.equalsIgnoreCase("initADFT")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.initADFT();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "initADFT");
		if(callFunctionKey.equalsIgnoreCase("initAFFT")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.initAFFT();
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "initAFFT");
		if(callFunctionKey.equalsIgnoreCase("guassian1d")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.guassian1d((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "guassian1d");
		if(callFunctionKey.equalsIgnoreCase("laplasian1d")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.laplasian1d((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "laplasian1d");
		if(callFunctionKey.equalsIgnoreCase("max_v")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.max_v((double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "max_v");
		if(callFunctionKey.equalsIgnoreCase("max_i")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.max_i((double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "max_i");

		if(callFunctionKey.equalsIgnoreCase("min_v")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.min_v((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "min_v");
		if(callFunctionKey.equalsIgnoreCase("min_i")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.min_i((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "min_i");
		if(callFunctionKey.equalsIgnoreCase("median1d")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.median1d((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "median1d");
		if(callFunctionKey.equalsIgnoreCase("fengTong1")){ 
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.fengTong1((double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fengTong1");
		if(callFunctionKey.equalsIgnoreCase("fengPaixX")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.fengPaixX((double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fengPaixX");
		if(callFunctionKey.equalsIgnoreCase("fengPaiyY")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.fengPaiyY((double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fengPaiyY");
		if(callFunctionKey.equalsIgnoreCase("fengPaiXx")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.fengPaiXx((double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fengPaiXx");
		if(callFunctionKey.equalsIgnoreCase("fengPaiYy")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.fengPaiYy((double[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fengPaiYy");
		if(callFunctionKey.equalsIgnoreCase("newX")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.newX((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "newX");

		if(callFunctionKey.equalsIgnoreCase("newY")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.newY((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "newY");
		if(callFunctionKey.equalsIgnoreCase("newXY")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.newXY((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "newXY");
		if(callFunctionKey.equalsIgnoreCase("newXYBest")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.newXYBest((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "newXYBest");
		if(callFunctionKey.equalsIgnoreCase("newYwithoutBound")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.newYwithoutBound((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "newYwithoutBound");
		if(callFunctionKey.equalsIgnoreCase("newXYYwithoutBound")){  
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.newXYYwithoutBound((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "newXYYwithoutBound");
		if(callFunctionKey.equalsIgnoreCase("liangHuaDengChaAdd")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.liangHuaDengChaAdd((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "liangHuaDengChaAdd");
		if(callFunctionKey.equalsIgnoreCase("liangHuaXiHua")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.liangHuaXiHua((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "liangHuaXiHua");

		if(callFunctionKey.equalsIgnoreCase("liangHuaDengChaMines")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.liangHuaDengChaMines((double[])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "liangHuaDengChaMines");
		if(callFunctionKey.equalsIgnoreCase("liangHuaEqualDelete")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.liangHuaEqualDelete((double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "liangHuaEqualDelete");
		if(callFunctionKey.equalsIgnoreCase("liangHuaXiHuaHalfSide")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.liangHuaXiHuaHalfSide((double[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "liangHuaXiHuaHalfSide");
		if(callFunctionKey.equalsIgnoreCase("shehold1")){       
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.shehold1((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "shehold1");
		if(callFunctionKey.equalsIgnoreCase("caiJian1")){         
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.caiJian1((double[])inputValues.get(传参因子[因子++])
						,(double)inputValues.get(传参因子[因子++]),(double)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "caiJian1");
		if(callFunctionKey.equalsIgnoreCase("unZipWithPath")){        
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.unZipWithPath((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "unZipWithPath");
		if(callFunctionKey.equalsIgnoreCase("bootBackupByUsingGzip")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				staticFunctionMapU_AOPM_C.bootBackupByUsingGzip((String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "bootBackupByUsingGzip");
		if(callFunctionKey.equalsIgnoreCase("fileToZip")){      
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.fileToZip((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]),(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "fileToZip");
		if(callFunctionKey.equalsIgnoreCase("compress")){     
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.compress((String)inputValues.get(传参因子[因子++])
						,(String)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "compress");
		if(callFunctionKey.equalsIgnoreCase("uncompress")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.uncompress((byte[])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "uncompress");

		if(callFunctionKey.equalsIgnoreCase("P_Heart")){    
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.P_Heart((int[][])inputValues.get(传参因子[因子++])
						,(int)inputValues.get(传参因子[因子++]),(int)inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "P_Heart");
		if(callFunctionKey.equalsIgnoreCase("P_Model")){   
			Map<String, Object> inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if((boolean) inputValues.get("find")) {
				map= staticFunctionMapU_AOPM_C.P_Model((int[][])inputValues.get(传参因子[因子++])
						,(int[][])inputValues.get(传参因子[因子++]));
			}
			StaticFunctionMap.postValues(output, (boolean) inputValues.get("find"), map, callFunctionKey);
		}//, "P_Model");
	}

	public static void load(StaticFunctionMapU_AOPM_E staticFunctionMapU_AOPM_E) {
		// TODO Auto-generated method stub
		//稍后封装
		StaticFunctionMapU_AOPM_C.annotationMap.put("mapClassification", "input:keywords");
		StaticFunctionMapU_AOPM_C.annotationMap.put("mapClassification2D", "input:keywords");
		StaticFunctionMapU_AOPM_C.annotationMap.put("stringClassification2D", "input:keywords");
		StaticFunctionMapU_AOPM_C.annotationMap.put("listClassification2D", "input:keywords");
		StaticFunctionMapU_AOPM_C.annotationMap.put("mapCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("listCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("intArrayCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("doubleArrayCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("longArrayCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("floatArrayCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("StringArrayCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("charArrayCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("byteArrayCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("vectorCombination", "output:destination");
		StaticFunctionMapU_AOPM_C.annotationMap.put("DNAAuthStatusCheckEmailAndPds", "app:string:data");
		StaticFunctionMapU_AOPM_C.annotationMap.put("DNAAuthStatusCheckEmailAndPde", "app:string:data");
		StaticFunctionMapU_AOPM_C.annotationMap.put("DNAAuthStatusCheckEmailAndPassword", "app:string:data");
		StaticFunctionMapU_AOPM_C.annotationMap.put("DNAAuthCheck", "app:string:data");
		StaticFunctionMapU_AOPM_C.annotationMap.put("encode", "input");
		StaticFunctionMapU_AOPM_C.annotationMap.put("decode", "str");
		StaticFunctionMapU_AOPM_C.annotationMap.put("EncoderByMd5", "salt:pwd:enctimes");
		StaticFunctionMapU_AOPM_C.annotationMap.put("EncoderByDNA", "key:uPassword:token");
		StaticFunctionMapU_AOPM_C.annotationMap.put("getNewTokenFromUsrAndUsrToken", "usr:usrToken");
		StaticFunctionMapU_AOPM_C.annotationMap.put("getSecondMD5Password", "uPassword");
		StaticFunctionMapU_AOPM_C.annotationMap.put("getFirstMD5Password", "key:uPassword");
		StaticFunctionMapU_AOPM_C.annotationMap.put("getFirstDNAPassword", "key:uPassword:token");
		StaticFunctionMapU_AOPM_C.annotationMap.put("getNewTokenFromUsrAndUsrTokenByDNA", "usr:usrToken");
		StaticFunctionMapU_AOPM_C.annotationMap.put("CheckRange_P", "g");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Closing_P", "g:kenel");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Color_P", "r:g:b");
		StaticFunctionMapU_AOPM_C.annotationMap.put("convexHull", "vertices");
		StaticFunctionMapU_AOPM_C.annotationMap.put("compareSlope", "dy2:dx2:dy1:dx1");
		StaticFunctionMapU_AOPM_C.annotationMap.put("PNGWrite", " g:pix:output");
		StaticFunctionMapU_AOPM_C.annotationMap.put("CSVWrite", "g:pix:outputcsv");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Dilation_P", "g:kenel");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Emboss_P", "g");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Erosion_P", "g:kenel");
		StaticFunctionMapU_AOPM_C.annotationMap.put("print_Mean", "outDIR");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Guassian_P_2D", " g:d:e:sig");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Guassian_P_1D", "g:frection:kernel:sig");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Guassian_P", "lygimage:d:e:k");
		StaticFunctionMapU_AOPM_C.annotationMap.put("HitAndMiss_P", "g:pix:kenel");
		StaticFunctionMapU_AOPM_C.annotationMap.put("HoughTransformLoop", "g:pix:scale");
		StaticFunctionMapU_AOPM_C.annotationMap.put("IV_HTMatrix", "g");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Laplacian_P", "g");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Mask_P", "mag:dir");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Median_P", "g:d:e");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Opening_P", "g:kenel");
		StaticFunctionMapU_AOPM_C.annotationMap.put("PrintCurrent", "g:pix");
		StaticFunctionMapU_AOPM_C.annotationMap.put("writePNG", "args:outmag");
		StaticFunctionMapU_AOPM_C.annotationMap.put("GRNpngRead", "args");
		StaticFunctionMapU_AOPM_C.annotationMap.put("REDpngRead", "args");
		StaticFunctionMapU_AOPM_C.annotationMap.put("BLUpngRead", "args");
		StaticFunctionMapU_AOPM_C.annotationMap.put("sizeHW", "args");
		StaticFunctionMapU_AOPM_C.annotationMap.put("createBufferImage", "r:g:b");
		StaticFunctionMapU_AOPM_C.annotationMap.put("smallToNormal", "r:s:b");
		StaticFunctionMapU_AOPM_C.annotationMap.put("PadImage", "_image:height:width");
		StaticFunctionMapU_AOPM_C.annotationMap.put("RegionGet", "g");
		StaticFunctionMapU_AOPM_C.annotationMap.put("buildGraph", "g:output");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Sobel_P", "g:choice");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Sobel_P_WithMask", "g:choice:mask");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Strech_P", "g:d:e");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Threshold_P", "g:Td");
		StaticFunctionMapU_AOPM_C.annotationMap.put("Threshold_P_Section", "g:Ts:Td");
		StaticFunctionMapU_AOPM_C.annotationMap.put("getCnnMeansure", "inputs");
		StaticFunctionMapU_AOPM_C.annotationMap.put("WAVtoLYG", "WAVf:LYGf");
		StaticFunctionMapU_AOPM_C.annotationMap.put("summing_P", "inputNLP");
		StaticFunctionMapU_AOPM_C.annotationMap.put("initATableSorterZYNK", "void");
		StaticFunctionMapU_AOPM_C.annotationMap.put("initATimeCheck", "void");
		
		StaticFunctionMapU_AOPM_C.annotationMap.put("zhiShu", "input:scale:shehold");
		StaticFunctionMapU_AOPM_C.annotationMap.put("copy2d", "input:scale");
		StaticFunctionMapU_AOPM_C.annotationMap.put("copy1d", "input:scale");
		StaticFunctionMapU_AOPM_C.annotationMap.put("copy1dx2", "input:scale");
		
		StaticFunctionMapU_AOPM_C.annotationMap.put("initADFT", "void");
		StaticFunctionMapU_AOPM_C.annotationMap.put("initAFFT", "void");
		StaticFunctionMapU_AOPM_C.annotationMap.put("guassian1d", "input:scale");
		StaticFunctionMapU_AOPM_C.annotationMap.put("laplasian1d", "input:scale");
		StaticFunctionMapU_AOPM_C.annotationMap.put("max_v", "input");
		StaticFunctionMapU_AOPM_C.annotationMap.put("max_i", "input");
	 
		StaticFunctionMapU_AOPM_C.annotationMap.put("min_v", "input:rank");
		StaticFunctionMapU_AOPM_C.annotationMap.put("min_i", "input:rank");
		StaticFunctionMapU_AOPM_C.annotationMap.put("median1d", "input:scale");
		StaticFunctionMapU_AOPM_C.annotationMap.put("fengTong1", "input");
		StaticFunctionMapU_AOPM_C.annotationMap.put("fengPaixX", "input");
		StaticFunctionMapU_AOPM_C.annotationMap.put("fengPaiyY", "input");
		StaticFunctionMapU_AOPM_C.annotationMap.put("fengPaiXx", "input");
		StaticFunctionMapU_AOPM_C.annotationMap.put("fengPaiYy", "input");
		StaticFunctionMapU_AOPM_C.annotationMap.put("newX", "input:width");
		
		StaticFunctionMapU_AOPM_C.annotationMap.put("newY", "input:hight");//height
		StaticFunctionMapU_AOPM_C.annotationMap.put("newXY", "input:width:hight");
		StaticFunctionMapU_AOPM_C.annotationMap.put("newXYBest", "input:width:hight");
		StaticFunctionMapU_AOPM_C.annotationMap.put("newYwithoutBound", "input:hight");
		StaticFunctionMapU_AOPM_C.annotationMap.put("newXYYwithoutBound", "input:width:hight");
		StaticFunctionMapU_AOPM_C.annotationMap.put("liangHuaDengChaAdd", "input:scale");
		StaticFunctionMapU_AOPM_C.annotationMap.put("liangHuaXiHua", "input:scale");
		
		StaticFunctionMapU_AOPM_C.annotationMap.put("liangHuaDengChaMines", "input:scale");//稍后去掉拼音接口，只有中文和英文
		StaticFunctionMapU_AOPM_C.annotationMap.put("liangHuaEqualDelete", "input");
		StaticFunctionMapU_AOPM_C.annotationMap.put("liangHuaXiHuaHalfSide", "input");
		StaticFunctionMapU_AOPM_C.annotationMap.put("shehold1", "input:scale");
		StaticFunctionMapU_AOPM_C.annotationMap.put("caiJian1", "input:left:right");
		StaticFunctionMapU_AOPM_C.annotationMap.put("unZipWithPath", "zipFullPath:zipCategory");
		StaticFunctionMapU_AOPM_C.annotationMap.put("bootBackupByUsingGzip", "zipPath");
		StaticFunctionMapU_AOPM_C.annotationMap.put("fileToZip", "sourceFilePath:zipFilePath:fileName");
		StaticFunctionMapU_AOPM_C.annotationMap.put("compress", "data");
		StaticFunctionMapU_AOPM_C.annotationMap.put("uncompress", "data");
		
		StaticFunctionMapU_AOPM_C.annotationMap.put("P_Heart", "rp1:distance:scale");
		StaticFunctionMapU_AOPM_C.annotationMap.put("P_Model", "rp1:yanjing");
	}
	//Cache_M 入选jdk， 略
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
	public String EncoderByMd5(String salt, String pwd, int enctimes) throws NoSuchAlgorithmException
	, UnsupportedEncodingException;
	public String EncoderByMd5(String salt, String pwd) throws NoSuchAlgorithmException
	, UnsupportedEncodingException;
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

	////Group_O { 稍后把 非个人著作权的几十行踢出去。
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

	//Reflection {//renhat教授的稍后剔出去
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

	////VtoV{ 移除著作权的 和 u vecs 已经出现的稍后剔除出去。先注释掉
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

	//StringUtil { 见我git的 备份描述refer 和 著作申请版本备份refer 都有详细说明
	//md5 官方 注释下，以后用 dna MD5的作为纪念。 奇怪 还让我eclipse卡死一下刚。
	//public String encode(String input) throws Exception ;
	//public String decode(String str) throws UnsupportedEncodingException;
	//public String EncoderByMd5(String salt, String pwd, int enctimes) throws NoSuchAlgorithmException
	//, UnsupportedEncodingException ;
	//public String EncoderByMd5(String salt, String pwd) throws NoSuchAlgorithmException
	//, UnsupportedEncodingException ;

	//WAVtoLYG{ 以前设计视频的加密很少用。
	public void WAVtoLYG(String WAVf, String LYGf) throws IOException, UnsupportedAudioFileException;
	//LYGFileIO
	//public LYGFileIO initWithFFT(double fft[], MakeContainerZNSZ makeContainerZNSZ);
	//public void lygRead(String filepath) throws IOException ;
	//public void lygWrite(String string) throws IOException ;
	//public void IQ_header(RandomAccessFile raf) throws IOException ;
	//public void IV_ByAudioBytes(AudioFormat af) ;

	//DETA_ANN_HMM {
	public String[][] summing_P(String[][] inputNLP) throws IOException, InstantiationException
	, IllegalAccessException;
	//DETA_DNN {
	public String[][] summing_P(String[][] ann, String[][] rnn) throws IOException, InstantiationException
	, IllegalAccessException ;

	//sort he search 没有实用价值  见 top5Dsort，略，稍后我会把 养疗经的表格search 组件提取出来变成函数。
	//声音滤波发音 略，不想设计统一接口，因为涉及武器安防领域，本人去年承诺过，不再个人研发，

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
	//sourceFilePath is a root category of 待压缩的文件目录
	//zipFilePath is a zip category of 压缩的文件目录到
	//fileName is a zip file name
	public boolean fileToZip(String sourceFilePath, String zipFilePath, String fileName);

	//GzipUtil {
	// 压缩
	public byte[] compress(byte[] data) throws IOException;
	public byte[] compress(String str, String stringTypes) throws IOException;
	public byte[] uncompress(byte[] data) throws IOException;

	//Filter{
	public int[][] P_Heart(int[][] rp1, int distance, int scale);
	public int[][] P_Model(int[][] rp1, int[][] yanjing);//粗糙版本以后优化。
}