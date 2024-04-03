package org.example.Card;

public class CardTest {
    public static void main(String[] args) {
        UserDetails userDetails = new UserDetails();
        Address useraddress = new Address();
        useraddress.flatNo="3-47865";
        useraddress.area="maonpad";
        useraddress.country="USA";
        useraddress.pincode="574258";

        userDetails.name= "Sri";
        userDetails.fatherName= "Ramudu";
        userDetails.dob= "11-09-2005";
        userDetails.accountNumber="3563182";
        userDetails.amount = "2000";
        userDetails.address= useraddress;

        CardService cardService = new CardService();
        CardDetails cardDetails = cardService.card(userDetails);
        System.out.println(cardDetails.cardNumber);
        System.out.println(cardDetails.cvvNumber);
    }
}
