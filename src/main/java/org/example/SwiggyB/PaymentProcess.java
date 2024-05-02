package org.example.SwiggyB;

import java.util.List;

public class PaymentProcess {
    public  PaymentMethod selectPaymentMethod(PaymentService paymentService,String paymentype){
        for(PaymentMethod paymentMethod: paymentService.getPaymentMethod()) {
            if (paymentMethod.paymentType.equals(paymentype)) {
                System.out.println(" from payment process ");
            }

            return paymentMethod;
        }
        return null;
    }
    public boolean payment(){
        int availableAmount= 10000;
        SwiggyService swiggyService = new SwiggyService();
        RestaurantService restaurantService = new RestaurantService();
        Dish dish= restaurantService.getDish(restaurantService.getRestaurant(swiggyService.findRestaurant(),"Mehfil"),"Biryani");
        int dishFinalAmount = availableAmount-dish.price;

        if(dishFinalAmount<availableAmount){
            System.out.println("Dish Price : " +dish);

        }
        return true;
    }

}
