package Threads1.Assignment.Question2;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int user1 = scn.nextInt();
		int user2 = scn.nextInt();

		Adder adder = new Adder(user1, user2);

		ScalerThread st = new ScalerThread(adder);

		st.start();
	}

}
