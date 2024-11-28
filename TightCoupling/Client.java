package TightCoupling;

public class Client {

	public static void main(String[] args) {

		Car c = new Car();
//		c.setMusicSystem();
//		c.setMusicSystem(new Sony());
//		c.playSong();
//		c.stopSong();
//
		c.setMusicSystem(new Bose());
		c.playSong();
		c.stopSong();
	}

}
