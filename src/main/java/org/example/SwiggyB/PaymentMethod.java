package org.example.SwiggyB;

import java.util.List;

public class PaymentMethod {
    public String paymentType;

    List<PaymentMethod> paymentMethodList;

    @Override
    public String toString() {
        return "PaymentMethod{" +
                "paymentType='" + paymentType + '\'' +
                ", paymentMethodList=" + paymentMethodList +
                '}';
    }
}
