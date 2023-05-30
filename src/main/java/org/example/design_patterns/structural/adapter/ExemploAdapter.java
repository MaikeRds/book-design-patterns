package org.example.design_patterns.structural.adapter;

public class ExemploAdapter {
    public static void main(String[] args) {
        TomadaAmericana tomadaAmericana = new TomadaAmericana();
        TomadaBrasileira tomadaBrasileira = new AdapterTomadaBrasileira(tomadaAmericana);

        tomadaBrasileira.conectarTomadaBrasileira();
    }
}
