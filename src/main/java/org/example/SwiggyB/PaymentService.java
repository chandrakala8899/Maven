package org.example.SwiggyB;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {
    public List<PaymentMethod> getPaymentMethod() {

        PaymentMethod paymentMethod1= new PaymentMethod();
        paymentMethod1.paymentType = "DebitCard";

        PaymentMethod paymentMethod2 = new PaymentMethod();
        paymentMethod2.paymentType = "NetBanking";

        PaymentMethod paymentMethod3 = new PaymentMethod();
        paymentMethod3.paymentType = "CreditCard";

        PaymentMethod paymentMethod4 = new PaymentMethod();
        paymentMethod4.paymentType = "CashonDelivery";

        List<PaymentMethod>paymentMethodList = new ArrayList<>();
        paymentMethodList.add(paymentMethod1);
        paymentMethodList.add(paymentMethod2);
        paymentMethodList.add(paymentMethod3);
        paymentMethodList.add(paymentMethod4);
        paymentMethod1.paymentMethodList = paymentMethodList;
        paymentMethod2.paymentMethodList = paymentMethodList;
        paymentMethod3.paymentMethodList = paymentMethodList;
        paymentMethod4.paymentMethodList = paymentMethodList;


        return paymentMethodList;

    }

}
