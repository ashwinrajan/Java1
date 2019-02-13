class MethodOverloading 
{
	public static void main(String[] args) 
	{
		System.out.println("Area of sphere" + area(12));
		System.out.println("Area of triangle"+ area(5,7));
		System.out.println("Area of square" );

	}

	public static double area(double r)
	{
		return 4*Math.PI*Math.pow(r,2);

	}

	public static double area(double b,double h)
	{
		return 0.5*(b*h);

	}

}
