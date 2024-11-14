package Static2;

public class StaticVar {
	
	String name;
	String address;
	String city = "Bangalore";
	
	public StaticVar(String name, String address){ // Parameterized Constructor
		this.name = name;
		this.address = address;
	};
	
	public void getAddress() {
		System.out.println(this.address);
	}
	
	public static void getCity() {
//		System.out.println(this.city); // Inside static methods we cannot access instance level variables.
//		Only static variables are accessible, inside static methods.
	}
	
	public static void main(String[] args) {
		
		StaticVar st1 = new StaticVar("Bob","Mathalli");
		StaticVar st2 = new StaticVar("Ram","Jayanagar");	
		
		st1.getAddress();
		st2.getAddress();
	}

}
