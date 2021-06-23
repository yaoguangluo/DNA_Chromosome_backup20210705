package AVQ.ASQ.OVQ.OSQ.VSQ.obj;
@SuppressWarnings("unused")
public class Verbal{
	public String getChinese() {
		return chinese;
	}
	public void I_Chinese(String chinese) {
		this.chinese = chinese;
	}
	public String getEnglish() {
		return english;
	}
	public void I_English(String english) {
		this.english = english;
	}
	public String getPartOfSpeech() {
		return partOfSpeech;
	}
	public void I_PartOfSpeech(String partOfSpeech) {
		this.partOfSpeech = partOfSpeech;
	}
	public String getExplain() {
		return explain;
	}
	public void I_Explain(String explain) {
		this.explain = explain;
	}
	public Verbal getNext() {
		return next;
	}
	public void I_Next(Verbal next) {
		this.next = next;
	}
	public Verbal getPrev() {
		return prev;
	}
	public void I_Prev(Verbal prev) {
		this.prev = prev;
	}
	private String chinese;
	private String japanese;
	private String korea;
	private String russian;
	private String arabic;
	private String french;
	private String german;
	private String spanish;
	private String pinyin;
	private String english;
	private String partOfSpeech;
	private String explain;
	private Verbal next;
	private Verbal prev;
}