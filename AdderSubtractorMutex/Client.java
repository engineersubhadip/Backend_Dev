package AdderSubtractorMutex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 Shared lock basically means the following :-
 If there is a room and there are 5 doors. All the doors have the same lock. (Meaning all the doors can be opened by only one TYPE of LOCK) 
 By using Shared lock concept, we are sending only one KEY.
 
 If we would have created more than one key and send one KEY to thread1 and another key to thread2.
 That is basically like sending 2 keys of the SAME TYPE.
 Meaning if one thread has locked the Critical section of the code and hasn't unlocked it yet.
 Another thread can unlock the Critical section using the 2nd key we passed.
 */
public class Client {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Count count = new Count();
		Lock lock = new ReentrantLock();

		Adder task1 = new Adder(count, lock);
		Subtractor task2 = new Subtractor(count, lock);

		ExecutorService es = Executors.newFixedThreadPool(2);

		Future<Void> ans1 = es.submit(task1);
		Future<Void> ans2 = es.submit(task2);

		ans1.get();
		ans2.get();

		System.out.println("Updated value inside Count object " + count.value);
		es.shutdown();
	}

}
