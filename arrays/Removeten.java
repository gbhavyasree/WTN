package com.wipro.arrays;

public class Removeten {
		public static void main(String args[])
		{
			int []result= new int[args.length];
			int c=0,num;
			for(int i=0;i<args.length;i++){
			    num=Integer.parseInt(args[i]);
			    if(num!=10){
			        result[c]=num;
			        c++;
			    }
			}
			for(int i=c;i<args.length;i++){
			    result[i]=0;
			}
			for(int i=0;i<args.length;i++){
			System.out.print(result[i]+" ");
			}
		}

	}
