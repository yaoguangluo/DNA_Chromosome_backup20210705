package PCI.ASQ.basic;
//Theory: ±´Ò¶Ë¹
//Application: Yaoguang.luo
public class Ratio{
	public double getErrorRatio() {
		return errorRatio;
	}
	public void I_ErrorRatio(double errorRatio) {
		this.errorRatio = errorRatio;
	}
	public double getRightRatio() {
		return rightRatio;
	}
	public void I_RightRatio(double rightRatio) {
		this.rightRatio = rightRatio;
	}
	private double errorRatio;
	private double rightRatio;
}