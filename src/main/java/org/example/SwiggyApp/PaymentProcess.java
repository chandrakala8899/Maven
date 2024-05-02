package org.example.SwiggyApp;

;

public class PaymentProcess {
    double availableAmount = 10000;

    public Payment selectPaymentMethod(PaymentService paymentService, String paymentype) {
        for (Payment payment : paymentService.getPaymentMethod()) {
            if (payment.paymentType.equals(paymentype)) {
                System.out.println(" from payment process ");
            }

            return payment;
        }
        return null;
    }

    public double payment() throws CheckedException {

         SwiggyCart swiggyCart=new SwiggyCart();
//         double dishAmount=swiggyCart.totalPrice;
        Dish dish =new Dish("Biryani",300);
        double dishAmount=dish.price;


        if (dishAmount < availableAmount) {
            availableAmount= availableAmount-dishAmount;
            System.out.println("Dish Price : " + dishAmount);
            System.out.println("Final Amount Pending:  "+availableAmount);

        }
        return availableAmount;
    }


}

