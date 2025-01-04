package MultiThreading.ExecutorsAndCallables.FindingSumAndMaximum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(12, 13, 44, 22, 5));
//		Steps 1 and 2 done.
//		Create the tasks
		GetSum task1 = new GetSum(arr);
		GetMax task2 = new GetMax(arr);
//		Submit the tasks to ExecutorService
		ExecutorService es = Executors.newFixedThreadPool(2);

		Future<Integer> sumFuture = es.submit(task1);
		Future<Integer> maxFuture = es.submit(task2);

		int total = sumFuture.get();
		int max = maxFuture.get();

		System.out.println("Sum is " + total + " Max is " + max);

		es.shutdown();
	}

}
