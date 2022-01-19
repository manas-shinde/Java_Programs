import java.util.*;

public class AddressList{
   
    ArrayList<Address> addressList = new ArrayList<Address>();;
    
    Scanner sc  = new Scanner(System.in);;
    String tempStreet,tempState,tempCity;
    int tempZipcode,addressIndex,ch;
    Address address;
    boolean streetFlag ,stateFlag, cityFlag, zipcodeFlag = false;

    // TODO: accepting detalis from user after that using setters of address class setting object attribute value
    public void addAddress(){
        System.out.println("Enter your address details -");

        Address address = new Address();
        
        do{
                System.out.println("Enter street:");
                tempStreet = sc.next();
                try{
                    address.setStreet(tempStreet);
                    streetFlag = true;
                }catch(StringIsNull err){//handling null string exceptions
                    System.out.println("Error Caught :"+err);
                }
        }while(streetFlag=false);
        
        do{
            System.out.println("Enter city:");
            tempCity = sc.next();
            try{
                address.setCity(tempCity);  
                cityFlag = true;
            }catch(StringIsNull err){
                System.out.println("Error Caught :"+err);
            }
        }while(cityFlag=false);
        
        do{
            System.out.println("Enter state:");
            tempState = sc.next();
            try{
                address.setState(tempState);
                stateFlag = true;
            }catch(StringIsNull err){
                System.out.println("Error Caught :"+err);
            }
        }while(stateFlag=false);
        
        do{
            System.out.println("Enter zipcode:");
            tempZipcode = sc.nextInt();
            try{
                address.setZipcode(tempZipcode);
                zipcodeFlag = true;
            }catch(ZipcodeIsOutOfBound err){
                System.out.println("Error Caught :"+err);
        }
        }while(zipcodeFlag =false);

        
        // adding data to arraylist
            addressList.add(address);
            printList();
    }
    // TODO: Printing array List 
    public void printList(){
        int i = 0;
       Iterator itr=addressList.iterator();  
        while(itr.hasNext()){  
             address =(Address)itr.next();  
            System.out.println("--------------------------------------------");
            System.out.println("Index No : "+i);
            System.out.println("Street Name :"+address.getStreet()+"\n "+"City : "+address.getCity()+"\n "+"State : "+address.getState()+"\n "+"Zipcode : "+address.getZipcode());  
            i++;
        } 
            System.out.println("--------------------------------------------");
        
    }
    
