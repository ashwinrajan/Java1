class NestedBreak
{
	public static void main(String[] args) 
	{
		int i;int j;
		outer:for(i=0;i<5;i++)
		{
			
			inner:for( j=0;j<5;j++)
			{
				if(i==j)
				break inner;		
			}
			System.out.printf("values of j after ther break %d \n",j);
		}
		System.out.println("outside the loop");

 
	}
}
