package com.wipro.arrays;

public class Maxmin {
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
	}

}
