class CoinToss 
{
	public static void main(String[] args) 
	{
		int tails=0;
		int heads=0;
		double tailsPercentage;
		double headsPercentage;


		for(int i=0;i<=10;i++)
		{
			double random= Math.random();
			

			if (random<=0.5)
			{
				System.out.println("Tails");
				tails++;
			}
			else
			{
				System.out.println("Heads");
				heads++;

			}
				
			
		}
		
		tailsPercentage= (tails*.1)*100;
		headsPercentage= (heads*.1)*100;

		//System.out.printf("Percentage of tails = %2.0f Percentage of heads = %2.0f \n",tailsPercentage,headsPercentage);

		System.out.println(headsPercentage);

	}
}
