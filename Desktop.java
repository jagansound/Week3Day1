package week3.day1;

public class Desktop extends Computer{
	
	public void desktopSize(){		
		System.out.println("The desktop size is 3.6 inches");		
	}
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		System.out.println("Single Level Inheritance");
		obj.desktopSize();  //calling local method		
		obj.computerModel(); //calling Super/base method
	}	
}


