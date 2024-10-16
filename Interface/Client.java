package Interface;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car obj = new car();
		obj.ms = new sonyMusicSystem();
		
		obj.playSong();
		obj.forwardSong(23);
		
		obj.ms = new boseMusicSystem();
		
		obj.stopSong();
		obj.pauseSong();
	}

}
