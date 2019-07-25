package com.epam.serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.epam.serialization_deserialization.model.Employee;


public class Deserialization {

	public static Employee deserialize(String filePath) {
		
		FileInputStream fin = null;
        Employee emp = null;
        ObjectInputStream oin = null;
		
        try {
			fin = new FileInputStream(filePath);
			oin = new ObjectInputStream(fin);
			emp = (Employee)oin.readObject();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		} finally {
			try {
				fin.close();
				oin.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		}
        
		return emp;
		
	}
	public static void main(String[] args) {
		String filePath = "src/main/resources/serializedObject.txt";
        System.out.println(deserialize(filePath));
        System.out.println("Deserialization successful");
	}

}
