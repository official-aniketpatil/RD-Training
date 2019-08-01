package com.epam.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

class Input {
	private BufferedReader br;
	private BufferedWriter bw;
	private FileReader fileReader;
	private FileWriter fileWriter;
	private Scanner scanner;

	public BufferedReader getBufferedReader(Path filePath) {
		try {
			fileReader = new FileReader(filePath.toFile());
			br = new BufferedReader(fileReader);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return br;
	}

	public String getFileName() {
		scanner = new Scanner(System.in);

		System.out.println("Enter Name of File");
		
		return scanner.next();
	}

	public BufferedWriter getBufferedWriter(String filePath) {

		try {
			fileWriter = new FileWriter(filePath);
			bw = new BufferedWriter(fileWriter);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		return bw;
	}

	public String getString() {
		scanner = new Scanner(System.in);

		return scanner.nextLine();
	}

	public int getInteger() {
		scanner = new Scanner(System.in);

		return scanner.nextInt();
	}
}