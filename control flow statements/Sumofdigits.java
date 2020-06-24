package com.wipro.language;

public class Sumofdigits {
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int sum;
		for(sum=0;a!=0;a/=10)
		{
			sum+=a%10;
		}
		System.out.println("sum of digits in a number is "+sum);
		
	}

}
//sum of digits in a number
//while(a!=0)
//{
//	sum=sum+a%10;
//	a=a/10;
//}