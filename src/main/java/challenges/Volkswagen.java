package challenges;

public class Volkswagen extends Vehicle {
	
	private int styleOutOfTen;
	private int turboCount;
	private boolean isModern;
	
	
	public int getStyleOutOfTen() {
		return styleOutOfTen;
	}
	public void setStyleOutOfTen(int styleOutOfTen) {
		this.styleOutOfTen = styleOutOfTen;
	}
	public int getTurboCount() {
		return turboCount;
	}
	public void setTurboCount(int turboCount) {
		this.turboCount = turboCount;
	}
	public boolean isModern() {
		return isModern;
	}
	public void setModern(boolean isModern) {
		this.isModern = isModern;
	}
	
	public void printAll() {
		System.out.println("-".repeat(40) + "Volkswagen" + "-".repeat(40));
		System.out.println(styleOutOfTen);
		System.out.println(turboCount);
		System.out.println(isModern);
	}

}
