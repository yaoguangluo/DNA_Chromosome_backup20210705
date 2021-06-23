package MS.OP.SM.AOP.MEC.SIQ.cache;
public class DetaDBBufferCache {

	public String getValue() {
		return value;
	}

	public void I_Value(String value) {
		this.value = value;
	}

	public Object getObject() {
		return object;
	}

	public void I_Object(Object object) {
		this.object = object;
	}

	public long getTimeOut() {
		return timeOut;
	}

	public void I_TimeOut(long timeOut) {
		this.timeOut = timeOut;
	}

	private String value;
	private Object object;
	private long timeOut;
	public DetaDBBufferCache() {
		super();
	}

	public DetaDBBufferCache(String value, Object object, long timeOut) {
		this.value = value;
		this.object = object;
		this.timeOut = timeOut;
	}
} 