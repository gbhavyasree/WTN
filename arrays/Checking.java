package com.wipro.arrays;

public class Checking {
	public static void main(String args[])
	{
		int[] a=new int[args.length-1];
		int b=Integer.parseInt(args[args.length-1]);
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
			int j=-1;
			for(int i=0;i<a.length;i++)
			{
				if(b==a[i])
				{
					j=i;
					
				}
			}
			System.out.println(j);
	}

}
