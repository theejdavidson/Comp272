
public class Address {
	
	private String street;
	private String aptNum;
	private String city;
	private String state;
	private String country;
	private int zip;
	
	public Address(String newStreet, String newApt, String newCity, String newState, String newCountry, int newZip) throws InvalidAddressException {
		street = newStreet;
		aptNum = newApt;
		city = newCity;
		state = newState;
		country = newCountry;
		zip = newZip;
		checkAddress();
	}
	public String getAptNum() {
		return aptNum;
	}
	public void setAptNum(String aptNum) {
		this.aptNum = aptNum;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public void checkAddress() throws InvalidAddressException {
		if (street == null) {
				throw new InvalidAddressException("Address missing street");
		}
		else if(city == null) {
			throw new InvalidAddressException("Address missing city");
		}
		else if(country == null) {
			throw new InvalidAddressException("Address missing country");
		}
	}

}
