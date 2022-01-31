package list;

import java.util.*;
import book.*;
import java.util.*;

public class AddressList {

	// Content of AddressList class (attribute)
	private Address address;
	private Node head;
	private Node tail;
	private Node cur;

//	TODO:Insert Node at particular position
	public void insertAt(Address address) {
		Node nodeToBeInserted = new Node(address);
		if (head == null) {
			head = nodeToBeInserted;
			tail = nodeToBeInserted;
			cur = nodeToBeInserted;
		} else{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Index which you want to add address :");
			int indexNo = sc.nextInt();
			if(indexNo == 0) {
				nodeToBeInserted.setNext(head);
				nodeToBeInserted.setPrev(null);
			}else {
				Node cur = head;
				for (int i = 0; i < indexNo - 1; i++) {
					cur = cur.getNext();
				}
				nodeToBeInserted.setNext(cur.getNext());
				nodeToBeInserted.setPrev(cur);
				cur.setNext(nodeToBeInserted);
				
			}
		}
		System.out.println("Address is successfully inserted!!");
		System.out.println("--------------------------------------------");

	}

// TODO: insert a address in node(data)
	public void appendAddress(Address address) {
		// first create a new node
		Node newNode = new Node(address);
		// if there is 'NO' node in list then the new node is head node
		if (this.head == null) {
			head = newNode;
			cur = newNode;
			tail = newNode;

			System.out.println("Address is successfully inserted!!");
			System.out.println("--------------------------------------------");
		} else {
			// current Node is first node
			Node currentNode = head;
			// loop until last node
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			} /*
				 * when you reach to last node then connect last node -next> to new node and new
				 * node -prev> to last node
				 */
			

			currentNode.setNext(newNode);
			newNode.setPrev(currentNode);
			newNode.setNext(null);
			tail = newNode;
			cur = newNode;

			System.out.println("Address is successfully inserted!!");
			System.out.println("--------------------------------------------");

		}
	}

	// Get Current Node
	public Address getCurrentNode() {
		if (cur != null) {

			return cur.getData();
		}
		return null;
	}

//	Get next Node
	public Address getNextNode() {
		if (cur != null && cur.getNext() != null) {
			cur = cur.getNext();
			return cur.getData();
		}
		return null;
	}

// Get Prev Node
	public Address getPrevNode() {
		if (cur.getPrev() != null && cur != null ) {
			cur = cur.getPrev();
			return cur.getData();
		}
		return null;
	}

	// TODO: to display collection of nodes
	public void display() {
		int i = 0;
		if (head != null) {
			// consider current node is head node
			Node currentNode = head;
			System.out.println("********************************************");
			while (currentNode != null) {
				System.out.println("Index No : " + i);
				System.out.println(currentNode.getData());
				currentNode = currentNode.getNext();
				i++;
			}
			System.out.println("********************************************");

		}else {
			System.out.println("Address are not present in AddressBook!! ");
		}
	}
