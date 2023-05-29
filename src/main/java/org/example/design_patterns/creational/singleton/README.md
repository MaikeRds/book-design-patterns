# Exemplo em Java do padrão Singleton.

```java
// Classe Singleton
class Singleton {
    // Instância privada única do Singleton
    private static Singleton instancia;
    
    // Construtor privado para evitar criação direta de instâncias
    private Singleton() {
        // Inicialização de recursos ou configurações
    }
    
    // Método estático para obter a instância única do Singleton
    public static Singleton getInstance() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
    
    // Métodos da instância do Singleton
    // ...
}

// Exemplo de uso do Singleton
public class ExemploSingleton {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        
        System.out.println(singleton1 == singleton2); // true (mesma instância)
    }
}
```

**Problema Resolvido pelo Singleton:**

O padrão Singleton resolve o problema de garantir que uma classe tenha apenas uma única instância e fornece um ponto de acesso global para essa instância. Ele é útil quando é necessário ter um único objeto compartilhado em todo o sistema e quando queremos controlar o acesso a essa instância.

O padrão Singleton garante que apenas uma única instância da classe seja criada e fornece um método estático para acessar essa instância em qualquer lugar do sistema. Ele é amplamente utilizado para gerenciar recursos compartilhados, como conexões de banco de dados, pools de threads ou caches.

No exemplo acima, a classe `Singleton` possui um construtor privado para evitar a criação direta de instâncias e um método estático `getInstance()` que retorna a instância única do Singleton. O método `getInstance()` verifica se a instância já foi criada e, se não, a cria. Nas chamadas subsequentes a `getInstance()`, a mesma instância é retornada.

**Prós do Singleton:**
- Garante que uma classe tenha apenas uma única instância em todo o sistema.
- Fornece um ponto de acesso global para essa instância, permitindo um acesso fácil e consistente.
- Evita a criação desnecessária de múltiplas instâncias, economizando recursos.

**Contras do Singleton:**
- Pode dificultar a realização de testes unitários, pois a classe está acoplada à sua instância única.
- Pode levar a um design menos flexível e extensível, já que a classe e sua instância estão intimamente ligadas.
- Pode ser difícil de estender para suportar múltiplas instâncias em alguns casos.

Espero que isso ajude!