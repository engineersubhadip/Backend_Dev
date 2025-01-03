package Super2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child(); 
		
		/*
		 Parent Class Constructor
		 Inside Child Class Constructor
		 */

		System.out.println(c.name); // Das

		c.getParent(); // Subhadip
		
		c.getData(); // Method inside Parent Class
	}

}
