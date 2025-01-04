package Practice.DirtyRead;

public class Client {

	public static void main(String[] args) {

		Count count = new Count();

		Add task1 = new Add(count);
		Subtract task2 = new Subtract(count);

		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);

		t1.start();
		t2.start();

		System.out.println(count.ref);
	}

}
