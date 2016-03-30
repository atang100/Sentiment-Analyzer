package extractor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;


public class Extractor {
	
	String input_text_file = "input.txt";
	String output_text_file = "output.txt";
	private Stop_Word stopWord = new Stop_Word();
	
	public static void main(String args[]) {
		
	}
	
	public void retreiveTweet() {
		try (BufferedReader br = new BufferedReader(new FileReader(input_text_file)))
		{
			String sCurrentLine;
			
			try {
				while ((sCurrentLine = br.readLine()) != null) {
					
					String tweet = sCurrentLine
					
					sCurrentLine = removeURLFromString(sCurrentLine);
					
					//Punctuation might be necessary to keep track of emoticons and exclamation marks.
					//sCurrentLine = removeNonAlphabetFromString(sCurrentLine);
					
					sCurrentLine = sCurrentLine.toLowerCase();
					
					String filteredTweet = "";
					String[] wordList = sCurrentLine.split("\\s+");
					
					for (int i = 0; i < wordList.length; i++) {
						if (!stopWord.isStopWord(wordList[i])){
							filteredTweet += wordList[i] + " ";
						}
					}
					filteredTweet = filteredTweet.trim();
				}
			} finally {
				br.close();
		    }
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	/**
	 * Remove URL links from string
	 * 
	 * @param s
	 * @return
	 */
	public String removeURLFromString(String string) {

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
	public String removeNonAlphabetFromString(String string) {
		string = string.replaceAll("[^A-Za-z ]", "");
		return string;
	}

	/**
	 * Adds filtered tweets to document containing filtered tweets.
	 */
}