//TODO: DELETE methods
	public void deleteAddressByStreet(String streetName) {
		address = new Address();
		boolean streetFound = false;
		cur = head;

		while (cur != null) {

			address = cur.getData();

			if (streetName.equals(address.getStreet())) {

				System.out.println("Address Found ");
				System.out.println(address);

				streetFound = true;

				if (head == tail) {// Only Node
					head.setData(null);
				} else if (cur.getNext() == null) {// Last Node
					Node temp = cur.getPrev();
					tail = temp;
					tail.setNext(null);

					cur.setData(null);
					cur.setNext(null);
					cur.setPrev(null);
				} else if (cur.getPrev() == null) {// First Node
					Node temp = cur.getNext();
					head = temp;

					cur.setData(null);
					cur.setPrev(null);
					cur.setNext(null);

				} else {// in-between Node
					Node prevNode = cur.getPrev();
					Node nextNode = cur.getNext();

					prevNode.setNext(nextNode);
					nextNode.setPrev(prevNode);

					cur.setData(null);
					cur.setNext(null);
					cur.setPrev(null);

				}

			}
			cur = cur.getNext();

		}
		if (!streetFound) {
			System.out.println("Address of street Name : " + streetName + " is Not found !!");
		}

	}

	public void deleteAddressByState(String stateName) {
		address = new Address();
		boolean stateFound = false;
		cur = head;

		while (cur != null) {

			address = cur.getData();

			if (stateName.equals(address.getState())) {

				System.out.println("Address Found ");
				System.out.println(address);

				stateFound = true;

				if (head == tail) {// Only Node
					head.setData(null);

				} else if (cur.getNext() == null) {// Last Node
					Node temp = cur.getPrev();
					tail = temp;
					tail.setNext(null);

					cur.setData(null);
					cur.setNext(null);
					cur.setPrev(null);

				} else if (cur.getPrev() == null) {// First Node
					Node temp = cur.getNext();
					head = temp;
					cur.setData(null);
					cur.setPrev(null);
					cur.setNext(null);

				} else {// in-between Node
					Node prevNode = cur.getPrev();
					Node nextNode = cur.getNext();

					prevNode.setNext(nextNode);
					nextNode.setPrev(prevNode);

					cur.setData(null);
					cur.setNext(null);
					cur.setPrev(null);

				}

			}
			cur = cur.getNext();

		}
		if (!stateFound) {
			System.out.println("Address of street Name : " + stateName + " is Not found !!");
		}
	}

	public void deleteAddressByCity(String cityName) {
		address = new Address();
		boolean cityFound = false;
		cur = head;

		while (cur != null) {

			address = cur.getData();

			if (cityName.equals(address.getCity())) {

				System.out.println(address);
				System.out.println("Address Found  And deleted !!");
				cityFound = true;

				if (head == tail) {// Only Node
					head.setData(null);

				} else if (cur.getNext() == null) {// Last Node
					Node temp = cur.getPrev();
					tail = temp;
					tail.setNext(null);
					cur.setData(null);
					cur.setNext(null);
					cur.setPrev(null);

				} else if (cur.getPrev() == null) {// First Node
					Node temp = cur.getNext();
					head = temp;
					cur.setData(null);
					cur.setPrev(null);
					cur.setNext(null);

				} else {// in-between Node
					Node prevNode = cur.getPrev();
					Node nextNode = cur.getNext();

					prevNode.setNext(nextNode);
					nextNode.setPrev(prevNode);

					cur.setData(null);
					cur.setNext(null);
					cur.setPrev(null);

				}

			}
			cur = cur.getNext();

		}
		if (!cityFound) {
			System.out.println("Address of street Name : " + cityName + " is Not found !!");
		}
	}

	public void deleteAddressByZipcode(int zipcode) {
		address = new Address();
		boolean zipcodeFound = false;
		cur = head;

		while (cur != null) {

			address = cur.getData();

			if (zipcode == address.getZipcode()) {

				System.out.println(address);
				zipcodeFound = true;

				if (head == tail) {// Only Node
					head.setData(null);
					System.gc();
					System.runFinalization();
				} else if (cur.getNext() == null) {// Last Node

					Node temp = cur.getPrev();
					tail = temp;
					tail.setNext(null);

					cur.setData(null);
					cur.setNext(null);
					cur.setPrev(null);

				} else if (cur.getPrev() == null) {// First Node
					Node temp = cur.getNext();
					head = temp;
					cur.setData(null);
					cur.setPrev(null);
					cur.setNext(null);

				} else {// in-between Node
//					Node prevNode = cur.getPrev();
//					Node nextNode = cur.getNext();

					cur.getPrev().setNext(cur.getNext());
					cur.getNext().setPrev(cur.getPrev());
					
//					prevNode.setNext(nextNode);
//					nextNode.setPrev(prevNode);

					cur.setData(null);
					cur.setNext(null);
					cur.setPrev(null);

				}
				System.out.println("----------------------Address Found  And deleted !!-----------------------------");
			}
			cur = cur.getNext();

		}
		if (!zipcodeFound) {
			System.out.println("Address of street Name : " + zipcode + " is Not found !!");
		}
	}

	public void deleteAddressByIndex(int indexNo) {
		// node is at first position
		Node node = head;
		// boolean flag = false;
		// loop through the linklist
		for (int i = 0; i <= indexNo - 1; i++) {// loop till index -1
			node = node.getNext();
		}

		// Now set that node next to deleting node next node
		if (node.getNext() == null) {
			tail = node;
			node.setNext(null);
		} else {
			Node prevNode = node.getPrev();
			Node nextNode = node.getNext();

			prevNode.setNext(nextNode);
			nextNode.setPrev(prevNode);

			node.setData(null);
			node.setNext(null);
			node.setPrev(null);
		}

		System.out.println("address of index " + indexNo + " is deleted successfully !!");

	}
//	FIXME:Folowed methods used for search

	// TODO: Search a address with a specific street name
	public void searchAddressByStreet(String searchStreet) {
		Address ad = new Address();
		boolean streetFound = false;
		cur = head;

		while (cur != null) {
			ad = cur.getData();
			if (searchStreet.equals(ad.getStreet())) {
				System.out.println("--------------------Address is found !!------------------------");

				System.out.println(ad);

				streetFound = true;

			}
			cur = cur.getNext();
		}
		if (!streetFound) {
			System.out.println("Address of street Name : " + searchStreet + " is Not found !!");
		}
	}

// TODO: Search a address with a specific state name
	public void searchAddressByState(String searchState) {
		address = new Address();
		boolean stateFound = false;
		cur = head;

		while (cur != null) {
			address = cur.getData();

			if (searchState.equals(address.getState())) {
				System.out.println("--------------------Address is found !!------------------------");

				System.out.println(address);

				stateFound = true;

			}
			cur = cur.getNext();
		}
		if (!stateFound) {
			System.out.println("Address of state Name : " + searchState + " is Not found !!");
		}
	}

// TODO: Search a address with a specific city name
	public void searchAddressByCity(String searchCity) {
		address = new Address();
		boolean cityFound = false;
		cur = head;

		while (cur != null) {
			address = cur.getData();
			if (searchCity.equals(address.getCity())) {
				System.out.println("--------------------Address is found !!------------------------");

				System.out.println(address);

				cityFound = true;

			}
			cur = cur.getNext();
		}
		if (!cityFound) {
			System.out.println("Address of City Name : " + searchCity + " is Not found !!");
		}
	}

