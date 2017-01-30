//includes department, job title, year of hire
public class Employee extends Person {
	
	private String dept;
	private String job;
	private int year;
	
	public Employee(String newDept, String newJob, int newYear, String newName, int newSocial, int newAge, String newGender, int newPhone, String newAddress) {
		super(newName, newSocial, newAge, newGender, newPhone, newAddress);
		setDept(newDept);
		setJob(newJob);
		setYear(newYear);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public String toString(){
		return super.toString() + " // Job Department: " + getDept() + " // Job Title: " + getJob() + " // Year hired: " + getYear();
	}
}