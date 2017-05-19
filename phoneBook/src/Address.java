
public class Address {

		
	private	String street;
	private	String city;
	private	String zipCode;
	private	String state;
	//Declare the strings

	public Address(){}

	public Address (String street, String city, String state, String zipCode){
		this.state = state;
		this.street  = street;
		this.zipCode = zipCode;
		this.city = city;
	}	

	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}// Getters and Setters gets the info from the user at runtime

	@Override
	public String toString() {
		return "Address [street=" + this.getStreet() + ", city=" + this.getCity() 
		+ ", zipCode=" + this.getZipCode() + ", state=" + this.getState() + "]";
	}// Overrides the default output 
	
	

	}


