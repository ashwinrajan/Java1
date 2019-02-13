import java.util.Scanner;

class NumberSum 
{
	public static void main(String[] args) 
	{
		Scanner in;
		in = new Scanner(System.in);

		int num=1;
		int sum=0;

		while (num>0)
		{
			System.out.println("please enter a number");
			num= in.nextInt();
			
			if(num>0)
			{
				sum=sum+num;
			}
			

		}

	

		System.out.println("sum is " +sum);



	}
}
