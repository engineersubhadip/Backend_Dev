package MultiThreading.SharedDataStructure.Problem;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Adder30 implements Callable<Void> {
	
	private ArrayList<Integer> arr;
	
	public Adder30 (ArrayList<Integer> arr) {
		this.arr = arr;
	}
	
	@Override
	public Void call() throws Exception {
		this.arr.add(30);
		return null;
	}

}
