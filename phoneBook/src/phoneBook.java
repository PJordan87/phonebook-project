import java.util.ArrayList;
import java.util.Scanner;

public class phoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//Creates new object
		ArrayList<Person>persons = new ArrayList<>();
		// Creates an array of Person objects
		int input = 0;
		do{
			System.out.println("Select Choice");
			System.out.println("1. Add new record");
			System.out.println("2. Delete Record");
			System.out.println("3. Update a record");
			System.out.println("4. Search for a first Name");
			System.out.println("5. Search for a last Name ");
			System.out.println("6. Search by telephone number");
			System.out.println("7. Search by City or State");
			System.out.println("8. Search by full name");
			System.out.println("9. Exit the program");
			// Prints output to the user

			// switch case
			input = sc.nextInt();
			switch (input) {

			case 1: 
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Please enter details in following format \n	"
					+ "John Doe, 114 Market St, St Louis, MO, 63403, 6366435698");
				String a = sc1.nextLine();
				//Set string to nextline
				String[] strings = a.split(",");
				//Splits string based on commas in the String
				System.out.println(strings[0]);
				//Prints out Strings at index of 0
				Person p1 = new Person();
				//Create person object
				String[] myString= strings[0].split(" ");
				String b="";
				for (int x = 0; x < myString.length-1; x++){
					b = b+ myString[x]+" ";
				}
				
				p1.setFirstName(myString[0]);
				p1.setMiddleName(b);
				p1.setLastName(myString[myString.length-1]);
				p1.setTelephoneNumber(strings[5]);
				
				Address address = new Address();
				//Create an address object
				address.setStreet(strings[1]);
				address.setCity(strings[2]);
				address.setState(strings[3]);
				address.setZipCode(strings[4]);
				p1.setAddress(address);
				//Pass address to p1
				System.out.println();
				
				persons.add(p1);
				// code to add new record.
				break;
			case 2:
				String input2 = sc.nextLine();
				
				int x =0;
				for (int i=0;i<persons.size();i++) {
					System.out.println("Telephone Number: "+persons.get(i).getTelephoneNumber());
					if (input2.equals(persons.get(i).getTelephoneNumber())){
						persons.remove(i);
					}
					x++; 
				}
				break;
			case 3: 	
				String input3 = sc.nextLine();
				
			default:
				System.out.println("Invalid Selection.");
				break;
			}
		}while (input != 9) ;

	}

}
