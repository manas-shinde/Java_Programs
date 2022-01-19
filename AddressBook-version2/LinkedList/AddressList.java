package list;

import book.*;
import list.*;

public class AddressList {

	// Content of AddressList class (attribute)
	Address address;
	private Node head;
	private Node tail;
	private Node cur;

	// TODO: insert a address in node(data)
	public void insert(Address address) {
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
			tail = newNode;
			cur = newNode;

			currentNode.setNext(newNode);
			newNode.setPrev(currentNode);
			newNode.setNext(null);

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
		if (cur != null && cur.getPrev() != null) {
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
			while (currentNode.getNext() != null) {
				// System.out.println("--------------------------------------------");
				System.out.println("Index No : " + i);
				System.out.println(currentNode.getData());
				currentNode = currentNode.getNext();
				i++;
				System.out.println("--------------------------------------------");

			}
			System.out.println("Index No : " + i);
			System.out.println(currentNode.getData());
			System.out.println("********************************************");

		}
	}

	// TODO: Delete a Node with a specific index Number
	public void deleteNodeAt(int index) {
		// node is at first position
		Node node = head;
		// boolean flag = false;
		// loop through the linklist
		for (int i = 0; i < index - 1; i++) {// loop till index -1
			node = node.getNext();
		}

		// Now set that node next to deleting node next node
		node.setNext(node.getNext().getNext());
		node.getNext().getNext().setPrev(node);
		System.out.println("address of index " + index + " is deleted successfully !!");

	}

	// TODO: Search a address with a specific street name
	public void searchAddress(String searchStreet) {
		Address ad = new Address();
		boolean flag = false;
		Node currentNode = head;
		

		/*do {
			ad = cur.getData();
//			System.out.println(address);
			
			if (searchStreet == ad.getStreet()) {
				System.out.println(ad);

				flag = true;
				System.out.println("Address is found successfully!!");
				System.out.println("--------------------------------------------");
			}
			cur = cur.getNext();
		
		if (flag == false) {
			System.out.println("Address of street Name : " + searchStreet + " is Not found !!");
			}
		}while(cur.getNext() != null);
		
		while (cur.getNext() != null) {
			ad = cur.getData();
//			System.out.println(address);
			if (searchStreet == ad.getStreet()) {
				System.out.println(ad);

				flag = true;
				System.out.println("Address is found successfully!!");
				System.out.println("--------------------------------------------");
			}
			cur = cur.getNext();
		}
		if (flag == false) {
			System.out.println("Address of street Name : " + searchStreet + " is Not found !!");
		}*/
		
		
		
	}
}
