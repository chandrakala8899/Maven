package org.example.Card;

import java.util.Date;
import java.util.UUID;

public class CardService {
    public CardDetails card(UserDetails userDetails){
            CardDetails cardDetails = new CardDetails();

            Address cardAddress= new Address();
            cardAddress.area= "Manopad";
            cardAddress.flatNo="2-164";
            cardAddress.country= "india";
            cardAddress.pincode= "203723";

            cardDetails.name= userDetails.name;
            cardDetails.fatherName= userDetails.fatherName;
            cardDetails.dob= userDetails.dob;
         cardDetails.address= cardAddress;
         cardDetails.minimumAmount = userDetails.amount;
         cardDetails.cardNumber = UUID.randomUUID().toString();
         cardDetails.cvvNumber = "995";
         cardDetails.expiryDate = new Date();
         return cardDetails;

    }
}
