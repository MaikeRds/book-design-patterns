package org.example.design_patterns.structural.bridge.exemplo1;

import org.example.design_patterns.structural.bridge.exemplo1.cor.Azul;
import org.example.design_patterns.structural.bridge.exemplo1.cor.Vermelho;
import org.example.design_patterns.structural.bridge.exemplo1.forma.Circulo;
import org.example.design_patterns.structural.bridge.exemplo1.forma.Forma;
import org.example.design_patterns.structural.bridge.exemplo1.forma.Quadrado;

public class ExemploBridge {
    public static void main(String[] args) {
        Forma circuloVermelho = new Circulo(new Vermelho());
        Forma quadradoAzul = new Quadrado(new Azul());

        circuloVermelho.desenhar(); // Círculo preenchido com vermelho
        quadradoAzul.desenhar(); // Quadrado preenchido com azul
    }
}
