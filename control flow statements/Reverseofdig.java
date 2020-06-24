package com.wipro.language;

public class Reverseofdig {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int sum=0;
		while(n!=0)
		{
			sum=sum*10;
			sum=sum+n%10;
			n/=10;
		}
			System.out.println(sum);
	}
}
//how to reverse a number