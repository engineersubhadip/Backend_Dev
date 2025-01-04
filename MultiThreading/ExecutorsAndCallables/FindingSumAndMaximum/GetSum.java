package MultiThreading.ExecutorsAndCallables.FindingSumAndMaximum;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class GetSum implements Callable<Integer> {
	private ArrayList<Integer> arr;

	public GetSum(ArrayList<Integer> arr) {
		this.arr = arr;
	}

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 0; i < this.arr.size(); i++) {
			sum += this.arr.get(i);
		}
		return sum;
	}

}
