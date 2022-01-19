import java.util.*;
public class Address{
    private String street;
    private String city;  
    private String state;
    private int zipcode;

    Address(){
        street = "null";
        city = "null";
        state = "null";
        zipcode = 000000;
    }
    public Address(String street,String state, String city,int zipcode){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    // TODO:setters

    public void setStreet(String tempStreet)throws StringIsNull{
        if(tempStreet.length()  == 0 ){
            throw new StringIsNull("you didnt enter street name !!");
            
        }else{
            street =  tempStreet;
        }
    }
    public void setCity(String tempCity)throws StringIsNull{
        if(tempCity.length()  == 0 ){
            throw new StringIsNull("you didnt enter city name !!");
        }else{
             city = tempCity;
        }
    }
    public void setState(String tempState)throws StringIsNull{
        if(tempState.length()  == 0 ){
            throw new StringIsNull("you didnt enter state name !!");
        }else{
            state = tempState;
        }
        
    }
    public void setZipcode(int tempZipcode)throws ZipcodeIsOutOfBound{
         int length = (int) (Math.log10(tempZipcode) + 1);
        if(length == 6 ){
            zipcode = tempZipcode;
        }else{
            throw new ZipcodeIsOutOfBound("zipcode is greature than 6 digit or less than 6 digit");
        }
    }

    // TODO:getters

    public String getStreet(){
        return street;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public int getZipcode(){
        return zipcode;
    }
    public void printAddress(){
            System.out.println("--------------------------------------------");
            System.out.println("Street Name :"+this.street+"\t "+"City : "+this.city+"\t "+"State : "+this.state+"\t "+"Zipcode : "+this.zipcode);  
            System.out.println("--------------------------------------------");
    }

}