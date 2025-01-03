package Exercise_OOPS_Lecture_3;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreedPoint ob = new ThreedPoint();
		
		ob.display();
		
//		The below 2 non-static method invocation proves that,
//		if we have created an instance from ThreePoint, then 
//		it does not matter via which object reference we are 
//		invoking "display()" method, because we have over-ridden
//		display() inherited from the Parent Class.
//		Run Time Polymorphism
		
		Point ob1 = new ThreedPoint();
		
		ob1.display();
		
		Point ob2 = new Point();
		
		ob2.display();
	}

}
