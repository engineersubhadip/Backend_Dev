package Practice;

public class A {
	String name;
	
	A(String name)
	{
		this.name = name;
	}
	
	A()
	{
		this("Name is yet to be set..."); // telescoping
	}
	
	void displayName()
	{
		System.out.println("Name set is "+this.name);
	}
}