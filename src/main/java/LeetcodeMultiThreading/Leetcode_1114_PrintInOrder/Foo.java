package LeetcodeMultiThreading.Leetcode_1114_PrintInOrder;

import java.util.concurrent.Semaphore;

/*
printFirst.run(); -> Prints "first"
printSecond.run(); -> Prints "second"
printThird.run(); -> Prints "third"
*/

class Foo {

	private Semaphore firstSema;
	private Semaphore secondSema;
	private Semaphore thirdSema;

	public Foo() {
		this.firstSema = new Semaphore(1);
		this.secondSema = new Semaphore(0);
		this.thirdSema = new Semaphore(0);
	}

	public void first(Runnable printFirst) throws InterruptedException {
		this.firstSema.acquire();
		printFirst.run();
		this.secondSema.release();
	}

	public void second(Runnable printSecond) throws InterruptedException {
		this.secondSema.acquire();
		printSecond.run();
		this.thirdSema.release();
	}

	public void third(Runnable printThird) throws InterruptedException {
		this.thirdSema.acquire();
		printThird.run();
	}
}
