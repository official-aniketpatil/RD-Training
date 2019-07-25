package com.epam.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.epam.io.exception.LineCountOutOfBoundException;

class FileLastNLinePrintHelper {
	public static void runApplication(String[] args) {
		int lineCountToPrint = 5;
		String filePath = args[0].trim();
		if(args.length == 2) {
			lineCountToPrint = Integer.parseInt(args[1]);
		}
		Path path = Paths.get(filePath);
		FileLastNLinePrint fileLastNLinePrint = new FileLastNLinePrint(path, lineCountToPrint);
	    
		try {
		fileLastNLinePrint.printLastNLines();
	    } catch(LineCountOutOfBoundException e) {
	    	System.out.println(e.getMessage());
	    }
	}
}
public class FileLastNLinePrint {
    private Path filePath;
	private int lineCountToPrint;
	
	public FileLastNLinePrint(Path filePath,int lineCountToPrint) {
		this.filePath = filePath;
		this.lineCountToPrint = lineCountToPrint;
	}
	private int getFileLength(BufferedReader br) {
		int length = 0;
		String line = "";
		try {
		while((line = br.readLine()) != null) {
			length++;
		}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return length;
	}
	private int getStartIndex(BufferedReader br) {
		int fileLength = getFileLength(br);
		int startIndex= fileLength - lineCountToPrint + 1;
		if(startIndex <= 0) {
			throw new LineCountOutOfBoundException("number of lines to print exceeds max lines");
		}
		return startIndex;
	}
    public void printLastNLines(){
		Input input = new Input();
		BufferedReader br = input.getBufferedReader(filePath);
		int startIndex = getStartIndex(br);
		int currentLineNumber = 1;
		br = input.getBufferedReader(filePath);
		String line="";
		try {
			while(lineCountToPrint != 0) {
				line = br.readLine();
				if(currentLineNumber >= startIndex) {
				  System.out.println(line);
				  lineCountToPrint--;
				}
				currentLineNumber++;
			}
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
    
	public static void main(String[] args) {
		FileLastNLinePrintHelper.runApplication(args);
	}

}
