package PEU.P.dna;
//MD5的token也是罗瑶光先生设计的,这里分出来到 dna processor, 备注下
public class Token {
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuKey() {
		return uKey;
	}
	public void setuKey(String uKey) {
		this.uKey = uKey;
	}
	public String getmPassword() {
		return mPassword;
	}
	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
	}
	public long getuTime() {
		return uTime;
	}
	public void setuTime(long uTime) {
		this.uTime = uTime;
	}
	public String getUpdsie() {
		return updsie;
	}
	public void setUpdsie(String updsie) {
		this.updsie = updsie;
	}
	public String getUpdsis() {
		return updsis;
	}
	public void setUpdsis(String updsis) {
		this.updsis = updsis;
	}
	public String getUpdsde() {
		return updsde;
	}
	public void setUpdsde(String updsde) {
		this.updsde = updsde;
	}
	public String getUpdsds() {
		return updsds;
	}
	public void setUpdsds(String updsds) {
		this.updsds = updsds;
	}
	private String uEmail;
	private String uKey;
	private String updsie;
	private String updsis;
	private String updsde;
	private String updsds;
	private String mPassword;
	private long uTime;
}