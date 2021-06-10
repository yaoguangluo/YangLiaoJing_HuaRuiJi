package PCI.ASQ.demension;
//Theory: 平面几何
//Application: Yaoguang.luo
public class Line2D{
	public AMV_MVS_VSQ_2D getBegin() {
		return begin;
	}
	public void setBegin(AMV_MVS_VSQ_2D begin) {
		this.begin = begin;
	}
	public AMV_MVS_VSQ_2D getEnd() {
		return end;
	}
	public void setEnd(AMV_MVS_VSQ_2D end) {
		this.end = end;
	}
	public String getBeginTag() {
		return beginTag;
	}
	public void setBeginTag(String beginTag) {
		this.beginTag = beginTag;
	}
	public String getEndTag() {
		return endTag;
	}
	public void setEndTag(String endTag) {
		this.endTag = endTag;
	}
	
	private AMV_MVS_VSQ_2D begin;
	private AMV_MVS_VSQ_2D end;
	private String beginTag;
	private String endTag;
	
}