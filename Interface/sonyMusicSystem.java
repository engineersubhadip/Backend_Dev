package Interface;

public class sonyMusicSystem implements musicSystem{ // honours the contract
	
	public void play() {
		System.out.println("Play from Sony ");
	}
	public void pause() {
		System.out.println("Pause from Sony ");
	}
	public void forward(int x) {
		System.out.println("Forward from Sony ");
	}
	public void rewind(int x) {
		System.out.println("Rewind from Sony ");
	}
	public void stop() {
		System.out.println("Stop from Sony");
	}
}
