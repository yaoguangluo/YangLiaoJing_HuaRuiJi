package ME.APM.VSQ.OPE.hospital;

public class DetaLabelStables{
	public boolean target= false;
	public boolean isIndexed= false;
	public String indexString= "";
	public static DetaLabelStables stableImages;
	public void setStableImages() {
		DetaLabelStables.stableImages= new DetaLabelStables();
	}
	public void setTarget(boolean target) {
		DetaLabelStables.stableImages.target= target;
	}
	public void setIndexString(String string) {
		DetaLabelStables.stableImages.indexString= string;
		DetaLabelStables.stableImages.isIndexed= true;
	}
}