package com.great.strategy;

interface PaymentStrategy {
    public boolean verifyIdentity();
    public boolean processPayment(String currency, double amount);
}