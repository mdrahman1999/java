package com.task2;

import java.util.Scanner;

public class floatingpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner Scan = new Scanner (System.in);
	System.out.println("enter a value");
	{
	float a = Scan.nextFloat();
	if (a ==0)
	{
		System.out.println("zero");
	}
	else if ( a>0)
	{
		System.out.println("positive");
	}
	
	else 
	{
		System.out.println("negative");
	}
	System.out.println("absolute value of the entered number is: \n" +Math.abs(a));
	if (Math.abs(a)<1)
	{
		System.out.println("small");
	}
	else if (Math.abs(a)>1000000 )
	{
		System.out.println("large");
	}
	}
	Scan.close();
	}

}
