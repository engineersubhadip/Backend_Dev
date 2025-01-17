package LeetcodeMultiThreading.Leetcode_1115_PrintFooBarAlternatively;

import java.util.concurrent.Semaphore;

class FooBar {
	private int n;
	private Semaphore fooSema;
	private Semaphore barSema;

	public FooBar(int n) {
		this.n = n;
		fooSema = new Semaphore(1);
		barSema = new Semaphore(0);
	}

	public void foo(Runnable printFoo) throws InterruptedException {

		for (int i = 0; i < n; i++) {
			fooSema.acquire();
			// printFoo.run() outputs "foo". Do not change or remove this line.
			printFoo.run();
			barSema.release();
		}
	}

	public void bar(Runnable printBar) throws InterruptedException {

		for (int i = 0; i < n; i++) {
			barSema.acquire();
			// printBar.run() outputs "bar". Do not change or remove this line.
			printBar.run();
			fooSema.release();
		}
	}
}
