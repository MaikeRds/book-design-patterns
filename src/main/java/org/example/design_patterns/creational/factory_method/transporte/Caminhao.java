package org.example.design_patterns.creational.factory_method.transporte;

public class Caminhao implements Transporte  {
    @Override
    public void entregar() {
        System.out.println("Entrega feita por caminhão.");
    }
}
