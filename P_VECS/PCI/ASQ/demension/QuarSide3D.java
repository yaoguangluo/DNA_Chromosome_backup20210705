package PCI.ASQ.demension;
//Theory: ÎÞ·¨¿¼Ö¤
//Application: Yaoguang.luo
public class QuarSide3D{
	public Line3D getTop() {
		return top;
	}
	public void I_Top(Line3D top) {
		this.top = top;
	}
	public Line3D getDown() {
		return down;
	}
	public void I_Down(Line3D down) {
		this.down = down;
	}
	public Line3D getLeft() {
		return left;
	}
	public void I_Left(Line3D left) {
		this.left = left;
	}
	public Line3D getRight() {
		return right;
	}
	public void I_Right(Line3D right) {
		this.right = right;
	}
	private Line3D top;
	private Line3D down;
	private Line3D left;
	private Line3D right;
}