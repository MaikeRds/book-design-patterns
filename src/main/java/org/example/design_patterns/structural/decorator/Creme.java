package org.example.design_patterns.structural.decorator;

public class Creme extends Adicional {
    public Creme(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Creme";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 0.5;
    }
}
