package com.wipro.language;

public class Gender {
	public static void main(String args[])
	{
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		if(gender.contentEquals("female"))
		{
			if(age>0 && age<59)
		{
			System.out.println("the percentage of integer is 8.2%");
		}
			else
			{
				System.out.println("the percentage of integer is 9.2%");
			}
		}
		if(gender.contentEquals("male"))
		{
			if(age>0 && age<59)
		{
			System.out.println("the percentage of integer is 8.4%");
		}
			else
			{
				System.out.println("the percentage of integer is 10.5%");
			}
		}
	}

}
