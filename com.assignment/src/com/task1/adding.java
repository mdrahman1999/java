package com.task1;

import java.util.Scanner;

public class adding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scan = new Scanner (System.in);{
		
		System.out.println("enter any two numbers between1-10");
		int x = Scan.nextInt();
		int y = Scan.nextInt();
		if (x>10 || y>10)
		{
		
		System.out.println("enter the value between 1-10");
		
	}

		else  {
	    int z = x+y;
		
		System.out.println("the value of z = " + z);
		z = z+30;
		System.out.println(" after adding 30, the value of z is "+z);
	}
	Scan.close();
		}
		
		
		
	}
}
