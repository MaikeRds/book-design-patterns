package org.example.design_patterns.creational.builder;

public class Carro {
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
