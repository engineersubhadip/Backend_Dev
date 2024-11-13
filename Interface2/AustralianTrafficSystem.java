package Interface2;

public class AustralianTrafficSystem implements CentralTrafficSystem, ContinentalTraffic {

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green implementation in Australia");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red implementation in Australia");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow implementation in Australia");
	}
	
	void fun() {
		System.out.println("Australia Object");
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train symbol from Australia");
	}
	
	
}
