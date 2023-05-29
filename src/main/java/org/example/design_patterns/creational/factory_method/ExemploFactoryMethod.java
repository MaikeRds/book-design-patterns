package org.example.design_patterns.creational.factory_method;

import org.example.design_patterns.creational.factory_method.factory.CaminhaoFactory;
import org.example.design_patterns.creational.factory_method.factory.NavioFactory;
import org.example.design_patterns.creational.factory_method.factory.TransporteFactory;

// Classe de teste
public class ExemploFactoryMethod {
    public static void main(String[] args) {
        TransporteFactory caminhaoFactory = new CaminhaoFactory();
        caminhaoFactory.realizarEntrega();

        TransporteFactory navioFactory = new NavioFactory();
        navioFactory.realizarEntrega();
    }
}
