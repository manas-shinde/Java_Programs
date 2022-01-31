package list;

import book.*;

class Node {

	private Address data;
	private Node next;
	private Node prev;
 
	public Node(Address address) {
		this.data = address;
	}

	public Address getData() {
		return data;
	}

	public void setData(Address address) {
		this.data = address;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}
}
