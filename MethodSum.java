class  MethodSum
{
	
	public static void sum(int num1, int num2)
	{
		int sum=0;

		for (int i=num1;i<=num2 ;i++ )
		{
			sum+=i;
		}
		System.out.println(sum);

	}

	public static void main(String[] args) 
	{
		sum(1,20);
		sum(20,30);
		sum(35,45);

	}
}
