package SEM.bloom;
import java.io.IOException;
import java.util.HashMap;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Map;
//用来索引文件。
//罗瑶光
//流程，1先工程归纳，然后2分类，最后3统计执行接口的相关java文件，4进行map索引。
public class StaticClassMap{
	public static Map<String, Object>  staticClassMap= new HashMap<>();
	public StaticClassMap(String string) throws IOException {
		if("A_VECS".equals(string)) {
			//..遍历工程文件。。。导入注册函数。
			//分词 读心术 情感分析，教育分析，文本分析，视觉动画
			//分词
			StaticFunctionMapA_VECS_C.load();//static 检查
			staticClassMap.put("A_VECS",new StaticFunctionMapA_VECS_E());//CE接口热化

		}
		if("A_IDUQ".equals(string)) {
			//..肽展公式， dna加密，vpcs服务器， 
			StaticFunctionMapA_IDUQ_C.load();//static 检查
			staticClassMap.put("A_IDUQ",new StaticFunctionMapA_IDUQ_E());//CE接口热化
		}
		
		if("O_VECS".equals(string)) {
			//..tinshell， 中文发音，数据库语言，离散余弦变换，
			StaticFunctionMapO_VECS_C.load();//static 检查
			staticClassMap.put("O_VECS",new StaticFunctionMapO_VECS_E());//CE接口热化
		}
		if("O_IDUQ".equals(string)) {
			//..etl 文档流执行， 保存。
			StaticFunctionMapO_IDUQ_C.load();//static 检查
			staticClassMap.put("O_IDUQ",new StaticFunctionMapO_IDUQ_E());//CE接口热化
		}
		
		if("P_VECS".equals(string)) {
			//..数据预测完整包。
			StaticFunctionMapP_VECS_C.load();//static 检查
			staticClassMap.put("P_VECS",new StaticFunctionMapP_VECS_E());//CE接口热化
		}
		if("P_IDUQ".equals(string)) {
			//..dna遗传杂交组件
			StaticFunctionMapP_IDUQ_C.load();//static 检查
			staticClassMap.put("P_IDUQ",new StaticFunctionMapP_IDUQ_E());//CE接口热化
		}
		
		if("M_VECS".equals(string)) {
			//..数据库 增删改查。界面控件，打印插件，三维词花组件
			StaticFunctionMapM_VECS_C.load();//static 检查
			staticClassMap.put("M_VECS",new StaticFunctionMapM_VECS_E());//CE接口热化
		}
		if("M_IDUQ".equals(string)) {
			//..欧拉 元基进制环路， 元基进制变换。
			StaticFunctionMapM_IDUQ_C.load();//static 检查
			staticClassMap.put("M_IDUQ",new StaticFunctionMapM_IDUQ_E());//CE接口热化
		}
		
		if("V_AOPM".equals(string)) {
			//..dna 概率钥匙非对称变换加密， 缓存，三维视觉，
			StaticFunctionMapV_AOPM_C.load();//static 检查
			staticClassMap.put("V_AOPM",new StaticFunctionMapV_AOPM_E());//CE接口热化
		}
		if("V_IDUQ".equals(string)) {
			//..etl核心组件，界面，etl读取文档，
			StaticFunctionMapV_IDUQ_C.load();//static 检查
			staticClassMap.put("V_IDUQ",new StaticFunctionMapV_IDUQ_E());//CE接口热化
		}
		
		if("E_AOPM".equals(string)) {
			//..德塔分词核心组件。
			StaticFunctionMapE_AOPM_C.load();//static 检查
			staticClassMap.put("E_AOPM",new StaticFunctionMapE_AOPM_E());//CE接口热化
		}
		if("E_IDUQ".equals(string)) {
			//..etl 界面操作组件，类 osgi 插件注册组件
			StaticFunctionMapE_IDUQ_C.load();//static 检查
			staticClassMap.put("E_IDUQ",new StaticFunctionMapE_IDUQ_E());//CE接口热化
		}
		
		if("C_AOPM".equals(string)) {
			//..vpcs服务器中心， 自然语言处理组件
			StaticFunctionMapC_AOPM_C.load();//static 检查
			staticClassMap.put("C_AOPM",new StaticFunctionMapC_AOPM_E());//CE接口热化
		}
		if("C_IDUQ".equals(string)) {
			//..自然语言 控制中心
			StaticFunctionMapC_IDUQ_C.load();//static 检查
			staticClassMap.put("C_IDUQ",new StaticFunctionMapC_IDUQ_E());//CE接口热化
		}
		
		if("S_AOPM".equals(string)) {
			//..数据记录中心
			StaticFunctionMapS_AOPM_C.load();//static 检查
			staticClassMap.put("S_AOPM",new StaticFunctionMapS_AOPM_E());//CE接口热化
		}
		if("S_IDUQ".equals(string)) {
			//..线性，非线性数据操作中心
			StaticFunctionMapS_IDUQ_C.load();//static 检查
			staticClassMap.put("S_IDUQ",new StaticFunctionMapS_IDUQ_E());//CE接口热化
		}
		
		if("I_AOPM".equals(string)) {
			//..语音记录，三维数据分析登记
			StaticFunctionMapI_AOPM_C.load();//static 检查
			staticClassMap.put("I_AOPM",new StaticFunctionMapI_AOPM_E());//CE接口热化
		}
		if("I_VECS".equals(string)) {
			//..肽腐蚀， 非卷积视觉，图片读脏
			StaticFunctionMapI_VECS_C.load();//static 检查
			staticClassMap.put("I_VECS",new StaticFunctionMapI_VECS_E());//CE接口热化
		}
		
		if("D_AOPM".equals(string)) {
			//..数据异常处理，
			StaticFunctionMapD_AOPM_C.load();//static 检查
			staticClassMap.put("A_AOPM",new StaticFunctionMapD_AOPM_E());//CE接口热化
		}
		if("D_VECS".equals(string)) {
			//..数据异常处理，，稍后把功能是 删除的 移到这里来。
			StaticFunctionMapD_VECS_C.load();//static 检查
			staticClassMap.put("D_VECS",new StaticFunctionMapD_VECS_E());//CE接口热化
		}
		
		if("U_AOPM".equals(string)) {
			//..卷积变换处理
			StaticFunctionMapU_AOPM_C.load();//static 检查
			staticClassMap.put("U_AOPM",new StaticFunctionMapU_AOPM_E());//CE接口热化
		}
		if("U_VECS".equals(string)) {
			//..数据变换处理
			StaticFunctionMapU_VECS_C.load();//static 检查
			StaticFunctionMapU_VECS_E staticFunctionMapU_VECS_E= new StaticFunctionMapU_VECS_E();
			staticClassMap.put("U_VECS", staticFunctionMapU_VECS_E);//CE接口热化
			staticFunctionMapU_VECS_E.annotationMap.put("main", "main");//注册一个main接口
			//。。..继续注册。。
			//。。
		}
		
		if("Q_AOPM".equals(string)) {
			//..六元dna杂交计算框架
			StaticFunctionMapQ_AOPM_C.load();//static 检查
			staticClassMap.put("Q_AOPM",new StaticFunctionMapQ_AOPM_E());//CE接口热化
		}
		if("Q_VECS".equals(string)) {
			//..dna搜索， 数据库orm， 函数语言
			StaticFunctionMapQ_VECS_C.load();//static 检查
			staticClassMap.put("Q_VECS",new StaticFunctionMapQ_VECS_E());//CE接口热化
		}
		// TODO Auto-generated constructor stub
	}
	
}