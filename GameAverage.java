import java.util.Scanner;

class GameAverage 
{
	public static void main(String[] args) 
	{

		for(int i=1;i<5;i++)
		{
			double score, totalScore=0;
			double average;

			System.out.println("Scores for Player "+i);
			
			for(int j=1;j<4;j++)
			{
				System.out.print("Game "+j+": ");
				Scanner in;
				in= new Scanner(System.in);
				score = in.nextInt();
				totalScore+=score;
				
			}

			average=totalScore/3;
			System.out.printf(" Average Score: %.2f \n \n",average);


		}

	}
}
