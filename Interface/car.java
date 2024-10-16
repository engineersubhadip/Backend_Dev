package Interface;

public class car {
	private musicSystem ms; // ms is an interface ref for Interface Named musicSystem
//	ms will be acting as a socket inside which we will plug in those objects whose classes have honored the interface musicSystem
//	i.e. objects of those classes who have implemented the Interface(musicSystem)
	
//	setMusicSystem is a setter method
//	using this setter method we would be able to plug in the objects of only those classes
//	which have honored the contract of Interface(musicSystem)
//	i.e. only those objects whose classes have implemented Interface(musicSystem)
	
	public void setMusicSystem(musicSystem ms)
	{
		this.ms = ms;
	}
	
	void playSong() {
		if (this.ms == null)
		{
			System.out.println("No Music System installed");
			return;
		}
		ms.play();
	}
	void pauseSong() {
		if (this.ms == null)
		{
			System.out.println("No Music System installed");
			return;
		}
		ms.pause();
	}
	void forwardSong(int x) {
		if (this.ms == null)
		{
			System.out.println("No Music System installed");
			return;
		}
		ms.forward(x);
	}
	void stopSong() {
		if (this.ms == null)
		{
			System.out.println("No Music System installed");
			return;
		}
		ms.stop();
	}
}
