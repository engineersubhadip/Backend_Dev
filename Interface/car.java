package Interface;

public class car {
	musicSystem ms; // ms is an interface ref for Interface Named musicSystem
//	ms will be acting as a socket inside which we will plug in those objects whose classes have honoured the interface musicSystem
//	i.e. objects of those classes who have implemented the Interface(musicSystem)
	void playSong() {
		ms.play();
	}
	void pauseSong() {
		ms.pause();
	}
	void forwardSong(int x) {
		ms.forward(x);
	}
	void stopSong() {
		ms.stop();
	}
}
