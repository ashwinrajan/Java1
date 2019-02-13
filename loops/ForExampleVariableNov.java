class ForExampleVariableNov 
{
	public static void main(String[] args) 
	{ //start of the i life

		int i;
		for(i=0;i<10;i++)
		{// start of x,y
				int x,y; x=1;y=1;
			System.out.printf("%d \n",i);
				System.out.printf("%d,%d",x,y); //valid
		}// x,y no longer exists
		
		System.out.printf("%d,%d",x,y);// gives you error
		System.out.printf("value of i after the loop  %d ",i);
	}//i will no longer exists
}
