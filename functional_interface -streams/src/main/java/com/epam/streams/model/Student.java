package com.epam.streams.model;

public class Student implements Comparable<Student> {
	
	private long id;
	private String name;
	private String skill;
	private int mark;
	
	public Student(long id,String name, String skill, int mark) {
		super();
		this.id = id;
		this.name = name;
		this.skill = skill;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getMark() {
		return mark;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Student)) {
			return false;
		} else if (this.getId() == ((Student) obj).getId()) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", skill=" + skill + ", mark=" + mark + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		return (int) ( o.getMark() - this.getMark());
	}
	
}
