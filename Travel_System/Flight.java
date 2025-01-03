package Travel_System;

public class Flight {
	int flightNumber;
	Location departure;
	Location arrival;
	
	Flight(int flightNumber, Location departure, Location arrival)
	{
		this.flightNumber = flightNumber;
		this.departure = new Location(departure);
		this.arrival = new Location(arrival);
	}
	
	Flight(Flight other)
	{
		this.flightNumber = other.flightNumber;
		this.departure = new Location(other.departure);
		this.arrival = new Location(other.arrival);
	}
	
	void displayFlightDetails()
	{
		System.out.println("FlightNumber : "+this.flightNumber);
		System.out.println("Departure Country : "+this.departure.country);
		System.out.println("Arrival Country : "+this.arrival.country);
	}
}
