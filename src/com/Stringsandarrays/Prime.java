package com.Stringsandarrays;

import java.util.Scanner;

public class Prime {

	public static void main(String []args) {
		
		int k;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the desired length of series: ");
		k= sc.nextInt();
		
		sc.close();
		
		for(int i= 2; i<k; i++) {
			int temp= 0;
			
			for(int j= 2; j<=i/2; j++) {
				
				if(i%j== 0 && i!= 2) {
					temp++; 
				}
			}
			if(temp == 0) {
				System.out.println(i);
			}
		}
	}
}
