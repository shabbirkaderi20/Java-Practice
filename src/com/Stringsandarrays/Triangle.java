package com.Stringsandarrays;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the desired integer: ");
		int k= sc.nextInt();
		
		sc.close();
		
		for(int i= 0; i< k; i++) {
			
			for(int j= k-1; j> i; j--) {
				
				System.out.print(" ");
			}
			System.out.print("*");
			for(int j= 0; j< i; j++) {
				
				for(int m= 0; m<= j; m++) {
					System.out.print(" ");

				}
			}
			if(i> 0) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
