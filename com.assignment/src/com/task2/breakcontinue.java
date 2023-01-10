package com.task2;

import java.util.Scanner;

public class breakcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0;i<=2;i++)
		{
			Scanner Scan = new Scanner ( System.in);
			
			System.out.println("Enter any number");
			int a = Scan.nextInt();
			
			if (a>=0)
			{
		
	System.out.println("Good Going");
	continue;
			}
	
	if (a<0 )
	{
	
	System.out.println("it's over");
	break;
	}
	
		}
	}

}
