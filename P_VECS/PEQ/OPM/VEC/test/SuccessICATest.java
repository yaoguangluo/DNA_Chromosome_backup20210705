package PEQ.OPM.VEC.test;

import java.io.IOException;

import AEU.OPM.VEC.ica.InitBehaviorICAKernel;
import PEU.P.matrix.*;
import SVQ.stable.StableString;

public class SuccessICATest{
	public double[][] kernelCNN;
	public void IQ_KernelCNN(double[][] kernel) {
		kernelCNN = new CnnMeasure().getCnnMeansure(kernel);
	}
	public static void main(String[] argv) throws IOException {
		//ICA kernel
		double[][] kernel = new double[3][];
		kernel[0] = new InitBehaviorICAKernel().getBehaviorICAKernel(StableString.text1);
		kernel[1] = new InitBehaviorICAKernel().getBehaviorICAKernel(StableString.text2);
		kernel[2] = new InitBehaviorICAKernel().getBehaviorICAKernel(StableString.text3);
		SuccessICATest successICATest=new SuccessICATest();
		successICATest.IQ_KernelCNN(kernel);
		for(int i=0;i<successICATest.kernelCNN.length;i++) {
			for(int j=0;j<successICATest.kernelCNN[0].length;j++) {
				System.out.print(successICATest.kernelCNN[i][j] + " ");
			}
			System.out.println();
		}
		//do ICA normalization
		//do ROBUST ICA 
		//do map
		//do reduce sets
		//sets Turing
	}
}