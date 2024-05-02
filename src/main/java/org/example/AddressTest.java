package org.example;

public class AddressTest {
    public static void main (String[] agrs ){
        Address address = new Address();
        address.Street= "bankStreet";
        address.city=" hyderabad";
         address.flatNo ="2-164";
         address.pincode = "12345";
        System.out.println(address);

        User user = new User();
        user.userName= "chandu";
        user.passWord = "1234";
        user.address = address;


        Address address1 = new Address();
        address1.Street = "Kalvakuntkla";
        address1.flatNo="3-45";
        address1.city ="Gadwal";
        address1.pincode = "34567";

        Restarent restaraunt = new Restarent();
        restaraunt.restarentName= "PistaHouse";
        restaraunt.orderItems = 5;
        restaraunt.address= address1;
    }
}
