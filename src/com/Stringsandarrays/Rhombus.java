package com.Stringsandarrays;

import java.util.Scanner;

public class Rhombus {
	
	public static void main(String []args) {
		
Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the desired integer: ");
		int k= sc.nextInt();
		
		sc.close();
		
		for(int i= 0; i<k; i++) {
			
			for(int j= k-1; j>i; j--) {
				
				System.out.print(" ");
			}
			for(int j= 0; j<k; j++) {
				System.out.print("*");
			}
			System.out.println("");	
		}
		
		for(int i= 0; i< k-1; i++) {
			
			for(int j= 0; j<= i; j++) {
				
				System.out.print(" ");
			}
			for(int j= 0; j<k; j++) {
				System.out.print("*");
			}
			System.out.println("");	
			
		}

	}

}
