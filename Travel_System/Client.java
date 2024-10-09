package Travel_System;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Location locationDetails1 = new Location("Rio","Brassila");
		Location locationDetails2 = new Location(locationDetails1);

		locationDetails2.city = "Lima";
		locationDetails2.country = "Peru";
		
		Flight flightDetails1 = new Flight(12334, locationDetails1, locationDetails2);
		
		flightDetails1.displayFlightDetails();
		
		Flight flightDetails2 = new Flight(1726537126, locationDetails1, locationDetails2);
		
		flightDetails2.departure.city = "New Delhi";
		flightDetails2.departure.country = "India";
		flightDetails2.arrival.city = "Moscow";
		flightDetails2.arrival.country = "Russia";
		
		flightDetails2.displayFlightDetails();
		
		Traveller travellerDetails1 = new Traveller("Mr. Smith","XV4272",flightDetails1);
		
		Traveller travellerDetails11 = new Traveller("Mr. Jade","P85385",flightDetails2);
		
		System.out.println("-----------------------");
		travellerDetails1.displayTravellerDetails();
		System.out.println("-----------------------");
		travellerDetails11.displayTravellerDetails();
		
		travellerDetails1.flight.departure.country = "Australia";
		System.out.println("-----------------------");
		travellerDetails1.displayTravellerDetails();
	}

}
