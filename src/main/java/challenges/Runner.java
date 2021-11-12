package challenges;

public class Runner {
	
	public static void main(String[] args) {
/////////////////////////////SEAT/////////////////////////////////////////	
		Seat leon = new Seat();
		
		leon.setEngineSize("1.2 litre");
		leon.setPaintColour("Gun metal grey");
		leon.setWheels(4);
		leon.setMadeByVw(true);
		leon.setModelName("Leon 1.2");
		leon.setYearMade(2020);
		leon.printAll();
		System.out.println(leon.getEngineSize());
		System.out.println(leon.getPaintColour());
		System.out.println(leon.getWheels());
		
		
/////////////////////////////VOLKSWAGEN////////////////////////////////////		
		Volkswagen golf = new Volkswagen();
		
		golf.setEngineSize("1.6 litre");
		golf.setPaintColour("Ocean Blue");
		golf.setWheels(4);
		golf.setTurboCount(2);
		golf.setStyleOutOfTen(8);
		golf.setModern(true);
		golf.printAll();
		System.out.println(golf.getEngineSize());
		System.out.println(golf.getPaintColour());
		System.out.println(golf.getWheels());
		
		
/////////////////////////////ROBIN///////////////////////////////////////
		Robin reliant = new Robin();
		
		reliant.setEngineSize("0.2 litre");
		reliant.setPaintColour("Blue");
		reliant.setWheels(3);
		reliant.setCanTip(true);
		reliant.setClassicCar(true);
		reliant.setNickname("The Mr Bean Rival");
		reliant.printAll();
		System.out.println(reliant.getEngineSize());
		System.out.println(reliant.getPaintColour());
		System.out.println(reliant.getWheels());
	}

}
