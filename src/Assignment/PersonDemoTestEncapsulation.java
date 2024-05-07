package Assignment;

public class PersonDemoTestEncapsulation {

	public static void main(String[] args) {
		
		PersonDemoEncapsulation p1 = new PersonDemoEncapsulation();
				p1.setName("Abhir");
		        p1.setAge(12);
		        p1.setCountry("India");
		        System.out.println(p1.getName());
		        System.out.println(p1.getAge());
		        System.out.println(p1.getCountry());

	}

}
