package TightCoupling;

public class Car {
	private MusicSystem socket;

	public void setMusicSystem(MusicSystem sys) {
//		socket = new Sony(); // TightCoupling
		socket = sys; // Loose Coupling
	}

	void playSong() {
		if (this.socket == null) {
			return;
		}
		socket.playSong();
	}

	void stopSong() {
		if (this.socket == null) {
			return;
		}
		socket.stopSong();
	}
}
