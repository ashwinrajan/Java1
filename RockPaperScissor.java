import java.util.Scanner;

class RockPaperScissor
{
	public static void main(String[] args) 
	{
		int user;
		int comp;
		
		System.out.println("enter a number");
		Scanner in;
		in = new Scanner(System.in);
		user=in.nextInt();
		
		comp=(int)(Math.random()*3);

		if (user==0 && comp==1)
		{
			System.out.println("the computer is rock,you are scissor,you lose");
		}
		
		else if (user==0&&comp==2)
		{
			System.out.println("the computer is paper,you are scissor,you win");
		}

		else if (user==1&&comp==0)
		{
			System.out.println("the computer is scissor,you are rock,you win");
		}

		else if (user==1&&comp==2)
		{
			System.out.println("the computer is paper,you are rock,you lose");
		}

		else if (user==2&&comp==0)
		{
			System.out.println("the computer is scissor,you are paper,you lose");
		}
		else if (user==2&&comp==1)
		{
			System.out.println("the computer is rock,you are paper,you win");
		}
		else
		{
			System.out.println(" its a draw");
		}

	}

}
