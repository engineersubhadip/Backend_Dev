package MultiThreading.ExecutorsAndCallables.GenerateArrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int userNum = scn.nextInt();

//		1. Identify the task to be run on seperate thread:-
//		The task is to generate an array list and return in
//		2. Implement the task in the form of class (ArrayCreator) :- Done
//		3. Create the task :-
		ArrayCreator task = new ArrayCreator(userNum);
//		4. Submit the task to Executor Service :-
		ExecutorService es = Executors.newFixedThreadPool(1);
		Future<ArrayList<Integer>> ans = es.submit(task);
		System.out.println(ans.get());

		es.shutdown();
	}

}
