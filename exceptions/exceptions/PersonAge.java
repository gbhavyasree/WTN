package com.wipro.exceptions;

import java.util.Scanner;

public class PersonAge {
	public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			String name=sc.nextLine();
			int age=sc.nextInt();
			  try {
				  if(age>=18||age<=60)
					  throw new InvalidAgeException("Invalid Age");
				  System.out.println("Name="+ name+"\n"+"Age="+ age);
				  }
			  catch(InvalidAgeException e)
			  {
			   System.out.println(e);
			  }
			  }
	}
class InvalidAgeException extends Exception
{
	public InvalidAgeException(String age)
	{
		super(age);
		}
}

