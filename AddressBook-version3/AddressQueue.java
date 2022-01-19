
package book;
public class AddressQueue {
		// Content of AddressList class (attribute)
		Address address;
		private Element frontElement;
		private Element rearElement;
	
		
		
		public void addElementToQueue(Address address) {
		
			Element newElement = new Element(address);
			
			if(frontElement ==null && rearElement==null) {
				frontElement = newElement;
				rearElement = newElement;
				
				System.out.println("Address is successfully inserted!!");
	            System.out.println("--------------------------------------------");
			}else {
				
				rearElement.setNext(newElement);
				newElement.setNext(null);
				rearElement = newElement;

				System.out.println("Address is successfully inserted!!");
	            System.out.println("--------------------------------------------");
			}
		}
		public void removeElementFromQueue() {
			Element removeElement;
			if(frontElement  == null && rearElement == null){
				System.out.println("Address Book dont contains any address!!");
			}else if(frontElement == rearElement){
				System.out.println(frontElement.getData());
				frontElement = null;
				rearElement = null;
				System.out.println("Address deleted successfully!!");
			}else{
				System.out.println(frontElement.getData());
				removeElement = frontElement;
				frontElement = frontElement.getNext();
				removeElement.setNext(null);
				System.out.println("Address deleted successfully!!");
			}
		}
		public void displayFirstAddress(){
			if(frontElement  == null && rearElement == null){
				System.out.println("Address Book dont contains any address!!");
			}else{
	            System.out.println("--------------------------------------------");
	            System.out.println("First Address : ");
				System.out.println(frontElement.getData());
	            System.out.println("--------------------------------------------");
			}
		}
		public void displayLastAddress(){
			if(frontElement  == null && rearElement == null){
				System.out.println("Address Book dont contains any address!!");
			}else{
				System.out.println("--------------------------------------------");
	            System.out.println("Last Address : ");
				System.out.println(rearElement.getData());
				System.out.println("--------------------------------------------");
			}
		}
		public void displayQueue() {
			int i=0;
			if(frontElement  == null && rearElement == null ) {
				System.out.println("Queue dont contains any element!!");
			}else {
				 Element currentElement =frontElement;
				 System.out.println("********************************************");
				while(currentElement.getNext()!= null) {
					
					System.out.println("Index No : "+i);
					System.out.println(currentElement.getData());
					currentElement = currentElement.getNext();
					i++;
					System.out.println("--------------------------------------------");

	            }
	            System.out.println("Index No : "+i);
	            System.out.println(currentElement.getData());
	            System.out.println("********************************************");
			}
		}
		
}