// TODO: Search a address with a specific zipcode
	public void searchAddressByZipcode(int tempZipcode) {
		address = new Address();
		boolean zipcodeFound = false;
		cur = head;

		while (cur!= null) {
			address = cur.getData();
			if (tempZipcode == address.getZipcode()) {
				
				System.out.println("--------------------Address is found !!------------------------");

				System.out.println(address);

				zipcodeFound = true;

			}
			cur = cur.getNext();
		}
		if (!zipcodeFound) {
			System.out.println("Address of Zipcode : " + tempZipcode + " is Not found !!");
		}
	}

// TODO: Search a address with a specific index no
	public void searchAddressByIndex(int indexNo) {
		cur = head;

		// loop through the linklist
		for (int i = 0; i < indexNo - 1; i++) {// loop till index -1
			cur = cur.getNext();
		}
		System.out.println("--------------Index No -"+indexNo+"-----------------------------");
		System.out.println(cur.getData());
		System.out.println("--------------------------------------------");
	}

//FIXME: Update method
	public void updateAddressByIndex(int updateIndex) {
		Scanner sc = new Scanner(System.in);
		Address newAddress ;
		address = new Address();
		int updatedZipcode, choiceToUpdateField;
		String updatedStreet, updatedState, updatedCity;
		cur = head;
		try {
			
			for (int j = 0; j < updateIndex - 1; j++) {
				cur = cur.getNext();
			}
			System.out.println("Which field do want to update \t1.street \t2.state\t3.city \t4.zipcode");
			choiceToUpdateField = sc.nextInt();
			if(cur.getNext()!= null) {
				cur  =cur.getNext();
			}
			address = cur.getData();

			switch (choiceToUpdateField) {
			case 1:
				System.out.println("Enter Updated Street Name :");
				updatedStreet = sc.next();

//				address.setStreet(updatedStreet);
				
				newAddress = new Address(updatedStreet,address.getState(),address.getCity(),address.getZipcode());
				Node nn = new Node(newAddress);
				if(cur.getNext() == null) {
					cur.getPrev().setNext(nn);
					nn.setPrev(cur.getPrev());
					nn.setNext(null);
					tail = nn;
				}else {
					cur.getPrev().setNext(nn);
					cur.getNext().setPrev(nn);
					nn.setNext(cur.getNext());
					nn.setPrev(cur.getPrev());
					
					cur.setData(null);
					cur.setNext(null);
					cur.setPrev(null);
				}
				System.out.println("Street Name is updated !!!");
				break;
			case 2:
				System.out.println("Enter State Name :");
				updatedState = sc.next();
				
//				address.setState(updateState);
				
				newAddress = new Address(address.getStreet(),updatedState,address.getCity(),address.getZipcode());
				 nn = new Node(newAddress);
				if(cur.getNext() == null) {
					cur.getPrev().setNext(nn);
					nn.setPrev(cur.getPrev());
					nn.setNext(null);
					tail = nn;
				}else {
					cur.getPrev().setNext(nn);
					cur.getNext().setPrev(nn);
					nn.setNext(cur.getNext());
					nn.setPrev(cur.getPrev());
					
					cur.setData(null);
					cur.setNext(null);
					cur.setPrev(null);
				}
				System.out.println("State Name is updated !!!");
				
				break;
			case 3:
				System.out.println("Enter City Name :");
				updatedCity = sc.next();
				
//				address.setCity(updatedCity);
				
				newAddress = new Address(address.getStreet(),address.getState(),updatedCity,address.getZipcode());
				 nn = new Node(newAddress);
				if(cur.getNext() == null) {
					cur.getPrev().setNext(nn);
					nn.setPrev(cur.getPrev());
					nn.setNext(null);
					tail = nn;
				}else {
					cur.getPrev().setNext(nn);
					cur.getNext().setPrev(nn);
					nn.setNext(cur.getNext());
					nn.setPrev(cur.getPrev());
					
					cur.setData(null);
					cur.setNext(null);
					cur.setPrev(null);
				}
				System.out.println("City Name is updated !!!");
				
				break;
			case 4:
				System.out.println("Enter zip code:");
				updatedZipcode = sc.nextInt();
				
//				address.setZipcode(updatedZipcode);
				
				newAddress = new Address(address.getStreet(),address.getState(),address.getCity(),updatedZipcode);
				 nn = new Node(newAddress);
				if(cur.getNext() == null) {
					cur.getPrev().setNext(nn);
					nn.setPrev(cur.getPrev());
					nn.setNext(null);
					tail = nn;
				}else {
					cur.getPrev().setNext(nn);
					cur.getNext().setPrev(nn);
					nn.setNext(cur.getNext());
					nn.setPrev(cur.getPrev());
					
					cur.setData(null);
					cur.setNext(null);
					cur.setPrev(null);
				}
				System.out.println("zip-code is updated !!!");
				
				break;
			}
		} catch (NullPointerException e) {
			System.out.println("Index Not Found!!");
		}		
	}
}
