# Java do padrão Bridge

Forma.java:
```java
// Interface que representa uma forma geométrica
public interface Forma {
    void desenhar();
}

```

Circulo.java:
```java
// Classe que representa um círculo
public class Circulo implements Forma {
    private Cor cor;
    
    public Circulo(Cor cor) {
        this.cor = cor;
    }
    
    @Override
    public void desenhar() {
        System.out.print("Círculo ");
        cor.preencher();
    }
}

```

Quadrado.java:
```java
// Classe que representa um quadrado
public class Quadrado implements Forma {
    private Cor cor;
    
    public Quadrado(Cor cor) {
        this.cor = cor;
    }
    
    @Override
    public void desenhar() {
        System.out.print("Quadrado ");
        cor.preencher();
    }
}

```

Cor.java:
```java
// Interface que representa uma cor
public interface Cor {
    void preencher();
}

```

Vermelho.java:
```java
// Classe que representa a cor vermelha
public class Vermelho implements Cor {
    @Override
    public void preencher() {
        System.out.println("preenchido com vermelho");
    }
}

```

Azul.java:
```java
// Classe que representa a cor azul
public class Azul implements Cor {
    @Override
    public void preencher() {
        System.out.println("preenchido com azul");
    }
}

```

ExemploBridge.java:
```java
// Exemplo de uso do padrão Bridge
public class ExemploBridge {
    public static void main(String[] args) {
        Forma circuloVermelho = new Circulo(new Vermelho());
        Forma quadradoAzul = new Quadrado(new Azul());
        
        circuloVermelho.desenhar(); // Círculo preenchido com vermelho
        quadradoAzul.desenhar(); // Quadrado preenchido com azul
    }
}

```

**Problema Resolvido pelo Bridge:**

O padrão Bridge resolve o problema de criar um vínculo entre abstrações (hierarquia de classes) e implementações (hierarquia de cores) de forma independente, permitindo que ambas possam variar independentemente. Ele é útil quando há a necessidade de evitar a explosão de subclasses ao combinar múltiplas dimensões de variação.

No exemplo acima, temos a interface `Forma` que representa uma forma geométrica e a interface `Cor` que representa uma cor. As classes `Circulo` e `Quadrado` implementam a interface `Forma` e possuem uma referência à interface `Cor`. Isso permite que diferentes implementações de cores possam ser atribuídas às formas.

Ao utilizar o padrão Bridge, é possível adicionar facilmente novas implementações de cores sem a necessidade de criar subclasses adicionais para cada combinação de forma e cor. Isso resulta em um design mais flexível e extensível, permitindo que as hierarquias de formas e cores evoluam independentemente uma da outra