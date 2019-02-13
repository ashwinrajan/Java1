class  If2
{
	public static void main(String[] args) 
	{
		int x, y, z;

    x = 5;
    y = 10;
    z = 15;

    if ((x==5) || (y < 10))
        System.out.println("one\n");
    if ((x == 5) && (y < 10))
        System.out.println("two\n");
    if ((z == 15 && x == 6) && y == 10)
        System.out.println("three\n");

	}
}
