package starAgileAssignment;

public class TestPerson {

	public static void main(String[] args) {
		System.out.println("**child object & child ref*****");
		DetailsPerson d1 = new DetailsPerson();
		d1.name();
		d1.age();
		d1.cityName();
		d1.zipCode();
		
		System.out.println("**child object & parent(person) ref*****");
		Person p1 = new DetailsPerson();
		p1.name();
		p1.age();
		
		
		System.out.println("**child object & parent(address) ref*****");
		Address a1 = new DetailsPerson();
		d1.cityName();
		d1.zipCode();

	}

}
