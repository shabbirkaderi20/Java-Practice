package com.Stringsandarrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DuplicatesArray {
	
	public static void main(String []args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the desired length of array: ");
		int k= sc.nextInt();
		
		int arr[]= new int[k];
		int newArr[]= new int[k];
		
		for(int i=0; i<k; i++) {
			
			System.out.println("Enter element at "+ i+1+ ": ");
			arr[i]= sc.nextInt();
		}
		
		sc.close();
		// Traditional approach
//		for(int i= 0; i< arr.length; i++) {
//			
//			for(int j= i+1; j< arr.length; j++) {
//				
//				if(arr[i]== arr[j]) {
//					
//					arr[j]= 0;
//				}
//			}
//		}
//		
//		for(int i=0; i<k; i++) {
//			
//			if(arr[i]!= 0) {
//				
//				newArr[i]= arr[i];
//				System.out.println(newArr[i]);
//			}
//		}
		
		// Array list
		List<Integer> primes= new ArrayList<>();
		
		for(int i=0; i<k; i++) {
			
			primes.add(arr[i]);
		}

		Set<Integer> primeWithDuplicates= new LinkedHashSet<>(primes);
		primes.clear();
		
		primes.addAll(primeWithDuplicates);
		
		System.out.println("list of primes without duplicates : " + primes);
		
	}

}
