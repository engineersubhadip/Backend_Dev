package OOPS_Lec5;

public class B2 extends A2{
	void fun()
	{
		System.out.println("Fun from B");
		System.out.println("Adding the previous Func from A");
		super.fun();
	}
}
