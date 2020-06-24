package com.wipro.arrays;

public class Duplicate {
	public static void main(String args[])
	{
		int[] a=new int[args.length];
		int[] res=new int[args.length];
		int i,c=0,j,flag;
		for(i=0;i<args.length;i++)
		{
		    flag=0;
		    a[i]=Integer.parseInt(args[i]);
		    if(c==0){
		        res[c]=a[i];
		        c++;
		        continue;
		    }
		    for(j=0;j<c;j++){
		        if(res[j]==a[i])
		            flag=1;
		    }
		    if(flag==0){
		        res[c]=a[i];
		        c++;
		    }
		}
		for(i=0;i<c;i++){
		    System.out.print(res[i]+" ");
		}

	}

}
