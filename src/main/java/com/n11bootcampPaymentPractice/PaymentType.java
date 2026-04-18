package com.n11bootcampPaymentPractice;

public enum PaymentType {
    CREDIT_CARD(1),
    PAYPAL(2),
    APPLE_PAY(3); ;

    private final int code;
    PaymentType(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
    public static PaymentType fromCode(int code) {
        for (PaymentType type : values()) {
            if (type.code == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid selection");
    }
}
