package MS.VPC.SH;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import OSI.AOP.MS.VPC.server.ServerSleeper_Standard;
public class Sleeper_H{
	private Map<Integer, ServerSleeper_Standard> sleepersMap;
	public Sleeper_H(){
		sleepersMap= new ConcurrentHashMap<>();
	}
	public int getThreadsCount() {
		return sleepersMap.size();
	}
//	public void I_E_Sleeper(Integer sid, Sleeper sleeper) {
//		sleepersMap.put(sid, sleeper);
//	}
	public void I_E_Sleeper(Integer sid, ServerSleeper_Standard sleeper) {
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