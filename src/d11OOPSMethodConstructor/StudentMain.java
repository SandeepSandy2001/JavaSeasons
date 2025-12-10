package d11OOPSMethodConstructor;

public class StudentMain {

	public static void main(String[] args) 
	{
		
		/*Student stu = new Student();
		
		//using object reference variables
		stu.sid = 101;
		stu.sname = "Kohli";
		stu.grad = 'A';
		
		stu.printStudentData();
		
		//using method
		
		stu.setStudentData(102, "Virat", 'A');
		stu.printStudentData(); */
		
		
		//Using Constructor
		
		Student stud = new Student(103, "Amigo", 'B');
		stud.printStudentData();
		

	}

}
