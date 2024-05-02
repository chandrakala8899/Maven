package org.example.SwiggyApp;

public class SwiggyTest {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.getPaymentMethod();
        SwiggyService swiggyService = new SwiggyService();
        try {
            swiggyService.orderFood();
        } catch (CheckedException e) {
            System.out.println(e.code+"-----"+e.getMessage());
        }
    }

    }