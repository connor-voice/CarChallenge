package com.bae.vehicles;

public abstract class Vehicle {

	private int wheels = 4;
	private String paintColour = "";
	private String engineSize = "";

	private int id;
	
	public Vehicle(int wheels, String paintColour, String engineSize, int id) {
		super();
		this.wheels = wheels;
		this.paintColour = paintColour;
		this.engineSize = engineSize;
		this.id = id;
	}


	public abstract double calculateBill();
	

	public void setId(int id) {
		this.id = id;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getPaintColour() {
		return paintColour;
	}

	public void setPaintColour(String paintColour) {
		this.paintColour = paintColour;
	}

	public String getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}

	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Vehicle [wheels=" + wheels + ", paintColour=" + paintColour + ", engineSize=" + engineSize + ", id="
				+ id + "]";
	}
	
	
	
}
