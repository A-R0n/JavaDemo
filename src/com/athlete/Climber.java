package com.athlete;

import java.util.Set;
import java.util.HashSet;

import java.util.ArrayList;

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
public void climberList() {
	Set<String> climbers = new HashSet<String>();
	climbers.add("Sasha Digulian");
	climbers.add("Chris Sharma");
	climbers.add("Alex Megos");
	climbers.add("Alex Puccio");
	System.out.println(climbers);
	climberCheck(climbers);
}

public void climberCheck(ArrayList<String> climbers) {
		this.climbers = climbers;

		boolean containsSasha = climbers.contains("Sasha Digulian");
		for(var i = 0; i < climbers.length(); i++) {
			if(i.equals("1"))
				System.out.println("Sasha");
			else {
				System.out.println("Not Sasha");
			}
		}
}

	// Method follows Single Responsibility Principle
	public int setGripStrength(int num) {
		return num;
	}
	
	//  Demonstrate polymorphism through overriding
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
