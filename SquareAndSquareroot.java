import java.util.Scanner;

class SquareAndSquareroot
{
	public static void main(String[] args) 
	{

		double number;
		double squarenum;
		double squarerootnum;

		System.out.println("Enter a Number");
		Scanner input;
		input = new Scanner(System.in);

		number= input.nextDouble();

		squarenum = Math.pow(number,2);
		squarerootnum = Math.sqrt(number);

		System.out.println("Square of "+number+" = "+squarenum+"\n"+
						   "Square root of "+number+" = "+squarerootnum);

	}
}
