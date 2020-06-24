package com.wipro.arrays;

public class Sumavg {
	public static void main(String args[])
	{
		int []a=new int[args.length];
		int n,sum=0,avg,i;
		n=a.length;
		for(i=0;i<n;i++) {
			a[i]=Integer.parseInt(args[i]);
			sum=sum+a[i];
		}
		avg=sum/n;
		System.out.println(sum);
		System.out.println(avg);
	}
}
