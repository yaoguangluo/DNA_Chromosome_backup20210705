package PEU.P.cache;
public class Cache {
	private String key;
	private Object value;
	private long timeOut;
	private boolean expired;
	public Cache() {
		super();
	}

	public Cache(String key, Object value, long timeOut, boolean expired) {
		this.key = key;
		this.value = value;
		this.timeOut = timeOut;
		this.expired = expired;
	}

	public String getKey() {
		return key;
	}

	public long getTimeOut() {
		return timeOut;
	}

	public Object getValue() {
		return value;
	}

	public void I_Key(String string) {
		key = string;
	}

	public void I_TimeOut(long l) {
		timeOut = l;
	}

	public void I_Value(Object object) {
		value = object;
	}

	public boolean isExpired() {
		return expired;
	}

	public void I_Expired(boolean b) {
		expired = b;
	}
} 