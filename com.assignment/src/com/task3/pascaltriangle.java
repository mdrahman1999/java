package com.task3;

import java.util.Scanner;

public class pascaltriangle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = scan.nextInt();
		//Rows
		for(int i=0;i<n;i++)
		{
			//Spaces
			for(int j=1;j<n-i;j++)
			{
				System.out.print("  ");
			
			}
			//numbers
			int number =1;
			for(int k=0;k<=i;k++)
			{
				System.out.print(number+"  ");
				number=number*(i-k)/(k+1);
			}
		
			System.out.println();
		}
			
			scan.close();

	}

}
