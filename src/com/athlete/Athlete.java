package com.athlete;

public class Athlete {
	protected int gripStrength = 5;
	protected String coordinate = "37.989, 89.771";
	
	// parameterized constructor method
	public Athlete(int gripStrength) {
		this.gripStrength = gripStrength;
	}
	
	public void moveToCoordinate(){
		System.out.println("athlete");
	}
}