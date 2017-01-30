public class Pirate extends Person {
	//includes number of villages pillaged, name of Ship, float var for cannonball accuracy, Boolean for parrot possessed
	
	private int villages;
	private String shipName;
	private float cannonAccuracy;
	private Boolean parrot;
	
	public Pirate(int newVillage, String newShip, float newAccuracy, Boolean newParrot, String newName, int newSocial, int newAge, String newGender, int newPhone, String newAddress) {
		super(newName, newSocial, newAge, newGender, newPhone, newAddress);
		setVillages(newVillage);
		setShipName(newShip);
		setCannonAccuracy(newAccuracy);
		setParrot(newParrot);
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
	
	public String toString(){
		return super.toString() + " // Villages Pillaged: " + getVillages() + " // Ship name:" + getShipName() + " // Cannon firing accuracy: " + getCannonAccuracy() + " // Has parrot: " + getParrot() + "/n";
	}	
	
}