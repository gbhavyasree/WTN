package com.wipro.arrays;
import java.util.*;

public class Reverse2by2 {
	public static void main(String args[])
	{
		int[][] a=new int[2][2];
		int[][] rev=new int[2][2];
		int i,j,c=0,k,l;
		if(args.length<4)
		{
			System.out.println("please enter 4 elements");
			System.exit(0);
		}
		for(i=0;i<2;i++)
		{
		    for(j=0;j<2;j++)
		    {
		        a[i][j]=Integer.parseInt(args[c]);
		        c++;
		    }
		}
		for(i=1,k=0;i>=0;i--,k++)
		{
		    for(j=1,l=0;j>=0;j--,l++)
		    {
		        rev[k][l]=a[i][j];
		    }
		}
		for(i=0;i<2;i++)
		{
		    for(j=0;j<2;j++)
		    {
		        System.out.print(rev[i][j]+" ");
		    }
		    System.out.println();
		}
	}

}
