package book;

/** The AddressBook program implements an application that
* simply get address details and store in node with using java collection interface 
*then you can perform 
*INSERT - append a node , insert at particular position  . 
*PRINT-  print all nodes ,
*traverse next and prev node to  print that nodes
*DELELE - delete  a Address using street name, state name , city name and zip-code 
*SEARCH -search a Address inside AddressBook using street name ,state name , city name , zipcode
*UPDATE - update a Address inside AddressBook using Index Number (you can update street name , state name , city name ,zipcode).
*
* @author  Manas Shinde
* @version 2.0
* @since   2022-01-17  / 2022-01-20
*/

import java.io.*;
import list.*;

public class AddressBook {
	public static void main(String[] args) throws Exception {

		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		int mainMenuchoice, ch;
		String tempStreet, tempState, tempCity;
		int tempZipcode;
		Address address;

		AddressList addressList = new AddressList();

		System.out
				.println("********************* Address Book - Console Application (Version-2) *********************");
			do {
				System.out.println(
						"1: Insert Address\n2: Append Address  \n3: Display addresses\n4: next address \n5: prev address\n6: Current Address \n7: Delete Address \n8: search Address\n9: Update Address\n0: STOP");


				mainMenuchoice = Integer.parseInt(br.readLine());

				switch (mainMenuchoice) {
				case 1:
					System.out.println("Enter Address Details : ");
					System.out.println("Enter Street Name :");
					tempStreet = br.readLine();

					System.out.println("Enter City Name :");
					tempCity = br.readLine();

					System.out.println("Enter State Name :");
					tempState = br.readLine();

					System.out.println("Enter Zip Code :");
					tempZipcode = Integer.parseInt(br.readLine());

					address = new Address(tempStreet, tempState, tempCity, tempZipcode);

					try {
						addressList.insertAt(address);
					} catch (NullPointerException e) {
						System.out.println("Index is out of Bound!!");
					}
					break;
				case 2:
					System.out.println("Enter Street Name :");
					tempStreet = br.readLine();

					System.out.println("Enter City Name :");
					tempCity = br.readLine();

					System.out.println("Enter State Name :");
					tempState = br.readLine();

					System.out.println("Enter Zip Code :");
					tempZipcode = Integer.parseInt(br.readLine());

					address = new Address(tempStreet, tempState, tempCity, tempZipcode);

					addressList.appendAddress(address);

					break;

				case 3:
					try {
						addressList.display();
					} catch (NullPointerException e) {
						System.out.println("");
					}
					break;

				case 4:
//TODO: To print next Node 
					Address ad = new Address();
					ad = addressList.getNextNode();
					System.out.println(ad);
					break;
				case 5:
//TODO:TO print previous node 
					Address ads = new Address();
					ads = addressList.getPrevNode();
					System.out.println(ads);
					break;
				case 6:
//TODO:Print current NOde
					Address ad1 = new Address();
					ad1 = addressList.getCurrentNode();
					System.out.println(ad1);
					break;
				case 7:
//TODO:Deleting Methods 
					System.out.println("--------------------Delete by------------------------");
					System.out.println(
							" \n\t1: By Street \n\\t2: By State\n\\t3: By City \n\\t4: By Zipcode\n\\t5: By Index\n\\t6: STOP");
					System.out.println("--------------------------------------------");
					ch = Integer.parseInt(br.readLine());
					switch (ch) {
					case 1:
						System.out.println("Enter a Street Name to be search : ");
						tempStreet = br.readLine();

						addressList.deleteAddressByStreet(tempStreet);

						break;
					case 2:

						System.out.println("Enter State Name :");
						tempState = br.readLine();

						addressList.deleteAddressByState(tempState);

						break;
					case 3:
						System.out.println("Enter City Name :");
						tempCity = br.readLine();

						addressList.deleteAddressByCity(tempCity);

						break;
					case 4:
						System.out.println("Enter Zip Code :");
						tempZipcode = Integer.parseInt(br.readLine());

						addressList.deleteAddressByZipcode(tempZipcode);

						break;
					case 5:
						System.out.println("Enter Index No :");
						int indexNoToSearch = Integer.parseInt(br.readLine());

						addressList.deleteAddressByIndex(indexNoToSearch);

						break;
					case 6:
						break;
					}
					break;
				case 8:
//TODO: Search Methods
					System.out.println("--------------------Search by------------------------");
					System.out.println(
							" \n\t1: By Street \n\t2: By State\n\t3: By City \n\t4: By Zipcode\n\t5: By index\n\t6: STOP");
					System.out.println("--------------------------------------------");
					ch = Integer.parseInt(br.readLine());
					switch (ch) {
					case 1:
						System.out.println("Enter a Street Name to be search : ");
						tempStreet = br.readLine();

						addressList.searchAddressByStreet(tempStreet);

						break;
					case 2:

						System.out.println("Enter State Name :");
						tempState = br.readLine();

						addressList.searchAddressByState(tempState);

						break;
					case 3:
						System.out.println("Enter City Name :");
						tempCity = br.readLine();

						addressList.searchAddressByCity(tempCity);

						break;
					case 4:
						System.out.println("Enter Zip Code :");
						tempZipcode = Integer.parseInt(br.readLine());

						addressList.searchAddressByZipcode(tempZipcode);

						break;
					case 5:
						System.out.println("Enter Index No :");
						int indexNoToSearch = Integer.parseInt(br.readLine());

						addressList.searchAddressByIndex(indexNoToSearch);

						break;
					case 6:
						break;
					}
					break;
				case 9:
					System.out.println("Enter index of  Address to update:  ");
					int updateAddressIndex = Integer.parseInt(br.readLine());
					try {
						addressList.updateAddressByIndex(updateAddressIndex);
					} catch (NullPointerException e) {
						System.out.println("");
					}

					break;
				default:
					System.out.println("Invalid choice!!");
					break;
				case 0:
					System.out.println("Thanks for testing the application!!");
					System.out.println("--------------------------------------------");
					break;
				}
			} while (mainMenuchoice != 0);
	}
}