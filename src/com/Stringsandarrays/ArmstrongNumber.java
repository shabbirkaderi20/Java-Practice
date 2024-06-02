package com.Stringsandarrays;

import java.util.Scanner;

public class ArmstrongNumber {
	
public static void main(String []args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the desired integer: ");
		int k= sc.nextInt();
		
		sc.close();
		
		int duplicate= k;
		int sum= 0;
		int temp= 0;
		
		while(duplicate != 0) {
			
			temp= duplicate%10;
			sum= (int) (sum+ Math.pow(temp, 3));
			duplicate= duplicate/10;
		}
		
		if(sum== k) {
			System.out.println(k+ " is a Armstrong No.");
		}else {
			System.out.println(k+ " is a not Armstrong No.");
		}
		
	}

}
