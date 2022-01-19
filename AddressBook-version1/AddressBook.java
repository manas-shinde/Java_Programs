/**
* The AddressBook program implements an application that
* simply get address detalis and store in arraylist  
*then you can perform upadte,delete,print,search in arraylist.
*
* @author  Manas Shinde
* @version 1.0
* @since   2022-01-15
*/
import java.lang.*;//this is default package that java provide
import java.util.*;//for scanner class 

public class AddressBook{
    public static void main(String[] args){
       int choice;
       AddressList addressList= new AddressList();

       Scanner sc = new Scanner(System.in);

       System.out.println("********************* Address Book Console Application *********************");
        do{
                   System.out.println("1.To add a address to list");
                   System.out.println("2.To  delete a address to list");
                   System.out.println("3.To update a address to list");
                   System.out.println("4.To serach a list of address");
                   System.out.println("5.To print a list of address");
                   System.out.println("6.EXIT");
                   choice = sc.nextInt();
                    switch(choice){
                        case 1:  addressList.addAddress();  
                            break;
                       
                        case 2:  addressList.deleteList(); 
                            break;
                       
                        case 3:  addressList.updateList();
                            break;

                        case 4: addressList.serachList();
                            break;

                        case 5: addressList.printList();
                            break;
                    }
        }while(choice!=6);
    }
}