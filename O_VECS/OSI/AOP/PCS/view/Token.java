package OSI.AOP.PCS.view;
//import lombok.Getter;
//import lombok.Setter;
//@Getter
//@Setter
public class Token {
    public String getuEmail() {
		return uEmail;
	}
	public void I_uEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	public String getuKey() {
		return uKey;
	}
	public void I_uKey(String uKey) {
		this.uKey = uKey;
	}
	public String getmPassword() {
		return mPassword;
	}
	public void I_mPassword(String mPassword) {
		this.mPassword = mPassword;
	}
	public long getuTime() {
		return uTime;
	}
	public void I_uTime(long uTime) {
		this.uTime = uTime;
	}
	private String uEmail;
    private String uKey;
    private String mPassword;
    private long uTime;
}