import java.util.Scanner;

class Practice 
{
	public static void main(String[] args) 
	{
		int num;
		int squareroot;
		int square;
		int cube;
		
		System.out.println("Enter a number less than 100");
		Scanner input;
		input = new Scanner(System.in);

		num=input.nextInt();

		if(num<100){
			squareroot=Math.sqrt(num);
			System.out.println(squareroot);

			square=Math.pow(num,2);
			System.out.println(square);

			cube=Math.pow(num,3);
			System.out.println(cube);

		}


	}
}