    // TODO: Deleting address with specific index Number from List
    public void deleteList(){
        do{
            System.out.println("Delete according to \n1.by Street \t2.by City\t3.by State\t4.by zipcode\t5.STOP");
            System.out.println("Enter choice :");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                        System.out.println("Enter Street Name :");
                        tempStreet = sc.next();
                        for(int i=0;i<addressList.size();i++){
                            address = (Address) addressList.get(i);
                            if(tempStreet.equals(address.getStreet())){
                                addressList.remove(address);
                                System.out.println("Address whose  street is "+tempStreet +" deleted!!!");
                                System.out.println("--------------------------------------------");

                            }
                        }
                    break;
                case 2:
                         System.out.println("Enter City Name :");
                            tempCity = sc.next();
                            for(int i=0;i<addressList.size();i++){
                                address = (Address) addressList.get(i);
                                if(tempCity.equals(address.getCity())){
                                    addressList.remove(address);
                                    System.out.println("Address whose  city is "+tempCity+"deleted!!!");
                                    System.out.println("--------------------------------------------");

                                }
                             }
                    break;
                case 3:
                        System.out.println("Enter State Name :");
                        tempState = sc.next();
                        for(int i=0;i<addressList.size();i++){
                            address = (Address) addressList.get(i);
                            if(tempState.equals(address.getState())){
                                addressList.remove(address);
                                System.out.println("Address whose  state is "+tempState +"deleted!!!");
                                System.out.println("--------------------------------------------");

                            }
                        }
                    break;
                case 4:
                //First  accepting zip code
                        System.out.println("Enter Zip Code :");
                        tempZipcode = sc.nextInt();
                        for(int i=0;i<addressList.size();i++){
                            address = (Address) addressList.get(i);
                            if(tempZipcode == address.getZipcode()){
                               addressList.remove(address);
                                System.out.println("Address whose  zipcode is "+tempZipcode +"deleted!!!");
                                System.out.println("--------------------------------------------");

                            }
                        }
                    break;
            }
        }while(ch!=5);
    }

    // TODO: Upadateing address details 
    public void updateList(){
        System.out.println("Enter index Number of address that you want to update  : ");
        addressIndex = sc.nextInt();
        
        do{
            System.out.println("Which field do want to update :\t 1.by Street \t2.by City\t3.by State\t4.by zipcode\t5.STOP");
            System.out.println("Enter choice :");
            ch = sc.nextInt();
            
            address = (Address) addressList.get(addressIndex);
            
            switch(ch){
                case 1:
                        System.out.println("Enter Street Name :");
                        tempStreet = sc.next();
                        try{
                            address.setStreet(tempStreet);
                        }catch(StringIsNull err){
                            System.out.println("Error Caught :"+err);
                        }

                        System.out.println("Street Name SuccessFully Updated!!!!!!");
                        System.out.println("--------------------------------------------");

                    break;
                case 2:
                        System.out.println("Enter City Name :");
                        tempCity = sc.next();
                        try{
                            address.setCity(tempCity);
                        }catch(StringIsNull err){
                            System.out.println("Error Caught :"+err);
                        }
                        System.out.println("City Name SuccessFully Updated!!!!!!");
                        System.out.println("--------------------------------------------");

                    break;
                case 3:
                        System.out.println("Enter State Name :");
                        tempState = sc.next();
                        try{
                            address.setState(tempState);
                        }catch(StringIsNull err){
                            System.out.println("Error Caught :"+err);
                        }

                        System.out.println("State Name SuccessFully Updated!!!!!!");
                        System.out.println("--------------------------------------------");

                    break;
                case 4:
                        System.out.println("Enter Zip Code :");
                        tempZipcode = sc.nextInt();

                        try{
                            address.setZipcode(tempZipcode);
                         }catch(ZipcodeIsOutOfBound err){
                            System.out.println("Error Caught :"+err);
                        }

                        System.out.println("Zip code SuccessFully Updated!!!!!!");
                        System.out.println("--------------------------------------------");

                    break;
                default:
                        System.out.println("Wrong choice!!");
            }
        }while(ch!=5);
    }

    // TODO: searchList is used to search address using street ,city,State,Zipcode 
    public void serachList(){
        do{
            System.out.println("Searching according to :  1.Street  2.City   3.State  4.zipcode  5.STOP");
            System.out.println("Enter choice :");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                        System.out.println("Enter Street Name :");
                        tempStreet = sc.next();
                        for(int i=0;i<addressList.size();i++){
                            address = (Address) addressList.get(i);
                            if(tempStreet.equals(address.getStreet())){
                                address.printAddress();
                            }
                        }
                    break;
                case 2: 
                        System.out.println("Enter City Name :");
                        tempCity = sc.next();
                        for(int i=0;i<addressList.size();i++){
                            address = (Address) addressList.get(i);
                            if(tempCity.equals(address.getCity())){
                                address.printAddress();
                            }
                        }
                    break;
                case 3:
                        System.out.println("Enter State Name :");
                        tempState = sc.next();
                        for(int i=0;i<addressList.size();i++){
                            address = (Address) addressList.get(i);
                            if(tempState.equals(address.getState())){
                                address.printAddress();
                            }
                        }
                        break;
                case 4:
                //First  accepting zip code
                        System.out.println("Enter Zip Code :");
                        tempZipcode = sc.nextInt();
                        for(int i=0;i<addressList.size();i++){
                            address = (Address) addressList.get(i);
                            if(tempZipcode == address.getZipcode()){
                                address.printAddress();
                            }
                        }
                        break;
            }
        }while(ch!=5);

    }
}