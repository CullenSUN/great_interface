package com.great.strategy;

class ApplePayImplementation implements PaymentStrategy {
    @Override
    public boolean verifyIdentity() {
        System.out.println("ApplePay verify Identify");
        return true;
    }

    @Override
    public boolean processPayment(String currency, double amount) {
        System.out.printf("ApplePay processPayment %.2f\n", amount);
        return true;
    }
}