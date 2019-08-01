package com.epam.serialization_deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.epam.serialization_deserialization.model.Employee;

public class Deserialization {

	public static Employee deserialize(String filePath) {
		Employee emp = null;

		try (FileInputStream fin = new FileInputStream(filePath); 
			 ObjectInputStream oin = new ObjectInputStream(fin);) {
			emp = (Employee) oin.readObject();
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		return emp;

	}

	public static void main(String[] args) {
		String filePath = "src/main/resources/serializedObject.txt";
		System.out.println(deserialize(filePath));
		System.out.println("Deserialization successful");
	}

}
