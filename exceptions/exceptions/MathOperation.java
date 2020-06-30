package com.wipro.exceptions;
import java.util.*;
public class MathOperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size of array : ");
		int ele=sc.nextInt();
		System.out.println("elements in the array : ");
		int []a=new int[ele];
		int sum=0,avg;
		try {
		for(int i=0;i<ele;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		avg=sum/ele;
		System.out.println("sum is : "+sum);
		System.out.println("avg : "+avg);
		}
		catch(Exception e)
		{
			System.out.println("exxceptions");
		}
	}

}
