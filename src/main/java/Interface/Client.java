package Interface;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car obj = new car();
		obj.playSong();
		obj.forwardSong(44);
		
		boseMusicSystem bobj = new boseMusicSystem();
		obj.setMusicSystem(bobj);
		
		obj.playSong();
		obj.pauseSong();
		obj.stopSong();
		
		
		sonyMusicSystem sobj = new sonyMusicSystem();
		
//		obj.setMusicSystem(sobj);
		
//		obj.forwardSong(98);
//		obj.playSong();
		
		ericsson eobj = new ericsson();
		
//		obj.setMusicSystem(eobj);
		
//		obj.playSong();
	}

}
