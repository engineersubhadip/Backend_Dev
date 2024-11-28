package Interface3;

public class Sparrow {

	private Fly flySocket;

	public void setSocket(Fly flySocket) {
		this.flySocket = flySocket;
	}

	public void fly() {
		this.flySocket.flightAlgo();
	}
}
