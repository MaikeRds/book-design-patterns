package org.example.design_patterns.structural.decorator;

public class Acucar extends Adicional {
    public Acucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", Açúcar";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 0.2;
    }
}

