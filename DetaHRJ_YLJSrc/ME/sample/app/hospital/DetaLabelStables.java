package ME.sample.app.hospital;

public class DetaLabelStables{
	public boolean target= false;
	public static DetaLabelStables stableImages;
	public void setStableImages() {
		DetaLabelStables.stableImages= new DetaLabelStables();
	}
	public void setTarget(boolean target) {
		DetaLabelStables.stableImages.target= target;
	}
}