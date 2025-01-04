package MultiThreading.ExecutorsAndCallables.GenerateArrayList;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<ArrayList<Integer>> {

	private int num;

	public ArrayCreator(int num) {
		this.num = num;
	}

	@Override
	public ArrayList<Integer> call() throws Exception {
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 1; i <= num; i++) {
			result.add(i);
		}

		return result;
	}

}
