package com.Stringsandarrays;

import java.util.ArrayList;

public class StringPermutations {

	static ArrayList<String> str = new ArrayList<>();

	public static void main(String[] args) {
		permutation("SIDDHARTH");

		System.out.println(str.size());
		
		  for(String str1: str) { 
			  System.out.println(str1); 
		  } 
	}

	private static void permutation(String input) {
		permutation("", input);

	}

	private static void permutation(String perm, String word) {

		if (word.isEmpty()) {
			str.add(perm + word);
		} else {
			for (int i = 0; i < word.length(); i++) {
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}
	}
}
