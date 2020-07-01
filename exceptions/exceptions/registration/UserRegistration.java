package com.wipro.exceptions;

class Registration
{
	void registerUser(String username,String userCountry)throws InvalidCountryException
	{
		if (!userCountry.equals("India"))
		{
			throw new InvalidCountryException();
		}
		else
		{
			System.out.println("User registration done successfully");
		}
	}
}

public class UserRegistration
{
	public static void main(String[] args)
	{
		Registration r1=new Registration();
		try 
		{
			r1.registerUser("tinku", "US");
		} 
		catch (InvalidCountryException e) 
		{
			System.out.println(e.getMessage());
		}
		
}
}
