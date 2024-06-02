package com.javaconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparator {
	public static void main(String[] args) {
		
		Comparator<Employee> com= new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				if(o1.getRating()> o2.getRating()) {
					return 1;
				}else if(o1.getRating()< o2.getRating()) {
					return -1;
				}else {
					return 0;
				}
			}
		};
		
		List<Employee> empList= new ArrayList<>();
		
		empList.add(new Employee(23, "Raju", 4.0));
		empList.add(new Employee(46, "Sham", 4.5));
		empList.add(new Employee(30, "BabuRao", 2.0));
		empList.add(new Employee(27, "Om", 1.0));
		empList.add(new Employee(36, "KachraSeth", 3.0));
		
		System.out.println(empList);
		
		Collections.sort(empList, com);
		System.out.println(empList);
		
		Collections.sort(empList, new NameComparator());
		System.out.println(empList);
	}
}

class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());
	}
	
	
}

class Employee {
	
	private int age;
	private String name;
	private Double rating;
	
	public Employee(int age, String name, Double rating) {
		super();
		this.age = age;
		this.name = name;
		this.rating = rating;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public Double getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", rating=" + rating + "]";
	}
}
