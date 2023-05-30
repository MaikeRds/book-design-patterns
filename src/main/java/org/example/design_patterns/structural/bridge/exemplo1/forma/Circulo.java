package org.example.design_patterns.structural.bridge.exemplo1.forma;

import org.example.design_patterns.structural.bridge.exemplo1.cor.Cor;

public class Circulo implements Forma {
    private Cor cor;

    public Circulo(Cor cor) {
        this.cor = cor;
    }

    @Override
    public void desenhar() {
        System.out.print("Círculo ");
        cor.preencher();
    }
}
