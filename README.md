# 💳 Payment System (SOLID Principles)

## 📌 Overview
This project is a simple payment processing system developed as part of the n11 Bootcamp assignment.  
The goal is to demonstrate how to integrate new payment methods into an existing system while following **SOLID principles**.

The system supports multiple payment methods and is designed to be easily extendable without modifying existing code.

---

## 🚀 Features
- Multiple payment methods support:
  - Credit Card
  - PayPal
  - Apple Pay
- Console-based payment selection
- Input-based payment processing
- Clean and extensible architecture

---

## 🧠 Design Approach

### ✅ Strategy Pattern
Each payment method is implemented as a separate class using a common interface:

```java
public interface PaymentMethod {
    void validate(PaymentRequest request);
    void pay(PaymentRequest request);
}
```

This allows adding new payment methods without modifying existing ones.

---

### ✅ Open/Closed Principle (OCP)
The system is open for extension but closed for modification.

New payment methods can be added like this:

```java
paymentMethods.put(PaymentType.NEW_METHOD, new NewPaymentMethod());
```

No changes are required in the core logic.

---

### ✅ Single Responsibility Principle (SRP)
Each class has a single responsibility:

- `PaymentService` → Manages payment flow  
- `PaymentMethod` implementations → Handle specific payment logic  
- `PaymentRequest` → Holds payment data  
- `PaymentType` → Represents payment types  

---

### ✅ Dependency Inversion Principle (DIP)
`PaymentService` depends on abstractions (`PaymentMethod`) instead of concrete classes.

---

## 🏗️ Project Structure

```
com.n11bootcampPaymentPractice
│
├── Main.java
├── PaymentService.java
├── PaymentMethod.java
├── PaymentRequest.java
├── PaymentType.java
│
├── CreditCardPayment.java
├── PayPalPayment.java
├── ApplePayment.java
```

---

## 🖥️ How It Works

1. User selects a payment method from the console  
2. User enters the payment amount  
3. A `PaymentRequest` is created  
4. `PaymentService` processes the payment  
5. The corresponding payment strategy is executed  

---

## ▶️ Example Output

```
=== Payment Methods ===
1 - CREDIT_CARD
2 - PAYPAL
3 - APPLE_PAY

Select payment method: 1
Enter amount: 100

Processing payment...
Payment successful!
Method: CREDIT_CARD
Amount: 100.0
```

---

## 🔧 Technologies Used
- Java
- OOP Principles
- SOLID Design Principles

---

## 📈 Possible Improvements
- Add validation layer for each payment type  
- Introduce logging mechanism  
- Implement unit tests  
- Integrate with a real backend service  

---

## 👨‍💻 Author
Furkan Yıldız
