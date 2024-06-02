package com.Stringsandarrays;

import java.util.Scanner;

public class Fibonocci {
	
	public static void main(String []args) {
		
		int k;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the desired length of series: ");
		k= sc.nextInt();
		
		sc.close();
		
		int[] arr= new int[k];
		arr[0]= 0;
		arr[1]= 1;
		
		System.out.println(arr[0]+ "\n"+ arr[1]);
		
		for(int i= 2; i<k; i++) {
			arr[i]= arr[i-1]+ arr[i-2];
			System.out.println(arr[i]);
		}
	}

}
