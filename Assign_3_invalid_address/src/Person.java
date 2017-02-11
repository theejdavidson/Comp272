import java.util.*;

public class Person {
	
	//declares variables for person class
	private String name;
	private String social;
	private int age;
	private String gender;
	private String phoneNum;
	private ArrayList<Address> addresses;
	
	
	//  Constructor for Person object, simply assigns all fields
	public Person(String newName, String newSocial, int newAge, String newGender, String newPhone) {
		name = newName;
		social = newSocial;
		age = newAge;
		gender = newGender;
		phoneNum = newPhone;
		addresses = new ArrayList<Address>();
	}
	
	//Getter methods for returning name, social, age, gender, phone number, and address
		public String getName() {
			return name;
		}
		
		public String getSocial() {
			return social;
		}
		
		public int getAge() {
			return age;
		}
		
		public String getGender() {
			return gender;
		}
		public String getPhone() {
			return phoneNum;
		}
	//toString method returns name, social security num, age, gender, ect.
	public String toString(){
		return "Name: " + getName() + " // SSC Number: " + getSocial() + " // Age: " + getAge() + " // Gender: " + getGender() + " // Phone:  " + getPhone() + "\n";
	}
	//method allows person's attributes to be updated
	public void updatePerson(String newName, String newSocial, int newAge, String newGender, String newPhone) {
		name = newName;
		social = newSocial;
		age = newAge;
		gender = newGender;
		phoneNum = newPhone;
	}

	public ArrayList<Address> getAddresses() {
		return addresses;
	}

	public void setAddress(ArrayList<Address> address) {
		this.addresses = address;
	}
	public void addAddress(Address a) {
		addresses.add(a);
	}
}