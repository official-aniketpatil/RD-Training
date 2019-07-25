package com.epam.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

class StringFinderHelper {
	public static void runApplication(String[] args) {
		Validator.validateArguments(args);
		Path filePath = Paths.get(args[0].trim());
		String keyword = args[1].trim();
		StringFinder stringFinder = new StringFinder(filePath, keyword);
		stringFinder.matchKeywordAndPrintLine();
	}
}
public class StringFinder {
    private Path filePath;
    private String keyword;
	
    StringFinder(Path filePath, String keyword){
    	this.filePath = filePath;
    	this.keyword = keyword;
    }
	public String matchKeywordAndPrintLine() {
		BufferedReader bufferedReader = null;
		Input input = new Input();
		String line = null;
		try {
			bufferedReader = input.getBufferedReader(filePath);
			while((line = bufferedReader.readLine()) != null) {
				if(line.contains(keyword)) {
					System.out.println(line);
				}
			}
			
		} catch (IOException e) {
          System.out.println(e.getMessage());  
		} 
		return line;
	}
	public static void main(String[] args) {
		StringFinderHelper.runApplication(args);
	}

}
