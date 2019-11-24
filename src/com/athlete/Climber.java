package com.athlete;

public class Climber extends Athlete {
	private int gripStrength;
	private String gripStrengthDescription;
	private String coordinate;
	public Climber(int gripStrength, double routesClimbed) {
		super(gripStrength);
		this.gripStrength = gripStrength;
		setGripStrength(gripStrength);
	}
	
	public void setGripStrength(int num) {
		System.out.println("Grip strength is: " + gripStrength);
	}
	
	public String setGripStrength(String description) {
		System.out.println("Grip strength is: " + gripStrengthDescription);
		return gripStrengthDescription;
	}
	
	// Climber moves to a coordinate different from its base class.
	@Override
	public String moveToCoordinate() {
	coordinate = "37.990, 89.772";
	System.out.println(coordinate);
	return coordinate;
	}
}
