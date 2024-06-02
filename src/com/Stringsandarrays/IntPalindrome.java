package com.Stringsandarrays;

import java.util.Scanner;

// for all No.
public class IntPalindrome {
	
	public static void main(String []args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the desired integer: ");
		int k= sc.nextInt();
		
		sc.close();
		
		int duplicate= k,
		sum= 0,
		temp= 0;
		
		while(duplicate!= 0) {
			
			temp= duplicate%10;
			sum= (sum*10)+ temp;
			duplicate= duplicate/10;
		}
			
		if(sum!= k) {
			System.out.println(k+ " is not a palindrome");
		}else {
			System.out.println(k+ " is a palindrome");
		}
		
	}

}

// For only 4 digits
//public class IntPalindrome {
//	
//	public static void main(String []args) {
//		
//		Scanner sc= new Scanner(System.in);
//		
//		System.out.print("Enter the desired integer: ");
//		int k= sc.nextInt();
//		
//		sc.close();
//		
//		int duplicate= k,
//		ptr= 0,
//		ptr1= 0,
//		revPtr= 0,
//		revPtr1= 0,
//		count= 0;
//			
//			ptr= duplicate/1000;
//			revPtr= duplicate%10;
//			
//			if(!(ptr== revPtr)) {
//				count++;
//			}
//			ptr1= ptr- (duplicate/100);
//			revPtr1= revPtr- (duplicate%100);
//			
//			if(!(ptr1== revPtr1)) {
//				count++;
//			}
//			
//		if(count!= 0) {
//			System.out.println(k+ " is not a palindrome");
//		}else {
//			System.out.println(k+ " is a palindrome");
//		}
//		
//	}
//
//}