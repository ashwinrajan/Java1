class EvenNumber

{
	public static void main(String[] args) 
	{
		for(int i=2;i<=100;i+=2)
		{
			System.out.println(i);
		}

		
		int i=2;
		int sum=0;

		while(sum<100)
		{
			System.out.println(sum);
			sum=sum+i;
			i+=2;

		}
	}
}
