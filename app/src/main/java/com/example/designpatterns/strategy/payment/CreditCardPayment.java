package com.example.designpatterns.strategy.payment;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        // Implement credit card payment here
        System.out.println("CreditCardPayment");
    }
}