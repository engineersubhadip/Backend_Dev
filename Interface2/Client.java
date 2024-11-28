package Interface2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralTrafficSystem a = new AustralianTrafficSystem();

		a.redStop();

		a.greenGo();

		a.flashYellow();

//		a.fun(); -> Because inside the Interface CentralTrafficSystem we do not have fun
//		Remedy :-

		AustralianTrafficSystem a1 = new AustralianTrafficSystem();

		a1.fun();

//		a.Trainsymbol(); -> Because inside the Interface CentralTrafficSystem, we do not have trainSymbol();
//		Remedy :-

		ContinentalTraffic a2 = new AustralianTrafficSystem();

		a2.Trainsymbol();
	}

}
