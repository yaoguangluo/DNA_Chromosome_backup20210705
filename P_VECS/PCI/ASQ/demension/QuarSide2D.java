package PCI.ASQ.demension;
//Theory: ÎÞ·¨¿¼Ö¤
//Application: Yaoguang.luo
public class QuarSide2D{
	public Line2D getTop() {
		return top;
	}
	public void I_Top(Line2D top) {
		this.top = top;
	}
	public Line2D getDown() {
		return down;
	}
	public void I_Down(Line2D down) {
		this.down = down;
	}
	public Line2D getLeft() {
		return left;
	}
	public void I_Left(Line2D left) {
		this.left = left;
	}
	public Line2D getRight() {
		return right;
	}
	public void I_Right(Line2D right) {
		this.right = right;
	}
	private Line2D top;
	private Line2D down;
	private Line2D left;
	private Line2D right;
}