package com.Stringsandarrays;

import java.util.Calendar;
import java.util.Scanner;

public class LeapYear {
	public static void main(String []args) {
		
		Scanner sc= new Scanner(System.in);
		int year= sc.nextInt();
		sc.close();
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year); 
		int noOfDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);

		if (noOfDays > 365) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}
