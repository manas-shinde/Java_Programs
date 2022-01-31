package book;

public class Element {
	private Address data;
	private Element next;
	
	public Element(Address address) {
		this.data = address;
	}

	public Address getData() {
		return data;
	}

	public void setData(Address address) {
		this.data = address;
	}
	public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}
