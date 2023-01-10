package com.task2;

import java.util.Scanner;

public class operators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = Scan.nextInt();


		if(a%3==0)
			{ 
			System.out.println("Consultadd");
			}
		if (a%5==0)
		{
			System.out.println("JAVA Training");
		}
		if (a%3==0 && a%5==0)
		{
		System.out.println("Consultadd JAVA Training");
		}
		
			Scan.close();
			}
		}
