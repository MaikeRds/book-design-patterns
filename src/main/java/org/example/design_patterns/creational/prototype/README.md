#Padrão Prototype

O exemplo a seguir é baseado na clonagem de objetos `Veiculo` usando o padrão Prototype.

```java
// Interface do protótipo
interface VeiculoPrototype {
    VeiculoPrototype clonar();
}

// Classe concreta representando um veículo
class Veiculo implements VeiculoPrototype {
    private String marca;
    private String modelo;
    
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    @Override
    public Veiculo clonar() {
        return new Veiculo(this.marca, this.modelo);
    }
    
    // Getters e setters
    // ...
}

// Exemplo de uso do Prototype para clonar objetos Veiculo
public class ExemploPrototype {
    public static void main(String[] args) {
        Veiculo veiculoOriginal = new Veiculo("Toyota", "Corolla");
        Veiculo veiculoClonado = veiculoOriginal.clonar();
        
        System.out.println("Veículo original: " + veiculoOriginal);
        System.out.println("Veículo clonado: " + veiculoClonado);
    }
}
```

**Problema Resolvido pelo Prototype:**

O padrão Prototype resolve o problema de criar novos objetos duplicados sem depender de suas classes concretas. Ele é útil quando a criação de um novo objeto é complexa ou requer uma grande quantidade de recursos, e quando queremos evitar a duplicação desnecessária de código para criar objetos semelhantes.

O padrão Prototype permite que os clientes criem novos objetos clonando um objeto existente (protótipo) em vez de criar um objeto do zero. Isso é especialmente útil quando o objeto em questão possui uma estrutura complexa e a criação direta de um objeto semelhante seria ineficiente.

No exemplo acima, a interface `VeiculoPrototype` define o método `clonar()`, que é implementado pela classe `Veiculo`. A classe `Veiculo` possui um construtor e um método `clonar()` que cria uma nova instância do veículo com os mesmos valores da instância original.

**Prós do Prototype:**
- Permite a criação de novos objetos duplicados sem depender de suas classes concretas.
- Evita a duplicação de código para criar objetos semelhantes.
- Reduz o acoplamento entre o código cliente e as classes concretas, pois o cliente lida apenas com a interface do protótipo.

**Contras do Prototype:**
- Requer que as classes implementem a interface `Cloneable` e forneçam a implementação correta do método `clone()`.
- Pode ser difícil implementar corretamente a clonagem profunda (cópia completa) se o objeto contiver referências a outros objetos.

Espero que isso ajude!