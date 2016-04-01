package extractor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Emoticon {
	private String positive_emoticon_path = "positive_emoticon.txt";
	private String negative_emoticon_path = "negative_emoticon.txt";
	private ArrayList<String> positiveEmoticonList = new ArrayList<String>(); 
	private ArrayList<String> negativeEmoticonList = new ArrayList<String>();
	
	public Emoticon() {
		initalizeEmoticonList();
	}
	
	private void initalizeEmoticonList() {
		try (BufferedReader br = new BufferedReader(new FileReader(positive_emoticon_path)))
		{
			String sCurrentLine;

			try {
				while ((sCurrentLine = br.readLine()) != null) {
					positiveEmoticonList.add(sCurrentLine);
				}
			} finally {
				br.close();
		    }
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		try (BufferedReader br = new BufferedReader(new FileReader(negative_emoticon_path)))
		{
			String sCurrentLine;

			try {
				while ((sCurrentLine = br.readLine()) != null) {
					negativeEmoticonList.add(sCurrentLine);
				}
			} finally {
				br.close();
		    }
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	public ArrayList<String> getPositiveEmoticonList() {
		return positiveEmoticonList;
	}
	
	public ArrayList<String> getNegativeEmoticonList() {
		return negativeEmoticonList;
	}
	
	public int getPositiveEmoticonCount(String string) {
		int count = 0;
		for (int i = 0; i < positiveEmoticonList.size(); i++) {
			count += countOccurrences(string, positiveEmoticonList.get(i));
		}
		return count;
	}
	
	public int getNegativeEmoticonCount(String string) {
		int count = 0;
		for (int i = 0; i < negativeEmoticonList.size(); i++) {
			count += countOccurrences(string, negativeEmoticonList.get(i));
		}
		return count;
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
