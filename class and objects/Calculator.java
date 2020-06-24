package com.wipro.inheritance;
class Cal{
static int powerInt(int num1,int num2)
{
	int product=1;
	for(int i=0;i<num2;i++)
		product=product*num1;
	return product;
}
static double powerDouble(double num3,int num4)
{
	return Math.pow(num3, num4);
}
}
public class Calculator {
	public static void main(String []args)
	{
		int v;
		double y;
		Cal a=new Cal();
		Cal b=new Cal();
		v=a.powerInt(6,2);
		y=a.powerDouble(12.2,6);
		System.out.println("output for integer value : "+v);
		System.out.println("output for doubble value : "+y);
		}

}
