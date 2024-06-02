package com.Stringsandarrays;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String []args) {
		
		int k;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the desired length of series: ");
		k= sc.nextInt();
		
		sc.close();
		
		int sum= 1;
		
		for(int i= 1; i<= k; i++) {
			
			sum= sum*i;
			System.out.println(sum);
		}
	}

}
