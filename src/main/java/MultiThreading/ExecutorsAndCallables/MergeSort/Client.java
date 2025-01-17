package MultiThreading.ExecutorsAndCallables.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

//		Task is to sort the array in a seperate thread :-

		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 6, 12, 4, 8, 9, 10, 5));

		ExecutorService es = Executors.newCachedThreadPool();

//		1. Creating the task :-
		MergeSorter ms = new MergeSorter(arr, es);

//		2. Submitting the task to the ES :-
		Future<ArrayList<Integer>> ans = es.submit(ms);

//		Capturing the sorted arr :-

		ArrayList<Integer> result = ans.get();

		System.out.println("Final result " + result);
	}

}
