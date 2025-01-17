package MultiThreading.Part_1_Basics;

public class Client {

	public static void main(String[] args) {

		System.out.println("I am the main Class");

		Adder task1 = new Adder();
		Subtractor task2 = new Subtractor();

		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);

		t1.start();
		t2.start();

		System.out.println("Will print at last ?");
	}

}
