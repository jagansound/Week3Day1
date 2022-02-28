package week3.day1;

public class Student extends Department{
	
	//Methods  :studentName(),studentDept(),studentId()
	
	public void studentName() {
		System.out.println("Student Details:");
		System.out.println("====================");
		System.out.println("First  Name: Jagadeesh");
		System.out.println("Middle Name: Soundappan");
		System.out.println("Last Name: Shanmuganandan");
		
		}
	public void studentDept() {
		System.out.println("Department: Computer Science Engineering");
	}
	
	public void studentId() {
		System.out.println("Student ID: R09235");
	}
	
	public static void main(String[] args) {
		Student obj = new Student();
		System.out.println("Multi Level Inheritance");
		System.out.println("=======================");
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}

}
