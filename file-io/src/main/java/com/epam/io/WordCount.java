package com.epam.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

class WordCountHelper {
	public static void runApplication(String[] args) {
		Validator.validateArguments(args);
		String word = args[1].trim();
		Path filePath =  Paths.get(args[0].trim());
		WordCount wordCount = new WordCount(filePath, word);
		int count = wordCount.getWordCount();
		System.out.println("count of \""+word+"\" in file \""+ filePath.getFileName()+"\" is "+count);
	}
}
public class WordCount {
	private Path filePath;
	private String word;
	private BufferedReader br;
	
	public WordCount(Path filePath, String word) {
		this.filePath = filePath;
		this.word = word;
	}
	public int getWordCount(){
		int count = 0;
		try {
			Input input = new Input();
		    br = input.getBufferedReader(filePath);
			String line;
			while((line = br.readLine()) != null) {
				if(line.contains(word)) {
					count++;
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
		
		return count;
	}
	public static void main(String[] args) {
		WordCountHelper.runApplication(args);
	}

}
