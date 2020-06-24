package com.wipro.language;
import java.util.*;

public class Smalltocap {
	public static void main(String args[])
	{
		char a=args[0].charAt(0);
		if(a>='a' &&a<='z')
		{
			System.out.println((char)(a-32));
		}
		else if(a>='A' && a<='Z')
		{
			System.out.println((char)(a+32));
		}
	}

}
//take char as input and print capital letter if given i/p is small and viceversa