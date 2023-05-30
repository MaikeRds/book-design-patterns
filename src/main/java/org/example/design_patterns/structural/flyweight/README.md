**Pattern Flyweight em Java**

O padrão de projeto Flyweight é um padrão estrutural que visa minimizar o uso de memória compartilhando eficientemente objetos que possuem estados intrínsecos e extrínsecos semelhantes. Ele resolve o problema de alta utilização de memória ao permitir que vários objetos compartilhem partes comuns, reduzindo assim a redundância e melhorando o desempenho.

**Exemplo em Java**

Aqui está um exemplo em Java que demonstra o uso do padrão Flyweight:

```java
import java.util.HashMap;
import java.util.Map;

// Interface Flyweight
interface NotaMusical {
    void tocar();
}

// Implementação concreta do Flyweight
class NotaMusicalImpl implements NotaMusical {
    private String nota;

    public NotaMusicalImpl(String nota) {
        this.nota = nota;
    }

    public void tocar() {
        System.out.println("Tocando nota " + nota);
    }
}

// Flyweight Factory
class NotaMusicalFactory {
    private static Map<String, NotaMusical> notas = new HashMap<>();

    public static NotaMusical getNota(String nota) {
        NotaMusical notaMusical = notas.get(nota);

        if (notaMusical == null) {
            notaMusical = new NotaMusicalImpl(nota);
            notas.put(nota, notaMusical);
        }

        return notaMusical;
    }
}

// Cliente
public class ExemploFlyweight {
    public static void main(String[] args) {
        NotaMusical notaDo = NotaMusicalFactory.getNota("Do");
        notaDo.tocar();

        NotaMusical notaRe = NotaMusicalFactory.getNota("Re");
        notaRe.tocar();

        NotaMusical mesmaNotaDo = NotaMusicalFactory.getNota("Do");
        mesmaNotaDo.tocar();
    }
}
```

Neste exemplo, temos a interface `NotaMusical`, que define o método `tocar()`. Em seguida, temos a implementação concreta `NotaMusicalImpl`, que representa as notas musicais individuais.

A classe `NotaMusicalFactory` é a fábrica Flyweight que gerencia os objetos `NotaMusical`. Ela mantém um cache de objetos `NotaMusical` em um mapa, onde a chave é o nome da nota musical. Quando um cliente solicita uma nota, a fábrica verifica se ela já existe no cache. Se existir, retorna a instância existente; caso contrário, cria uma nova instância e a armazena no cache.

Na classe de teste `ExemploFlyweight`, demonstramos como usar o padrão Flyweight. Chamamos a fábrica para obter diferentes notas musicais (`Do`, `Re`), e cada nota é tocada utilizando o método `tocar()`. Observe que, quando solicitamos a mesma nota novamente, ela é retornada do cache, evitando a criação desnecessária de objetos.

**Problema Resolvido pelo Flyweight**

O padrão Flyweight resolve o problema de alta utilização de memória ao compartilhar eficientemente objetos com estados intrínsecos e extrínsecos semelhantes. Ele evita a criação de múltiplas instâncias de objetos idênticos, permitindo que eles sejam compartilhados, resultando em economia de memória.

**Prós do Flyweight**
- Reduz o consumo de memória,