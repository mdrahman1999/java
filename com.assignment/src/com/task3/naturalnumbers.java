package com.task3;

import java.util.Scanner;

public class naturalnumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scan.nextInt();
		
		for(int i=1;i<=n;++i)
		{
			int sum=0;
		    sum=sum+i;
			System.out.println(sum);
		}
		 int s=n*(n+1)/2;
		System.out.println("The sum of natural numbers: "+s);
		scan.close();
		
	}

}
