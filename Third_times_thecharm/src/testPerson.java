import java.util.ArrayList;

public class testPerson {

	public static void main(String args[]){

	ArrayList<Person> People = new ArrayList<Person>();
	Person bill;
	Pirate blackbeard;
	Student eugene;
	Employee april;
		
	bill = new Person("Bill", 123456789, 12, "Male", 6308675309, "10 Appleseed Lane, MI");
	blackbeard = new Pirate("Blackbeard", 999999999, 700, "Male", 0, "The Seven Seas", 250, "The Devil's Cutlass", 0.89, true);
	eugene = new Student("Eugene", 111111111, 22, "Gender Nonbinary", 3.4, "Mathematics", 1994);
	april = new Employee("April", 765432100, 19, "Female", "Parks", "Intern", 2008);
	
	People.add(bill);
	People.add(blackbeard);
	People.add(eugene);
	People.add(april);
		
	for (int i = 0; i < People.size(); i++){
		System.out.println(People.get(i).toString());
		System.out.println();
		}
	}
}

