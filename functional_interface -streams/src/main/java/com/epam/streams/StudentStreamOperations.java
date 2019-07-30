package com.epam.streams;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.epam.streams.model.Student;
import com.epam.streams.model.StudentList;

public class StudentStreamOperations {
	private List<Student> students;
	
	public void getStudentsBySkill(String stream) {
		List<Student> studentsOfSkill = students.stream()
				.filter(student -> student.getSkill().equals(stream))
				.collect(Collectors.toList());
		
		System.out.println(studentsOfSkill);
	}
	
	public void orderStudentsBySkillAndMark() {
		Map<String, List<Student>> ordered = students.stream()
				.sorted()
				.collect(Collectors.groupingBy(Student::getSkill));
		
		System.out.println(ordered);
	}
	
	public void searchStudent(String name) {
		List<Student> foundStudent = students.stream()
				.filter(student -> student.getName().equals(name))
				.collect(Collectors.toList());
		System.out.println(foundStudent);
	}
	
	public void getSumOfMarksOfAllStudents() {
		int sum = students.stream()
				.map(Student::getMark)
				.reduce(0,(s, mark) -> s+mark);
		System.out.println("Sum of marks of all students is: "+ sum);
	}
	
	public void getSumOfMarksOfStudentSkillWise() {
		Map<String,Integer> skillWithMarks = students.stream()
				.collect(Collectors.groupingBy(Student::getSkill, Collectors.summingInt(Student::getMark)));
		System.out.println(skillWithMarks);
	}
	
	public void getTopPerformer() {
		Optional<Integer> maxMarks = students.stream()
				.map(Student::getMark)
				.max((a,b) -> a-b);
		List<Student> topPerformer = students.stream()
				.filter(a -> a.getMark() == maxMarks.get())
				.collect(Collectors.toList());
		
		System.out.println(topPerformer);
				
	}
	
	public void getLowPerformer() {
		Optional<Integer> minMarks = students.stream()
				.map(Student::getMark)
				.min((a,b) -> a-b);
		List<Student> lowPerformer = students.stream()
				.filter(a -> a.getMark() == minMarks.get())
				.collect(Collectors.toList());
		
		System.out.println(lowPerformer);
	}
	
	public void helper() {
		StudentList studentList = new StudentList();
		this.students = studentList.getStudentList();
		System.out.println("below is the details of found student");
		searchStudent("aniket");
		System.out.println("Students in .net skill are");
		getStudentsBySkill(".net");
		System.out.println("students sorted by marks and ordered by skill");
		orderStudentsBySkillAndMark();
		getSumOfMarksOfAllStudents();
		System.out.println("sum of marks by stream is");
		getSumOfMarksOfStudentSkillWise();
		System.out.println("Top Performer are");
		getTopPerformer();
		System.out.println("low performer are");
		getLowPerformer();
	}
	public static void main(String[] args) {
		StudentStreamOperations streamOperations = new StudentStreamOperations();
		streamOperations.helper();
	}

}
