package org.example;

public class AddressTest {
    public static void main (String[] agrs ){
        Address address = new Address();
        address.Street= "bankStreet";
        address.city=" hyderabad";
         address.flatNo ="2-164";
         address.pincode = "12345";

        User user = new User();
        user.userName= "chandu";
        user.passWord = "1234";
        user.address1 = address;


        Address address1 = new Address();
        address1.Street = "Kalvakuntkla";
        address1.flatNo="3-45";
        address1.city ="Gadwal";
        address1.pincode = "34567";

        Restarent restarent = new Restarent();
        restarent.restarentName= "PistaHouse";
        restarent.orderItems = 5;
       restarent.address= address1;


    }
}
