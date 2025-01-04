package MultiThreading.ExecutorsAndCallables.BinaryTree;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		Node root = new Node(25);
		root.left = new Node(22);
		root.left.left = new Node(27);
		root.left.right = new Node(29);
		root.right = new Node(37);

		ExecutorService es = Executors.newCachedThreadPool();

//		1. Identified the task to be run on seperate thread :- 
//		The task is to find the height of a BT on a seperate thread.
//		2. Implement the task in the form of class :- Done
//		3. Create the task :-
		TreeSizeCalculator task = new TreeSizeCalculator(root, es);
//		4. Submit the task to the Executor Service :-
		Future<Integer> ans = es.submit(task);

		int result = ans.get();

		System.out.println("Tree Height : " + result);

		es.close();
	}

}
