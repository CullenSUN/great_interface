package com.great.strategy;

class VisaPayImplementation implements PaymentStrategy {
    @Override
    public boolean verifyIdentity() {
        System.out.println("VisaPay verify Identify");
        return true;
    }

    @Override
    public boolean processPayment(String currency, double amount) {
        System.out.printf("VisaPay processPayment %.2f\n", amount);
        return true;
    }
}