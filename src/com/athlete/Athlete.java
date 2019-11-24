package com.athlete;

public class Athlete {
	protected int gripStrength = 5;
	protected String coordinate = "37.989, 89.771";
	
	// parameterized constructor method
	public Athlete(int gripStrength) {
		// set the context of gripStrength to the instance of this class
		this.gripStrength = gripStrength;
	}
	
	// Method that returns a String of the geo coordinates the Athlete moves to when climbing
	public String moveToCoordinate(){
		return coordinate;
	}
}
