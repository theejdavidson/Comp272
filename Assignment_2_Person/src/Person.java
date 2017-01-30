import java.util.ArrayList;

public class Person {
	
	
	private String name;
	private int social;
	private int age;
	private String gender;
	private int phoneNum;	
	private String address;
	
	//  Constructor for Person object, simply assigns all fields
	public Person(String name, int social, int age, String gender, int phoneNum, String address) {
		this.name = name;
		this.social = social;
		this.age = age;
		this.gender = gender;
		this.phoneNum = phoneNum;
		this.address = address;
		
	}
	
	//Getter method for returning name
		public String getName() {
			return name;
		}
		
		//Getter method for returning social security number
		public int getSocial() {
			return social;
		}
		
		public int getAge() {
			return age;
		}
		
		public String getGender() {
			return gender;
		}
		public int getPhone() {
			return phoneNum;
		}
		public String getAddress() {
			return address;
		}

	//toString method
	public String toString(){
		return "Name: " + getName() + " // SSC Number: " + getSocial() + " // Age: " + getAge() + " // Gender: " + getGender() + " // Phone:  " + getPhone() + " // Address: " + getAddress() + "\n";
	}
	
	public void updatePerson(String newName, int newSocial, int newAge, String newGender, int newPhone, String newAddress) {
		name = newName;
		social = newSocial;
		age = newAge;
		gender = newGender;
		phoneNum = newPhone;
		address = newAddress;
	}
}