package PEU.P.md5;
 
public class UsrToken {
	public String getuLevel() {
		return uLevel;
	}
	public void I_uLevel(String uLevel) {
		this.uLevel = uLevel;
	}
	public Integer getuId() {
		return uId;
	}
	public void I_uId(Integer uId) {
		this.uId = uId;
	}
	public String getuKey() {
		return uKey;
	}
	public void I_uKey(String uKey) {
		this.uKey = uKey;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void I_uPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public String getuToken() {
		return uToken;
	}
	public void I_uToken(String uToken) {
		this.uToken = uToken;
	}
	public long getuTime() {
		return uTime;
	}
	public void I_uTime(long uTime) {
		this.uTime = uTime;
	}
	private Integer uId;
	private String uKey;
	private String uPassword;
	private String uToken;
	private String uLevel;
	private long uTime;
}