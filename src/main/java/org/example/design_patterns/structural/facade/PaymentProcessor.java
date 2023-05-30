package org.example.design_patterns.structural.facade;

public class PaymentProcessor {
    public void processPayment(String paymentMethod, double amount) {
        // Lógica de processamento de pagamento complexa
        System.out.println("Processando pagamento de " + amount + " utilizando " + paymentMethod);
    }
}
