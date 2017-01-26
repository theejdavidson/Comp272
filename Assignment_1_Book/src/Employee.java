//includes department, job title, year of hire
public class Employee extends Person {
	
	private String dept;
	private String job;
	private int year;
	
	public Employee(String name, int social, int age, String gender) {
		super(name, social, age, gender);
	}
	
}