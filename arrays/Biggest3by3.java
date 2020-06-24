package com.wipro.arrays;
import java.util.*;

public class Biggest3by3 {
	public static void main(String args[])
	{
		int[][] a=new int[3][3];
		int i,j,c=0,max=0;
		if(args.length<9)
		{
			System.out.println("please enter 9 elements");
			System.exit(0);
		}
		for(i=0;i<3;i++)
		{
		    for(j=0;j<3;j++)
		    {
		        a[i][j]=Integer.parseInt(args[c]);
		        if(max<a[i][j])
		            max=a[i][j];
		        c++;
		        System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
		System.out.println("Max : "+max);
	}

}
