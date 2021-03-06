public class Pirate extends Person {
	//includes number of villages pillaged, name of Ship, float var for cannonball accuracy, Boolean for parrot possessed
	
	private int villages;
	private String shipName;
	private float cannonAccuracy;
	private Boolean parrot;
	
	public Pirate(String name, int social, int age, String gender) {
		super(name, social, age, gender);
	}

	public int getVillages() {
		return villages;
	}

	public void setVillages(int villages) {
		this.villages = villages;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public float getCannonAccuracy() {
		return cannonAccuracy;
	}

	public void setCannonAccuracy(float cannonAccuracy) {
		this.cannonAccuracy = cannonAccuracy;
	}

	public Boolean getParrot() {
		return parrot;
	}

	public void setParrot(Boolean parrot) {
		this.parrot = parrot;
	}
	
}