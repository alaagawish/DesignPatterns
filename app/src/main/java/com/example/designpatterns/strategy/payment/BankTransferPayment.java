package com.example.designpatterns.strategy.payment;

public class BankTransferPayment  implements PaymentMethod {
    @Override
    public void pay(double amount) {
        // Implement bank transfer payment here
        System.out.println("BankTransferPayment");
    }
}