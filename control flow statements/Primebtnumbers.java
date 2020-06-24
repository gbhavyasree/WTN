package com.wipro.language;

public class Primebtnumbers {
	public static void main (String[] args)
	   {		
	       int i =0,num=0;
	       String  primeNumbers = "";
	       for (i = 10; i <= 100; i++)         
	       { 		  	  
	          int count=0; 	  
	          for(num =i;num>=1;num--)
		  {
	             if(i%num==0)
		     {
	 		     count++;
		     }
		  }
		  if (count==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);
	   }
}
//prime numbers b/w 10 to 100
