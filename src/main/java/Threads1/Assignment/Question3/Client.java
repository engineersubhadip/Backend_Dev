package Threads1.Assignment.Question3;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int userInput = scn.nextInt();

		for (int i = 1; i <= userInput; i++) {
			TableCreator tablecreator = new TableCreator(i);
			Thread t = new Thread(tablecreator);
			t.start();
		}
	}

}
