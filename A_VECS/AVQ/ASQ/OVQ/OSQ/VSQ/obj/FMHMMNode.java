package AVQ.ASQ.OVQ.OSQ.VSQ.obj;

import java.util.Map;

public class FMHMMNode extends HMMNode {
	public Map<String, Integer> getNext() {
		return next;
	}

	public void I_Next(Map<String, Integer> next) {
		this.next = next;
	}

	private Map<String, Integer> next;
}