package com.great.strategy;

class AliPayImplementation implements PaymentStrategy {
    @Override
    public boolean verifyIdentity() {
        System.out.println("AliPay verify Identify");
        return true;
    }

    @Override
    public boolean processPayment(String currency, double amount) {
        System.out.printf("AliPay processPayment %.2f\n", amount);
        return true;
    }
}