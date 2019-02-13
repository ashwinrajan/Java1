import java.util.Scanner;
class IfExam2 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner input=new Scanner(System.in);
		System.out.println("Entter a number");
		a=input.nextInt();
		System.out.println("Entter a number");
		b=input.nextInt();
		System.out.println("Entter a number");
		c=input.nextInt();

		if(a>0 && b>0 && c>0)
		{
			System.out.println("valid input");
			if(a<b && b<c)
			{
				System.out.println(a + "is smallest");
			}
			else if(b<a && b <c)
			{
					System.out.println(b + "is smallest");
			}
			else
			{
				System.out.print(c + " is smallest");
			}

		}
		else
		{
			System.out.println("invalid input");
		}
		/*if(a==0 || b==0 || c==0)
		{	
			System.out.println("Invalid input");
		}
		else
		{

			System.out.println("Valid input,lets start comparing");
		}*/
	}
}
