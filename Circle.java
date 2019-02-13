public class Circle 
{
	private double pox;//data members
	private double posy;
	private double radius;
	private String colour;
	private double area;

	//member methods

	//constructor
	public Circle(double x,double y,double r)
	{
			pox=x;
			posy=y;
			radius=r;
			colour="red";
	}
	public double computeArea(double radius)
	{
		return Math.PI*radius*radius;
	}
	public void move(double x,double y)
	{
		pox=x;
		posy=y;
	}

	public void changeRadius(double r)
	{
		radius=r;
	}

	public double getRadius()
	{
		return radius;
	}
	public void getPosition()
	{
		System.out.println("The circle is at x:" +pox+"y:"+posy);
	}
	public String getColour()
	{
		return colour;
	}
}