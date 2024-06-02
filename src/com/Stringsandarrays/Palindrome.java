package com.Stringsandarrays;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String []args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the desired String: ");
		String str= sc.nextLine();
		
		sc.close();
		
		int temp= 0;
		for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {

			if (!(str.charAt(i) == str.charAt(j))) {

				temp++;
			}
		}
		if(temp== 0) {
			System.out.println(str+ " is a palindrome");
		}else {
			System.out.println(str+ " is a not palindrome");
		}
	}

}
