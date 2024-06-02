package com.javaconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparable {

	public static void main(String[] args) {
		
		List<Student> stuList= new ArrayList<>();
		
		stuList.add(new Student(17, "Raju", 34.7));
		stuList.add(new Student(18, "Sham", 45.3));
		stuList.add(new Student(17, "BabuRao", 20.9));
		stuList.add(new Student(17, "Om", 55.7));
		stuList.add(new Student(17, "KachraSeth", 2.5));
		
		System.out.println(stuList);
		
		Collections.sort(stuList);
		
		System.out.println(stuList);
	}

}

class Student implements Comparable<Student>{
	
	private int age;
	private String name;
	private Double marks;

	public Student(int age, String name, Double marks) {
		super();
		this.age = age;
		this.name = name;
		this.marks = marks;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public Double getMarks() {
		return marks;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		if(marks> o.getMarks()) 
			return 1;
		else if(marks< o.getMarks()) 
			return -1;
		else 
			return 0;
	}
	
	
} 
