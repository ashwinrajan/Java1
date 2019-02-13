import java.util.Scanner;
class ReverseNum
{
	public static void reverse(int number)
	{
		int firstDigit, secondDigit, thirdDigit, fourthDigit;

		firstDigit=number/1000;
		secondDigit=(number%1000)/100;
		thirdDigit=(number%100)/10;
		fourthDigit=number%10;

		System.out.println(fourthDigit+""+thirdDigit+""+secondDigit+""+firstDigit);
		
		
	}
	public static void main(String[] args) 
	{
		
		int number;

		System.out.println("Enter a 4 digit Num");
		Scanner in;
		in=new Scanner(System.in);
		number= in.nextInt();

		if (number>=1000 && number <10000)
		{
			reverse(number);
		}
		else
		{
			System.out.println("enter a valid number");
		}


	}
}
