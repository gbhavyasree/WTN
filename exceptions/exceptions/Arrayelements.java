package com.wipro.exceptions;
import java.util.*;
public class Arrayelements {
	public static void main(String []args)
	{
		System.out.println("enter the size of array : ");
		Scanner sc=new Scanner(System.in);
		int ele=sc.nextInt();
		try
		{
			int []a=new int[ele];
			System.out.println("enter array elements : ");
			for(int i=0;i<ele;i++)
			a[i]=sc.nextInt();
			System.out.println("index of array elements : ");
			int b=sc.nextInt();
			System.out.println("the values of corresponding index is : "+a[b]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bounds");
		}
		catch(InputMismatchException exp)
		{
			System.out.println("number format exception");
		}
		sc.close();
	}
}
