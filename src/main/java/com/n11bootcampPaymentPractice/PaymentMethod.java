package com.n11bootcampPaymentPractice;

public interface PaymentMethod {
    void validate(PaymentRequest request);

    void pay(PaymentRequest request);
}
