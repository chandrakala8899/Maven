package org.example.Card;

import java.util.Date;
import java.util.UUID;

public class CardService extends Product {
    public CardDetails card(UserDetails userDetails) {
        CardDetails cardDetails = new CardDetails();

        Address cardAddres = new Address();
        cardAddres.area = "Manopad";
        cardAddres.flatNo = "2-164";
        cardAddres.country = "india";
        cardAddres.pincode = "203723";

        cardDetails.name = userDetails.name;
        cardDetails.fatherName = userDetails.fatherName;
        cardDetails.dob = userDetails.dob;
        cardDetails.userAddress = cardAddres;
        cardDetails.cardAddress = userDetails.address;
        cardDetails.cardNumber = UUID.randomUUID().toString();
        cardDetails.cvvNumber = "995";
        cardDetails.availableAmount =30000;
        cardDetails.CardLimit = 30000;
        cardDetails.expiryDate = new Date();

    return cardDetails;
}
    }

