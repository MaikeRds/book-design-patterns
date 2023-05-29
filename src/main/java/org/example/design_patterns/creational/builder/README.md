# Padrão Builder
O exemplo a seguir é baseado na construção de um objeto `Carro` usando o padrão Builder.

```java
// Classe do objeto a ser construído
class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    
    // Construtor privado para evitar criação direta de objetos Carro
    private Carro() {}
    
    // Getters dos atributos do Carro
    
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public int getAno() {
        return ano;
    }
    
    public String getCor() {
        return cor;
    }
    
    // Classe Builder interna
    public static class Builder {
        private String marca;
        private String modelo;
        private int ano;
        private String cor;
        
        // Métodos para definir os atributos do Carro no Builder
        
        public Builder setMarca(String marca) {
            this.marca = marca;
            return this;
        }
        
        public Builder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }
        
        public Builder setAno(int ano) {
            this.ano = ano;
            return this;
        }
        
        public Builder setCor(String cor) {
            this.cor = cor;
            return this;
        }
        
        // Método para construir o objeto Carro
        public Carro build() {
            Carro carro = new Carro();
            carro.marca = this.marca;
            carro.modelo = this.modelo;
            carro.ano = this.ano;
            carro.cor = this.cor;
            return carro;
        }
    }
}

// Exemplo de uso do Builder para criar um objeto Carro
public class ExemploBuilder {
    public static void main(String[] args) {
        Carro carro = new Carro.Builder()
                            .setMarca("Toyota")
                            .setModelo("Corolla")
                            .setAno(2022)
                            .setCor("Prata")
                            .build();
        
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Cor: " + carro.getCor());
    }
}
```

**Problema Resolvido pelo Builder:**

O padrão Builder resolve o problema de construir objetos complexos passo a passo, permitindo a criação de objetos com várias configurações e parâmetros opcionais. Ele é útil quando um objeto requer muitos atributos e quando queremos evitar construtores com muitos parâmetros ou construtores com sobrecarga.

O padrão Builder permite que os clientes forneçam apenas os atributos necessários para a construção do objeto e ignorem os atributos opcionais. Além disso, ele oferece uma maneira clara e legível de criar objetos, pois os métodos do Builder têm nomes descritivos que refletem a finalidade dos atributos.

No exemplo acima, o Builder é usado para construir um objeto `Carro`, permitindo que o cliente defina a marca, o modelo, o ano e a cor de forma sequencial, sem precisar fornecer todos os atributos em um único construtor.

**Prós do Builder:**
- Permite a criação de objetos complexos passo a passo.
- Facilita a leitura e a manutenção do código, pois os métodos do Builder têm nomes descritivos e claros.
- Evita a necessidade de construtores com muitos parâmetros ou construtores com sobrecarga.
- Flexibilidade para definir quais atributos são obrigatórios e quais são opcionais.

**Contras do Builder:**
- Introduz uma complexidade adicional no código, com a necessidade de definir uma classe Builder separada para cada objeto.
- Pode exigir mais código em comparação com uma construção direta de objetos, especialmente para objetos com um número limitado de atributos.

Espero que isso ajude!