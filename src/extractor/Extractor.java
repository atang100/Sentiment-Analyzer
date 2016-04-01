package extractor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;


public class Extractor {
	
	private static String input_text_file = "semeval_twitter_data.txt";
	private static String output_text_file = "output.arff";
	private static Stop_Word stopWord = new Stop_Word();
	private static Emoticon emoticon = new Emoticon();
	private static ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
	
	public static void main(String args[]) {
		retreiveTweet();
		outputTweetInArffFormat();
	}
	
	public static void retreiveTweet() {
		
		System.out.println("Start Retreive Tweet");
		
		try (BufferedReader br = new BufferedReader(new FileReader(input_text_file)))
		{
			try {
				
				String sCurrentLine;
				while ((sCurrentLine = br.readLine()) != null) {
					
					String opinion = sCurrentLine.split("\t", -1)[2];
					String message = sCurrentLine.split("\t", -1)[3];
					
					opinion = removeNonAlphabetFromString(opinion);
					
					message = removeApostropheFromString(message);
					
					message = removeURLFromString(message);
					
					//Punctuation might be necessary to keep track of emoticons and exclamation marks.
					//sCurrentLine = removeNonAlphabetFromString(sCurrentLine);
					
					message = message.toLowerCase();
					
					String filteredMessage = "";
					String[] wordList = message.split("\\s+");
					
					for (int i = 0; i < wordList.length; i++) {
						if (!stopWord.isStopWord(wordList[i])){
							filteredMessage += wordList[i] + " ";
						}
					}
					
					filteredMessage = filteredMessage.trim();
					
					int questionMarkCount = countOccurrences(filteredMessage, "?");
					int exclaimationMarkCount = countOccurrences(filteredMessage, "!");
					
					int positiveEmoticon = emoticon.getPositiveEmoticonCount(filteredMessage);
					int negativeEmoticon = emoticon.getNegativeEmoticonCount(filteredMessage);

					Tweet tweet = new Tweet(
							filteredMessage, 
							opinion, 
							questionMarkCount, 
							exclaimationMarkCount,
							positiveEmoticon,
							negativeEmoticon);
					tweetList.add(tweet);
					
				}
				
			} finally {
				br.close();
		    }
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		System.out.println("Complete Retreive Tweet");
	}
	
	public static void outputTweetInArffFormat() {
		
		System.out.println("Start Output Tweet");
		
		try {

			BufferedWriter out = new BufferedWriter(new FileWriter(output_text_file, false));
			
			out.write("@relation opinion");
			out.newLine();
			
			out.write("@attribute sentence string");
			out.newLine();
			
			out.write("@attribute numberOfQuestionMark NUMERIC");
			out.newLine();
			
			out.write("@attribute numberOfExclaimationMark NUMERIC");
			out.newLine();
			
			out.write("@attribute numberOfPositiveEmoticon NUMERIC");
			out.newLine();
			
			out.write("@attribute numberOfNegativeEmoticon NUMERIC");
			out.newLine();
			
			out.write("@attribute category {positive,negative,neutral,objective}");
			out.newLine();
			
			out.write("@data");
			out.newLine();
			
			for (int i = 0; i < tweetList.size(); i++) {
				Tweet tweet = tweetList.get(i);
				out.write("\' " + tweet.getMessage() + " \'" + 
					"," + tweet.getNumberOfQuestionMark() +
					"," + tweet.getNumberOfExclaimationMark() +
					"," + tweet.getPositiveEmoticonCount() +
					"," + tweet.getNegativeEmoticonCount() +
					"," + tweet.getOpinion()
					);
				out.newLine();
			}
			
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
	    }
		
		System.out.println("Complete Output Tweet");
	}
	
	/**
	 * Remove URL links from string
	 * 
	 * @param s
	 * @return
	 */
	public static String removeURLFromString(String string) {

        string = string.replaceAll("https?://\\S+\\s?", ""); //Removes URL that begin with http
        string = string.replaceAll("www.\\S+\\s?", ""); //Removes URL that being with www
		return string;
	}
	
	/**
	 * Remove non alphabets from string.
	 * 
	 * @param string
	 * @return
	 */
	public static String removeNonAlphabetFromString(String string) {
		string = string.replaceAll("[^A-Za-z ]", "");
		return string;
	}
	
	public static String removeApostropheFromString(String string) {
		string = string.replaceAll("'", "");
		return string;
	}

	public static int countOccurrences(String sentence, String substring)
	{
		int lastIndex = 0;
		int count = 0;
		
		while(lastIndex != -1){

		    lastIndex = sentence.indexOf(substring, lastIndex);

		    if(lastIndex != -1){
		        count ++;
		        lastIndex += substring.length();
		    }
		} 
		return count;
	}
}
