package com.bae.main;

import com.bae.vehicles.Boat;
import com.bae.vehicles.Car;
import com.bae.vehicles.Plane;
import com.bae.garage.*;

public class Runner {
	
	public static void main(String[] args) {
		
		Garage garage = new Garage();
		
		Car vroomVroom = new Car(4, "Gun Metal Grey", "1.2 litre", 0, false);
		Boat salmonCowell = new Boat(0, "White", "5 litre", 1, true, "Salmon Cowell", 3);
		Plane jet = new Plane(3, "Silver", "20 litre", 3, 3, 70, "JetCo");
	
//		garage.addVehicles(vroomVroom);
//		garage.addVehicles(salmonCowell);
		garage.addVehicles(jet);
		
//		garage.removesVehicles(jet);
		
		garage.printAll();
		
		garage.bill(jet);
	
	}

}
