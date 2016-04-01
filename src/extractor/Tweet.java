package extractor;

public class Tweet {
	private String message;
	private String opinion;
	private int numberOfQuestionMark;
	private int numberOfExclaimationMark;
	private int positiveEmoticonCount;
	private int negativeEmoticonCount;
	
	public Tweet(String m, String o, int numberOfQuestionMark, int numberOfExclaimationMark, int positiveEmoticonCount, int negativeEmoticonCount) {
		message = m;
		opinion = o;
		this.numberOfQuestionMark = numberOfQuestionMark;
		this.numberOfExclaimationMark = numberOfExclaimationMark;
		this.positiveEmoticonCount = positiveEmoticonCount;
		this.negativeEmoticonCount = negativeEmoticonCount;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getOpinion() {
		return opinion;
	}
	
	public int getNumberOfQuestionMark() {
		return numberOfQuestionMark;
	}
	
	public int getNumberOfExclaimationMark() {
		return numberOfExclaimationMark;
	}
	
	public int getPositiveEmoticonCount() {
		return positiveEmoticonCount;
	}
	
	public int getNegativeEmoticonCount() {
		return negativeEmoticonCount;
	}
}
