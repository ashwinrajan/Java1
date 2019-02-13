class NestedWhile 
{
	public static void main(String[] args) 
	{
		
			int x,y=5;
			x=10;
			while(x>5)
				 
				{
					//y=5;
					System.out.println("outer loop");
					while(y>1)
						
					{
						System.out.println("inner loop");
						System.out.printf("%d %d \n",x,y);
						y--;
					}
					x--;
				}


	}
}
