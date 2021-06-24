package MS.VPC.V;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import MS.VPC.SH.Sleeper_H;
public class VPCSResponse{
	public Socket getSocket() {
		return socket;
	}

	public void I_Socket(Socket socket) {
		this.socket = socket;
	}

	public Sleeper_H getSleeper_H() {
		return sleeper_H;
	}

	public void I_Sleeper_H(Sleeper_H sleeper_H) {
		this.sleeper_H = sleeper_H;
	}

	public Integer getHashCode() {
		return hashCode;
	}

	public void I_HashCode(Integer hashCode) {
		this.hashCode = hashCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void I_ErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getResponseContentType() {
		return ResponseContentType;
	}

	public void I_ResponseContentType(String responseContentType) {
		ResponseContentType = responseContentType;
	}

	private Socket socket;
	private Sleeper_H sleeper_H;
	private Integer hashCode;
	private int errorCode;
	private String ResponseContentType;
	public void return404() throws IOException {
		if(socket.isClosed()) {
			this.sleeper_H.D_ThreadById(this.hashCode);
			return;
		}
		PrintWriter pw = new PrintWriter(this.socket.getOutputStream(), true);
		pw.println("HTTP/1.1 404 OK\n\n"); 
		pw.flush();
		pw.close();
		socket.close();
		this.sleeper_H.D_ThreadById(this.hashCode);
	}

	public void returnErrorCode(Integer errorCode) throws IOException {
		if(socket.isClosed()) {
			this.sleeper_H.D_ThreadById(this.hashCode);
			return;
		}
		PrintWriter pw = new PrintWriter(this.socket.getOutputStream(), true);
		pw.println("HTTP/1.1 " + errorCode + " OK\n\n"); 
		pw.flush();
		pw.close();
		socket.close();
		this.sleeper_H.D_ThreadById(this.hashCode);
	}
}