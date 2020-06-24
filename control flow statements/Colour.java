package com.wipro.language;

public class Colour {
	public static void main(String args[])
	{
		char colour=args[0].charAt(0);
		switch(colour)
		{
		case 'R':
			System.out.println("R -> RED");
			break;
		case 'B':
			System.out.println("B -> BLUE");
			break;
		case 'G':
			System.out.println("G -> GREEN");
			break;
		case 'O':
			System.out.println("O -> ORANGE");
			break;
		case 'Y':
			System.out.println("Y -> YELLOW");
			break;
		case 'W':
			System.out.println("W -> WHITE");
			break;
		default:
			System.out.println("Invalid code");
		}
		
		
	}
}
//giving char as input and print the colour according to it using swtich case