package org.example.SwiggyApp;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {
    public List<Payment> payments;

    public List<Payment> getPaymentMethod() {

        Payment paymentMethod1= new Payment();
        paymentMethod1.paymentType = "DebitCard";

        Payment paymentMethod2 = new Payment();
        paymentMethod2.paymentType = "NetBanking";

        Payment paymentMethod3 = new Payment();
        paymentMethod3.paymentType = "CreditCard";

        Payment paymentMethod4 = new Payment();
        paymentMethod4.paymentType = "CashonDelivery";

        List<Payment>paymentMethodList = new ArrayList<>();
        paymentMethodList.add(paymentMethod1);
        paymentMethodList.add(paymentMethod2);
        paymentMethodList.add(paymentMethod3);
        paymentMethodList.add(paymentMethod4);



        return paymentMethodList;

    }}