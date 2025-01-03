package TightCoupling;

public class Bose implements MusicSystem {

	@Override
	public void playSong() {
		System.out.println("Playing the Bose Song......");

	}

	@Override
	public void stopSong() {
		System.out.println("Stopping the Bose Song.......");
	}

}
