# Padrão Composite
O exemplo a seguir mostra uma estrutura hierárquica de componentes de uma árvore, onde cada componente pode ser tanto um nó (composto) quanto uma folha (simples).

Componente.java:
```java
// Interface que define o comportamento comum a todos os componentes
public interface Componente {
    void operacao();
}

```

Nodo.java:
```java
// Classe que representa um nó (composto) da árvore
public class Nodo implements Componente {
    private List<Componente> componentes = new ArrayList<>();
    
    public void adicionar(Componente componente) {
        componentes.add(componente);
    }
    
    public void remover(Componente componente) {
        componentes.remove(componente);
    }
    
    @Override
    public void operacao() {
        System.out.println("Operação no nó");
        
        for (Componente componente : componentes) {
            componente.operacao();
        }
    }
}

```

Folha.java:
```java
// Classe que representa uma folha (simples) da árvore
public class Folha implements Componente {
    @Override
    public void operacao() {
        System.out.println("Operação na folha");
    }
}

```

ExemploComposite.java:
```java
// Exemplo de uso do padrão Composite
public class ExemploComposite {
    public static void main(String[] args) {
        Componente raiz = new Nodo();
        
        Componente nodo1 = new Nodo();
        Componente nodo2 = new Nodo();
        
        Componente folha1 = new Folha();
        Componente folha2 = new Folha();
        
        raiz.adicionar(nodo1);
        raiz.adicionar(nodo2);
        nodo1.adicionar(folha1);
        nodo2.adicionar(folha2);
        
        raiz.operacao(); // Executa a operação em todos os componentes da árvore
    }
}

```

**Problema Resolvido pelo Composite:**

O padrão Composite resolve o problema de tratar objetos individuais e grupos de objetos de maneira uniforme, permitindo que a composição de objetos forme uma estrutura hierárquica em formato de árvore. Ele é útil quando se deseja representar uma parte-todo hierarquicamente e tratar tanto as partes individuais quanto os conjuntos de partes de maneira uniforme.

No exemplo acima, temos a interface `Componente` que define o comportamento comum a todos os componentes da árvore. A classe `Nodo` representa um nó (composto) que pode conter outros componentes (sejam nós ou folhas), enquanto a classe `Folha` representa uma folha (simples) que não pode ter outros componentes.

Ao utilizar o padrão Composite, podemos tratar um objeto individual (`Folha`) ou um grupo de objetos (`Nodo`) da mesma forma, pois ambos implementam a interface `Componente`. Isso permite que sejam executadas operações de forma recursiva em toda a estrutura da árvore, independentemente de ser um nó ou uma folha.

**Prós do Composite:**
- Permite tratar objetos individuais e grupos de objetos de maneira uniforme.
- Simplifica a adição e remoção de componentes, pois a estrutura de árvore é transparente para o cliente

.
- Facilita a criação de estruturas hierárquicas complexas.
- Suporta a recursividade, permitindo executar operações em toda a estrutura da árvore.

**Contras do Composite:**
- Pode ser difícil restringir a adição de tipos de componentes específicos na estrutura hierárquica.
- Aumenta a complexidade do código, especialmente quando a estrutura da árvore é dinamicamente modificada.

Espero que este exemplo e a explicação tenham ajudado a compreender o padrão Composite em Java!