package com.n11bootcampPaymentPractice;

public class PaymentRequest {

    public double amount;
    public PaymentType type;

    public PaymentRequest(double amount, PaymentType type) {
        this.amount = amount;
        this.type = type;
    }
}
