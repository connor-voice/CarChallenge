package com.bae.vehicles;

public class Plane extends Vehicle {

	private int jetCount;
	private double wingSpan;
	private String jetBrand;

	///////////////////////////////////CONSTRUCTOR METHOD////////////////////////////////////////////
	public Plane(int wheels, String paintColour, String engineSize, int id, int jetCount, double wingSpan,
			String jetBrand) {
		super(wheels, paintColour, engineSize, id);
		this.jetCount = jetCount;
		this.wingSpan = wingSpan;
		this.jetBrand = jetBrand;
	}

	public int getJetCount() {
		return jetCount;
	}

	public void setJetCount(int jetCount) {
		this.jetCount = jetCount;
	}

	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}

	public String getJetBrand() {
		return jetBrand;
	}

	public void setJetBrand(String jetBrand) {
		this.jetBrand = jetBrand;
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		return 0;
	}

}
