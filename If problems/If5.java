class If5 
{
	public static void main(String[] args) 
	{
		
		int a, b;
int d, e=0 ;

    a = 2
		
	
	
	
	
	
	;
    b = a + 1;
    if (a < 3) {
        d = (a + b) *( 5 % 10);
    } else {
        System.out.printf("I am here!\n");
        d = 8 - b % 2;
    }
	
   System.out.printf("d is %d, a is %d, b is %d\n", d, a, b);
  
	e = d/ (3 + 2) *(2 + 2) % 3;
	

   System.out.printf("e is %d, a is %d and b is %d\n", e, a, b);
  
    d = e /( a * b) +( a % b);
    System.out.printf("and d is %d!\n", d);
    a =d;
    if (d > a)
        System.out.printf("d is bigger\n");
    else
        System.out.printf("They must be the same\n");
    System.out.printf("a is %d\n", a);

	}
}
