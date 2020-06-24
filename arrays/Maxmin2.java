package com.wipro.arrays;

public class Maxmin2 {
	public static void main(String args[])
	{
		int []a=new int[args.length];
		int max,min,i;
		max=a[0];
		min=Integer.parseInt(args[0]);
		for(i=1;i<a.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			if(max<a[i])
			{
				max=a[i];
			}
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		int max2,min2;
		max2=a[0];
		min2 =Integer.parseInt(args[0]);
		for(i=1;i<a.length;i++)
		{
			if(max2<a[i] && a[i]<max)
			{
				max2=a[i];
			}
			if(min2>a[i] && a[i]>min)
			{
				min2=a[i];
			}
		}
		System.out.println("max2 : "+max2);
		System.out.println("min2 : "+min2);
		
	}
	

}
