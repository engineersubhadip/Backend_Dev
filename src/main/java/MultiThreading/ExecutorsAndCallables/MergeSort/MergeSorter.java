package MultiThreading.ExecutorsAndCallables.MergeSort;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<ArrayList<Integer>> {

	private ArrayList<Integer> arr;
	private ExecutorService es;

	public MergeSorter(ArrayList<Integer> arr, ExecutorService es) {
		this.arr = arr;
		this.es = es;
	}

	public ArrayList<Integer> call() throws InterruptedException, ExecutionException {

		if (arr.size() <= 1) {
			return arr;
		}

		int mid = arr.size() / 2;

		ArrayList<Integer> leftArr = new ArrayList<>();
		ArrayList<Integer> rightArr = new ArrayList<>();

		for (int i = 0; i < mid; i++) {
			leftArr.add(arr.get(i));
		}

		for (int i = mid; i < arr.size(); i++) {
			rightArr.add(arr.get(i));
		}

//		Created the task :-

		MergeSorter leftSortedTask = new MergeSorter(leftArr, this.es);
		MergeSorter rightSortedTask = new MergeSorter(rightArr, this.es);

//		Submit the tasks to the Executor Service :-
		Future<ArrayList<Integer>> leftAns = es.submit(leftSortedTask);
		Future<ArrayList<Integer>> rightAns = es.submit(rightSortedTask);

		leftArr = leftAns.get();
		rightArr = rightAns.get();

//		Merge the 2 sorted arrays :-

		int i = 0, j = 0;

		ArrayList<Integer> ans = new ArrayList<>();

		while (i < leftArr.size() && j < rightArr.size()) {
			if (leftArr.get(i) <= rightArr.get(j)) {
				ans.add(leftArr.get(i));
				i++;
			} else {
				ans.add(rightArr.get(j));
				j++;
			}
		}

		while (i < leftArr.size()) {
			ans.add(leftArr.get(i));
			i++;
		}

		while (j < rightArr.size()) {
			ans.add(rightArr.get(j));
			j++;
		}

		return ans;
	}
}
