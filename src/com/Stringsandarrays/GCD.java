package com.Stringsandarrays;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(); 
		int b = scanner.nextInt();
		
		scanner.close();
		
		int i;
        if (a < b)
            i = a;
        else
            i = b;
        
        int gcd=0;
        
        for (i = i; i > 1; i--) {

            if (a % i == 0 && b % i == 0)
                gcd= i;
        }
        
        System.out.println(gcd);
	}

}
