package com.wipro.language;

public class Primeornot {
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int i,flag=0;
		if(a==0 || a==1)
		{
			System.out.println(a+" it is not a prime number");
		}
		else
		{
			for(i=2;i<=a/2;i++)
			{
				if(a%i==0)
				{
					System.out.println(a+" not a prime number");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(a+" prime number");
			}
		}
	}
	//prime r not

}
