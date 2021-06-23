package PCS.common;
public class KeyStore{
	public long getCode() {
		return code;
	}
	public void I_Code(long code) {
		this.code = code;
	}
	public long getExpDate() {
		return expDate;
	}
	public void I_ExpDate(long expDate) {
		this.expDate = expDate;
	}
	public long getGid() {
		return gid;
	}
	public void I_Gid(long gid) {
		this.gid = gid;
	}
	public String getEmail() {
		return email;
	}
	public void I_Email(String email) {
		this.email = email;
	}
	public long code;
	public long expDate;
	public long gid;
	public String email;
}