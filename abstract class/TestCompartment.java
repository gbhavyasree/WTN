package Abstract_interfaces_exception;
import java.util.Random;
abstract class Compartment
{
	abstract void notice();
}
class Firstclass extends Compartment
{
	@Override
	void notice()
	{
		System.out.println("first class compartment");
	}
}
class Ladies extends Compartment
{
	@Override
	void notice()
	{
		System.out.println("ladies compartment");
	}
}
class General extends Compartment
{
	@Override
	void notice()
	{
		System.out.println("general compartment");
	}
}
class Luggage extends Compartment
{
	@Override
	void notice()
	{
		System.out.println("luggage compartment");
	}
}
public class TestCompartment {
	public static void main(String []args)
	{
		Compartment c[] = new Compartment[10];
		Random rand=new Random();
		for(int i=0;i<10;i++)
		switch(rand.nextInt(4)+1)
		{
		case 1: c[0] = new Firstclass();
		c[0].notice();
		break;
		case 2: c[1] = new Ladies();
		c[1].notice();
		break;
		case 3: c[2] = new General();
		c[2].notice();
		break;
		case 4: c[3] = new Luggage();
		c[3].notice();
		break;
		}
	}
}
