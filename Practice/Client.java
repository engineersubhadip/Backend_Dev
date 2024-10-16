package Practice;

interface I {
	void start();
	void stop();
}

public class Client implements I{
	
	public void start() {
		System.out.println("Start method...");
	}
	
	public void stop() {
		System.out.println("Stop Method ...");
	}
	
	void customFunc() {
		System.out.println("Hello from Custom Func...");
	}
	
	public static void main(String[] args) {
		
		I ob = new Client();

	}
}
