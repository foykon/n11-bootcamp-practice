package com.n11bootcampPaymentPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        PayPalPayment payPalPayment = new PayPalPayment();
        ApplePayment applePayment = new ApplePayment();
        Map<PaymentType, PaymentMethod> paymentMethods = new HashMap<PaymentType, PaymentMethod>();
        paymentMethods.put(PaymentType.CREDIT_CARD, creditCardPayment);
        paymentMethods.put(PaymentType.PAYPAL, payPalPayment);
        paymentMethods.put(PaymentType.APPLE_PAY, applePayment);
        PaymentService paymentService = new PaymentService(paymentMethods);

        Scanner scanner = new Scanner(System.in);

        paymentService.showPaymentMethods();

        System.out.print("Select payment method: ");
        int choice = scanner.nextInt();

        PaymentType selectedType = PaymentType.fromCode(choice);

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        PaymentRequest request = new PaymentRequest(amount, selectedType);

        paymentService.pay(request);

    }
}