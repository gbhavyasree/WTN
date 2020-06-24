package com.wipro.arrays;

public class Middlenum {
	public static void main(String args[])
	{
		int[] a=new int[3];
		int[] b=new int[3];
		int i,c=0;
		for(i=0;i<3;i++)
		{
		    a[i]=Integer.parseInt(args[c]);
		    b[i]=Integer.parseInt(args[c+3]);
		    c++;
		}
		int[] res=new int[2];
		res[0]=a[a.length/2];
		res[1]=b[b.length/2];
		
		for(i=0;i<2;i++)
		{
		    System.out.print(res[i]+" ");
		}
	}

}
