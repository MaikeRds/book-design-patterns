package org.example.design_patterns.creational.prototype;

import java.util.List;

public class ExemploPrototype {
    public static void main(String[] args) {
        Veiculo veiculoOriginal = new Veiculo("Toyota", "Corolla");
        Veiculo veiculoClonado = veiculoOriginal.clonar();

        System.out.println("Veículo original: " + veiculoOriginal);
        System.out.println("Veículo clonado: " + veiculoClonado);
    }
}
