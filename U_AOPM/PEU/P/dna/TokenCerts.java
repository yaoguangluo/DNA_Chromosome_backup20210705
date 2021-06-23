package PEU.P.dna;
//MD5替换DNA已经开始,准备设计个记录单例类.
//可以用lombok 也可以直接public setter getter
//罗瑶光
public class TokenCerts {
	public String getPassword() {
		return password;
	}
	public void I_Password(String password) {
		this.password = password;
	}
	public String getPdnKey() {
		return pdnKey;
	}
	public void I_PdnKey(String pdnKey) {
		this.pdnKey = pdnKey;
	}
	public String getPdnLock() {
		return pdnLock;
	}
	public void I_PdnLock(String pdnLock) {
		this.pdnLock = pdnLock;
	}
	public String getPdnPassword() {
		return pdnPassword;
	}
	public void I_PdnPassword(String pdnPassword) {
		this.pdnPassword = pdnPassword;
	}
	public String getPds() {
		return pds;
	}
	public void I_Pds(String pds) {
		this.pds = pds;
	}
	private String password;
	private String pds;
	private String pdnKey;
	private String pdnLock;
	private String pdnPassword;
}