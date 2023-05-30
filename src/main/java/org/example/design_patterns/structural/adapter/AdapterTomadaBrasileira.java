package org.example.design_patterns.structural.adapter;

public class AdapterTomadaBrasileira implements TomadaBrasileira  {

    private TomadaAmericana tomadaAmericana;

    public AdapterTomadaBrasileira(TomadaAmericana tomadaAmericana) {
        this.tomadaAmericana = tomadaAmericana;
    }

    @Override
    public void conectarTomadaBrasileira() {
        System.out.println("Adaptando tomada americana para tomada brasileira");
        tomadaAmericana.conectarTomadaAmericana();
    }
}
