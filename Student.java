public class Student 
{
	private String name;
	private double gpa;
	private String program;
	private int studentId;
	private String phoneNum;


	public Student (String a, double b, String c, int d, String e)
	{
		name=a;
		gpa=b;
		program=c;
		studentId=d;
		phoneNum=e;

	}
	public String getName()
	{
		return name;
	}
	public double getGPA()
	{
		return gpa;
	}
	public String getProgram()
	{
		return program;
	}
	public int getStudentId()
	{
		return studentId;
	}
	public String getPhonenum()
	{
		return phoneNum;
	}
	public void setPhonenum(String x)
	{
		phoneNum = x;
	}


}
