package org.example.design_patterns.creational.factory_method.factory;

import org.example.design_patterns.creational.factory_method.transporte.Navio;
import org.example.design_patterns.creational.factory_method.transporte.Transporte;

// Fábrica concreta para criar Navios
public class NavioFactory extends TransporteFactory {
    @Override
    Transporte criarTransporte() {
        return new Navio();
    }
}
