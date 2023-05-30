package org.example.design_patterns.structural.decorator;

public class Cafe implements Bebida {
    @Override
    public String getDescricao() {
        return "Café";
    }

    @Override
    public double getCusto() {
        return 1.0;
    }
}