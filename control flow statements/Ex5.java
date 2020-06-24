package com.wipro.language;

public class Ex5 {
	public static void main(String args[])
	{
		char value=args[0].charAt(0);
		if((value>=48 && value<=57)||(value==45))
		{
			System.out.println("digit");
		}
		else if((value>='a' && value<='z')||(value>='A' && value<='Z'))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("special character");
		}
	}

}
//to print whether digit or alphabet or special character
