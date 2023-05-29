package org.example.design_patterns.creational.builder;

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
