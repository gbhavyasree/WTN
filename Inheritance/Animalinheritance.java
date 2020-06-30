package com.wipro.inheritance;
class Animal{
	Animal()
	{
		System.out.println("animal constructor");
	}
	void eat()
	{
		System.out.println("Animal eating");
	}
	void sleep()
	{
		System.out.println("Animal sleeping");
	}
}
class Bird extends Animal
{
	Bird()
	{
		System.out.println("child class constructor");
	}
	@Override
	void eat()
	{
		super.eat();
		System.out.println("Bird eating");
	}
	@Override
	void sleep()
	{
		super.sleep();
		System.out.println("Bird sleeping");
	}
	void fly()
	{
		System.out.println("birds are flying");
	}
}
public class Animalinheritance {
	public static void main(String []args)
	{
		
		
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}

}
