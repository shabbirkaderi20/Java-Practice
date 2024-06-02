package com.sorting;

public class InsertionSort {
	public static void main(String[] args) {
		
		int[] arr= {1, 8, 3, 4, 7, 9, 2, 5, 6};
		
		printArray(arr);
		insertionSort(arr);
		printArray(arr);
	}
	
	private static void insertionSort(int[] arr) {
		for(int i= 1; i< arr.length; i++) {
			
			int current= arr[i];
			int j= i- 1;
			
			while(j>= 0 && arr[j]> current) {
				
				arr[j+ 1]= arr[j];
				j--;
			}
			arr[j+ 1]= current;
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
