package OSI.AOP.VPC.view;

public class Talk {
	public String getObject() {
		return object;
	}
	public void I_Object(String object) {
		this.object = object;
	}
	public String getMessage() {
		return message;
	}
	public void I_Message(String message) {
		this.message = message;
	}
	public boolean isRead() {
		return isRead;
	}
	public void I_Read(boolean isRead) {
		this.isRead = isRead;
	}
	public long getTime() {
		return time;
	}
	public void I_Time(long time) {
		this.time = time;
	}
	private String object;
    private String message;
    private boolean isRead;
    private long time;
}