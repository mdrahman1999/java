package com.task3;

import java.util.Scanner;

public class floatingpoint {

	public static void main(String[] args) {
		
		double a,b;
		System.out.println("Enter a floating number");
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextDouble();
		System.out.println("Enter a floating number");
		Scanner scan1 = new Scanner(System.in);
		
		 b = scan1.nextDouble();
		 a=Math.round(a*100);
		 a=a/100;
		 b=Math.round(b*100);
		 b=b/100;
		 
		if(a==b)
		{
			System.out.println("Both numbers are equal");

	}
		else
		{
			System.out.println("Not equal");
}
scan.close();
scan1.close();

	}

}
