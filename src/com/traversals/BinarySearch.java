package com.traversals;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int [] arr= {1, 2, 4, 5, 7, 9, 13, 17, 20};
		int k= 13;
		
		Arrays.sort(arr);
		
		int low= 0, 
				position= 0,
				high= arr.length- 1;
		
		while(high>= low) {
			
			int mid= (low+ high)/2;
			
			if(arr[mid]== k) {
				position= mid;
				break;
			}else if(arr[mid]< k) {
				low= mid+1;
			}else if(arr[mid]> k) {
				high= mid- 1;
			}
		}
		
		System.out.println(position);
	}

}
