package org.example.design_patterns.creational.factory_method.factory;

import org.example.design_patterns.creational.factory_method.transporte.Transporte;

// Fábrica abstrata
public abstract class TransporteFactory {
    abstract Transporte criarTransporte();

    public void realizarEntrega() {
        Transporte transporte = criarTransporte();
        transporte.entregar();
    }
}
