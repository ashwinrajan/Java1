class For2 
{
	public static void main(String[] args) 
	{
		 int i;

		 System.out.println("Post Increment");
      for (i=0; i < 6; ) {    //for(i=0;i<6;){System.out.printf("%d \n",i++);
         System.out.printf("i: %d\n", i++);
      }

	   System.out.println("Pre Increment");
      for (i=0; i < 6;   ) {  //for(i=0;i<6;){System.out.printf("%d \n",++i);
         System.out.printf("i: %d\n", ++i);
      }
	}
}