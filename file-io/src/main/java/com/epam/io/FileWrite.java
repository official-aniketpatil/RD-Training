package com.epam.io;

import java.io.BufferedWriter;
import java.io.IOException;

class FileWriteHelper {
	
	private FileWriteHelper() {
		
	}
	
	public static void runApplication() {
		Input input = new Input();
		String filePath = "src/main/resources/" + input.getFileName();
		FileWrite fileWrite = new FileWrite(input, filePath);
		fileWrite.writeFile();
	}
}
public class FileWrite {
    private Input input;
    private String filePath;
	
    public FileWrite(Input input, String filePath) {
    	this.input = input;
    	this.filePath = filePath;
    }
	public void writeFile() {
		
		System.out.println("Enter data into file. Enter \"exit\" after completion");
		String line = "";
		
		try (BufferedWriter bw = input.getBufferedWriter(filePath);) {
			
			while(!(line = input.getString().trim()).equalsIgnoreCase("exit")) {
				bw.write(line);
		        bw.newLine();
			}
			
			bw.flush();
			System.out.println("File Wrote!");
			
		 } catch (IOException e) {
			 
			System.out.println(e.getMessage());
			
		 } 
	}
	public static void main(String[] args) {
		
		FileWriteHelper.runApplication();
	}

}
