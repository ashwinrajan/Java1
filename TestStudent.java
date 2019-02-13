class TestStudent 
{
	public static void main(String[] args) 
	{
		Student student1=new Student("Ashwin",3,"Computer Engineering", 99123084,"9054534891");

		System.out.println("Name of the student "+student1.getName());
		System.out.println("Student GPA: "+student1.getGPA());
		System.out.println("Name of the program "+student1.getProgram());
		System.out.println("Student ID #: "+student1.getStudentId());
		System.out.println("Phone#: "+student1.getPhonenum());


	}
}
