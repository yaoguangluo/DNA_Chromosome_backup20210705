package PCI.ASQ.demension;
//Theory: Euclid
//Application: Yaoguang.luo
public class AMV_MVS_VSQ_3D{
	public AMV_MVS_VSQ_3D(double x, double y, double z) {
		this.I_X(x);
		this.I_Y(y);
		this.I_Z(z);
	}
	public AMV_MVS_VSQ_3D() {
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
	public double getZ() {
		return z;
	}
	public void I_Z(double z) {
		this.z = z;
	}
	private double x;
	private double y;
	private double z;
	public String getTag() {
		return tag;
	}
	public void I_Tag(String tag) {
		this.tag = tag;
	}
	private String tag;
}