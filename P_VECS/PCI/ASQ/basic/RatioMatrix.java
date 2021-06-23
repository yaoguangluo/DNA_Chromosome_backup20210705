package PCI.ASQ.basic;
//Theory: ±´Ò¶Ë¹
//Application: Yaoguang.luo
public class RatioMatrix{
	public double getRightErrorRatio() {
		return rightErrorRatio;
	}
	public void I_RightErrorRatio(double rightErrorRatio) {
		this.rightErrorRatio = rightErrorRatio;
	}
	public double getRightRightRatio() {
		return rightRightRatio;
	}
	public void I_RightRightRatio(double rightRightRatio) {
		this.rightRightRatio = rightRightRatio;
	}
	public double getErrorErrorRatio() {
		return errorErrorRatio;
	}
	public void I_ErrorErrorRatio(double errorErrorRatio) {
		this.errorErrorRatio = errorErrorRatio;
	}
	public double getErrorRightRatio() {
		return errorRightRatio;
	}
	public void I_ErrorRightRatio(double errorRightRatio) {
		this.errorRightRatio = errorRightRatio;
	}
	public double rightErrorRatio;
	public double rightRightRatio;
	public double errorErrorRatio;
	public double errorRightRatio;
}