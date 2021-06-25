package MS.VPC.SH;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
public class Sleeper_H{
	private Map<Integer, Sleeper> sleepersMap;
	public Sleeper_H(){
		sleepersMap = new ConcurrentHashMap<>();
	}
	public int getThreadsCount() {
		return sleepersMap.size();
	}
	public void I_E_Sleeper(Integer sid, Sleeper sleeper) {
		sleepersMap.put(sid, sleeper);
	}
	public void D_ThreadById(Integer sid) {
		if(sleepersMap.containsKey(sid)){
			sleepersMap.remove(sid);
		}
	}
	public void callSkivvy() {
		sleepersMap.clear();
		System.gc();
	}
}