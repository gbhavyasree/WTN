package com.wipro.arrays;

public class Asciivalues {
	public static void main(String args[])
	{
		int []a=new int[args.length];
		char ch;
		for(int i=0;i<=a.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			ch=(char)a[i];
			System.out.print(ch+" ");
		}
		
	}

}
