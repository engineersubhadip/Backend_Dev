package Practice;

public class A{
	int x;
	static int y;
	
	void display()
	{
		System.out.println("Non Static DM "+this.x);
		System.out.println("Static DM "+this.y);
	}
}