package AVQ.ASQ.OVQ.OSQ.VSQ.obj;

public class WordFrequency {
	public String getPOS() {
		return POS;
	}

	public void I_POS(String POS) {
		this.POS = POS;
	}

	public String getWord() {
		return word;
	}

	public void I_Word(String word) {
		this.word = word;
	}

	public int getFrequency() {
		return frequency;
	}

	public void I_Frequency(int frequency) {
		this.frequency = frequency;
	}

	public WordFrequency getLeft() {
		return left;
	}

	public void I_Left(WordFrequency left) {
		this.left = left;
	}

	public WordFrequency getRight() {
		return right;
	}

	public void I_Right(WordFrequency right) {
		this.right = right;
	}

	private String word;
	private String POS;
	private int frequency;
	private WordFrequency left;
	private WordFrequency right;
}