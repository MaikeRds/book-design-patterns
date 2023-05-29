# Exemplo de Factory Method em Java

Neste exemplo, vamos demonstrar o uso do padrão Factory Method em Java para criar diferentes tipos de transportes.

## Interface do Transporte

```java
interface Transporte {
    void entregar();
}
```

## Implementação do Transporte de Caminhão

```java
class Caminhao implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega feita por caminhão.");
    }
}
```

## Implementação do Transporte de Navio

```java
class Navio implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega feita por navio.");
    }
}
```

## Fábrica abstrata

```java
abstract class TransporteFactory {
    abstract Transporte criarTransporte();
    
    public void realizarEntrega() {
        Transporte transporte = criarTransporte();
        transporte.entregar();
    }
}
```

## Fábrica concreta para criar Caminhões

```java
class CaminhaoFactory extends TransporteFactory {
    @Override
    Transporte criarTransporte() {
        return new Caminhao();
    }
}
```

## Fábrica concreta para criar Navios

```java
class NavioFactory extends TransporteFactory {
    @Override
    Transporte criarTransporte() {
        return new Navio();
    }
}
```

## Classe de teste

```java
public class ExemploFactoryMethod {
    public static void main(String[] args) {
        TransporteFactory caminhaoFactory = new CaminhaoFactory();
        caminhaoFactory.realizarEntrega();
        
        TransporteFactory navioFactory = new NavioFactory();
        navioFactory.realizarEntrega();
    }
}
```

Neste exemplo, temos a definição da interface `Transporte`, que possui um método `entregar()`. As classes `Caminhao` e `Navio` implementam essa interface e fornecem suas próprias implementações para o método `entregar()`.

A classe abstrata `TransporteFactory` define um método abstrato `criarTransporte()` e um método `realizarEntrega()` que utiliza o método `criarTransporte()` para criar um objeto de transporte e chamar o método `entregar()`.

As classes `CaminhaoFactory` e `NavioFactory` são as fábricas concretas que herdam de `TransporteFactory` e implementam o método `criarTransporte()` para criar instâncias específicas de `Caminhao` e `Navio`, respectivamente.

Na classe `ExemploFactoryMethod`, criamos instâncias das fábricas concretas (`CaminhaoFactory` e `NavioFactory`) e chamamos o método `realizarEntrega()` para criar e entregar os diferentes tipos de transportes.

Dessa forma, o padrão Factory Method é utilizado para criar diferentes tipos de transportes usando fábricas concretas, isolando a criação de objetos específicos do restante do código.

## Prós e contras
Você evita acoplamentos firmes entre o criador e os produtos concretos.

Princípio de responsabilidade única. Você pode mover o código de criação do produto para um único local do programa, 
facilitando a manutenção do código.

Princípio aberto/fechado. Você pode introduzir novos tipos de
produtos no programa sem quebrar o código cliente existente.

O código pode se tornar mais complicado, pois você precisa in-
troduzir muitas subclasses novas para implementar o padrão.

O melhor cenário é quando você está introduzindo o padrão
em uma hierarquia existente de classes criadoras.

Espero que isso ajude!