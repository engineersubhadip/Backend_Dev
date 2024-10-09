package Travel_System;

public class Traveller {
	String name;
	String passportNumber;
	Flight flight;
	
	Traveller(String name, String passportNumber, Flight flight)
	{
		this.name = name;
		this.passportNumber = passportNumber;
		this.flight = new Flight(flight);
	}
	
	Traveller(Traveller other)
	{
		this.name = other.name;
		this.passportNumber = other.passportNumber;
		this.flight = new Flight(other.flight);
	}
	
	void displayTravellerDetails()
	{
		System.out.println("Traveller Name : "+this.name);
		System.out.println("PassPort Number : "+this.passportNumber);
		flight.displayFlightDetails();
	}
}
