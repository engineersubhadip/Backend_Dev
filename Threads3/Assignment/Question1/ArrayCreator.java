package Threads3.Assignment.Question1;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<ArrayList<Integer>> {
	private int userInput;
	public ArrayList<Integer> array = new ArrayList<>();

	public ArrayCreator(int userInput) {
		this.userInput = userInput;
	}

	@Override
	public ArrayList<Integer> call() throws Exception {

		for (int i = 1; i <= userInput; i++) {
			this.array.add(i);
		}

		return this.array;
	}

}
