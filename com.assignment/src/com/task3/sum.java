package com.task3;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int Sum =0;
		System.out.println("Enter 10 numbers");
for(int i=1;i<=10;i++)
		
{
	int a = scan.nextInt();
		
 Sum = Sum+a;
}
 int Average = Sum/10;
 System.out.println("Sum of the numbers: "+Sum);
 System.out.println("Average of the numbers: "+Average);
scan.close();

	}

}
