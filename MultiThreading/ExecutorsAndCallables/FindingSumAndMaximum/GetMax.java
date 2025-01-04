package MultiThreading.ExecutorsAndCallables.FindingSumAndMaximum;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class GetMax implements Callable<Integer> {

	private ArrayList<Integer> arr;

	public GetMax(ArrayList<Integer> arr) {
		this.arr = arr;
	}

	@Override
	public Integer call() throws Exception {
		int maxNum = Integer.MIN_VALUE;
		for (int i = 0; i < this.arr.size(); i++) {
			maxNum = Math.max(maxNum, this.arr.get(i));
		}
		return maxNum;
	}

}
