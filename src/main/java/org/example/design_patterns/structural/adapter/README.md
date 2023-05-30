# Exemplo padrão Adapter, 
O exemplo a seguir é baseado em adaptação de um objeto `TomadaAmericana` para ser utilizado em uma `TomadaBrasileira`.

TomadaAmericana.java:
```java
// Classe que representa uma tomada americana
public class TomadaAmericana {
    public void conectarTomadaAmericana() {
        System.out.println("Conectado na tomada americana");
    }
}
```

TomadaBrasileira.java:
```java
// Interface que representa uma tomada brasileira
public interface TomadaBrasileira {
    void conectarTomadaBrasileira();
}
```

AdapterTomadaBrasileira.java:
```java
// Adapter que adapta a tomada americana para a tomada brasileira
public class AdapterTomadaBrasileira implements TomadaBrasileira {
    private TomadaAmericana tomadaAmericana;
    
    public AdapterTomadaBrasileira(TomadaAmericana tomadaAmericana) {
        this.tomadaAmericana = tomadaAmericana;
    }
    
    @Override
    public void conectarTomadaBrasileira() {
        System.out.println("Adaptando tomada americana para tomada brasileira");
        tomadaAmericana.conectarTomadaAmericana();
    }
}
```

ExemploAdapter.java:
```java
// Exemplo de uso do Adapter
public class ExemploAdapter {
    public static void main(String[] args) {
        TomadaAmericana tomadaAmericana = new TomadaAmericana();
        TomadaBrasileira tomadaBrasileira = new AdapterTomadaBrasileira(tomadaAmericana);
        
        tomadaBrasileira.conectarTomadaBrasileira();
    }
}
```

**Problema Resolvido pelo Adapter:**

O padrão Adapter resolve o problema de fazer com que duas interfaces incompatíveis possam trabalhar juntas. Ele é útil quando temos um objeto existente com uma interface que precisamos adaptar para ser compatível com outra interface, sem modificar o código-fonte original.

No exemplo acima, temos uma `TomadaAmericana` que possui um método `conectarTomadaAmericana()`, e uma `TomadaBrasileira` que possui um método `conectarTomadaBrasileira()`. O Adapter `AdapterTomadaBrasileira` implementa a interface `TomadaBrasileira` e recebe uma instância de `TomadaAmericana` no construtor. O método `conectarTomadaBrasileira()` no Adapter adapta a chamada para o método `conectarTomadaAmericana()` da `TomadaAmericana`, permitindo que a tomada americana seja utilizada em uma tomada brasileira.

**Prós do Adapter:**
- Permite a integração de classes ou sistemas com interfaces incompatíveis.
- Permite reutilizar código existente sem modificar sua implementação original.
- Ajuda a manter a flexibilidade e a extensibilidade do código, permitindo a adição de novos adapters para diferentes interfaces.

**Contras do Adapter:**
- Pode aumentar a complexidade do código ao introduzir uma camada adicional de adaptação.
- Pode levar a uma diminuição do desempenho devido aos custos de adaptação e chamadas adicionais.

Esse é o exemplo do padrão Adapter em Java