package Threads1.Assignment.Question2;

public class Adder implements Runnable {
	int userInput1;
	int userInput2;

	public Adder(int userInput1, int userInput2) {
		this.userInput1 = userInput1;
		this.userInput2 = userInput2;
	}

	public void run() {
		int result = this.userInput1 + this.userInput2;
		System.out.println(result);
	}
}
