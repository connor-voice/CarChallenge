package challenges;

public class Seat extends Vehicle {
	
	private String modelName = "";
	private int yearMade;
	private boolean madeByVw;
	
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getYearMade() {
		return yearMade;
	}
	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}
	public boolean isMadeByVw() {
		return madeByVw;
	}
	public void setMadeByVw(boolean madeByVw) {
		this.madeByVw = madeByVw;
	}
	
	public void printAll() {
		System.out.println("-".repeat(40) + "Seat" + "-".repeat(40));
		System.out.println(modelName);
		System.out.println(yearMade);
		System.out.println(madeByVw);
	}

}
