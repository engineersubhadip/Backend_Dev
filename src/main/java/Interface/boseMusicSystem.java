package Interface;

public class boseMusicSystem implements musicSystem { // honour the contract
	public void play() {
		System.out.println("Play song from Bose ");
	}
	public void pause() {
		System.out.println("Pause song from Bose ");
	}
	public void forward(int x)
	{
		System.out.println("Forward song from Bose ");
	}
	public void rewind(int x)
	{
		System.out.println("Rewind song from Bose ");
	}
	public void stop() {
		System.out.println("Stop song from Bose ");
	}
}
