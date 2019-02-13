class For1 
{
	public static void main(String[] args) 
	{
		 int i;
      for (i=0; i < 3; i = i + 1) {
         System.out.printf("i: %d\n", i);
      }
      System.out.printf("The first end value of i is %d.\n", i);
   
      for (i=0; i < 0; i = i+1) {
         System.out.printf("i: %d\n", i);
      }
      System.out.printf("The second end value of i is %d.\n", i);
   }


}
