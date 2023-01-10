package com.task1;

import java.util.Scanner;

public class swap2 {

	public static void main (String[]args ) {
		
		Scanner Scan = new Scanner(System.in) ;
	
		
		System.out.println("Enter the value of x:");
		int x = Scan.nextInt ();
		
		System.out.println("Enter the value of y:");
		int y = Scan.nextInt (); 
	
		x= x+y;
		y= x-y;
		x = x-y;
		
		System.out.println("After swapping x=" +x+ " and y=" +y);
		Scan.close();
	}
	
}
