package MultiThreading.ExecutorsAndCallables.BinaryTree;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {

	private Node root;
	private ExecutorService es;

	public TreeSizeCalculator(Node root, ExecutorService es) {
		this.root = root;
		this.es = es;
	}

	@Override
	public Integer call() throws Exception {

		if (this.root == null) {
			return 0;
		}

		Node leftTree = this.root.left;
		Node rightTree = this.root.right;

//		Created the task :-
		TreeSizeCalculator leftTreeTask = new TreeSizeCalculator(leftTree, this.es);
		TreeSizeCalculator rightTreeTask = new TreeSizeCalculator(rightTree, this.es);

//		Submit the Tasks to the Executor Service :-
		Future<Integer> leftTreeFuture = this.es.submit(leftTreeTask);
		Future<Integer> rightTreeFuture = this.es.submit(rightTreeTask);

		int leftTreeHeight = leftTreeFuture.get();
		int rightTreeHeight = rightTreeFuture.get();

		return leftTreeHeight + rightTreeHeight + 1;
	}

}
