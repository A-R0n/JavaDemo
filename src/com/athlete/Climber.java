package com.athlete;

// Let climber inherit everything that defines an athlete
public class Climber extends Athlete {
	// Encapsulate private information into public methods
	private int gripStrength;
	private String gripStrengthDescription;
	public Climber(int gripStrength, double routesClimbed) {
		// Get access to athlete methods with super keyword
		super(gripStrength);
		this.gripStrength = gripStrength;
		setGripStrength(gripStrength);
	}
	
	public void setGripStrength(int num) {
		System.out.println("Grip strength is: " + gripStrength);
	}
	
	//  Demonstrate polymorphism through overloading as method with the same name accepts different parameters and behaves differently
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
