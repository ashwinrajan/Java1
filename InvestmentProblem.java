import java.util.Scanner;

class InvestmentProblem 
{
	public static void main(String[] args) 
	{
		double amount;
		double interestRate;
		double investment=0;
		
		Scanner in;
		in= new Scanner(System.in);

		System.out.print("Enter the investment amount: ");
		amount= in.nextDouble();

		System.out.print("Enter the interest rate: ");
		interestRate= in.nextDouble();

		for(int i=1;i<=5;i++)
		{
			investment=(amount*(interestRate/100))+amount;
			amount=investment;
			System.out.println("After year "+i+": "+investment);


		}

		
	}
}
