package week3.day1;

public class calculator{
	void add()
	{
		int a=4;
		int b=5;
		int c=a+b;
		System.out.println(c);
	}
	int add(int a,int b)
	{
		return(a+b);
		
	}
public static void main(String[] args) {
	calculator calc=new calculator();
	calc.add();
	System.out.println(calc.add(6,5));
	
	}
}
