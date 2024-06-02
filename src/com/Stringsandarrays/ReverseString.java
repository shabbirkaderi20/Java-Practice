package com.Stringsandarrays;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String []args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the desired String: ");
		String str= sc.nextLine();
		
		sc.close();
		
		String rev= "";
		
		for(int i= str.length()-1; i>=0; i--) {
			
			rev= rev+ str.charAt(i);
			
			// Print without storing 
			System.out.print(str.charAt(i));
		}
		
		// Print with storing 
		System.out.println("\n"+ str+ " <<->> "+ rev);
		
		// Using string builder
		StringBuilder strBldr= new StringBuilder(str);	
		System.out.println(strBldr.reverse());
	}

}
