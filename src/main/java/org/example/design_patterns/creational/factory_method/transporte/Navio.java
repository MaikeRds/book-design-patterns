package org.example.design_patterns.creational.factory_method.transporte;

// Implementação do Transporte de Navio
public class Navio implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entrega feita por navio.");
    }
}
