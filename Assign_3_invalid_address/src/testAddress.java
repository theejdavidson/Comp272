import java.util.ArrayList;

public class testAddress {

	public static void main(String args[]){
	ArrayList<String> goodTests = new ArrayList<String>();
	int expectedSuccesses = 4;
//Declares variables for People to be used in array
	ArrayList<Person> people = new ArrayList<Person>();//initializes arrayList to consist of Person objects
	Person bill;
	Person ted = null;
	Person eugene =  null;
	Person annie = null;
	
		//creates person and subclass objects with defined instances of variables
	bill = new Person("Bill", "123456789", 12, "Male", "630-867-5309");
	//Adding good address
	try {
		Address goodAddress = new Address("519 West Jefferson Ave", null, "Naperville", "Il", "United States", 60540);
		bill.addAddress(goodAddress);
		goodTests.add("Successful Address Bill");
	} catch(InvalidAddressException e) {
		System.out.println("Fail: Address does not meet standards");
	}
	//Adding bad address
	try {
		Address badAddress = new Address("519 West Jefferson Ave", null, "Naperville", "Il", null, 60540);
		System.out.println("Fail: checkAddress method did not detect invalid address");
	} catch(InvalidAddressException e) {
		if(e.getMessage() == "Address missing country") {
		goodTests.add("checkAddress method caught bad address: null country");
		}
	}
	//Adding bad address
	try {
		Address badAddress = new Address("519 West Jefferson Ave", null, null, "Il", "USA", 60540);
		System.out.println("Fail: checkAddress method did not detect invalid address");
	} catch(InvalidAddressException e) {
		if(e.getMessage() == "Address missing city") {
			goodTests.add("checkAddress method caught bad address: null city");
		}
	}
	//Adding bad address
	try {
		Address badAddress = new Address(null, null, "Naperville", "Il", "USA", 60540);
		System.out.println("Fail: checkAddress method did not detect invalid address");
	} catch(InvalidAddressException e) {
		if(e.getMessage() == "Address missing street") {
			goodTests.add("checkAddress method caught bad address: null street");
		}	
	}
	//adds people to the arraylist
	people.add(bill);
	people.add(ted);
	people.add(eugene);
	people.add(annie);
		//for loop prints out toString methods for each person in arrayList
	for (int i = 0; i < people.size(); i++){
		//System.out.println(people.get(i).toString());
		System.out.println();
		}
	
	System.out.println("Successful tests completed: ");
	for(String testName : goodTests) {
		System.out.println("    " + testName);
	}
	if(expectedSuccesses == goodTests.size()){
		System.out.println("Success: all tests succeeded");
	}
	else {
		System.out.println("Fail: only " + goodTests.size() + " of " + expectedSuccesses + " tests succeeded.");
	}
	}
}