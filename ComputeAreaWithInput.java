
import java.util.Scanner;//to use the Scanner class
class ComputeAreaWithInput 
{
	public static void main(String[] args) 
	{
		double radius; // declare radius
		double area;		//declare area
		final double PI=3.14;//will make pi as constant and no one can change the value
		System.out.println("Enter a value for radius");//message to user
		Scanner in;//in is a variable that holds an object of Scanner class
		in=new Scanner(System.in);// a new a Scanner object is created based on standard input device i.e; keyboard
		radius=in.nextDouble();
		// == assignmnet operatore


		area=PI*radius*radius;			// calculate area

		System.out.println("The area is " +area);//print the area

		//pi=9;

		//System.out.println("radius");
		//System.out.println(radius);
		
		
		
	}
}
