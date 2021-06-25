package PEQ.OPM.VEC.test;
import java.io.IOException;

import AEU.OPM.VEC.ica.InitBehaviorICAKernel;
import SVQ.stable.StablePOS;
import SVQ.stable.StableString;

public class LiterarinessLevelTest{
	double[] literarinessLevel;
	double literarinessDuration;
	public void IQ_EducationLevel(double[][] measurement) {
		literarinessLevel= new double[measurement.length];
		for(int i= StablePOS.INT_ZERO; i< measurement.length; i++) {
			literarinessLevel[i]=(measurement[i][StablePOS.INT_ZERO]*measurement[i][StablePOS.INT_THREE])
					/measurement[i][StablePOS.INT_ONE];
			literarinessDuration+=literarinessLevel[i];
			System.out.println("literarinessLevel:" +literarinessLevel[i]);
		}
		literarinessDuration/=literarinessLevel.length;
		System.out.println("literarinessDuration:" + literarinessDuration);
	}

	public static void main(String[] argv) throws IOException {
		//ICA kernel
		double[][] kernel = new double[3][];
		kernel[0] = new InitBehaviorICAKernel().getBehaviorICAKernel(StableString.text1);
		kernel[1] = new InitBehaviorICAKernel().getBehaviorICAKernel(StableString.text2);
		kernel[2] = new InitBehaviorICAKernel().getBehaviorICAKernel(StableString.text3);
		LiterarinessLevelTest educationLevelTest = new LiterarinessLevelTest();
		educationLevelTest.IQ_EducationLevel(kernel);
	}
}