package com.Stringsandarrays;

import java.util.Scanner;

public class RepeatedCharacters {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String line= sc.nextLine();
		sc.close();
		
		StringBuilder sb= new StringBuilder(line.replace(" ", ""));
		String repeated= "";
		
		for(int i= 0; i< sb.length(); i++) {
			for(int j= i+1; j< sb.length()-1; j++) {
				if(Character.toLowerCase(sb.charAt(i))== 
						Character.toLowerCase(sb.charAt(j)) && 
						!(repeated.contains(String.valueOf(sb.charAt(i))))) {
					repeated= repeated+ sb.charAt(i)+ " ";
					break;
				}
			}
		}
		System.out.println(repeated.trim());
	}
}
