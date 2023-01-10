package com.task2;

import java.util.Scanner;

public class charinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner ( System.in);
		System.out.println("Enter a value");
		{
			var a = reader.next().trim().toLowerCase().charAt(0);
			if (a =='r')
			{
				System.out.println("found");
			}
			else if(a=='a')		
			{
				System.out.println("found");
			}
			else if (a =='n')
			{
		System.out.println("found");
			}
			else if (a =='d')
			{
		System.out.println("found");
			}
			else if (a =='o')
			{
		System.out.println("found");
			}
			else if (a =='m')
			{
		System.out.println("found");
			}
			else 
			{
				System.out.println("not found");
			}
			reader.close();
	}
	}

}
