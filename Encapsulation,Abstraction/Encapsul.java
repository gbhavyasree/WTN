package com.wipro.inheritance;
class Author
{
	public String name;
	public String email;
	public char gender;
	Author(String name,String email,char gender)
	{
		System.out.println("it is a parent class constructor");
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
}
class Book extends Author{
	private String name;
	private double price;
	private int qtyinstock;
	Book(String name1,double price,int qtyinstock)
	{
		super("bhavya","bhavya@gmail.com",'f');
		this.name=name;
		this.price=price;
		this.qtyinstock=qtyinstock;
	}
	void obj()
	{
		System.out.println("name : "+name+" ,email : "+email+" ,gender : "+gender);
		System.out.println("bookname : "+ name+" ,price : "+price+" ,qtyinstock : "+qtyinstock);
	}
	
}
public class Encapsul {
	public static void main(String args[])
	{
		
		Book b=new Book("tinku",66.6,22);
		b.obj();
	
	}

}
