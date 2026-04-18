package com.n11bootcampPaymentPractice;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {
    private Map<PaymentType, PaymentMethod> paymentMethods;
    public PaymentService(Map<PaymentType, PaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public void showPaymentMethods() {
        System.out.println("=== Payment Methods ===");
        for (PaymentType type : paymentMethods.keySet()) {
            System.out.println(type.getCode() + " - " + type.name());
        }
    }
    public void pay(PaymentRequest paymentRequest) {
        PaymentMethod paymentMethod = paymentMethods.get(paymentRequest.type);
        paymentMethod.validate(paymentRequest);
        paymentMethod.pay(paymentRequest);
    }
}
