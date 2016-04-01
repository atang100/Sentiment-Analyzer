package extractor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;


public class Extractor {
	
	private static String input_text_file = "semeval_twitter_data.txt";
	private static String output_text_file = "output.arff";
	private static String pos_neg_text_file = "pos_neg.txt";
	private static Stop_Word stopWord = new Stop_Word();
	private static ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
	private static HashMap<String, String> positiveArray = new HashMap<String, String>(2721);
	private static HashMap<String, String> negativeArray = new HashMap<String, String>(4913);
	private static HashMap<String, String> neutralArray = new HashMap<String, String>(571);

	public static void main(String args[]) {
		retrievePositiveAndNegativeWords();
		retreiveTweet();
		outputTweetInArffFormat();
//		outputPositiveAndNegativeWords();
	}

	public static void retreiveTweet() {
		
		System.out.println("Start Retreive Tweet");
		
		try (BufferedReader br = new BufferedReader(new FileReader(input_text_file)))
		{
			try {
				String sCurrentLine;

				while ((sCurrentLine = br.readLine()) != null) {
					int[] numberOfCategories = {0,0,0};
					
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
					numberOfCategories = getNumberOfCategories(filteredMessage);
					Tweet tweet = new Tweet(filteredMessage, opinion, numberOfCategories[0], numberOfCategories[1], numberOfCategories[2]);
					
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
			
			out.write("@attribute category {positive,negative,neutral,objective}");
			out.newLine();
			
			out.write("@attribute numberOfPositiveWords integer");
			out.newLine();
			
			out.write("@attribute numberOfNegativeWords integer");
			out.newLine();
			
			out.write("@attribute numberOfNeutralWords integer");
			out.newLine();
			
			out.write("@data");
			out.newLine();
			
			for (int i = 0; i < tweetList.size(); i++) {
				Tweet tweet = tweetList.get(i);
				out.write("\' " + tweet.getMessage() + " \'" + "," + tweet.getOpinion() + "," + tweet.getPositiveNumber() + "," + tweet.getNegativeNumber() + "," + tweet.getNeutralNumber());
				out.newLine();
			}
			
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
	    }
		
		System.out.println("Complete Output Tweet");
	}
	
public static void outputPositiveAndNegativeWords() {
		System.out.println("Start Output words");
		
		try {

			BufferedWriter out = new BufferedWriter(new FileWriter("pos_neg2.txt", false));
			
			for(Entry<String, String> entry : positiveArray.entrySet()) {
				System.out.println("Running");
			    String key = entry.getKey();
			    out.write(key + " " + "positive");
			    out.newLine();
			}
			
			for(Entry<String, String> entry : negativeArray.entrySet()) {
			    String key = entry.getKey();
			    out.write(key + " " + "negative");
			    out.newLine();
			}
			
			for(Entry<String, String> entry : neutralArray.entrySet()) {
			    String key = entry.getKey();
			    out.write(key + " " + "neutral");
			    out.newLine();
			}
			
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
	    }
		
		System.out.println("Complete Output words");
	}
	
	public static void retrievePositiveAndNegativeWords() {
		System.out.println("Start Retreive Pos Neg and Neutral Words");
		int count = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(pos_neg_text_file)))
		{
			try {
				String sCurrentLine;
				while ((sCurrentLine = br.readLine()) != null) {
					String[] attributes = sCurrentLine.split(" ");
					count++;
					System.out.println(count);
					
					if (attributes[1].equals("negative")) {
						negativeArray.put(attributes[0], attributes[0]);
					} else if (attributes[1].equals("positive")){
						positiveArray.put(attributes[0], attributes[0]);
					} else if (attributes[1].equals("neutral")) {
						neutralArray.put(attributes[0], attributes[0]);
					} else {
						//Only get's here when the priorpolarity is both or extra attributes are included in the line
						//This is only about 10 of the lines. 
					}
				}
				
			} finally {
				br.close();
		    }
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Complete Retreive Pos Neg and Neutral Words");
	}
	
	public static int[] getNumberOfCategories(String message) {
		int[] numberOfCategory = new int[3];
		numberOfCategory[0] = 0;
		numberOfCategory[1] = 0;
		numberOfCategory[2] = 0;

		String[] words = message.split(" ");

		for (String word : words) {
			if (positiveArray.get(word) != null) {
				numberOfCategory[0]++;
			} else if (negativeArray.get(word) != null) {
				numberOfCategory[1]++;
			} else if (neutralArray.get(word) != null) {
				numberOfCategory[2]++;
			}
		}

		return numberOfCategory;
	}

	public static String removeURLFromString(String string) {
        string = string.replaceAll("https?://\\S+\\s?", ""); //Removes URL that begin with http
        string = string.replaceAll("www.\\S+\\s?", ""); //Removes URL that being with www
		return string;
	}
	
	public static String removeNonAlphabetFromString(String string) {
		string = string.replaceAll("[^A-Za-z ]", "");
		return string;
	}
	
	public static String removeApostropheFromString(String string) {
		string = string.replaceAll("'", "");
		return string;
	}
}
