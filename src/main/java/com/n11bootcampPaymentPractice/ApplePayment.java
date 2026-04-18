package com.n11bootcampPaymentPractice;

public class ApplePayment implements PaymentMethod {

    @Override
    public void validate(PaymentRequest request) {
        System.out.println("Payment type validated " + request.type);

    }

    @Override
    public void pay(PaymentRequest request) {
        System.out.println("Payed with Apple Pay " + request.amount);

    }
}
