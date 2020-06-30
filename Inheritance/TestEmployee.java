package com.wipro.inheritance;

	class Person {
		String name;
	Person(String name)
	{
		this.name=name;
	}
	String obj()
	{
		return name;
	}

}
class Employee extends Person {
	double salary;
	int empyr;
	String insno;
	Employee(String name,double salary,int empyr,String insno)
	{
		super(name);
		this.salary=salary;
		this.empyr=empyr;
		this.insno=insno;
	}
	public void disp()
	{
		System.out.println("name of employee : "+name+",salary oh him : "+salary);
		System.out.println("joining year : "+empyr+",insurance no : "+insno);
	}
	

}

public class TestEmployee {
	public static void main(String []args)
	{
		Person a=new Person("chinnu");
		Employee b=new Employee("chinnu",6000.62,2014,"hbdhcbkd");
		b.disp();
		System.out.println(a);
		System.out.println(b);
	}

}
