package com.Stringsandarrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String line= sc.nextLine();
		
		sc.close();
		
		List<String> words= Arrays.asList(line.split("\\s"));
		Collections.reverse(words);
		
		StringBuilder sb= new StringBuilder(line.length());
		
		for(int i= 0; i< words.size(); i++) {
			
			for(int j= words.get(i).length()- 1; j>= 0; j--) {
				
				sb.append(words.get(i).charAt(j));
			}
			sb.append(" ");
		}
		
		System.out.println(sb.toString().trim());
	}

}
