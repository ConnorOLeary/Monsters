package monster.model;

public class MarshmallowMonster {
	//Declaration
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	public MarshmallowMonster() {
		//Unless we specify values all data members
		//are a zero, false, or null
		
	}
	
	public MarshmallowMonster(String name, int eyeCount, int arms, double tentaclesCount, boolean hasBloop) {
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = arms;
		this.tentacleAmount = tentaclesCount;
		this.hasBloop = hasBloop;
	}
	//Getters
	public String getName() {
		return name;
	}
	public int getArmCount() {
		return armCount;
	}
	public int getEyeCount() {
		return eyeCount;
	}
	public double getTentacleAmount() {
		return tentacleAmount;
	}
	public Boolean hasBloop() {
		return hasBloop;
	}
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setArms(int armCount) {
		this.armCount = armCount;
	}
	
	public void setEyes(int eyeCount) {
		this.eyeCount = eyeCount;
	}
	public void setTentacles(double tentacles) {
		this.tentacleAmount = tentacles;
	}
	public void setBloop(boolean hasBloop) {
		this.hasBloop = hasBloop;
	}
	
	
	//toString
	public String toString() {
		String description = "My name is " + name + " I have " + eyeCount + " eyes, " + armCount + " arms, " + tentacleAmount+ " tentacles, and I have a " + hasBloop+ " Boop count";
		
		return description;
		
	}
	

}
