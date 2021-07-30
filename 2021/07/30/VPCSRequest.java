package MS.VPC.V;

import java.util.Map;

public class VPCSRequest {
	private String requestIp;
	private String requestName;
	private String requestLink;
	private boolean requestIsRest;
	private String requestFilePath;
	private String requestFileCode;
	private String requestForwardType;
	//避免循环嵌套，加个port标识。稍后看要不要做继承分类。20210730
	private String requestPort= "";
	private String requestIpFix;
	private String requestNameFix;
	private String requestLinkFix;
	private Map<String, String> requestValue;
	
	public String getRequestPort() {
		return requestPort;
	}

	public void I_RequestPort(String requestPort) {
		this.requestPort = requestPort;
	}
	
	public String getRequestIp() {
		return requestIp;
	}

	public void I_RequestIp(String requestIp) {
		this.requestIp = requestIp;
	}

	public String getRequestName() {
		return requestName;
	}

	public void I_RequestName(String requestName) {
		this.requestName = requestName;
	}

	public String getRequestLink() {
		return requestLink;
	}

	public void I_RequestLink(String requestLink) {
		this.requestLink = requestLink;
	}

	public String getRequestIpFix() {
		return requestIpFix;
	}

	public void I_RequestIpFix(String requestIpFix) {
		this.requestIpFix = requestIpFix;
	}

	public String getRequestNameFix() {
		return requestNameFix;
	}

	public void I_RequestNameFix(String requestNameFix) {
		this.requestNameFix = requestNameFix;
	}

	public String getRequestLinkFix() {
		return requestLinkFix;
	}

	public void I_RequestLinkFix(String requestLinkFix) {
		this.requestLinkFix = requestLinkFix;
	}

	public Map<String, String> getRequestValue() {
		return requestValue;
	}

	public void I_RequestValue(Map<String, String> requestValue) {
		this.requestValue = requestValue;
	}

	public boolean getRequestIsRest() {
		return requestIsRest;
	}

	public void I_RequestIsRest(boolean requestIsRest) {
		this.requestIsRest = requestIsRest;
	}

	public String getRequestForwardType() {
		return requestForwardType;
	}

	public void I_RequestForwardType(String requestForwardType) {
		this.requestForwardType = requestForwardType;
	}

	public String getRequestFilePath() {
		return requestFilePath;
	}

	public void I_RequestFilePath(String requestFilePath) {
		this.requestFilePath = requestFilePath;
	}

	public String getRequestFileCode() {
		return requestFileCode;
	}

	public void I_RequestFileCode(String requestFileCode) {
		this.requestFileCode = requestFileCode;
	}
}