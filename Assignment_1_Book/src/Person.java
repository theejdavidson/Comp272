import java.util.ArrayList;

public class Person {
	
	
	private String name;
	private int social;
	private int age;
	private String gender;
	private ArrayList<Integer> phoneNum;	
	private ArrayList<String> address;
	
	//  Constructor for Person object, simply assigns all fields
	public Person(String name, int social, int age, String gender) {
		this.name = name;
		this.social = social;
		this.age = age;
		this.gender = gender;
		phoneNum = new ArrayList<Integer>();
		address = new ArrayList<String>();
		
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

	//toString method
	public String toString(){
		return "";
	}
	
	public void updatePerson(String newName, int newSocial, int newAge, String newGender) {
		name = newName;
		social = newSocial;
		age = newAge;
		gender = newGender;
	}
	public void addPhone(int newPhone) {
		phoneNum.add(newPhone);
	}
	public void removePhone(int newPhone) {
		phoneNum.remove(newPhone);
	}
	public void addAddress(String newAddress) {
		address.add(newAddress);
	}
	public void removeAddress(String newAddress) {
		address.remove(newAddress);
	}
}