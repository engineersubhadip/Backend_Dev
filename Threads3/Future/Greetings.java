package Threads3.Future;

import java.util.Random;
import java.util.concurrent.Callable;

public class Greetings implements Callable<String> {
	Random rand = new Random();

	@Override
	public String call() throws Exception {
		int num = Math.abs(rand.nextInt()) % 4;

		if (num == 0) {
			return "Hola";
		} else if (num == 1) {
			return "Hi";
		} else if (num == 2) {
			return "Hey";
		} else {
			return "Hello";
		}
	}

}
