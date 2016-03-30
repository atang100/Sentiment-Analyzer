package extractor;

public class Tweet {
	private String message;
	private String opinion;
	
	public Tweet(String m, String o) {
		message = m;
		opinion = o;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getOpinion() {
		return opinion;
	}
}
