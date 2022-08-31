package com.great.strategy;

class Shopping {
    boolean userCheckOut(String method, String currency, double amount) {
        PaymentStrategy paymentMethod = null;
        switch (method) {
            case "applepay":
            paymentMethod = new ApplePayImplementation();
            break;
            case "alipay":
            paymentMethod = new AliPayImplementation();
            break;
            case "visa":
            paymentMethod = new VisaPayImplementation();
            break;
            default:
            break;
        }

        if (paymentMethod == null) {
            System.out.printf("unsupported payment method %s\n.", method);
            return false;
        } 

        boolean verified = paymentMethod.verifyIdentity();
        if (verified) {
            return paymentMethod.processPayment(currency, amount);
        } else {
            System.out.println("user identity verification failed.");
            return false;
        }
        
    }

    public static void main(String[] args) {
        Shopping shopping = new Shopping();
        shopping.userCheckOut("applepay", "HKD", 0.8);
        shopping.userCheckOut("visa", "USD", 100.0);
        shopping.userCheckOut("alipay", "USD", 120.0);
        shopping.userCheckOut("lilipay", "USD", 20.0);
    }
}
