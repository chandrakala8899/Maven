package org.example.Card;

public class DebitService {
    int remainingBalance;

    public int amount(CardDetails cardDetails, ProductSpecification productSpecification) {
           if (cardDetails.CardLimit <= cardDetails.availableAmount) {
                remainingBalance = cardDetails.availableAmount - productSpecification.Price;
                System.out.println("Your Product Price " + productSpecification.Price);
                System.out.println("Remaining Balance : " + remainingBalance);
            }
            return remainingBalance;
        }
    }





