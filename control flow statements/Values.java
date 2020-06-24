package com.wipro.language;

public class Values {
	public static void main(String args[])
	{
	if(args.length==0)
	{
		System.out.println("no values");
	}
	else
	{
		int i=0;
		System.out.print(args[0]);
		for(i=1;i<args.length;i++)
		{
			System.out.print(","+args[i]);
		}

	}
	}
}
//print the string with seperation with comma ,if it is empty print as "no values" 