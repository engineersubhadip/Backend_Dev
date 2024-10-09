package Practice;

public class A{
	int x;
	int y;
	
	A(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	A()
	{
		this(0,0); // telescoping
	}
	A(A ob)
	{
		this.x = ob.x;
		this.y = ob.y;
	}
	
	void displayElements()
	{
		System.out.println("X : "+this.x+" Y : "+this.y);
	}
}