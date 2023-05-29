package org.example.design_patterns.creational.factory_method.factory;

import org.example.design_patterns.creational.factory_method.transporte.Caminhao;
import org.example.design_patterns.creational.factory_method.transporte.Transporte;

// Fábrica concreta para criar Caminhões
public class CaminhaoFactory extends TransporteFactory {
    @Override
    Transporte criarTransporte() {
        return new Caminhao();
    }
}
