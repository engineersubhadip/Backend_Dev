package Practice;

public class Client {
	
	void printName()
	{
		System.out.println("This is a Non Static Method PrintName");
	}
	
	void invokeFun()
	{
		printName();
	}
	public static void main(String[] args) {
		Client ob = new Client();
		
		ob.invokeFun();
	}
}
