package SingletonDesignPattern.CorrectWorkingCode;

public class Thread2_Target implements Runnable {

	@Override
	public void run() {
		Singleton_Design ob2 = Singleton_Design.getInstance();
		System.out.println("Inside Thread 2"+ob2);
	}

}
