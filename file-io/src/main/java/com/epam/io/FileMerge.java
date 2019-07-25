package com.epam.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.epam.io.exception.ArgumentMismatchException;

class FileMergeHelper {
	public static void runApplication(String[] args) {
		Input input = new Input();
		if(args.length != 3) {
			throw new ArgumentMismatchException("There must be exact three parameters");
		}
		System.out.println("|------------------Merging---------------|");
		Path firstFilePath = Paths.get(args[0].trim());
		Path secondFilePath = Paths.get(args[1].trim());
		Path outputFilePath = Paths.get(args[2].trim());
		FileMerge fileMerge = null;
		
		if(outputFilePath.toFile().exists()) {
			System.out.println("Output file already exists. Press 1 if you want to continue merging");
		    int  choice = input.getInteger();
		    if(choice == 1) {
		    	fileMerge = new FileMerge();
		    	fileMerge.merge(firstFilePath, secondFilePath, outputFilePath);
		    } else {
		    	System.out.println("file merging abort.");
		    }
		} else {
				fileMerge = new FileMerge();
				fileMerge.merge(firstFilePath, secondFilePath, outputFilePath);
		}
		
	}
}
public class FileMerge {

	private BufferedWriter bw;
	private BufferedReader br;
	
	private void writeFirstFile() {
		String line = "";
		try {
			while((line = br.readLine()) != null ) {
				bw.write(line);
				bw.newLine();
			}
			bw.flush();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	private void writeSecondFile() {
		String line = "";
		try {
			while((line = br.readLine()) != null ) {
				bw.write(line);
				bw.newLine();
			}
			bw.flush();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public void merge(Path firstFilePath, Path secondFilePath, Path outputFilePath) {
		Input input = new Input();
		br = input.getBufferedReader(firstFilePath);
		bw = input.getBufferedWriter(outputFilePath.toString());
		writeFirstFile();
		br = input.getBufferedReader(secondFilePath);
		writeSecondFile();
		System.out.println("file merging successful");
	}
	public static void main(String[] args) {
		
		FileMergeHelper.runApplication(args);
	}

}
