package PCI.ASQ.demension;
//Theory: Eclid
//Application: Yaoguang.luo
public class AMV_MVS_VSQ_2D{
	public AMV_MVS_VSQ_2D(double x, double y) {
		this.I_X(x);
		this.I_Y(y);
	}
	public AMV_MVS_VSQ_2D() {
		// TODO Auto-generated constructor stub
	}
	public double getX() {
		return x;
	}
	public void I_X(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void I_Y(double y) {
		this.y = y;
	}
	private double x;
	private double y;
	public String getTag() {
		return tag;
	}
	public void I_Tag(String tag) {
		this.tag = tag;
	}
	private String tag;
}