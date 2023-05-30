# Exemplo em Java do padrão Decorator, 

O exemplo a seguir mostra a implementação de um sistema de café, onde diferentes ingredientes podem ser adicionados ao café base.

Bebida.java:
```java
// Interface que representa uma bebida
public interface Bebida {
    String getDescricao();
    double getCusto();
}

``` 

Cafe.java:
```java
// Classe que representa o café base
public class Cafe implements Bebida {
    @Override
    public String getDescricao() {
        return "Café";
    }
    
    @Override
    public double getCusto() {
        return 1.0;
    }
}

```

Adicional.java:
```java
// Classe abstrata que representa um adicional para a bebida
public abstract class Adicional implements Bebida {
    protected Bebida bebida;
    
    public Adicional(Bebida bebida) {
        this.bebida = bebida;
    }
    
    @Override
    public String getDescricao() {
        return bebida.getDescricao();
    }
    
    @Override
    public double getCusto() {
        return bebida.getCusto();
    }
}

```

Creme.java:
```java
// Classe que representa um adicional de creme para a bebida
public class Creme extends Adicional {
    public Creme(Bebida bebida) {
        super(bebida);
    }
    
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Creme";
    }
    
    @Override
    public double getCusto() {
        return bebida.getCusto() + 0.5;
    }
}

```

Açúcar.java:
```java
// Classe que representa um adicional de açúcar para a bebida
public class Acucar extends Adicional {
    public Acucar(Bebida bebida) {
        super(bebida);
    }
    
    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Açúcar";
    }
    
    @Override
    public double getCusto() {
        return bebida.getCusto() + 0.2;
    }
}

```

ExemploDecorator.java:
```java
// Exemplo de uso do padrão Decorator
public class ExemploDecorator {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        cafe = new Creme(cafe);
        cafe = new Acucar(cafe);
        
        System.out.println("Descrição: " + cafe.getDescricao());
        System.out.println("Custo: $" + cafe.getCusto());
    }
}

```

**Problema Resolvido pelo Decorator:**

O padrão Decorator resolve o problema de adicionar responsabilidades adicionais a um objeto de forma flexível, sem a necessidade de criar subclasses ou modificar a estrutura existente. Ele é útil quando se deseja estender o comportamento de um objeto de maneira dinâmica, combinando diferentes comportamentos de forma flexível.

No exemplo acima, temos a interface `Bebida` que define o comportamento comum a todas as bebidas. A classe `Cafe` representa a bebida base, enquanto as classes `Adicional`, `Creme` e `Acucar` representam os decoradores que adicionam funcionalidades extras ao café.

Ao utilizar o padrão Decorator, podemos adicionar ou remover diferentes adições (`Creme`,

`Açúcar`, etc.) ao café de forma dinâmica, sem modificar a classe `Cafe`. Cada adicional implementa a interface `Bebida`, permitindo que a descrição e o custo da bebida sejam compostos com base nas adições aplicadas.

**Prós do Decorator:**
- Permite estender o comportamento de um objeto de forma flexível, adicionando responsabilidades dinamicamente.
- Evita a necessidade de criar muitas subclasses para tratar todas as combinações possíveis de funcionalidades.
- Permite que diferentes combinações de funcionalidades sejam aplicadas em tempo de execução.

**Contras do Decorator:**
- Pode resultar em um grande número de classes e complexidade se houver muitas opções de funcionalidades para combinar.
- A ordem de aplicação dos decoradores pode ser importante e requer atenção.
