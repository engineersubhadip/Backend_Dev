package SingletonDesignPattern.CorrectWorkingCode;

public class Thread1_Target implements Runnable {

	@Override
	public void run() {
		
		Singleton_Design ob1 = Singleton_Design.getInstance();
		System.out.println("Inside Thread 1"+ob1);
	}

}
