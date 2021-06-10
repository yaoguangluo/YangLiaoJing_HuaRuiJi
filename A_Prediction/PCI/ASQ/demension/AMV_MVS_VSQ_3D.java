package PCI.ASQ.demension;
//Theory: Euclid
//Application: Yaoguang.luo
public class AMV_MVS_VSQ_3D{
	public AMV_MVS_VSQ_3D(double x, double y, double z) {
		this.setX(x);
		this.setY(y);
		this.setZ(z);
	}
	public AMV_MVS_VSQ_3D() {
		// TODO Auto-generated constructor stub
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	private double x;
	private double y;
	private double z;
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	private String tag;
}