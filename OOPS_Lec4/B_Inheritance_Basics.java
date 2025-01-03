package OOPS_Lec4;

public class B_Inheritance_Basics  extends A_Inheritance_Basics{
	int y;
	void fun2()
	{
		System.out.println("I am from Class B");
	}
	
	void fun1()
	{
		System.out.println("I am over-riding the fun1 inherited from Class A");
	}
}
