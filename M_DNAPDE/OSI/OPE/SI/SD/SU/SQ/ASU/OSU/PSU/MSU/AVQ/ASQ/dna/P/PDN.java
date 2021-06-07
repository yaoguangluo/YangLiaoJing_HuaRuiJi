package OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dna.P;
public class PDN{
	public boolean[] getPdn() {
		return pdn;
	}

	public void setPdn(boolean[] pdn) {
		this.pdn = pdn;
	}

	private boolean[] pdn;
	public void init(boolean isMale) {
		pdn= new  boolean[1985525];
		for(int i= 0; i< pdn.length; i++) {
			if(isMale) {
				pdn[i]= true;
			}else {
				pdn[i]= false;
			}
		}
	}
}