package Practice;

public class Client {
	public static void main(String[] args) {
		A o1 = new A();
		
		A o2 = new A();
		
		System.out.println("Coming from O1 "+o1.piVal);
		System.out.println("Coming from O2 "+o2.piVal);
		
		o1.piVal = 12.333412;
		
		System.out.println("Updated piVal via o1 "+o1.piVal);
	}
}
