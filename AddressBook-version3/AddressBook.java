/**
* The AddressBook program implements an application that
* simply get address details and store as a element of queue 
*then you can perform insert address , remove address , print address , first inseted address , last inserted address
*
*
* @author  Manas Shinde
* @version 3.0
* @since   2022-01-18 / 2022-01-20
*/
package book;

import java.util.*;

public class AddressBook {
	public static void main(String[] args) {
		AddressQueue addressQueueObject = new AddressQueue();
		Scanner sc = new Scanner(System.in);
		int choice, ch;
		String tempStreet, tempState, tempCity;
		int tempZipcode, addressIndexToSearch, addressIndexToUpdate;
		Address address;

		System.out
				.println("********************* Address Book - Console Application (Version-3) *********************");

		do {
			System.out.println(
					"1.Insert Address\n2.Display all address\n3.Delete address\n4.print front Address\n5.print last Address\n6.Search Address Details \n7.Update Address \n0.STOP");
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

				addressQueueObject.enqueue(address);

				break;
			case 2:
				addressQueueObject.displayQueue();
				break;
			case 3:
				addressQueueObject.dequeue();
				break;
			case 4:
				addressQueueObject.displayFirstAddress();
				break;
			case 5:
				addressQueueObject.displayLastAddress();
				break;
			case 6:
				System.out.println("Search Address  \t1.by Street\t2.by State \t3.by city \t4.by zipcode\t5.Index");
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					System.out.println("Enter Street Name :");
					tempStreet = sc.next();
					
					addressQueueObject.searchAddressByStreet(tempStreet);
					break;
				case 2:
					System.out.println("Enter City Name :");
					tempCity = sc.next();
					addressQueueObject.searchAddressByCity(tempCity);
					break;
				case 3:
					System.out.println("Enter State Name :");
					tempState = sc.next();
					addressQueueObject.searchAddressByState(tempState);
					break;
				case 4:
					System.out.println("Enter Zip Code :");
					tempZipcode = sc.nextInt();
					addressQueueObject.searchAddressByZipcode(tempZipcode);
					break;
				case 5:
					System.out.println("Enter Index No. :");
					addressIndexToSearch = sc.nextInt();
					
					addressQueueObject.searchAddressByIndex(addressIndexToSearch);
					break;
				}
				break;
			case 7:
				System.out.println("Enter index of  Address to update:  ");
				addressIndexToUpdate = sc.nextInt();
				try {
					addressQueueObject.updateAddressByIndex(addressIndexToUpdate);
				} catch (NullPointerException e) {
					System.out.println("");
				}

				break;
			case 0:
				System.out.println("Thanks for testing the application!!");
				break;
			default:
				System.out.println("Invalid choice!!");
				break;
			}
		} while (choice != 0);
		sc.close();
	}
}
