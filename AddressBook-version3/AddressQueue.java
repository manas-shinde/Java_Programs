
package book;
import java.util.*;
public class AddressQueue {
	// Content of AddressList class (attribute)
	Address address;
	private Element frontElement;
	private Element rearElement;

//TODO: Add address to queue
	public void enqueue(Address address) {

		Element newElement = new Element(address);

		if (frontElement == null && rearElement == null) {
			frontElement = newElement;
			rearElement = newElement;

			System.out.println("Address is successfully inserted!!");
			System.out.println("--------------------------------------------");
		} else {

			rearElement.setNext(newElement);
			newElement.setNext(null);
			rearElement = newElement;

			System.out.println("Address is successfully inserted!!");
			System.out.println("--------------------------------------------");
		}
	}

//TODO: Remove address to queue
	public void dequeue() {
		Element removeElement;
		if (frontElement == null && rearElement == null) {
			System.out.println("Address Book dont contains any address!!");
		} else if (frontElement == rearElement) {
			System.out.println(frontElement.getData());
			frontElement = null;
			rearElement = null;
			System.out.println("Address deleted successfully!!");
		} else {
			System.out.println(frontElement.getData());
			removeElement = frontElement;
			frontElement = frontElement.getNext();
			removeElement.setNext(null);
			System.out.println("Address deleted successfully!!");
		}
	}

//TODO: Display front element of queue
	public void displayFirstAddress() {
		if (frontElement == null && rearElement == null) {
			System.out.println("Address Book dont contains any address!!");
		} else {
			System.out.println("--------------------------------------------");
			System.out.println("First Address : ");
			System.out.println(frontElement.getData());
			System.out.println("--------------------------------------------");
		}
	}

//TODO: Display rear element of queue
	public void displayLastAddress() {
		if (frontElement == null && rearElement == null) {
			System.out.println("Address Book dont contains any address!!");
		} else {
			System.out.println("--------------------------------------------");
			System.out.println("Last Address : ");
			System.out.println(rearElement.getData());
			System.out.println("--------------------------------------------");
		}
	}

//TODO: Display all element of queue
	public void displayQueue() {
		int i = 0;
		if (frontElement == null && rearElement == null) {
			System.out.println("Queue dont contains any element!!");
		} else {
			Element currentElement = frontElement;
			System.out.println("********************************************");
			while (currentElement.getNext() != null) {

				System.out.println("Index No : " + i);
				System.out.println(currentElement.getData());
				currentElement = currentElement.getNext();
				i++;
				System.out.println("--------------------------------------------");

			}
			System.out.println("Index No : " + i);
			System.out.println(currentElement.getData());
			System.out.println("********************************************");
		}
	}

//FIXME: Search Methods
	public void searchAddressByStreet(String streetNameToSearch) {
		address = new Address();
		boolean streetFound = false;
		Element currentElement = frontElement;

		while (currentElement.getData() != null) {
			address = currentElement.getData();

			if (streetNameToSearch.equals(address.getStreet())) {
				System.out.println("Address is found !!");
				System.out.println("--------------------------------------------");
				System.out.println(address);

				streetFound = true;
				
			}
			currentElement = currentElement.getNext();
		}
		if (!streetFound) {
			System.out.println("Address of street Name : " + streetNameToSearch + " is Not found !!");
		}
	}

	public void searchAddressByState(String stateNameToSearch) {
		address = new Address();
		boolean streetFound = false;
		Element currentElement = frontElement;

		while (currentElement.getData() != null) {
			address = currentElement.getData();

			if (stateNameToSearch.equals(address.getState())) {
				System.out.println("Address is found !!");
				System.out.println("--------------------------------------------");
				System.out.println(address);

				streetFound = true;
				
			}
			currentElement = currentElement.getNext();
		}
		if (!streetFound) {
			System.out.println("Address of state Name : " + stateNameToSearch + " is Not found !!");
		}
	}

	public void searchAddressByCity(String cityNameToSearch) {
		address = new Address();
		boolean streetFound = false;
		Element currentElement = frontElement;

		while (currentElement.getData() != null) {
			address = currentElement.getData();

			if (cityNameToSearch.equals(address.getCity())) {
				System.out.println("Address is found !!");
				System.out.println("--------------------------------------------");
				System.out.println(address);

				streetFound = true;
				
			}
			currentElement = currentElement.getNext();
		}
		if (!streetFound) {
			System.out.println("Address of city Name : " + cityNameToSearch + " is Not found !!");
		}
	}

	public void searchAddressByZipcode(int zipcodeToSearch) {
		address = new Address();
		boolean streetFound = false;
		Element currentElement = frontElement;

		while (currentElement.getData() != null) {
			address = currentElement.getData();

			if (zipcodeToSearch == address.getZipcode()) {
				System.out.println("Address is found !!");
				System.out.println("--------------------------------------------");
				System.out.println(address);

				streetFound = true;
				
			}
			currentElement = currentElement.getNext();
		}
		if (!streetFound) {
			System.out.println("Address of state Name : " + zipcodeToSearch + " is Not found !!");
		}
	}
	public void searchAddressByIndex(int indexNo) {
		
	}
//FIXME: update method
	public void updateAddressByIndex(int  indexNo) {
		Scanner sc = new Scanner(System.in);
		address = new Address();
		int updatedZipcode, choice;
		String updatedStreet, updatedState, updatedCity;
		
		Element currentElement = frontElement;

		for (int j = 0; j < indexNo - 1; j++) {
			currentElement = currentElement.getNext();
		}

		System.out.println("Which field do want to update \t1.street \t2.state\t3.city \t4.zipcode");
		choice = sc.nextInt();
		address = currentElement.getData();
		
		switch (choice) {
		case 1:
			System.out.println("Enter Street Name :");
			updatedStreet = sc.next();

			address.setStreet(updatedStreet);
			System.out.println("Street Name is updated !!!");

			break;
		case 2:
			System.out.println("Enter State Name :");
			updatedState = sc.next();

			address.setState(updatedState);
			System.out.println("State Name is updated !!!");
			
			break;
		case 3:
			System.out.println("Enter City Name :");
			updatedCity = sc.next();
			
			address.setCity(updatedCity);
			System.out.println("City Name is updated !!!");
			
			break;
		case 4:
			System.out.println("Enter zip code:");
			updatedZipcode = sc.nextInt();
			
			address.setZipcode(updatedZipcode);
			System.out.println("zip-code is updated !!!");
			
			break;
		}
		sc.close();
	
	}
}
