package PEQ.OPM.VEC.test;
import java.io.IOException;

import AEU.OPM.VEC.ica.EducationRatio;
import SVQ.stable.StablePOS;
import SVQ.stable.StableString;
public class EducationLevelTest{
	double[] EducationLevel;
	double EducationDuration;
	public void IQ_EducationLevel(double[][] measurement) {
		EducationLevel = new double[measurement.length];
		for(int i = StablePOS.INT_ZERO; i < measurement.length; i++) {
			EducationLevel[i] = (measurement[i][StablePOS.INT_THREE] + measurement[i][StablePOS.INT_FOUR])
					/(measurement[i][StablePOS.INT_ONE] + measurement[i][StablePOS.INT_TWO] 
					+ measurement[i][StablePOS.INT_THREE] + measurement[i][StablePOS.INT_FOUR]
							+ measurement[i][StablePOS.INT_FIVE]);
			EducationDuration += EducationLevel[i];
			System.out.println("EducationLevel:" +EducationLevel[i]);
		}
		EducationDuration/=EducationLevel.length;
		System.out.println("EducationDuration:" + EducationDuration);
	}

	public static void main(String[] argv) throws IOException {
		//ICA kernel
		double[][] kernel = new double[3][];
		kernel[0] = new EducationRatio().getEducationKernel(StableString.text1);
		kernel[1] = new EducationRatio().getEducationKernel(StableString.text2);
		kernel[2] = new EducationRatio().getEducationKernel(StableString.text3);
		
		//ANN kernel
		double[][] kernelRatio = new double[3][];
		kernelRatio[0] = new EducationRatio().getEducationRatioKernel(kernel[0]);
		kernelRatio[1] = new EducationRatio().getEducationRatioKernel(kernel[1]);
		kernelRatio[2] = new EducationRatio().getEducationRatioKernel(kernel[2]);
		EducationLevelTest educationLevelTest = new EducationLevelTest();
		educationLevelTest.IQ_EducationLevel(kernelRatio);
	}
}