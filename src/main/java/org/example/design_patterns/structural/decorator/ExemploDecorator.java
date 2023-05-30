package org.example.design_patterns.structural.decorator;

public class ExemploDecorator {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        cafe = new Creme(cafe);
        cafe = new Acucar(cafe);

        System.out.println("Descrição: " + cafe.getDescricao());
        System.out.println("Custo: $" + cafe.getCusto());
    }
}

