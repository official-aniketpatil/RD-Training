package com.epam.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.epam.io.model.Employee;

public class Serialization {
 
	public static void serializeObject(String filePath) {
		FileOutputStream fout = null;
		ObjectOutputStream out = null;
		try {
			fout = new FileOutputStream(filePath);
			out = new ObjectOutputStream(fout);
			Employee emp = new Employee(1, "aniket", 10000);
			out.writeObject(emp);
			System.out.println("serialization successful");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				fout.close();
				out.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		 }
	}
	public static void main(String[] args) {
		String filePath = "src/main/resources/serializedObject.txt";
		serializeObject(filePath);
	}

}
