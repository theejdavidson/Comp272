public class Student extends Person {
	//includes GPA, major, graduation year
	private float gpa;
	private String major;
	private int gradYear;
	
	
	public Student(float newGpa, String newMajor, int newGradYear, String newName, int newSocial, int newAge, String newGender, int newPhone, String newAddress) {
		super(newName, newSocial, newAge, newGender, newPhone, newAddress);
		setGpa(newGpa);
		setMajor(newMajor);
		setGradYear(newGradYear);
	}


	public float getGpa() {
		return gpa;
	}


	public void setGpa(float gpa) {
		this.gpa = gpa;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public int getGradYear() {
		return gradYear;
	}


	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}
	
	public String toString(){
		return super.toString() + " // GPA: " + getGPA() + " // Major:" + getMajor() + " // Graduation Year: " + getGradYear() + "/n";
	}	
	
}