package com.wipro.arrays;

public class Trueif1r4 {
	public static void main(String args[])
	{
		int[] a=new int[args.length];
		int i,flag=0;
		for(i=0;i<args.length;i++)
		{
		    a[i]=Integer.parseInt(args[i]);
		    if(a[i]!=1 && a[i]!=4){
		        flag=1;
		        
		    }
		}
		if(flag==1){
		    System.out.println("False");
		}
		else{
		    System.out.println("True");
		}
	}

}
