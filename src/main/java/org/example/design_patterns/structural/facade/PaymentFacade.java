package org.example.design_patterns.structural.facade;

public class PaymentFacade {
    private PaymentProcessor paymentProcessor;
    private EmailNotification emailNotification;

    public PaymentFacade() {
        paymentProcessor = new PaymentProcessor();
        emailNotification = new EmailNotification();
    }

    public void processPaymentAndNotify(String paymentMethod, double amount, String email) {
        paymentProcessor.processPayment(paymentMethod, amount);
        emailNotification.sendPaymentConfirmation(email, amount);
    }
}
