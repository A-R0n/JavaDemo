package com.athlete;

public abstract class Athlete {
	protected int gripStrength = 5;
	protected String coordinate = "37.989, 89.771";
	
	// parameterized constructor method
	public Athlete(int gripStrength) {
		// set the context of gripStrength to the instance of this class
		this.gripStrength = gripStrength;
	}
	
	// Simplify design by allowing more possible implementations of moveToCoordinate through Abstraction
	abstract String moveToCoordinate();
}
