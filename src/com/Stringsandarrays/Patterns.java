package com.Stringsandarrays;

import java.util.Scanner;

public class Patterns {
	
	public static void main(String []args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the desired integer: ");
		int k= sc.nextInt();
		
		sc.close();
		
		for(int i=0; i< k; i++) {
			
			for(int j= k; j>= i; j--) {
				
				System.out.print(" ");
			}
			
			for(int j=1; j<= i; j++) {
				
				System.out.print("* ");

			}
			System.out.println();
		}
		
		int i = k-1, j;
		 
        while (i > 0) {
            j = -2;
 
            while (j++ < k-1 - i) {

                System.out.print(" ");
            }
 
            j = 0;

            while (j++ < (i) - 1) {
                // Print star
                System.out.print(" *");
            }
            if(i!= 1) {
            	System.out.println();
            }
            i--;
        }
        for(int m= 0; m< 2* k- 1; m++) {
        	
        	if(m!= 0) {
        		System.out.print("    ");
        	}
			for(int n= 0; n< m; n++) {
				
				for(int o= 0; o<= n; o++) {
					System.out.print(" ");
	
				}
			}
				System.out.println("*");
		}
    }
}
