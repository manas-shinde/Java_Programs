package book;
public class Address {
//	Address class attributes
	private String street;
	private String city;
	private String state;
	private int zipcode;

	public Address() {// Default constructor
		street = "null";
		city = "null";
		state = "null";
		zipcode = 000000;
	}

	public Address(String street, String state, String city, int zipcode) {// parameterized constructor
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	// TODO:setters

	/*
	 * public void setStreet(String tempStreet){ { street = tempStreet; } public
	 * void setCity(String tempCity){ city = tempCity; } public void setState(String
	 * tempState){ state = tempState; } public void setZipcode(int tempZipcode){
	 * zipcode = tempZipcode; }
	 */

//	 TODO:getters

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getZipcode() {
		return zipcode;
	}

	// TODO: To print object
	/*
	 * public void toString(){
	 * System.out.println("--------------------------------------------");
	 * System.out.println("Street Name :"+this.street+"\n "+"City : "+this.
	 * city+"\n "+"State : "+this.state+"\t "+"Zipcode : "+this.zipcode);
	 * System.out.println("--------------------------------------------"); }
	 */
//	Over-ride toString method of Object class
	public String toString() {
		return "--------------------------------\nStreet Name :" + this.street + "\n " + "City : " + this.city + "\n " + "State : " + this.state + "\n "
				+ "Zipcode : " + this.zipcode+"\n-------------------------------";
	}

}
