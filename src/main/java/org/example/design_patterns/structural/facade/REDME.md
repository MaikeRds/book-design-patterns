**Pattern Facade em Java**

O padrão de projeto Facade é um padrão estrutural que fornece uma interface simplificada para um conjunto complexo de classes, tornando mais fácil para os clientes utilizarem essas classes. Ele oculta a complexidade do sistema subjacente e fornece uma interface unificada para simplificar a interação do cliente com o sistema.

**Exemplo em Java**

```java
// Subsistema complexo - Classe de processamento de pagamento
class PaymentProcessor {
    public void processPayment(String paymentMethod, double amount) {
        // Lógica de processamento de pagamento complexa
        System.out.println("Processando pagamento de " + amount + " utilizando " + paymentMethod);
    }
}

// Subsistema complexo - Classe de notificação por e-mail
class EmailNotification {
    public void sendPaymentConfirmation(String email, double amount) {
        // Lógica de envio de e-mail complexa
        System.out.println("Enviando confirmação de pagamento de " + amount + " para " + email);
    }
}

// Facade - Classe de fachada
class PaymentFacade {
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

// Classe de teste
public class ExemploFacade {
    public static void main(String[] args) {
        PaymentFacade paymentFacade = new PaymentFacade();
        paymentFacade.processPaymentAndNotify("Cartão de Crédito", 100.0, "usuario@example.com");
    }
}
```

Neste exemplo, temos dois subsistemas complexos: `PaymentProcessor` (responsável pelo processamento de pagamentos) e `EmailNotification` (responsável pelo envio de notificações por e-mail).

A classe `PaymentFacade` atua como uma fachada simplificada para o cliente interagir com os subsistemas complexos. Ela encapsula a lógica de interação com o `PaymentProcessor` e o `EmailNotification` em um único método `processPaymentAndNotify()`. Essa fachada simplifica o processo de processamento de pagamento e notificação para o cliente.

Na classe de teste `ExemploFacade`, criamos uma instância de `PaymentFacade` e chamamos o método `processPaymentAndNotify()` passando o método de pagamento, o valor e o e-mail. O cliente não precisa conhecer os detalhes de implementação dos subsistemas complexos, apenas interage com a fachada fornecida pela `PaymentFacade`.

Este exemplo ilustra como o padrão Facade simplifica a utilização de subsistemas complexos, fornecendo uma interface unificada para o cliente e ocultando a complexidade do sistema subjacente. O cliente pode realizar o processamento de pagamento e enviar notificações por e-mail com apenas uma chamada de método, sem se preocupar com os detalhes de implementação de cada subsistema.

**Problema Resolvido pelo Facade**

O padrão Facade resolve o problema de complexidade e acoplamento excessivo entre o cliente e um conjunto de classes complexas. Ele fornece uma interface simplificada para o cliente, ocultando a lógica complexa e detalhes de implementação do subsistema.

**Prós do Facade**
- Simplifica a utilização de um subsistema complexo, fornecendo uma interface unificada.
- Reduz o acoplamento entre o cliente e o subsistema, mantendo uma separação clara.
- Oculta a complexidade do subsistema, tornando mais fácil para o cliente interagir com ele.
- Promove o princípio de responsabilidade única, mantendo as classes do subsistema focadas em suas funcionalidades específicas.

**Contras do Facade**
- Pode introduzir uma camada adicional de indireção, o que pode afetar a performance em alguns casos de uso.
- O Facade pode se tornar uma classe complexa se a complexidade do subsistema aumentar.
- Pode ser necessário modificar o Facade