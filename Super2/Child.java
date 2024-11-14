package Super2;

public class Child extends Parent {

	String name = "Das";

	public void getParent() {
		System.out.println("Parent Details inside Child Class is " + super.name);
	}
	
	public void getData() { // Method Over-riding
		System.out.println("I am inside Child Class");
//		Use parent getDat() inside Child Class
		super.getData();
	}
}
