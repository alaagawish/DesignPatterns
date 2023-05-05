package com.example.designpatterns.strategy.payment;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        // Implement PayPal payment here
        System.out.println("PayPalPayment");
    }
}