package Travel_System;

public class Location {
	String city;
	String country;
	
	Location (String city, String country)
	{
		this.city = city;
		this.country = country;
	}
	
	Location (Location L)
	{
		this.city = L.city;
		this.country = L.country;
	}
}
