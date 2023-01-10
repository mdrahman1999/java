package com.task1;

import java.io.Closeable;
import java.util.Scanner;

public class swap {

	public static void main (String[]args) {
		
		String a = "md rahman";
		System.out.println("md rahman");
		
		int x ;
		int y ; 
		int z ;
		
		Scanner task = new Scanner(System.in);
		
		System.out.println("enter the value of x");
		x = task.nextInt ();
		
		System.out.println("enter the value of y");
		y = task.nextInt();
		
		z = y;
		y = x;
		x = z; 
		
		System.out.println("after swapping x=" +x +" y = " +y );
		task.close();
	
	}
	
}
