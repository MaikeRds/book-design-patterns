# Abstract Factory

**Arquivo `Button.java`:**

```java
// Interface do Button
interface Button {
    void render();
}
```

**Arquivo `WindowsButton.java`:**

```java
// Implementação do Button para Windows
class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Renderizando um botão no estilo Windows.");
    }
}
```

**Arquivo `MacOSButton.java`:**

```java
// Implementação do Button para macOS
class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Renderizando um botão no estilo macOS.");
    }
}
```

**Arquivo `CheckBox.java`:**

```java
// Interface do CheckBox
interface CheckBox {
    void render();
}
```

**Arquivo `WindowsCheckBox.java`:**

```java
// Implementação do CheckBox para Windows
class WindowsCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Renderizando uma caixa de seleção no estilo Windows.");
    }
}
```

**Arquivo `MacOSCheckBox.java`:**

```java
// Implementação do CheckBox para macOS
class MacOSCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("Renderizando uma caixa de seleção no estilo macOS.");
    }
}
```

**Arquivo `GUIFactory.java`:**

```java
// Interface da Abstract Factory
interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
```

**Arquivo `WindowsFactory.java`:**

```java
// Implementação da Concrete Factory para Windows
class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
```

**Arquivo `MacOSFactory.java`:**

```java
// Implementação da Concrete Factory para macOS
class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
```

**Arquivo `ExemploAbstractFactory.java`:**

```java
// Classe de teste
public class ExemploAbstractFactory {
    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.createButton();
        CheckBox windowsCheckBox = windowsFactory.createCheckBox();
        windowsButton.render();
        windowsCheckBox.render();
        
        GUIFactory macOSFactory = new MacOSFactory();
        Button macOSButton = macOSFactory.createButton();
        CheckBox macOSCheckBox = macOSFactory.createCheckBox();
        macOSButton.render();
        macOSCheckBox.render();
    }
}
```

**Problema Resolvido pelo Abstract Factory:**

O padrão Factory Method resolve o problema de criar objetos sem especificar explicitamente suas classes concretas. Ele permite a criação de objetos por meio de uma classe abstrata ou interface, deixando a decisão de qual classe concreta instanciar para as subclasses ou implementações concretas.

Aqui estão alguns problemas comuns que o Factory Method ajuda a resolver:

1. **Desacoplamento**: O Factory Method promove o desacoplamento entre o código cliente e as classes concretas. O cliente não precisa conhecer as classes concretas, apenas a interface ou classe abstrata fornecida pelo Factory Method. Isso facilita a manutenção e a extensibilidade do código, pois as mudanças nas classes concretas não afetam diretamente o código cliente.

2. **Abstração da criação de objetos**: O Factory Method encapsula a lógica de criação de objetos em um método ou classe abstrata. Isso permite que as subclasses ou implementações concretas decidam qual objeto criar com base em determinadas condições ou requisitos específicos. Dessa forma, é possível criar objetos com comportamentos diferentes sem que o cliente precise se preocupar com a lógica de criação.

3. **Centralização da criação de objetos**: O Factory Method centraliza a responsabilidade pela criação de objetos em uma única classe ou método. Isso evita a duplicação de código em vários pontos do sistema que precisam criar objetos semelhantes. Ao centralizar a lógica de criação, é mais fácil manter e atualizar o código.

4. **Flexibilidade na criação de objetos**: O Factory Method permite estender ou substituir facilmente as classes concretas que estão sendo instanciadas. Ao adicionar novas subclasses ou implementações concretas, é possível introduzir novos comportamentos e variações sem alterar o código existente. Isso é especialmente útil em situações onde é necessário adicionar novos tipos de objetos no futuro.

Em resumo, o Factory Method fornece uma abordagem flexível para a criação de objetos, ajudando a promover o desacoplamento, a abstração e a centralização da lógica de criação. Ele permite que o cliente trabalhe com uma interface genérica, enquanto a decisão de qual objeto concreto criar é delegada às subclasses ou implementações específicas.

Nesse caso, o Abstract Factory oferece uma solução para criar famílias de objetos relacionados (botões e caixas de seleção) que são compatíveis entre si. Ele abstrai a criação dos objetos de interface do usuário em fábricas concretas, como `WindowsFactory` e `MacOSFactory`, que são responsáveis por criar botões e caixas de seleção específicos para cada plataforma.

Dessa forma, o código cliente não precisa conhecer as classes concretas `WindowsButton`, `MacOSButton`, `WindowsCheckBox` e `MacOSCheckBox`. Ele trabalha com as interfaces `Button` e `CheckBox` e delega a criação dos objetos para as fábricas concretas, garantindo que os objetos criados sejam compatíveis com a plataforma em uso.

O Abstract Factory permite que o sistema de GUI seja facilmente estendido para suportar novas plataformas.