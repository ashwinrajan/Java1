import java.util.Scanner;

class  StudentInfo
{
	public static void main(String[] args) 
	{
		Scanner in;
		in= new Scanner(System.in);

		String name;
		int studentnumber;
		int quiz1;
		int quiz2;
		int total;

		System.out.println("Please enter your Name");
		name=in.nextLine();

		System.out.println("Please enter your Student Number");
		studentnumber=in.nextInt();

		System.out.println("Please enter marks for Java Quiz 1");
		quiz1=in.nextInt();

		System.out.println("Please enter marks for Java Quiz 2");
		quiz2=in.nextInt();

		total = (quiz1 + quiz2);

		System.out.println(name+ " student#: " +studentnumber+", you have "+total+" marks in total.");

	}
}
