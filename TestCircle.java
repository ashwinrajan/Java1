class TestCircle 
{
	public static void main(String[] args) 
	{

		// create objects of circle

		//declare a variable which can hold the circle obj

		Circle c1;//c1 is an object reference for a circle 
		//create a circle  new
		
		c1=new Circle(2,3,6.7);//default constructor
		System.out.println(c1.getRadius());
		c1.getPosition();
		System.out.println("the colour of circle is"+c1.getColour());
	}
}