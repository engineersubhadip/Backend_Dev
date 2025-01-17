package MultiThreading.SharedDataStructure.Remedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2)); 
		System.out.println("Original Array "+arr);
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		Lock lock = new ReentrantLock();
		
		Adder20 task1 = new Adder20(arr, lock);
		Adder30 task2 = new Adder30(arr, lock);
		
		Future<Void> ans1 = es.submit(task1);
		Future<Void> ans2 =  es.submit(task2);
		
		ans1.get();
		ans2.get();
		
		System.out.println("Updated Array "+arr);
		es.shutdown();
	}

}
