// We can access a static data-member from a non-static method 

package OOPS_Lec3;

public class B {
	int x;
	static int y;
	
	void getSum()
	{
		System.out.println("The summation value is: "+(x+y));
	}
	
	static void fun()
	{
		System.out.println("We are inside the Static Method");
	}
}
