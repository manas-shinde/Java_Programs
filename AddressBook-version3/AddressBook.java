/**
* The AddressBook program implements an application that
* simply get address details and store as a element of queue 
*then you can perform insert address , remove address , print address , first inseted address , last inserted address
*
*
* @author  Manas Shinde
* @version 3.0
* @since   2022-01-18
*/
package book;
import java.util.*;

public class AddressBook {
	public static void main(String[] args) {
		AddressQueue addressQueueObject = new AddressQueue();
		Scanner sc = new Scanner(System.in);
        int choice;
        String tempStreet , tempState , tempCity;
        int tempZipcode;
        Address address;

      
              
        System.out.println("********************* Address Book - Console Application (Version-3) *********************");


        do{
            System.out.println("1.Insert Address\n2.Display all address\n3.Delete first address\n4.print front Address\n5.print last Address \n0.STOP");    
            choice = sc.nextInt();

            switch(choice){
                case 1:
                        System.out.println("Enter Street Name :");
                        tempStreet = sc.next();

                        System.out.println("Enter City Name :");
                        tempCity = sc.next();

                        System.out.println("Enter State Name :");
                        tempState = sc.next();  

                        System.out.println("Enter Zip Code :");
                        tempZipcode = sc.nextInt();

                        address = new Address(tempStreet,tempState,tempCity,tempZipcode);


                        addressQueueObject.addElementToQueue(address);
                        
                    break;
                case 2:
                        addressQueueObject.displayQueue();
                    break;
                case 3:
						addressQueueObject.removeElementFromQueue();
                    break;
				case 4:
					addressQueueObject.displayFirstAddress();
					break;
				case 5:
					addressQueueObject.displayLastAddress();
					break;		
                case 0 :
                        System.out.println("Thanks for testing the application!!");
                    break;
                default:
                        System.out.println("Invalid choice!!");
                    break;
            }
        }while(choice!=0);
	}
}
