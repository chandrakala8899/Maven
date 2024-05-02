package org.example.SwiggyB;

import java.util.Scanner;

public class OrderTest {
    public static void main(String[] args) {
        SwiggyService swiggyService = new SwiggyService();
        ListOfRestaurent listOfRestaurent = swiggyService.findRestaurant();
        RestaurantService restaurantService = new RestaurantService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Restaurant Name: ");
        String restaurantName = scanner.nextLine();

        Restaurent restaurent = restaurantService.getRestaurant(listOfRestaurent, restaurantName);
        if (restaurent != null) {
            System.out.println("Rating: " + restaurent.rating);
            Dish dish = restaurantService.getDish(restaurent, "Biryani");
            if (dish != null) {
                System.out.println("Dish Name: " + dish);
            }
        } else {
            System.out.println("Restaurant not found.");
        }
        PaymentProcess paymentProcess = new PaymentProcess();
        PaymentService paymentService = new PaymentService();
        paymentProcess.selectPaymentMethod(paymentService,"DebitCard");
        paymentProcess.payment();
        System.out.println(paymentProcess);
      //  PaymentMethod paymentMethod = paymentProcess.selectPaymentMethod(paymentService,"CreditCard");
       // System.out.println(paymentMethod.paymentType);

    }
}
