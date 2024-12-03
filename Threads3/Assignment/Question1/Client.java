package Threads3.Assignment.Question1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Scanner scn = new Scanner(System.in);

		int userInput = scn.nextInt();

		ExecutorService es = Executors.newFixedThreadPool(1);

		ArrayCreator ac = new ArrayCreator(userInput);

		Future<ArrayList<Integer>> promise = es.submit(ac);

		ArrayList<Integer> array = promise.get();

		System.out.println(array);

		es.shutdown();
	}

}
