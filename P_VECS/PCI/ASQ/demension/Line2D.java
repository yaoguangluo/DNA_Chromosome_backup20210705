package PCI.ASQ.demension;
//Theory: 平面几何
//Application: Yaoguang.luo
public class Line2D{
	public AMV_MVS_VSQ_2D getBegin() {
		return begin;
	}
	public void I_Begin(AMV_MVS_VSQ_2D begin) {
		this.begin = begin;
	}
	public AMV_MVS_VSQ_2D getEnd() {
		return end;
	}
	public void I_End(AMV_MVS_VSQ_2D end) {
		this.end = end;
	}
	public String getBeginTag() {
		return beginTag;
	}
	public void I_BeginTag(String beginTag) {
		this.beginTag = beginTag;
	}
	public String getEndTag() {
		return endTag;
	}
	public void I_EndTag(String endTag) {
		this.endTag = endTag;
	}
	
	private AMV_MVS_VSQ_2D begin;
	private AMV_MVS_VSQ_2D end;
	private String beginTag;
	private String endTag;
	
}