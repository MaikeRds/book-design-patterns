package org.example.design_patterns.structural.facade;

public class EmailNotification {
    public void sendPaymentConfirmation(String email, double amount) {
        // Lógica de envio de e-mail complexa
        System.out.println("Enviando confirmação de pagamento de " + amount + " para " + email);
    }
}
