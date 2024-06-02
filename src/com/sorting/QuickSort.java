package com.sorting;

import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr= {1, 8, 3, 4, 7, 9, 2, 5, 6};
		
		printArray(arr);
		quicksort(arr, 0, arr.length- 1);
		printArray(arr);
	}
	
	private static void printArray(int[] arr) {
		
		String strArr="";
		
		for(int i= 0; i< arr.length; i++) {
			strArr= strArr+ arr[i]+ " ";
		}
		System.out.println(strArr.trim());
	}

	public static void quicksort(int[] arr, int low, int high) {
		
		if(low>= high) {
			return;
		}
		
		int pivotIndex= new Random().nextInt(high- low)+ low;
		int pivot= arr[pivotIndex];
		swap(arr, pivotIndex, high);
		int leftPtr = partition(arr, low, high, pivot);
		
		quicksort(arr, low, leftPtr- 1);
		quicksort(arr, leftPtr+ 1, high);
	}

	private static int partition(int[] arr, int low, int high, int pivot) {
		int leftPtr= low;
		int rightPtr= high;
		
		while(leftPtr< rightPtr) {
			
			while(arr[leftPtr]<= pivot && leftPtr< rightPtr) {
				leftPtr++;
			}
			while(arr[rightPtr]>= pivot && leftPtr< rightPtr) {
				rightPtr--;
			}
			
			swap(arr, leftPtr, rightPtr);
		}
		swap(arr, leftPtr, high);
		return leftPtr;
	}
	
	private static void swap(int[] arr, int index1, int index2) {
		int temp= arr[index1];
		arr[index1]= arr[index2];
		arr[index2]= temp;
	}

}
