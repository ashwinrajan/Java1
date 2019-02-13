import java.util.Scanner;

class MintoSec 
{
	public static void main(String[] args) 
	{
		int min;
		int sec;
		System.out.println("Enter the Munites");
		Scanner in;
		in=new Scanner(System.in);
		min=in.nextInt();


		sec = min * 60;

		System.out.println(min+"minutes = "+sec+" secends");



	}
}
