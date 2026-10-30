package com.designPatterns.creational_dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

class SingletonPractice {
	
	private SingletonPractice() {};
	
	private static volatile SingletonPractice sp;
	
	public static SingletonPractice getInstance() {
		
		synchronized (SingletonDCL.class)
        {
            if (sp==null)
            	sp = new SingletonPractice();
        }
		return sp;
	}
	
}

public class PracticeDp {
	
	public static void main(String[] args) {

		javaprc jp = (a, b)-> {
			if(a> b) {
				return a;
			}
			return b;
		};
		
		javaprc jp1= new javaprc() {
			
			@Override
			public int compareInts(int a, int b) {
				if(a> b) {
					return a;
				}
				return b;
			}
		};
		
		System.out.println(jp.compareInts(7, 5));
		System.out.println(jp1.compareInts(5, 3));
		
List<Integer> list= new ArrayList<>();
		
		list.add(5);
		list.add(2);
		list.add(3);
		list.add(10);
		list.add(7);
		list.add(9);
		list.add(8);
		list.add(0);
		list.add(1);
		list.add(6);
		list.add(4);
		
		Optional<Integer> max= list.stream().max(Integer::compareTo);
		int max1= list.stream().max((a, b)-> a > b? 1: -1).get();
		System.out.println(max.get()+ max1);
		
		Optional<Integer> sum= list.stream().map(a-> a).reduce(Integer::sum);
		int sum1= list.stream().mapToInt(a-> a).sum();
		System.out.println(sum.get()+ sum1);
		
		
		int i3= list.stream().sorted(Collections.reverseOrder()).skip(2).limit(1).collect(Collectors.toList()).get(0);
		
		List<List<Integer>> listOfLists = new ArrayList<>();
		
		 for (int i = 1; i <= 3; i++) {
	            List<Integer> innerList = new ArrayList<>();
	            for (int j = 1; j <= 5; j++) {
	                innerList.add(i * j); // Populate the inner list with values
	            }
	            listOfLists.add(innerList);  // Add the inner list to the main list
	        }
		 
		 List<Integer> l1= listOfLists.stream().flatMap(a-> a.stream()).collect(Collectors.toList());
		 System.out.println(l1);

	}
}

@FunctionalInterface
interface javaprc {
	
	int compareInts(int a, int b);
}
