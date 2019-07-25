package com.epam.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.epam.io.exception.LineCountOutOfBoundException;

class FileFirstNLinePrintHelper {
	public static void runApplication(String[] args) {
		int lineCountToPrint = 5;
		String filePath = args[0].trim();
		if(args.length == 2) {
			lineCountToPrint = Integer.parseInt(args[1]);
		}
		Path path = Paths.get(filePath);
		FileFirstNLinePrint fileLinePrint = new FileFirstNLinePrint(path, lineCountToPrint);
		fileLinePrint.printFirstNLines();
	}
}
public class FileFirstNLinePrint {
    private Path filePath;
	private int lineCountToPrint;
	
	public FileFirstNLinePrint(Path filePath,int lineCountToPrint) {
		this.filePath = filePath;
		this.lineCountToPrint = lineCountToPrint;
	}
    public void printFirstNLines(){
		Input input = new Input();
		BufferedReader br = input.getBufferedReader(filePath);
		String line="";
		try {
			while(lineCountToPrint != 0) {
				if((line =br.readLine()) == null) {
					throw new LineCountOutOfBoundException("number of lines to print exceeds max lines");
				}
				System.out.println(line);
				lineCountToPrint--;
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
		FileFirstNLinePrintHelper.runApplication(args);
	}

}
