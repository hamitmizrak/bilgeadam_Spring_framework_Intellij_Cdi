package com.bilgeadam.e1.aop.a2.event2;

public class EventStatusData {
	
	private String country;
	
	public EventStatusData() {
	}
	
	// parametreli constructor
	public EventStatusData(String country) {
		this.country = country;
	}
	
	// toString
	@Override
	public String toString() {
		return "EventStatusData [country=" + country + "]";
	}
	
	// getter and setter
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
}
