import java.util.Scanner;

class SquareofAsterisks 
{
	public static void main(String[] args) 
	{
		
		int i;
		int j;
		int num;
		

		System.out.println("Enter a number");
		Scanner in;
		in = new Scanner(System.in);
		num= in.nextInt();

		for(i=0;i<num;i++)
		{
			for(j=1;j<num;j++)
			{
				System.out.print("*");
			
			}

			System.out.println("*");

		}
		
	}
}
