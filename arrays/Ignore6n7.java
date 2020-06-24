package com.wipro.arrays;

public class Ignore6n7 {
	public static void main(String args[])
	{
		int[] a=new int[args.length];
		int i,i6=-1,i7=-1,sum=0;
		for(i=0;i<args.length;i++)
		{
		    a[i]=Integer.parseInt(args[i]);
		    if(a[i]==6)
		        i6=i;
		    if(a[i]==7)
		        i7=i;
		}
		if(i7-i6>0 && i7!=-1 && i6!=-1){
		    for(i=0;i<i6;i++){
		        sum+=a[i];
		    }
		    for(i=i7+1;i<args.length;i++){
		        sum+=a[i];
		    }
		}
		else{
		    for(i=0;i<args.length;i++){
		        sum+=a[i];
		    }
		}
		
		System.out.println("sum : "+sum);
	}


}
