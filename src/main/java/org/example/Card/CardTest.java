package org.example.Card;

import java.util.ArrayList;
import java.util.List;

public class CardTest {
    public static void main(String[] args) {
        UserDetails userDetails = new UserDetails();
        Address useraddress = new Address();
        useraddress.flatNo = "3-47865";
        useraddress.area = "maonpad";
        useraddress.country = "USA";
        useraddress.pincode = "574258";

        userDetails.name = "Sri";
        userDetails.fatherName = "Ramudu";
        userDetails.dob = "11-09-2005";
        userDetails.accountNumber = "3563182";
        userDetails.amount = "2000";
        userDetails.address = useraddress;

        CardService cardService = new CardService();
        CardDetails cardDetails = cardService.card(userDetails);
        System.out.println(  " Card Number  : "+ cardDetails.cardNumber + " Card Cvv Number : " + cardDetails.cvvNumber);
        System.out.println( " Available Balance : "+ cardDetails.availableAmount);

        Product shirtProduct = new Product();
        ProductSpecification shirtSpec = new ProductSpecification();
        shirtSpec.colour = "Blue";
        shirtSpec.Price = 1000;
        shirtSpec.size = 40;
        shirtProduct.productType = "Shirt";
        shirtProduct.productSpecification = shirtSpec;

        Product jeansProduct = new Product();
        ProductSpecification jeansSpec = new ProductSpecification();
        jeansSpec.colour = "Black";
        jeansSpec.Price = 1000;
        jeansSpec.size = 38;
        jeansProduct.productType= "jeans";
        jeansProduct.productSpecification = jeansSpec;


        Shop shop = new Shop();
        List<Product> products = new ArrayList<>();
        products.add(shirtProduct);
        products.add(jeansProduct);
        shop.Productlist= products;

        String userInputType = "jeans";
        String userInputColor = "Black";
        int userSize=38;

        Product available = shop.shopping(userInputType,userInputColor,userSize,jeansSpec);
        if (available != null) {
            System.out.println("Product Available : " + userInputType+ " (Colour: " + userInputColor + ")  " +"Size : "+userSize);
        } else {
            System.out.println(" product not available:");
        }
        DebitService debitService = new DebitService();
        debitService.amount(cardDetails,jeansSpec);
    }



    }
