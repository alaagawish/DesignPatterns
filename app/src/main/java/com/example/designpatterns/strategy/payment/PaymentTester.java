package com.example.designpatterns.strategy.payment;

public class PaymentTester {
    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor(new CreditCardPayment());
        processor.processPayment(200);

        processor.setPaymentMethod(new PayPalPayment());
        processor.processPayment(150.5);

        processor.setPaymentMethod(new BankTransferPayment());
        processor.processPayment(100);

    }
}
