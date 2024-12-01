package Threads1.Assignment.Question1;

import java.util.HashMap;
import java.lang.reflect.Field;

public class ScalerThread extends Thread {
	public static HashMap<String, String> map = new HashMap<>();
	private String target;

	ScalerThread(Runnable r) {
		super(r);
		target = r.getClass().getName();
	}

	@Override
	public void start() {
		super.start();
		map.put(target, this.getName());
	}
}
