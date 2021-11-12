package com.bae.garage;

import java.util.ArrayList;
import com.bae.vehicles.Vehicle;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
//	private Car audi = new Car(4, "Gun Metal Grey", "1.2 litre", 0, false);
//	private Boat salmonCowell = new Boat(0, "White", "5 litre", 1, true, "Salmon Cowell", 3);
//	private Plane boeing = new Plane(3, "Silver", "20 litre", 3, 3, 70, "JetCo");
	
	
	
	public void addVehicles(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	public void removesVehicles(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}
	
	public void printAll() {
		for (Vehicle i : vehicles) {
			System.out.println(i);
		}
	}
	
	public void bill(Vehicle vehicle) {
		
		if (vehicle.getClass().getSimpleName().equals("Car")) {
			System.out.println("car successfull");
		} else if (vehicle.getClass().getSimpleName().equals("Boat")) {
			System.out.println("Boat");
		} else if (vehicle.getClass().getSimpleName().equals("Plane")) {
			System.out.println("Plane found");
		} else {
			System.out.println("Nothing found");
		}
	}
}
