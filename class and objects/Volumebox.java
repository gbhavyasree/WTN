package com.wipro.inheritance;
class Box{
	double width,height,depth,volume;
	Box(double x,double y,double z)
	{
		System.out.println("it is a constructor");
		width=x;
		height=y;
		depth=z;
		
	}
	double vol(){
		volume=width*height*depth;
		return volume;
	}
}
public class Volumebox {
	public static void main(String []args)
	{
		double v;
		Box a=new Box(66.6,88.0,46.8);
		v=a.vol();
		System.out.println("volume is :"+v);
	}

}
