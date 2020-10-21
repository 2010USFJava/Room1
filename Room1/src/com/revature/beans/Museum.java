package com.revature.beans;

public class Museum {
	
	// instance variables
	private String location;
	private String events;
	
	// no args constructor
	public Museum () {
		
	}
	
	// constructor
	public Museum (String location, String events) {
		this.location = location;
		this.events = events;
		
	}

	// getters and setters
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEvents() {
		return events;
	}

	public void setEvents(String events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "Museum [location=" + location + ", events=" + events + "]";
	}
	
	
	
	

}
