package MultiThreading.Part_2;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();

		Adder task = new Adder(num1, num2);

		Thread t = new Thread(task);
		t.start();
		System.out.println("At the end ?");
	}

}
