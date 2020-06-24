package com.wipro.language;

public class Alporder {
	public static void main(String args[])
	{
		char first=args[0].charAt(0);
		char second=args[1].charAt(0);
		if(first>second) {
		System.out.print(second+","+first);
	}
		else
		{
			System.out.print(first+","+second);
		}
	}

}
//print the characters in alphabetical order