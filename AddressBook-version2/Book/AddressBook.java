/** The AddressBook program implements an application that
* simply get address details and store in node 
*then you can perform insert at end(append the node), print all nodes ,traverse next and prev node to  print that nodes
*delete a specific node using 'index no'.
*
* @author  Manas Shinde
* @version 2.0
* @since   2022-01-17
*/
package book;

import java.io.*;
import java.util.*;
import LinkedList.*;

public class AddressBook {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int choice;
		String tempStreet, tempState, tempCity;
		int tempZipcode;
		Address address;

		AddressList addressList = new AddressList();

		System.out
				.println("********************* Address Book - Console Application (Version-2) *********************");

		do {
			System.out.println(
					"1.Insert Address \n2.Display all address\n3.next address \n4.prev address\n5.Current Address \n6.Delete Address \n7.search\n0.STOP");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Street Name :");
				tempStreet = sc.next();

				System.out.println("Enter City Name :");
				tempCity = sc.next();

				System.out.println("Enter State Name :");
				tempState = sc.next();

				System.out.println("Enter Zip Code :");
				tempZipcode = sc.nextInt();

				address = new Address(tempStreet, tempState, tempCity, tempZipcode);

				addressList.insert(address);

				break;
			case 2:
				addressList.display();
				break;

			case 3:
				
				Address ad = new Address();
				ad = addressList.getNextNode();
				System.out.println(ad);
				break;
			case 4:
				Address ads = new Address();
				ads = addressList.getPrevNode();
				System.out.println(ads);
				break;
			case 5:
				Address ad1 = new Address();
				ads = addressList.getCurrentNode();
				System.out.println(ads);
				break;
			case 6:
				System.out.println("Enter index of address to be deleted: ");
				int indexOfDeletingAddress = sc.nextInt();
				try {
					addressList.deleteNodeAt(indexOfDeletingAddress);
				} catch (NullPointerException e) {
					System.out.print("");
				}
				break;
			case 7:
				System.out.println("Enter a Street Name to be search : ");
				tempStreet = sc.next();
				addressList.searchAddress(tempStreet);
				break;

			case 0:
				System.out.println("Thanks for testing the application!!");
				break;
			default:
				System.out.println("Invalid choice!!");
				break;
			}
		} while (choice != 0);

	}
}
