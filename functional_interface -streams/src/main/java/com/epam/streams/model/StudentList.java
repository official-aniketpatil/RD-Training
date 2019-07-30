package com.epam.streams.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {
	private List<Student> students;
	
	public List<Student> getStudentList() {
		students = new ArrayList<Student>();
		
		Student s1 = new Student(1, "aniket","java",80);
		Student s2 = new Student(2, "sahil","javascript",90);
		Student s3 = new Student(3, "nirmal","javascript",80);
		Student s4 = new Student(4, "raghav",".net",90);
		Student s5 = new Student(5, "aditya","java",90);
		Student s6 = new Student(6, "aniket",".net",70);
		
		Collections.addAll(students, s1, s2, s3, s4, s5, s6);
		
		return students;
	}
}
