package com.wipro.inheritance;
class Shape
{
	void draw()
	{
		System.out.println("drawing shape");
	}
	void erase()
	{
		System.out.println("erasing shape");
	}
}
class Circle extends Shape
{
	Circle()
	{
		System.out.println("it is a circle class constructor ");
	}
	@Override
	void draw()
	{
		System.out.println("drawing circle");
	}
	void erase()
	{
		System.out.println("erasing circle");
	}
}
class Triangle extends Shape
{
	Triangle()
	{
		System.out.println("it is a Triangle class constructor ");
	}
	@Override
	void draw()
	{
		System.out.println("drawing Triangle");
	}
	void erase()
	{
		System.out.println("erasing Triangle");
	}
}
class Square extends Shape
{
	Square()
	{
		System.out.println("it is a Square class constructor ");
	}
	@Override
	void draw()
	{
		System.out.println("drawing Square");
	}
	void erase()
	{
		System.out.println("erasing Square");
	}
}
public class OverrideShape {
	public static void main(String []args)
	{
		Circle a=new Circle();
		Triangle b=new Triangle();
		Square c=new Square();
		a.draw();
		b.draw();
		c.draw();
		a.erase();
		b.erase();
		c.erase();
	}

}
