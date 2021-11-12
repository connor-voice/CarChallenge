package com.bae.vehicles;

public class Car extends Vehicle {
	
	private boolean sunRoof;

	public boolean isSunRoof() {
		return sunRoof;
	}

	public void setSunRoof(boolean sunRoof) {
		this.sunRoof = sunRoof;
	}

	public Car(int wheels, String paintColour, String engineSize, int id, boolean sunRoof) {
		super(wheels, paintColour, engineSize, id);
		this.sunRoof = sunRoof;
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
