package com.bae.vehicles;

public class Boat extends Vehicle{

	private boolean hasPropeller;
	private String boatName;
	private int propellerCount;
	
	public Boat(int wheels, String paintColour, String engineSize, int id, boolean hasPropeller, String boatName,
			int propellerCount) {
		super(wheels, paintColour, engineSize, id);
		this.hasPropeller = hasPropeller;
		this.boatName = boatName;
		this.propellerCount = propellerCount;
	}

	public boolean isHasPropeller() {
		return hasPropeller;
	}

	public void setHasPropeller(boolean hasPropeller) {
		this.hasPropeller = hasPropeller;
	}

	public String getBoatName() {
		return boatName;
	}

	public void setBoatName(String boatName) {
		this.boatName = boatName;
	}

	public int getPropellerCount() {
		return propellerCount;
	}

	public void setPropellerCount(int propellerCount) {
		this.propellerCount = propellerCount;
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
