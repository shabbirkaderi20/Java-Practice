package com.Stringsandarrays;

import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the desired String: ");
		String str1= sc.nextLine();
		
		System.out.print("Enter the desired String: ");
		String str2= sc.nextLine();
		
		sc.close();
		
		int flag= 0;
		int count= str2.length()-1;
		
		if(str1.length()== str2.length()) {
			for(int i= 0; i< str1.length()/ 2; i++) {
				while(count> (str2.length()/ 2)) {
					if(str2.charAt(count)== str1.charAt(i)) {
						break;
					}else {
						flag++;
						break;
					}
				}
				count--;
			}
			if(flag== 0) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not a Anagram");
			}
		}else {
			System.out.println("Not a Anagram");
		}
	}

}
