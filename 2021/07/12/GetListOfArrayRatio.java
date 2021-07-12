package PCI.ASQ.probability;
import java.util.ArrayList;
import java.util.List;

//稍后用于肽展处理后的 PCA 颜色比率
//罗瑶光
public class GetListOfArrayRatio{
	public static List<Double> getPercentListByOuterKey(Double[] array){
		List<Double> output= new ArrayList<>();				
		kernelFix(output, array, 0);
		return output;
	}

	public static void kernel(List<Double> output, Double[] array, int j) {
		for(int i= j; i< array.length; i++) {
			for(int k= i+ 1; k< array.length; k++) {
				output.add(array[j]/array[i]);
			}
		}
		if(j< array.length) {
			kernel(output, array, j+ 1);
		}
	}

	public static void kernelFix(List<Double> output, Double[] array, int j) {
		for(int i= j; i< array.length; i++) {
			for(int k= i+ 1; k< array.length; k++) {
				output.add(0==array[i]? 0: array[k]/array[i]);
			}
		}
		if(j< array.length) {
			kernelFix(output, array, j+ 1);
		}
	}
}