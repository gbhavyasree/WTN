package com.wipro.language;

public class Palindrome {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int sum=0,temp;
		temp=n;
		while(n!=0)
		{
			sum=sum*10;
			sum=sum+n%10;
			n/=10;
		}
		if(sum==temp) {
			System.out.println("it is a palindreome number");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
//chech whether number is palindrome or not