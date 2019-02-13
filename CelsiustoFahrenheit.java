import java.util.Scanner;

class CelsiustoFahrenheit 
{
	public static void main(String[] args) 
	{

		int celsius;
		int fahrenheit;
		System.out.println("Enter the Celsius");
		Scanner in;
		in= new Scanner(System.in);
		celsius=in.nextInt();

		fahrenheit= (celsius*9)/5+32;
		System.out.println(celsius+" Celsius= "+fahrenheit+" Fahrenheit");
	}
}
