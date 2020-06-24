package com.wipro.arrays;

public class Evenfirst {
	public static void main(String args[])
	{
		int[] result= new int[args.length];
		int c=0,num;
		for(int i=0;i<args.length;i++){
		    num=Integer.parseInt(args[i]);
		    if(num%2==0){
		        result[c]=num;
		        c++;
		    }
		}
		for(int i=0;i<args.length;i++){
		    num=Integer.parseInt(args[i]);
		    if(num%2==1){
		        result[c]=num;
			c++;
		    }
		}
		for(int i=0;i<args.length;i++){
		System.out.print(result[i]+" ");
		}
	}

}
