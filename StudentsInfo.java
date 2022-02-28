package week3.day1;

public class StudentsInfo {
	
	public void getStudentInfo(int ID) {
		
		System.out.println("student ID:" + ID);
	
	}
	
	public void getStudentInfo(int ID, String name) {
		System.out.println("student ID:" + ID);
		System.out.println("student ID:" + name);
	}

	public void getStudentInfo(long phoneNumber, String email) {
		System.out.println("student phone:" + phoneNumber);
		System.out.println("student ID:" + email);
	}
	
	public static void main(String[] args) {
		StudentsInfo obj = new StudentsInfo();
		
		obj.getStudentInfo(22);
		obj.getStudentInfo(19, "Jagadeesh");
		obj.getStudentInfo(9012165598L,"jaga@yahoo.com");
	}
	
}
