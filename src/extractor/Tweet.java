package extractor;

public class Tweet {
	private String message;
	private String opinion;
	private int positiveNumber;
	private int negativeNumber;
	private int neutralNumber;
	
	public Tweet(String m, String o, int positiveNumber, int negativeNumber, int neutralNumber) {
		message = m;
		opinion = o;
		this.neutralNumber = neutralNumber;
		this.positiveNumber = positiveNumber;
		this.negativeNumber = negativeNumber;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getOpinion() {
		return opinion;
	}
	
	public int getPositiveNumber() {
		return positiveNumber;
	}
	
	public int getNegativeNumber() {
		return negativeNumber;
	}
	
	public int getNeutralNumber() {
		return neutralNumber;
	}
}
