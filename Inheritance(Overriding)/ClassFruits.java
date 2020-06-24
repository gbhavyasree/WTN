package com.wipro.inheritance;
class Fruit
{
	String name;
	String taste;
	String size;
	Fruit(String nam,String tas,String siz)
	{
		name=nam;
		taste=tas;
		size=siz;
	}
	void eat()
	{
		System.out.println("fruit name is : ,"+name+"fruit taste is : ,"+taste);
	}
}
class Apple extends Fruit
{
	Apple(String nam,String tas,String siz)
	{
		super(nam,tas,siz);
		System.out.println("name of fruit is :"+nam+",taste of fruit is :"+tas+",size of fruit is :"+siz);
	}
	@Override
	void eat()
	{
		System.out.println("fruit name is : "+name+",fruit taste is : "+taste);
	}
}
class Orange extends Fruit
{
	Orange(String nam,String tas,String siz)
	{
		super(nam,tas,siz);
		System.out.println("name of fruit is :"+nam+",taste of fruit is :"+tas+",size of fruit is :"+siz);
	}
	@Override
	void eat()
	{
		System.out.println("fruit name is : "+name+",fruit taste is : "+taste);
	}
}
public class ClassFruits {
	public static void main(String []args)
	{
		Apple a=new Apple("apple","sweet","oval shape");
		a.eat();
		Orange b=new Orange("orange","sour","round shape");
		b.eat();
	}

}
