package org.example.design_patterns.structural.decorator;

public abstract class Adicional implements Bebida {
    protected Bebida bebida;

    public Adicional(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao();
    }

    @Override
    public double getCusto() {
        return bebida.getCusto();
    }
}
