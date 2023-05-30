package org.example.design_patterns.structural.bridge.exemplo1.forma;

import org.example.design_patterns.structural.bridge.exemplo1.cor.Cor;

public class Quadrado implements Forma {
    private Cor cor;

    public Quadrado(Cor cor) {
        this.cor = cor;
    }

    @Override
    public void desenhar() {
        System.out.print("Quadrado ");
        cor.preencher();
    }
}
