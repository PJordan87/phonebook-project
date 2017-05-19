import java.util.ArrayList;

public class Applications {
	
	public static void main() {

		phoneBook phonebook = new phoneBook();
		ArrayList<Person>persons = new ArrayList<>();
		
		Person p1 = new Person();
		p1.setFirstName("John");
		p1.setMiddleName("");
		p1.setLastName("Doe");
		p1.setTelephoneNumber("6366435698");		
		persons.add(p1);
		
		Person p2 = new Person();
		p2.setFirstName("John");
		p2.setMiddleName("E");
		p2.setLastName("Doe");
		p2.setTelephoneNumber("8475390126");
		persons.add(p2);
		
		Person p3 = new Person();
		p3.setFirstName("John");
		p3.setMiddleName("Michael West");
		p3.setLastName("Doe");
		p3.setTelephoneNumber("5628592375");
		persons.add(p3);
		
		//phonebook.setPersons(persons);

	}
	

}
