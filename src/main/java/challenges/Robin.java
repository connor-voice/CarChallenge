package challenges;

public class Robin extends Vehicle {

	private boolean canTip;
	private boolean classicCar;
	private String nickname = "";
	
	public boolean isCanTip() {
		return canTip;
	}
	public void setCanTip(boolean canTip) {
		this.canTip = canTip;
	}
	public boolean isClassicCar() {
		return classicCar;
	}
	public void setClassicCar(boolean classicCar) {
		this.classicCar = classicCar;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public void printAll() {
		System.out.println("-".repeat(40) + "Robin" + "-".repeat(40));
		System.out.println(canTip);
		System.out.println(classicCar);
		System.out.println(nickname);
	}
	
}
