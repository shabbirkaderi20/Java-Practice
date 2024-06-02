package com.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 1, 8, 3, 4, 7, 9, 2, 5, 6 };

		printArray(arr);
		bubblesort(arr);
		printArray(arr);

	}

	private static void bubblesort(int[] arr) {
		
		boolean swapped= true;
		
		while(swapped) {
			
			swapped= false;
			for(int i= 0; i<arr.length- 1; i++) {
				
				if(arr[i]> arr[i+ 1]) {
					swapped= true;
					int temp= arr[i];
					arr[i]= arr[i+ 1];
					arr[i+ 1]= temp;
				}
			}
		}
		
	}

	private static void printArray(int[] arr) {

		String strArr = "";

		for (int i = 0; i < arr.length; i++) {
			strArr = strArr + arr[i] + " ";
		}
		System.out.println(strArr.trim());
	}

}
