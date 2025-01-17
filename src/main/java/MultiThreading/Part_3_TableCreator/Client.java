package MultiThreading.Part_3_TableCreator;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int user = scn.nextInt();

		for (int i = 1; i <= user; i++) {
			TableCreator task = new TableCreator(i);
			Thread t = new Thread(task);
			t.start();
		}
	}

}
