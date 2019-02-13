class  NestedFor
{
	public static void main(String[] args) 
	{
		
			for(int a=1; a<=4;a++)
		{
				//System.out.println("the outer for loop");
				for (int b=2;b<11 ;b+=2)
				{
					//System.out.println("the inner for loop");
					
					System.out.printf(" a:%d \t b:%d \n",a,b);
				}
		}
	}
}
