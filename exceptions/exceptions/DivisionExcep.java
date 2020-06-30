package com.wipro.exceptions;

import java.util.Scanner;

public class DivisionExcep {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double c;
		try
		{
			c=division(a,b);
			System.out.println("division is : "+c);
		}
		catch(Exception e)
		{
			System.out.println("Arithmetic exception");
		}
	}
		static double division(int a,int b) throws Exception
		{
			return a/b;
		}

}
