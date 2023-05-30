package org.example.design_patterns.structural.facade;

public class ExemploFacade {
    public static void main(String[] args) {
        PaymentFacade paymentFacade = new PaymentFacade();
        paymentFacade.processPaymentAndNotify("Cartão de Crédito", 100.0, "usuario@example.com");
    }
}
