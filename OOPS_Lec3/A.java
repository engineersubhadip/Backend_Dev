// We cannot access/ update non static data members inside static methods

package OOPS_Lec3;

public class A {
	int x;
	int y;
	
	void func()
	{
		System.out.println(x+y);
	}
	
	static void newFunc()
	{
		int x = 33;
		int y = 44;
		
		System.out.println(x + y);
	}
}
